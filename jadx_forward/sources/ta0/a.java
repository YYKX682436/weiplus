package ta0;

/* loaded from: classes7.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f498129a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f498130b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f498131c;

    static {
        java.lang.String str = com.p314xaae8f345.mm.vfs.q7.c("newlife") + '/';
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewLife.NewLifePathRouter", "NEW_LIFE_ROOT=" + str);
        java.lang.String str2 = str + "cache/image/";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewLife.NewLifePathRouter", "NEW_LIFE_MEDIA_IMAGE_DIR=" + str2);
        f498129a = str2;
        java.lang.String str3 = com.p314xaae8f345.mm.vfs.q7.c("newlife/posting") + '/';
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewLife.NewLifePathRouter", "NEWLIFE_POSTING_ROOT=" + str3);
        f498130b = str3;
        java.lang.String str4 = str3 + "media_tmp/";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewLife.NewLifePathRouter", "POST_MEDIA_TMP_DIR=" + str4);
        f498131c = str4;
    }
}
