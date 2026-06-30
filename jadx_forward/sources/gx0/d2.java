package gx0;

/* loaded from: classes5.dex */
public final class d2 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ow0.g f357844d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.u2 f357845e;

    public d2(ow0.g gVar, gx0.u2 u2Var) {
        this.f357844d = gVar;
        this.f357845e = u2Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        ex0.r n17;
        if (this.f357844d.m157271xfdaa7672() == sw0.f.f494965g) {
            gx0.u2 u2Var = this.f357845e;
            if (!u2Var.R7().m7()) {
                ((du0.o) ((jz5.n) u2Var.f430814o).mo141623x754a37bb()).U6(false);
                return;
            }
            ex0.a0 a0Var = u2Var.S7().f358175r;
            if (a0Var == null || (n17 = a0Var.n()) == null || gx0.c2.f357809a[n17.f338702c.ordinal()] != 1) {
                return;
            }
            u2Var.W7(n17.f338701b);
        }
    }
}
