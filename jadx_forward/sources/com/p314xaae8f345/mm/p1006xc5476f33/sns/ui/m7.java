package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes3.dex */
public class m7 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f251422a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View.OnClickListener f251423b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.FrameLayout f251424c;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.animation.Animation f251426e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.animation.Animation f251427f;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.AbsoluteLayout f251425d = null;

    /* renamed from: g, reason: collision with root package name */
    public boolean f251428g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f251429h = false;

    /* renamed from: i, reason: collision with root package name */
    public int f251430i = -1;

    public m7(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i iVar, android.widget.FrameLayout frameLayout, android.view.View view) {
        this.f251422a = context;
        this.f251423b = iVar.O;
        this.f251424c = frameLayout;
        this.f251426e = new android.view.animation.ScaleAnimation(1.0f, 1.0f, 0.0f, 1.0f, 1, 1.0f, 1, 0.0f);
        this.f251426e = android.view.animation.AnimationUtils.loadAnimation(context, com.p314xaae8f345.mm.R.C30854x2dc211.f559291an);
        this.f251427f = new android.view.animation.ScaleAnimation(1.0f, 1.0f, 1.0f, 0.0f, 1, 1.0f, 1, 0.0f);
        this.f251427f = android.view.animation.AnimationUtils.loadAnimation(context, com.p314xaae8f345.mm.R.C30854x2dc211.f559292ao);
    }

    public static /* synthetic */ boolean a(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.m7 m7Var, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$102", "com.tencent.mm.plugin.sns.ui.OpenIMUnlikeHelper");
        m7Var.f251428g = z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$102", "com.tencent.mm.plugin.sns.ui.OpenIMUnlikeHelper");
        return z17;
    }

    public boolean b(android.view.View view, boolean z17, boolean z18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addUnLikeView", "com.tencent.mm.plugin.sns.ui.OpenIMUnlikeHelper");
        if (this.f251428g) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addUnLikeView", "com.tencent.mm.plugin.sns.ui.OpenIMUnlikeHelper");
            return false;
        }
        android.widget.AbsoluteLayout absoluteLayout = this.f251425d;
        if (absoluteLayout != null) {
            if (absoluteLayout.getTag() instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l7) {
                android.view.View view2 = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l7) this.f251425d.getTag()).f251264a;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("closeAdUnLikeView", "com.tencent.mm.plugin.sns.ui.OpenIMUnlikeHelper");
                this.f251428g = true;
                android.view.animation.Animation animation = this.f251427f;
                view2.startAnimation(animation);
                animation.setAnimationListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.k7(this, view2));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("closeAdUnLikeView", "com.tencent.mm.plugin.sns.ui.OpenIMUnlikeHelper");
            } else {
                c();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addUnLikeView", "com.tencent.mm.plugin.sns.ui.OpenIMUnlikeHelper");
            return false;
        }
        if (view.getTag() == null || !(view.getTag() instanceof ca4.n)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addUnLikeView", "com.tencent.mm.plugin.sns.ui.OpenIMUnlikeHelper");
            return false;
        }
        ca4.n nVar = (ca4.n) view.getTag();
        java.lang.String str = nVar.f121534b;
        android.content.Context context = this.f251422a;
        android.widget.AbsoluteLayout absoluteLayout2 = new android.widget.AbsoluteLayout(context);
        this.f251425d = absoluteLayout2;
        absoluteLayout2.setId(com.p314xaae8f345.mm.R.id.f564266md);
        this.f251424c.addView(this.f251425d);
        int d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(context, 88.0f);
        int d18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(context, 30.0f);
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.c8l, (android.view.ViewGroup) null);
        inflate.setOnClickListener(this.f251423b);
        inflate.setTag(nVar);
        int a17 = z17 ? com.p314xaae8f345.mm.ui.bl.a(context) : 0;
        int[] iArr = new int[2];
        int m78527x73620a77 = context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context).m78527x73620a77() : 0;
        if (m78527x73620a77 <= 0) {
            m78527x73620a77 = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561156ay);
        }
        nVar.f121533a.getLocationInWindow(iArr);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getStatusBarHeight", "com.tencent.mm.plugin.sns.ui.OpenIMUnlikeHelper");
        int q17 = com.p314xaae8f345.mm.ui.bk.q(context);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getStatusBarHeight", "com.tencent.mm.plugin.sns.ui.OpenIMUnlikeHelper");
        this.f251430i = q17;
        if (this.f251429h) {
            m78527x73620a77 = i65.a.b(context, 2);
            this.f251430i = 0;
        }
        android.widget.AbsoluteLayout.LayoutParams layoutParams = new android.widget.AbsoluteLayout.LayoutParams(-2, -2, iArr[0] - d17, (((iArr[1] - this.f251430i) - m78527x73620a77) + d18) - a17);
        this.f251425d.setTag(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l7(this, str, inflate));
        this.f251425d.addView(inflate, layoutParams);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(inflate, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/OpenIMUnlikeHelper", "addUnLikeView", "(Landroid/view/View;ZZ)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        inflate.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(inflate, "com/tencent/mm/plugin/sns/ui/OpenIMUnlikeHelper", "addUnLikeView", "(Landroid/view/View;ZZ)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f251428g = true;
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.i7(this, view, inflate));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addUnLikeView", "com.tencent.mm.plugin.sns.ui.OpenIMUnlikeHelper");
        return true;
    }

    public boolean c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removeUnLikeView", "com.tencent.mm.plugin.sns.ui.OpenIMUnlikeHelper");
        android.widget.AbsoluteLayout absoluteLayout = this.f251425d;
        if (absoluteLayout == null) {
            this.f251428g = false;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeUnLikeView", "com.tencent.mm.plugin.sns.ui.OpenIMUnlikeHelper");
            return false;
        }
        this.f251424c.removeView(absoluteLayout);
        this.f251425d = null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeUnLikeView", "com.tencent.mm.plugin.sns.ui.OpenIMUnlikeHelper");
        return true;
    }

    public m7(android.content.Context context, android.view.View.OnClickListener onClickListener, android.widget.FrameLayout frameLayout, android.view.View view) {
        this.f251422a = context;
        this.f251423b = onClickListener;
        this.f251424c = frameLayout;
        this.f251426e = new android.view.animation.ScaleAnimation(1.0f, 1.0f, 0.0f, 1.0f, 1, 1.0f, 1, 0.0f);
        this.f251426e = android.view.animation.AnimationUtils.loadAnimation(context, com.p314xaae8f345.mm.R.C30854x2dc211.f559291an);
        this.f251427f = new android.view.animation.ScaleAnimation(1.0f, 1.0f, 1.0f, 0.0f, 1, 1.0f, 1, 0.0f);
        this.f251427f = android.view.animation.AnimationUtils.loadAnimation(context, com.p314xaae8f345.mm.R.C30854x2dc211.f559292ao);
    }
}
