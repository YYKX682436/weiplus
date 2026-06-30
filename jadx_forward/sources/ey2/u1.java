package ey2;

/* loaded from: classes2.dex */
public final class u1 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ey2.z1 f339076a;

    public u1(ey2.z1 z1Var) {
        this.f339076a = z1Var;
    }

    @Override // ym5.n0
    /* renamed from: onViewExposed */
    public void mo976xcdf5f75c(android.view.View view, long j17, long j18, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        ey2.z1 z1Var = this.f339076a;
        z1Var.N6().f338880f = z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa aaVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa.f186886a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.z9 z9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.z9) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa.U.mo3195x754a37bb();
        if (z17) {
            boolean z18 = false;
            if (z9Var != null && z9Var.f186860a) {
                z18 = true;
            }
            if (z18) {
                z1Var.W6(z9Var);
                return;
            }
        }
        z1Var.Q6();
    }
}
