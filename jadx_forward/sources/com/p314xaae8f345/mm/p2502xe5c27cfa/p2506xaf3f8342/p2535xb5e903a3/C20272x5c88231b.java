package com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/repairer/config/global/RepairerConfigGlobalStorageCleanConfirmEnhance;", "Lq55/f;", "<init>", "()V", "libcompatible_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.repairer.config.global.RepairerConfigGlobalStorageCleanConfirmEnhance */
/* loaded from: classes3.dex */
public final class C20272x5c88231b extends q55.f {

    /* renamed from: a, reason: collision with root package name */
    public static final int f273750a;

    static {
        int i17;
        if (z65.c.a()) {
            i17 = 1;
        } else {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            i17 = 0;
        }
        f273750a = i17;
    }

    @Override // q55.h
    public java.lang.String b() {
        return "RepairerConfig_GlobalStorageCleanConfirmEnhance_Int";
    }

    @Override // q55.h
    public java.lang.String c() {
        return "强化执行清理任务前的确认(开启: >=1)";
    }

    @Override // q55.h
    public int d() {
        return 5;
    }

    @Override // q55.h
    public java.lang.Class e() {
        return com.p314xaae8f345.mm.p2502xe5c27cfa.p2587x5e0f67f.C20923x4649c536.class;
    }

    @Override // q55.f, q55.e
    public java.lang.String h() {
        return "Int";
    }

    @Override // q55.e
    public java.lang.Object i() {
        return java.lang.Integer.valueOf(f273750a);
    }

    @Override // q55.e
    public java.lang.String k() {
        return "clicfg_clean_enhance_clean_confirm";
    }
}
