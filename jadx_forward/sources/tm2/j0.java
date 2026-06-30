package tm2;

/* loaded from: classes3.dex */
public final class j0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tm2.s2 f502061d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.b f502062e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(tm2.s2 s2Var, fm2.b bVar) {
        super(0);
        this.f502061d = s2Var;
        this.f502062e = bVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.zz zzVar = this.f502061d.D;
        if (zzVar != null) {
            return zzVar;
        }
        fm2.b bVar = this.f502062e;
        android.view.View findViewById = bVar.findViewById(com.p314xaae8f345.mm.R.id.f567175ig4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.zz((android.view.ViewGroup) findViewById, bVar);
    }
}
