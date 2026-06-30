package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80;

/* renamed from: com.tencent.mm.ui.widget.imageview.WeImageView */
/* loaded from: classes5.dex */
public class C22699x3dcdb352 extends com.p314xaae8f345.mm.p2776x373aa5.x2c.C22867xec0faff7 {

    /* renamed from: f, reason: collision with root package name */
    public int f293667f;

    /* renamed from: g, reason: collision with root package name */
    public float f293668g;

    /* renamed from: h, reason: collision with root package name */
    public int f293669h;

    /* renamed from: i, reason: collision with root package name */
    public int f293670i;

    /* renamed from: m, reason: collision with root package name */
    public int f293671m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f293672n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f293673o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f293674p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f293675q;

    public C22699x3dcdb352(android.content.Context context) {
        super(context);
        this.f293668g = 1.0f;
        this.f293670i = 255;
        this.f293671m = 255;
        this.f293672n = true;
        this.f293673o = false;
        this.f293674p = true;
        this.f293675q = false;
        n(context, null);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0085xa15044fd, android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int i17 = this.f293670i;
        if (isPressed()) {
            i17 = 127;
        } else if (isEnabled()) {
            i17 = this.f293670i;
        }
        if (!isEnabled() || !isFocusable()) {
            i17 = 255;
        }
        if (isPressed() && this.f293675q) {
            i17 = (int) (this.f293670i * 0.5d);
        }
        if (i17 != this.f293671m) {
            this.f293671m = i17;
            if (getDrawable() != null) {
                getDrawable().setAlpha(i17);
            }
        }
    }

    /* renamed from: getIconColor */
    public int m82035xab0057b4() {
        return this.f293667f;
    }

    public final void n(android.content.Context context, android.util.AttributeSet attributeSet) {
        int color = context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832);
        this.f293669h = color;
        if (attributeSet == null) {
            this.f293667f = color;
            return;
        }
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, yl5.a.f544649w);
        this.f293667f = obtainStyledAttributes.getColor(1, this.f293669h);
        this.f293668g = obtainStyledAttributes.getFloat(0, 1.0f);
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        if (this.f293673o && this.f293672n && getDrawable() != null) {
            getDrawable().mutate().clearColorFilter();
            this.f293673o = false;
            this.f293672n = false;
            return;
        }
        if (!this.f293674p && getDrawable() != null && this.f293672n) {
            getDrawable().mutate().clearColorFilter();
            this.f293670i = 255;
            getDrawable().setAlpha(255);
            this.f293672n = false;
            return;
        }
        if (this.f293674p && getDrawable() != null && this.f293672n) {
            int i17 = this.f293667f;
            int i18 = i17 != 0 ? (16777215 & i17) | (-16777216) : i17;
            int alpha = android.graphics.Color.alpha(i17);
            float f17 = this.f293668g;
            if (f17 != 1.0f) {
                alpha = (int) (f17 * 255.0f);
            }
            getDrawable().mutate().setColorFilter(new android.graphics.PorterDuffColorFilter(i18, android.graphics.PorterDuff.Mode.SRC_ATOP));
            if (this.f293667f != 0) {
                this.f293670i = alpha;
                getDrawable().setAlpha(alpha);
            }
            this.f293672n = false;
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (getContentDescription() != null || isClickable()) {
            return;
        }
        setImportantForAccessibility(2);
    }

    public void r(int i17, float f17) {
        this.f293667f = i17;
        this.f293668g = f17;
        this.f293672n = true;
        invalidate();
    }

    public void s(int i17, int i18) {
        setImageResource(i17);
        m82040x7541828(getContext().getResources().getColor(i18));
    }

    /* renamed from: setClearColorFilter */
    public void m82036xe0387cb0(boolean z17) {
        this.f293673o = z17;
        this.f293672n = true;
        invalidate();
    }

    /* renamed from: setEnableColorFilter */
    public void m82037xa10c26f6(boolean z17) {
        if (this.f293674p != z17) {
            this.f293674p = z17;
            this.f293672n = true;
            invalidate();
        }
        if (z17) {
            return;
        }
        this.f293670i = 255;
        if (this.f293672n) {
            return;
        }
        this.f293672n = true;
        invalidate();
    }

    /* renamed from: setEnableHighlight */
    public void m82038x6e0975af(boolean z17) {
        this.f293675q = z17;
    }

    /* renamed from: setIconAlpha */
    public void m82039x7369a23(float f17) {
        this.f293668g = f17;
        this.f293672n = true;
        invalidate();
    }

    /* renamed from: setIconColor */
    public void m82040x7541828(int i17) {
        this.f293667f = i17;
        this.f293672n = true;
        invalidate();
    }

    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0085xa15044fd, android.widget.ImageView
    public void setImageResource(int i17) {
        super.setImageResource(i17);
        m82040x7541828(this.f293667f);
    }

    public C22699x3dcdb352(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f293668g = 1.0f;
        this.f293670i = 255;
        this.f293671m = 255;
        this.f293672n = true;
        this.f293673o = false;
        this.f293674p = true;
        this.f293675q = false;
        n(context, attributeSet);
    }

    public C22699x3dcdb352(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f293668g = 1.0f;
        this.f293670i = 255;
        this.f293671m = 255;
        this.f293672n = true;
        this.f293673o = false;
        this.f293674p = true;
        this.f293675q = false;
        n(context, attributeSet);
    }
}
