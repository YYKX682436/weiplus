package ov;

/* loaded from: classes8.dex */
public final class a implements uh4.i0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ov.b f430596d;

    public a(ov.b bVar) {
        this.f430596d = bVar;
    }

    @Override // uh4.i0
    /* renamed from: onDataChanged */
    public final void mo13777xf050804b() {
        boolean m172127x74219ae7 = ((vh4.f) ((bx1.q) i95.n0.c(bx1.q.class))).m172127x74219ae7();
        ov.b bVar = this.f430596d;
        if (m172127x74219ae7 != bVar.f430602g) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioPanelFeatureService", "onTeenModeChanged new: " + m172127x74219ae7 + ", old: " + bVar.f430602g);
            bVar.f430602g = m172127x74219ae7;
            if (bVar.Bi()) {
                bVar.Ni();
            }
            ((rk4.k8) ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj()).u(null);
        }
    }
}
