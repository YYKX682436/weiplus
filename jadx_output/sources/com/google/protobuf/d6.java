package com.google.protobuf;

/* loaded from: classes16.dex */
public final class d6 extends com.google.protobuf.g6 {

    /* renamed from: f, reason: collision with root package name */
    public final com.google.protobuf.x3 f45018f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.reflect.Method f45019g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.reflect.Method f45020h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f45021i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.reflect.Method f45022j;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.reflect.Method f45023k;

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.reflect.Method f45024l;

    public d6(com.google.protobuf.b4 b4Var, java.lang.String str, java.lang.Class cls, java.lang.Class cls2, java.lang.String str2) {
        super(b4Var, str, cls, cls2, str2);
        this.f45018f = b4Var.m();
        this.f45019g = com.google.protobuf.l6.access$1000(this.f45135a, "valueOf", new java.lang.Class[]{com.google.protobuf.y3.class});
        this.f45020h = com.google.protobuf.l6.access$1000(this.f45135a, "getValueDescriptor", new java.lang.Class[0]);
        boolean z17 = b4Var.f44911g.m() == com.google.protobuf.c4.PROTO3;
        this.f45021i = z17;
        if (z17) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 8);
            sb6.append("get");
            sb6.append(str);
            sb6.append("Value");
            this.f45022j = com.google.protobuf.l6.access$1000(cls, sb6.toString(), new java.lang.Class[0]);
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 8);
            sb7.append("get");
            sb7.append(str);
            sb7.append("Value");
            this.f45023k = com.google.protobuf.l6.access$1000(cls2, sb7.toString(), new java.lang.Class[0]);
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 8);
            sb8.append("set");
            sb8.append(str);
            sb8.append("Value");
            this.f45024l = com.google.protobuf.l6.access$1000(cls2, sb8.toString(), new java.lang.Class[]{java.lang.Integer.TYPE});
        }
    }

    @Override // com.google.protobuf.g6, com.google.protobuf.v5
    public void c(com.google.protobuf.q5 q5Var, java.lang.Object obj) {
        if (this.f45021i) {
            com.google.protobuf.l6.access$1100(this.f45024l, q5Var, new java.lang.Object[]{java.lang.Integer.valueOf(((com.google.protobuf.y3) obj).f45727e.f45220f)});
        } else {
            super.c(q5Var, com.google.protobuf.l6.access$1100(this.f45019g, null, new java.lang.Object[]{obj}));
        }
    }

    @Override // com.google.protobuf.g6, com.google.protobuf.v5
    public java.lang.Object m(com.google.protobuf.l6 l6Var) {
        if (this.f45021i) {
            return this.f45018f.m(((java.lang.Integer) com.google.protobuf.l6.access$1100(this.f45022j, l6Var, new java.lang.Object[0])).intValue());
        }
        return com.google.protobuf.l6.access$1100(this.f45020h, super.m(l6Var), new java.lang.Object[0]);
    }

    @Override // com.google.protobuf.g6, com.google.protobuf.v5
    public java.lang.Object n(com.google.protobuf.q5 q5Var) {
        if (this.f45021i) {
            return this.f45018f.m(((java.lang.Integer) com.google.protobuf.l6.access$1100(this.f45023k, q5Var, new java.lang.Object[0])).intValue());
        }
        return com.google.protobuf.l6.access$1100(this.f45020h, super.n(q5Var), new java.lang.Object[0]);
    }
}
