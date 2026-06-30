package bb2;

/* loaded from: classes5.dex */
public final class s1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f18990d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bb2.w1 f18991e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f18992f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f18993g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f18994h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(boolean z17, bb2.w1 w1Var, int i17, java.lang.String str, boolean z18) {
        super(0);
        this.f18990d = z17;
        this.f18991e = w1Var;
        this.f18992f = i17;
        this.f18993g = str;
        this.f18994h = z18;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        if (this.f18990d) {
            android.content.Context context = this.f18991e.f19036a.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC finderBulletUIC = (com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC.class);
            if (finderBulletUIC != null) {
                finderBulletUIC.d7(false, this.f18992f, this.f18993g, this.f18994h);
            }
        }
        return jz5.f0.f302826a;
    }
}
