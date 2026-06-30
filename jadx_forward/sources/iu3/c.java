package iu3;

/* loaded from: classes5.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.e0 f376520d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f376521e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ iu3.e f376522f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var, int i17, iu3.e eVar) {
        super(2);
        this.f376520d = e0Var;
        this.f376521e = i17;
        this.f376522f = eVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        java.lang.String source = (java.lang.String) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var = this.f376520d;
        if (!(floatValue == e0Var.f391648d)) {
            e0Var.f391648d = floatValue;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putFloat("PARAM_1_FLOAT", 1.0f - (floatValue / this.f376521e));
            this.f376522f.f376525e.w(ju3.c0.F1, bundle);
        }
        return jz5.f0.f384359a;
    }
}
