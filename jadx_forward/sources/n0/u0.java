package n0;

/* loaded from: classes14.dex */
public final class u0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0.i3[] f415245d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p0.f f415246e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(n0.i3[] i3VarArr, p0.f fVar) {
        super(2);
        this.f415245d = i3VarArr;
        this.f415246e = fVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int i17;
        ((java.lang.Number) obj2).intValue();
        n0.y0 y0Var = (n0.y0) ((n0.o) obj);
        y0Var.U(935231726);
        java.lang.Object obj3 = n0.e1.f415025a;
        y0Var.U(721128344);
        r0.d dVar = r0.d.f449495f;
        dVar.getClass();
        r0.f fVar = new r0.f(dVar);
        for (n0.i3 i3Var : this.f415245d) {
            boolean z17 = i3Var.f415075c;
            n0.l1 key = i3Var.f415073a;
            if (!z17) {
                p0.f fVar2 = this.f415246e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fVar2, "<this>");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
                i17 = fVar2.containsKey(key) ? i17 + 1 : 0;
            }
            fVar.put(key, key.a(i3Var.f415074b, y0Var, 72));
        }
        r0.d b17 = fVar.b();
        y0Var.o(false);
        y0Var.o(false);
        return b17;
    }
}
