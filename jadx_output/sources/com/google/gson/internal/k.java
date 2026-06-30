package com.google.gson.internal;

/* loaded from: classes13.dex */
public class k implements com.google.gson.internal.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.reflect.Constructor f44819a;

    public k(com.google.gson.internal.r rVar, java.lang.reflect.Constructor constructor) {
        this.f44819a = constructor;
    }

    @Override // com.google.gson.internal.d0
    public java.lang.Object a() {
        java.lang.reflect.Constructor constructor = this.f44819a;
        try {
            return constructor.newInstance(null);
        } catch (java.lang.IllegalAccessException e17) {
            throw new java.lang.AssertionError(e17);
        } catch (java.lang.InstantiationException e18) {
            throw new java.lang.RuntimeException("Failed to invoke " + constructor + " with no args", e18);
        } catch (java.lang.reflect.InvocationTargetException e19) {
            throw new java.lang.RuntimeException("Failed to invoke " + constructor + " with no args", e19.getTargetException());
        }
    }
}
