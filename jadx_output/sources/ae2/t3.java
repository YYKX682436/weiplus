package ae2;

/* loaded from: classes3.dex */
public final class t3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.t3 f4185d = new ae2.t3();

    public t3() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(50, "慢函数阈值(ms)", null, null, 12, null);
        aVar.a("FINDER_FPS_EVIL_METHOD_THRESHOLD", kz5.c0.i(10, 20, 50, 100), kz5.c0.i(com.tenpay.android.wechat.PayuSecureEncrypt.ENCRYPT_VERSION_DEFAULT, "20", "50", "100"));
        aVar.f317745p = com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_FPS;
        return aVar;
    }
}
