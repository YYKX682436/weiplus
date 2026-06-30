package de5;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f310930b = "";

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f310931c = "";

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.String f310932d = "";

    /* renamed from: e, reason: collision with root package name */
    public static int f310933e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.String f310934f = "";

    /* renamed from: g, reason: collision with root package name */
    public static int f310935g = 1;

    /* renamed from: h, reason: collision with root package name */
    public static long f310936h;

    /* renamed from: i, reason: collision with root package name */
    public static long f310937i;

    /* renamed from: k, reason: collision with root package name */
    public static long f310939k;

    /* renamed from: l, reason: collision with root package name */
    public static boolean f310940l;

    /* renamed from: m, reason: collision with root package name */
    public static boolean f310941m;

    /* renamed from: n, reason: collision with root package name */
    public static int f310942n;

    /* renamed from: a, reason: collision with root package name */
    public static final de5.a f310929a = new de5.a();

    /* renamed from: j, reason: collision with root package name */
    public static final java.util.HashSet f310938j = new java.util.HashSet();

    public static /* synthetic */ void e(de5.a aVar, int i17, int i18, int i19, int i27, java.lang.Object obj) {
        if ((i27 & 2) != 0) {
            i18 = 0;
        }
        if ((i27 & 4) != 0) {
            i19 = 0;
        }
        aVar.d(i17, i18, i19);
    }

    public static void f(de5.a aVar, int i17, int i18, int i19, int i27, int i28, java.lang.Object obj) {
        if ((i28 & 4) != 0) {
            i19 = 0;
        }
        if ((i28 & 8) != 0) {
            i27 = 0;
        }
        aVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiReporter", "reportItemLongClick >> " + i17 + ", " + i18 + ", " + f310933e + ", " + f310935g);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6865xc054f370 a17 = aVar.a();
        a17.f141819f = (long) i17;
        a17.f141821h = (long) i18;
        a17.p(f310934f);
        int i29 = f310933e;
        if (i29 == 1) {
            a17.f141824k = f310935g;
        }
        if (i29 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiReporter", "reportItemLongClick currentTab is 0 to report position>> " + i19 + ", " + i27);
            a17.f141832s = (long) i19;
            a17.f141833t = (long) i27;
        }
        a17.k();
    }

    public final com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6865xc054f370 a() {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6865xc054f370 c6865xc054f370 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6865xc054f370();
        c6865xc054f370.f141817d = c6865xc054f370.b("sessionid", f310930b, true);
        c6865xc054f370.f141818e = c6865xc054f370.b("searchsessionid", f310931c, true);
        c6865xc054f370.f141820g = f310933e;
        return c6865xc054f370;
    }

    public final void b(int i17, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiReporter", "reportEmojiSearch " + i17 + ", " + z17);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6865xc054f370 c6865xc054f370 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6865xc054f370();
        c6865xc054f370.f141819f = (long) i17;
        c6865xc054f370.f141817d = c6865xc054f370.b("sessionid", f310930b, true);
        if (z17) {
            c6865xc054f370.f141834u = 7L;
        } else {
            c6865xc054f370.f141820g = 8L;
        }
        c6865xc054f370.f141821h = 8L;
        c6865xc054f370.p(f310934f);
        c6865xc054f370.k();
    }

    public final void c(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiReporter", "reportFTSLongClickAction >> " + i17 + ", " + f310933e + ", " + f310930b + ", msgType: " + i18);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6865xc054f370 a17 = a();
        a17.f141819f = (long) i17;
        a17.f141821h = (long) i18;
        a17.p(f310934f);
        a17.k();
    }

    public final void d(int i17, int i18, int i19) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiReporter", "reportItemClick >> " + i17 + ", " + f310933e + ", " + f310935g);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6865xc054f370 a17 = a();
        a17.f141819f = 5L;
        a17.f141821h = (long) i17;
        a17.p(f310934f);
        int i27 = f310933e;
        if (i27 == 1) {
            a17.f141824k = f310935g;
        }
        if (i27 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiReporter", "reportItemClick currentTab is 0 to report position>> " + i18 + ", " + i19);
            a17.f141832s = (long) i18;
            a17.f141833t = (long) i19;
        }
        a17.k();
    }

    public final void g(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiReporter", "reportNormalAction >> action: " + i17);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6865xc054f370 a17 = a();
        a17.f141819f = (long) i17;
        if (i17 == 1) {
            a17.f141828o = a17.b(dm.i4.f66875xa013b0d5, f310932d, true);
        } else if (i17 == 6) {
            a17.f141824k = f310935g;
        }
        a17.k();
    }

    public final void h(int i17, int i18, int i19) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiReporter", "reportResultExpose >> " + i17 + ", " + i18 + ", " + f310940l + ", " + f310933e + ", " + f310931c + ", " + f310936h + ", " + f310937i + ", " + i19);
        java.util.HashSet hashSet = f310938j;
        if (hashSet.contains(java.lang.Integer.valueOf(f310933e))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiReporter", f310933e + " is report in " + f310931c);
            return;
        }
        if (f310937i == 0 && f310936h != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiReporter", "firstShowSearchCost is 0");
            f310937i = java.lang.System.currentTimeMillis() - f310936h;
        }
        hashSet.add(java.lang.Integer.valueOf(f310933e));
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6865xc054f370 a17 = a();
        a17.f141819f = 7L;
        boolean z17 = f310940l;
        a17.f141825l = (z17 || f310941m) ? 1L : 2L;
        a17.f141826m = (z17 || f310941m) ? 1L : 2L;
        a17.f141827n = i17;
        a17.f141830q = i18;
        a17.f141823j = f310937i;
        a17.p(f310934f);
        a17.f141831r = i19;
        a17.k();
    }

    public final void i(int i17) {
        long j17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiReporter", "reportSearchResult >> " + f310931c + ", " + f310936h + ", " + f310939k + ", " + i17 + ", " + f310942n);
        if (f310931c.length() > 0) {
            if (f310939k == 0 && !f310940l && f310942n == 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiReporter", "reportSearchResult >> imageQueryDoneTimeStamp is 0");
                f310939k = java.lang.System.currentTimeMillis();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiReporter", "need to report result " + f310939k);
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6865xc054f370 a17 = a();
            a17.f141819f = 8L;
            if (!f310940l) {
                long j18 = f310936h;
                if (j18 != 0) {
                    long j19 = f310939k;
                    if (j19 >= j18 && f310942n == 1) {
                        j17 = j19 - j18;
                        a17.f141829p = j17;
                        a17.f141830q = i17;
                        a17.k();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiReporter", "resetSearchData >> " + f310931c + ", " + f310936h);
                        f310931c = "";
                        f310934f = "";
                        f310935g = 1;
                        f310936h = 0L;
                        f310937i = 0L;
                        f310938j.clear();
                        f310939k = 0L;
                        f310942n = 0;
                    }
                }
            }
            j17 = 0;
            a17.f141829p = j17;
            a17.f141830q = i17;
            a17.k();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiReporter", "resetSearchData >> " + f310931c + ", " + f310936h);
            f310931c = "";
            f310934f = "";
            f310935g = 1;
            f310936h = 0L;
            f310937i = 0L;
            f310938j.clear();
            f310939k = 0L;
            f310942n = 0;
        }
    }

    public final void j(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiReporter", "reportVerticalSearch " + i17 + ", " + i18);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6865xc054f370 c6865xc054f370 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6865xc054f370();
        c6865xc054f370.f141819f = (long) i17;
        c6865xc054f370.f141817d = c6865xc054f370.b("sessionid", f310930b, true);
        c6865xc054f370.f141834u = (long) i18;
        c6865xc054f370.p(f310934f);
        c6865xc054f370.k();
    }

    public final void k(int i17, int i18, int i19) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiReporter", "reportVerticalSearch " + i17 + ", " + i18 + ", " + i19);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6865xc054f370 c6865xc054f370 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6865xc054f370();
        c6865xc054f370.f141819f = (long) i17;
        c6865xc054f370.f141817d = c6865xc054f370.b("sessionid", f310930b, true);
        c6865xc054f370.f141834u = (long) i18;
        c6865xc054f370.f141821h = (long) i19;
        c6865xc054f370.p(f310934f);
        c6865xc054f370.k();
    }

    public final void l(java.lang.String currentQuery) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(currentQuery, "currentQuery");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiReporter", "setCurrentQuery >> ".concat(currentQuery));
        f310934f = currentQuery;
    }

    public final void m() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiReporter", "setFirstToShowCost >> " + f310931c + ", " + f310936h);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j17 = f310936h;
        long j18 = 0;
        if (j17 != 0 && currentTimeMillis > j17) {
            j18 = currentTimeMillis - j17;
        }
        f310937i = j18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiReporter", "setFirstToShowCost after >> " + f310937i);
    }
}
