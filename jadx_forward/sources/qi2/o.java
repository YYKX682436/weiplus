package qi2;

/* loaded from: classes10.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qi2.v f445128d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(qi2.v vVar) {
        super(2);
        this.f445128d = vVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        java.lang.String string = (java.lang.String) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(string, "string");
        qi2.v vVar = this.f445128d;
        vVar.I(vVar.f445172u, false);
        vVar.f445170s = intValue;
        fg2.e0 e0Var = vVar.f445165n;
        if (e0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        e0Var.f343535i.setText(string);
        vVar.E();
        return jz5.f0.f384359a;
    }
}
