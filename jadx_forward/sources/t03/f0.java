package t03;

/* loaded from: classes11.dex */
public final class f0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t03.k0 f495980d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(t03.k0 k0Var) {
        super(2);
        this.f495980d = k0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        yz5.p pVar = this.f495980d.A;
        if (pVar != null) {
            ((t03.e0) pVar).mo149xb9724478(java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(intValue2));
        }
        return jz5.f0.f384359a;
    }
}
