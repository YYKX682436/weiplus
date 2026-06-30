package com.google.protobuf;

/* loaded from: classes16.dex */
public class t9 implements com.google.protobuf.b {

    /* renamed from: a, reason: collision with root package name */
    public com.google.protobuf.b f45554a;

    /* renamed from: b, reason: collision with root package name */
    public com.google.protobuf.a f45555b;

    /* renamed from: c, reason: collision with root package name */
    public com.google.protobuf.c f45556c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f45557d;

    public t9(com.google.protobuf.c cVar, com.google.protobuf.b bVar, boolean z17) {
        java.nio.charset.Charset charset = com.google.protobuf.w6.f45648a;
        cVar.getClass();
        this.f45556c = cVar;
        this.f45554a = bVar;
        this.f45557d = z17;
    }

    @Override // com.google.protobuf.b
    public void a() {
        h();
    }

    public com.google.protobuf.c b() {
        this.f45557d = true;
        return e();
    }

    public com.google.protobuf.t9 c() {
        com.google.protobuf.c cVar = this.f45556c;
        this.f45556c = (com.google.protobuf.c) (cVar != null ? cVar.getDefaultInstanceForType() : this.f45555b.getDefaultInstanceForType());
        com.google.protobuf.a aVar = this.f45555b;
        if (aVar != null) {
            aVar.dispose();
            this.f45555b = null;
        }
        h();
        return this;
    }

    public com.google.protobuf.a d() {
        if (this.f45555b == null) {
            com.google.protobuf.a aVar = (com.google.protobuf.a) this.f45556c.newBuilderForType(this);
            this.f45555b = aVar;
            aVar.mergeFrom((com.google.protobuf.k8) this.f45556c);
            this.f45555b.markClean();
        }
        return this.f45555b;
    }

    public com.google.protobuf.c e() {
        if (this.f45556c == null) {
            this.f45556c = (com.google.protobuf.c) this.f45555b.buildPartial();
        }
        return this.f45556c;
    }

    public com.google.protobuf.r8 f() {
        com.google.protobuf.a aVar = this.f45555b;
        return aVar != null ? aVar : this.f45556c;
    }

    public com.google.protobuf.t9 g(com.google.protobuf.c cVar) {
        if (this.f45555b == null) {
            com.google.protobuf.k8 k8Var = this.f45556c;
            if (k8Var == k8Var.getDefaultInstanceForType()) {
                this.f45556c = cVar;
                h();
                return this;
            }
        }
        d().mergeFrom((com.google.protobuf.k8) cVar);
        h();
        return this;
    }

    public final void h() {
        com.google.protobuf.b bVar;
        if (this.f45555b != null) {
            this.f45556c = null;
        }
        if (!this.f45557d || (bVar = this.f45554a) == null) {
            return;
        }
        bVar.a();
        this.f45557d = false;
    }

    public com.google.protobuf.t9 i(com.google.protobuf.c cVar) {
        java.nio.charset.Charset charset = com.google.protobuf.w6.f45648a;
        cVar.getClass();
        this.f45556c = cVar;
        com.google.protobuf.a aVar = this.f45555b;
        if (aVar != null) {
            aVar.dispose();
            this.f45555b = null;
        }
        h();
        return this;
    }
}
