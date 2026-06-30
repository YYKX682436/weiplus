package uc4;

/* loaded from: classes4.dex */
public final class c0 extends uc4.g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // uc4.g
    public void a(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveDeleteClick");
        xc4.p c17 = c();
        if (c17 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveDeleteClick");
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(b());
        java.lang.String string = c17.m175345x507e494d() ? b().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jg8) : b().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jg7);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        u1Var.g(string);
        u1Var.n(b().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571900t0));
        u1Var.k(b().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561015a31));
        u1Var.l(new uc4.a0(c17, this));
        u1Var.j(b().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg));
        u1Var.i(uc4.b0.f507913a);
        u1Var.q(false);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveDeleteClick");
    }

    public final void n(long j17, long j18, int i17) {
        p012xc85e97e9.p093xedfae76a.c1 a17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("notifyDBDeleteByLocalId", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveDeleteClick");
        synchronized (jm0.k.f381803i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(zc4.h.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new p012xc85e97e9.p093xedfae76a.j1(gm0.j1.b().f354778h, new jm0.h()).a(zc4.h.class);
        }
        ((zc4.g) ((zc4.h) a17).P6(zc4.g.class)).X6(j17, j18, i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("notifyDBDeleteByLocalId", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveDeleteClick");
    }
}
