package com.google.protobuf;

/* loaded from: classes16.dex */
public final class f6 implements com.google.protobuf.e6 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.reflect.Method f45078a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.reflect.Method f45079b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.reflect.Method f45080c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.reflect.Method f45081d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.reflect.Method f45082e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.reflect.Method f45083f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.reflect.Method f45084g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.reflect.Method f45085h;

    public f6(com.google.protobuf.b4 b4Var, java.lang.String str, java.lang.Class cls, java.lang.Class cls2, java.lang.String str2, boolean z17, boolean z18) {
        java.lang.reflect.Method method;
        java.lang.reflect.Method method2;
        java.lang.reflect.Method method3;
        java.lang.String valueOf = java.lang.String.valueOf(str);
        java.lang.reflect.Method access$1000 = com.google.protobuf.l6.access$1000(cls, valueOf.length() != 0 ? "get".concat(valueOf) : new java.lang.String("get"), new java.lang.Class[0]);
        this.f45078a = access$1000;
        java.lang.String valueOf2 = java.lang.String.valueOf(str);
        this.f45079b = com.google.protobuf.l6.access$1000(cls2, valueOf2.length() != 0 ? "get".concat(valueOf2) : new java.lang.String("get"), new java.lang.Class[0]);
        java.lang.Class<?> returnType = access$1000.getReturnType();
        java.lang.String valueOf3 = java.lang.String.valueOf(str);
        this.f45080c = com.google.protobuf.l6.access$1000(cls2, valueOf3.length() != 0 ? "set".concat(valueOf3) : new java.lang.String("set"), new java.lang.Class[]{returnType});
        java.lang.reflect.Method method4 = null;
        if (z18) {
            java.lang.String valueOf4 = java.lang.String.valueOf(str);
            method = com.google.protobuf.l6.access$1000(cls, valueOf4.length() != 0 ? "has".concat(valueOf4) : new java.lang.String("has"), new java.lang.Class[0]);
        } else {
            method = null;
        }
        this.f45081d = method;
        if (z18) {
            java.lang.String valueOf5 = java.lang.String.valueOf(str);
            method2 = com.google.protobuf.l6.access$1000(cls2, valueOf5.length() != 0 ? "has".concat(valueOf5) : new java.lang.String("has"), new java.lang.Class[0]);
        } else {
            method2 = null;
        }
        this.f45082e = method2;
        java.lang.String valueOf6 = java.lang.String.valueOf(str);
        this.f45083f = com.google.protobuf.l6.access$1000(cls2, valueOf6.length() != 0 ? "clear".concat(valueOf6) : new java.lang.String("clear"), new java.lang.Class[0]);
        if (z17) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(java.lang.String.valueOf(str2).length() + 7);
            sb6.append("get");
            sb6.append(str2);
            sb6.append("Case");
            method3 = com.google.protobuf.l6.access$1000(cls, sb6.toString(), new java.lang.Class[0]);
        } else {
            method3 = null;
        }
        this.f45084g = method3;
        if (z17) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder(java.lang.String.valueOf(str2).length() + 7);
            sb7.append("get");
            sb7.append(str2);
            sb7.append("Case");
            method4 = com.google.protobuf.l6.access$1000(cls2, sb7.toString(), new java.lang.Class[0]);
        }
        this.f45085h = method4;
    }
}
