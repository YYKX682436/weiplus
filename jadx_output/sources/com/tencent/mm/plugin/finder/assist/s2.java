package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes10.dex */
public final class s2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.assist.s2 f102522d = new com.tencent.mm.plugin.finder.assist.s2();

    @Override // java.lang.Runnable
    public final void run() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String d17 = gm0.j1.u().d();
        kotlin.jvm.internal.o.f(d17, "getExternalAccountPath(...)");
        java.lang.String t17 = r26.i0.t(d17, "MicroMsg", "cache", false);
        java.lang.String d18 = gm0.j1.u().d();
        java.lang.String concat = t17.concat("finder/video/");
        java.lang.String str = d18 + "finder/video/";
        boolean d19 = vz5.q.d(new java.io.File(concat));
        boolean d27 = vz5.q.d(new java.io.File(str));
        boolean d28 = vz5.q.d(new java.io.File(t17.concat("finder/image/")));
        boolean d29 = vz5.q.d(new java.io.File(d18 + "finder/image/"));
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_CLEAN_OLD_FINDER_MEDIA_BOOLEAN, java.lang.Boolean.FALSE);
        com.tencent.mm.plugin.finder.assist.v2 v2Var = com.tencent.mm.plugin.finder.assist.v2.f102615a;
        com.tencent.mars.xlog.Log.i("Finder.FinderFolderClearManager", "[checkClear] clear old finder media dir. oldFinderVideoPath=" + concat + " oldBeforeVFSFinderVideoPath=" + str + " ret=(" + d19 + ':' + d27 + '-' + d28 + ':' + d29 + ") Cost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis) + "ms");
    }
}
