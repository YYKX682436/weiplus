package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class xf implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f186482d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f186483e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zf f186484f;

    public xf(android.view.ViewGroup viewGroup, android.view.ViewGroup viewGroup2, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zf zfVar) {
        this.f186482d = viewGroup;
        this.f186483e = viewGroup2;
        this.f186484f = zfVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f186482d.findViewById(com.p314xaae8f345.mm.R.id.efr).animate().alpha(1.0f).setDuration(500L).start();
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_FEED_LIKE_ANIM_GUIDE_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        uc2.c cVar;
        tc2.g gVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5;
        android.content.Context context;
        zy2.ra Sj;
        android.view.View findViewById = this.f186483e.findViewById(com.p314xaae8f345.mm.R.id.efr);
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert$showLikeAnim$1$1$invoke$$inlined$addListener$default$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            findViewById.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert$showLikeAnim$1$1$invoke$$inlined$addListener$default$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zf zfVar = this.f186484f;
        in5.s0 s0Var = zfVar.f185908z;
        if (s0Var == null || (cVar = (uc2.c) zfVar.f186384e.a(s0Var, uc2.c.class)) == null || (abstractC14490x69736cb5 = (gVar = ((bg2.j1) cVar).f498674d).f498681h) == null) {
            return;
        }
        in5.s0 s0Var2 = gVar.f498682i;
        r45.qt2 V6 = (s0Var2 == null || (context = s0Var2.f374654e) == null || (Sj = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Sj(context)) == null) ? null : ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) Sj).V6();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v3 v3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v3.f184154a;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("feedActionType", 87);
        jSONObject.put("feedActionSubType", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.c4.f34473x366c91de);
        linkedList.add(jSONObject.toString());
        v3Var.b(V6, abstractC14490x69736cb5, linkedList);
        ml2.u1 u1Var = ml2.u1.f409587i3;
        jz5.l[] lVarArr = new jz5.l[1];
        r45.nw1 m59258xd0557130 = abstractC14490x69736cb5.getFeedObject().m59258xd0557130();
        lVarArr[0] = new jz5.l("liveid", pm0.v.u(m59258xd0557130 != null ? m59258xd0557130.m75942xfb822ef2(0) : 0L));
        v3Var.c(V6, u1Var, kz5.c1.i(lVarArr));
    }
}
