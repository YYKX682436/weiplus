package p012xc85e97e9.p016x746ad0e3.p019xd1075a44;

/* loaded from: classes15.dex */
public class o implements o.f0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q f91196d;

    public o(p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q qVar) {
        this.f91196d = qVar;
    }

    @Override // o.f0
    public void a(o.r rVar, boolean z17) {
        if (rVar instanceof o.o0) {
            rVar.k().c(false);
        }
        o.f0 f0Var = this.f91196d.f423227h;
        if (f0Var != null) {
            f0Var.a(rVar, z17);
        }
    }

    @Override // o.f0
    public boolean c(o.r rVar) {
        if (rVar == null) {
            return false;
        }
        int i17 = ((o.o0) rVar).G.f423337d;
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q qVar = this.f91196d;
        qVar.F = i17;
        o.f0 f0Var = qVar.f423227h;
        if (f0Var != null) {
            return f0Var.c(rVar);
        }
        return false;
    }
}
