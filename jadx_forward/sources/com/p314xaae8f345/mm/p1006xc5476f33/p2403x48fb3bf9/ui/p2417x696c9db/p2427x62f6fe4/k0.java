package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4;

/* loaded from: classes8.dex */
public final class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f267325d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.n0 f267326e;

    public k0(android.app.Activity activity, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.n0 n0Var) {
        this.f267325d = activity;
        this.f267326e = n0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nw4.n nVar;
        android.app.Activity activity = this.f267325d;
        db5.e1.T(activity, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.anq));
        boolean z17 = activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.n0 n0Var = this.f267326e;
        if (z17 && (nVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) activity).f265377p0) != null) {
            ot0.m1 m1Var = n0Var.f267340a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m1Var);
            nVar.E(m1Var.f454874f, ya.b.f77504xbb80cbe3);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.x0 x0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.y0.f267367k;
        ot0.m1 m1Var2 = n0Var.f267340a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m1Var2);
        java.lang.String videoVid = m1Var2.f454874f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(videoVid, "videoVid");
        ot0.m1 m1Var3 = n0Var.f267340a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m1Var3);
        java.lang.String mpUrl = m1Var3.f454872d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mpUrl, "mpUrl");
        ot0.m1 m1Var4 = n0Var.f267340a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m1Var4);
        x0Var.d(1, 101, videoVid, mpUrl, 0, m1Var4.f430120y);
    }
}
