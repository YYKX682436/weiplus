package ba2;

/* loaded from: classes2.dex */
public final class d implements ir2.a0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f18694d;

    /* renamed from: e, reason: collision with root package name */
    public final ey2.p2 f18695e;

    public d(java.lang.String key) {
        kotlin.jvm.internal.o.g(key, "key");
        this.f18694d = key;
        androidx.lifecycle.c1 a17 = pf5.u.f353936a.e(c61.l7.class).a(ey2.p2.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        this.f18695e = (ey2.p2) a17;
    }

    @Override // ir2.a0
    public java.lang.Object d(kotlin.coroutines.Continuation continuation) {
        return new ba2.c(this.f18695e.N6(this.f18694d, false).f257438b);
    }
}
