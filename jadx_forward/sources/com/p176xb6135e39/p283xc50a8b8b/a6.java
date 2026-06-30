package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public final class a6 implements com.p176xb6135e39.p283xc50a8b8b.z5 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.reflect.Method f126393a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.reflect.Method f126394b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.reflect.Method f126395c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.reflect.Method f126396d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.reflect.Method f126397e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.reflect.Method f126398f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.reflect.Method f126399g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.reflect.Method f126400h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.reflect.Method f126401i;

    public a6(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var, java.lang.String str, java.lang.Class cls, java.lang.Class cls2) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 7);
        sb6.append("get");
        sb6.append(str);
        sb6.append("List");
        this.f126393a = com.p176xb6135e39.p283xc50a8b8b.l6.m20738xbf18579f(cls, sb6.toString(), new java.lang.Class[0]);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 7);
        sb7.append("get");
        sb7.append(str);
        sb7.append("List");
        this.f126394b = com.p176xb6135e39.p283xc50a8b8b.l6.m20738xbf18579f(cls2, sb7.toString(), new java.lang.Class[0]);
        java.lang.String valueOf = java.lang.String.valueOf(str);
        java.lang.String concat = valueOf.length() != 0 ? "get".concat(valueOf) : new java.lang.String("get");
        java.lang.Class cls3 = java.lang.Integer.TYPE;
        java.lang.reflect.Method m20738xbf18579f = com.p176xb6135e39.p283xc50a8b8b.l6.m20738xbf18579f(cls, concat, new java.lang.Class[]{cls3});
        this.f126395c = m20738xbf18579f;
        java.lang.String valueOf2 = java.lang.String.valueOf(str);
        this.f126396d = com.p176xb6135e39.p283xc50a8b8b.l6.m20738xbf18579f(cls2, valueOf2.length() != 0 ? "get".concat(valueOf2) : new java.lang.String("get"), new java.lang.Class[]{cls3});
        java.lang.Class<?> returnType = m20738xbf18579f.getReturnType();
        java.lang.String valueOf3 = java.lang.String.valueOf(str);
        this.f126397e = com.p176xb6135e39.p283xc50a8b8b.l6.m20738xbf18579f(cls2, valueOf3.length() != 0 ? "set".concat(valueOf3) : new java.lang.String("set"), new java.lang.Class[]{cls3, returnType});
        java.lang.String valueOf4 = java.lang.String.valueOf(str);
        this.f126398f = com.p176xb6135e39.p283xc50a8b8b.l6.m20738xbf18579f(cls2, valueOf4.length() != 0 ? "add".concat(valueOf4) : new java.lang.String("add"), new java.lang.Class[]{returnType});
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 8);
        sb8.append("get");
        sb8.append(str);
        sb8.append("Count");
        this.f126399g = com.p176xb6135e39.p283xc50a8b8b.l6.m20738xbf18579f(cls, sb8.toString(), new java.lang.Class[0]);
        java.lang.StringBuilder sb9 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 8);
        sb9.append("get");
        sb9.append(str);
        sb9.append("Count");
        this.f126400h = com.p176xb6135e39.p283xc50a8b8b.l6.m20738xbf18579f(cls2, sb9.toString(), new java.lang.Class[0]);
        java.lang.String valueOf5 = java.lang.String.valueOf(str);
        this.f126401i = com.p176xb6135e39.p283xc50a8b8b.l6.m20738xbf18579f(cls2, valueOf5.length() != 0 ? "clear".concat(valueOf5) : new java.lang.String("clear"), new java.lang.Class[0]);
    }
}
