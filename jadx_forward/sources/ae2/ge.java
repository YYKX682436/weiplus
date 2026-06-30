package ae2;

/* loaded from: classes3.dex */
public final class ge extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.ge f85162d = new ae2.ge();

    public ge() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ob2.a aVar = new ob2.a(0, "直播结束后跳过getLiveMsg", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_live_msg_skip_after_finish, false, 2, null);
        aVar.a("FINDER_LIVE_MSG_SKIP_AFTER_FINISH", kz5.c0.i(0, 1), kz5.c0.i("打开", "关闭"));
        return aVar;
    }
}
