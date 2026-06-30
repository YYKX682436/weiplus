package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes.dex */
public class AppBrandActionSingleHeaderView extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f86345d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f86346e;

    public AppBrandActionSingleHeaderView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public final void a(android.content.Context context) {
        ((android.view.LayoutInflater) context.getSystemService("layout_inflater")).inflate(com.tencent.mm.R.layout.f488134i3, this);
        this.f86345d = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.a2g);
        this.f86346e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.a2h);
    }

    public android.widget.ImageView getImageView() {
        return this.f86345d;
    }

    public void setImageDrawable(android.graphics.drawable.Drawable drawable) {
        this.f86345d.setImageDrawable(drawable);
    }

    public void setImageResource(int i17) {
        this.f86345d.setImageResource(i17);
    }

    public void setTextViewText(java.lang.String str) {
        this.f86346e.setText(str);
    }

    public void setTextViewTextColor(int i17) {
        this.f86346e.setTextColor(i17);
    }

    public AppBrandActionSingleHeaderView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        a(context);
    }
}
