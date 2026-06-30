package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes10.dex */
public final class s2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.s2 f184055d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.s2();

    @Override // java.lang.Runnable
    public final void run() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String d17 = gm0.j1.u().d();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getExternalAccountPath(...)");
        java.lang.String t17 = r26.i0.t(d17, "MicroMsg", "cache", false);
        java.lang.String d18 = gm0.j1.u().d();
        java.lang.String concat = t17.concat("finder/video/");
        java.lang.String str = d18 + "finder/video/";
        boolean d19 = vz5.q.d(new java.io.File(concat));
        boolean d27 = vz5.q.d(new java.io.File(str));
        boolean d28 = vz5.q.d(new java.io.File(t17.concat("finder/image/")));
        boolean d29 = vz5.q.d(new java.io.File(d18 + "finder/image/"));
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_CLEAN_OLD_FINDER_MEDIA_BOOLEAN, java.lang.Boolean.FALSE);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v2 v2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v2.f184148a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderFolderClearManager", "[checkClear] clear old finder media dir. oldFinderVideoPath=" + concat + " oldBeforeVFSFinderVideoPath=" + str + " ret=(" + d19 + ':' + d27 + '-' + d28 + ':' + d29 + ") Cost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis) + "ms");
    }
}
