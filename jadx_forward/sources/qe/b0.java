package qe;

/* loaded from: classes7.dex */
public class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t f443452d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p782x304bf2.p783x36a98bfc.C10722xbbfb2dae.ILockStepListener f443453e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p782x304bf2.p783x36a98bfc.C10722xbbfb2dae.ILockStepReportListener f443454f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qe.f0 f443455g;

    public b0(qe.f0 f0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t tVar, com.p314xaae8f345.mm.p782x304bf2.p783x36a98bfc.C10722xbbfb2dae.ILockStepListener iLockStepListener, com.p314xaae8f345.mm.p782x304bf2.p783x36a98bfc.C10722xbbfb2dae.ILockStepReportListener iLockStepReportListener) {
        this.f443455g = f0Var;
        this.f443452d = tVar;
        this.f443453e = iLockStepListener;
        this.f443454f = iLockStepReportListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.LockStepNativeInstallHelper", "createLockStepBinding setCallback ");
        qe.f0 f0Var = this.f443455g;
        if (f0Var.f443478a != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.LockStepNativeInstallHelper", "createLockStepBinding lockStepNative != null");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l0 l0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l0) this.f443452d.h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l0.class);
        if (l0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.LockStepNativeInstallHelper", "createLockStepBinding v8Addon is null");
            return;
        }
        if (f0Var.f443480c) {
            f0Var.f443478a = new com.p314xaae8f345.mm.p782x304bf2.p783x36a98bfc.C10722xbbfb2dae(l0Var.L(), l0Var.G(), l0Var.z());
        } else {
            f0Var.f443478a = new com.p314xaae8f345.mm.p782x304bf2.p783x36a98bfc.C10722xbbfb2dae(l0Var.L(), l0Var.G(), 0L);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.LockStepNativeInstallHelper", "createLockStepBinding setCallback ret:%d", java.lang.Integer.valueOf(f0Var.f443478a.m45667x6c4ebec7(this.f443453e, this.f443454f)));
    }
}
