package fz4;

/* loaded from: classes5.dex */
public final class o implements java.util.function.Predicate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f348862a;

    public o(java.lang.Object obj) {
        this.f348862a = obj;
    }

    @Override // java.util.function.Predicate
    public boolean test(java.lang.Object obj) {
        java.lang.ref.WeakReference it = (java.lang.ref.WeakReference) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(it.get(), this.f348862a);
    }
}
