package pj5;

/* loaded from: classes8.dex */
public final class e implements java.util.function.Predicate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f436904a;

    public e(long j17) {
        this.f436904a = j17;
    }

    @Override // java.util.function.Predicate
    public boolean test(java.lang.Object obj) {
        r45.lo5 it = (r45.lo5) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        return ((long) it.f461210f) * 1000 < this.f436904a;
    }
}
