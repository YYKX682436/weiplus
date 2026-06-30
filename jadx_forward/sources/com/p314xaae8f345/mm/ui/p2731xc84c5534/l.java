package com.p314xaae8f345.mm.ui.p2731xc84c5534;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes12.dex */
public final class l {

    /* renamed from: e, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.ui.p2731xc84c5534.k f291217e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Map f291218f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.ui.p2731xc84c5534.l f291219g;

    /* renamed from: h, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.ui.p2731xc84c5534.l f291220h;

    /* renamed from: i, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.ui.p2731xc84c5534.l f291221i;

    /* renamed from: m, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.ui.p2731xc84c5534.l f291222m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ com.p314xaae8f345.mm.ui.p2731xc84c5534.l[] f291223n;

    /* renamed from: d, reason: collision with root package name */
    public final int f291224d;

    static {
        com.p314xaae8f345.mm.ui.p2731xc84c5534.l lVar = new com.p314xaae8f345.mm.ui.p2731xc84c5534.l("FILE_DOWNLOAD_UNKNOWN", 0, 0);
        f291219g = lVar;
        com.p314xaae8f345.mm.ui.p2731xc84c5534.l lVar2 = new com.p314xaae8f345.mm.ui.p2731xc84c5534.l("FILE_DOWNLOAD_START", 1, 1);
        f291220h = lVar2;
        com.p314xaae8f345.mm.ui.p2731xc84c5534.l lVar3 = new com.p314xaae8f345.mm.ui.p2731xc84c5534.l("FILE_DOWNLOAD_PAUSE", 2, 2);
        f291221i = lVar3;
        com.p314xaae8f345.mm.ui.p2731xc84c5534.l lVar4 = new com.p314xaae8f345.mm.ui.p2731xc84c5534.l("FILE_DOWNLOAD_CONTINUE", 3, 3);
        f291222m = lVar4;
        com.p314xaae8f345.mm.ui.p2731xc84c5534.l[] lVarArr = {lVar, lVar2, lVar3, lVar4};
        f291223n = lVarArr;
        java.util.List a17 = rz5.b.a(lVarArr);
        f291217e = new com.p314xaae8f345.mm.ui.p2731xc84c5534.k(null);
        int d17 = kz5.b1.d(kz5.d0.q(a17, 10));
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(d17 < 16 ? 16 : d17);
        kz5.e eVar = new kz5.e((kz5.h) a17);
        while (eVar.hasNext()) {
            java.lang.Object next = eVar.next();
            linkedHashMap.put(java.lang.Integer.valueOf(((com.p314xaae8f345.mm.ui.p2731xc84c5534.l) next).f291224d), next);
        }
        f291218f = linkedHashMap;
    }

    public l(java.lang.String str, int i17, int i18) {
        this.f291224d = i18;
    }

    /* renamed from: valueOf */
    public static com.p314xaae8f345.mm.ui.p2731xc84c5534.l m80931xdce0328(java.lang.String str) {
        return (com.p314xaae8f345.mm.ui.p2731xc84c5534.l) java.lang.Enum.valueOf(com.p314xaae8f345.mm.ui.p2731xc84c5534.l.class, str);
    }

    /* renamed from: values */
    public static com.p314xaae8f345.mm.ui.p2731xc84c5534.l[] m80932xcee59d22() {
        return (com.p314xaae8f345.mm.ui.p2731xc84c5534.l[]) f291223n.clone();
    }
}
