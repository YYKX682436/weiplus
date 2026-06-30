package y16;

/* loaded from: classes16.dex */
public final class k extends r16.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f540496a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y16.l f540497b;

    public k(java.util.ArrayList arrayList, y16.l lVar) {
        this.f540496a = arrayList;
        this.f540497b = lVar;
    }

    @Override // r16.p
    public void a(o06.d fakeOverride) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fakeOverride, "fakeOverride");
        r16.x.r(fakeOverride, null);
        this.f540496a.add(fakeOverride);
    }

    @Override // r16.o
    public void c(o06.d fromSuper, o06.d fromCurrent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fromSuper, "fromSuper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fromCurrent, "fromCurrent");
        throw new java.lang.IllegalStateException(("Conflict in scope of " + this.f540497b.f540499b + ": " + fromSuper + " vs " + fromCurrent).toString());
    }
}
