package b16;

/* loaded from: classes15.dex */
public final class l1 extends o26.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o06.g f98742a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f98743b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.l f98744c;

    public l1(o06.g gVar, java.util.Set set, yz5.l lVar) {
        this.f98742a = gVar;
        this.f98743b = set;
        this.f98744c = lVar;
    }

    @Override // o26.e
    public /* bridge */ /* synthetic */ java.lang.Object a() {
        return jz5.f0.f384359a;
    }

    @Override // o26.e
    public boolean b(java.lang.Object obj) {
        o06.g current = (o06.g) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(current, "current");
        if (current == this.f98742a) {
            return true;
        }
        y16.s m07 = current.m0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m07, "getStaticScope(...)");
        if (!(m07 instanceof b16.n1)) {
            return true;
        }
        this.f98743b.addAll((java.util.Collection) this.f98744c.mo146xb9724478(m07));
        return false;
    }
}
