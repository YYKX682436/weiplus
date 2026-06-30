package com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1358x5c6729a;

/* loaded from: classes8.dex */
public class c implements com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1 {

    /* renamed from: d, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1358x5c6729a.c f178440d;

    /* renamed from: e, reason: collision with root package name */
    public static android.content.BroadcastReceiver f178441e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Set f178442f = new java.util.concurrent.CopyOnWriteArraySet();

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.Set f178443g = new java.util.concurrent.CopyOnWriteArraySet();

    /* renamed from: h, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f178444h;

    static {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        f178444h = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5589xbb82aa08>(a0Var) { // from class: com.tencent.mm.plugin.downloader.event.DownloadEventBus$1
            {
                this.f39173x3fe91575 = 566931480;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5589xbb82aa08 c5589xbb82aa08) {
                h02.a f17;
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5589xbb82aa08 c5589xbb82aa082 = c5589xbb82aa08;
                java.lang.String str = c5589xbb82aa082.f135912g.f88292a;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || (f17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.f(str)) == null) {
                    return false;
                }
                c5589xbb82aa082.f135913h.f88366a = f17.f68404x28d45f97;
                return false;
            }
        };
    }

    public static void a(int i17, long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DownloadEventBus", "dispatch event = %d, id = %d", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17));
        h02.a c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.c(j17);
        if (c17 == null) {
            return;
        }
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArraySet) f178442f).iterator();
        while (it.hasNext()) {
            ((vz.i1) it.next()).Z(i17, c17.f68408x32b20428);
        }
        for (fs.q qVar : ((fs.c) fs.g.f(vz.k1.class)).all()) {
            if (fs.g.d(fs.g.f347619c, qVar)) {
                ((vz.k1) ((fs.n) qVar.get())).Z(i17, c17.f68408x32b20428);
            }
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("appId", c17.f68404x28d45f97);
        bundle.putInt("state", c17.f68441x10a0fed7);
        long j18 = c17.f68443x78351860;
        if (j18 > 0) {
            bundle.putInt("progress", (int) ((c17.f68413xf432b5ad * 100) / j18));
        }
        bundle.putBoolean("downloadInWidget", c17.f68423x7e6ed12a);
        bundle.putInt("event", i17);
        com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.p800x7643c6b5.ServiceC10771x8ab5e24d.a(bundle, com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1358x5c6729a.b.class, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void b(long j17, int i17, boolean z17) {
        a(5, j17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void c(long j17, java.lang.String str, boolean z17) {
        a(3, j17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void f(long j17) {
        a(8, j17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void h(long j17, java.lang.String str, long j18, long j19) {
        a(6, j17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void i(long j17, java.lang.String str) {
        a(7, j17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void k(long j17) {
        a(2, j17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void l(long j17, java.lang.String str) {
        a(1, j17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void m(long j17) {
        a(4, j17);
    }
}
