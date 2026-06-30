package com.tencent.mm.plugin.appbrand.luggage.export.functionalpage;

/* loaded from: classes7.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.m f85655d;

    public l(com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.m mVar) {
        this.f85655d = mVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.m mVar = this.f85655d;
        ((com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.n) mVar.F()).r1().l(false, al1.h0.PageConfig);
        ((com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.n) mVar.F()).r1().setNavHidden(false);
        ((com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.n) mVar.F()).r1().setMainTitle(mVar.I().getResources().getString(com.tencent.mm.R.string.a0n));
        ((com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.n) mVar.F()).r1().setBackgroundColor(b3.l.getColor(mVar.I(), com.tencent.mm.R.color.a07));
        al1.b r17 = ((com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.n) mVar.F()).r1();
        boolean C = com.tencent.mm.ui.bk.C();
        al1.j0 j0Var = al1.j0.WHITE;
        al1.j0 j0Var2 = al1.j0.BLACK;
        r17.setForegroundStyle((C ? j0Var : j0Var2).name());
        com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.n nVar = (com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.n) mVar.F();
        if (!com.tencent.mm.ui.bk.C()) {
            j0Var = j0Var2;
        }
        nVar.f3(j0Var.name());
        ((com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.n) mVar.F()).getContentView().setBackgroundColor(b3.l.getColor(mVar.I(), com.tencent.mm.R.color.a08));
        com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.n nVar2 = (com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.n) mVar.F();
        int i17 = com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.n.f85661n2;
        nVar2.p1(false);
        ((com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.n) mVar.F()).D2("onLoadURL");
    }
}
