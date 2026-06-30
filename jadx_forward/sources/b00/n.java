package b00;

/* loaded from: classes9.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e00.y f98254d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b00.r f98255e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f00.d f98256f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ w05.h f98257g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f98258h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ bw5.x8 f98259i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f98260m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f98261n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(e00.y yVar, b00.r rVar, f00.d dVar, w05.h hVar, android.content.Context context, bw5.x8 x8Var, boolean z17, long j17) {
        super(1);
        this.f98254d = yVar;
        this.f98255e = rVar;
        this.f98256f = dVar;
        this.f98257g = hVar;
        this.f98258h = context;
        this.f98259i = x8Var;
        this.f98260m = z17;
        this.f98261n = j17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        bw5.x7 x7Var = (bw5.x7) obj;
        e00.y yVar = this.f98254d;
        yVar.f327366d = null;
        b00.r rVar = this.f98255e;
        c00.y2 y2Var = rVar.f98291e;
        java.lang.String mo126544xb5884f29 = yVar.mo126544xb5884f29();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo126544xb5884f29, "<get-key>(...)");
        ((e00.e) y2Var).b(x7Var, mo126544xb5884f29);
        b00.r.wi(rVar, yVar);
        this.f98256f.b();
        if (x7Var == null) {
            x7Var = rVar.qj(this.f98257g.q());
        }
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new b00.m(this.f98255e, x7Var, this.f98258h, this.f98259i, this.f98260m, this.f98261n));
        return jz5.f0.f384359a;
    }
}
