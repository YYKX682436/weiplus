package yx3;

/* loaded from: classes15.dex */
public final class h implements m8.z {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f549439d;

    public h(yz5.l lVar) {
        this.f549439d = lVar;
    }

    @Override // m8.z
    public void A() {
    }

    @Override // m8.z
    public void b(boolean z17) {
    }

    @Override // m8.z
    public void d(m8.e eVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onExoPlayError, error type:");
        sb6.append(eVar != null ? java.lang.Integer.valueOf(eVar.f406088d) : null);
        sb6.append(", message:");
        sb6.append(eVar != null ? eVar.getLocalizedMessage() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RingtonePlayer", sb6.toString());
        this.f549439d.mo146xb9724478(eVar);
    }

    @Override // m8.z
    public void e(d9.l0 l0Var, q9.n nVar) {
    }

    @Override // m8.z
    public void t(m8.m0 m0Var, java.lang.Object obj) {
    }

    @Override // m8.z
    public void u(m8.y yVar) {
    }

    @Override // m8.z
    public void y(boolean z17, int i17) {
    }

    @Override // m8.z
    public void z(int i17) {
    }
}
