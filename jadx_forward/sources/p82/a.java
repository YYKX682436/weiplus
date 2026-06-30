package p82;

/* loaded from: classes8.dex */
public class a extends com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4 {

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f434260v;

    public a(dp1.x xVar) {
        super(xVar);
        this.f434260v = "";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d
    public void H() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FilesFloatBall.FavoriteFilePFloatBallHelper", "onReceivedBallInfoRemovedEvent, filePath:%s", this.f434260v);
        n0();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d
    public void I() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FilesFloatBall.FavoriteFilePFloatBallHelper", "onReceivedFinishWhenSwitchBallEvent, filePath:%s", this.f434260v);
        this.f174779u = false;
        dp1.x xVar = this.f174772n;
        if (xVar == null || xVar.mo50327x19263085() == null) {
            return;
        }
        xVar.mo50327x19263085().finish();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d
    public boolean n() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d
    public boolean v() {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f434260v) || com.p314xaae8f345.mm.vfs.w6.j(this.f434260v);
    }
}
