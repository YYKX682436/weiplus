package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534;

/* loaded from: classes2.dex */
public final class x4 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x4 f206968a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x4();

    public final void a(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ys cardFeed, int i17, long j17, r45.qt2 qt2Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cardFeed, "cardFeed");
        r45.ww2 ww2Var = cardFeed.f192725d;
        java.util.Iterator it = cardFeed.f192727f.iterator();
        java.lang.String str2 = "";
        int i18 = 0;
        while (true) {
            if (!it.hasNext()) {
                r26.n0.Z(str2, "|");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                java.lang.Object[] objArr = new java.lang.Object[11];
                objArr[0] = qt2Var != null ? java.lang.Integer.valueOf(qt2Var.m75939xb282bd08(5)) : null;
                objArr[1] = pm0.v.u(cardFeed.f192725d.m75942xfb822ef2(14));
                objArr[2] = str;
                objArr[3] = str2;
                objArr[4] = ww2Var.m75945x2fec8307(13);
                objArr[5] = java.lang.Integer.valueOf(cardFeed.f192727f.size());
                objArr[6] = qt2Var != null ? qt2Var.m75945x2fec8307(0) : null;
                objArr[7] = qt2Var != null ? qt2Var.m75945x2fec8307(1) : null;
                objArr[8] = qt2Var != null ? qt2Var.m75945x2fec8307(2) : null;
                objArr[9] = java.lang.Long.valueOf(j17);
                objArr[10] = java.lang.Integer.valueOf(i17);
                g0Var.d(21086, objArr);
                return;
            }
            java.lang.Object next = it.next();
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) next;
            java.lang.String u17 = pm0.v.u(abstractC14490x69736cb5.mo2128x1ed62e84());
            if (abstractC14490x69736cb5.h() == 4 && i18 == 0) {
                str2 = str2 + u17 + ';' + i18 + ";1|";
            } else {
                str2 = str2 + u17 + ';' + i18 + ";0|";
            }
            i18 = i19;
        }
    }

    public final void b(java.lang.String title, long j17, int i17, long j18, r45.qt2 qt2Var, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[9];
        objArr[0] = qt2Var != null ? java.lang.Integer.valueOf(qt2Var.m75939xb282bd08(5)) : null;
        objArr[1] = pm0.v.u(j17);
        objArr[2] = title;
        objArr[3] = java.lang.Integer.valueOf(i17);
        objArr[4] = pm0.v.u(j18);
        objArr[5] = qt2Var != null ? qt2Var.m75945x2fec8307(0) : null;
        objArr[6] = qt2Var != null ? qt2Var.m75945x2fec8307(1) : null;
        objArr[7] = qt2Var != null ? qt2Var.m75945x2fec8307(2) : null;
        objArr[8] = java.lang.Integer.valueOf(i18);
        g0Var.d(21087, objArr);
    }
}
