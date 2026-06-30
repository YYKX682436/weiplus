package com.google.protobuf;

/* loaded from: classes16.dex */
public final class y3 extends com.google.protobuf.e4 implements com.google.protobuf.p6 {

    /* renamed from: d, reason: collision with root package name */
    public final int f45726d;

    /* renamed from: e, reason: collision with root package name */
    public final com.google.protobuf.j1 f45727e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f45728f;

    /* renamed from: g, reason: collision with root package name */
    public final com.google.protobuf.d4 f45729g;

    /* renamed from: h, reason: collision with root package name */
    public final com.google.protobuf.x3 f45730h;

    public y3(com.google.protobuf.j1 j1Var, com.google.protobuf.d4 d4Var, com.google.protobuf.x3 x3Var, int i17, com.google.protobuf.q3 q3Var) {
        super(null);
        this.f45726d = i17;
        this.f45727e = j1Var;
        this.f45729g = d4Var;
        this.f45730h = x3Var;
        java.lang.String str = x3Var.f45673e;
        java.lang.String name = j1Var.getName();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 1 + java.lang.String.valueOf(name).length());
        sb6.append(str);
        sb6.append('.');
        sb6.append(name);
        this.f45728f = sb6.toString();
        d4Var.f45010m.b(this);
        com.google.protobuf.v3 v3Var = d4Var.f45010m;
        v3Var.getClass();
        com.google.protobuf.s3 s3Var = new com.google.protobuf.s3(x3Var, j1Var.f45220f);
        java.util.HashMap hashMap = (java.util.HashMap) v3Var.f45609e;
        com.google.protobuf.y3 y3Var = (com.google.protobuf.y3) hashMap.put(s3Var, this);
        if (y3Var != null) {
            hashMap.put(s3Var, y3Var);
        }
    }

    @Override // com.google.protobuf.e4
    public java.lang.String getName() {
        return this.f45727e.getName();
    }

    @Override // com.google.protobuf.p6
    public int getNumber() {
        return this.f45727e.f45220f;
    }

    @Override // com.google.protobuf.e4
    public com.google.protobuf.d4 h() {
        return this.f45729g;
    }

    @Override // com.google.protobuf.e4
    public java.lang.String i() {
        return this.f45728f;
    }

    @Override // com.google.protobuf.e4
    public com.google.protobuf.k8 j() {
        return this.f45727e;
    }

    public java.lang.String toString() {
        return this.f45727e.getName();
    }

    public y3(com.google.protobuf.d4 d4Var, com.google.protobuf.x3 x3Var, java.lang.Integer num, com.google.protobuf.q3 q3Var) {
        super(null);
        java.lang.String name = x3Var.getName();
        java.lang.String valueOf = java.lang.String.valueOf(num);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(java.lang.String.valueOf(name).length() + 20 + valueOf.length());
        sb6.append("UNKNOWN_ENUM_VALUE_");
        sb6.append(name);
        sb6.append("_");
        sb6.append(valueOf);
        java.lang.String sb7 = sb6.toString();
        com.google.protobuf.i1 builder = com.google.protobuf.j1.f45216i.toBuilder();
        sb7.getClass();
        builder.f45175d |= 1;
        builder.f45176e = sb7;
        builder.onChanged();
        int intValue = num.intValue();
        builder.f45175d |= 2;
        builder.f45177f = intValue;
        builder.onChanged();
        com.google.protobuf.j1 buildPartial = builder.buildPartial();
        if (buildPartial.isInitialized()) {
            this.f45726d = -1;
            this.f45727e = buildPartial;
            this.f45729g = d4Var;
            this.f45730h = x3Var;
            java.lang.String name2 = buildPartial.getName();
            java.lang.String str = x3Var.f45673e;
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 1 + java.lang.String.valueOf(name2).length());
            sb8.append(str);
            sb8.append('.');
            sb8.append(name2);
            this.f45728f = sb8.toString();
            return;
        }
        throw com.google.protobuf.a.newUninitializedMessageException((com.google.protobuf.k8) buildPartial);
    }
}
