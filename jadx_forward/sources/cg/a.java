package cg;

/* loaded from: classes13.dex */
public class a implements te1.d {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.g3 f122566a = new com.p314xaae8f345.mm.sdk.p2603x2137b148.g3("bizplaylist", 86400);

    public com.p314xaae8f345.mm.vfs.r6 a(java.lang.String str) {
        com.p314xaae8f345.mm.vfs.r6 r6Var;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        java.lang.String lastPathSegment = android.net.Uri.parse(str).getLastPathSegment();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(lastPathSegment) || (r6Var = (com.p314xaae8f345.mm.vfs.r6) this.f122566a.d(lastPathSegment)) == null) {
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PlaylistFileInterceptor", "intercept success, contentId:%s, url:%s", lastPathSegment, str);
        return new com.p314xaae8f345.mm.vfs.r6(java.lang.String.format("%s/%s", r6Var.u(), lastPathSegment));
    }
}
