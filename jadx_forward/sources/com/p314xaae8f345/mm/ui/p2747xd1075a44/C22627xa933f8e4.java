package com.p314xaae8f345.mm.ui.p2747xd1075a44;

/* renamed from: com.tencent.mm.ui.widget.MMProcessBar */
/* loaded from: classes10.dex */
public class C22627xa933f8e4 extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public float f292870d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.animation.Animation f292871e;

    public C22627xa933f8e4(android.content.Context context) {
        super(context);
        this.f292870d = 0.0f;
        this.f292871e = new android.view.animation.RotateAnimation(0.0f, 360.0f);
    }

    public void a(float f17, float f18) {
        e();
        android.view.animation.RotateAnimation rotateAnimation = new android.view.animation.RotateAnimation(0.0f, 72000.0f, f17, f18);
        this.f292871e = rotateAnimation;
        rotateAnimation.setRepeatMode(-1);
        this.f292871e.setRepeatCount(-1);
        this.f292871e.setDuration(70000L);
        this.f292871e.setInterpolator(new android.view.animation.LinearInterpolator());
        if (getVisibility() == 0) {
            d();
        }
    }

    public void b(float f17) {
        android.view.animation.Animation animation = this.f292871e;
        if (animation != null && !animation.hasEnded()) {
            this.f292871e.cancel();
        }
        float f18 = this.f292870d + f17;
        this.f292870d = f18;
        setRotation(f18 * 360.0f);
    }

    public void c(int i17, int i18) {
        try {
            android.graphics.drawable.Drawable drawable = getResources().getDrawable(i17);
            drawable.setColorFilter(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77689x3cb0703), android.graphics.PorterDuff.Mode.SRC_ATOP);
            if (i18 != 0) {
                f3.b.h(drawable, android.content.res.ColorStateList.valueOf(i18));
            }
            setBackground(drawable);
        } catch (java.lang.Exception unused) {
        }
    }

    public void d() {
        if (getVisibility() == 0) {
            startAnimation(this.f292871e);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMProcessBar", "[startRotate] startRotate fail. this view Visibility=%s", java.lang.Integer.valueOf(getVisibility()));
        }
    }

    public void e() {
        android.view.animation.Animation animation = this.f292871e;
        if (animation != null) {
            animation.cancel();
        }
        clearAnimation();
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        d();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e();
    }

    @Override // android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        if (z17) {
            a(getWidth() / 2.0f, getHeight() / 2.0f);
        }
    }

    /* renamed from: setDuration */
    public void m81385xffd6ec16(long j17) {
        this.f292871e.setDuration(j17);
    }

    /* renamed from: setInterpolator */
    public void m81386x142dd649(android.view.animation.Interpolator interpolator) {
        this.f292871e.setInterpolator(interpolator);
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        super.setVisibility(i17);
        if (i17 == 0) {
            d();
        } else {
            e();
        }
    }

    public C22627xa933f8e4(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f292870d = 0.0f;
        this.f292871e = new android.view.animation.RotateAnimation(0.0f, 360.0f);
    }

    public C22627xa933f8e4(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f292870d = 0.0f;
        this.f292871e = new android.view.animation.RotateAnimation(0.0f, 360.0f);
    }
}
