package ll3;

/* loaded from: classes11.dex */
public class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4 f400703d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ll3.j0 f400704e;

    public g0(ll3.j0 j0Var, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4 c5722xb16ab0f4) {
        this.f400704e = j0Var;
        this.f400703d = c5722xb16ab0f4;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean c17 = b21.m.c();
        ll3.j0 j0Var = this.f400704e;
        if (c17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j0Var.f400717n, "delay stop and playing music again");
            return;
        }
        if (j0Var.u()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d s17 = j0Var.s();
            if (s17 == null || !s17.I) {
                j0Var.o0();
                return;
            }
            int i17 = s17.f174579d;
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4 c5722xb16ab0f4 = this.f400703d;
            if (i17 != 23) {
                j0Var.t().f174623m = c5722xb16ab0f4.f136045g.f88569b == 2 ? 10 : 11;
                j0Var.g();
                j0Var.d();
                return;
            }
            if (c5722xb16ab0f4.f136045g.f88569b == 7) {
                j0Var.j0(c5722xb16ab0f4);
            } else {
                j0Var.n0(c5722xb16ab0f4);
            }
        }
    }
}
