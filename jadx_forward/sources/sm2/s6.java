package sm2;

/* loaded from: classes3.dex */
public final class s6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f491229d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.a f491230e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s6(sm2.o4 o4Var, fm2.a aVar) {
        super(0);
        this.f491229d = o4Var;
        this.f491230e = aVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        sm2.o4 o4Var = this.f491229d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dq dqVar = o4Var.K;
        if (dqVar == null) {
            dqVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dq) o4Var.N(new sm2.r6(this.f491230e));
        }
        o4Var.K = dqVar;
        return dqVar;
    }
}
