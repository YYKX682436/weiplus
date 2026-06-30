package ae2;

/* loaded from: classes3.dex */
public final class w5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.w5 f85791d = new ae2.w5();

    public w5() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ob2.a aVar = new ob2.a(1000, "直播评论长度限制", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_live_comment_list_size_limit, false, 2, null);
        aVar.a("FINDER_LIVE_COMMENT_SIZE_LIMIT", kz5.c0.i(5, 10), kz5.c0.i("限制5条", "限制10条"));
        return aVar;
    }
}
