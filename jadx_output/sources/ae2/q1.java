package ae2;

/* loaded from: classes5.dex */
public final class q1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.q1 f4111d = new ae2.q1();

    public q1() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1000, "包厢消息上限", null, null, 12, null);
        aVar.a("LIVE_BOX_MAX_MSG", kz5.c0.i(10, 50, 1000), kz5.c0.i(com.tenpay.android.wechat.PayuSecureEncrypt.ENCRYPT_VERSION_DEFAULT, "50", "1000"));
        aVar.f317745p = "包厢本地配置";
        return aVar;
    }
}
