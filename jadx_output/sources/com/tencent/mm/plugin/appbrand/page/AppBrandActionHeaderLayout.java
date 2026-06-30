package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes2.dex */
public class AppBrandActionHeaderLayout extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.LinearLayout f86333d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.HorizontalScrollView f86334e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.page.AppBrandActionSingleHeaderView f86335f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.page.AppBrandActionMultipleHeaderView f86336g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.page.AppBrandActionMultipleHeaderView f86337h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.page.AppBrandActionMultipleHeaderView f86338i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.page.AppBrandActionMultipleHeaderView f86339m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f86340n;

    /* renamed from: o, reason: collision with root package name */
    public android.content.Context f86341o;

    /* renamed from: p, reason: collision with root package name */
    public int f86342p;

    public AppBrandActionHeaderLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f86342p = -1;
        a(context);
    }

    public final void a(android.content.Context context) {
        this.f86341o = context;
        android.view.View.inflate(context, com.tencent.mm.R.layout.f488132i1, this);
        this.f86333d = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.a29);
        this.f86334e = (android.widget.HorizontalScrollView) findViewById(com.tencent.mm.R.id.a27);
        this.f86335f = (com.tencent.mm.plugin.appbrand.page.AppBrandActionSingleHeaderView) findViewById(com.tencent.mm.R.id.a2i);
        this.f86336g = (com.tencent.mm.plugin.appbrand.page.AppBrandActionMultipleHeaderView) findViewById(com.tencent.mm.R.id.a2c);
        this.f86337h = (com.tencent.mm.plugin.appbrand.page.AppBrandActionMultipleHeaderView) findViewById(com.tencent.mm.R.id.a2d);
        this.f86338i = (com.tencent.mm.plugin.appbrand.page.AppBrandActionMultipleHeaderView) findViewById(com.tencent.mm.R.id.a2e);
        this.f86339m = (com.tencent.mm.plugin.appbrand.page.AppBrandActionMultipleHeaderView) findViewById(com.tencent.mm.R.id.a2f);
        this.f86340n = (android.widget.TextView) findViewById(com.tencent.mm.R.id.a2_);
        this.f86336g.setVisibility(8);
        this.f86337h.setVisibility(8);
        this.f86338i.setVisibility(8);
        this.f86339m.setVisibility(8);
        this.f86340n.setVisibility(8);
    }

    public android.widget.TextView getStatusTextView() {
        return this.f86340n;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i17 = this.f86342p;
        if (i17 > 0) {
            setForceHeight(i17);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        int i19 = this.f86342p;
        if (i19 > 0) {
            i18 = android.view.View.MeasureSpec.makeMeasureSpec(i19, 1073741824);
        }
        super.onMeasure(i17, i18);
        if (this.f86342p <= 0 || getMeasuredHeight() <= this.f86342p) {
            return;
        }
        super.setMeasuredDimension(getMeasuredWidth(), this.f86342p);
    }

    public void setActionHeaderStyle(boolean z17) {
        if (z17) {
            this.f86335f.setTextViewTextColor(this.f86341o.getResources().getColor(com.tencent.mm.R.color.f479549ab0));
            this.f86336g.setTextViewTextColor(this.f86341o.getResources().getColor(com.tencent.mm.R.color.f479549ab0));
            this.f86337h.setTextViewTextColor(this.f86341o.getResources().getColor(com.tencent.mm.R.color.f479549ab0));
            this.f86338i.setTextViewTextColor(this.f86341o.getResources().getColor(com.tencent.mm.R.color.f479549ab0));
            this.f86339m.setTextViewTextColor(this.f86341o.getResources().getColor(com.tencent.mm.R.color.f479549ab0));
            this.f86340n.setTextColor(this.f86341o.getResources().getColor(com.tencent.mm.R.color.f479549ab0));
            return;
        }
        this.f86335f.setTextViewTextColor(this.f86341o.getResources().getColor(com.tencent.mm.R.color.f478727fi));
        this.f86336g.setTextViewTextColor(this.f86341o.getResources().getColor(com.tencent.mm.R.color.f478727fi));
        this.f86337h.setTextViewTextColor(this.f86341o.getResources().getColor(com.tencent.mm.R.color.f478727fi));
        this.f86338i.setTextViewTextColor(this.f86341o.getResources().getColor(com.tencent.mm.R.color.f478727fi));
        this.f86339m.setTextViewTextColor(this.f86341o.getResources().getColor(com.tencent.mm.R.color.f478727fi));
        this.f86340n.setTextColor(this.f86341o.getResources().getColor(com.tencent.mm.R.color.f478727fi));
    }

    @java.lang.Deprecated
    public void setAppId(java.lang.String str) {
    }

    public void setForceHeight(int i17) {
        this.f86342p = java.lang.Math.max(i17, -1);
        if (getParent() instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) getParent();
            int i18 = this.f86342p;
            if (i18 > 0) {
                viewGroup.setMinimumHeight(i18);
            }
            requestLayout();
        }
    }

    public void setStatusDescription(java.lang.CharSequence charSequence) {
        this.f86340n.setText(charSequence);
        this.f86340n.setVisibility(0);
        this.f86333d.setVisibility(8);
        this.f86334e.setVisibility(8);
    }

    public AppBrandActionHeaderLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f86342p = -1;
        a(context);
    }
}
