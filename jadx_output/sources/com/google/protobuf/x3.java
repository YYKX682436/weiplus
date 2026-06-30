package com.google.protobuf;

/* loaded from: classes16.dex */
public final class x3 extends com.google.protobuf.e4 implements com.google.protobuf.q6 {

    /* renamed from: d, reason: collision with root package name */
    public final com.google.protobuf.d1 f45672d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f45673e;

    /* renamed from: f, reason: collision with root package name */
    public final com.google.protobuf.d4 f45674f;

    /* renamed from: g, reason: collision with root package name */
    public final com.google.protobuf.y3[] f45675g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.WeakHashMap f45676h;

    public x3(com.google.protobuf.d1 d1Var, com.google.protobuf.d4 d4Var, com.google.protobuf.r3 r3Var, int i17, com.google.protobuf.q3 q3Var) {
        super(null);
        this.f45676h = new java.util.WeakHashMap();
        this.f45672d = d1Var;
        this.f45673e = com.google.protobuf.i4.a(d4Var, r3Var, d1Var.getName());
        this.f45674f = d4Var;
        if (d1Var.f44999f.size() == 0) {
            throw new com.google.protobuf.w3(this, "Enums must contain at least one value.");
        }
        this.f45675g = new com.google.protobuf.y3[d1Var.f44999f.size()];
        for (int i18 = 0; i18 < d1Var.f44999f.size(); i18++) {
            this.f45675g[i18] = new com.google.protobuf.y3((com.google.protobuf.j1) d1Var.f44999f.get(i18), d4Var, this, i18, null);
        }
        d4Var.f45010m.b(this);
    }

    @Override // com.google.protobuf.e4
    public java.lang.String getName() {
        return this.f45672d.getName();
    }

    @Override // com.google.protobuf.e4
    public com.google.protobuf.d4 h() {
        return this.f45674f;
    }

    @Override // com.google.protobuf.e4
    public java.lang.String i() {
        return this.f45673e;
    }

    @Override // com.google.protobuf.e4
    public com.google.protobuf.k8 j() {
        return this.f45672d;
    }

    public com.google.protobuf.y3 k(java.lang.String str) {
        com.google.protobuf.v3 v3Var = this.f45674f.f45010m;
        java.lang.String str2 = this.f45673e;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(java.lang.String.valueOf(str2).length() + 1 + java.lang.String.valueOf(str).length());
        sb6.append(str2);
        sb6.append('.');
        sb6.append(str);
        com.google.protobuf.e4 c17 = v3Var.c(sb6.toString(), com.google.protobuf.u3.ALL_SYMBOLS);
        if (c17 == null || !(c17 instanceof com.google.protobuf.y3)) {
            return null;
        }
        return (com.google.protobuf.y3) c17;
    }

    @Override // com.google.protobuf.q6
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public com.google.protobuf.y3 findValueByNumber(int i17) {
        return (com.google.protobuf.y3) ((java.util.HashMap) this.f45674f.f45010m.f45609e).get(new com.google.protobuf.s3(this, i17));
    }

    public com.google.protobuf.y3 m(int i17) {
        com.google.protobuf.y3 findValueByNumber = findValueByNumber(i17);
        if (findValueByNumber != null) {
            return findValueByNumber;
        }
        synchronized (this) {
            java.lang.Integer num = new java.lang.Integer(i17);
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) this.f45676h.get(num);
            if (weakReference != null) {
                findValueByNumber = (com.google.protobuf.y3) weakReference.get();
            }
            if (findValueByNumber == null) {
                findValueByNumber = new com.google.protobuf.y3(this.f45674f, this, num, null);
                this.f45676h.put(num, new java.lang.ref.WeakReference(findValueByNumber));
            }
        }
        return findValueByNumber;
    }
}
