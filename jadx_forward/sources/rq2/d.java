package rq2;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public static long f480350b;

    /* renamed from: c, reason: collision with root package name */
    public static long f480351c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f480352d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f480353e;

    /* renamed from: i, reason: collision with root package name */
    public static long f480357i;

    /* renamed from: j, reason: collision with root package name */
    public static boolean f480358j;

    /* renamed from: a, reason: collision with root package name */
    public static final rq2.d f480349a = new rq2.d();

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f480354f = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f480355g = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.HashSet f480356h = new java.util.HashSet();

    public final java.lang.String a(int i17, int i18) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(i17);
        sb6.append('_');
        sb6.append(i18);
        return sb6.toString();
    }

    public final rq2.a b(int i17, int i18) {
        if (i17 == 9 || i17 == 10) {
            i17 = 0;
        }
        return (rq2.a) f480354f.get(a(i17, i18));
    }

    public final boolean c(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNewSquareReporter", "isValidPullType: pullType=" + i17 + " tabType=" + i18);
        return i17 == 1 || i17 == 0 || i17 == 10 || i17 == 9 || i17 == 21 || i17 == 26;
    }

    public final void d(int i17, int i18, boolean z17, int i19) {
        rq2.a b17 = b(i17, i18);
        if (b17 != null) {
            b17.f480327e = i19;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNewSquareReporter", "notifyLiveExitToSquare: isUseCache=" + z17 + ", pullType=" + i17 + ", tabType=" + i18);
            rq2.d dVar = f480349a;
            if (!z17) {
                dVar.g(i18);
                return;
            }
            b17.f480323a = 0L;
            f480357i = 0L;
            b17.f480325c = 0L;
            b17.f480326d = 0L;
            b17.f480329g = 0L;
            b17.f480328f = 0L;
            b17.f480331i = 0L;
            b17.f480330h = 0L;
            dVar.j(i17, i18);
        }
    }

    public final void e(int i17, int i18) {
        rq2.a b17 = b(i17, i18);
        if (b17 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNewSquareReporter", "onDbEnd: tabType=" + i18 + ", pullType=" + i17);
            b17.f480329g = android.os.SystemClock.elapsedRealtime();
            rq2.a b18 = f480349a.b(i17, i18);
            if (b18 != null) {
                b18.f480330h = android.os.SystemClock.elapsedRealtime();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNewSquareReporter", "onUIShowBegin: tabType=" + i18 + ", pullType=" + i17);
            }
        }
    }

    public final void f(int i17, int i18) {
        rq2.a b17 = b(i17, i18);
        if (b17 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNewSquareReporter", "onDbStart tabType: " + i18);
            b17.f480328f = android.os.SystemClock.elapsedRealtime();
        }
    }

    public final void g(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNewSquareReporter", "onLoadingBarShow tabType: " + i17);
        f480357i = android.os.SystemClock.elapsedRealtime();
    }

    public final void h(int i17, int i18) {
        jz5.f0 f0Var;
        rq2.a b17 = b(i17, i18);
        if (b17 != null) {
            b17.f480331i = android.os.SystemClock.elapsedRealtime();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNewSquareReporter", "onUIShowEnd: tabType=" + i18 + ", pullType=" + i17);
            f480349a.j(i17, i18);
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNewSquareReporter", "onUIShowEnd data is null, tabType=" + i18 + ", pullType=" + i17);
        }
    }

    public final void i(boolean z17) {
        f480352d = z17;
        f480350b = android.os.SystemClock.elapsedRealtime();
        boolean z18 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().L0(c92.g.f121271a.b() ? "FinderLiveEntrance" : "NearbyEntrance") != null;
        f480353e = z17 && z18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNewSquareReporter", "saveClickEnterTime isFromClick : " + z17 + " isFromRedClick: " + f480353e + " hasRedDot: " + z18);
    }

    public final void j(int i17, int i18) {
        rq2.a b17 = b(i17, i18);
        if (b17 != null) {
            if (i17 == 21 && b17.f480327e != 20) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNewSquareReporter", "tickReportEnd: do not report when enter live room, cgiType=" + b17.f480327e);
                return;
            }
            if (i17 == 26 && b17.f480327e != 23) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNewSquareReporter", "tickReportEnd: do not report when end page scroll up, cgiType=" + b17.f480327e);
                return;
            }
            if (f480352d) {
                b17.f480342t = f480351c - b17.f480323a;
            }
            if (b17.f480326d > 0 && b17.f480325c == 0) {
                java.lang.Long l17 = (java.lang.Long) f480355g.get(f480349a.a(i17, i18));
                b17.f480325c = l17 == null ? 0L : l17.longValue();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNewSquareReporter", "tickReportEnd: get outside start cgi, pullType=" + i17 + ", tabType=" + i18);
            }
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = f480355g;
            rq2.d dVar = f480349a;
            concurrentHashMap.remove(dVar.a(i17, i18));
            b17.f480338p = java.lang.Math.max(0L, b17.f480325c - b17.f480323a);
            b17.f480339q = b17.f480326d - b17.f480325c;
            b17.f480341s = b17.f480329g - b17.f480328f;
            b17.f480340r = b17.f480331i - b17.f480330h;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNewSquareReporter", "tickReportEnd: add to report list: pullType=" + i17 + ", tabType=" + i18 + ", enterCost=" + b17.f480338p + ", cgiCost=" + b17.f480339q + ", dbCost=" + b17.f480341s + ", uiCost=" + b17.f480340r + ", isClickEnter=" + b17.f480324b);
            java.util.HashSet hashSet = f480356h;
            synchronized (hashSet) {
                if (b17.a()) {
                    hashSet.add(b17);
                }
            }
        }
        if (f480353e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNewSquareReporter", "tickReportEnd isFromRedClick clear reportedData");
            f480356h.clear();
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("tickReportEnd: isFromRedClick=");
        sb6.append(f480353e);
        sb6.append(", reportSize=");
        sb6.append(f480356h.size());
        sb6.append(", pullType=");
        sb6.append(i17);
        sb6.append(", tabType=");
        sb6.append(i18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNewSquareReporter", sb6.toString());
        if ((!r2.isEmpty()) && i18 == 10000) {
            new rq2.y().l();
        }
    }

    public final void k(int i17, int i18, java.lang.String tabName, int i19, int i27) {
        long elapsedRealtime;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tabName, "tabName");
        java.lang.String a17 = a(i17, i18);
        boolean c17 = c(i17, i18);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f480354f;
        if (!c17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNewSquareReporter", "tickReportStart remove data, key: " + a17);
            concurrentHashMap.remove(a17);
            return;
        }
        if (!concurrentHashMap.containsKey(a17)) {
            rq2.a aVar = new rq2.a();
            aVar.f480336n = i18;
            aVar.f480333k = i17;
            aVar.f480334l = i27;
            aVar.f480337o = tabName;
            aVar.f480335m = i19;
            concurrentHashMap.put(a17, aVar);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNewSquareReporter", "tickReportStart add op tabName=".concat(tabName));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNewSquareReporter", "tickReportStart pullTypeParams: " + i17 + " tabType: " + i18 + " tabName: " + tabName);
        rq2.a b17 = b(i17, i18);
        if (b17 != null) {
            if (i17 == 0) {
                b17.f480324b = true;
                elapsedRealtime = f480350b;
            } else {
                f480352d = false;
                f480353e = false;
                elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            }
            b17.f480323a = elapsedRealtime;
        }
    }
}
