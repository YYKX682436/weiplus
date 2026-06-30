package com.p314xaae8f345.mm.p1006xc5476f33.p1345x66a6330e.p1346x6582048.p1348xa7b7dce5;

/* renamed from: com.tencent.mm.plugin.crashfix.patch.phonestateoverflow.PhoneStateOverflow$1 */
/* loaded from: classes13.dex */
class C13169xe05e0452 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6158xab01373> {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1345x66a6330e.p1346x6582048.p1348xa7b7dce5.e f178205d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13169xe05e0452(com.p314xaae8f345.mm.p1006xc5476f33.p1345x66a6330e.p1346x6582048.p1348xa7b7dce5.e eVar, p012xc85e97e9.p093xedfae76a.y yVar) {
        super(yVar);
        this.f178205d = eVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
    /* renamed from: callback */
    public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6158xab01373 c6158xab01373) {
        am.sy syVar = c6158xab01373.f136420g;
        if (syVar.f89480c == 0) {
            android.telephony.PhoneStateListener phoneStateListener = syVar.f89478a;
            int i17 = syVar.f89479b;
            if (phoneStateListener instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1345x66a6330e.p1346x6582048.p1348xa7b7dce5.c) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PhoneStateOverflow", "InnerPhoneStateListener come");
            } else if (phoneStateListener != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PhoneStateOverflow", "event id = %d, listener %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(phoneStateListener.hashCode()));
                if (i17 == 0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1345x66a6330e.p1346x6582048.p1348xa7b7dce5.e eVar = this.f178205d;
                    synchronized (eVar) {
                        java.util.Iterator it = ((java.util.ArrayList) eVar.f178216a).iterator();
                        while (it.hasNext()) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1345x66a6330e.p1346x6582048.p1348xa7b7dce5.d dVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1345x66a6330e.p1346x6582048.p1348xa7b7dce5.d) it.next();
                            android.telephony.PhoneStateListener phoneStateListener2 = (android.telephony.PhoneStateListener) dVar.f178215b.get();
                            if (phoneStateListener2 == null) {
                                it.remove();
                            } else if (phoneStateListener2 == phoneStateListener) {
                                it.remove();
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PhoneStateOverflow", "remove outter %d", java.lang.Integer.valueOf(dVar.f178214a));
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
                    this.f178205d.f178218c.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1345x66a6330e.p1346x6582048.p1348xa7b7dce5.a(this, i17, phoneStateListener, str));
                }
            }
        }
        return false;
    }
}
