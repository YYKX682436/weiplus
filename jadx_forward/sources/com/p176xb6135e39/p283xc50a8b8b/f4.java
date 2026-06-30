package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public final class f4 extends com.p176xb6135e39.p283xc50a8b8b.e4 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p176xb6135e39.p283xc50a8b8b.m2 f126607d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f126608e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p176xb6135e39.p283xc50a8b8b.d4 f126609f;

    public f4(com.p176xb6135e39.p283xc50a8b8b.m2 m2Var, com.p176xb6135e39.p283xc50a8b8b.d4 d4Var, com.p176xb6135e39.p283xc50a8b8b.h4 h4Var, int i17, com.p176xb6135e39.p283xc50a8b8b.q3 q3Var) {
        super(null);
        this.f126607d = m2Var;
        this.f126609f = d4Var;
        java.lang.String str = h4Var.f126694e;
        java.lang.String m20789xfb82e301 = m2Var.m20789xfb82e301();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 1 + java.lang.String.valueOf(m20789xfb82e301).length());
        sb6.append(str);
        sb6.append('.');
        sb6.append(m20789xfb82e301);
        this.f126608e = sb6.toString();
        d4Var.f126543m.b(this);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.e4
    /* renamed from: getName */
    public java.lang.String mo20569xfb82e301() {
        return this.f126607d.m20789xfb82e301();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.e4
    public com.p176xb6135e39.p283xc50a8b8b.d4 h() {
        return this.f126609f;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.e4
    public java.lang.String i() {
        return this.f126608e;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.e4
    public com.p176xb6135e39.p283xc50a8b8b.k8 j() {
        return this.f126607d;
    }
}
