package gf;

/* loaded from: classes7.dex */
public final class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gf.g0 f352618d;

    public h0(gf.g0 g0Var) {
        this.f352618d = g0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gf.l0.f352649b = true;
        gf.l0 l0Var = gf.l0.f352648a;
        gf.g0 g0Var = this.f352618d;
        if (g0Var.f352599d) {
            com.p314xaae8f345.p2936x80def495.jni.C25602x506342f0.m95933x655e6a3e();
        } else {
            com.p314xaae8f345.p2936x80def495.jni.C25602x506342f0.m95931xaf1a32a3();
        }
        if (g0Var.f352600e) {
            com.p314xaae8f345.p2936x80def495.jni.C25602x506342f0.m95934x864a4d94();
        } else {
            com.p314xaae8f345.p2936x80def495.jni.C25602x506342f0.m95932xf9c76f0f();
        }
        com.p314xaae8f345.p2936x80def495.jni.C25602x506342f0.m95942x5024fb2f(com.p314xaae8f345.mm.vfs.w6.i("wcf://WxaSkylineCache/", true));
        com.p314xaae8f345.p2936x80def495.jni.C25602x506342f0.m95941xeca7476a(new df.e());
        com.p314xaae8f345.p2936x80def495.jni.C25602x506342f0.m95945x30228619(g0Var.f352602g);
        com.p314xaae8f345.p2936x80def495.jni.C25602x506342f0.m95946x5d1e8363(new df.d1());
        com.p314xaae8f345.p2936x80def495.jni.InterfaceC25593x90f37129 interfaceC25593x90f37129 = g0Var.f352607l;
        if (interfaceC25593x90f37129 != null) {
            com.p314xaae8f345.p2936x80def495.jni.C25602x506342f0.m95947xc7604a30(interfaceC25593x90f37129);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.SkylineBoot", "notifyDone");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        synchronized (gf.l0.f352650c) {
            java.util.ArrayList arrayList2 = gf.l0.f352651d;
            arrayList.addAll(arrayList2);
            arrayList2.clear();
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.Runnable runnable = (java.lang.Runnable) it.next();
            if (runnable != null) {
                runnable.run();
            }
        }
    }
}
