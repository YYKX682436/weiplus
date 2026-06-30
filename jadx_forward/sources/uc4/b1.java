package uc4;

/* loaded from: classes4.dex */
public class b1 extends uc4.g {

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f507914f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.h1 f507915g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f507916h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f507914f = jz5.h.b(new uc4.z0(context));
        this.f507915g = new uc4.a1(context, this);
        this.f507916h = "";
    }

    @Override // uc4.g
    public void a(android.view.View view) {
        long j17;
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveSinglePhotoClick");
        xc4.p c17 = c();
        if (c17 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveSinglePhotoClick");
            return;
        }
        if (view == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveSinglePhotoClick");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPhotoClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveSinglePhotoClick");
        java.lang.Object tag = view.getTag();
        if (tag instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.oj) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.oj ojVar = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.oj) tag;
            ojVar.f251637c = j();
            android.content.Context context = b();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.f2 f2Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.f2) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.f2.class);
            f2Var.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdStatistic", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdStatistic", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
            long h17 = f2Var.f250327d.h(ojVar.f251635a, 6);
            i17 = ojVar.f251636b;
            j17 = h17;
        } else {
            j17 = 0;
            i17 = 0;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDialogShowerMgr", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveSinglePhotoClick");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kj kjVar = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kj) ((jz5.n) this.f507914f).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDialogShowerMgr", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveSinglePhotoClick");
        kjVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showImg", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
        kjVar.e(view, 1, 0, null, j17, false, 0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showImg", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
        n(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPhotoClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveSinglePhotoClick");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 h18 = c17.h1();
        r45.y8 y8Var = h18.f39012x33e0f24f;
        java.lang.String str = y8Var == null ? null : y8Var.f472379d;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            ((com.p314xaae8f345.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).Ni(null, str, ((com.p314xaae8f345.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).Ai(str, false), h18.f39018xf3f56116, 2, 4, 4, h18.f39041x2ca9cb6d, 0L, h18.Id);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveSinglePhotoClick");
    }

    @Override // uc4.g
    public android.view.View.OnCreateContextMenuListener d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMenuListener", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveSinglePhotoClick");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.h1 h1Var = this.f507915g;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMenuListener", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveSinglePhotoClick");
        return h1Var;
    }

    @Override // uc4.g
    public boolean i(android.view.MenuItem menuItem, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handleMenuClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveSinglePhotoClick");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menuItem, "menuItem");
        int itemId = menuItem.getItemId();
        if (itemId == 2) {
            xc4.p c17 = c();
            if (c17 == null) {
                super.i(menuItem, i17);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleMenuClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveSinglePhotoClick");
                zy1.e.f558858a.e(12076, "ClickImageFeedCount", this.f507916h);
                return false;
            }
            ((zy1.f) ((dy1.s) i95.n0.c(dy1.s.class))).Di(12076, "FavFeedCount", c17.a1());
        } else if (itemId == 21) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportClick$default", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveSinglePhotoClick");
            n(0);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportClick$default", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveSinglePhotoClick");
        }
        super.i(menuItem, i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleMenuClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveSinglePhotoClick");
        return false;
    }

    @Override // uc4.g
    public void m(in5.s0 s0Var, xc4.p info, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("update", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveSinglePhotoClick");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        super.m(s0Var, info, i17);
        this.f507916h = info.a1();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("update", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveSinglePhotoClick");
    }

    public final void n(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveSinglePhotoClick");
        dy1.s sVar = (dy1.s) i95.n0.c(dy1.s.class);
        xc4.p c17 = c();
        java.lang.String a17 = c17 != null ? c17.a1() : "";
        zy1.f fVar = (zy1.f) sVar;
        fVar.Bi(12076, "ClickFeedCount", 1);
        fVar.Di(12076, "ClickFeedId", a17);
        fVar.Di(12076, "ClickImageFeedCount", a17);
        fVar.Ni(12076, "BrowseFullScreenImageTime");
        yc4.b0 b0Var = yc4.b0.f542372a;
        xc4.p c18 = c();
        b0Var.b(c18 != null ? c18.a1() : "");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveSinglePhotoClick");
    }
}
