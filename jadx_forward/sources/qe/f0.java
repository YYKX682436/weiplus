package qe;

/* loaded from: classes7.dex */
public class f0 {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p782x304bf2.p783x36a98bfc.C10722xbbfb2dae f443478a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f443479b = null;

    /* renamed from: c, reason: collision with root package name */
    public boolean f443480c = true;

    /* renamed from: d, reason: collision with root package name */
    public final qe.e0 f443481d = new qe.e0(this, new qe.d0(this));

    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t tVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.LockStepNativeInstallHelper", "createLockStepBinding");
        if (tVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.LockStepNativeInstallHelper", "createLockStepBinding jsruntime is null");
            return;
        }
        this.f443479b = java.lang.String.valueOf(i17);
        ij0.c.f373201a.mo136651xeb57c8f5("mmlockstep");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0 f0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0) tVar.h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0.class);
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.LockStepNativeInstallHelper", "createLockStepBinding jsThreadHandler is null");
            return;
        }
        qe.g0 g0Var = (qe.g0) i95.n0.c(qe.g0.class);
        if (g0Var != null) {
            boolean wi6 = ((yc1.g0) g0Var).wi();
            this.f443480c = wi6;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.LockStepNativeInstallHelper", "createLockStepBinding xLibUVSwitch:%b ", java.lang.Boolean.valueOf(wi6));
        }
        f0Var.mo51545x3498a0(new qe.b0(this, tVar, new qe.z(this, new java.lang.ref.WeakReference(f0Var)), new qe.a0(this)));
    }

    public void b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t tVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.LockStepNativeInstallHelper", "destroyLockStepBinding");
        if (tVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.LockStepNativeInstallHelper", "destroyLockStepBinding jsruntime is null");
        } else {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.y) tVar.h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.y.class)).r(this.f443481d);
        }
    }
}
