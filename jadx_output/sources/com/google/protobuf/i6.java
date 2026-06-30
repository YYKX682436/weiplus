package com.google.protobuf;

/* loaded from: classes16.dex */
public final class i6 extends com.google.protobuf.g6 {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.reflect.Method f45193f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.reflect.Method f45194g;

    public i6(com.google.protobuf.b4 b4Var, java.lang.String str, java.lang.Class cls, java.lang.Class cls2, java.lang.String str2) {
        super(b4Var, str, cls, cls2, str2);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 8);
        sb6.append("get");
        sb6.append(str);
        sb6.append("Bytes");
        this.f45193f = com.google.protobuf.l6.access$1000(cls, sb6.toString(), new java.lang.Class[0]);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 8);
        sb7.append("get");
        sb7.append(str);
        sb7.append("Bytes");
        com.google.protobuf.l6.access$1000(cls2, sb7.toString(), new java.lang.Class[0]);
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 8);
        sb8.append("set");
        sb8.append(str);
        sb8.append("Bytes");
        this.f45194g = com.google.protobuf.l6.access$1000(cls2, sb8.toString(), new java.lang.Class[]{com.google.protobuf.y.class});
    }

    @Override // com.google.protobuf.g6, com.google.protobuf.v5
    public java.lang.Object a(com.google.protobuf.l6 l6Var) {
        return com.google.protobuf.l6.access$1100(this.f45193f, l6Var, new java.lang.Object[0]);
    }

    @Override // com.google.protobuf.g6, com.google.protobuf.v5
    public void c(com.google.protobuf.q5 q5Var, java.lang.Object obj) {
        if (obj instanceof com.google.protobuf.y) {
            com.google.protobuf.l6.access$1100(this.f45194g, q5Var, new java.lang.Object[]{obj});
        } else {
            super.c(q5Var, obj);
        }
    }
}
