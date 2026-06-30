package ca4;

/* loaded from: classes4.dex */
public abstract class p {
    public static final void a(android.content.Context context, android.view.View view, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkResetLikeViewPadding", "com.tencent.mm.plugin.sns.data.SnsAdCommentUtil");
        if (context == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkResetLikeViewPadding", "com.tencent.mm.plugin.sns.data.SnsAdCommentUtil");
        } else {
            if (view == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkResetLikeViewPadding", "com.tencent.mm.plugin.sns.data.SnsAdCommentUtil");
                return;
            }
            int b17 = (z17 && yb4.a.f542230a.a()) ? i65.a.b(context, 6) : i65.a.b(context, 4);
            view.setPadding(view.getPaddingLeft(), b17, view.getPaddingRight(), b17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkResetLikeViewPadding", "com.tencent.mm.plugin.sns.data.SnsAdCommentUtil");
        }
    }
}
