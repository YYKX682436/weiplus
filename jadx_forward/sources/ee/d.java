package ee;

/* loaded from: classes7.dex */
public class d implements ni1.j, ni1.c {

    /* renamed from: a, reason: collision with root package name */
    public final ee.a f332942a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 f332943b;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var) {
        this.f332942a = new ee.a(v5Var);
        this.f332943b = v5Var;
    }

    @Override // ni1.j
    public void a() {
        this.f332943b.T0(new ee.c(this));
    }

    @Override // ni1.c
    public void b() {
        this.f332942a.c();
    }

    @Override // ni1.c
    public void c() {
        this.f332942a.getClass();
    }

    @Override // ni1.j
    public void d() {
        this.f332943b.T0(new ee.b(this));
    }

    @Override // ni1.j
    public boolean e() {
        return this.f332942a.f332939b == pi1.d.HIDDEN;
    }

    @Override // ni1.c
    /* renamed from: onConfigurationChanged */
    public void mo14690x50e1c15d(android.content.res.Configuration configuration) {
    }

    @Override // ni1.c
    /* renamed from: onDestroy */
    public void mo14691xac79a11b() {
    }
}
