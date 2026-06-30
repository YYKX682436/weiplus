package tb1;

/* loaded from: classes7.dex */
public class o implements bi3.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tb1.s f498449a;

    public o(tb1.s sVar) {
        this.f498449a = sVar;
    }

    @Override // bi3.j
    public void a(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCameraView", "onRecordFinish error %b", java.lang.Boolean.valueOf(z17));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1075xae79c325.C12042x78b65610 c12042x78b65610 = this.f498449a.f498467a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.api.C16529x1336da53 c16529x1336da53 = c12042x78b65610.F;
        if (c16529x1336da53 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCameraView", "onRecordFinish recordView is null");
            this.f498449a.i(-1, "camera is null", null, null);
            return;
        }
        c12042x78b65610.f161700J = 1;
        java.lang.String m66784x819e39a6 = c16529x1336da53.m66784x819e39a6();
        if (z17) {
            this.f498449a.i(-1, "stop error", null, null);
        } else {
            tb1.s sVar = this.f498449a;
            if (sVar.f498467a.f161713r) {
                sVar.getClass();
                ((ku5.t0) ku5.t0.f394148d).g(new tb1.q(sVar, m66784x819e39a6));
            } else {
                tb1.s.e(sVar, m66784x819e39a6);
            }
        }
        tb1.s sVar2 = this.f498449a;
        sVar2.getClass();
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1075xae79c325.C12042x78b65610.f161699x0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1075xae79c325.C12042x78b65610 c12042x78b656102 = sVar2.f498467a;
        c12042x78b656102.o();
        c12042x78b656102.f161715t = false;
    }
}
