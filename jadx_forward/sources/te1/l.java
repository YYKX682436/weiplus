package te1;

/* loaded from: classes13.dex */
public class l {

    /* renamed from: c, reason: collision with root package name */
    public static volatile te1.l f499323c;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Set f499325b = java.util.Collections.synchronizedSet(new java.util.HashSet());

    /* renamed from: a, reason: collision with root package name */
    public final te1.r f499324a = new te1.r();

    public static te1.l b() {
        if (f499323c != null) {
            return f499323c;
        }
        throw new java.lang.IllegalStateException("Video SDK has not been initialized! Call init() first!");
    }

    public long a(java.lang.String str) {
        te1.r rVar = this.f499324a;
        rVar.getClass();
        long j17 = 0;
        if (!android.text.TextUtils.isEmpty(str) && rVar.f499343c != null) {
            java.lang.String u17 = ve1.g.u(str);
            re1.m mVar = (re1.m) rVar.f499343c;
            synchronized (mVar) {
                java.util.NavigableSet<re1.i> c17 = mVar.c(u17);
                if (c17 != null) {
                    re1.i iVar = (re1.i) c17.first();
                    if (iVar == null || !iVar.f475873i || iVar.f475871g < 0 || iVar.f475869e == 0) {
                        if (iVar != null && iVar.f475871g >= 0) {
                            for (re1.i iVar2 : c17) {
                                if (!iVar2.f475873i) {
                                    break;
                                }
                                j17 += iVar2.f475870f;
                            }
                        }
                    }
                }
            }
        }
        return j17;
    }

    public boolean c(java.lang.String str) {
        re1.i iVar;
        te1.r rVar = this.f499324a;
        rVar.getClass();
        if (android.text.TextUtils.isEmpty(str) || rVar.f499343c == null) {
            return false;
        }
        java.lang.String u17 = ve1.g.u(str);
        re1.m mVar = (re1.m) rVar.f499343c;
        synchronized (mVar) {
            java.util.NavigableSet<re1.i> c17 = mVar.c(u17);
            if (c17 != null && (iVar = (re1.i) c17.first()) != null) {
                long j17 = iVar.f475871g;
                long j18 = 0;
                if (j17 >= 0) {
                    for (re1.i iVar2 : c17) {
                        if (!iVar2.f475873i) {
                            return false;
                        }
                        j18 += iVar2.f475870f;
                    }
                    if (j18 >= j17) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public boolean d(java.lang.String str, long j17) {
        if (android.text.TextUtils.isEmpty(str) || !android.webkit.URLUtil.isNetworkUrl(str)) {
            ve1.g.p(4, "VideoManager", "preload, not valid url, url=" + str, null);
            return false;
        }
        if (!qe1.a.a().f443551c) {
            ve1.g.p(4, "VideoManager", "preload, video proxy & cache disabled", null);
            return false;
        }
        if (this.f499325b.contains(str)) {
            ve1.g.p(4, "VideoManager", "preload, same url in preloading, url=" + str, null);
            return false;
        }
        if (ve1.g.m(str)) {
            ve1.g.p(4, "VideoManager", "preload, m3u8 is not supported, url=" + str, null);
            return false;
        }
        if (c(str)) {
            ve1.g.p(4, "VideoManager", "preload, video already cached, url=" + str, null);
        } else {
            boolean z17 = j17 == -1 || a(str) < j17;
            if (!z17) {
                ve1.g.p(4, "VideoManager", "preload, no need to preload, preloadSync skipped, url=" + str, null);
                return false;
            }
            try {
                ve1.p.b(new te1.j(this, str, j17, 0L, 0, z17, false, null), "preloadAsync");
            } catch (java.lang.Exception e17) {
                ve1.g.p(6, "VideoManager", "preload, preloadSync error, url=" + str + " msg=" + e17.getMessage(), null);
            }
        }
        return true;
    }

    public void e(java.util.ArrayList arrayList, java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            str = "preloadMediasAsync";
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            te1.g gVar = (te1.g) it.next();
            if (!c(gVar.f499310a)) {
                arrayList2.add(new te1.k(this, gVar, -1L, null, str));
            } else {
                ve1.g.p(4, str, "preloadMediasAsync, url " + gVar.f499310a + " already cached, cacheMaxBytes=-1", null);
            }
        }
        if (arrayList2.size() > 0) {
            synchronized (ve1.p.class) {
                ve1.o oVar = new ve1.o(2);
                java.lang.Long l17 = 1L;
                java.util.Iterator it6 = arrayList2.iterator();
                while (it6.hasNext()) {
                    java.lang.Runnable runnable = (java.lang.Runnable) it6.next();
                    java.lang.Long valueOf = java.lang.Long.valueOf(l17.longValue() + 1);
                    oVar.execute(new ve1.m(runnable, null, l17.longValue()));
                    l17 = valueOf;
                }
                oVar.shutdown();
            }
        }
    }
}
