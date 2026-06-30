package e21;

/* loaded from: classes11.dex */
public class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg3.q0 f328057d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f328058e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.g25 f328059f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e21.i0 f328060g;

    public h0(e21.i0 i0Var, xg3.q0 q0Var, int i17, r45.g25 g25Var) {
        this.f328060g = i0Var;
        this.f328057d = q0Var;
        this.f328058e = i17;
        this.f328059f = g25Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        e21.l0 l0Var = this.f328060g.f328068m;
        int b17 = this.f328057d.b();
        r45.g25 g25Var = this.f328059f;
        l0Var.c(b17, this.f328058e, g25Var == null ? "" : g25Var.f456375e, g25Var != null ? g25Var.f456374d : "");
    }
}
