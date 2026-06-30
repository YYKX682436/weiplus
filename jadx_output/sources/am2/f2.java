package am2;

/* loaded from: classes3.dex */
public final class f2 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public static final am2.f2 f8668d = new am2.f2();

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        if (g4Var.z()) {
            g4Var.f(com.tencent.rtmp.TXLiveConstants.PLAY_ERR_NET_DISCONNECT, "-2301");
            g4Var.f(-2304, "-2304");
            g4Var.f(com.tencent.rtmp.TXLiveConstants.PLAY_ERR_STREAM_SWITCH_FAIL, "-2307");
            g4Var.f(com.tencent.rtmp.TXLiveConstants.PLAY_WARNING_RECONNECT, "2103_404");
            g4Var.f(1003, "2103_1003");
        }
    }
}
