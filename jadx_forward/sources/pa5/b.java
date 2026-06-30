package pa5;

/* loaded from: classes3.dex */
public final class b extends u3.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.e0 f434622a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f434623b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f434624c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pa5.l f434625d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var, int i17, int i18, pa5.l lVar) {
        super("intSpringProgress");
        this.f434622a = e0Var;
        this.f434623b = i17;
        this.f434624c = i18;
        this.f434625d = lVar;
    }

    @Override // u3.t
    public float a(java.lang.Object object) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(object, "object");
        return this.f434622a.f391648d;
    }

    @Override // u3.t
    public void b(java.lang.Object object, float f17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(object, "object");
        float e17 = e06.p.e(f17, 0.0f, 1.0f);
        p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var = this.f434622a;
        e0Var.f391648d = e17;
        int i17 = this.f434624c;
        int i18 = this.f434623b;
        float f18 = e0Var.f391648d;
        int i19 = i18 + ((int) ((i17 - i18) * f18));
        pa5.l lVar = this.f434625d;
        if (lVar != null) {
            lVar.a(i19, f18);
        }
    }
}
