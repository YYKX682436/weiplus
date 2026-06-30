package am2;

/* loaded from: classes3.dex */
public final class g2 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public static final am2.g2 f8673d = new am2.g2();

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        hn0.r rVar;
        mn0.b0 b0Var;
        dk2.ef efVar = dk2.ef.f233372a;
        tn0.w0 w0Var = dk2.ef.f233378d;
        co0.s sVar = w0Var instanceof co0.s ? (co0.s) w0Var : null;
        mn0.i0 n17 = (sVar == null || (rVar = sVar.R1) == null || (b0Var = rVar.f282409a) == null) ? null : ((mn0.y) b0Var).n();
        kotlin.jvm.internal.o.e(n17, "null cannot be cast to non-null type com.tencent.mm.live.core.core.player.LiveTXPlayerTicker");
        if (menuItem.getItemId() == -2301) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("disconnected_code", 404);
            n17.onPlayEvent(com.tencent.rtmp.TXLiveConstants.PLAY_ERR_NET_DISCONNECT, bundle);
            return;
        }
        if (menuItem.getItemId() == -2304) {
            n17.onPlayEvent(-2304, null);
            return;
        }
        if (menuItem.getItemId() == -2307) {
            n17.onPlayEvent(com.tencent.rtmp.TXLiveConstants.PLAY_ERR_STREAM_SWITCH_FAIL, null);
            return;
        }
        if (menuItem.getItemId() == 2103) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putInt("disconnected_code", 404);
            n17.onPlayEvent(com.tencent.rtmp.TXLiveConstants.PLAY_WARNING_RECONNECT, bundle2);
        } else if (menuItem.getItemId() == 1003) {
            android.os.Bundle bundle3 = new android.os.Bundle();
            bundle3.putInt("disconnected_code", 1003);
            n17.onPlayEvent(com.tencent.rtmp.TXLiveConstants.PLAY_WARNING_RECONNECT, bundle3);
        }
    }
}
