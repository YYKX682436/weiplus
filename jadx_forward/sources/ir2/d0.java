package ir2;

/* loaded from: classes2.dex */
public final class d0 implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ir2.a1 f375655d;

    public d0(ir2.a1 a1Var) {
        this.f375655d = a1Var;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        ir2.v1 v1Var = (ir2.v1) obj;
        boolean z17 = v1Var instanceof ir2.t1;
        ir2.a1 a1Var = this.f375655d;
        if (z17) {
            ir2.t1 t1Var = (ir2.t1) v1Var;
            if (t1Var.f375756a instanceof ir2.a) {
                ((ir2.c1) ((jz5.n) a1Var.f375632o).mo141623x754a37bb()).f375654b.f190023a = ((ir2.a) t1Var.f375756a).f375616e;
            }
        } else if (v1Var instanceof ir2.u1) {
            ir2.u1 u1Var = (ir2.u1) v1Var;
            if (u1Var.f375760a instanceof ir2.a) {
                ((ir2.c1) ((jz5.n) a1Var.f375632o).mo141623x754a37bb()).f375654b.f190023a = ((ir2.a) u1Var.f375760a).f375616e;
            }
        }
        return jz5.f0.f384359a;
    }
}
