package com.p314xaae8f345.mm.p2621x8fb0427b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class d0 {

    /* renamed from: e, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p2621x8fb0427b.c0 f275359e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Map f275360f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p2621x8fb0427b.d0 f275361g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.d0[] f275362h;

    /* renamed from: d, reason: collision with root package name */
    public final int f275363d;

    static {
        com.p314xaae8f345.mm.p2621x8fb0427b.d0 d0Var = new com.p314xaae8f345.mm.p2621x8fb0427b.d0("REDDOT_EXIST_TO_NONE", 0, 0);
        com.p314xaae8f345.mm.p2621x8fb0427b.d0 d0Var2 = new com.p314xaae8f345.mm.p2621x8fb0427b.d0("REDDOT_NONE_TO_EXIST", 1, 1);
        f275361g = d0Var2;
        com.p314xaae8f345.mm.p2621x8fb0427b.d0[] d0VarArr = {d0Var, d0Var2};
        f275362h = d0VarArr;
        java.util.List a17 = rz5.b.a(d0VarArr);
        f275359e = new com.p314xaae8f345.mm.p2621x8fb0427b.c0(null);
        int d17 = kz5.b1.d(kz5.d0.q(a17, 10));
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(d17 < 16 ? 16 : d17);
        kz5.e eVar = new kz5.e((kz5.h) a17);
        while (eVar.hasNext()) {
            java.lang.Object next = eVar.next();
            linkedHashMap.put(java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p2621x8fb0427b.d0) next).f275363d), next);
        }
        f275360f = linkedHashMap;
    }

    public d0(java.lang.String str, int i17, int i18) {
        this.f275363d = i18;
    }

    /* renamed from: valueOf */
    public static com.p314xaae8f345.mm.p2621x8fb0427b.d0 m77966xdce0328(java.lang.String str) {
        return (com.p314xaae8f345.mm.p2621x8fb0427b.d0) java.lang.Enum.valueOf(com.p314xaae8f345.mm.p2621x8fb0427b.d0.class, str);
    }

    /* renamed from: values */
    public static com.p314xaae8f345.mm.p2621x8fb0427b.d0[] m77967xcee59d22() {
        return (com.p314xaae8f345.mm.p2621x8fb0427b.d0[]) f275362h.clone();
    }
}
