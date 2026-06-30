package cx;

/* loaded from: classes7.dex */
public final class f1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5189xf98047de f305934d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cx.j1 f305935e;

    public f1(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5189xf98047de c5189xf98047de, cx.j1 j1Var) {
        this.f305934d = c5189xf98047de;
        this.f305935e = j1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String pj6;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5189xf98047de c5189xf98047de = this.f305934d;
        boolean z17 = (c5189xf98047de.f135532g.f89122a & 1) != 0;
        boolean z18 = com.p314xaae8f345.mm.p2621x8fb0427b.c2.f275338c;
        cx.j1 j1Var = this.f305935e;
        pj6 = j1Var.pj();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pj6, "hy: received clean event, flag is " + c5189xf98047de.f135532g.f89122a + ", is system " + z17 + ", is biz attached to engine " + z18);
        if (!z17 || z18) {
            return;
        }
        j1Var.K6(4);
    }
}
