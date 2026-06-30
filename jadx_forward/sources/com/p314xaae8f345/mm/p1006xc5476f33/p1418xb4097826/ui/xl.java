package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes.dex */
public final class xl implements db5.d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.HashSet f211564a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lb2.j f211565b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f211566c;

    public xl(java.util.HashSet hashSet, lb2.j jVar, in5.s0 s0Var) {
        this.f211564a = hashSet;
        this.f211565b = jVar;
        this.f211566c = s0Var;
    }

    @Override // db5.d1
    public final void a(int i17, int i18) {
        in5.s0 s0Var = this.f211566c;
        lb2.j jVar = this.f211565b;
        java.util.HashSet hashSet = this.f211564a;
        if (i18 == -1) {
            hashSet.remove(jVar.f399282d);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("finder_debug_settings_fav").putStringSet("fav_1", hashSet);
            db5.t7.m123883x26a183b(s0Var.f374654e, "已取消收藏", 0).show();
        } else {
            if (i18 != 1) {
                return;
            }
            hashSet.add(jVar.f399282d);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("finder_debug_settings_fav").putStringSet("fav_1", hashSet);
            db5.t7.m123883x26a183b(s0Var.f374654e, "已收藏", 0).show();
        }
    }
}
