package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class xf implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f104949d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f104950e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.zf f104951f;

    public xf(android.view.ViewGroup viewGroup, android.view.ViewGroup viewGroup2, com.tencent.mm.plugin.finder.convert.zf zfVar) {
        this.f104949d = viewGroup;
        this.f104950e = viewGroup2;
        this.f104951f = zfVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f104949d.findViewById(com.tencent.mm.R.id.efr).animate().alpha(1.0f).setDuration(500L).start();
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_FEED_LIKE_ANIM_GUIDE_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        uc2.c cVar;
        tc2.g gVar;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed;
        android.content.Context context;
        zy2.ra Sj;
        android.view.View findViewById = this.f104950e.findViewById(com.tencent.mm.R.id.efr);
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert$showLikeAnim$1$1$invoke$$inlined$addListener$default$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            findViewById.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert$showLikeAnim$1$1$invoke$$inlined$addListener$default$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        com.tencent.mm.plugin.finder.convert.zf zfVar = this.f104951f;
        in5.s0 s0Var = zfVar.f104375z;
        if (s0Var == null || (cVar = (uc2.c) zfVar.f104851e.a(s0Var, uc2.c.class)) == null || (baseFinderFeed = (gVar = ((bg2.j1) cVar).f417141d).f417148h) == null) {
            return;
        }
        in5.s0 s0Var2 = gVar.f417149i;
        r45.qt2 V6 = (s0Var2 == null || (context = s0Var2.f293121e) == null || (Sj = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Sj(context)) == null) ? null : ((com.tencent.mm.plugin.finder.viewmodel.component.ny) Sj).V6();
        com.tencent.mm.plugin.finder.assist.v3 v3Var = com.tencent.mm.plugin.finder.assist.v3.f102621a;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("feedActionType", 87);
        jSONObject.put("feedActionSubType", com.tencent.mm.plugin.appbrand.jsapi.media.c4.CTRL_INDEX);
        linkedList.add(jSONObject.toString());
        v3Var.b(V6, baseFinderFeed, linkedList);
        ml2.u1 u1Var = ml2.u1.f328054i3;
        jz5.l[] lVarArr = new jz5.l[1];
        r45.nw1 liveInfo = baseFinderFeed.getFeedObject().getLiveInfo();
        lVarArr[0] = new jz5.l("liveid", pm0.v.u(liveInfo != null ? liveInfo.getLong(0) : 0L));
        v3Var.c(V6, u1Var, kz5.c1.i(lVarArr));
    }
}
