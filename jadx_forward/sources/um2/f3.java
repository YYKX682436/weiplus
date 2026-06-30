package um2;

/* loaded from: classes3.dex */
public final class f3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fm2.c f510326d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f510327e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(fm2.c cVar, um2.x5 x5Var) {
        super(0);
        this.f510326d = cVar;
        this.f510327e = x5Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        fm2.c cVar = this.f510326d;
        android.view.View findViewById = cVar.findViewById(com.p314xaae8f345.mm.R.id.f39);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        fm2.c cVar2 = this.f510326d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.o1 o1Var = ((mm2.c1) this.f510327e.c(mm2.c1.class)).f410339g;
        android.view.View findViewById2 = cVar.findViewById(com.p314xaae8f345.mm.R.id.f38);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ap((android.view.ViewGroup) findViewById, cVar2, o1Var, (android.view.ViewGroup) findViewById2, true);
    }
}
