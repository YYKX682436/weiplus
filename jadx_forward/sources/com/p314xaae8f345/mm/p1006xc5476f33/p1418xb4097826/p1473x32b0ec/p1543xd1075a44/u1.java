package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class u1 {
    public u1(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final java.util.List a(r45.f50 f50Var, java.lang.String myFinderUsername) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(myFinderUsername, "myFinderUsername");
        if (f50Var == null) {
            return kz5.p0.f395529d;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = f50Var.f455550h;
        if (c19782x23db1cfa != null) {
            java.lang.String m76197x6c03c64c = c19782x23db1cfa.m76197x6c03c64c();
            java.lang.String str2 = m76197x6c03c64c == null ? "" : m76197x6c03c64c;
            java.lang.String m76184x8010e5e4 = c19782x23db1cfa.m76184x8010e5e4();
            arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.v1(str2, m76184x8010e5e4 == null ? "" : m76184x8010e5e4, c19782x23db1cfa.m76175x6d346f39(), 0, false));
        }
        if (c19782x23db1cfa == null || (str = c19782x23db1cfa.m76197x6c03c64c()) == null) {
            str = "";
        }
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa> linkedList = f50Var.f455549g;
        if (linkedList != null) {
            for (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa2 : linkedList) {
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c19782x23db1cfa2.m76197x6c03c64c(), str)) {
                    java.lang.String m76197x6c03c64c2 = c19782x23db1cfa2.m76197x6c03c64c();
                    java.lang.String str3 = m76197x6c03c64c2 == null ? "" : m76197x6c03c64c2;
                    java.lang.String m76184x8010e5e42 = c19782x23db1cfa2.m76184x8010e5e4();
                    arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.v1(str3, m76184x8010e5e42 == null ? "" : m76184x8010e5e42, c19782x23db1cfa2.m76175x6d346f39(), 1, true));
                }
            }
        }
        return arrayList;
    }
}
