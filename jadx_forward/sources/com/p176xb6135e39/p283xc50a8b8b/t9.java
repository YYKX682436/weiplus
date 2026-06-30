package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public class t9 implements com.p176xb6135e39.p283xc50a8b8b.b {

    /* renamed from: a, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.b f127087a;

    /* renamed from: b, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.a f127088b;

    /* renamed from: c, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.c f127089c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f127090d;

    public t9(com.p176xb6135e39.p283xc50a8b8b.c cVar, com.p176xb6135e39.p283xc50a8b8b.b bVar, boolean z17) {
        java.nio.charset.Charset charset = com.p176xb6135e39.p283xc50a8b8b.w6.f127181a;
        cVar.getClass();
        this.f127089c = cVar;
        this.f127087a = bVar;
        this.f127090d = z17;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.b
    public void a() {
        h();
    }

    public com.p176xb6135e39.p283xc50a8b8b.c b() {
        this.f127090d = true;
        return e();
    }

    public com.p176xb6135e39.p283xc50a8b8b.t9 c() {
        com.p176xb6135e39.p283xc50a8b8b.c cVar = this.f127089c;
        this.f127089c = (com.p176xb6135e39.p283xc50a8b8b.c) (cVar != null ? cVar.mo20559x786693c3() : this.f127088b.mo20559x786693c3());
        com.p176xb6135e39.p283xc50a8b8b.a aVar = this.f127088b;
        if (aVar != null) {
            aVar.mo20518x63a5261f();
            this.f127088b = null;
        }
        h();
        return this;
    }

    public com.p176xb6135e39.p283xc50a8b8b.a d() {
        if (this.f127088b == null) {
            com.p176xb6135e39.p283xc50a8b8b.a aVar = (com.p176xb6135e39.p283xc50a8b8b.a) this.f127089c.mo20588xab31548(this);
            this.f127088b = aVar;
            aVar.mo20527x60f45402((com.p176xb6135e39.p283xc50a8b8b.k8) this.f127089c);
            this.f127088b.mo20522xc674f77c();
        }
        return this.f127088b;
    }

    public com.p176xb6135e39.p283xc50a8b8b.c e() {
        if (this.f127089c == null) {
            this.f127089c = (com.p176xb6135e39.p283xc50a8b8b.c) this.f127088b.mo20557x85702333();
        }
        return this.f127089c;
    }

    public com.p176xb6135e39.p283xc50a8b8b.r8 f() {
        com.p176xb6135e39.p283xc50a8b8b.a aVar = this.f127088b;
        return aVar != null ? aVar : this.f127089c;
    }

    public com.p176xb6135e39.p283xc50a8b8b.t9 g(com.p176xb6135e39.p283xc50a8b8b.c cVar) {
        if (this.f127088b == null) {
            com.p176xb6135e39.p283xc50a8b8b.k8 k8Var = this.f127089c;
            if (k8Var == k8Var.mo20559x786693c3()) {
                this.f127089c = cVar;
                h();
                return this;
            }
        }
        d().mo20527x60f45402((com.p176xb6135e39.p283xc50a8b8b.k8) cVar);
        h();
        return this;
    }

    public final void h() {
        com.p176xb6135e39.p283xc50a8b8b.b bVar;
        if (this.f127088b != null) {
            this.f127089c = null;
        }
        if (!this.f127090d || (bVar = this.f127087a) == null) {
            return;
        }
        bVar.a();
        this.f127090d = false;
    }

    public com.p176xb6135e39.p283xc50a8b8b.t9 i(com.p176xb6135e39.p283xc50a8b8b.c cVar) {
        java.nio.charset.Charset charset = com.p176xb6135e39.p283xc50a8b8b.w6.f127181a;
        cVar.getClass();
        this.f127089c = cVar;
        com.p176xb6135e39.p283xc50a8b8b.a aVar = this.f127088b;
        if (aVar != null) {
            aVar.mo20518x63a5261f();
            this.f127088b = null;
        }
        h();
        return this;
    }
}
