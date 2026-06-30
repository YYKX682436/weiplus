package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class i5 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.k5 f194448d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f194449e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f194450f;

    public i5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.k5 k5Var, java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        this.f194448d = k5Var;
        this.f194449e = arrayList;
        this.f194450f = arrayList2;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.k5 k5Var = this.f194448d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = k5Var.f194726r;
        if (k0Var != null) {
            k0Var.o(null);
        }
        g4Var.clear();
        java.util.ArrayList arrayList = this.f194449e;
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            java.util.ArrayList arrayList2 = this.f194450f;
            if (i17 == 0) {
                java.lang.Object obj = arrayList2.get(i17);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                ((db5.h4) g4Var.f(((java.lang.Number) obj).intValue(), (java.lang.CharSequence) arrayList.get(i17))).f309906q = k5Var.f446856d.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e_l);
            } else {
                java.lang.Object obj2 = arrayList2.get(i17);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "get(...)");
                g4Var.f(((java.lang.Number) obj2).intValue(), (java.lang.CharSequence) arrayList.get(i17));
            }
        }
    }
}
