package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class k1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder f251135d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f251136e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.CharSequence f251137f;

    /* renamed from: g, reason: collision with root package name */
    public final r45.e86 f251138g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l1 f251139h;

    public k1(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l1 l1Var, r45.e86 e86Var, java.lang.String str, java.lang.CharSequence charSequence, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder baseViewHolder) {
        this.f251139h = l1Var;
        this.f251137f = "";
        this.f251136e = str;
        this.f251138g = e86Var;
        this.f251135d = baseViewHolder;
        this.f251137f = charSequence;
    }

    public static /* synthetic */ r45.e86 a(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.k1 k1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$400", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$CommentClickListener");
        r45.e86 e86Var = k1Var.f251138g;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$400", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$CommentClickListener");
        return e86Var;
    }

    public static /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder b(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.k1 k1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$600", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$CommentClickListener");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder baseViewHolder = k1Var.f251135d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$600", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$CommentClickListener");
        return baseViewHolder;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.String str;
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$CommentClickListener");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/BaseTimeLine$CommentClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder baseViewHolder = this.f251135d;
        if (!com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.h(baseViewHolder.f250797d)) {
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/BaseTimeLine$CommentClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$CommentClickListener");
            return;
        }
        baseViewHolder.M = view;
        r45.e86 e86Var = this.f251138g;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l1 l1Var = this.f251139h;
        if (e86Var != null && l1Var.f251242j.c(baseViewHolder.f250795c) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.j3.f252707a.c(ca4.z0.t0(l1Var.f251242j.c(baseViewHolder.f250795c).f68891x29d1292e), e86Var);
        }
        if (e86Var != null && (str2 = e86Var.f454659d) != null && str2.equals(l1Var.f251249q)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.zx zxVar = l1Var.f251245m;
            if (zxVar != null && zxVar.f253258f) {
                l1Var.g();
                l1Var.f251245m.f253258f = false;
            }
            rl5.r rVar = new rl5.r(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l1.a(l1Var));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.h1 h1Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.h1(this);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.j1 j1Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.j1(this);
            int[] iArr = new int[2];
            if (view.getTag(com.p314xaae8f345.mm.R.id.ohu) instanceof int[]) {
                iArr = (int[]) view.getTag(com.p314xaae8f345.mm.R.id.ohu);
            }
            rVar.h(view, h1Var, j1Var, iArr[0], iArr[1]);
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/BaseTimeLine$CommentClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$CommentClickListener");
            return;
        }
        new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17 = l1Var.f251242j.c(baseViewHolder.f250795c);
        if (c17.m70398x507e494d()) {
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/BaseTimeLine$CommentClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$CommentClickListener");
            return;
        }
        if (!ha4.k.a(c17)) {
            ja4.d.a(baseViewHolder.T.getContext(), baseViewHolder.T.g(0));
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/BaseTimeLine$CommentClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$CommentClickListener");
            return;
        }
        m21.w.d(742);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.e(c17);
        ca4.z0.T(c17);
        c17.m70377x3172ed();
        c17.m70375x338a8cc7();
        if (e86Var.f454665m == 0) {
            long j17 = e86Var.f454670r;
        }
        java.lang.String str3 = e86Var.f454659d;
        java.lang.String str4 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l1.a(l1Var).getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574766je0) + this.f251136e;
        l1Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("performCommentClick", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
        java.lang.String str5 = baseViewHolder.f250797d + str4;
        l1Var.f251248p = str5;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseTimeLine", "[performCommentClick] onCommentClick:  commentkey " + l1Var.f251248p + " " + baseViewHolder.f250797d + " position:" + baseViewHolder.f250795c);
        l1Var.f251243k.setTag(c17);
        l1Var.e();
        l1Var.f251243k.setVisibility(0);
        l1Var.f251243k.H(l1Var.d(str5, 0));
        l1Var.f251243k.m70721xed97b3c4(str4 + l1Var.f251233a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j8z));
        l1Var.f251243k.m70731x36d7a384(c17);
        if (c17.m70377x3172ed() && e86Var != null && (str = e86Var.f454659d) != null && str.equals(c17.m70374x6bf53a6c())) {
            l1Var.f251243k.H(l1Var.d(str5, 1));
        }
        l1Var.b(c17);
        l1Var.f251243k.m70722xed9839eb(e86Var);
        l1Var.f251243k.N(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l1.A, str5);
        l1Var.f251243k.post(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.b1(l1Var));
        l1Var.f251243k.O(false);
        l1Var.j(baseViewHolder);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("performCommentClick", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/BaseTimeLine$CommentClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$CommentClickListener");
    }
}
