package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public final class mh implements db5.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f251452a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18049x9dc71116 f251453b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.e86 f251454c;

    public mh(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18049x9dc71116 activityC18049x9dc71116, r45.e86 e86Var) {
        this.f251452a = str;
        this.f251453b = activityC18049x9dc71116;
        this.f251454c = e86Var;
    }

    @Override // db5.c1
    public final void e(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$showSelfCommentAlert$2");
        r45.e86 e86Var = this.f251454c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18049x9dc71116 activityC18049x9dc71116 = this.f251453b;
        if (i17 == 0) {
            java.lang.String str = this.f251452a;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.b0.f(str)) {
                db5.e1.T(activityC18049x9dc71116.mo55332x76847179(), activityC18049x9dc71116.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571894st));
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18049x9dc71116.I1;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getSnsId$p", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
                java.lang.String str2 = activityC18049x9dc71116.W;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getSnsId$p", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI");
                if (str2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("snsId");
                    throw null;
                }
                java.lang.String r07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.r0(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.n(str2));
                if (e86Var != null && str != null && r07 != null) {
                    w04.a.INSTANCE.A9(4, r07 + ':' + e86Var.f454665m, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.o0(str));
                }
            } else {
                db5.e1.T(activityC18049x9dc71116.mo55332x76847179(), activityC18049x9dc71116.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571893ss));
            }
        } else if (i17 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18049x9dc71116.r7(activityC18049x9dc71116, e86Var);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI$showSelfCommentAlert$2");
    }
}
