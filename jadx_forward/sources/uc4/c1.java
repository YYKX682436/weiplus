package uc4;

/* loaded from: classes4.dex */
public final class c1 extends uc4.g {

    /* renamed from: f, reason: collision with root package name */
    public final n34.d5 f507918f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f507918f = new n34.d5();
    }

    @Override // uc4.g
    public void a(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveStarClick");
        if (view == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveStarClick");
            return;
        }
        xc4.p c17 = c();
        if (c17 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveStarClick");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 snsInfo = c17.c1();
        android.content.Context context = b();
        n34.d5 d5Var = this.f507918f;
        d5Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("cancelStar", "com.tencent.mm.plugin.sns.TimelineStarHelper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snsInfo, "snsInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        n34.y4 y4Var = new n34.y4(d5Var, snsInfo, view, context);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showCancelStarAlbert", "com.tencent.mm.plugin.sns.SnsStarUIHelper");
        db5.e1.L(context, false, i65.a.r(context, com.p314xaae8f345.mm.R.C30867xcad56011.jew), "", i65.a.r(context, com.p314xaae8f345.mm.R.C30867xcad56011.jev), i65.a.r(context, com.p314xaae8f345.mm.R.C30867xcad56011.jex), new n34.k4(y4Var), n34.l4.f416207d, com.p314xaae8f345.mm.R.C30859x5a72f63.f77881xa3c58d23, -1);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showCancelStarAlbert", "com.tencent.mm.plugin.sns.SnsStarUIHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("cancelStar", "com.tencent.mm.plugin.sns.TimelineStarHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveStarClick");
    }
}
