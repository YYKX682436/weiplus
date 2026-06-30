package sv2;

/* loaded from: classes10.dex */
public final class z extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.e0 f494916d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sv2.b0 f494917e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f494918f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f494919g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var, sv2.b0 b0Var, int i17, int i18) {
        super(1);
        this.f494916d = e0Var;
        this.f494917e = b0Var;
        this.f494918f = i17;
        this.f494919g = i18;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var = this.f494916d;
        if (floatValue - e0Var.f391648d > 0.1f) {
            this.f494917e.k(floatValue, this.f494918f, this.f494919g);
            e0Var.f391648d = floatValue;
        }
        return jz5.f0.f384359a;
    }
}
