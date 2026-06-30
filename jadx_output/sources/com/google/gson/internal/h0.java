package com.google.gson.internal;

/* loaded from: classes16.dex */
public class h0 extends com.google.gson.internal.j0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.reflect.Method f44815a;

    public h0(java.lang.reflect.Method method) {
        this.f44815a = method;
    }

    @Override // com.google.gson.internal.j0
    public java.lang.Object b(java.lang.Class cls) {
        com.google.gson.internal.j0.a(cls);
        return this.f44815a.invoke(null, cls, java.lang.Object.class);
    }
}
