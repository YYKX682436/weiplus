package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e;

/* loaded from: classes8.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.o f222818d;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.o oVar) {
        this.f222818d = oVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.o oVar = this.f222818d;
        if (oVar.f222828a.isDestroyed() || oVar.f222828a.isFinishing()) {
            return;
        }
        java.lang.String str = oVar.f222830c;
        oVar.getClass();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatTabPresenter", "preload url: %s", str);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5756xf590b991 c5756xf590b991 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5756xf590b991();
        am.nl nlVar = c5756xf590b991.f136075g;
        nlVar.f88966a = 3;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        nlVar.f88968c = intent;
        c5756xf590b991.e();
    }
}
