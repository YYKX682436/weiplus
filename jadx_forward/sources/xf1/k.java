package xf1;

/* loaded from: classes7.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final xf1.k f535775a = new xf1.k();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f535776b = jz5.h.b(xf1.j.f535774d);

    public final com.p314xaae8f345.mm.vfs.r6 a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l component, java.lang.String zipPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(component, "component");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(zipPath, "zipPath");
        boolean z17 = true;
        if (!r26.i0.y(zipPath, "wxfile://", true) && !r26.i0.y(zipPath, "http", true)) {
            zipPath = component.mo48798x74292566() + '_' + zipPath;
        }
        byte[] bytes = zipPath.getBytes(r26.c.f450398a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        java.lang.String g17 = kk.k.g(bytes);
        if (g17 != null && g17.length() != 0) {
            z17 = false;
        }
        if (!z17) {
            return new com.p314xaae8f345.mm.vfs.r6((com.p314xaae8f345.mm.vfs.r6) ((jz5.n) f535776b).mo141623x754a37bb(), g17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.AppBrandUnzipLogic", "getUnzipDir, unzipPathName is empty");
        return null;
    }

    public final com.p314xaae8f345.mm.vfs.r6 b(java.util.zip.ZipInputStream zipInputStream, com.p314xaae8f345.mm.vfs.r6 unzipDir) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(zipInputStream, "zipInputStream");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(unzipDir, "unzipDir");
        int j17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.l1.j(zipInputStream, unzipDir.o());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandUnzipLogic", "unzip, unzipRet: " + j17);
        if (j17 != 0) {
            return null;
        }
        if (xf1.h.f535769a.b(unzipDir)) {
            return unzipDir;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.AppBrandUnzipLogic", "unzip, record fail");
        return null;
    }
}
