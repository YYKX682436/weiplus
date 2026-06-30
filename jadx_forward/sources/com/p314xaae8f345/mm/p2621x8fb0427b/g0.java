package com.p314xaae8f345.mm.p2621x8fb0427b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class g0 {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.g0[] f275475e;

    /* renamed from: d, reason: collision with root package name */
    public final int f275476d;

    static {
        com.p314xaae8f345.mm.p2621x8fb0427b.g0[] g0VarArr = {new com.p314xaae8f345.mm.p2621x8fb0427b.g0("NOTIFICATION_TIMESTAMP", 0, 1), new com.p314xaae8f345.mm.p2621x8fb0427b.g0("LATEST_MESSAGE", 1, 2), new com.p314xaae8f345.mm.p2621x8fb0427b.g0("SERVER_ASSIGN", 2, 3), new com.p314xaae8f345.mm.p2621x8fb0427b.g0("UNKNOWN", 3, 4)};
        f275475e = g0VarArr;
        java.util.List a17 = rz5.b.a(g0VarArr);
        int d17 = kz5.b1.d(kz5.d0.q(a17, 10));
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(d17 < 16 ? 16 : d17);
        kz5.e eVar = new kz5.e((kz5.h) a17);
        while (eVar.hasNext()) {
            java.lang.Object next = eVar.next();
            linkedHashMap.put(java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p2621x8fb0427b.g0) next).f275476d), next);
        }
    }

    public g0(java.lang.String str, int i17, int i18) {
        this.f275476d = i18;
    }

    /* renamed from: valueOf */
    public static com.p314xaae8f345.mm.p2621x8fb0427b.g0 m78019xdce0328(java.lang.String str) {
        return (com.p314xaae8f345.mm.p2621x8fb0427b.g0) java.lang.Enum.valueOf(com.p314xaae8f345.mm.p2621x8fb0427b.g0.class, str);
    }

    /* renamed from: values */
    public static com.p314xaae8f345.mm.p2621x8fb0427b.g0[] m78020xcee59d22() {
        return (com.p314xaae8f345.mm.p2621x8fb0427b.g0[]) f275475e.clone();
    }
}
