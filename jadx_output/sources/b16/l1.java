package b16;

/* loaded from: classes15.dex */
public final class l1 extends o26.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o06.g f17209a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f17210b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.l f17211c;

    public l1(o06.g gVar, java.util.Set set, yz5.l lVar) {
        this.f17209a = gVar;
        this.f17210b = set;
        this.f17211c = lVar;
    }

    @Override // o26.e
    public /* bridge */ /* synthetic */ java.lang.Object a() {
        return jz5.f0.f302826a;
    }

    @Override // o26.e
    public boolean b(java.lang.Object obj) {
        o06.g current = (o06.g) obj;
        kotlin.jvm.internal.o.g(current, "current");
        if (current == this.f17209a) {
            return true;
        }
        y16.s m07 = current.m0();
        kotlin.jvm.internal.o.f(m07, "getStaticScope(...)");
        if (!(m07 instanceof b16.n1)) {
            return true;
        }
        this.f17210b.addAll((java.util.Collection) this.f17211c.invoke(m07));
        return false;
    }
}
