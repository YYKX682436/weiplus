package com.tencent.mm.plugin.ball.view;

/* loaded from: classes14.dex */
public class FloatIndicatorView extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f93569d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f93570e;

    /* renamed from: f, reason: collision with root package name */
    public android.os.Vibrator f93571f;

    /* renamed from: g, reason: collision with root package name */
    public android.animation.Animator f93572g;

    /* renamed from: h, reason: collision with root package name */
    public android.animation.Animator f93573h;

    /* renamed from: i, reason: collision with root package name */
    public rp1.n1 f93574i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f93575m;

    public FloatIndicatorView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void a(int i17, boolean z17) {
        if (z17 || i17 < 5) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatIndicatorView", "onFloatBallInfoCountChanged, float ball not full, count:%s", java.lang.Integer.valueOf(i17));
            this.f93575m = false;
            this.f93570e.setText(com.tencent.mm.R.string.c0v);
            this.f93570e.setTextColor(b3.l.getColor(getContext(), com.tencent.mm.R.color.f479128qr));
            this.f93569d.setImageResource(com.tencent.mm.R.drawable.f480884en);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatIndicatorView", "onFloatBallInfoCountChanged, float ball full, count:%s", java.lang.Integer.valueOf(i17));
        this.f93575m = true;
        this.f93570e.setText(com.tencent.mm.R.string.fap);
        this.f93570e.setTextColor(b3.l.getColor(getContext(), com.tencent.mm.R.color.f479127qq));
        this.f93569d.setImageResource(com.tencent.mm.R.drawable.f480883em);
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        rp1.n1 n1Var = this.f93574i;
        if (n1Var == null || configuration == null) {
            return;
        }
        boolean z17 = configuration.orientation == 2;
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatIndicatorController", "onOrientationChanged, isLandscape:%s", java.lang.Boolean.valueOf(z17));
        com.tencent.mm.plugin.ball.ui.u0 u0Var = ((com.tencent.mm.plugin.ball.ui.r0) n1Var).f93352a;
        u0Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatIndicatorController", "updateOrientation, isLandscape:%b", java.lang.Boolean.valueOf(z17));
        u0Var.f93364g = z17;
        u0Var.d();
        android.widget.FrameLayout.LayoutParams layoutParams = u0Var.f93363f;
        layoutParams.bottomMargin = u0Var.f93362e;
        layoutParams.rightMargin = u0Var.f93361d;
        u0Var.f93360c.setLayoutParams(layoutParams);
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatIndicatorController", "onOrientationChanged layoutParams, right:%s, bottom:%s", java.lang.Integer.valueOf(u0Var.f93363f.rightMargin), java.lang.Integer.valueOf(u0Var.f93363f.bottomMargin));
    }

    public void setOnOrientationChangedListener(rp1.n1 n1Var) {
        this.f93574i = n1Var;
    }

    public FloatIndicatorView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        android.view.View.inflate(context, com.tencent.mm.R.layout.bo8, this);
        this.f93569d = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.aaj);
        this.f93570e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.hc9);
        this.f93571f = (android.os.Vibrator) context.getSystemService("vibrator");
        float f17 = qp1.c0.f365710s;
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this.f93569d, "scaleX", f17, 1.0f);
        ofFloat.setDuration(200L);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(this.f93569d, "scaleY", f17, 1.0f);
        ofFloat2.setDuration(200L);
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.f93572g = animatorSet;
        android.animation.AnimatorSet animatorSet2 = new android.animation.AnimatorSet();
        android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(this.f93569d, "scaleX", 1.0f, f17);
        ofFloat3.setDuration(200L);
        android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(this.f93569d, "scaleY", 1.0f, f17);
        ofFloat4.setDuration(200L);
        animatorSet2.playTogether(ofFloat3, ofFloat4);
        this.f93573h = animatorSet2;
    }
}
