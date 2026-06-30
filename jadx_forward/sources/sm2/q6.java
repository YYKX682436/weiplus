package sm2;

/* loaded from: classes3.dex */
public final class q6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fm2.a f491203d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f491204e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q6(fm2.a aVar, sm2.o4 o4Var) {
        super(0);
        this.f491203d = aVar;
        this.f491204e = o4Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        fm2.a aVar = this.f491203d;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) aVar.findViewById(com.p314xaae8f345.mm.R.id.f2r);
        boolean z17 = dk2.ef.f314937s;
        sm2.o4 o4Var = this.f491204e;
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.kn knVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.kn) o4Var.N(new sm2.o6(viewGroup, aVar));
            o4Var.I = knVar;
            return knVar;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.bn bnVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.bn) o4Var.N(new sm2.p6(viewGroup, aVar));
        o4Var.H = bnVar;
        return bnVar;
    }
}
