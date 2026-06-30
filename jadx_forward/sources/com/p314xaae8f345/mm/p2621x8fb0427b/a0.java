package com.p314xaae8f345.mm.p2621x8fb0427b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class a0 {

    /* renamed from: e, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p2621x8fb0427b.z f275239e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Map f275240f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p2621x8fb0427b.a0 f275241g;

    /* renamed from: h, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p2621x8fb0427b.a0 f275242h;

    /* renamed from: i, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p2621x8fb0427b.a0 f275243i;

    /* renamed from: m, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p2621x8fb0427b.a0 f275244m;

    /* renamed from: n, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p2621x8fb0427b.a0 f275245n;

    /* renamed from: o, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p2621x8fb0427b.a0 f275246o;

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.a0[] f275247p;

    /* renamed from: d, reason: collision with root package name */
    public final int f275248d;

    static {
        com.p314xaae8f345.mm.p2621x8fb0427b.a0 a0Var = new com.p314xaae8f345.mm.p2621x8fb0427b.a0("NEW_CHAT_MESSAGE", 0, 0);
        f275241g = a0Var;
        com.p314xaae8f345.mm.p2621x8fb0427b.a0 a0Var2 = new com.p314xaae8f345.mm.p2621x8fb0427b.a0("NEW_NON_CHAT_MESSAGE", 1, 1);
        f275242h = a0Var2;
        com.p314xaae8f345.mm.p2621x8fb0427b.a0 a0Var3 = new com.p314xaae8f345.mm.p2621x8fb0427b.a0("NEW_OFFICIAL_ACCOUNT_MESSAGE", 2, 2);
        f275243i = a0Var3;
        com.p314xaae8f345.mm.p2621x8fb0427b.a0 a0Var4 = new com.p314xaae8f345.mm.p2621x8fb0427b.a0("OFFICIAL_ACCOUNT_TOP_BOX", 3, 3);
        f275244m = a0Var4;
        com.p314xaae8f345.mm.p2621x8fb0427b.a0 a0Var5 = new com.p314xaae8f345.mm.p2621x8fb0427b.a0("DELETE_BOX", 4, 4);
        f275245n = a0Var5;
        com.p314xaae8f345.mm.p2621x8fb0427b.a0 a0Var6 = new com.p314xaae8f345.mm.p2621x8fb0427b.a0("OTHER", 5, 5);
        f275246o = a0Var6;
        com.p314xaae8f345.mm.p2621x8fb0427b.a0[] a0VarArr = {a0Var, a0Var2, a0Var3, a0Var4, a0Var5, a0Var6};
        f275247p = a0VarArr;
        java.util.List a17 = rz5.b.a(a0VarArr);
        f275239e = new com.p314xaae8f345.mm.p2621x8fb0427b.z(null);
        int d17 = kz5.b1.d(kz5.d0.q(a17, 10));
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(d17 < 16 ? 16 : d17);
        kz5.e eVar = new kz5.e((kz5.h) a17);
        while (eVar.hasNext()) {
            java.lang.Object next = eVar.next();
            linkedHashMap.put(java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p2621x8fb0427b.a0) next).f275248d), next);
        }
        f275240f = linkedHashMap;
    }

    public a0(java.lang.String str, int i17, int i18) {
        this.f275248d = i18;
    }

    /* renamed from: valueOf */
    public static com.p314xaae8f345.mm.p2621x8fb0427b.a0 m77937xdce0328(java.lang.String str) {
        return (com.p314xaae8f345.mm.p2621x8fb0427b.a0) java.lang.Enum.valueOf(com.p314xaae8f345.mm.p2621x8fb0427b.a0.class, str);
    }

    /* renamed from: values */
    public static com.p314xaae8f345.mm.p2621x8fb0427b.a0[] m77938xcee59d22() {
        return (com.p314xaae8f345.mm.p2621x8fb0427b.a0[]) f275247p.clone();
    }
}
