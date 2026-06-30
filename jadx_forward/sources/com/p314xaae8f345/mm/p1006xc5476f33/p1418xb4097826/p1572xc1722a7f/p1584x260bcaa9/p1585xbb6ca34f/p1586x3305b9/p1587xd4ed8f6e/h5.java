package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e;

/* loaded from: classes2.dex */
public final class h5 extends xp2.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f203247d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.a5 f203248e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.t5 f203249f;

    public h5(in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.a5 a5Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.t5 t5Var) {
        this.f203247d = s0Var;
        this.f203248e = a5Var;
        this.f203249f = t5Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        in5.s0 s0Var = this.f203247d;
        android.content.Context context = s0Var.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        if (a(activity, context)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.SpecialColumnListConvert", "#lifeCallback-onActivityDestroyed autoPlayManager=" + this.f203248e.f203109d);
            this.f203249f.p(s0Var);
        }
    }

    @Override // xp2.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        android.content.Context context = this.f203247d.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        if (a(activity, context)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#lifeCallback-onActivityStopped autoPlayManager=");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.a5 a5Var = this.f203248e;
            sb6.append(a5Var.f203109d);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.SpecialColumnListConvert", sb6.toString());
            gp2.l0 l0Var = a5Var.f203109d;
            if (l0Var != null) {
                l0Var.m();
            }
            gp2.l0 l0Var2 = a5Var.f203109d;
            if (l0Var2 != null) {
                c50.m0.c(l0Var2, null, 1, null);
            }
        }
    }

    @Override // xp2.a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        android.content.Context context = this.f203247d.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        if (a(activity, context)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#lifeCallback-onActivityStarted autoPlayManager=");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.a5 a5Var = this.f203248e;
            sb6.append(a5Var.f203109d);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.SpecialColumnListConvert", sb6.toString());
            gp2.l0 l0Var = a5Var.f203109d;
            if (l0Var == null || l0Var.f355793s) {
                return;
            }
            l0Var.g();
        }
    }
}
