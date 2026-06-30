package com.p314xaae8f345.mm.ui.p2642x2e06d1;

/* renamed from: com.tencent.mm.ui.base.MMImageButton */
/* loaded from: classes.dex */
public class C21502xd5f766ad extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f278982d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f278983e;

    public C21502xd5f766ad(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    public void setEnabled(boolean z17) {
        super.setEnabled(z17);
        this.f278982d.setEnabled(z17);
        this.f278983e.setEnabled(z17);
    }

    /* renamed from: setImageDrawable */
    public void m79014x706225d7(android.graphics.drawable.Drawable drawable) {
        this.f278983e.setImageDrawable(drawable);
        this.f278983e.setVisibility(0);
        this.f278982d.setVisibility(8);
    }

    /* renamed from: setImageRsource */
    public void m79015x13fb1ab4(int i17) {
        m79014x706225d7(i65.a.i(getContext(), i17));
    }

    /* renamed from: setText */
    public void m79017x765074af(java.lang.String str) {
        this.f278982d.setText(str);
        this.f278982d.setVisibility(0);
        this.f278983e.setVisibility(8);
    }

    public C21502xd5f766ad(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        android.widget.ImageView imageView = new android.widget.ImageView(context);
        this.f278983e = imageView;
        imageView.setLayoutParams(layoutParams);
        addView(this.f278983e);
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        android.widget.TextView textView = new android.widget.TextView(context);
        this.f278982d = textView;
        textView.setLayoutParams(layoutParams2);
        this.f278982d.setClickable(false);
        this.f278982d.setFocusable(false);
        this.f278982d.setFocusableInTouchMode(false);
        this.f278982d.setTextColor(i65.a.e(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f560957yv));
        addView(this.f278982d);
    }

    /* renamed from: setText */
    public void m79016x765074af(int i17) {
        this.f278982d.setText(i17);
        this.f278982d.setVisibility(0);
        this.f278983e.setVisibility(8);
    }
}
