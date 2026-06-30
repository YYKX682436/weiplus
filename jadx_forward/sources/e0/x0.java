package e0;

/* loaded from: classes5.dex */
public final class x0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.q f327253d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(yz5.q qVar) {
        super(4);
        this.f327253d = qVar;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        e0.g $receiver = (e0.g) obj;
        ((java.lang.Number) obj2).intValue();
        n0.o oVar = (n0.o) obj3;
        int intValue = ((java.lang.Number) obj4).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g($receiver, "$this$$receiver");
        if ((intValue & 14) == 0) {
            intValue |= ((n0.y0) oVar).e($receiver) ? 4 : 2;
        }
        if ((intValue & com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a8.f33685x366c91de) == 130) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f384359a;
            }
        }
        this.f327253d.mo147xb9724478($receiver, oVar, java.lang.Integer.valueOf(intValue & 14));
        return jz5.f0.f384359a;
    }
}
