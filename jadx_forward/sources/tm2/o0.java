package tm2;

/* loaded from: classes3.dex */
public final class o0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fm2.b f502092d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tm2.s2 f502093e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(fm2.b bVar, tm2.s2 s2Var) {
        super(0);
        this.f502092d = bVar;
        this.f502093e = s2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        fm2.b bVar = this.f502092d;
        android.view.View findViewById = bVar.findViewById(com.p314xaae8f345.mm.R.id.f39);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        fm2.b bVar2 = this.f502092d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.o1 o1Var = ((mm2.c1) this.f502093e.c(mm2.c1.class)).f410339g;
        android.view.View findViewById2 = bVar.findViewById(com.p314xaae8f345.mm.R.id.f38);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ap((android.view.ViewGroup) findViewById, bVar2, o1Var, (android.view.ViewGroup) findViewById2, false, 16, null);
    }
}
