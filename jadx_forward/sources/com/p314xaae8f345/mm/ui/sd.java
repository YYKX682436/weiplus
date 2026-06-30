package com.p314xaae8f345.mm.ui;

/* loaded from: classes11.dex */
public final class sd implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.od f291342d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.LayoutInflater f291343e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f291344f;

    public sd(com.p314xaae8f345.mm.ui.od odVar, android.view.LayoutInflater layoutInflater, int i17) {
        this.f291342d = odVar;
        this.f291343e = layoutInflater;
        this.f291344f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.ui.nd status;
        com.p314xaae8f345.mm.ui.nd ndVar;
        int i17 = this.f291344f;
        com.p314xaae8f345.mm.ui.od odVar = this.f291342d;
        odVar.getClass();
        synchronized (odVar.f291002a) {
            status = odVar.f291003b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
            odVar.f291003b = status == com.p314xaae8f345.mm.ui.nd.f290945d ? com.p314xaae8f345.mm.ui.nd.f290946e : status;
            odVar.f291002a.notifyAll();
        }
        if (status == com.p314xaae8f345.mm.ui.nd.f290946e || status == (ndVar = com.p314xaae8f345.mm.ui.nd.f290947f)) {
            return;
        }
        try {
            odVar.f291004c = this.f291343e.inflate(i17, (android.view.ViewGroup) null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMLayoutPrefetcher", "[+} preload layout 0x%x, result: %s", java.lang.Integer.valueOf(i17), odVar.f291004c);
            odVar.a(ndVar);
        } catch (java.lang.Throwable th6) {
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMLayoutPrefetcher", th6, "[-] Fail to inflate resource: 0x%x", java.lang.Integer.valueOf(i17));
                odVar.f291004c = null;
            } finally {
                odVar.a(com.p314xaae8f345.mm.ui.nd.f290947f);
            }
        }
    }
}
