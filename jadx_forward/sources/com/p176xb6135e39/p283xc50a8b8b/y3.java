package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public final class y3 extends com.p176xb6135e39.p283xc50a8b8b.e4 implements com.p176xb6135e39.p283xc50a8b8b.p6 {

    /* renamed from: d, reason: collision with root package name */
    public final int f127259d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p176xb6135e39.p283xc50a8b8b.j1 f127260e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f127261f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p176xb6135e39.p283xc50a8b8b.d4 f127262g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p176xb6135e39.p283xc50a8b8b.x3 f127263h;

    public y3(com.p176xb6135e39.p283xc50a8b8b.j1 j1Var, com.p176xb6135e39.p283xc50a8b8b.d4 d4Var, com.p176xb6135e39.p283xc50a8b8b.x3 x3Var, int i17, com.p176xb6135e39.p283xc50a8b8b.q3 q3Var) {
        super(null);
        this.f127259d = i17;
        this.f127260e = j1Var;
        this.f127262g = d4Var;
        this.f127263h = x3Var;
        java.lang.String str = x3Var.f127206e;
        java.lang.String m20719xfb82e301 = j1Var.m20719xfb82e301();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 1 + java.lang.String.valueOf(m20719xfb82e301).length());
        sb6.append(str);
        sb6.append('.');
        sb6.append(m20719xfb82e301);
        this.f127261f = sb6.toString();
        d4Var.f126543m.b(this);
        com.p176xb6135e39.p283xc50a8b8b.v3 v3Var = d4Var.f126543m;
        v3Var.getClass();
        com.p176xb6135e39.p283xc50a8b8b.s3 s3Var = new com.p176xb6135e39.p283xc50a8b8b.s3(x3Var, j1Var.f126753f);
        java.util.HashMap hashMap = (java.util.HashMap) v3Var.f127142e;
        com.p176xb6135e39.p283xc50a8b8b.y3 y3Var = (com.p176xb6135e39.p283xc50a8b8b.y3) hashMap.put(s3Var, this);
        if (y3Var != null) {
            hashMap.put(s3Var, y3Var);
        }
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.e4
    /* renamed from: getName */
    public java.lang.String mo20569xfb82e301() {
        return this.f127260e.m20719xfb82e301();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p6
    /* renamed from: getNumber */
    public int mo20656x276ffe3f() {
        return this.f127260e.f126753f;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.e4
    public com.p176xb6135e39.p283xc50a8b8b.d4 h() {
        return this.f127262g;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.e4
    public java.lang.String i() {
        return this.f127261f;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.e4
    public com.p176xb6135e39.p283xc50a8b8b.k8 j() {
        return this.f127260e;
    }

    /* renamed from: toString */
    public java.lang.String m20964x9616526c() {
        return this.f127260e.m20719xfb82e301();
    }

    public y3(com.p176xb6135e39.p283xc50a8b8b.d4 d4Var, com.p176xb6135e39.p283xc50a8b8b.x3 x3Var, java.lang.Integer num, com.p176xb6135e39.p283xc50a8b8b.q3 q3Var) {
        super(null);
        java.lang.String mo20569xfb82e301 = x3Var.mo20569xfb82e301();
        java.lang.String valueOf = java.lang.String.valueOf(num);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(java.lang.String.valueOf(mo20569xfb82e301).length() + 20 + valueOf.length());
        sb6.append("UNKNOWN_ENUM_VALUE_");
        sb6.append(mo20569xfb82e301);
        sb6.append("_");
        sb6.append(valueOf);
        java.lang.String sb7 = sb6.toString();
        com.p176xb6135e39.p283xc50a8b8b.i1 mo20599xaaa148a0 = com.p176xb6135e39.p283xc50a8b8b.j1.f126749i.mo20599xaaa148a0();
        sb7.getClass();
        mo20599xaaa148a0.f126708d |= 1;
        mo20599xaaa148a0.f126709e = sb7;
        mo20599xaaa148a0.m20881x7bb163d5();
        int intValue = num.intValue();
        mo20599xaaa148a0.f126708d |= 2;
        mo20599xaaa148a0.f126710f = intValue;
        mo20599xaaa148a0.m20881x7bb163d5();
        com.p176xb6135e39.p283xc50a8b8b.j1 mo20557x85702333 = mo20599xaaa148a0.mo20557x85702333();
        if (mo20557x85702333.mo20562xf582434a()) {
            this.f127259d = -1;
            this.f127260e = mo20557x85702333;
            this.f127262g = d4Var;
            this.f127263h = x3Var;
            java.lang.String m20719xfb82e301 = mo20557x85702333.m20719xfb82e301();
            java.lang.String str = x3Var.f127206e;
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 1 + java.lang.String.valueOf(m20719xfb82e301).length());
            sb8.append(str);
            sb8.append('.');
            sb8.append(m20719xfb82e301);
            this.f127261f = sb8.toString();
            return;
        }
        throw com.p176xb6135e39.p283xc50a8b8b.a.m20517xb3590f03((com.p176xb6135e39.p283xc50a8b8b.k8) mo20557x85702333);
    }
}
