package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes.dex */
public class AppBrandActionMultipleHeaderView extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f86343d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f86344e;

    public AppBrandActionMultipleHeaderView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public final void a(android.content.Context context) {
        ((android.view.LayoutInflater) context.getSystemService("layout_inflater")).inflate(com.tencent.mm.R.layout.f488133i2, this);
        this.f86343d = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.a2a);
        this.f86344e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.a2b);
    }

    public java.lang.String getH5Url() {
        return null;
    }

    public android.widget.ImageView getImageView() {
        return this.f86343d;
    }

    public java.lang.String getPath() {
        return null;
    }

    public int getType() {
        return 0;
    }

    public java.lang.String getUsername() {
        return null;
    }

    public void setImageDrawable(android.graphics.drawable.Drawable drawable) {
        this.f86343d.setImageDrawable(drawable);
    }

    public void setImageResource(int i17) {
        this.f86343d.setImageResource(i17);
    }

    public void setTextViewText(java.lang.String str) {
        this.f86344e.setText(str);
    }

    public void setTextViewTextColor(int i17) {
        this.f86344e.setTextColor(i17);
    }

    public AppBrandActionMultipleHeaderView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        a(context);
    }
}
