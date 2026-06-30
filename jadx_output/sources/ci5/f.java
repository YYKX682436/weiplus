package ci5;

/* loaded from: classes12.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final ci5.f f41728a = new ci5.f();

    public final boolean a(java.lang.String sourcePath, java.lang.String targetPath) {
        kotlin.jvm.internal.o.g(sourcePath, "sourcePath");
        kotlin.jvm.internal.o.g(targetPath, "targetPath");
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(sourcePath));
        com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(targetPath));
        if (!r6Var.m()) {
            com.tencent.mars.xlog.Log.e("MediaGallery.FinderLiveGalleryHelper", "moveFileWithCheck: source file not exists: ".concat(sourcePath));
            return false;
        }
        com.tencent.mm.vfs.r6 s17 = r6Var2.s();
        if (s17 != null && !s17.m() && !s17.J()) {
            com.tencent.mars.xlog.Log.e("MediaGallery.FinderLiveGalleryHelper", "moveFileWithCheck: failed to create target directory: " + s17);
            return false;
        }
        if (r6Var.L(r6Var2)) {
            com.tencent.mars.xlog.Log.i("MediaGallery.FinderLiveGalleryHelper", "moveFileWithCheck: move file from " + sourcePath + " to " + targetPath + " success");
            return true;
        }
        com.tencent.mars.xlog.Log.e("MediaGallery.FinderLiveGalleryHelper", "moveFileWithCheck: move file from " + sourcePath + " to " + targetPath + " failed");
        return false;
    }
}
