package androidx.appcompat.widget;

/* loaded from: classes15.dex */
public class o implements o.f0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.q f9663d;

    public o(androidx.appcompat.widget.q qVar) {
        this.f9663d = qVar;
    }

    @Override // o.f0
    public void a(o.r rVar, boolean z17) {
        if (rVar instanceof o.o0) {
            rVar.k().c(false);
        }
        o.f0 f0Var = this.f9663d.f341694h;
        if (f0Var != null) {
            f0Var.a(rVar, z17);
        }
    }

    @Override // o.f0
    public boolean c(o.r rVar) {
        if (rVar == null) {
            return false;
        }
        int i17 = ((o.o0) rVar).G.f341804d;
        androidx.appcompat.widget.q qVar = this.f9663d;
        qVar.F = i17;
        o.f0 f0Var = qVar.f341694h;
        if (f0Var != null) {
            return f0Var.c(rVar);
        }
        return false;
    }
}
