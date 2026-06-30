package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public final class x3 extends com.p176xb6135e39.p283xc50a8b8b.e4 implements com.p176xb6135e39.p283xc50a8b8b.q6 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p176xb6135e39.p283xc50a8b8b.d1 f127205d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f127206e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p176xb6135e39.p283xc50a8b8b.d4 f127207f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p176xb6135e39.p283xc50a8b8b.y3[] f127208g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.WeakHashMap f127209h;

    public x3(com.p176xb6135e39.p283xc50a8b8b.d1 d1Var, com.p176xb6135e39.p283xc50a8b8b.d4 d4Var, com.p176xb6135e39.p283xc50a8b8b.r3 r3Var, int i17, com.p176xb6135e39.p283xc50a8b8b.q3 q3Var) {
        super(null);
        this.f127209h = new java.util.WeakHashMap();
        this.f127205d = d1Var;
        this.f127206e = com.p176xb6135e39.p283xc50a8b8b.i4.a(d4Var, r3Var, d1Var.m20614xfb82e301());
        this.f127207f = d4Var;
        if (d1Var.f126532f.size() == 0) {
            throw new com.p176xb6135e39.p283xc50a8b8b.w3(this, "Enums must contain at least one value.");
        }
        this.f127208g = new com.p176xb6135e39.p283xc50a8b8b.y3[d1Var.f126532f.size()];
        for (int i18 = 0; i18 < d1Var.f126532f.size(); i18++) {
            this.f127208g[i18] = new com.p176xb6135e39.p283xc50a8b8b.y3((com.p176xb6135e39.p283xc50a8b8b.j1) d1Var.f126532f.get(i18), d4Var, this, i18, null);
        }
        d4Var.f126543m.b(this);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.e4
    /* renamed from: getName */
    public java.lang.String mo20569xfb82e301() {
        return this.f127205d.m20614xfb82e301();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.e4
    public com.p176xb6135e39.p283xc50a8b8b.d4 h() {
        return this.f127207f;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.e4
    public java.lang.String i() {
        return this.f127206e;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.e4
    public com.p176xb6135e39.p283xc50a8b8b.k8 j() {
        return this.f127205d;
    }

    public com.p176xb6135e39.p283xc50a8b8b.y3 k(java.lang.String str) {
        com.p176xb6135e39.p283xc50a8b8b.v3 v3Var = this.f127207f.f126543m;
        java.lang.String str2 = this.f127206e;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(java.lang.String.valueOf(str2).length() + 1 + java.lang.String.valueOf(str).length());
        sb6.append(str2);
        sb6.append('.');
        sb6.append(str);
        com.p176xb6135e39.p283xc50a8b8b.e4 c17 = v3Var.c(sb6.toString(), com.p176xb6135e39.p283xc50a8b8b.u3.ALL_SYMBOLS);
        if (c17 == null || !(c17 instanceof com.p176xb6135e39.p283xc50a8b8b.y3)) {
            return null;
        }
        return (com.p176xb6135e39.p283xc50a8b8b.y3) c17;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q6
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public com.p176xb6135e39.p283xc50a8b8b.y3 mo20884xd369f9d8(int i17) {
        return (com.p176xb6135e39.p283xc50a8b8b.y3) ((java.util.HashMap) this.f127207f.f126543m.f127142e).get(new com.p176xb6135e39.p283xc50a8b8b.s3(this, i17));
    }

    public com.p176xb6135e39.p283xc50a8b8b.y3 m(int i17) {
        com.p176xb6135e39.p283xc50a8b8b.y3 mo20884xd369f9d8 = mo20884xd369f9d8(i17);
        if (mo20884xd369f9d8 != null) {
            return mo20884xd369f9d8;
        }
        synchronized (this) {
            java.lang.Integer num = new java.lang.Integer(i17);
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) this.f127209h.get(num);
            if (weakReference != null) {
                mo20884xd369f9d8 = (com.p176xb6135e39.p283xc50a8b8b.y3) weakReference.get();
            }
            if (mo20884xd369f9d8 == null) {
                mo20884xd369f9d8 = new com.p176xb6135e39.p283xc50a8b8b.y3(this.f127207f, this, num, null);
                this.f127209h.put(num, new java.lang.ref.WeakReference(mo20884xd369f9d8));
            }
        }
        return mo20884xd369f9d8;
    }
}
