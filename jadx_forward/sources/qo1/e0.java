package qo1;

/* loaded from: classes5.dex */
public final class e0 implements com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.y1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qo1.f0 f447003a;

    public e0(qo1.f0 f0Var) {
        this.f447003a = f0Var;
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.y1
    /* renamed from: complete */
    public final void mo111029xdc453139(int i17) {
        qo1.i0 a17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseRoamTask", "[!] Task stop ret = " + i17 + ", pkgId=" + this.f447003a.f447016i);
        qo1.h0 h0Var = qo1.i0.f447034e;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.z a18 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.z.a(i17);
        if (a18 == null) {
            h0Var.getClass();
            a17 = qo1.i0.f447045s;
        } else {
            a17 = h0Var.a(a18);
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0 n0Var = a17 == qo1.i0.f447035f ? com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0.AFFROAM_TASK_STATE_STOPPED : com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0.AFFROAM_TASK_STATE_ERROR;
        ku5.u0 u0Var = ku5.t0.f394148d;
        qo1.f0 f0Var = this.f447003a;
        ((ku5.t0) u0Var).h(new qo1.d0(f0Var, n0Var, a17), f0Var.n());
    }
}
