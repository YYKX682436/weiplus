package eg5;

/* loaded from: classes9.dex */
public final class c implements java.util.function.Predicate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f334372a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eg5.d f334373b;

    public c(long j17, eg5.d dVar) {
        this.f334372a = j17;
        this.f334373b = dVar;
    }

    @Override // java.util.function.Predicate
    public boolean test(java.lang.Object obj) {
        g15.a it = (g15.a) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        boolean z17 = it.l() == this.f334372a;
        if (z17) {
            this.f334373b.f334378e.remove(it);
        }
        return z17;
    }
}
