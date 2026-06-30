package b00;

/* loaded from: classes9.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e00.y f16721d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b00.r f16722e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f00.d f16723f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ w05.h f16724g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f16725h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ bw5.x8 f16726i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f16727m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f16728n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(e00.y yVar, b00.r rVar, f00.d dVar, w05.h hVar, android.content.Context context, bw5.x8 x8Var, boolean z17, long j17) {
        super(1);
        this.f16721d = yVar;
        this.f16722e = rVar;
        this.f16723f = dVar;
        this.f16724g = hVar;
        this.f16725h = context;
        this.f16726i = x8Var;
        this.f16727m = z17;
        this.f16728n = j17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        bw5.x7 x7Var = (bw5.x7) obj;
        e00.y yVar = this.f16721d;
        yVar.f245833d = null;
        b00.r rVar = this.f16722e;
        c00.y2 y2Var = rVar.f16758e;
        java.lang.String key = yVar.getKey();
        kotlin.jvm.internal.o.f(key, "<get-key>(...)");
        ((e00.e) y2Var).b(x7Var, key);
        b00.r.wi(rVar, yVar);
        this.f16723f.b();
        if (x7Var == null) {
            x7Var = rVar.qj(this.f16724g.q());
        }
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new b00.m(this.f16722e, x7Var, this.f16725h, this.f16726i, this.f16727m, this.f16728n));
        return jz5.f0.f302826a;
    }
}
