package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718;

/* loaded from: classes8.dex */
public final class x6 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.x6 f187528a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.x6();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.List f187529b = kz5.b0.c(new android.util.Pair("FinderRedDotHistoryRecordTable", mi0.a.f408030b));

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f187530c = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.v6.f187460d);

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f187531d = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.w6.f187500d);

    public final java.util.List a() {
        boolean z17;
        try {
            java.util.List<T> m107093xde3eb429 = ((com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae) ((jz5.n) f187531d).mo141623x754a37bb()).m107093xde3eb429();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m107093xde3eb429, "getAllObjects(...)");
            boolean z18 = false;
            if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.o0().r()).booleanValue()) {
                z17 = true;
            } else {
                java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                z17 = false;
            }
            if (z17 || z65.c.a()) {
                z18 = true;
            } else {
                kb2.b bVar = kb2.b.f387758a;
            }
            if (z18) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append("getAll: ");
                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m107093xde3eb429, 10));
                for (T t17 : m107093xde3eb429) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.x6 x6Var = f187528a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(t17);
                    r45.sw3 b17 = x6Var.b(t17);
                    arrayList.add(b17 != null ? com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.qa.e(b17) : null);
                }
                sb6.append(arrayList);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderRedDotHistoryRecordProvider", sb6.toString());
            }
            return m107093xde3eb429;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderRedDotHistoryRecordProvider", "[getAll] e:" + e17.getMessage());
            return kz5.p0.f395529d;
        }
    }

    public final r45.sw3 b(mi0.b bVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bVar, "<this>");
        try {
            if (bVar.f408036c == null) {
                return null;
            }
            r45.sw3 sw3Var = new r45.sw3();
            sw3Var.mo11468x92b714fd(bVar.f408036c);
            return sw3Var;
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("toHistoryRecord", e17.toString());
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(r45.sw3 historyRecord, int i17) {
        mi0.b bVar;
        boolean z17;
        boolean z18;
        boolean z19;
        jz5.g gVar = f187531d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(historyRecord, "historyRecord");
        boolean z27 = false;
        int m75939xb282bd08 = historyRecord.m75939xb282bd08(0);
        try {
            bVar = (mi0.b) ((com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae) ((jz5.n) gVar).mo141623x754a37bb()).m107127x946de4d9(mi0.a.f408031c.eq(m75939xb282bd08));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderRedDotHistoryRecordProvider", "[get] by businessType:" + m75939xb282bd08 + ", e:" + e17.getMessage());
            bVar = null;
        }
        if (bVar == null) {
            bVar = new mi0.b();
            bVar.f408034a = historyRecord.m75939xb282bd08(0);
        }
        bVar.f408035b = i17;
        try {
            bVar.f408036c = historyRecord.mo14344x5f01b1f6();
        } catch (java.io.IOException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderRedDotHistoryRecordProvider", e18.toString());
        }
        try {
            if (bVar.f408034a > 0) {
                if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.o0().r()).booleanValue()) {
                    z18 = true;
                } else {
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                    z18 = false;
                }
                if (z18 || z65.c.a()) {
                    z19 = true;
                } else {
                    kb2.b bVar2 = kb2.b.f387758a;
                    z19 = false;
                }
                if (z19) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("insertOrUpdateHistoryRecord: businessType=");
                    sb6.append(bVar.f408034a);
                    sb6.append(' ');
                    r45.sw3 b17 = b(bVar);
                    sb6.append(b17 != null ? com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.qa.e(b17) : null);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderRedDotHistoryRecordProvider", sb6.toString());
                }
                ((com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae) ((jz5.n) gVar).mo141623x754a37bb()).m107158x7beb81f7(bVar);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderRedDotHistoryRecordProvider", "[insert] invalid, record = " + bVar);
            }
        } catch (java.lang.Exception e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderRedDotHistoryRecordProvider", "[insert] businessType:" + java.lang.Integer.valueOf(bVar.f408034a) + ", e:" + e19.getMessage());
        }
        if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.o0().r()).booleanValue()) {
            z17 = true;
        } else {
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            z17 = false;
        }
        if (z17 || z65.c.a()) {
            z27 = true;
        } else {
            kb2.b bVar3 = kb2.b.f387758a;
        }
        if (z27) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderRedDotHistoryRecordProvider", "update: businessType=" + bVar.f408034a + " updateTime=" + i17 + ' ' + com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.qa.e(historyRecord));
        }
    }
}
