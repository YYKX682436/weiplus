package ah0;

/* loaded from: classes7.dex */
public class z0 extends gp1.e0 {
    @Override // gp1.x
    public void G0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
    }

    @Override // gp1.e0, gp1.x
    public void V(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
    }

    @Override // gp1.x
    public void r0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        if (ballInfo == null || ballInfo.G == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("LugWvFloatBallInfoClickedListener", "handleBallInfoClicked, openWebPage ballInfo:%s", ballInfo);
        java.lang.String str = ballInfo.f93049g;
        java.lang.String string = ballInfo.G.getString("rawUrl");
        int i17 = ballInfo.G.getInt("minimize_secene", 0);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtras(ballInfo.G);
        intent.putExtra("rawUrl", string);
        intent.putExtra("minimize_secene", i17);
        intent.putExtra("float_ball_key", str);
        intent.putExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, ballInfo.f93063x);
        j45.l.j(com.tencent.mm.sdk.platformtools.x2.f193071a, "webview", ".ui.tools.WebViewUI", intent, null);
    }
}
