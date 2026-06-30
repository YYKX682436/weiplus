package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public final class f6 implements com.p176xb6135e39.p283xc50a8b8b.e6 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.reflect.Method f126611a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.reflect.Method f126612b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.reflect.Method f126613c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.reflect.Method f126614d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.reflect.Method f126615e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.reflect.Method f126616f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.reflect.Method f126617g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.reflect.Method f126618h;

    public f6(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var, java.lang.String str, java.lang.Class cls, java.lang.Class cls2, java.lang.String str2, boolean z17, boolean z18) {
        java.lang.reflect.Method method;
        java.lang.reflect.Method method2;
        java.lang.reflect.Method method3;
        java.lang.String valueOf = java.lang.String.valueOf(str);
        java.lang.reflect.Method m20738xbf18579f = com.p176xb6135e39.p283xc50a8b8b.l6.m20738xbf18579f(cls, valueOf.length() != 0 ? "get".concat(valueOf) : new java.lang.String("get"), new java.lang.Class[0]);
        this.f126611a = m20738xbf18579f;
        java.lang.String valueOf2 = java.lang.String.valueOf(str);
        this.f126612b = com.p176xb6135e39.p283xc50a8b8b.l6.m20738xbf18579f(cls2, valueOf2.length() != 0 ? "get".concat(valueOf2) : new java.lang.String("get"), new java.lang.Class[0]);
        java.lang.Class<?> returnType = m20738xbf18579f.getReturnType();
        java.lang.String valueOf3 = java.lang.String.valueOf(str);
        this.f126613c = com.p176xb6135e39.p283xc50a8b8b.l6.m20738xbf18579f(cls2, valueOf3.length() != 0 ? "set".concat(valueOf3) : new java.lang.String("set"), new java.lang.Class[]{returnType});
        java.lang.reflect.Method method4 = null;
        if (z18) {
            java.lang.String valueOf4 = java.lang.String.valueOf(str);
            method = com.p176xb6135e39.p283xc50a8b8b.l6.m20738xbf18579f(cls, valueOf4.length() != 0 ? "has".concat(valueOf4) : new java.lang.String("has"), new java.lang.Class[0]);
        } else {
            method = null;
        }
        this.f126614d = method;
        if (z18) {
            java.lang.String valueOf5 = java.lang.String.valueOf(str);
            method2 = com.p176xb6135e39.p283xc50a8b8b.l6.m20738xbf18579f(cls2, valueOf5.length() != 0 ? "has".concat(valueOf5) : new java.lang.String("has"), new java.lang.Class[0]);
        } else {
            method2 = null;
        }
        this.f126615e = method2;
        java.lang.String valueOf6 = java.lang.String.valueOf(str);
        this.f126616f = com.p176xb6135e39.p283xc50a8b8b.l6.m20738xbf18579f(cls2, valueOf6.length() != 0 ? "clear".concat(valueOf6) : new java.lang.String("clear"), new java.lang.Class[0]);
        if (z17) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(java.lang.String.valueOf(str2).length() + 7);
            sb6.append("get");
            sb6.append(str2);
            sb6.append("Case");
            method3 = com.p176xb6135e39.p283xc50a8b8b.l6.m20738xbf18579f(cls, sb6.toString(), new java.lang.Class[0]);
        } else {
            method3 = null;
        }
        this.f126617g = method3;
        if (z17) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder(java.lang.String.valueOf(str2).length() + 7);
            sb7.append("get");
            sb7.append(str2);
            sb7.append("Case");
            method4 = com.p176xb6135e39.p283xc50a8b8b.l6.m20738xbf18579f(cls2, sb7.toString(), new java.lang.Class[0]);
        }
        this.f126618h = method4;
    }
}
