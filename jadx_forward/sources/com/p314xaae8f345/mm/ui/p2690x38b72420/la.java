package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes8.dex */
public class la {

    /* renamed from: a, reason: collision with root package name */
    public android.widget.TextView f288547a;

    /* renamed from: b, reason: collision with root package name */
    public android.view.animation.AlphaAnimation f288548b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.animation.AlphaAnimation f288549c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f288550d = false;

    public void a(android.app.Activity activity, int i17, int i18) {
        if (i18 <= 0 || i17 != i18 + 1 || this.f288550d) {
            if (i17 < i18) {
                b(activity);
                this.f288550d = false;
                return;
            }
            return;
        }
        if (this.f288547a == null) {
            this.f288547a = (android.widget.TextView) activity.findViewById(com.p314xaae8f345.mm.R.id.mij);
        }
        if (this.f288547a.getVisibility() == 0) {
            return;
        }
        this.f288547a.setText(com.p314xaae8f345.mm.R.C30867xcad56011.i3o);
        this.f288547a.setOnClickListener(new com.p314xaae8f345.mm.ui.p2690x38b72420.ja(this, activity));
        if (this.f288548b == null) {
            this.f288548b = new android.view.animation.AlphaAnimation(0.0f, 1.0f);
        }
        this.f288548b.setDuration(300L);
        android.view.animation.AlphaAnimation alphaAnimation = this.f288549c;
        if (alphaAnimation != null) {
            alphaAnimation.cancel();
        }
        this.f288547a.setVisibility(0);
        this.f288547a.startAnimation(this.f288548b);
    }

    public final void b(android.app.Activity activity) {
        if (this.f288547a == null) {
            this.f288547a = (android.widget.TextView) activity.findViewById(com.p314xaae8f345.mm.R.id.mij);
        }
        if (this.f288547a.getVisibility() == 8) {
            return;
        }
        if (this.f288549c == null) {
            android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(1.0f, 0.0f);
            this.f288549c = alphaAnimation;
            alphaAnimation.setAnimationListener(new com.p314xaae8f345.mm.ui.p2690x38b72420.ka(this));
        }
        this.f288549c.setDuration(300L);
        android.view.animation.AlphaAnimation alphaAnimation2 = this.f288548b;
        if (alphaAnimation2 != null) {
            alphaAnimation2.cancel();
        }
        this.f288547a.startAnimation(this.f288549c);
    }
}
