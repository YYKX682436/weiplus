package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public final class d6 extends com.p176xb6135e39.p283xc50a8b8b.g6 {

    /* renamed from: f, reason: collision with root package name */
    public final com.p176xb6135e39.p283xc50a8b8b.x3 f126551f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.reflect.Method f126552g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.reflect.Method f126553h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f126554i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.reflect.Method f126555j;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.reflect.Method f126556k;

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.reflect.Method f126557l;

    public d6(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var, java.lang.String str, java.lang.Class cls, java.lang.Class cls2, java.lang.String str2) {
        super(b4Var, str, cls, cls2, str2);
        this.f126551f = b4Var.m();
        this.f126552g = com.p176xb6135e39.p283xc50a8b8b.l6.m20738xbf18579f(this.f126668a, "valueOf", new java.lang.Class[]{com.p176xb6135e39.p283xc50a8b8b.y3.class});
        this.f126553h = com.p176xb6135e39.p283xc50a8b8b.l6.m20738xbf18579f(this.f126668a, "getValueDescriptor", new java.lang.Class[0]);
        boolean z17 = b4Var.f126444g.m() == com.p176xb6135e39.p283xc50a8b8b.c4.PROTO3;
        this.f126554i = z17;
        if (z17) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 8);
            sb6.append("get");
            sb6.append(str);
            sb6.append("Value");
            this.f126555j = com.p176xb6135e39.p283xc50a8b8b.l6.m20738xbf18579f(cls, sb6.toString(), new java.lang.Class[0]);
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 8);
            sb7.append("get");
            sb7.append(str);
            sb7.append("Value");
            this.f126556k = com.p176xb6135e39.p283xc50a8b8b.l6.m20738xbf18579f(cls2, sb7.toString(), new java.lang.Class[0]);
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 8);
            sb8.append("set");
            sb8.append(str);
            sb8.append("Value");
            this.f126557l = com.p176xb6135e39.p283xc50a8b8b.l6.m20738xbf18579f(cls2, sb8.toString(), new java.lang.Class[]{java.lang.Integer.TYPE});
        }
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.g6, com.p176xb6135e39.p283xc50a8b8b.v5
    public void c(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var, java.lang.Object obj) {
        if (this.f126554i) {
            com.p176xb6135e39.p283xc50a8b8b.l6.m20739xbf185b60(this.f126557l, q5Var, new java.lang.Object[]{java.lang.Integer.valueOf(((com.p176xb6135e39.p283xc50a8b8b.y3) obj).f127260e.f126753f)});
        } else {
            super.c(q5Var, com.p176xb6135e39.p283xc50a8b8b.l6.m20739xbf185b60(this.f126552g, null, new java.lang.Object[]{obj}));
        }
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.g6, com.p176xb6135e39.p283xc50a8b8b.v5
    public java.lang.Object m(com.p176xb6135e39.p283xc50a8b8b.l6 l6Var) {
        if (this.f126554i) {
            return this.f126551f.m(((java.lang.Integer) com.p176xb6135e39.p283xc50a8b8b.l6.m20739xbf185b60(this.f126555j, l6Var, new java.lang.Object[0])).intValue());
        }
        return com.p176xb6135e39.p283xc50a8b8b.l6.m20739xbf185b60(this.f126553h, super.m(l6Var), new java.lang.Object[0]);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.g6, com.p176xb6135e39.p283xc50a8b8b.v5
    public java.lang.Object n(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var) {
        if (this.f126554i) {
            return this.f126551f.m(((java.lang.Integer) com.p176xb6135e39.p283xc50a8b8b.l6.m20739xbf185b60(this.f126556k, q5Var, new java.lang.Object[0])).intValue());
        }
        return com.p176xb6135e39.p283xc50a8b8b.l6.m20739xbf185b60(this.f126553h, super.n(q5Var), new java.lang.Object[0]);
    }
}
