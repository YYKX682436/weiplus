package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public final class i6 extends com.p176xb6135e39.p283xc50a8b8b.g6 {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.reflect.Method f126726f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.reflect.Method f126727g;

    public i6(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var, java.lang.String str, java.lang.Class cls, java.lang.Class cls2, java.lang.String str2) {
        super(b4Var, str, cls, cls2, str2);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 8);
        sb6.append("get");
        sb6.append(str);
        sb6.append("Bytes");
        this.f126726f = com.p176xb6135e39.p283xc50a8b8b.l6.m20738xbf18579f(cls, sb6.toString(), new java.lang.Class[0]);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 8);
        sb7.append("get");
        sb7.append(str);
        sb7.append("Bytes");
        com.p176xb6135e39.p283xc50a8b8b.l6.m20738xbf18579f(cls2, sb7.toString(), new java.lang.Class[0]);
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 8);
        sb8.append("set");
        sb8.append(str);
        sb8.append("Bytes");
        this.f126727g = com.p176xb6135e39.p283xc50a8b8b.l6.m20738xbf18579f(cls2, sb8.toString(), new java.lang.Class[]{com.p176xb6135e39.p283xc50a8b8b.y.class});
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.g6, com.p176xb6135e39.p283xc50a8b8b.v5
    public java.lang.Object a(com.p176xb6135e39.p283xc50a8b8b.l6 l6Var) {
        return com.p176xb6135e39.p283xc50a8b8b.l6.m20739xbf185b60(this.f126726f, l6Var, new java.lang.Object[0]);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.g6, com.p176xb6135e39.p283xc50a8b8b.v5
    public void c(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var, java.lang.Object obj) {
        if (obj instanceof com.p176xb6135e39.p283xc50a8b8b.y) {
            com.p176xb6135e39.p283xc50a8b8b.l6.m20739xbf185b60(this.f126727g, q5Var, new java.lang.Object[]{obj});
        } else {
            super.c(q5Var, obj);
        }
    }
}
