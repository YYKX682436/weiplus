package ae2;

/* loaded from: classes3.dex */
public final class ee extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.ee f3579d = new ae2.ee();

    public ee() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "评论列表是否保留自己不超过一半上限的评论数据", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_live_msg_save_myself_comment, false, 2, null);
        aVar.a("FINDER_LIVE_MSG_SAVE_MYSELF_COMMENT", kz5.c0.i(0, 1), kz5.c0.i("是", "否"));
        return aVar;
    }
}
