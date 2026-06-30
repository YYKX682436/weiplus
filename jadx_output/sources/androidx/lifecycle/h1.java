package androidx.lifecycle;

/* loaded from: classes5.dex */
public class h1 implements androidx.lifecycle.f1 {

    /* renamed from: a, reason: collision with root package name */
    public static androidx.lifecycle.h1 f11630a;

    @Override // androidx.lifecycle.f1
    public androidx.lifecycle.c1 a(java.lang.Class cls) {
        try {
            return (androidx.lifecycle.c1) cls.newInstance();
        } catch (java.lang.IllegalAccessException e17) {
            throw new java.lang.RuntimeException("Cannot create an instance of " + cls, e17);
        } catch (java.lang.InstantiationException e18) {
            throw new java.lang.RuntimeException("Cannot create an instance of " + cls, e18);
        }
    }
}
