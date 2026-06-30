package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.rd5 f86891d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.p0 f86892e;

    public n0(com.tencent.mm.plugin.appbrand.page.p0 p0Var, r45.rd5 rd5Var) {
        this.f86892e = p0Var;
        this.f86891d = rd5Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.page.p0 p0Var = this.f86892e;
        com.tencent.mm.plugin.appbrand.page.AppBrandMenuHeader appBrandMenuHeader = p0Var.f86983e;
        r45.rd5 rd5Var = this.f86891d;
        com.tencent.mm.plugin.appbrand.o6 o6Var = p0Var.f86980b;
        java.lang.String str = p0Var.f86981c;
        l01.o0 o0Var = com.tencent.mm.plugin.appbrand.page.AppBrandMenuHeader.G;
        appBrandMenuHeader.getClass();
        if (rd5Var.f384749o) {
            com.tencent.mm.plugin.appbrand.ui.x5 x5Var = new com.tencent.mm.plugin.appbrand.ui.x5(appBrandMenuHeader.getContext());
            x5Var.setWidth(-1);
            x5Var.setHeight(-2);
            android.widget.ImageView imageView = (android.widget.ImageView) x5Var.getContentView().findViewById(com.tencent.mm.R.id.ocb);
            l01.b bVar = l01.d0.f314761a;
            bVar.b(imageView, rd5Var.f384748n, null, null);
            android.widget.TextView textView = (android.widget.TextView) x5Var.getContentView().findViewById(com.tencent.mm.R.id.r1_);
            textView.post(new com.tencent.mm.plugin.appbrand.ui.v5(textView, rd5Var, x5Var));
            ((android.widget.TextView) x5Var.getContentView().findViewById(com.tencent.mm.R.id.r17)).setText(rd5Var.f384742e);
            bVar.b((android.widget.ImageView) x5Var.getContentView().findViewById(com.tencent.mm.R.id.chb), rd5Var.f384743f, null, new com.tencent.mm.plugin.appbrand.ui.w5(x5Var));
            ((android.widget.ImageView) x5Var.getContentView().findViewById(com.tencent.mm.R.id.l66)).setVisibility(rd5Var.f384745h ? 0 : 8);
            ((android.widget.TextView) x5Var.getContentView().findViewById(com.tencent.mm.R.id.chx)).setText(rd5Var.f384744g);
            x5Var.getContentView().setOnClickListener(new com.tencent.mm.plugin.appbrand.page.t0(appBrandMenuHeader, rd5Var, o6Var, str));
            x5Var.getContentView().measure(0, 0);
            x5Var.showAsDropDown(appBrandMenuHeader, 0, -(appBrandMenuHeader.getHeight() + x5Var.getContentView().getMeasuredHeight() + appBrandMenuHeader.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.aii)));
            com.tencent.mm.plugin.appbrand.report.v0.f(o6Var.f74803n, o6Var.N2().X1(), str, 3, appBrandMenuHeader.f86349f ? 2 : 1);
        }
    }
}
