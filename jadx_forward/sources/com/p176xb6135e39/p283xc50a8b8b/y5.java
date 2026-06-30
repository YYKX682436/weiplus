package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public final class y5 extends com.p176xb6135e39.p283xc50a8b8b.b6 {

    /* renamed from: c, reason: collision with root package name */
    public final com.p176xb6135e39.p283xc50a8b8b.x3 f127264c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.reflect.Method f127265d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.reflect.Method f127266e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f127267f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.reflect.Method f127268g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.reflect.Method f127269h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.reflect.Method f127270i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.reflect.Method f127271j;

    public y5(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var, java.lang.String str, java.lang.Class cls, java.lang.Class cls2) {
        super(b4Var, str, cls, cls2);
        this.f127264c = b4Var.m();
        this.f127265d = com.p176xb6135e39.p283xc50a8b8b.l6.m20738xbf18579f(this.f126457a, "valueOf", new java.lang.Class[]{com.p176xb6135e39.p283xc50a8b8b.y3.class});
        this.f127266e = com.p176xb6135e39.p283xc50a8b8b.l6.m20738xbf18579f(this.f126457a, "getValueDescriptor", new java.lang.Class[0]);
        boolean z17 = b4Var.f126444g.m() == com.p176xb6135e39.p283xc50a8b8b.c4.PROTO3;
        this.f127267f = z17;
        if (z17) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 8);
            sb6.append("get");
            sb6.append(str);
            sb6.append("Value");
            java.lang.String sb7 = sb6.toString();
            java.lang.Class cls3 = java.lang.Integer.TYPE;
            this.f127268g = com.p176xb6135e39.p283xc50a8b8b.l6.m20738xbf18579f(cls, sb7, new java.lang.Class[]{cls3});
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 8);
            sb8.append("get");
            sb8.append(str);
            sb8.append("Value");
            this.f127269h = com.p176xb6135e39.p283xc50a8b8b.l6.m20738xbf18579f(cls2, sb8.toString(), new java.lang.Class[]{cls3});
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 8);
            sb9.append("set");
            sb9.append(str);
            sb9.append("Value");
            this.f127270i = com.p176xb6135e39.p283xc50a8b8b.l6.m20738xbf18579f(cls2, sb9.toString(), new java.lang.Class[]{cls3, cls3});
            java.lang.StringBuilder sb10 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 8);
            sb10.append("add");
            sb10.append(str);
            sb10.append("Value");
            this.f127271j = com.p176xb6135e39.p283xc50a8b8b.l6.m20738xbf18579f(cls2, sb10.toString(), new java.lang.Class[]{cls3});
        }
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.b6, com.p176xb6135e39.p283xc50a8b8b.v5
    public void d(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var, java.lang.Object obj) {
        if (this.f127267f) {
            com.p176xb6135e39.p283xc50a8b8b.l6.m20739xbf185b60(this.f127271j, q5Var, new java.lang.Object[]{java.lang.Integer.valueOf(((com.p176xb6135e39.p283xc50a8b8b.y3) obj).f127260e.f126753f)});
        } else {
            super.d(q5Var, com.p176xb6135e39.p283xc50a8b8b.l6.m20739xbf185b60(this.f127265d, null, new java.lang.Object[]{obj}));
        }
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.b6, com.p176xb6135e39.p283xc50a8b8b.v5
    public void f(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var, int i17, java.lang.Object obj) {
        if (this.f127267f) {
            com.p176xb6135e39.p283xc50a8b8b.l6.m20739xbf185b60(this.f127270i, q5Var, new java.lang.Object[]{java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(((com.p176xb6135e39.p283xc50a8b8b.y3) obj).f127260e.f126753f)});
        } else {
            super.f(q5Var, i17, com.p176xb6135e39.p283xc50a8b8b.l6.m20739xbf185b60(this.f127265d, null, new java.lang.Object[]{obj}));
        }
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.b6, com.p176xb6135e39.p283xc50a8b8b.v5
    public java.lang.Object g(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var, int i17) {
        if (!this.f127267f) {
            return com.p176xb6135e39.p283xc50a8b8b.l6.m20739xbf185b60(this.f127266e, super.g(q5Var, i17), new java.lang.Object[0]);
        }
        return this.f127264c.m(((java.lang.Integer) com.p176xb6135e39.p283xc50a8b8b.l6.m20739xbf185b60(this.f127269h, q5Var, new java.lang.Object[]{java.lang.Integer.valueOf(i17)})).intValue());
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.b6, com.p176xb6135e39.p283xc50a8b8b.v5
    public java.lang.Object m(com.p176xb6135e39.p283xc50a8b8b.l6 l6Var) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int b17 = b(l6Var);
        for (int i17 = 0; i17 < b17; i17++) {
            arrayList.add(o(l6Var, i17));
        }
        return java.util.Collections.unmodifiableList(arrayList);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.b6, com.p176xb6135e39.p283xc50a8b8b.v5
    public java.lang.Object n(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int j17 = j(q5Var);
        for (int i17 = 0; i17 < j17; i17++) {
            arrayList.add(g(q5Var, i17));
        }
        return java.util.Collections.unmodifiableList(arrayList);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.b6, com.p176xb6135e39.p283xc50a8b8b.v5
    public java.lang.Object o(com.p176xb6135e39.p283xc50a8b8b.l6 l6Var, int i17) {
        if (!this.f127267f) {
            return com.p176xb6135e39.p283xc50a8b8b.l6.m20739xbf185b60(this.f127266e, super.o(l6Var, i17), new java.lang.Object[0]);
        }
        return this.f127264c.m(((java.lang.Integer) com.p176xb6135e39.p283xc50a8b8b.l6.m20739xbf185b60(this.f127268g, l6Var, new java.lang.Object[]{java.lang.Integer.valueOf(i17)})).intValue());
    }
}
