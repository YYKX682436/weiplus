package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public abstract class x0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Iterator f173899a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.t0();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f173900b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f173901c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final ik1.x f173902d = new ik1.x();

    /* renamed from: e, reason: collision with root package name */
    public static final ik1.x f173903e = new ik1.x();

    public static void a(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v0 v0Var) {
        if (android.text.TextUtils.isEmpty(str) || v0Var == null) {
            return;
        }
        f173902d.e(str, v0Var);
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.u0 b(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.u0 u0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.u0) ((java.util.HashMap) f173900b).get(str);
        return u0Var == null ? com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.u0.INIT : u0Var;
    }

    public static java.util.Iterator c(java.lang.String str) {
        java.util.Set d17 = f173902d.d(str);
        return d17 != null ? d17.iterator() : f173899a;
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w0 d(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w0 w0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w0) ((java.util.HashMap) f173901c).get(str);
        return w0Var == null ? com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w0.HIDE : w0Var;
    }

    public static void e(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v0 v0Var) {
        if (v0Var == null || android.text.TextUtils.isEmpty(str)) {
            return;
        }
        f173902d.f(str, v0Var);
    }

    public static void f(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.u0 u0Var) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        ((java.util.HashMap) f173900b).put(str, u0Var);
    }

    public static void g(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w0 w0Var) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandLifeCycle", "setPauseType, appId: %s, type: %s", str, w0Var);
        ((java.util.HashMap) f173901c).put(str, w0Var);
    }
}
