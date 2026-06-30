package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class vx {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f252250a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bs f252251b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.FrameLayout f252252c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f252253d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18052x1604484f f252254e = null;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.LinearLayout f252255f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f252256g;

    public vx(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bs bsVar, android.widget.FrameLayout frameLayout, android.view.View view) {
        this.f252253d = false;
        this.f252250a = context;
        this.f252251b = bsVar;
        this.f252252c = frameLayout;
        int r17 = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SNS_USE_NEW_GALLERY_FOOTER_INT_SYNC, 0);
        this.f252253d = (r17 == 0 ? ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_sns_enhance_like_gallery, 2) : r17) == 2;
    }

    public boolean a(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addCommentView", "com.tencent.mm.plugin.sns.ui.TimeLineCommentHelper");
        if (!(view.getTag() instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TimeLineCommentHelper", "showCommentBtn err2");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addCommentView", "com.tencent.mm.plugin.sns.ui.TimeLineCommentHelper");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder baseViewHolder = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder) view.getTag();
        java.lang.String str = baseViewHolder.f250801f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18052x1604484f c18052x1604484f = this.f252254e;
        if (c18052x1604484f != null) {
            if (c18052x1604484f.getTag() instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ux) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ux uxVar = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ux) this.f252254e.getTag();
                if (uxVar.f252136a.equals(str)) {
                    c(uxVar.f252137b);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TimeLineCommentHelper", "snsCommentFix closeCommentView.");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addCommentView", "com.tencent.mm.plugin.sns.ui.TimeLineCommentHelper");
                    return true;
                }
            }
            d();
            this.f252254e = null;
        }
        android.content.Context context = this.f252250a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18052x1604484f c18052x1604484f2 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18052x1604484f(context);
        this.f252254e = c18052x1604484f2;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.l1.f274350a;
        c18052x1604484f2.setId(com.p314xaae8f345.mm.R.id.f564266md);
        new android.widget.FrameLayout.LayoutParams(-1, -1);
        this.f252252c.addView(this.f252254e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TimeLineCommentHelper", "snsCommentFix addView(ablayout).");
        int d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(context, 76.0f);
        int d18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(context, 12.0f);
        int d19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(context, 16.0f);
        int d27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(context, 40.0f);
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cqy, (android.view.ViewGroup) null);
        int b17 = i65.a.b(context, 1);
        view.getLocationInWindow(r12);
        int[] iArr = new int[2];
        this.f252254e.getLocationInWindow(iArr);
        int[] iArr2 = {0, iArr2[1] - iArr[1]};
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TimeLineCommentHelper", "addCommentView getLocationInWindow " + iArr2[0] + "  " + iArr2[1] + " height: " + b17 + " height_hardcode:" + d17);
        android.widget.AbsoluteLayout.LayoutParams layoutParams = new android.widget.AbsoluteLayout.LayoutParams(-1, -2, d18 - d19, (iArr2[1] - b17) - ((d27 / 2) - (view.getMeasuredHeight() / 2)));
        this.f252254e.setTag(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ux(this, str, inflate));
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-2, -2);
        linearLayout.setHorizontalGravity(8388613);
        layoutParams.width = iArr2[0];
        linearLayout.addView(inflate, layoutParams2);
        this.f252254e.addView(linearLayout, layoutParams);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TimeLineCommentHelper", "snsCommentFix addView(commentView, apar).");
        if (baseViewHolder.f250793b == 10) {
            inflate.findViewById(com.p314xaae8f345.mm.R.id.f564359oz).setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563375cj2);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(inflate, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/TimeLineCommentHelper", "addCommentView", "(Landroid/view/View;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        inflate.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(inflate, "com/tencent/mm/plugin/sns/ui/TimeLineCommentHelper", "addCommentView", "(Landroid/view/View;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TimeLineCommentHelper", "snsCommentFix comment gone.");
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.sx(this, view, inflate));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addCommentView", "com.tencent.mm.plugin.sns.ui.TimeLineCommentHelper");
        return true;
    }

    public void b(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("closeComment", "com.tencent.mm.plugin.sns.ui.TimeLineCommentHelper");
        if (!(view.getTag() instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("closeComment", "com.tencent.mm.plugin.sns.ui.TimeLineCommentHelper");
            return;
        }
        java.lang.String str = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder) view.getTag()).f250801f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18052x1604484f c18052x1604484f = this.f252254e;
        if (c18052x1604484f != null && (c18052x1604484f.getTag() instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ux)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ux uxVar = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ux) this.f252254e.getTag();
            if (uxVar.f252136a.equals(str)) {
                c(uxVar.f252137b);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("closeComment", "com.tencent.mm.plugin.sns.ui.TimeLineCommentHelper");
    }

    public final void c(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("closeCommentView", "com.tencent.mm.plugin.sns.ui.TimeLineCommentHelper");
        view.clearAnimation();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bs bsVar = this.f252251b;
        view.startAnimation(bsVar.f249582o);
        bsVar.f249582o.setAnimationListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.tx(this, view));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("closeCommentView", "com.tencent.mm.plugin.sns.ui.TimeLineCommentHelper");
    }

    public boolean d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removeCommentView", "com.tencent.mm.plugin.sns.ui.TimeLineCommentHelper");
        if (this.f252254e == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeCommentView", "com.tencent.mm.plugin.sns.ui.TimeLineCommentHelper");
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TimeLineCommentHelper", "snsCommentFix removeCommentView.");
        this.f252252c.removeView(this.f252254e);
        this.f252254e = null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeCommentView", "com.tencent.mm.plugin.sns.ui.TimeLineCommentHelper");
        return true;
    }
}
