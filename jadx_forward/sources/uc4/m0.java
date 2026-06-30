package uc4;

/* loaded from: classes4.dex */
public abstract class m0 extends uc4.g {

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f507967f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f507967f = jz5.h.b(new uc4.l0(this));
    }

    @Override // uc4.g
    public boolean i(android.view.MenuItem menuItem, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handleMenuClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveLinkClick");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menuItem, "menuItem");
        if (menuItem.getItemId() == 4 || menuItem.getItemId() == 28 || menuItem.getItemId() == 30 || menuItem.getItemId() == 5 || menuItem.getItemId() == 3 || menuItem.getItemId() == 32 || menuItem.getItemId() == 10 || menuItem.getItemId() == 22 || menuItem.getItemId() == 2 || menuItem.getItemId() == 23 || menuItem.getItemId() == 24) {
            xc4.p c17 = c();
            if (c17 == null) {
                super.i(menuItem, i17);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleMenuClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveLinkClick");
                return false;
            }
            ((zy1.f) ((dy1.s) i95.n0.c(dy1.s.class))).Di(12076, "FavFeedCount", c17.a1());
        }
        super.i(menuItem, i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleMenuClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveLinkClick");
        return false;
    }
}
