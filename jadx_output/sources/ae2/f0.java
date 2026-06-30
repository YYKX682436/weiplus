package ae2;

/* loaded from: classes5.dex */
public final class f0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.f0 f3590d = new ae2.f0();

    public f0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "直播feed推荐刷新间隔设置,单位s", null, null, 12, null);
        aVar.a("FINDER_LIVE_RECOMM_REFRESH_INTERVAL", kz5.c0.i(0, 10, 20, 30, 60), kz5.c0.i("默认", com.tenpay.android.wechat.PayuSecureEncrypt.ENCRYPT_VERSION_DEFAULT, "20", com.tenpay.android.wechat.PayuSecureEncrypt.ENCRYPT_VERSION_HASH, "60"));
        return aVar;
    }
}
