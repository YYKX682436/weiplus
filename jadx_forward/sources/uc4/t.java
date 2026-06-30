package uc4;

/* loaded from: classes4.dex */
public final class t extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uc4.v f507986d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(uc4.v vVar) {
        super(2);
        this.f507986d = vVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveCommentClick$register$1");
        android.view.View view = (android.view.View) obj;
        r45.e86 comment = (r45.e86) obj2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveCommentClick$register$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(comment, "comment");
        java.lang.String str = comment.f454663h;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(comment.f454659d, pc4.d.f434943a.o());
        uc4.v vVar = this.f507986d;
        if (b17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$clickSelfComment", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveCommentClick");
            vVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clickSelfComment", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveCommentClick");
            xc4.p c17 = vVar.c();
            if (c17 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clickSelfComment", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveCommentClick");
            } else {
                rl5.r rVar = new rl5.r(vVar.b());
                p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
                h0Var.f391656d = str;
                uc4.r rVar2 = new uc4.r(comment, vVar);
                uc4.q qVar = new uc4.q(h0Var, vVar, c17, comment, view);
                int[] iArr = new int[2];
                if (view.getTag(com.p314xaae8f345.mm.R.id.ohu) instanceof int[]) {
                    java.lang.Object tag = view.getTag(com.p314xaae8f345.mm.R.id.ohu);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type kotlin.IntArray");
                    iArr = (int[]) tag;
                }
                rVar.h(view, rVar2, qVar, iArr[0], iArr[1]);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clickSelfComment", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveCommentClick");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$clickSelfComment", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveCommentClick");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$clickOtherComment", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveCommentClick");
            vVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clickOtherComment", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveCommentClick");
            xc4.p c18 = vVar.c();
            if (c18 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clickOtherComment", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveCommentClick");
            } else {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6090xda350548 c6090xda350548 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6090xda350548();
                am.sw swVar = c6090xda350548.f136369g;
                swVar.f89474a = c18;
                swVar.f89475b = comment;
                swVar.f89476c = view;
                c6090xda350548.e();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clickOtherComment", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveCommentClick");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$clickOtherComment", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveCommentClick");
        }
        xc4.p c19 = vVar.c();
        if (c19 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.j3.f252707a.c(c19.a1(), comment);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveCommentClick$register$1");
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveCommentClick$register$1");
        return f0Var;
    }
}
