package fc;

/* loaded from: classes16.dex */
public final class g extends fc.h {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fc.k f342445e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(fc.k kVar) {
        super(kVar);
        this.f342445e = kVar;
    }

    @Override // fc.h
    public final boolean d(java.lang.Object obj) {
        return this.f342445e.m129326xde2d761f(obj);
    }

    @Override // fc.h
    public final boolean e(java.lang.Object obj) {
        return this.f342445e.remove(obj) != null;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new fc.t(this.f342445e);
    }
}
