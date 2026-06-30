package com.tencent.mm.plugin.appbrand.widget.recent;

/* loaded from: classes7.dex */
public class MenuAppBrandRecentView extends com.tencent.mm.plugin.appbrand.widget.recent.BaseAppBrandRecentView {

    /* renamed from: u2, reason: collision with root package name */
    public static final int f91922u2;

    /* renamed from: v2, reason: collision with root package name */
    public static final int f91923v2;

    /* renamed from: t2, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.widget.recent.h0 f91924t2;

    static {
        int i17 = com.tencent.mm.plugin.appbrand.widget.recent.w.f92078e;
        f91922u2 = i17 - 1;
        f91923v2 = i17;
    }

    public MenuAppBrandRecentView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.recent.BaseAppBrandRecentView
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488142ib;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.recent.BaseAppBrandRecentView
    public int getLoadCount() {
        return f91923v2;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.recent.BaseAppBrandRecentView
    public int getShowCount() {
        return f91922u2;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.recent.BaseAppBrandRecentView
    public java.lang.String getType() {
        return "MenuAppBrandRecentView";
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.recent.BaseAppBrandRecentView
    public void i1(android.content.Context context) {
        super.i1(context);
        super.setOnItemClickListener(new com.tencent.mm.plugin.appbrand.widget.recent.e2(this));
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.recent.BaseAppBrandRecentView
    public void j1(com.tencent.mm.plugin.appbrand.widget.recent.p1 p1Var, com.tencent.mm.plugin.appbrand.widget.recent.x xVar, int i17) {
        super.j1(p1Var, xVar, i17);
        int color = getContext().getResources().getColor(com.tencent.mm.R.color.a0c);
        android.widget.TextView textView = p1Var.f92031f;
        textView.setTextColor(color);
        android.widget.ImageView imageView = p1Var.f92029d;
        if (xVar == null || xVar.f92085b != 2) {
            if (xVar == null || xVar.f92085b != -1) {
                return;
            }
            imageView.setImageResource(com.tencent.mm.R.raw.default_avatar);
            return;
        }
        textView.setVisibility(0);
        p1Var.f92030e.setVisibility(8);
        textView.setText(com.tencent.mm.R.string.lto);
        imageView.setImageResource(com.tencent.mm.R.raw.app_brand_capsule_multitasking_wechat);
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.recent.BaseAppBrandRecentView, com.tencent.mm.plugin.appbrand.widget.recent.AppBrandRecentView
    public void setOnItemClickListener(com.tencent.mm.plugin.appbrand.widget.recent.h0 h0Var) {
        this.f91924t2 = h0Var;
    }
}
