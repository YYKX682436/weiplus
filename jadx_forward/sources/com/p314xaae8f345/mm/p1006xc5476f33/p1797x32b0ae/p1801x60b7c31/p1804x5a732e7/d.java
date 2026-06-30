package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

/* loaded from: classes12.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.String f225075a;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f225076b;

    public static void a(java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.b bVar) {
        java.lang.String f17 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.y2.f(str, "bundle", null);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(f17);
        sb6.append("MMVideo_");
        char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(str2.getBytes()));
        sb6.append(".mp4");
        f225076b = sb6.toString();
        f225075a = "MMVideo_" + com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(str2.getBytes());
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        dn.o oVar = new dn.o();
        oVar.f323318d = "task_GameVideoDownloadUI";
        oVar.f69601xaca5bdda = f225075a;
        oVar.M1 = str2;
        oVar.H1 = 0;
        oVar.Z = 3;
        oVar.f323342y0 = 4;
        com.p314xaae8f345.mm.vfs.w6.u(com.p314xaae8f345.mm.vfs.w6.r(f225076b));
        oVar.f69595x6d25b0d9 = f225076b;
        oVar.f323348c2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.a(currentTimeMillis, str2, bVar);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.c(oVar), 0L);
    }
}
