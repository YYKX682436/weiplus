package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e;

/* loaded from: classes2.dex */
public final class d extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f202448a;

    /* renamed from: b, reason: collision with root package name */
    public java.util.List f202449b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(java.util.List respList) {
        super(0, 0, null, 7, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(respList, "respList");
        this.f202448a = respList;
    }

    /* renamed from: toString */
    public java.lang.String m58221x9616526c() {
        java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.c> list = this.f202448a;
        if (list.isEmpty()) {
            return "NULL";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.c cVar : list) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(cVar);
            sb7.append('\n');
            sb6.append(sb7.toString());
        }
        java.lang.String sb8 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(sb8);
        return sb8;
    }
}
