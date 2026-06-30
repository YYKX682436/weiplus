package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f249749d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f249750e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.j f249751f;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.j jVar, android.view.View view, android.view.View view2) {
        this.f249751f = jVar;
        this.f249749d = view;
        this.f249750e = view2;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper$1");
        android.view.View view = this.f249750e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.j jVar = this.f249751f;
        jVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initCommentView", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper");
        android.view.View view2 = this.f249749d;
        ca4.j jVar2 = (ca4.j) view2.getTag();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/AdNotLikeHelper", "initCommentView", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/AdNotLikeHelper", "initCommentView", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        jVar.f250999h = true;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.f fVar = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.f(jVar);
        android.view.animation.Animation animation = jVar.f250997f;
        animation.setAnimationListener(fVar);
        view.startAnimation(animation);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f564215l4);
        jVar.f251005n = textView;
        textView.setTag(jVar2);
        ca4.i iVar = jVar2.f121485a;
        if (iVar == null || iVar.f121472a == null) {
            z17 = false;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 c17902x72cc1771 = iVar.f121473b;
            java.lang.String f17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            java.lang.String str = "zh_CN".equals(f17) ? c17902x72cc1771.f38073xa3c0d722 : ("zh_TW".equals(f17) || "zh_HK".equals(f17)) ? c17902x72cc1771.f38075xa3c0d93a : c17902x72cc1771.f38074xa3c0d760;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                jVar.f251005n.setText(str);
            }
            z17 = c17902x72cc1771.f38094x6a99a254;
        }
        android.widget.ListView listView = (android.widget.ListView) view.findViewById(com.p314xaae8f345.mm.R.id.f564210kz);
        jVar.f251006o = listView;
        listView.setAdapter((android.widget.ListAdapter) new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.k(jVar.f250992a, (ca4.j) view2.getTag()));
        if (z17) {
            jVar.f251006o.setClickable(false);
            jVar.f251006o.setOnItemClickListener(null);
        } else {
            jVar.f251006o.setClickable(true);
            jVar.f251006o.setOnItemClickListener(jVar.f250993b.P);
        }
        jVar.f251005n.setClickable(false);
        jVar.f251007p = view;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initCommentView", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper$1");
    }
}
