package ae2;

/* loaded from: classes3.dex */
public final class a5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.a5 f3438d = new ae2.a5();

    public a5() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(100, "直播进场消息队列容量", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_live_bullet_comment_limit_num, false, 2, null);
        aVar.a("FINDER_LIVE_BULLET_COMMENT_LIMIT_NUM", kz5.c0.i(10, 20, 50, 100, 200, 500, 1000), kz5.c0.i(com.tenpay.android.wechat.PayuSecureEncrypt.ENCRYPT_VERSION_DEFAULT, "20", "50", "100", "200", "500", "1000"));
        return aVar;
    }
}
