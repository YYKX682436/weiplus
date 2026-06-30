package com.p314xaae8f345.mm.ui.p2731xc84c5534;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class j {

    /* renamed from: e, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.ui.p2731xc84c5534.i f291206e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Map f291207f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.ui.p2731xc84c5534.j f291208g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ com.p314xaae8f345.mm.ui.p2731xc84c5534.j[] f291209h;

    /* renamed from: d, reason: collision with root package name */
    public final int f291210d;

    static {
        com.p314xaae8f345.mm.ui.p2731xc84c5534.j jVar = new com.p314xaae8f345.mm.ui.p2731xc84c5534.j("SOURCE_OTHER", 0, 0);
        f291208g = jVar;
        com.p314xaae8f345.mm.ui.p2731xc84c5534.j[] jVarArr = {jVar, new com.p314xaae8f345.mm.ui.p2731xc84c5534.j("SOURCE_CHATTING", 1, 1), new com.p314xaae8f345.mm.ui.p2731xc84c5534.j("SOURCE_MID_PAGE", 2, 2), new com.p314xaae8f345.mm.ui.p2731xc84c5534.j("SOURCE_PREVIEW", 3, 3)};
        f291209h = jVarArr;
        java.util.List a17 = rz5.b.a(jVarArr);
        f291206e = new com.p314xaae8f345.mm.ui.p2731xc84c5534.i(null);
        int d17 = kz5.b1.d(kz5.d0.q(a17, 10));
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(d17 < 16 ? 16 : d17);
        kz5.e eVar = new kz5.e((kz5.h) a17);
        while (eVar.hasNext()) {
            java.lang.Object next = eVar.next();
            linkedHashMap.put(java.lang.Integer.valueOf(((com.p314xaae8f345.mm.ui.p2731xc84c5534.j) next).f291210d), next);
        }
        f291207f = linkedHashMap;
    }

    public j(java.lang.String str, int i17, int i18) {
        this.f291210d = i18;
    }

    /* renamed from: valueOf */
    public static com.p314xaae8f345.mm.ui.p2731xc84c5534.j m80925xdce0328(java.lang.String str) {
        return (com.p314xaae8f345.mm.ui.p2731xc84c5534.j) java.lang.Enum.valueOf(com.p314xaae8f345.mm.ui.p2731xc84c5534.j.class, str);
    }

    /* renamed from: values */
    public static com.p314xaae8f345.mm.ui.p2731xc84c5534.j[] m80926xcee59d22() {
        return (com.p314xaae8f345.mm.ui.p2731xc84c5534.j[]) f291209h.clone();
    }
}
