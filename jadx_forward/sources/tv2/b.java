package tv2;

/* loaded from: classes10.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.e0 f503803d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tv2.f f503804e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f503805f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f503806g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var, tv2.f fVar, int i17, int i18) {
        super(1);
        this.f503803d = e0Var;
        this.f503804e = fVar;
        this.f503805f = i17;
        this.f503806g = i18;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var = this.f503803d;
        if (floatValue - e0Var.f391648d > 0.1f) {
            tv2.f fVar = this.f503804e;
            fVar.f503833h.m59260x51f8f5b0();
            fVar.p((this.f503805f + floatValue) / this.f503806g);
            e0Var.f391648d = floatValue;
        }
        return jz5.f0.f384359a;
    }
}
