package z0;

/* loaded from: classes14.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0.o f550446d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n0.o oVar) {
        super(2);
        this.f550446d = oVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        z0.t acc = (z0.t) obj;
        z0.t element = (z0.s) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(acc, "acc");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(element, "element");
        if (element instanceof z0.j) {
            yz5.q qVar = ((z0.j) element).f550444d;
            p3321xbce91901.jvm.p3324x21ffc6bd.m0.e(qVar, 3);
            int i17 = z0.t.f550455q1;
            z0.p pVar = z0.p.f550454d;
            n0.o oVar = this.f550446d;
            element = z0.m.c(oVar, (z0.t) qVar.mo147xb9724478(pVar, oVar, 0));
        }
        return acc.k(element);
    }
}
