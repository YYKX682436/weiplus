package cg;

/* loaded from: classes13.dex */
public class a implements te1.d {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.g3 f41033a = new com.tencent.mm.sdk.platformtools.g3("bizplaylist", 86400);

    public com.tencent.mm.vfs.r6 a(java.lang.String str) {
        com.tencent.mm.vfs.r6 r6Var;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        java.lang.String lastPathSegment = android.net.Uri.parse(str).getLastPathSegment();
        if (com.tencent.mm.sdk.platformtools.t8.K0(lastPathSegment) || (r6Var = (com.tencent.mm.vfs.r6) this.f41033a.d(lastPathSegment)) == null) {
            return null;
        }
        com.tencent.mars.xlog.Log.i("PlaylistFileInterceptor", "intercept success, contentId:%s, url:%s", lastPathSegment, str);
        return new com.tencent.mm.vfs.r6(java.lang.String.format("%s/%s", r6Var.u(), lastPathSegment));
    }
}
