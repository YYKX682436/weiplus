package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public class x5 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p176xb6135e39.p283xc50a8b8b.r3 f127212a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.reflect.Method f127213b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.reflect.Method f127214c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.reflect.Method f127215d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p176xb6135e39.p283xc50a8b8b.b4 f127216e;

    public x5(com.p176xb6135e39.p283xc50a8b8b.r3 r3Var, int i17, java.lang.String str, java.lang.Class cls, java.lang.Class cls2) {
        this.f127212a = r3Var;
        com.p176xb6135e39.p283xc50a8b8b.b4[] b4VarArr = ((com.p176xb6135e39.p283xc50a8b8b.g4) r3Var.p().get(i17)).f126666m;
        if (b4VarArr.length == 1 && b4VarArr[0].f126446i) {
            this.f127213b = null;
            this.f127214c = null;
            this.f127216e = (com.p176xb6135e39.p283xc50a8b8b.b4) java.util.Collections.unmodifiableList(java.util.Arrays.asList(b4VarArr)).get(0);
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 7);
            sb6.append("get");
            sb6.append(str);
            sb6.append("Case");
            this.f127213b = com.p176xb6135e39.p283xc50a8b8b.l6.m20738xbf18579f(cls, sb6.toString(), new java.lang.Class[0]);
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 7);
            sb7.append("get");
            sb7.append(str);
            sb7.append("Case");
            this.f127214c = com.p176xb6135e39.p283xc50a8b8b.l6.m20738xbf18579f(cls2, sb7.toString(), new java.lang.Class[0]);
            this.f127216e = null;
        }
        java.lang.String valueOf = java.lang.String.valueOf(str);
        this.f127215d = com.p176xb6135e39.p283xc50a8b8b.l6.m20738xbf18579f(cls2, valueOf.length() != 0 ? "clear".concat(valueOf) : new java.lang.String("clear"), new java.lang.Class[0]);
    }
}
