package eg5;

/* loaded from: classes9.dex */
public final class b implements java.util.function.Predicate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f334371a;

    public b(long j17) {
        this.f334371a = j17;
    }

    @Override // java.util.function.Predicate
    public boolean test(java.lang.Object obj) {
        g15.a it = (g15.a) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        return it.l() == this.f334371a;
    }
}
