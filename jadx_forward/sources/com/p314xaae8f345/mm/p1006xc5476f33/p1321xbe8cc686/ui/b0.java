package com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui;

/* loaded from: classes8.dex */
public class b0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4 {

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f177147v;

    /* renamed from: w, reason: collision with root package name */
    public int f177148w;

    public b0(dp1.x xVar) {
        super(xVar);
        this.f177147v = "";
        this.f177148w = 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d
    public void H() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FilesFloatBall.ChooseMsgFilesPageFloatBallHelper", "onReceivedBallInfoRemovedEvent, filePath:%s", this.f177147v);
        n0();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d
    public void I() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FilesFloatBall.ChooseMsgFilesPageFloatBallHelper", "onReceivedFinishWhenSwitchBallEvent, filePath:%s", this.f177147v);
        this.f174779u = false;
        dp1.x xVar = this.f174772n;
        if (xVar == null || xVar.mo50327x19263085() == null) {
            return;
        }
        xVar.mo50327x19263085().finish();
    }
}
