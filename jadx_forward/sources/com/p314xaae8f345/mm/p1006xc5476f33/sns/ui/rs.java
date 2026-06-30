package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public final class rs implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18124x7a5575be f251965d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.jj4 f251966e;

    public rs(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18124x7a5575be c18124x7a5575be, r45.jj4 jj4Var) {
        this.f251965d = c18124x7a5575be;
        this.f251966e = jj4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.SnsTimelineImgBottomBar$setComponentVisible$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsTimelineImgBottomBar$setComponentVisible$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.String a17 = com.p314xaae8f345.mm.ui.l2.a("wxid_wi_1d142z0zdj03");
        if (a17 == null) {
            a17 = "";
        }
        java.lang.String str = a17;
        vh0.n1 n1Var = (vh0.n1) i95.n0.c(vh0.n1.class);
        if (n1Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18124x7a5575be c18124x7a5575be = this.f251965d;
            ((vh0.f3) n1Var).bj(c18124x7a5575be.getContext(), "wxid_wi_1d142z0zdj03", 10, str, new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.qs(c18124x7a5575be, this.f251966e));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsTimelineImgBottomBar$setComponentVisible$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.SnsTimelineImgBottomBar$setComponentVisible$1");
    }
}
