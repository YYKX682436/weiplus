package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.ui;

/* renamed from: com.tencent.mm.plugin.appbrand.ad.ui.AppBrandMenuFooter */
/* loaded from: classes7.dex */
public class C11558xc0a6f280 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f156470d;

    public C11558xc0a6f280(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f156470d = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569583fh, this);
    }

    /* renamed from: setPageView */
    public void m48844xa9cdd056(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var) {
        android.widget.TextView textView = (android.widget.TextView) this.f156470d.findViewById(com.p314xaae8f345.mm.R.id.k3f);
        java.lang.String mo48798x74292566 = n7Var.mo48798x74292566();
        java.util.Map map = i81.j.f371125a;
        java.lang.String str = i81.a0.b(mo48798x74292566).f371093d;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        textView.setText(str);
        l01.d0.f396294a.a((android.widget.ImageView) this.f156470d.findViewById(com.p314xaae8f345.mm.R.id.h5n), i81.a0.b(n7Var.mo48798x74292566()).f371092c, com.p314xaae8f345.mm.R.C30861xcebc809e.f562328cr, l01.q0.f396320d);
    }
}
