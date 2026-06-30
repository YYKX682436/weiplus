package dc4;

/* loaded from: classes4.dex */
public class m0 implements d94.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dc4.o0 f310314a;

    public m0(dc4.o0 o0Var) {
        this.f310314a = o0Var;
    }

    @Override // d94.a
    public android.graphics.Rect a() {
        dc4.o0 o0Var = this.f310314a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onGetAnimDiplayRect", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem$1");
        try {
            int width = o0Var.f310369i.getWidth();
            o0Var.f310369i.getLocationOnScreen(dc4.o0.l(o0Var));
            o0Var.f310369i.getLocalVisibleRect(dc4.o0.m(o0Var));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$300", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
            android.view.View view = o0Var.L;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$300", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
            view.getLocationOnScreen(dc4.o0.n(o0Var));
            int i17 = dc4.o0.l(o0Var)[0];
            int i18 = dc4.o0.l(o0Var)[1];
            int i19 = dc4.o0.n(o0Var)[0];
            int i27 = dc4.o0.n(o0Var)[1];
            java.util.Objects.toString(dc4.o0.m(o0Var));
            int i28 = dc4.o0.n(o0Var)[1];
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$300", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
            android.view.View view2 = o0Var.L;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$300", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
            dc4.o0.m(o0Var).set(0, 0, width, ((i28 + view2.getHeight()) - dc4.o0.l(o0Var)[1]) - dc4.o0.m(o0Var).top);
            android.graphics.Rect m17 = dc4.o0.m(o0Var);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGetAnimDiplayRect", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem$1");
            return m17;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.SlideFullCardDetailItem", "onGetAnimDiplayRect, exp=" + th6.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGetAnimDiplayRect", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem$1");
            return null;
        }
    }

    @Override // d94.a
    public android.graphics.Point b() {
        dc4.o0 o0Var = this.f310314a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onGetCoordOffset", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem$1");
        try {
            if (o0Var.f310322s != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$400", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
                android.widget.FrameLayout frameLayout = o0Var.I;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$400", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
                if (frameLayout != null) {
                    o0Var.f310322s.getLocationOnScreen(dc4.o0.o(o0Var));
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$400", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
                    android.widget.FrameLayout frameLayout2 = o0Var.I;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$400", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
                    frameLayout2.getLocationOnScreen(dc4.o0.p(o0Var));
                    int i17 = dc4.o0.o(o0Var)[0];
                    int i18 = dc4.o0.o(o0Var)[1];
                    int i19 = dc4.o0.p(o0Var)[0];
                    int i27 = dc4.o0.p(o0Var)[1];
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$700", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
                    android.graphics.Point point = o0Var.K;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$700", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
                    point.x = dc4.o0.o(o0Var)[0] - dc4.o0.p(o0Var)[0];
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$700", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$700", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
                    point.y = dc4.o0.o(o0Var)[1] - dc4.o0.p(o0Var)[1];
                }
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.SlideFullCardDetailItem", "onGetCoordOffset, exp=" + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$700", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
        android.graphics.Point point2 = o0Var.K;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$700", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGetCoordOffset", "com.tencent.mm.plugin.sns.ui.detail.item.SlideFullCardDetailItem$1");
        return point2;
    }
}
