package i33;

/* loaded from: classes10.dex */
public final class m0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i33.t0 f369757d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f369758e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f369759f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(i33.t0 t0Var, float f17, float f18) {
        super(1);
        this.f369757d = t0Var;
        this.f369758e = f17;
        this.f369759f = f18;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        this.f369757d.a7().setTranslationY(this.f369758e + (((java.lang.Number) obj).floatValue() * this.f369759f));
        return jz5.f0.f384359a;
    }
}
