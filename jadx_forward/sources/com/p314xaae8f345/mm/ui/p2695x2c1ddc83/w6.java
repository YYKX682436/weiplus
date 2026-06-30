package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public class w6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22376x88ed722d f289752d;

    public w6(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22376x88ed722d c22376x88ed722d) {
        this.f289752d = c22376x88ed722d;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.q qVar = this.f289752d.f288913w;
        qVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BannerHelper", "destroyBanner");
        qVar.f289522s = true;
        qVar.c();
        qVar.a(qVar.f289510d);
        qVar.a(qVar.f289511e);
        qVar.a(qVar.f289512f);
        qVar.a(qVar.f289513g);
        com.p314xaae8f345.mm.p971x6de15a2e.s0 s0Var = qVar.f289515i;
        gm0.j1.i();
        gm0.j1.n().d(s0Var);
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = qVar.f289516m;
        if (abstractC20980x9b9ad01d != null) {
            abstractC20980x9b9ad01d.mo48814x2efc64();
        }
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d2 = qVar.f289517n;
        if (abstractC20980x9b9ad01d2 != null) {
            abstractC20980x9b9ad01d2.mo48814x2efc64();
        }
        if (gm0.j1.a()) {
            c01.d9.b().G(qVar);
        }
        qVar.f289518o = null;
        s72.r0 a17 = s72.r0.a();
        synchronized (a17.f485677a) {
            ((java.util.LinkedList) a17.f485677a).remove(qVar);
        }
    }
}
