package com.google.protobuf;

/* loaded from: classes16.dex */
public class x5 {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.protobuf.r3 f45679a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.reflect.Method f45680b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.reflect.Method f45681c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.reflect.Method f45682d;

    /* renamed from: e, reason: collision with root package name */
    public final com.google.protobuf.b4 f45683e;

    public x5(com.google.protobuf.r3 r3Var, int i17, java.lang.String str, java.lang.Class cls, java.lang.Class cls2) {
        this.f45679a = r3Var;
        com.google.protobuf.b4[] b4VarArr = ((com.google.protobuf.g4) r3Var.p().get(i17)).f45133m;
        if (b4VarArr.length == 1 && b4VarArr[0].f44913i) {
            this.f45680b = null;
            this.f45681c = null;
            this.f45683e = (com.google.protobuf.b4) java.util.Collections.unmodifiableList(java.util.Arrays.asList(b4VarArr)).get(0);
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 7);
            sb6.append("get");
            sb6.append(str);
            sb6.append("Case");
            this.f45680b = com.google.protobuf.l6.access$1000(cls, sb6.toString(), new java.lang.Class[0]);
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 7);
            sb7.append("get");
            sb7.append(str);
            sb7.append("Case");
            this.f45681c = com.google.protobuf.l6.access$1000(cls2, sb7.toString(), new java.lang.Class[0]);
            this.f45683e = null;
        }
        java.lang.String valueOf = java.lang.String.valueOf(str);
        this.f45682d = com.google.protobuf.l6.access$1000(cls2, valueOf.length() != 0 ? "clear".concat(valueOf) : new java.lang.String("clear"), new java.lang.Class[0]);
    }
}
