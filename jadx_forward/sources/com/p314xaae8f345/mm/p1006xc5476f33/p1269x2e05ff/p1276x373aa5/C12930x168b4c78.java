package com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5;

/* renamed from: com.tencent.mm.plugin.ball.view.FloatIndicatorView */
/* loaded from: classes14.dex */
public class C12930x168b4c78 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f175102d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f175103e;

    /* renamed from: f, reason: collision with root package name */
    public android.os.Vibrator f175104f;

    /* renamed from: g, reason: collision with root package name */
    public android.animation.Animator f175105g;

    /* renamed from: h, reason: collision with root package name */
    public android.animation.Animator f175106h;

    /* renamed from: i, reason: collision with root package name */
    public rp1.n1 f175107i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f175108m;

    public C12930x168b4c78(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void a(int i17, boolean z17) {
        if (z17 || i17 < 5) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatIndicatorView", "onFloatBallInfoCountChanged, float ball not full, count:%s", java.lang.Integer.valueOf(i17));
            this.f175108m = false;
            this.f175103e.setText(com.p314xaae8f345.mm.R.C30867xcad56011.c0v);
            this.f175103e.setTextColor(b3.l.m9702x7444d5ad(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560661qr));
            this.f175102d.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562417en);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatIndicatorView", "onFloatBallInfoCountChanged, float ball full, count:%s", java.lang.Integer.valueOf(i17));
        this.f175108m = true;
        this.f175103e.setText(com.p314xaae8f345.mm.R.C30867xcad56011.fap);
        this.f175103e.setTextColor(b3.l.m9702x7444d5ad(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560660qq));
        this.f175102d.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562416em);
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        rp1.n1 n1Var = this.f175107i;
        if (n1Var == null || configuration == null) {
            return;
        }
        boolean z17 = configuration.orientation == 2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatIndicatorController", "onOrientationChanged, isLandscape:%s", java.lang.Boolean.valueOf(z17));
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.u0 u0Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.r0) n1Var).f174885a;
        u0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatIndicatorController", "updateOrientation, isLandscape:%b", java.lang.Boolean.valueOf(z17));
        u0Var.f174897g = z17;
        u0Var.d();
        android.widget.FrameLayout.LayoutParams layoutParams = u0Var.f174896f;
        layoutParams.bottomMargin = u0Var.f174895e;
        layoutParams.rightMargin = u0Var.f174894d;
        u0Var.f174893c.setLayoutParams(layoutParams);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatIndicatorController", "onOrientationChanged layoutParams, right:%s, bottom:%s", java.lang.Integer.valueOf(u0Var.f174896f.rightMargin), java.lang.Integer.valueOf(u0Var.f174896f.bottomMargin));
    }

    /* renamed from: setOnOrientationChangedListener */
    public void m54203xdecb4a59(rp1.n1 n1Var) {
        this.f175107i = n1Var;
    }

    public C12930x168b4c78(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.bo8, this);
        this.f175102d = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.aaj);
        this.f175103e = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.hc9);
        this.f175104f = (android.os.Vibrator) context.getSystemService("vibrator");
        float f17 = qp1.c0.f447243s;
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this.f175102d, "scaleX", f17, 1.0f);
        ofFloat.setDuration(200L);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(this.f175102d, "scaleY", f17, 1.0f);
        ofFloat2.setDuration(200L);
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.f175105g = animatorSet;
        android.animation.AnimatorSet animatorSet2 = new android.animation.AnimatorSet();
        android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(this.f175102d, "scaleX", 1.0f, f17);
        ofFloat3.setDuration(200L);
        android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(this.f175102d, "scaleY", 1.0f, f17);
        ofFloat4.setDuration(200L);
        animatorSet2.playTogether(ofFloat3, ofFloat4);
        this.f175106h = animatorSet2;
    }
}
