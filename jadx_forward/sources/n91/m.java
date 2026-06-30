package n91;

/* loaded from: classes7.dex */
public class m implements ni1.j, ni1.c {

    /* renamed from: a, reason: collision with root package name */
    public final ee.d f417420a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f417421b = false;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var) {
        this.f417420a = new ee.d(v5Var);
        n91.g gVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) v5Var.mo32091x9a3f0ba2()).K2;
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: n91.m$$a
            @Override // java.lang.Runnable
            public final void run() {
                n91.m mVar = n91.m.this;
                mVar.f417421b = true;
                mVar.b();
            }
        };
        if (gVar.f417406c.ordinal() >= 3) {
            runnable.run();
        } else {
            gVar.f417407d.add(runnable);
        }
    }

    @Override // ni1.j
    public void a() {
        if (this.f417421b) {
            this.f417420a.a();
        }
    }

    @Override // ni1.c
    public void b() {
        if (this.f417421b) {
            this.f417420a.b();
        }
    }

    @Override // ni1.c
    public void c() {
        if (this.f417421b) {
            this.f417420a.c();
        }
    }

    @Override // ni1.j
    public void d() {
        if (this.f417421b) {
            this.f417420a.d();
        }
    }

    @Override // ni1.j
    public boolean e() {
        if (this.f417421b) {
            return this.f417420a.e();
        }
        return false;
    }

    @Override // ni1.c
    /* renamed from: onConfigurationChanged */
    public void mo14690x50e1c15d(android.content.res.Configuration configuration) {
        if (this.f417421b) {
            this.f417420a.getClass();
        }
    }

    @Override // ni1.c
    /* renamed from: onDestroy */
    public void mo14691xac79a11b() {
        if (this.f417421b) {
            this.f417420a.getClass();
        }
    }
}
