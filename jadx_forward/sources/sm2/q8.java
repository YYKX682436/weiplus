package sm2;

/* loaded from: classes3.dex */
public final class q8 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f491207d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.a f491208e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q8(sm2.o4 o4Var, fm2.a aVar) {
        super(0);
        this.f491207d = o4Var;
        this.f491208e = aVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        sm2.o4 o4Var = this.f491207d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.k80 k80Var = o4Var.f491144f0;
        if (k80Var == null) {
            k80Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.k80) o4Var.N(new sm2.p8(this.f491208e));
        }
        o4Var.f491144f0 = k80Var;
        return k80Var;
    }
}
