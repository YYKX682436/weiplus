package com.tencent.mm.plugin.appbrand.widget.actionbar;

/* loaded from: classes7.dex */
public class AppBrandOptionButton extends android.widget.FrameLayout {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f91032i = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageButton f91033d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f91034e;

    /* renamed from: f, reason: collision with root package name */
    public int f91035f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f91036g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f91037h;

    public AppBrandOptionButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f91035f = 0;
        this.f91036g = false;
        this.f91037h = false;
        a(context);
    }

    private int getActionBarHeight() {
        return getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479621aw);
    }

    public final void a(android.content.Context context) {
        android.widget.ImageButton imageButton = new android.widget.ImageButton(context);
        this.f91033d = imageButton;
        imageButton.setClickable(false);
        this.f91033d.setBackground(null);
        this.f91033d.setImportantForAccessibility(2);
        addView(this.f91033d, new android.widget.FrameLayout.LayoutParams(getActionBarHeight(), -1, 17));
        setAccessibilityLabel(getDefaultAccessibilityLabel());
    }

    public void b() {
        android.view.View view = this.f91034e;
        if (view == null || !(view instanceof al1.q)) {
            this.f91033d.setVisibility(0);
            if (!this.f91037h) {
                this.f91033d.setAlpha(1.0f);
            }
            this.f91033d.setImageDrawable(getDefaultImageDrawable());
            return;
        }
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.setDuration(250L);
        ofFloat.addUpdateListener(new al1.o((al1.q) view));
        ofFloat.addListener(new al1.v(this));
        ofFloat.start();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public java.lang.CharSequence getAccessibilityClassName() {
        return android.widget.ImageButton.class.getName();
    }

    public android.widget.ImageView getButtonImage() {
        return this.f91033d;
    }

    public android.view.View getCustomOptionView() {
        return this.f91034e;
    }

    public java.lang.String getDefaultAccessibilityLabel() {
        return getContext().getString(com.tencent.mm.R.string.f490022iq);
    }

    public android.graphics.drawable.Drawable getDefaultImageDrawable() {
        return b3.l.getDrawable(getContext(), com.tencent.mm.R.drawable.bv9);
    }

    public int getStyleColor() {
        return this.f91035f;
    }

    @Override // android.view.View
    public void onCancelPendingInputEvents() {
        super.onCancelPendingInputEvents();
        setPressed(false);
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (this.f91034e != null) {
            this.f91036g = true;
            b();
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setAccessibilityLabel(java.lang.String str) {
        android.widget.ImageButton imageButton = this.f91033d;
        if (imageButton == null || imageButton.getVisibility() != 0) {
            return;
        }
        this.f91033d.setContentDescription(str);
    }

    public void setColor(int i17) {
        this.f91033d.setImageDrawable(getDefaultImageDrawable());
        this.f91033d.setColorFilter(b3.l.getColor(getContext(), i17 == -16777216 ? com.tencent.mm.R.color.f478635ai2 : com.tencent.mm.R.color.f478636ai3), android.graphics.PorterDuff.Mode.SRC_IN);
        this.f91033d.setBackground(getBackground());
        if (this.f91033d.getBackground() != null) {
            this.f91033d.getBackground().setColorFilter(i17, android.graphics.PorterDuff.Mode.SRC_ATOP);
        }
        android.view.View view = this.f91034e;
        if (view != null && (view instanceof al1.q)) {
            ((al1.q) view).setColor(i17);
        }
        this.f91035f = i17;
    }

    public void setIcon(android.graphics.Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        this.f91033d.setImageDrawable(new android.graphics.drawable.BitmapDrawable(getResources(), bitmap));
        this.f91033d.setVisibility(0);
    }

    public AppBrandOptionButton(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f91035f = 0;
        this.f91036g = false;
        this.f91037h = false;
        a(context);
    }
}
