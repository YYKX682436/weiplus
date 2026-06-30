package ae2;

/* loaded from: classes5.dex */
public final class ta extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.ta f4192d = new ae2.ta();

    public ta() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        pb2.a aVar = new pb2.a(com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT, "直播心跳手动复苏时间间隔", null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_live_heart_beat_guard_interval, false, 2, null);
        return aVar;
    }
}
