package kz5;

/* loaded from: classes12.dex */
public abstract class p1 extends kz5.o1 {
    public static final java.util.HashSet d(java.lang.Object... elements) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(elements, "elements");
        java.util.HashSet hashSet = new java.util.HashSet(kz5.b1.d(elements.length));
        kz5.z.u0(elements, hashSet);
        return hashSet;
    }

    public static final java.util.Set e(java.lang.Object... elements) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(elements, "elements");
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(kz5.b1.d(elements.length));
        kz5.z.u0(elements, linkedHashSet);
        return linkedHashSet;
    }

    public static final java.util.Set f(java.lang.Object... elements) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(elements, "elements");
        return kz5.z.D0(elements);
    }
}
