package ci5;

/* loaded from: classes12.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final ci5.f f123261a = new ci5.f();

    public final boolean a(java.lang.String sourcePath, java.lang.String targetPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sourcePath, "sourcePath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetPath, "targetPath");
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(sourcePath));
        com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(targetPath));
        if (!r6Var.m()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MediaGallery.FinderLiveGalleryHelper", "moveFileWithCheck: source file not exists: ".concat(sourcePath));
            return false;
        }
        com.p314xaae8f345.mm.vfs.r6 s17 = r6Var2.s();
        if (s17 != null && !s17.m() && !s17.J()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MediaGallery.FinderLiveGalleryHelper", "moveFileWithCheck: failed to create target directory: " + s17);
            return false;
        }
        if (r6Var.L(r6Var2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.FinderLiveGalleryHelper", "moveFileWithCheck: move file from " + sourcePath + " to " + targetPath + " success");
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MediaGallery.FinderLiveGalleryHelper", "moveFileWithCheck: move file from " + sourcePath + " to " + targetPath + " failed");
        return false;
    }
}
