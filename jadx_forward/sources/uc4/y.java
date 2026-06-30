package uc4;

/* loaded from: classes4.dex */
public final class y extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.h1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uc4.z f507997d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f507998e;

    public y(uc4.z zVar, android.content.Context context) {
        this.f507997d = zVar;
        this.f507998e = context;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.h1
    public void a(android.view.ContextMenu menu, android.view.View v17, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onMMCreateContextMenu", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveContentTranslateClick$descMenuListener$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        uc4.z zVar = this.f507997d;
        xc4.p c17 = zVar.c();
        if (c17 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMMCreateContextMenu", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveContentTranslateClick$descMenuListener$1");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isNoCopy", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        boolean booleanValue = ((java.lang.Boolean) ((jz5.n) c17.V1).mo141623x754a37bb()).booleanValue();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isNoCopy", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        android.content.Context context = this.f507998e;
        if (!booleanValue) {
            menu.add(0, 0, 0, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571892sr));
        }
        j45.l.g("favorite");
        menu.add(0, 1, 0, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjg));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setIsTranslateView", "com.tencent.mm.plugin.sns.report.SnsMenuActionReporter");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsMenuActionReporter", "setIsTranslateView >> true");
        ta4.y0.f498398c = true;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setIsTranslateView", "com.tencent.mm.plugin.sns.report.SnsMenuActionReporter");
        if (!c17.mo133058x3172ed()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isTranslatedPost", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveContentTranslateClick");
            xc4.p c18 = zVar.c();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.r6 f17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s6.f(c18 != null ? c18.e1() : null);
            boolean z17 = (f17 == null || !f17.f246180d || f17.f246181e || (f17.f246182f & 2) == 0) ? false : true;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isTranslatedPost", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveContentTranslateClick");
            if (z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s6.d(menu, true);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s6.c(menu, true);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s6.b(menu, true);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2087xab215833.a.b(menu, c17.c1());
        ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
        if (!su4.r2.l()) {
            menu.add(0, 27, 0, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572774cg4));
            java.lang.String str = c17.h1().f39013x4c306a8a;
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str == null) {
                str = "";
            }
            tg0.v1 v1Var = (tg0.v1) i95.n0.c(tg0.v1.class);
            ((s50.g0) ((u50.v) i95.n0.c(u50.v.class))).getClass();
            java.lang.String l17 = o13.n.l(77);
            java.lang.String a17 = c17.a1();
            long length = str.length();
            ((sg0.q3) v1Var).getClass();
            su4.k3.d(1, l17, 77, 0, "", "", a17, "", 3, "", 0L, length, 5, "", "", -1, 0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMMCreateContextMenu", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveContentTranslateClick$descMenuListener$1");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.h1
    public boolean b(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveContentTranslateClick$descMenuListener$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        uc4.z zVar = this.f507997d;
        xc4.p c17 = zVar.c();
        if (c17 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveContentTranslateClick$descMenuListener$1");
            return false;
        }
        zVar.e().e(view, c17.W0(), c17.h1());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveContentTranslateClick$descMenuListener$1");
        return true;
    }
}
