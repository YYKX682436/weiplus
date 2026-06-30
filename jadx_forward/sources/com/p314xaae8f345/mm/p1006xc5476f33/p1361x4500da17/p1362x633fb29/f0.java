package com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29;

/* loaded from: classes14.dex */
public class f0 extends dp1.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.l0 f178802a;

    public f0(com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.l0 l0Var) {
        this.f178802a = l0Var;
    }

    @Override // dp1.m
    public boolean a(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.l0 l0Var = this.f178802a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameDownloadFloatBallHelper", "onBallInstallImageViewSet:%b", java.lang.Boolean.valueOf(l0Var.f178824p));
        return l0Var.f178824p;
    }

    @Override // dp1.m
    public boolean b(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("game_download_float_ball").getBoolean("game_download_first_" + gm0.j1.b().j(), true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.l0 l0Var = this.f178802a;
        java.lang.String str = l0Var.f178829u.size() > 0 ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.i0) l0Var.f178829u.get(0)).f178812a : "";
        if (z17) {
            jj0.a.a().c(str, 7, 0, null, "");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("game_download_float_ball").putBoolean("game_download_first_" + gm0.j1.b().j(), false);
        }
        return false;
    }

    @Override // dp1.m
    public boolean c(android.widget.TextView textView, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        textView.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.e0(this, textView, c12886x91aa2b6d));
        return false;
    }
}
