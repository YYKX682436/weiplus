package b0;

/* loaded from: classes14.dex */
public final class m2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.e0 f97963d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b0.p2 f97964e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var, b0.p2 p2Var) {
        super(2);
        this.f97963d = e0Var;
        this.f97964e = p2Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        ((java.lang.Number) obj2).floatValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var = this.f97963d;
        float f17 = e0Var.f391648d;
        e0Var.f391648d = f17 + this.f97964e.a(floatValue - f17);
        return jz5.f0.f384359a;
    }
}
