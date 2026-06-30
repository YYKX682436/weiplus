package org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440;

/* loaded from: classes7.dex */
public final class e implements java.security.PrivilegedAction {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.nio.ByteBuffer f429374a;

    public e(java.nio.ByteBuffer byteBuffer) {
        this.f429374a = byteBuffer;
    }

    @Override // java.security.PrivilegedAction
    public java.lang.Object run() {
        java.nio.ByteBuffer byteBuffer = this.f429374a;
        try {
            sun.misc.Unsafe unsafe = org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.h.f75083xcdead9a6;
            java.lang.reflect.Method declaredMethod = unsafe.getClass().getDeclaredMethod("invokeCleaner", java.nio.ByteBuffer.class);
            declaredMethod.invoke(unsafe, byteBuffer);
            return declaredMethod;
        } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException e17) {
            return e17;
        }
    }
}
