package zt5;

/* loaded from: classes15.dex */
public class m implements zt5.n {

    /* renamed from: a, reason: collision with root package name */
    public boolean f557140a = false;

    @Override // zt5.n
    public void a() {
        zt5.h.b("Soter.SoterDelegate", "soter: triggered OOM. using default imp, just record the flag", new java.lang.Object[0]);
        this.f557140a = true;
    }

    @Override // zt5.n
    public boolean b() {
        return this.f557140a;
    }

    @Override // zt5.n
    /* renamed from: reset */
    public void mo141431x6761d4f() {
        this.f557140a = false;
    }
}
