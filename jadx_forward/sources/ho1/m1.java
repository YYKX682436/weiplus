package ho1;

/* loaded from: classes9.dex */
public final class m1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ho1.q1 f364288a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f364289b;

    public m1(ho1.q1 q1Var, long j17) {
        this.f364288a = q1Var;
        this.f364289b = j17;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamBackup.RoamProviderImpl", "getRoamBackupPackagesAsync Msg=" + fVar.f152150c + " Type=" + fVar.f152148a + " Code=" + fVar.f152149b);
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g0 g0Var = this.f364288a.f364320a;
        if (g0Var == null) {
            return null;
        }
        g0Var.p1(this.f364289b, ((bo1.k) fVar.f152151d).mo14344x5f01b1f6());
        return jz5.f0.f384359a;
    }
}
