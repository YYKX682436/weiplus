package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002;

/* loaded from: classes3.dex */
public final class m2 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.m2 f197161a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.m2();

    /* renamed from: b, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.c3 f197162b;

    /* renamed from: c, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.j f197163c;

    public final void a(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.b3 b3Var) {
        if (b3Var == null) {
            return;
        }
        b3Var.f196982b.f197116b = i17;
        if (b3Var.f196981a) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.a aVar = b3Var.f196983c;
            if (aVar != null) {
                int i18 = aVar.f196968c;
                if (i18 < Integer.MAX_VALUE) {
                    long j17 = aVar.f196967b;
                    long j18 = i17;
                    if (j17 + j18 < com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697) {
                        int i19 = i18 + 1;
                        aVar.f196968c = i19;
                        long j19 = j17 + j18;
                        aVar.f196967b = j19;
                        aVar.f196969d = j19 / i19;
                    }
                }
                b3Var.f196981a = false;
            }
            java.util.ArrayList<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.k> arrayList = b3Var.f196984d;
            if (arrayList != null) {
                for (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.k kVar : arrayList) {
                    if (i17 < kVar.f197116b) {
                        int i27 = kVar.f197117c;
                        if (i27 < Integer.MAX_VALUE) {
                            kVar.f197117c = i27 + 1;
                            return;
                        } else {
                            b3Var.f196981a = false;
                            return;
                        }
                    }
                }
            }
        }
    }
}
