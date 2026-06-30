package com.google.protobuf;

/* loaded from: classes16.dex */
public final class h4 extends com.google.protobuf.e4 {

    /* renamed from: d, reason: collision with root package name */
    public final com.google.protobuf.z2 f45160d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f45161e;

    /* renamed from: f, reason: collision with root package name */
    public final com.google.protobuf.d4 f45162f;

    /* renamed from: g, reason: collision with root package name */
    public final com.google.protobuf.f4[] f45163g;

    public h4(com.google.protobuf.z2 z2Var, com.google.protobuf.d4 d4Var, int i17, com.google.protobuf.q3 q3Var) {
        super(null);
        this.f45160d = z2Var;
        this.f45161e = com.google.protobuf.i4.a(d4Var, null, z2Var.getName());
        this.f45162f = d4Var;
        this.f45163g = new com.google.protobuf.f4[z2Var.f45773f.size()];
        for (int i18 = 0; i18 < z2Var.f45773f.size(); i18++) {
            this.f45163g[i18] = new com.google.protobuf.f4((com.google.protobuf.m2) z2Var.f45773f.get(i18), d4Var, this, i18, null);
        }
        d4Var.f45010m.b(this);
    }

    @Override // com.google.protobuf.e4
    public java.lang.String getName() {
        return this.f45160d.getName();
    }

    @Override // com.google.protobuf.e4
    public com.google.protobuf.d4 h() {
        return this.f45162f;
    }

    @Override // com.google.protobuf.e4
    public java.lang.String i() {
        return this.f45161e;
    }

    @Override // com.google.protobuf.e4
    public com.google.protobuf.k8 j() {
        return this.f45160d;
    }
}
