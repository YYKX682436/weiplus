package cw2;

/* loaded from: classes10.dex */
public final class g0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw2.h0 f305255d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(cw2.h0 h0Var) {
        super(2);
        this.f305255d = h0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        mu3.a aVar = this.f305255d.f494065n;
        if (aVar != null) {
            aVar.v(intValue, intValue2);
        }
        return jz5.f0.f384359a;
    }
}
