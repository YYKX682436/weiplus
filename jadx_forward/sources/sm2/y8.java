package sm2;

/* loaded from: classes3.dex */
public final class y8 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f491337d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.a f491338e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y8(sm2.o4 o4Var, fm2.a aVar) {
        super(0);
        this.f491337d = o4Var;
        this.f491338e = aVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        sm2.o4 o4Var = this.f491337d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.w60 w60Var = o4Var.f491148h0;
        if (w60Var == null) {
            fm2.a aVar = this.f491338e;
            android.view.ViewStub viewStub = (android.view.ViewStub) aVar.findViewById(com.p314xaae8f345.mm.R.id.fjb);
            w60Var = viewStub != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.w60) o4Var.N(new sm2.x8(viewStub, aVar)) : null;
        }
        o4Var.f491148h0 = w60Var;
        return w60Var;
    }
}
