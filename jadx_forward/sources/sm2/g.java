package sm2;

/* loaded from: classes3.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f490995d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ km2.q f490996e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(sm2.o4 o4Var, km2.q qVar) {
        super(1);
        this.f490995d = o4Var;
        this.f490996e = qVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x7 x7Var;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        if (!booleanValue && (x7Var = this.f490995d.M) != null) {
            x7Var.G1(booleanValue, this.f490996e);
        }
        return jz5.f0.f384359a;
    }
}
