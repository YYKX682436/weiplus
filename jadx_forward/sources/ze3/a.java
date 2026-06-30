package ze3;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final ze3.a f553311a = new ze3.a();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f553312b;

    static {
        java.lang.String str = com.p314xaae8f345.mm.vfs.q7.c("mb_ad") + '/';
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MB_External_surface_video_item", "prepare AD_DATA_ROOT:" + str);
        java.lang.String str2 = str + "reward_ad_video/";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MB_External_surface_video_item", "prepare REWARD_AD_VIDEO_DIR:" + str2);
        f553312b = str2;
    }

    public final java.lang.String a(java.lang.String str, java.lang.String str2) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(f553312b);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("ad_video_");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            if (str2 == null) {
                str2 = "";
            }
            char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
            str = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(str2.getBytes());
        }
        sb7.append(str);
        sb6.append(sb7.toString());
        return sb6.toString();
    }
}
