package com.google.gson.internal;

/* loaded from: classes16.dex */
public class j implements com.google.gson.internal.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.gson.internal.j0 f44816a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Class f44817b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.reflect.Type f44818c;

    public j(com.google.gson.internal.r rVar, java.lang.Class cls, java.lang.reflect.Type type) {
        com.google.gson.internal.j0 i0Var;
        this.f44817b = cls;
        this.f44818c = type;
        try {
            java.lang.Class<?> cls2 = java.lang.Class.forName("sun.misc.Unsafe");
            java.lang.reflect.Field declaredField = cls2.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            i0Var = new com.google.gson.internal.f0(cls2.getMethod("allocateInstance", java.lang.Class.class), declaredField.get(null));
        } catch (java.lang.Exception unused) {
            try {
                try {
                    java.lang.reflect.Method declaredMethod = java.io.ObjectStreamClass.class.getDeclaredMethod("getConstructorId", java.lang.Class.class);
                    declaredMethod.setAccessible(true);
                    int intValue = ((java.lang.Integer) declaredMethod.invoke(null, java.lang.Object.class)).intValue();
                    java.lang.reflect.Method declaredMethod2 = java.io.ObjectStreamClass.class.getDeclaredMethod("newInstance", java.lang.Class.class, java.lang.Integer.TYPE);
                    declaredMethod2.setAccessible(true);
                    i0Var = new com.google.gson.internal.g0(declaredMethod2, intValue);
                } catch (java.lang.Exception unused2) {
                    i0Var = new com.google.gson.internal.i0();
                }
            } catch (java.lang.Exception unused3) {
                java.lang.reflect.Method declaredMethod3 = java.io.ObjectInputStream.class.getDeclaredMethod("newInstance", java.lang.Class.class, java.lang.Class.class);
                declaredMethod3.setAccessible(true);
                i0Var = new com.google.gson.internal.h0(declaredMethod3);
            }
        }
        this.f44816a = i0Var;
    }

    @Override // com.google.gson.internal.d0
    public java.lang.Object a() {
        try {
            return this.f44816a.b(this.f44817b);
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("Unable to invoke no-args constructor for " + this.f44818c + ". Registering an InstanceCreator with Gson for this type may fix this problem.", e17);
        }
    }
}
