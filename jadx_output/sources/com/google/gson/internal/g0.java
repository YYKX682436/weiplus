package com.google.gson.internal;

/* loaded from: classes16.dex */
public class g0 extends com.google.gson.internal.j0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.reflect.Method f44813a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f44814b;

    public g0(java.lang.reflect.Method method, int i17) {
        this.f44813a = method;
        this.f44814b = i17;
    }

    @Override // com.google.gson.internal.j0
    public java.lang.Object b(java.lang.Class cls) {
        com.google.gson.internal.j0.a(cls);
        return this.f44813a.invoke(null, cls, java.lang.Integer.valueOf(this.f44814b));
    }
}
