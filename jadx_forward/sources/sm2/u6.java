package sm2;

/* loaded from: classes3.dex */
public final class u6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f491270d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.a f491271e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u6(sm2.o4 o4Var, fm2.a aVar) {
        super(0);
        this.f491270d = o4Var;
        this.f491271e = aVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        sm2.o4 o4Var = this.f491270d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm hmVar = o4Var.f491140c0;
        if (hmVar == null) {
            hmVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm) o4Var.N(new sm2.t6(this.f491271e));
        }
        o4Var.f491140c0 = hmVar;
        return hmVar;
    }
}
