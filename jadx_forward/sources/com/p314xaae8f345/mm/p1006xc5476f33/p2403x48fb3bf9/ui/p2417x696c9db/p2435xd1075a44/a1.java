package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44;

/* loaded from: classes8.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.o6 f268628a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f268629b;

    /* renamed from: c, reason: collision with root package name */
    public float f268630c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.m1 f268631d;

    public a1(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.m1 m1Var, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.o6 listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        this.f268631d = m1Var;
        this.f268628a = listener;
    }

    public final void a(boolean z17) {
        if (this.f268629b) {
            return;
        }
        this.f268629b = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.m1 m1Var = this.f268631d;
        android.view.animation.Animation loadAnimation = 1 == m1Var.f268930s.f268959i ? android.view.animation.AnimationUtils.loadAnimation(m1Var.getContext(), com.p314xaae8f345.mm.R.C30854x2dc211.f559345c6) : android.view.animation.AnimationUtils.loadAnimation(m1Var.getContext(), com.p314xaae8f345.mm.R.C30854x2dc211.f559344c5);
        tl2.u uVar = (tl2.u) this.f268628a;
        uVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveRestrictVideoTransition", "[onTransitionStart] isEnter=" + z17);
        uVar.g(z17);
        float f17 = this.f268630c;
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(f17, 1.0f);
        if (z17) {
            f17 = 1.0f - f17;
        }
        ofFloat.setDuration(((((float) loadAnimation.getDuration()) * 1.2f) * f17) / 1.0f);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HalfScreenWebView", "[onTransitionStart] duration=" + ofFloat.getDuration());
        ofFloat.setInterpolator(loadAnimation.getInterpolator());
        ofFloat.addUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.y0(this, z17));
        ofFloat.addListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.z0(this, z17));
        ofFloat.start();
    }

    public final void b(float f17) {
        this.f268630c = f17;
        tl2.u uVar = (tl2.u) this.f268628a;
        uVar.q(uVar.k(), uVar.f501810g, uVar.f501811h, f17);
    }
}
