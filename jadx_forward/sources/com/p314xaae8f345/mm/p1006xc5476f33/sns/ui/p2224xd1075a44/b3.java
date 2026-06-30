package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44;

/* loaded from: classes4.dex */
public final class b3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.c3 f252617d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.c3 c3Var) {
        super(1);
        this.f252617d = c3Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller$onOpenChanged$1");
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller$onOpenChanged$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.c3 c3Var = this.f252617d;
        if (booleanValue && c3Var.j() != 1 && c3Var.j() != 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setOpenState", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
            c3Var.f252634e = 2;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setOpenState", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getOnScrollCallback", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.y2 y2Var = c3Var.f252635f;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getOnScrollCallback", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
            if (y2Var != null) {
                y2Var.c(c3Var.j(), true);
            }
        } else if (!booleanValue && c3Var.j() != 0 && c3Var.j() != 3) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setOpenState", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
            c3Var.f252634e = 3;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setOpenState", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getOnScrollCallback", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.y2 y2Var2 = c3Var.f252635f;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getOnScrollCallback", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
            if (y2Var2 != null) {
                y2Var2.c(c3Var.j(), true);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller$onOpenChanged$1");
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller$onOpenChanged$1");
        return f0Var;
    }
}
