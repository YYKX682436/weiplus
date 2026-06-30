package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1220xbd1ca1d;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.actionbar.AppBrandOptionButton */
/* loaded from: classes7.dex */
public class C12762x8fe39d2d extends android.widget.FrameLayout {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f172565i = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageButton f172566d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f172567e;

    /* renamed from: f, reason: collision with root package name */
    public int f172568f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f172569g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f172570h;

    public C12762x8fe39d2d(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f172568f = 0;
        this.f172569g = false;
        this.f172570h = false;
        a(context);
    }

    /* renamed from: getActionBarHeight */
    private int m53335xb0586f4e() {
        return getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561154aw);
    }

    public final void a(android.content.Context context) {
        android.widget.ImageButton imageButton = new android.widget.ImageButton(context);
        this.f172566d = imageButton;
        imageButton.setClickable(false);
        this.f172566d.setBackground(null);
        this.f172566d.setImportantForAccessibility(2);
        addView(this.f172566d, new android.widget.FrameLayout.LayoutParams(m53335xb0586f4e(), -1, 17));
        m53339xeee35248(mo53333xc6f1efb1());
    }

    public void b() {
        android.view.View view = this.f172567e;
        if (view == null || !(view instanceof al1.q)) {
            this.f172566d.setVisibility(0);
            if (!this.f172570h) {
                this.f172566d.setAlpha(1.0f);
            }
            this.f172566d.setImageDrawable(mo53334xd83f0ace());
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

    /* renamed from: getButtonImage */
    public android.widget.ImageView m53336x6fbe8813() {
        return this.f172566d;
    }

    /* renamed from: getCustomOptionView */
    public android.view.View m53337x2a1ea81() {
        return this.f172567e;
    }

    /* renamed from: getDefaultAccessibilityLabel */
    public java.lang.String mo53333xc6f1efb1() {
        return getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571555iq);
    }

    /* renamed from: getDefaultImageDrawable */
    public android.graphics.drawable.Drawable mo53334xd83f0ace() {
        return b3.l.m9707x4a96be14(getContext(), com.p314xaae8f345.mm.R.C30861xcebc809e.bv9);
    }

    /* renamed from: getStyleColor */
    public int m53338xf50dc028() {
        return this.f172568f;
    }

    @Override // android.view.View
    public void onCancelPendingInputEvents() {
        super.onCancelPendingInputEvents();
        setPressed(false);
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (this.f172567e != null) {
            this.f172569g = true;
            b();
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: setAccessibilityLabel */
    public final void m53339xeee35248(java.lang.String str) {
        android.widget.ImageButton imageButton = this.f172566d;
        if (imageButton == null || imageButton.getVisibility() != 0) {
            return;
        }
        this.f172566d.setContentDescription(str);
    }

    /* renamed from: setColor */
    public void m53340x52d2f021(int i17) {
        this.f172566d.setImageDrawable(mo53334xd83f0ace());
        this.f172566d.setColorFilter(b3.l.m9702x7444d5ad(getContext(), i17 == -16777216 ? com.p314xaae8f345.mm.R.C30859x5a72f63.f560168ai2 : com.p314xaae8f345.mm.R.C30859x5a72f63.f560169ai3), android.graphics.PorterDuff.Mode.SRC_IN);
        this.f172566d.setBackground(getBackground());
        if (this.f172566d.getBackground() != null) {
            this.f172566d.getBackground().setColorFilter(i17, android.graphics.PorterDuff.Mode.SRC_ATOP);
        }
        android.view.View view = this.f172567e;
        if (view != null && (view instanceof al1.q)) {
            ((al1.q) view).mo2260x52d2f021(i17);
        }
        this.f172568f = i17;
    }

    /* renamed from: setIcon */
    public void m53341x764b6bfb(android.graphics.Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        this.f172566d.setImageDrawable(new android.graphics.drawable.BitmapDrawable(getResources(), bitmap));
        this.f172566d.setVisibility(0);
    }

    public C12762x8fe39d2d(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f172568f = 0;
        this.f172569g = false;
        this.f172570h = false;
        a(context);
    }
}
