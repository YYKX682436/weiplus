package com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1;

/* renamed from: com.tencent.kinda.framework.widget.base.KindaButtonImpl */
/* loaded from: classes9.dex */
public class C3296x6bc4e37f extends android.widget.FrameLayout {
    private static final java.lang.String TAG = "KindaButtonImpl";

    /* renamed from: mIsPressed */
    private boolean f12749x45303dab;

    /* renamed from: mKButtonImageView */
    private android.widget.ImageView f12750x2caf6230;

    /* renamed from: mKButtonTextView */
    private com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3322x9e38a27f f12751xf8dc33e2;

    /* renamed from: noRecalcuate */
    public boolean f12752x914a89a6;

    public C3296x6bc4e37f(android.content.Context context) {
        super(context);
        this.f12752x914a89a6 = true;
        m26383x316510(context);
    }

    /* renamed from: init */
    private void m26383x316510(android.content.Context context) {
        this.f12750x2caf6230 = new android.widget.ImageView(context);
        this.f12750x2caf6230.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        this.f12750x2caf6230.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        this.f12750x2caf6230.setFocusable(false);
        this.f12750x2caf6230.setImportantForAccessibility(2);
        addView(this.f12750x2caf6230);
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3322x9e38a27f c3322x9e38a27f = new com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3322x9e38a27f(context);
        this.f12751xf8dc33e2 = c3322x9e38a27f;
        c3322x9e38a27f.m26735xa9d2971d(this);
        this.f12751xf8dc33e2.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        this.f12751xf8dc33e2.setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e);
        this.f12751xf8dc33e2.setGravity(17);
        this.f12751xf8dc33e2.setFocusable(false);
        this.f12751xf8dc33e2.setImportantForAccessibility(2);
        com.p314xaae8f345.mm.p2802xd031a825.e eVar = new com.p314xaae8f345.mm.p2802xd031a825.e();
        eVar.m82972xbdda0201(com.p314xaae8f345.p347x615374d.gen.EnumC3611x9c1951f.BUTTON);
        setAccessibilityDelegate(eVar);
        addView(this.f12751xf8dc33e2);
        super.setId(com.p314xaae8f345.p347x615374d.p349x208df1fe.R.id.f11560x86508d6f);
    }

    /* renamed from: getKButtonTextView */
    public com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3322x9e38a27f m26384xd8fd5d9() {
        return this.f12751xf8dc33e2;
    }

    /* renamed from: getText */
    public java.lang.CharSequence m26385xfb85ada3() {
        return this.f12751xf8dc33e2.getText();
    }

    /* renamed from: getTextColor */
    public int m26386xc0089f80() {
        return this.f12751xf8dc33e2.getCurrentTextColor();
    }

    /* renamed from: getTextSize */
    public float m26387x40077844() {
        return this.f12751xf8dc33e2.getTextSize();
    }

    /* renamed from: isKindaPressed */
    public boolean m26388xaa889e5f() {
        return this.f12749x45303dab;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        int mode = android.view.View.MeasureSpec.getMode(i17);
        int mode2 = android.view.View.MeasureSpec.getMode(i18);
        android.view.View.MeasureSpec.getSize(i17);
        android.view.View.MeasureSpec.getSize(i18);
        if (!this.f12752x914a89a6) {
            this.f12752x914a89a6 = true;
        } else if (getHeight() > 0 && getWidth() > 0) {
            if (mode == Integer.MIN_VALUE) {
                i17 = getWidth() + 1073741824;
            }
            if (mode2 == Integer.MIN_VALUE) {
                i18 = getHeight() + 1073741824;
            }
        }
        super.onMeasure(i17, i18);
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (!isEnabled()) {
            return onTouchEvent;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f12749x45303dab = true;
        } else if (action == 1) {
            this.f12749x45303dab = false;
        }
        return onTouchEvent;
    }

    @Override // android.view.View
    public void setContentDescription(java.lang.CharSequence charSequence) {
        super.setContentDescription(charSequence);
    }

    @Override // android.view.View
    public void setId(int i17) {
        this.f12751xf8dc33e2.setId(i17);
    }

    /* renamed from: setImageDrawable */
    public void m26389x706225d7(android.graphics.drawable.Drawable drawable) {
        android.widget.ImageView imageView = this.f12750x2caf6230;
        if (imageView == null) {
            return;
        }
        imageView.setImageDrawable(drawable);
    }

    /* renamed from: setNestEnabled */
    public void m26390x7b888007(boolean z17) {
        this.f12751xf8dc33e2.setEnabled(z17);
    }

    /* renamed from: setText */
    public void m26391x765074af(java.lang.String str) {
        this.f12751xf8dc33e2.setText(str);
        setContentDescription(str);
    }

    /* renamed from: setTextColor */
    public void m26392x1c5c5ff4(android.content.res.ColorStateList colorStateList) {
        this.f12751xf8dc33e2.setTextColor(colorStateList);
    }

    /* renamed from: setTextFont */
    public void m26393x3aba059e(android.graphics.Typeface typeface) {
        if (typeface != null) {
            this.f12751xf8dc33e2.setTypeface(typeface);
            this.f12751xf8dc33e2.requestLayout();
        }
    }

    /* renamed from: setTextSize */
    public void m26394x3abfd950(int i17, float f17) {
        this.f12751xf8dc33e2.setTextSize(i17, f17);
    }

    public C3296x6bc4e37f(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12752x914a89a6 = true;
        m26383x316510(context);
    }

    public C3296x6bc4e37f(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f12752x914a89a6 = true;
        m26383x316510(context);
    }
}
