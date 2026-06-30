package ad4;

/* loaded from: classes4.dex */
public final class t extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.q1 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.e86 f84734e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f84735f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(r45.e86 e86Var, android.content.Context context) {
        super(null, 0, null);
        this.f84734e = e86Var;
        this.f84735f = context;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.q1, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c1
    public void a(android.view.View view, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil$packageCommentContent$1");
        android.content.Intent intent = new android.content.Intent();
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            str = this.f84734e.f454659d;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 q17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().q(str);
        android.content.Context context = this.f84735f;
        if (q17 == null || !q17.k2()) {
            intent.putExtra("Contact_User", str);
            intent.putExtra("CONTACT_INFO_UI_SOURCE", 103);
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.l(intent, context);
            ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).hj(str, 8L);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil$packageCommentContent$1");
            return;
        }
        intent.putExtra("Contact_User", str);
        intent.putExtra("Contact_Scene", 37);
        intent.putExtra("CONTACT_INFO_UI_SOURCE", 103);
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.l(intent, context);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil$packageCommentContent$1");
    }
}
