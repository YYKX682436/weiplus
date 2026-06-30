package k72;

/* loaded from: classes14.dex */
public class l implements com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.C27972x100071ea.PoseDetectOnFrame {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k72.n f386270a;

    public l(k72.n nVar) {
        this.f386270a = nVar;
    }

    @Override // com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.C27972x100071ea.PoseDetectOnFrame
    /* renamed from: onCanReflect */
    public void mo120821xb41be40c() {
    }

    @Override // com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.C27972x100071ea.PoseDetectOnFrame
    /* renamed from: onFailed */
    public void mo120822x428b6afc(int i17, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceCheckActionEngine", "detect action failed, %s %s %s", java.lang.Integer.valueOf(i17), str, str2);
        k72.n nVar = this.f386270a;
        nVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(917L, 43L, 1L, false);
        k72.m mVar = nVar.f386272b;
        if (mVar != null) {
            mVar.getClass();
        }
    }

    @Override // com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.C27972x100071ea.PoseDetectOnFrame
    /* renamed from: onRecordingDone */
    public void mo120823x1259974(byte[][] bArr, int i17, int i18) {
        if (bArr != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceCheckActionEngine", "notify start record, frameDatas.length: %s, width: %s, height: %s", java.lang.Integer.valueOf(bArr.length), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceCheckActionEngine", "onRecordingDone, frameData is null!!");
        }
        k72.n nVar = this.f386270a;
        nVar.getClass();
        k72.j.f386258a.f386269k = false;
        k72.m mVar = nVar.f386272b;
        if (mVar != null) {
            k72.q qVar = (k72.q) mVar;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceCheckActionMgr", "onStartRecord, frameDatas: %s, width: %s, height: %s", bArr, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            if (bArr != null) {
                k72.u uVar = qVar.f386276a;
                uVar.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceCheckActionMgr", "processRecordFrameData, frames: %s, width: %s, height: %s", bArr, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
                k72.t tVar = uVar.f386293r;
                if (tVar != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceActionUI", "onStartUpload");
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new l72.e((l72.j) tVar));
                }
                k72.s sVar = new k72.s(uVar, bArr, i17, i18);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = uVar.f386295t;
                if (n3Var != null) {
                    n3Var.mo50293x3498a0(sVar);
                }
            }
        }
    }

    @Override // com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.C27972x100071ea.PoseDetectOnFrame
    /* renamed from: onSuccess */
    public void mo120824xe05b4124(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceCheckActionEngine", "detect action success: %s", java.lang.Integer.valueOf(i17));
        k72.n nVar = this.f386270a;
        nVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(917L, 42L, 1L, false);
        k72.m mVar = nVar.f386272b;
        if (mVar != null) {
            mVar.getClass();
        }
    }
}
