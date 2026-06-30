package uc4;

/* loaded from: classes4.dex */
public final class g0 extends uc4.g {

    /* renamed from: f, reason: collision with root package name */
    public final yz5.a f507942f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f507943g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(android.content.Context context, yz5.a aVar) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f507942f = aVar;
        this.f507943g = jz5.h.b(new uc4.f0(this, context));
    }

    @Override // uc4.g
    public void a(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveFinderMediaClick");
        xc4.p c17 = c();
        if (c17 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveFinderMediaClick");
            return;
        }
        if (view == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveFinderMediaClick");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.FinderMedia", "perform click");
        view.setTag(c17.h1());
        yz5.a aVar = this.f507942f;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.e(view, c17.W0());
        dy1.s sVar = (dy1.s) i95.n0.c(dy1.s.class);
        java.lang.String a17 = c17.a1();
        zy1.f fVar = (zy1.f) sVar;
        fVar.Bi(12076, "ClickFeedCount", 1);
        fVar.Di(12076, "ClickFeedId", a17);
        fVar.Di(12076, "ClickFinderFeedCnt", a17);
        fVar.Ni(12076, "FinderFeedTime");
        yc4.b0 b0Var = yc4.b0.f542372a;
        b0Var.b(c17.a1());
        b0Var.c(c17.a1(), 1);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveFinderMediaClick");
    }

    @Override // uc4.g
    public android.view.View.OnCreateContextMenuListener d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMenuListener", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveFinderMediaClick");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFinderMediaMenuListener", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveFinderMediaClick");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.h1 h1Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.h1) ((jz5.n) this.f507943g).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFinderMediaMenuListener", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveFinderMediaClick");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMenuListener", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveFinderMediaClick");
        return h1Var;
    }
}
