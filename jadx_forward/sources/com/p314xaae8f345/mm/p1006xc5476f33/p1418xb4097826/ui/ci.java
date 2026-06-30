package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes.dex */
public final class ci {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ci f210527a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ci();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f210528b = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.bi.f210487d);

    public final java.util.List a() {
        java.lang.String string = ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) f210528b).mo141623x754a37bb()).getString("recent_v1", null);
        kz5.p0 p0Var = kz5.p0.f395529d;
        if (string == null) {
            return p0Var;
        }
        if (string.length() == 0) {
            return p0Var;
        }
        java.util.List f07 = r26.n0.f0(string, new java.lang.String[]{"\n"}, false, 0, 6, null);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : f07) {
            if (((java.lang.String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
