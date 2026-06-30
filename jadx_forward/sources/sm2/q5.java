package sm2;

/* loaded from: classes3.dex */
public final class q5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fm2.a f491201d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f491202e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q5(fm2.a aVar, sm2.o4 o4Var) {
        super(0);
        this.f491201d = aVar;
        this.f491202e = o4Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        fm2.a aVar = this.f491201d;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) aVar.findViewById(com.p314xaae8f345.mm.R.id.ia_);
        sm2.o4 o4Var = this.f491202e;
        if (viewGroup != null) {
            o4Var.A = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et) o4Var.N(new sm2.p5(viewGroup, aVar));
        }
        return o4Var.A;
    }
}
