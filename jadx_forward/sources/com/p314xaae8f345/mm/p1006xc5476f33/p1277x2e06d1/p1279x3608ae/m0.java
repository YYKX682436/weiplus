package com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae;

/* loaded from: classes12.dex */
public class m0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v25.b f175306d;

    public m0(com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.C12937x3f78629e c12937x3f78629e, v25.b bVar) {
        this.f175306d = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (gm0.j1.a()) {
                c01.d9.e().g(new c01.ra(new com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.l0(this), null));
            }
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WXCommProvider", "exception in NetSceneLocalProxy");
            this.f175306d.a();
        }
    }
}
