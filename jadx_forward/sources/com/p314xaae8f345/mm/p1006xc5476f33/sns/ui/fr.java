package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class fr extends com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.d1 {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.hr f249890g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fr(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.hr hrVar, android.content.Context context, java.lang.Object obj, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c1 c1Var) {
        super(context, obj, c1Var);
        this.f249890g = hrVar;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.d1, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0, android.text.style.ClickableSpan
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$CommentListAdapter$2");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", view.getTag().toString());
        com.p314xaae8f345.mm.app.y7 y7Var = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1100", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$CommentListAdapter");
        android.app.Activity activity = this.f249890g.f250063p;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1100", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$CommentListAdapter");
        y7Var.l(intent, activity);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$CommentListAdapter$2");
    }
}
