package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public final /* synthetic */ class ih extends p3321xbce91901.jvm.p3324x21ffc6bd.m implements yz5.l {
    public ih(java.lang.Object obj) {
        super(1, obj, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18049x9dc71116.class, "jumpToProfileWithUserName", "jumpToProfileWithUserName(Ljava/lang/String;)V", 0);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.app.y7 y7Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$setupRecyclerView$1$getItemConvert$2");
        java.lang.String p07 = (java.lang.String) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$setupRecyclerView$1$getItemConvert$2");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18049x9dc71116 activityC18049x9dc71116 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18049x9dc71116) this.f72685xcfcbe9ef;
        activityC18049x9dc71116.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("jumpToProfileWithUserName", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        if (p07.length() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("jumpToProfileWithUserName", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        } else {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Contact_User", p07);
            intent.putExtra("CONTACT_INFO_UI_SOURCE", 14);
            ct.u2 u2Var = (ct.u2) i95.n0.c(ct.u2.class);
            if (u2Var != null && (y7Var = ((bt.d) u2Var).f105601d) != null) {
                y7Var.l(intent, activityC18049x9dc71116);
            }
            xe0.l0 l0Var = (xe0.l0) i95.n0.c(xe0.l0.class);
            if (l0Var != null) {
                ((we0.j1) l0Var).hj(p07, 9L);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("jumpToProfileWithUserName", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$setupRecyclerView$1$getItemConvert$2");
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$setupRecyclerView$1$getItemConvert$2");
        return f0Var;
    }
}
