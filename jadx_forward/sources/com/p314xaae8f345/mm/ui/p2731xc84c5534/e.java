package com.p314xaae8f345.mm.ui.p2731xc84c5534;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class e {

    /* renamed from: e, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.ui.p2731xc84c5534.d f291161e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Map f291162f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.ui.p2731xc84c5534.e f291163g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ com.p314xaae8f345.mm.ui.p2731xc84c5534.e[] f291164h;

    /* renamed from: d, reason: collision with root package name */
    public final int f291165d;

    static {
        com.p314xaae8f345.mm.ui.p2731xc84c5534.e eVar = new com.p314xaae8f345.mm.ui.p2731xc84c5534.e("STEP_OTHER", 0, 0);
        f291163g = eVar;
        com.p314xaae8f345.mm.ui.p2731xc84c5534.e[] eVarArr = {eVar, new com.p314xaae8f345.mm.ui.p2731xc84c5534.e("STEP_INIT", 1, 1), new com.p314xaae8f345.mm.ui.p2731xc84c5534.e("STEP_FIRST_BUBBLE", 2, 2), new com.p314xaae8f345.mm.ui.p2731xc84c5534.e("STEP_SECOND_BUBBLE", 3, 3)};
        f291164h = eVarArr;
        java.util.List a17 = rz5.b.a(eVarArr);
        f291161e = new com.p314xaae8f345.mm.ui.p2731xc84c5534.d(null);
        int d17 = kz5.b1.d(kz5.d0.q(a17, 10));
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(d17 < 16 ? 16 : d17);
        kz5.e eVar2 = new kz5.e((kz5.h) a17);
        while (eVar2.hasNext()) {
            java.lang.Object next = eVar2.next();
            linkedHashMap.put(java.lang.Integer.valueOf(((com.p314xaae8f345.mm.ui.p2731xc84c5534.e) next).f291165d), next);
        }
        f291162f = linkedHashMap;
    }

    public e(java.lang.String str, int i17, int i18) {
        this.f291165d = i18;
    }

    /* renamed from: valueOf */
    public static com.p314xaae8f345.mm.ui.p2731xc84c5534.e m80905xdce0328(java.lang.String str) {
        return (com.p314xaae8f345.mm.ui.p2731xc84c5534.e) java.lang.Enum.valueOf(com.p314xaae8f345.mm.ui.p2731xc84c5534.e.class, str);
    }

    /* renamed from: values */
    public static com.p314xaae8f345.mm.ui.p2731xc84c5534.e[] m80906xcee59d22() {
        return (com.p314xaae8f345.mm.ui.p2731xc84c5534.e[]) f291164h.clone();
    }
}
