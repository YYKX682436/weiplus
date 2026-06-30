package com.tencent.mm.plugin.crashfix.patch.phonestateoverflow;

/* loaded from: classes13.dex */
class PhoneStateOverflow$1 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.TelePmEvent> {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.crashfix.patch.phonestateoverflow.e f96672d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhoneStateOverflow$1(com.tencent.mm.plugin.crashfix.patch.phonestateoverflow.e eVar, androidx.lifecycle.y yVar) {
        super(yVar);
        this.f96672d = eVar;
    }

    @Override // com.tencent.mm.sdk.event.IListener
    public boolean callback(com.tencent.mm.autogen.events.TelePmEvent telePmEvent) {
        am.sy syVar = telePmEvent.f54887g;
        if (syVar.f7947c == 0) {
            android.telephony.PhoneStateListener phoneStateListener = syVar.f7945a;
            int i17 = syVar.f7946b;
            if (phoneStateListener instanceof com.tencent.mm.plugin.crashfix.patch.phonestateoverflow.c) {
                com.tencent.mars.xlog.Log.i("MicroMsg.PhoneStateOverflow", "InnerPhoneStateListener come");
            } else if (phoneStateListener != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.PhoneStateOverflow", "event id = %d, listener %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(phoneStateListener.hashCode()));
                if (i17 == 0) {
                    com.tencent.mm.plugin.crashfix.patch.phonestateoverflow.e eVar = this.f96672d;
                    synchronized (eVar) {
                        java.util.Iterator it = ((java.util.ArrayList) eVar.f96683a).iterator();
                        while (it.hasNext()) {
                            com.tencent.mm.plugin.crashfix.patch.phonestateoverflow.d dVar = (com.tencent.mm.plugin.crashfix.patch.phonestateoverflow.d) it.next();
                            android.telephony.PhoneStateListener phoneStateListener2 = (android.telephony.PhoneStateListener) dVar.f96682b.get();
                            if (phoneStateListener2 == null) {
                                it.remove();
                            } else if (phoneStateListener2 == phoneStateListener) {
                                it.remove();
                                com.tencent.mars.xlog.Log.i("MicroMsg.PhoneStateOverflow", "remove outter %d", java.lang.Integer.valueOf(dVar.f96681a));
                            }
                        }
                    }
                } else {
                    new java.lang.ref.WeakReference(phoneStateListener);
                    java.lang.StackTraceElement[] stackTrace = java.lang.Thread.currentThread().getStackTrace();
                    java.lang.String str = "";
                    if (stackTrace != null) {
                        for (int i18 = 0; i18 < stackTrace.length; i18++) {
                            str = str + stackTrace[i18].getClassName() + " " + stackTrace[i18].getMethodName() + ":" + stackTrace[i18].getLineNumber() + "\n";
                        }
                    }
                    this.f96672d.f96685c.post(new com.tencent.mm.plugin.crashfix.patch.phonestateoverflow.a(this, i17, phoneStateListener, str));
                }
            }
        }
        return false;
    }
}
