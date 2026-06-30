package com.google.protobuf;

/* loaded from: classes16.dex */
public final class y5 extends com.google.protobuf.b6 {

    /* renamed from: c, reason: collision with root package name */
    public final com.google.protobuf.x3 f45731c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.reflect.Method f45732d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.reflect.Method f45733e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f45734f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.reflect.Method f45735g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.reflect.Method f45736h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.reflect.Method f45737i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.reflect.Method f45738j;

    public y5(com.google.protobuf.b4 b4Var, java.lang.String str, java.lang.Class cls, java.lang.Class cls2) {
        super(b4Var, str, cls, cls2);
        this.f45731c = b4Var.m();
        this.f45732d = com.google.protobuf.l6.access$1000(this.f44924a, "valueOf", new java.lang.Class[]{com.google.protobuf.y3.class});
        this.f45733e = com.google.protobuf.l6.access$1000(this.f44924a, "getValueDescriptor", new java.lang.Class[0]);
        boolean z17 = b4Var.f44911g.m() == com.google.protobuf.c4.PROTO3;
        this.f45734f = z17;
        if (z17) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 8);
            sb6.append("get");
            sb6.append(str);
            sb6.append("Value");
            java.lang.String sb7 = sb6.toString();
            java.lang.Class cls3 = java.lang.Integer.TYPE;
            this.f45735g = com.google.protobuf.l6.access$1000(cls, sb7, new java.lang.Class[]{cls3});
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 8);
            sb8.append("get");
            sb8.append(str);
            sb8.append("Value");
            this.f45736h = com.google.protobuf.l6.access$1000(cls2, sb8.toString(), new java.lang.Class[]{cls3});
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 8);
            sb9.append("set");
            sb9.append(str);
            sb9.append("Value");
            this.f45737i = com.google.protobuf.l6.access$1000(cls2, sb9.toString(), new java.lang.Class[]{cls3, cls3});
            java.lang.StringBuilder sb10 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 8);
            sb10.append("add");
            sb10.append(str);
            sb10.append("Value");
            this.f45738j = com.google.protobuf.l6.access$1000(cls2, sb10.toString(), new java.lang.Class[]{cls3});
        }
    }

    @Override // com.google.protobuf.b6, com.google.protobuf.v5
    public void d(com.google.protobuf.q5 q5Var, java.lang.Object obj) {
        if (this.f45734f) {
            com.google.protobuf.l6.access$1100(this.f45738j, q5Var, new java.lang.Object[]{java.lang.Integer.valueOf(((com.google.protobuf.y3) obj).f45727e.f45220f)});
        } else {
            super.d(q5Var, com.google.protobuf.l6.access$1100(this.f45732d, null, new java.lang.Object[]{obj}));
        }
    }

    @Override // com.google.protobuf.b6, com.google.protobuf.v5
    public void f(com.google.protobuf.q5 q5Var, int i17, java.lang.Object obj) {
        if (this.f45734f) {
            com.google.protobuf.l6.access$1100(this.f45737i, q5Var, new java.lang.Object[]{java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(((com.google.protobuf.y3) obj).f45727e.f45220f)});
        } else {
            super.f(q5Var, i17, com.google.protobuf.l6.access$1100(this.f45732d, null, new java.lang.Object[]{obj}));
        }
    }

    @Override // com.google.protobuf.b6, com.google.protobuf.v5
    public java.lang.Object g(com.google.protobuf.q5 q5Var, int i17) {
        if (!this.f45734f) {
            return com.google.protobuf.l6.access$1100(this.f45733e, super.g(q5Var, i17), new java.lang.Object[0]);
        }
        return this.f45731c.m(((java.lang.Integer) com.google.protobuf.l6.access$1100(this.f45736h, q5Var, new java.lang.Object[]{java.lang.Integer.valueOf(i17)})).intValue());
    }

    @Override // com.google.protobuf.b6, com.google.protobuf.v5
    public java.lang.Object m(com.google.protobuf.l6 l6Var) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int b17 = b(l6Var);
        for (int i17 = 0; i17 < b17; i17++) {
            arrayList.add(o(l6Var, i17));
        }
        return java.util.Collections.unmodifiableList(arrayList);
    }

    @Override // com.google.protobuf.b6, com.google.protobuf.v5
    public java.lang.Object n(com.google.protobuf.q5 q5Var) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int j17 = j(q5Var);
        for (int i17 = 0; i17 < j17; i17++) {
            arrayList.add(g(q5Var, i17));
        }
        return java.util.Collections.unmodifiableList(arrayList);
    }

    @Override // com.google.protobuf.b6, com.google.protobuf.v5
    public java.lang.Object o(com.google.protobuf.l6 l6Var, int i17) {
        if (!this.f45734f) {
            return com.google.protobuf.l6.access$1100(this.f45733e, super.o(l6Var, i17), new java.lang.Object[0]);
        }
        return this.f45731c.m(((java.lang.Integer) com.google.protobuf.l6.access$1100(this.f45735g, l6Var, new java.lang.Object[]{java.lang.Integer.valueOf(i17)})).intValue());
    }
}
