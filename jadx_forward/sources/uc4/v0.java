package uc4;

/* loaded from: classes4.dex */
public final class v0 implements com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c1 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f507991a = "";

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c1
    public void a(android.view.View view, java.lang.Object obj) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveNameClick");
        if (view == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveNameClick");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226();
        if (obj instanceof java.lang.String) {
            str = (java.lang.String) obj;
        } else {
            if (!(obj instanceof ca4.h)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveNameClick");
                return;
            }
            ca4.h hVar = (ca4.h) obj;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 k17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().k1(hVar.f121469c);
            if (k17 != null) {
                c17933xe8d1b226 = k17;
            }
            str = hVar.f121468b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        }
        this.f507991a = str;
        c17933xe8d1b226.m70468x66ad9b78(str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("safeJump", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveNameClick");
        android.content.Context context = view.getContext();
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 q17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().q(this.f507991a);
        intent.putExtra("Contact_User", this.f507991a);
        intent.putExtra("CONTACT_INFO_UI_SOURCE", 101);
        if (q17 != null && q17.k2()) {
            intent.putExtra("Contact_Scene", 37);
        }
        yc4.b0 b0Var = yc4.b0.f542372a;
        android.content.Context context2 = view.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        b0Var.f(intent, c17933xe8d1b226, context2);
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.l(intent, context);
        ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).hj(this.f507991a, 6L);
        ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).hj(this.f507991a, 6L);
        java.lang.String str2 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f507991a, c01.z1.r()) ? "BrowseMyAlbumTime" : "BrowseOtherAlbumTime";
        zy1.f fVar = (zy1.f) ((dy1.s) i95.n0.c(dy1.s.class));
        fVar.Ni(12076, str2);
        java.lang.String t07 = ca4.z0.t0(c17933xe8d1b226.f68891x29d1292e);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(t07, "longToString(...)");
        fVar.Di(12076, "NickNameFeedIdCount", t07);
        fVar.Di(12076, "ClickAlbumCount", this.f507991a);
        ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).hj(this.f507991a, 11L);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("safeJump", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveNameClick");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveNameClick");
    }
}
