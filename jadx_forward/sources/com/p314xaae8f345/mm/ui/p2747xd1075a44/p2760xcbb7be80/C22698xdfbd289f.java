package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80;

/* renamed from: com.tencent.mm.ui.widget.imageview.WeImageButton */
/* loaded from: classes5.dex */
public class C22698xdfbd289f extends com.p314xaae8f345.mm.p2776x373aa5.x2c.C22861x80155db3 {

    /* renamed from: f, reason: collision with root package name */
    public int f293660f;

    /* renamed from: g, reason: collision with root package name */
    public int f293661g;

    /* renamed from: h, reason: collision with root package name */
    public float f293662h;

    /* renamed from: i, reason: collision with root package name */
    public int f293663i;

    /* renamed from: m, reason: collision with root package name */
    public int f293664m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f293665n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f293666o;

    public C22698xdfbd289f(android.content.Context context) {
        super(context, null);
        this.f293662h = 1.0f;
        this.f293663i = 255;
        this.f293664m = 255;
        this.f293665n = true;
        this.f293666o = true;
        c(context, null);
    }

    public final void c(android.content.Context context, android.util.AttributeSet attributeSet) {
        int color = context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832);
        this.f293661g = color;
        if (attributeSet == null) {
            this.f293660f = color;
            return;
        }
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, yl5.a.f544648v);
        this.f293660f = obtainStyledAttributes.getColor(1, this.f293661g);
        this.f293662h = obtainStyledAttributes.getFloat(0, 1.0f);
        obtainStyledAttributes.recycle();
    }

    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0084x6ce1fb8a, android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int i17 = this.f293663i;
        if (isPressed()) {
            i17 = 127;
        } else if (isEnabled()) {
            i17 = this.f293663i;
        }
        if (!isEnabled() || !isFocusable()) {
            i17 = 255;
        }
        if (i17 != this.f293664m) {
            this.f293664m = i17;
            if (getDrawable() != null) {
                getDrawable().setAlpha(i17);
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        boolean z17 = this.f293666o;
        if (!z17 && getDrawable() != null && this.f293665n) {
            getDrawable().clearColorFilter();
            this.f293665n = false;
            return;
        }
        if (z17 && getDrawable() != null && this.f293665n) {
            int i17 = this.f293660f;
            int i18 = i17 != 0 ? (16777215 & i17) | (-16777216) : i17;
            int alpha = android.graphics.Color.alpha(i17);
            float f17 = this.f293662h;
            if (f17 != 1.0f) {
                alpha = (int) (f17 * 255.0f);
            }
            getDrawable().setColorFilter(new android.graphics.PorterDuffColorFilter(i18, android.graphics.PorterDuff.Mode.SRC_ATOP));
            if (this.f293660f != 0) {
                this.f293663i = alpha;
                getDrawable().setAlpha(alpha);
            }
            this.f293665n = false;
        }
    }

    /* renamed from: setIconColor */
    public void m82034x7541828(int i17) {
        this.f293660f = i17;
        this.f293665n = true;
        invalidate();
    }

    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0084x6ce1fb8a, android.widget.ImageView
    public void setImageResource(int i17) {
        super.setImageResource(i17);
        m82034x7541828(this.f293660f);
    }

    public C22698xdfbd289f(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f293662h = 1.0f;
        this.f293663i = 255;
        this.f293664m = 255;
        this.f293665n = true;
        this.f293666o = true;
        c(context, attributeSet);
    }

    public C22698xdfbd289f(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f293662h = 1.0f;
        this.f293663i = 255;
        this.f293664m = 255;
        this.f293665n = true;
        this.f293666o = true;
        c(context, attributeSet);
    }
}
