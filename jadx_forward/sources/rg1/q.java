package rg1;

/* loaded from: classes7.dex */
public final class q implements com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback {

    /* renamed from: a, reason: collision with root package name */
    public boolean f476762a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rg1.o f476763b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p971x6de15a2e.j2 f476764c;

    public q(rg1.o oVar, com.p314xaae8f345.mm.p971x6de15a2e.j2 j2Var) {
        this.f476763b = oVar;
        this.f476764c = j2Var;
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback
    /* renamed from: onCronetReceiveChunkedData */
    public void mo37969x6a58464f(com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.ChunkedData chunkedData, long j17) {
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback
    /* renamed from: onCronetReceiveHeader */
    public int mo37970x82943234(com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.ResponseHeader responseHeader, int i17, java.lang.String str) {
        if (this.f476762a) {
            return 0;
        }
        this.f476762a = true;
        ((rg1.p) this.f476763b).getClass();
        com.p314xaae8f345.mm.p971x6de15a2e.j2 connection = this.f476764c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(connection, "connection");
        return 0;
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback
    /* renamed from: onCronetReceiveUploadProgress */
    public void mo37971x77ce5bf5(long j17, long j18) {
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback
    /* renamed from: onCronetTaskCompleted */
    public void mo37972x5b5f2d2a(java.lang.String str, com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskResult cronetTaskResult, java.lang.String str2) {
        rg1.p pVar = (rg1.p) this.f476763b;
        pVar.getClass();
        com.p314xaae8f345.mm.p971x6de15a2e.j2 connection = this.f476764c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(connection, "connection");
        int i17 = cronetTaskResult != null ? cronetTaskResult.f18207xec0a8ff : 0;
        p3325xe03a0797.p3326xc267989b.q qVar = pVar.f476760a;
        if (i17 != 200) {
            ((p3325xe03a0797.p3326xc267989b.r) qVar).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null));
        } else {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            ((p3325xe03a0797.p3326xc267989b.r) qVar).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(pVar.f476761b.o()));
        }
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback
    /* renamed from: onDownloadProgressChanged */
    public void mo37973x617c4940(java.lang.String str, com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetDownloadProgress cronetDownloadProgress) {
    }
}
