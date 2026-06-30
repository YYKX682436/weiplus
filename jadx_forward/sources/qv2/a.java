package qv2;

/* loaded from: classes10.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.e0 f448464d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qv2.b f448465e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f448466f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f448467g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var, qv2.b bVar, int i17, java.util.List list) {
        super(1);
        this.f448464d = e0Var;
        this.f448465e = bVar;
        this.f448466f = i17;
        this.f448467g = list;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var = this.f448464d;
        if (floatValue - e0Var.f391648d > 0.1f) {
            this.f448465e.v((this.f448466f + floatValue) / this.f448467g.size());
            e0Var.f391648d = floatValue;
        }
        return jz5.f0.f384359a;
    }
}
