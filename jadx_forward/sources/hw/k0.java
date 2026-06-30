package hw;

/* loaded from: classes7.dex */
public final class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5189xf98047de f366928d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hw.o0 f366929e;

    public k0(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5189xf98047de c5189xf98047de, hw.o0 o0Var) {
        this.f366928d = c5189xf98047de;
        this.f366929e = o0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String ij6;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5189xf98047de c5189xf98047de = this.f366928d;
        boolean z17 = (c5189xf98047de.f135532g.f89122a & 1) != 0;
        boolean z18 = com.p314xaae8f345.mm.p2621x8fb0427b.c2.f275338c;
        hw.o0 o0Var = this.f366929e;
        ij6 = o0Var.ij();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(ij6, "hy: received clean event, flag is " + c5189xf98047de.f135532g.f89122a + ", is system " + z17 + ", is biz attached to engine " + z18);
        if (!z17 || z18) {
            return;
        }
        o0Var.K6(4);
    }
}
