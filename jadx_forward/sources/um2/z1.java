package um2;

/* loaded from: classes3.dex */
public final class z1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f510639d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.c f510640e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(um2.x5 x5Var, fm2.c cVar) {
        super(0);
        this.f510639d = x5Var;
        this.f510640e = cVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.zz zzVar = this.f510639d.f510586m;
        if (zzVar != null) {
            return zzVar;
        }
        fm2.c cVar = this.f510640e;
        android.view.View findViewById = cVar.findViewById(com.p314xaae8f345.mm.R.id.f567175ig4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.zz((android.view.ViewGroup) findViewById, cVar);
    }
}
