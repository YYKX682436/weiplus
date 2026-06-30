package mi1;

/* loaded from: classes7.dex */
public class p2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f408192d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mi1.n2 f408193e;

    public p2(mi1.n2 n2Var, java.lang.CharSequence charSequence) {
        this.f408193e = n2Var;
        this.f408192d = charSequence;
    }

    @Override // java.lang.Runnable
    public void run() {
        mi1.n2 n2Var = this.f408193e;
        java.lang.CharSequence charSequence = this.f408192d;
        n2Var.f408168e = charSequence;
        if (n2Var.a()) {
            mi1.g gVar = (mi1.g) n2Var.f408175o;
            if (gVar.p()) {
                return;
            }
            gVar.f408089f.b(charSequence);
        }
    }
}
