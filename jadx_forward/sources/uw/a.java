package uw;

/* loaded from: classes11.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static volatile java.lang.String f513013e;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f513010b = {p3321xbce91901.jvm.p3324x21ffc6bd.i0.d(new p3321xbce91901.jvm.p3324x21ffc6bd.u(uw.a.class, "persistenceCacheUnReadArticleMsgCnt", "getPersistenceCacheUnReadArticleMsgCnt()I", 0))};

    /* renamed from: a, reason: collision with root package name */
    public static final uw.a f513009a = new uw.a();

    /* renamed from: c, reason: collision with root package name */
    public static final b30.c f513011c = new b30.c(-1, "KEY_ECS_BOX_INFO_UNREAD_ARTICLE_MSG_CNT");

    /* renamed from: d, reason: collision with root package name */
    public static int f513012d = -1;

    public final void a(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandEcsCachedGetter", "updateCachedUnReadArticleMsgCnt cacheUnReadArticleMsgCnt:" + f513012d + " unReadArticleMsgCnt:" + i17);
        f513012d = i17;
        f513011c.c(this, f513010b[0], java.lang.Integer.valueOf(i17));
    }
}
