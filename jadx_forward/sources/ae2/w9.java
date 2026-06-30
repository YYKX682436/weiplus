package ae2;

/* loaded from: classes3.dex */
public final class w9 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.w9 f85795d = new ae2.w9();

    public w9() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ob2.a aVar = new ob2.a(0, "视频号直播拉取评论时间间隔", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_live_get_comment_duration, false, 2, null);
        aVar.a("FINDER_LIVE_GET_COMMENT_DURATION", kz5.c0.i(0, 5000, 10000), kz5.c0.i("0", "5s", "10s"));
        return aVar;
    }
}
