package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes9.dex */
public final class hg implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18672xb885c992 f255498d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mj4.h f255499e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f255500f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f255501g;

    public hg(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18672xb885c992 activityC18672xb885c992, mj4.h hVar, android.view.ViewGroup viewGroup, java.lang.String str) {
        this.f255498d = activityC18672xb885c992;
        this.f255499e = hVar;
        this.f255500f = viewGroup;
        this.f255501g = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Long valueOf;
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18672xb885c992 activityC18672xb885c992 = this.f255498d;
        int i17 = activityC18672xb885c992.f255231e;
        android.view.ViewGroup viewGroup = this.f255500f;
        mj4.h hVar = this.f255499e;
        if (i17 != 1) {
            if (i17 != 2) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.bc bcVar = com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18646xfde55447.f255159i;
            android.content.Context context = viewGroup.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            bcVar.a(context, ((mj4.k) hVar).l());
            return;
        }
        boolean w17 = ((mj4.k) hVar).w();
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.gg ggVar = com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18672xb885c992.f255226f;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18672xb885c992.f255229i)) {
            valueOf = 0L;
        } else {
            java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18672xb885c992.f255229i;
            valueOf = str != null ? java.lang.Long.valueOf(java.lang.Long.parseLong(str)) : null;
        }
        java.lang.Long l17 = valueOf;
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.i5 i5Var = com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18628xf43ab4a1.f255034d;
        android.content.Context context2 = viewGroup.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.i5.a(i5Var, context2, activityC18672xb885c992.f255231e, this.f255501g, ((mj4.k) hVar).l(), java.lang.Boolean.valueOf(w17), l17, 11, 0, 128, null);
    }
}
