package bb2;

/* loaded from: classes10.dex */
public final class p1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bb2.w1 f18942d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bb2.o f18943e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f18944f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f18945g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f18946h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(bb2.w1 w1Var, bb2.o oVar, boolean z17, int i17, java.lang.String str) {
        super(0);
        this.f18942d = w1Var;
        this.f18943e = oVar;
        this.f18944f = z17;
        this.f18945g = i17;
        this.f18946h = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        bb2.m0 m0Var = bb2.m0.f18918a;
        bb2.w1 w1Var = this.f18942d;
        android.content.Context context = w1Var.f19036a.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        bb2.o oVar = this.f18943e;
        long j17 = 1000;
        m0Var.c(context, oVar.f18926a, w1Var.e(), (int) (w1Var.f19039d / j17), true);
        android.view.View view = w1Var.f19036a;
        android.content.Context context2 = view.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        m0Var.d(view, context2, oVar.f18926a, w1Var.e().getItemId(), (int) (w1Var.f19039d / j17), true);
        if (this.f18944f) {
            android.content.Context context3 = view.getContext();
            kotlin.jvm.internal.o.f(context3, "getContext(...)");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context3 instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC finderBulletUIC = (com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC) zVar.a((androidx.appcompat.app.AppCompatActivity) context3).e(com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC.class);
            if (finderBulletUIC != null) {
                com.tencent.mm.plugin.finder.viewmodel.component.u4 u4Var = com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC.A;
                finderBulletUIC.d7(true, this.f18945g, this.f18946h, false);
            }
        }
        return jz5.f0.f302826a;
    }
}
