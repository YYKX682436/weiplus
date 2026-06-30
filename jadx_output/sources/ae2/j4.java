package ae2;

/* loaded from: classes3.dex */
public final class j4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.j4 f3946d = new ae2.j4();

    public j4() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(com.tencent.mm.plugin.appbrand.jsapi.pay.h0.CTRL_INDEX, "主播开播弱网测速阈值", null, null, 12, null);
        aVar.a("FINDER_LIVE_ANCHOR_NET_SPEED_TEST_THRESHOLD", kz5.c0.i(60, java.lang.Integer.valueOf(com.tencent.mm.plugin.appbrand.jsapi.pay.h0.CTRL_INDEX), 6000, java.lang.Integer.valueOf(com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL)), kz5.c0.i("60kbps", "680kbps", "6000kbps", "60000kbps"));
        return aVar;
    }
}
