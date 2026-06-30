package bf3;

/* loaded from: classes7.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final bf3.b0 f101145a = new bf3.b0();

    public final java.lang.String a(java.lang.String unzippath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(unzippath, "unzippath");
        try {
            java.util.HashMap hashMap = (java.util.HashMap) com.p314xaae8f345.mm.sdk.p2603x2137b148.b2.a(com.p314xaae8f345.mm.vfs.s6.b(new com.p314xaae8f345.mm.vfs.r6(unzippath.concat("/mbpkg_meta.txt")), null, 1, null));
            java.lang.String str = (java.lang.String) hashMap.get("wxapkgName");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MBMagicPkgHelper", "readPkgPathFromUnZipPath metaMap:" + hashMap);
            return unzippath + '/' + str;
        } catch (java.io.FileNotFoundException unused) {
            return "";
        }
    }
}
