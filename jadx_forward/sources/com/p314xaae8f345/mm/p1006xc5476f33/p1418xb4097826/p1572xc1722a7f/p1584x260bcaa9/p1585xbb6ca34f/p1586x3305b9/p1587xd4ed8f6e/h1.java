package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e;

/* loaded from: classes2.dex */
public final class h1 extends xp2.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f203237d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.p1 f203238e;

    public h1(in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.p1 p1Var) {
        this.f203237d = s0Var;
        this.f203238e = p1Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        in5.s0 s0Var = this.f203237d;
        android.content.Context context = s0Var.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        if (a(activity, context)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.HeadLivingListConvert", "#lifeCallback-onActivityDestroyed");
            this.f203238e.o(s0Var);
        }
    }
}
