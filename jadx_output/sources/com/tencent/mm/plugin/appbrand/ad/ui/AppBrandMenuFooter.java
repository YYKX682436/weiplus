package com.tencent.mm.plugin.appbrand.ad.ui;

/* loaded from: classes7.dex */
public class AppBrandMenuFooter extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f74937d;

    public AppBrandMenuFooter(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f74937d = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f488050fh, this);
    }

    public void setPageView(com.tencent.mm.plugin.appbrand.page.n7 n7Var) {
        android.widget.TextView textView = (android.widget.TextView) this.f74937d.findViewById(com.tencent.mm.R.id.k3f);
        java.lang.String appId = n7Var.getAppId();
        java.util.Map map = i81.j.f289592a;
        java.lang.String str = i81.a0.b(appId).f289560d;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        textView.setText(str);
        l01.d0.f314761a.a((android.widget.ImageView) this.f74937d.findViewById(com.tencent.mm.R.id.h5n), i81.a0.b(n7Var.getAppId()).f289559c, com.tencent.mm.R.drawable.f480795cr, l01.q0.f314787d);
    }
}
