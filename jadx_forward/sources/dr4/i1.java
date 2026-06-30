package dr4;

/* loaded from: classes14.dex */
public final class i1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dr4.p1 f324182d;

    public i1(dr4.p1 p1Var) {
        this.f324182d = p1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dr4.c0 c0Var;
        dr4.p1 p1Var = this.f324182d;
        boolean z17 = true;
        if (p1Var.f324240f) {
            wo.e eVar = wo.v1.f529355b;
            if (eVar.f529193e != 1 && eVar.f529194f != 1) {
                return;
            }
        }
        xq4.a aVar = p1Var.f324237c;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(aVar != null ? java.lang.Boolean.valueOf(((zq4.b) aVar).f556583j) : null, java.lang.Boolean.TRUE)) {
            return;
        }
        xq4.a aVar2 = p1Var.f324237c;
        if (aVar2 != null) {
            if (!(aVar2 != null ? ((zq4.b) aVar2).f556574a : true)) {
                z17 = false;
            }
        }
        dr4.x1 x1Var = p1Var.f324241g;
        if (x1Var == null || (c0Var = x1Var.f324295b) == null) {
            return;
        }
        dr4.p1.a(p1Var, c0Var, z17);
    }
}
