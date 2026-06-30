package wv2;

/* loaded from: classes10.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.e0 f531519d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wv2.c f531520e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f531521f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f531522g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var, wv2.c cVar, int i17, int i18) {
        super(1);
        this.f531519d = e0Var;
        this.f531520e = cVar;
        this.f531521f = i17;
        this.f531522g = i18;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var = this.f531519d;
        if (floatValue - e0Var.f391648d > 0.1f) {
            this.f531520e.k(floatValue, this.f531521f, this.f531522g);
            e0Var.f391648d = floatValue;
        }
        return jz5.f0.f384359a;
    }
}
