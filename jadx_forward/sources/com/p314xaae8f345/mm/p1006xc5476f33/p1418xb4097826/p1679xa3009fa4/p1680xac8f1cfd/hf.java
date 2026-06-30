package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class hf implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f216157d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.qf f216158e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f216159f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f216160g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f216161h;

    public hf(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.qf qfVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079) {
        this.f216157d = i17;
        this.f216158e = qfVar;
        this.f216159f = abstractC14490x69736cb5;
        this.f216160g = str;
        this.f216161h = c14994x9b99c079;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        jz5.f0 f0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedShareDescToCommentUIC$showPostOkTipsBubble$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.qf qfVar = this.f216158e;
        int i17 = this.f216157d;
        if (i17 == 1) {
            qfVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedShareDescToCommentUIC", "[gotoMakeRedPacketCoverUI] exportId:exportId");
            java.lang.String str = "pages/index/index.html?channel=202401&exportId=" + this.f216160g;
            l81.b1 b1Var = new l81.b1();
            b1Var.f398547b = "wxb8f2d39684e3fe62";
            b1Var.f398555f = str;
            b1Var.f398549c = 0;
            b1Var.f398565k = 1000;
            b1Var.M = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedShareDescToCommentUIC", "appId: " + b1Var.f398547b + ", enterPath: " + b1Var.f398555f);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).bj(qfVar.m80379x76847179(), b1Var);
        } else if (i17 == 2) {
            qfVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = this.f216161h;
            long m59251x5db1b11 = c14994x9b99c079.m59251x5db1b11();
            java.lang.String nonceId = c14994x9b99c079.m59276x6c285d75();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedShareDescToCommentUIC", "[gotoMakeEmotionUI] feedId:" + pm0.v.u(m59251x5db1b11) + " nonceId:" + nonceId);
            if (((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.l6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.l6.class)) != null) {
                android.app.Activity context = qfVar.m80379x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nonceId, "nonceId");
                android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13321xc8d9d4b6.class);
                intent.putExtra("feedId", m59251x5db1b11);
                intent.putExtra("nonceId", nonceId);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/feature/emoji/EmoticonCustomCreateFeatureService", "openCustomCreateEmoticonDirectFromFinder", "(Landroid/content/Context;JLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(context, "com/tencent/mm/feature/emoji/EmoticonCustomCreateFeatureService", "openCustomCreateEmoticonDirectFromFinder", "(Landroid/content/Context;JLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                f0Var = jz5.f0.f384359a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderFeedShareDescToCommentUIC", "unable to get emoticon custom create service for starting editing");
            }
        } else if (i17 == 3) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y4.f184247a.Q(qfVar.m80379x76847179(), this.f216159f);
        }
        qfVar.O6();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedShareDescToCommentUIC$showPostOkTipsBubble$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
