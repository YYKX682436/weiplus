package com.p176xb6135e39.p280x308fcb.p281x21ffc6bd;

/* loaded from: classes16.dex */
public class j implements com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.j0 f126349a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Class f126350b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.reflect.Type f126351c;

    public j(com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.r rVar, java.lang.Class cls, java.lang.reflect.Type type) {
        com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.j0 i0Var;
        this.f126350b = cls;
        this.f126351c = type;
        try {
            java.lang.Class<?> cls2 = java.lang.Class.forName("sun.misc.Unsafe");
            java.lang.reflect.Field declaredField = cls2.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            i0Var = new com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.f0(cls2.getMethod("allocateInstance", java.lang.Class.class), declaredField.get(null));
        } catch (java.lang.Exception unused) {
            try {
                try {
                    java.lang.reflect.Method declaredMethod = java.io.ObjectStreamClass.class.getDeclaredMethod("getConstructorId", java.lang.Class.class);
                    declaredMethod.setAccessible(true);
                    int intValue = ((java.lang.Integer) declaredMethod.invoke(null, java.lang.Object.class)).intValue();
                    java.lang.reflect.Method declaredMethod2 = java.io.ObjectStreamClass.class.getDeclaredMethod("newInstance", java.lang.Class.class, java.lang.Integer.TYPE);
                    declaredMethod2.setAccessible(true);
                    i0Var = new com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.g0(declaredMethod2, intValue);
                } catch (java.lang.Exception unused2) {
                    i0Var = new com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.i0();
                }
            } catch (java.lang.Exception unused3) {
                java.lang.reflect.Method declaredMethod3 = java.io.ObjectInputStream.class.getDeclaredMethod("newInstance", java.lang.Class.class, java.lang.Class.class);
                declaredMethod3.setAccessible(true);
                i0Var = new com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.h0(declaredMethod3);
            }
        }
        this.f126349a = i0Var;
    }

    @Override // com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.d0
    public java.lang.Object a() {
        try {
            return this.f126349a.b(this.f126350b);
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException("Unable to invoke no-args constructor for " + this.f126351c + ". Registering an InstanceCreator with Gson for this type may fix this problem.", e17);
        }
    }
}
