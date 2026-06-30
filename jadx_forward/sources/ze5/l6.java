package ze5;

/* loaded from: classes9.dex */
public final class l6 implements com.p314xaae8f345.mm.p2621x8fb0427b.a9 {

    /* renamed from: d, reason: collision with root package name */
    public final wd5.b f553603d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1879xb47f1f9b.p1880x633fb29.C16565x9bc03d4e f553604e;

    public l6(wd5.b quoteModel, com.p314xaae8f345.mm.p1006xc5476f33.p1879xb47f1f9b.p1880x633fb29.C16565x9bc03d4e quoteItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(quoteModel, "quoteModel");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(quoteItem, "quoteItem");
        this.f553603d = quoteModel;
        this.f553604e = quoteItem;
    }

    @Override // com.p314xaae8f345.mm.p2621x8fb0427b.a9
    public boolean U(java.lang.Object obj) {
        boolean z17;
        wd5.b bVar;
        wd5.b bVar2;
        ze5.l6 l6Var = (ze5.l6) obj;
        r15.i j17 = this.f553603d.j();
        if (j17 != null) {
            z17 = j17.mo516x5c5a33d4((l6Var == null || (bVar2 = l6Var.f553603d) == null) ? null : bVar2.j());
        } else {
            z17 = ((l6Var == null || (bVar = l6Var.f553603d) == null) ? null : bVar.j()) == null;
        }
        return z17 && this.f553604e.a(l6Var != null ? l6Var.f553604e : null);
    }
}
