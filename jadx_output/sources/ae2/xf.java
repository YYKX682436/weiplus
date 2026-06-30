package ae2;

/* loaded from: classes3.dex */
public final class xf extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.xf f4292d = new ae2.xf();

    public xf() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(30, "直播商品讲解录制时长上限（分钟）", null, null, 12, null);
        aVar.a("FINDER_LIVE_RECORD_DURATION_LIMIT", kz5.c0.i(30, 3, 1), kz5.c0.i(com.tenpay.android.wechat.PayuSecureEncrypt.ENCRYPT_VERSION_HASH, "3", "1"));
        return aVar;
    }
}
