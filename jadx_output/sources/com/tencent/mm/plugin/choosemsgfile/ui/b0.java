package com.tencent.mm.plugin.choosemsgfile.ui;

/* loaded from: classes8.dex */
public class b0 extends com.tencent.mm.plugin.ball.service.s4 {

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f95614v;

    /* renamed from: w, reason: collision with root package name */
    public int f95615w;

    public b0(dp1.x xVar) {
        super(xVar);
        this.f95614v = "";
        this.f95615w = 0;
    }

    @Override // com.tencent.mm.plugin.ball.service.s4, com.tencent.mm.plugin.ball.service.d
    public void H() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FilesFloatBall.ChooseMsgFilesPageFloatBallHelper", "onReceivedBallInfoRemovedEvent, filePath:%s", this.f95614v);
        n0();
    }

    @Override // com.tencent.mm.plugin.ball.service.s4, com.tencent.mm.plugin.ball.service.d
    public void I() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FilesFloatBall.ChooseMsgFilesPageFloatBallHelper", "onReceivedFinishWhenSwitchBallEvent, filePath:%s", this.f95614v);
        this.f93246u = false;
        dp1.x xVar = this.f93239n;
        if (xVar == null || xVar.getActivity() == null) {
            return;
        }
        xVar.getActivity().finish();
    }
}
