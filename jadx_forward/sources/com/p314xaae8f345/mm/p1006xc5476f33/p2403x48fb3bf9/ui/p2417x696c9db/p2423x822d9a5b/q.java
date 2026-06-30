package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b;

/* loaded from: classes7.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b.v f265750d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f265751e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f265752f;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b.v vVar, android.app.Activity activity, yz5.a aVar) {
        this.f265750d = vVar;
        this.f265751e = activity;
        this.f265752f = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator alpha;
        android.view.ViewPropertyAnimator duration;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b.v vVar = this.f265750d;
        if (vVar.f265760c) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewFloatBallEduHelper", "addFloatBallEduViewInner disableEduView");
            return;
        }
        android.app.Activity activity = this.f265751e;
        if (((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) activity).isFinishing()) {
            return;
        }
        vVar.b((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) activity, true, this.f265752f);
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12915xed9c02f9 c12915xed9c02f9 = vVar.f265759b;
        if (c12915xed9c02f9 != null) {
            c12915xed9c02f9.setVisibility(0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12915xed9c02f9 c12915xed9c02f92 = vVar.f265759b;
        if (c12915xed9c02f92 != null) {
            c12915xed9c02f92.setAlpha(0.0f);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12915xed9c02f9 c12915xed9c02f93 = vVar.f265759b;
        if (c12915xed9c02f93 != null && (animate = c12915xed9c02f93.animate()) != null && (alpha = animate.alpha(1.0f)) != null && (duration = alpha.setDuration(100L)) != null) {
            duration.start();
        }
        pv.a0 a0Var = vVar.f265761d;
        if (a0Var != null) {
            ((ov.f0) ((pv.c0) i95.n0.c(pv.c0.class))).Ri(a0Var, true);
        }
    }
}
