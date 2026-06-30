package bf3;

/* loaded from: classes7.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final bf3.b0 f19612a = new bf3.b0();

    public final java.lang.String a(java.lang.String unzippath) {
        kotlin.jvm.internal.o.g(unzippath, "unzippath");
        try {
            java.util.HashMap hashMap = (java.util.HashMap) com.tencent.mm.sdk.platformtools.b2.a(com.tencent.mm.vfs.s6.b(new com.tencent.mm.vfs.r6(unzippath.concat("/mbpkg_meta.txt")), null, 1, null));
            java.lang.String str = (java.lang.String) hashMap.get("wxapkgName");
            com.tencent.mars.xlog.Log.i("MBMagicPkgHelper", "readPkgPathFromUnZipPath metaMap:" + hashMap);
            return unzippath + '/' + str;
        } catch (java.io.FileNotFoundException unused) {
            return "";
        }
    }
}
