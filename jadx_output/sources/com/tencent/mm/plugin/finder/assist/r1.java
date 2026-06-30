package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes2.dex */
public final class r1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.assist.r1 f102493a = new com.tencent.mm.plugin.finder.assist.r1();

    /* renamed from: b, reason: collision with root package name */
    public static final int f102494b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f102495c;

    static {
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        f102494b = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f128021x9).getValue()).r()).intValue();
        f102495c = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f128039y9).getValue()).r()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [kz5.p0] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Iterable] */
    public final boolean a(int i17, java.lang.Long l17) {
        int intValue;
        ?? r66;
        java.lang.Object obj;
        r45.ib4 b17 = b();
        if (b17 == null) {
            return true;
        }
        boolean contains = ((java.util.ArrayList) com.tencent.mm.plugin.finder.storage.t70.Vd).contains(java.lang.Integer.valueOf(i17));
        com.tencent.mm.plugin.finder.assist.r1 r1Var = f102493a;
        if (contains) {
            intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Sd).getValue()).r()).intValue();
            java.util.LinkedList carouselData = b17.f376901d;
            kotlin.jvm.internal.o.f(carouselData, "carouselData");
            r66 = new java.util.ArrayList();
            for (java.lang.Object obj2 : carouselData) {
                if (((java.util.ArrayList) com.tencent.mm.plugin.finder.storage.t70.Vd).contains(java.lang.Integer.valueOf(((r45.hb4) obj2).f376005e))) {
                    r66.add(obj2);
                }
            }
        } else if (c(i17)) {
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.X7).getValue()).r()).intValue();
            java.util.LinkedList carouselData2 = b17.f376901d;
            kotlin.jvm.internal.o.f(carouselData2, "carouselData");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj3 : carouselData2) {
                if (r1Var.c(((r45.hb4) obj3).f376005e)) {
                    arrayList.add(obj3);
                }
            }
            r66 = arrayList;
        } else {
            com.tencent.mars.xlog.Log.e("FinderCarouselStrategy", "Unhandled new jump carousel business type:" + i17 + ". Use music desc carousel quota.");
            com.tencent.mm.plugin.finder.storage.t70 t70Var2 = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.X7).getValue()).r()).intValue();
            r66 = kz5.p0.f313996d;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(r66, 10));
        for (r45.hb4 hb4Var : r66) {
            long c17 = c01.id.c();
            java.util.LinkedList showTimestamps = hb4Var.f376006f;
            kotlin.jvm.internal.o.f(showTimestamps, "showTimestamps");
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (java.lang.Object obj4 : showTimestamps) {
                java.lang.Long l18 = (java.lang.Long) obj4;
                kotlin.jvm.internal.o.d(l18);
                if (((double) (c17 - l18.longValue())) / 1000.0d <= 86400.0d) {
                    arrayList3.add(obj4);
                }
            }
            arrayList2.add(java.lang.Integer.valueOf(arrayList3.size()));
        }
        java.util.Iterator it = arrayList2.iterator();
        int i18 = 0;
        while (it.hasNext()) {
            i18 += ((java.lang.Number) it.next()).intValue();
        }
        if (i18 >= intValue) {
            com.tencent.mars.xlog.Log.i("FinderCarouselStrategy", "today show count exceed. showCountDayLimit=" + intValue + ", todayShowCount=" + i18);
            return false;
        }
        java.util.LinkedList carouselData3 = b17.f376901d;
        kotlin.jvm.internal.o.f(carouselData3, "carouselData");
        java.util.Iterator it6 = carouselData3.iterator();
        while (true) {
            if (!it6.hasNext()) {
                obj = null;
                break;
            }
            obj = it6.next();
            if (l17 != null && ((r45.hb4) obj).f376004d == l17.longValue()) {
                break;
            }
        }
        r45.hb4 hb4Var2 = (r45.hb4) obj;
        if (hb4Var2 == null) {
            return true;
        }
        int intValue2 = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Y7).getValue()).r()).intValue();
        long c18 = c01.id.c();
        java.util.LinkedList showTimestamps2 = hb4Var2.f376006f;
        kotlin.jvm.internal.o.f(showTimestamps2, "showTimestamps");
        java.util.Iterator it7 = showTimestamps2.iterator();
        if (!it7.hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        java.lang.Comparable comparable = (java.lang.Comparable) it7.next();
        while (it7.hasNext()) {
            java.lang.Comparable comparable2 = (java.lang.Comparable) it7.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        java.lang.Long l19 = (java.lang.Long) comparable;
        long longValue = (c18 - (l19 == null ? 0L : l19.longValue())) / 1000;
        long j17 = 60;
        return (longValue / j17) / j17 >= ((long) intValue2);
    }

    public final r45.ib4 b() {
        java.lang.String v17 = gm0.j1.u().c().v(com.tencent.mm.storage.u3.USERINFO_FINDER_CAROUSEL_DATA_LIST_STRING_SYNC, "");
        kotlin.jvm.internal.o.d(v17);
        if (!(v17.length() > 0)) {
            return null;
        }
        try {
            r45.ib4 ib4Var = new r45.ib4();
            ib4Var.parseFrom(com.tencent.mm.sdk.platformtools.t8.h(v17));
            return ib4Var;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("FinderCarouselStrategy", th6.getMessage());
            return null;
        }
    }

    public final boolean c(int i17) {
        return i17 == 18 || i17 == 21 || i17 == 61;
    }

    public final void d(int i17, long j17) {
        java.lang.Object obj;
        r45.ib4 b17 = b();
        if (b17 == null) {
            b17 = new r45.ib4();
        }
        java.util.LinkedList carouselData = b17.f376901d;
        kotlin.jvm.internal.o.f(carouselData, "carouselData");
        java.util.Iterator it = carouselData.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((r45.hb4) obj).f376004d == j17) {
                    break;
                }
            }
        }
        r45.hb4 hb4Var = (r45.hb4) obj;
        if (hb4Var == null) {
            hb4Var = new r45.hb4();
            hb4Var.f376004d = j17;
            hb4Var.f376005e = i17;
        }
        hb4Var.f376006f.add(java.lang.Long.valueOf(c01.id.c()));
        java.util.LinkedList carouselData2 = b17.f376901d;
        kotlin.jvm.internal.o.f(carouselData2, "carouselData");
        kz5.h0.B(carouselData2, new com.tencent.mm.plugin.finder.assist.q1(j17));
        b17.f376901d.add(hb4Var);
        java.util.Objects.toString(hb4Var.f376006f);
        if (b17.f376901d.size() > 50) {
            java.util.LinkedList carouselData3 = b17.f376901d;
            kotlin.jvm.internal.o.f(carouselData3, "carouselData");
            b17.f376901d = new java.util.LinkedList(kz5.n0.L0(carouselData3, 50));
        }
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_CAROUSEL_DATA_LIST_STRING_SYNC, com.tencent.mm.sdk.platformtools.t8.l(b17.toByteArray()));
    }
}
