package com.p314xaae8f345.mm.p2621x8fb0427b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class y {

    /* renamed from: e, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p2621x8fb0427b.y f277873e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p2621x8fb0427b.y f277874f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p2621x8fb0427b.y f277875g;

    /* renamed from: h, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p2621x8fb0427b.y f277876h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.y[] f277877i;

    /* renamed from: d, reason: collision with root package name */
    public final int f277878d;

    static {
        com.p314xaae8f345.mm.p2621x8fb0427b.y yVar = new com.p314xaae8f345.mm.p2621x8fb0427b.y("BOX_RED_DOT_NONE_TO_EXIST", 0, 0);
        f277873e = yVar;
        com.p314xaae8f345.mm.p2621x8fb0427b.y yVar2 = new com.p314xaae8f345.mm.p2621x8fb0427b.y("BOX_RED_DOT_EXIST_TO_NONE", 1, 1);
        f277874f = yVar2;
        com.p314xaae8f345.mm.p2621x8fb0427b.y yVar3 = new com.p314xaae8f345.mm.p2621x8fb0427b.y("BOX_POSITION_UP", 2, 2);
        f277875g = yVar3;
        com.p314xaae8f345.mm.p2621x8fb0427b.y yVar4 = new com.p314xaae8f345.mm.p2621x8fb0427b.y("BOX_POSITION_DOWN", 3, 3);
        f277876h = yVar4;
        com.p314xaae8f345.mm.p2621x8fb0427b.y[] yVarArr = {yVar, yVar2, yVar3, yVar4};
        f277877i = yVarArr;
        java.util.List a17 = rz5.b.a(yVarArr);
        int d17 = kz5.b1.d(kz5.d0.q(a17, 10));
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(d17 < 16 ? 16 : d17);
        kz5.e eVar = new kz5.e((kz5.h) a17);
        while (eVar.hasNext()) {
            java.lang.Object next = eVar.next();
            linkedHashMap.put(java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p2621x8fb0427b.y) next).f277878d), next);
        }
    }

    public y(java.lang.String str, int i17, int i18) {
        this.f277878d = i18;
    }

    /* renamed from: valueOf */
    public static com.p314xaae8f345.mm.p2621x8fb0427b.y m78160xdce0328(java.lang.String str) {
        return (com.p314xaae8f345.mm.p2621x8fb0427b.y) java.lang.Enum.valueOf(com.p314xaae8f345.mm.p2621x8fb0427b.y.class, str);
    }

    /* renamed from: values */
    public static com.p314xaae8f345.mm.p2621x8fb0427b.y[] m78161xcee59d22() {
        return (com.p314xaae8f345.mm.p2621x8fb0427b.y[]) f277877i.clone();
    }
}
