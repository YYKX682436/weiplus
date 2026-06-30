package pk1;

/* loaded from: classes12.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public static final pk1.z f437063a = new pk1.z();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f437064b = jz5.h.b(pk1.w.f437060d);

    public final void a(pk1.u uVar) {
        com.p314xaae8f345.mm.vfs.r6 r6Var;
        boolean z17 = uVar.f437058d;
        java.lang.String str = uVar.f437056b;
        if (z17) {
            r6Var = new com.p314xaae8f345.mm.vfs.r6(c(), str + ".mark");
            if (!r6Var.m()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.ThumbCdnCacheManager", "doMark, markFile is not exists");
                com.p314xaae8f345.mm.vfs.r6 c17 = c();
                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str + ".temp.mark", false, true);
                com.p314xaae8f345.mm.vfs.z7 z7Var = c17 == null ? com.p314xaae8f345.mm.vfs.z7.f294809i : c17.f294699d;
                if (l17 != null && !l17.isEmpty()) {
                    java.lang.String str2 = z7Var.f294812f;
                    z7Var = new com.p314xaae8f345.mm.vfs.z7(z7Var.f294810d, z7Var.f294811e, str2 + '/' + l17, z7Var.f294813g, z7Var.f294814h);
                }
                com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(z7Var, null);
                com.p314xaae8f345.mm.vfs.z2 M = r6Var.M();
                if (m17.a() && M.a()) {
                    try {
                        M.f294799a.t(M.f294800b, m17.f294799a, m17.f294800b);
                    } catch (java.io.IOException unused) {
                    }
                }
            }
        } else {
            r6Var = new com.p314xaae8f345.mm.vfs.r6(c(), str + ".temp.mark");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.ThumbCdnCacheManager", "doMark, needDoMarkFile(virtual): " + r6Var);
        com.p314xaae8f345.mm.vfs.w6.S(r6Var.o(), new byte[]{0}, 0, 1);
    }

    public final pk1.v b(java.lang.String srcUrl) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(srcUrl, "srcUrl");
        byte[] bytes = srcUrl.getBytes(r26.c.f450398a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        java.lang.String g17 = kk.k.g(bytes);
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(c(), g17 + ".res");
        com.p314xaae8f345.mm.vfs.r6 c17 = c();
        boolean z17 = false;
        java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(g17 + ".mark", false, true);
        com.p314xaae8f345.mm.vfs.z7 z7Var = c17 == null ? com.p314xaae8f345.mm.vfs.z7.f294809i : c17.f294699d;
        if (l17 != null && !l17.isEmpty()) {
            java.lang.String str = z7Var.f294812f;
            z7Var = new com.p314xaae8f345.mm.vfs.z7(z7Var.f294810d, z7Var.f294811e, str + '/' + l17, z7Var.f294813g, z7Var.f294814h);
        }
        if (r6Var.m()) {
            com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(z7Var, null);
            if (!m17.a() ? false : m17.f294799a.F(m17.f294800b)) {
                z17 = true;
            }
        }
        java.lang.String i17 = com.p314xaae8f345.mm.vfs.w6.i(r6Var.o(), !z17);
        if (i17 == null) {
            i17 = "";
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g17);
        pk1.u uVar = new pk1.u(srcUrl, g17, i17, z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.ThumbCdnCacheManager", "getCacheInfo, cacheInfo: " + uVar);
        return new pk1.v(uVar);
    }

    public final com.p314xaae8f345.mm.vfs.r6 c() {
        return (com.p314xaae8f345.mm.vfs.r6) ((jz5.n) f437064b).mo141623x754a37bb();
    }

    public final void d(pk1.v cacheInfoHolder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cacheInfoHolder, "cacheInfoHolder");
        pk1.u uVar = cacheInfoHolder.f437059a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.ThumbCdnCacheManager", "onCacheFinish, cacheInfo: " + uVar);
        pk1.u a17 = pk1.u.a(uVar, null, null, null, true, 7, null);
        cacheInfoHolder.f437059a = a17;
        a(a17);
    }

    public final void e(pk1.v cacheInfoHolder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cacheInfoHolder, "cacheInfoHolder");
        pk1.u uVar = cacheInfoHolder.f437059a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.ThumbCdnCacheManager", "onCacheTouch, cacheInfo: " + uVar);
        a(uVar);
    }
}
