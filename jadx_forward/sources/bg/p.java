package bg;

/* loaded from: classes7.dex */
public class p implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.r1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bg.f f101357a;

    public p(bg.f fVar) {
        this.f101357a = fVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.r1
    /* renamed from: onPause */
    public void mo10367xb01dfb57() {
        bg.f fVar = this.f101357a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar.A(), "onPause");
        fVar.Q(new bg.RunnableC1340x2ee9bd(fVar, true));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.r1
    /* renamed from: onResume */
    public void mo10368x57429eec() {
        bg.f fVar = this.f101357a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar.A(), "onResume");
        fVar.Q(new bg.t(fVar));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.r1
    /* renamed from: onStop */
    public void mo10369xc39f8281() {
        bg.f fVar = this.f101357a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar.A(), "onStop");
        fVar.Q(new bg.RunnableC1339x2ee9bc(fVar));
    }
}
