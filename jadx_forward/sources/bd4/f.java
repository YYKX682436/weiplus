package bd4;

/* loaded from: classes4.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.C18266xe2e50b2c f100849d;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.C18266xe2e50b2c c18266xe2e50b2c) {
        this.f100849d = c18266xe2e50b2c;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView$loadContent$2");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/improve/view/ImproveCommentView$loadContent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.C18266xe2e50b2c.G;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$jumpToCommentDetailUI", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.C18266xe2e50b2c c18266xe2e50b2c = this.f100849d;
        c18266xe2e50b2c.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("jumpToCommentDetailUI", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView");
        try {
            android.content.Intent intent = new android.content.Intent();
            r45.e86 e86Var = c18266xe2e50b2c.f250648s;
            intent.putExtra("sns_text_show", e86Var != null ? e86Var.f454663h : null);
            intent.putExtra("sns_local_id", c18266xe2e50b2c.f250650u);
            r45.e86 e86Var2 = c18266xe2e50b2c.f250648s;
            intent.putExtra("sns_comment_buf", e86Var2 != null ? e86Var2.mo14344x5f01b1f6() : null);
            intent.putExtra("sns_content_source", 2);
            intent.setClass(c18266xe2e50b2c.getContext(), com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18111x49668b66.class);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.CommentView", "jumpToCommentDetailUI:" + c18266xe2e50b2c.f250650u);
            android.content.Context context = c18266xe2e50b2c.getContext();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/improve/view/ImproveCommentView", "jumpToCommentDetailUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/sns/ui/improve/view/ImproveCommentView", "jumpToCommentDetailUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Improve.CommentView", e17, "commentCollapse click exception.", new java.lang.Object[0]);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("jumpToCommentDetailUI", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$jumpToCommentDetailUI", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView");
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/improve/view/ImproveCommentView$loadContent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView$loadContent$2");
    }
}
