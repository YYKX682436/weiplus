package ca4;

/* loaded from: classes4.dex */
public class f0 implements com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.a5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ca4.d f121428a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ca4.g0 f121429b;

    public f0(ca4.g0 g0Var, ca4.d dVar) {
        this.f121429b = g0Var;
        this.f121428a = dVar;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.a5
    public void a(boolean z17, boolean z18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onLaunchApp", "com.tencent.mm.plugin.sns.data.SnsAdUtil$1$1");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdUtil", "appPageUrl!=null, onLaunchApp=" + z17 + ", launchCancel=" + z18);
        ca4.g0 g0Var = this.f121429b;
        if (z17) {
            int i17 = g0Var.f121461h;
            ca4.d dVar = this.f121428a;
            if (i17 != 2) {
                ca4.c0.e(g0Var.f121462i, g0Var.f121463m, 1, 2, g0Var.f121457d, g0Var.f121459f, g0Var.f121460g);
                l44.z.i(dVar);
            }
            java.util.ArrayList arrayList = l44.z.f397961a;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportDeepLinkComplete", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
            try {
                ca4.f fVar = new ca4.f();
                fVar.m(4002011);
                fVar.o(dVar.f121384a);
                fVar.f(dVar.f121385b);
                fVar.l(dVar.f121386c);
                fVar.c(dVar.f121387d);
                fVar.p(dVar.f121389f);
                fVar.n(dVar.f121390g);
                fVar.q(dVar.f121391h);
                fVar.h(dVar.f121394k);
                fVar.j(dVar.f121396m);
                fVar.i(1);
                a84.t0.a(fVar.a());
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdConversionOnlineReportHelper", "reportDeepLinkComplete, exp is " + th6.toString());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportDeepLinkComplete", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1958, 80);
        }
        if (!z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.ka.e(g0Var.f121464n);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onLaunchApp", "com.tencent.mm.plugin.sns.data.SnsAdUtil$1$1");
    }
}
