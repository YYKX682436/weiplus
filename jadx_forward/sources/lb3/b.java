package lb3;

/* loaded from: classes4.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.i f399286a;

    /* renamed from: b, reason: collision with root package name */
    public r45.mr5 f399287b;

    /* renamed from: c, reason: collision with root package name */
    public r45.js5 f399288c;

    public pq5.g a(gm5.a aVar) {
        f();
        this.f399288c = b();
        com.p314xaae8f345.mm.p944x882e457a.i iVar = new com.p314xaae8f345.mm.p944x882e457a.i();
        this.f399286a = iVar;
        r45.mr5 mr5Var = this.f399287b;
        r45.js5 js5Var = this.f399288c;
        if (mr5Var == null || js5Var == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CgiBase called withoud req or resp req?[");
            sb6.append(mr5Var == null);
            sb6.append("] resp?[");
            sb6.append(js5Var == null);
            sb6.append("]");
            throw new java.lang.IllegalStateException(sb6.toString());
        }
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = c();
        lVar.f152199c = d();
        lVar.f152197a = mr5Var;
        lVar.f152198b = js5Var;
        iVar.p(lVar.a());
        pq5.g l17 = this.f399286a.l();
        l17.K(new lb3.a(this));
        return l17.h(aVar);
    }

    public abstract r45.js5 b();

    public abstract int c();

    public abstract java.lang.String d();

    public void e() {
    }

    public void f() {
    }
}
