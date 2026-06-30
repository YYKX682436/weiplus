package ro5;

/* loaded from: classes14.dex */
public final class y0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ro5.m1 f479849d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f479850e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f479851f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f479852g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f479853h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(ro5.m1 m1Var, int i17, int i18, int i19, int i27) {
        super(2);
        this.f479849d = m1Var;
        this.f479850e = i17;
        this.f479851f = i18;
        this.f479852g = i19;
        this.f479853h = i27;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        boolean z17;
        xo5.o textureRender = (xo5.o) obj;
        android.util.Size renderSize = (android.util.Size) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textureRender, "$this$textureRender");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(renderSize, "renderSize");
        ro5.h1 h1Var = (ro5.h1) textureRender;
        boolean a17 = h1Var.a();
        int i17 = this.f479853h;
        if (a17) {
            ro5.m1 m1Var = this.f479849d;
            m1Var.f479787p.b(new zo5.f(true, this.f479850e, new zo5.e(this.f479851f, this.f479852g, 270 - m1Var.A, false, false, null, 56, null), renderSize));
            z17 = h1Var.b("LocalRender" + i17);
            bp5.g b17 = m1Var.f479775d.f537335p.b(i17, "LocalRender" + i17);
            ro5.c0.a(ro5.m1.C, b17 != null ? b17.a() : null, z17);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MVR.VoIPMPRenderLogic", "render: makeCurrent for " + i17 + " error");
            z17 = false;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
