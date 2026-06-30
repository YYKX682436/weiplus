package hc2;

/* loaded from: classes2.dex */
public abstract class v {
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0177, code lost:
    
        if ((r2 != null && r2.getIsHistoryFeed()) == false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00e0, code lost:
    
        if ((r10 != null && r10.getIsHistoryFeed()) == false) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:159:0x017e A[Catch: all -> 0x01ef, TRY_LEAVE, TryCatch #1 {, blocks: (B:133:0x012e, B:134:0x0137, B:136:0x013d, B:138:0x014a, B:140:0x0150, B:142:0x0156, B:144:0x015c, B:147:0x0164, B:149:0x0168, B:151:0x016e, B:159:0x017e), top: B:132:0x012e }] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0181 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00a0 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List a(int r16, r45.qt2 r17, int r18, boolean r19, boolean r20, boolean r21, int r22, int r23, java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hc2.v.a(int, r45.qt2, int, boolean, boolean, boolean, int, int, java.lang.Object):java.util.List");
    }

    public static final java.util.List b(java.util.List cacheDataList, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cacheDataList, "cacheDataList");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.u.f435469a.e(c61.l7.class).a(ey2.i2.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        ey2.i2 i2Var = (ey2.i2) a17;
        int i18 = 0;
        for (java.lang.Object obj : cacheDataList) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) obj;
            if (i18 >= 2) {
                if (bu2.j.f106067a.i(i17, abstractC14490x69736cb5.getFeedObject().f66939xc8a07680)) {
                    break;
                }
                if (abstractC14490x69736cb5.getFeedObject().f66939xc8a07680 != 0 && !i2Var.P6(i17, abstractC14490x69736cb5.getFeedObject().f66939xc8a07680)) {
                    arrayList.add(abstractC14490x69736cb5);
                }
            }
            i18 = i19;
        }
        return arrayList;
    }
}
