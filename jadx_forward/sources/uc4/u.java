package uc4;

/* loaded from: classes4.dex */
public final class u extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uc4.v f507989d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(uc4.v vVar) {
        super(2);
        this.f507989d = vVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveCommentClick$register$2");
        android.view.View view = (android.view.View) obj;
        r45.e86 comment = (r45.e86) obj2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveCommentClick$register$2");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(comment, "comment");
        int[] iArr = new int[2];
        if (view.getTag(com.p314xaae8f345.mm.R.id.ohu) instanceof int[]) {
            java.lang.Object tag = view.getTag(com.p314xaae8f345.mm.R.id.ohu);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type kotlin.IntArray");
            iArr = (int[]) tag;
        }
        uc4.v vVar = this.f507989d;
        xc4.p c17 = vVar.c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c17);
        view.setTag(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.u1(c17.W0(), c17.a1(), comment, comment.f454659d, comment.f454663h, null, 1, c17.m125483x6bf53a6c(), c17.h1().Id));
        rl5.r f17 = vVar.f();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getCommentMenuListener$p", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveCommentClick");
        uc4.s sVar = vVar.f507990f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getCommentMenuListener$p", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveCommentClick");
        f17.h(view, sVar, vVar.e(), iArr[0], iArr[1]);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveCommentClick$register$2");
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveCommentClick$register$2");
        return f0Var;
    }
}
