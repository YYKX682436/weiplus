package t21;

/* loaded from: classes12.dex */
public class n1 implements m11.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dn.h f496375a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t21.o1 f496376b;

    public n1(t21.o1 o1Var, dn.h hVar) {
        this.f496376b = o1Var;
        this.f496375a = hVar;
    }

    @Override // m11.a0
    public void a(int i17, int i18, long j17, java.lang.String str) {
        if (i17 == 4 && i18 == 102) {
            gm0.j1.e().j(new t21.m1(this));
            return;
        }
        t21.o1 o1Var = this.f496376b;
        t21.b.a(o1Var.f496381d.f496571n, 0);
        o1Var.f496381d.M(this.f496375a);
        t21.w0 w0Var = o1Var.f496381d;
        w0Var.f496564d.mo815x76e0bfae(i17, i18, "", w0Var);
    }
}
