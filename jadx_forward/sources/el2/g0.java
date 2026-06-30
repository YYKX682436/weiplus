package el2;

/* loaded from: classes3.dex */
public final class g0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ el2.i0 f335332d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(el2.i0 i0Var) {
        super(1);
        this.f335332d = i0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        if (kz5.c0.i(7, 19).contains(java.lang.Integer.valueOf(((java.lang.Number) obj).intValue()))) {
            wt2.a aVar = this.f335332d.I;
            if (aVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
                throw null;
            }
            aVar.V3();
        }
        return jz5.f0.f384359a;
    }
}
