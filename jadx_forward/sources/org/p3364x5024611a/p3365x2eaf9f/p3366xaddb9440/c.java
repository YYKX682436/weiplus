package org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440;

/* loaded from: classes7.dex */
public final class c implements java.security.PrivilegedAction {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.nio.ByteBuffer f429372a;

    public c(java.nio.ByteBuffer byteBuffer) {
        this.f429372a = byteBuffer;
    }

    @Override // java.security.PrivilegedAction
    public java.lang.Object run() {
        java.nio.ByteBuffer byteBuffer = this.f429372a;
        try {
            java.lang.reflect.Method declaredMethod = byteBuffer.getClass().getDeclaredMethod("cleaner", new java.lang.Class[0]);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(byteBuffer, new java.lang.Object[0]);
            return declaredMethod;
        } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException e17) {
            return e17;
        }
    }
}
