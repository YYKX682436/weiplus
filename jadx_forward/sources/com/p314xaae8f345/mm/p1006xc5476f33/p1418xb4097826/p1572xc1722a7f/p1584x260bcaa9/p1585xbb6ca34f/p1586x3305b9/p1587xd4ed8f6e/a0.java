package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e;

/* loaded from: classes2.dex */
public final class a0 extends xp2.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f203092d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.x f203093e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.m0 f203094f;

    public a0(in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.x xVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.m0 m0Var) {
        this.f203092d = s0Var;
        this.f203093e = xVar;
        this.f203094f = m0Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        in5.s0 s0Var = this.f203092d;
        android.content.Context context = s0Var.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        if (a(activity, context)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BigBannerListConvert", "#lifeCallback-onActivityDestroyed autoPlayManager=" + this.f203093e.f203549f);
            this.f203094f.o(s0Var);
        }
    }

    @Override // xp2.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        android.content.Context context = this.f203092d.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        if (a(activity, context)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#lifeCallback-onActivityStopped autoPlayManager=");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.x xVar = this.f203093e;
            sb6.append(xVar.f203549f);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BigBannerListConvert", sb6.toString());
            gp2.l0 l0Var = xVar.f203549f;
            if (l0Var != null) {
                l0Var.m();
            }
            gp2.l0 l0Var2 = xVar.f203549f;
            if (l0Var2 != null) {
                c50.m0.c(l0Var2, null, 1, null);
            }
        }
    }

    @Override // xp2.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        android.content.Context context = this.f203092d.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        if (a(activity, context)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#lifeCallback-onActivityStarted autoPlayManager=");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.x xVar = this.f203093e;
            sb6.append(xVar.f203549f);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BigBannerListConvert", sb6.toString());
            gp2.l0 l0Var = xVar.f203549f;
            if (l0Var == null || l0Var.f355793s) {
                return;
            }
            l0Var.g();
        }
    }
}
