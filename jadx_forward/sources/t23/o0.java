package t23;

/* loaded from: classes10.dex */
public final class o0 {

    /* renamed from: b, reason: collision with root package name */
    public t23.t0 f496744b;

    /* renamed from: c, reason: collision with root package name */
    public final l75.v0 f496745c = new t23.i0(this);

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f496746d = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f496747e = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f496748f = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    public kk.j f496743a = new jt0.i(200, new t23.j0(this), t23.o0.class);

    public o0() {
        t23.t0 t0Var = new t23.t0();
        t0Var.f496804e = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 0).getInt("com.tencent.mm.gallery.cache.suffix", 0);
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(t0Var.f496801b, "cache.idx");
        r45.lz3 lz3Var = new r45.lz3();
        java.lang.String o17 = r6Var.o();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(o17)) {
            try {
                byte[] x17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.x1(o17);
                if (x17 != null) {
                    lz3Var.mo11468x92b714fd(x17);
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DiskCache", "load index file error");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.DiskCache", e17, "", new java.lang.Object[0]);
                t0Var.c(-1);
                lz3Var = new r45.lz3();
            } catch (java.lang.OutOfMemoryError e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DiskCache", "load index file error, OOM, index length %s", java.lang.Long.valueOf(r6Var.C()));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.DiskCache", e18, "", new java.lang.Object[0]);
                t0Var.c(-1);
                lz3Var = new r45.lz3();
            }
        }
        t0Var.f496803d.clear();
        java.util.Iterator it = lz3Var.f461530d.iterator();
        while (it.hasNext()) {
            r45.mz3 mz3Var = (r45.mz3) it.next();
            t0Var.f496803d.put(mz3Var.f462472d, mz3Var);
        }
        t0Var.g(-1);
        this.f496744b = t0Var;
        this.f496745c.a(new t23.k0(this), null);
    }

    public android.graphics.Bitmap a(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GalleryCache", "null filepath");
            return null;
        }
        kk.j jVar = this.f496743a;
        if (jVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GalleryCache", "want to get bitmap, but gallery cache is null");
            return null;
        }
        if (jVar.k(str)) {
            t23.m0 m0Var = (t23.m0) this.f496743a.i(str);
            if (m0Var == null) {
                this.f496743a.mo141381xc84af884(str);
                return null;
            }
            android.graphics.Bitmap bitmap = m0Var.f496738a;
            if (bitmap != null) {
                if (bitmap.isRecycled()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GalleryCache", "cache bitmap has recycled: %s", str);
                    this.f496743a.mo141381xc84af884(str);
                    return null;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GalleryCache", "get cached bitmap:" + str);
                return bitmap;
            }
            this.f496743a.mo141381xc84af884(str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GalleryCache", "get bitmap is null! %s", str);
        }
        return null;
    }

    public android.graphics.Bitmap b(java.lang.String str, java.lang.String str2, long j17, t23.j2 j2Var, long j18) {
        if (!(j62.e.g().d(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2507xdbb7bd.C19922x436d1252(), false, false) == 0)) {
            return null;
        }
        synchronized (this.f496748f) {
            if (this.f496744b == null) {
                return null;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                str = str2;
            }
            return this.f496744b.d(j33.d0.c(str, j2Var, j18).hashCode());
        }
    }

    public void c(java.lang.String str, java.lang.String str2, long j17, android.graphics.Bitmap bitmap, t23.j2 j2Var, long j18) {
        if (j62.e.g().d(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2507xdbb7bd.C19922x436d1252(), false, false) == 0) {
            synchronized (this.f496748f) {
                if (bitmap != null) {
                    if (!bitmap.isRecycled()) {
                        if (this.f496744b == null) {
                            return;
                        }
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                            str = str2;
                        }
                        this.f496744b.h(j33.d0.c(str, j2Var, j18).hashCode(), com.p314xaae8f345.mm.sdk.p2603x2137b148.x.g(bitmap));
                        return;
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GalleryCache", "saveBitmapToDiskCache bmp is null. tell pennqin!!!");
            }
        }
    }

    public void d(java.lang.String str, android.graphics.Bitmap bitmap, int i17, t23.j2 j2Var, boolean z17, int i18, long j17) {
        kk.j jVar = this.f496743a;
        if (jVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GalleryCache", "cache is null");
            return;
        }
        ((jt0.i) jVar).j(j33.d0.c(str, j2Var, j17), new t23.m0(this, com.p314xaae8f345.mm.sdk.p2603x2137b148.x.g(bitmap), i17));
        if (z17) {
            return;
        }
        l75.v0 v0Var = this.f496745c;
        v0Var.d(j33.d0.d(str, j2Var, i18));
        v0Var.c();
    }
}
