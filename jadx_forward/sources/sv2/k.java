package sv2;

/* loaded from: classes10.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.e0 f494849d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sv2.m f494850e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f494851f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f494852g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var, sv2.m mVar, int i17, int i18) {
        super(1);
        this.f494849d = e0Var;
        this.f494850e = mVar;
        this.f494851f = i17;
        this.f494852g = i18;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var = this.f494849d;
        if (floatValue - e0Var.f391648d > 0.1f) {
            this.f494850e.o((this.f494851f + floatValue) / this.f494852g);
            e0Var.f391648d = floatValue;
        }
        return jz5.f0.f384359a;
    }
}
