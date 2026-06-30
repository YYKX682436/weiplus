package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public final class h4 extends com.p176xb6135e39.p283xc50a8b8b.e4 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p176xb6135e39.p283xc50a8b8b.z2 f126693d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f126694e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p176xb6135e39.p283xc50a8b8b.d4 f126695f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p176xb6135e39.p283xc50a8b8b.f4[] f126696g;

    public h4(com.p176xb6135e39.p283xc50a8b8b.z2 z2Var, com.p176xb6135e39.p283xc50a8b8b.d4 d4Var, int i17, com.p176xb6135e39.p283xc50a8b8b.q3 q3Var) {
        super(null);
        this.f126693d = z2Var;
        this.f126694e = com.p176xb6135e39.p283xc50a8b8b.i4.a(d4Var, null, z2Var.m20971xfb82e301());
        this.f126695f = d4Var;
        this.f126696g = new com.p176xb6135e39.p283xc50a8b8b.f4[z2Var.f127306f.size()];
        for (int i18 = 0; i18 < z2Var.f127306f.size(); i18++) {
            this.f126696g[i18] = new com.p176xb6135e39.p283xc50a8b8b.f4((com.p176xb6135e39.p283xc50a8b8b.m2) z2Var.f127306f.get(i18), d4Var, this, i18, null);
        }
        d4Var.f126543m.b(this);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.e4
    /* renamed from: getName */
    public java.lang.String mo20569xfb82e301() {
        return this.f126693d.m20971xfb82e301();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.e4
    public com.p176xb6135e39.p283xc50a8b8b.d4 h() {
        return this.f126695f;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.e4
    public java.lang.String i() {
        return this.f126694e;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.e4
    public com.p176xb6135e39.p283xc50a8b8b.k8 j() {
        return this.f126693d;
    }
}
