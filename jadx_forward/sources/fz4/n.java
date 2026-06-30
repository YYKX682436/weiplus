package fz4;

/* loaded from: classes5.dex */
public final class n implements java.util.function.Predicate {

    /* renamed from: a, reason: collision with root package name */
    public static final fz4.n f348861a = new fz4.n();

    @Override // java.util.function.Predicate
    public boolean test(java.lang.Object obj) {
        java.lang.ref.WeakReference it = (java.lang.ref.WeakReference) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        return it.get() == null;
    }
}
