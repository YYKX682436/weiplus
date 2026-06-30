package zz0;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final zz0.a f559229a = new zz0.a();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f559230b;

    static {
        java.lang.String str = com.p314xaae8f345.mm.vfs.q7.c("finder") + '/';
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMPMediaFileCachePathRouter", "FINDER_DATA_ROOT=" + str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMPMediaFileCachePathRouter", "FINDER_LIVE_ROOT=" + (com.p314xaae8f345.mm.vfs.q7.c("live") + '/'));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMPMediaFileCachePathRouter", "FINDER_POSTING_ROOT=" + (com.p314xaae8f345.mm.vfs.q7.c("finderposting") + '/'));
        java.lang.String str2 = str + "video/";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMPMediaFileCachePathRouter", "FINDER_VIDEO_DIR=" + str2);
        f559230b = str2;
    }

    public final java.lang.String a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(f559230b);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("finder_video_");
        sb7.append(str);
        sb7.append('_');
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            if (str3 == null) {
                str3 = "";
            }
            char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
            str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(str3.getBytes());
        }
        sb7.append(str2);
        sb6.append(sb7.toString());
        return sb6.toString();
    }
}
