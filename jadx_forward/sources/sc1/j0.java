package sc1;

/* loaded from: classes7.dex */
public class j0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1094x32b0ec.C12151x47b5a23e f487216d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t f487217e;

    public j0(sc1.x0 x0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1094x32b0ec.C12151x47b5a23e c12151x47b5a23e, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar) {
        this.f487216d = c12151x47b5a23e;
        this.f487217e = tVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v0
    public void c() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.e(this.f487217e.mo48798x74292566(), this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v0
    public void e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w0 w0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1094x32b0ec.C12151x47b5a23e c12151x47b5a23e = this.f487216d;
        c12151x47b5a23e.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandLivePusherView", "onAppBrandPause pauseType:%s", w0Var);
        if (w0Var == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w0.BACK || w0Var == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w0.CLOSE || w0Var == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w0.LAUNCH_MINI_PROGRAM) {
            ((sc1.q1) c12151x47b5a23e.f163103i).f(true);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v0
    public void g() {
        ((sc1.q1) this.f487216d.f163103i).c();
    }
}
