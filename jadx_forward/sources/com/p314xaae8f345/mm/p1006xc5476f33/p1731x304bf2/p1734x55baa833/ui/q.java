package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.ui;

/* loaded from: classes5.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.ui.q f220388a = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.ui.q();

    public static final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.ui.q qVar, w33.b bVar, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.ui.t tVar, boolean z17) {
        qVar.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (!bVar.f524238a.isEmpty()) {
            arrayList.addAll(bVar.f524238a);
        }
        jz5.l lVar = bVar.f524239b;
        if (((java.lang.Boolean) lVar.f384366d).booleanValue()) {
            arrayList.addAll((java.util.Collection) lVar.f384367e);
        }
        jz5.l lVar2 = bVar.f524240c;
        if (((java.lang.Boolean) lVar2.f384366d).booleanValue()) {
            arrayList.addAll((java.util.Collection) lVar2.f384367e);
        }
        jz5.l lVar3 = bVar.f524241d;
        if (((java.lang.Boolean) lVar3.f384366d).booleanValue()) {
            arrayList.addAll((java.util.Collection) lVar3.f384367e);
        }
        if (!z17) {
            tVar.x(arrayList);
            return;
        }
        tVar.getClass();
        java.util.List a17 = e43.e.f330894a.a(arrayList);
        java.util.List list = tVar.f220394g;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.h0.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.ui.r(list, a17), true).b(tVar);
        java.util.ArrayList arrayList2 = (java.util.ArrayList) list;
        arrayList2.clear();
        arrayList2.addAll(a17);
    }
}
