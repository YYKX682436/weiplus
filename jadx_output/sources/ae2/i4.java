package ae2;

/* loaded from: classes3.dex */
public final class i4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.i4 f3668d = new ae2.i4();

    public i4() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(300000, "主播开播弱网测速弹窗间隔时间", null, null, 12, null);
        aVar.a("FINDER_LIVE_ANCHOR_NET_SPEED_TEST_INTERVAL", kz5.c0.i(java.lang.Integer.valueOf(com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL), 300000), kz5.c0.i("1分钟", "5分钟"));
        return aVar;
    }
}
