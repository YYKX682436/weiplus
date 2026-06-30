package ae2;

/* loaded from: classes5.dex */
public final class o1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ae2.o1 f4063d = new ae2.o1();

    public o1() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(-1, "直播采集debug分辨率", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_live_anchor_debug_camera_resolution, false, 2, null);
        aVar.a("LIVE_ANCHOR_DEBUG_CAMERA_RESOLUTION", kz5.c0.i(-1, java.lang.Integer.valueOf(com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1), java.lang.Integer.valueOf(com.tencent.tavkit.component.TAVPlayer.VIDEO_PLAYER_WIDTH), java.lang.Integer.valueOf(com.tencent.tavkit.component.TAVExporter.VIDEO_EXPORT_WIDTH), 1080), kz5.c0.i("不配置", "360", "540", "720", "1080"));
        aVar.f317745p = "T5";
        return aVar;
    }
}
