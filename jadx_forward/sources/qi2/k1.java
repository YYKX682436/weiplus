package qi2;

/* loaded from: classes10.dex */
public final class k1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qi2.q1 f445096d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(qi2.q1 q1Var) {
        super(2);
        this.f445096d = q1Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        java.lang.String string = (java.lang.String) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(string, "string");
        qi2.q1 q1Var = this.f445096d;
        q1Var.F(q1Var.f445147t, false);
        q1Var.f445146s = intValue;
        fg2.d1 d1Var = q1Var.f445140m;
        if (d1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        d1Var.f343510i.setText(string);
        q1Var.C();
        return jz5.f0.f384359a;
    }
}
