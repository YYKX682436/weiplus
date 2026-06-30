package com.google.gson.internal;

/* loaded from: classes16.dex */
public class f0 extends com.google.gson.internal.j0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.reflect.Method f44811a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f44812b;

    public f0(java.lang.reflect.Method method, java.lang.Object obj) {
        this.f44811a = method;
        this.f44812b = obj;
    }

    @Override // com.google.gson.internal.j0
    public java.lang.Object b(java.lang.Class cls) {
        com.google.gson.internal.j0.a(cls);
        return this.f44811a.invoke(this.f44812b, cls);
    }
}
