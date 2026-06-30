package g40;

/* loaded from: classes5.dex */
public final class j implements java.util.function.Predicate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i40.a f350224a;

    public j(i40.a aVar) {
        this.f350224a = aVar;
    }

    @Override // java.util.function.Predicate
    public boolean test(java.lang.Object obj) {
        java.lang.ref.WeakReference it = (java.lang.ref.WeakReference) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(it.get(), this.f350224a);
    }
}
