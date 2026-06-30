package com.p314xaae8f345.mm.ui.p2642x2e06d1;

/* renamed from: com.tencent.mm.ui.base.MaskLayout */
/* loaded from: classes11.dex */
public class C21522xf5a6e956 extends android.widget.RelativeLayout implements xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f279172d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f279173e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f279174f;

    public C21522xf5a6e956(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void a(db5.r8 r8Var) {
        removeView(this.f279172d);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        int ordinal = r8Var.ordinal();
        if (ordinal == 0) {
            layoutParams.addRule(11);
        } else if (ordinal != 1) {
            if (ordinal == 2) {
                layoutParams.addRule(12);
                layoutParams.addRule(11);
            } else if (ordinal != 3) {
                layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
            } else {
                layoutParams.addRule(12);
                layoutParams.addRule(9);
            }
        }
        addView(this.f279172d, layoutParams);
    }

    public void b(android.graphics.Bitmap bitmap, db5.r8 r8Var) {
        a(r8Var);
        this.f279172d.setImageBitmap(bitmap);
    }

    /* renamed from: getContentView */
    public android.view.View m79176xc2a54588() {
        return this.f279173e;
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.cgi);
        this.f279173e = findViewById;
        if (findViewById == null) {
            this.f279173e = new android.view.View(getContext());
            android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            this.f279173e.setLayoutParams(layoutParams);
            addView(this.f279173e);
        }
        android.widget.ImageView imageView = new android.widget.ImageView(getContext());
        this.f279172d = imageView;
        imageView.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -1));
        this.f279172d.setImageDrawable(this.f279174f);
        addView(this.f279172d);
    }

    /* renamed from: setMaskBitmap */
    public void m79177x8a98093d(android.graphics.Bitmap bitmap) {
        a(db5.r8.SUBSCRIPT_DRAWABLE_DIRECTION_ALL);
        this.f279172d.setImageBitmap(bitmap);
    }

    /* renamed from: setMaskDrawable */
    public void m79178xd0b5cd2c(android.graphics.drawable.Drawable drawable) {
        a(db5.r8.SUBSCRIPT_DRAWABLE_DIRECTION_ALL);
        this.f279172d.setImageDrawable(drawable);
    }

    public C21522xf5a6e956(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wm0.a.f528737v, i17, 0);
        this.f279174f = obtainStyledAttributes.getDrawable(5);
        obtainStyledAttributes.recycle();
    }
}
