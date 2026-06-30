package ro5;

/* loaded from: classes14.dex */
public final class b1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ro5.m1 f479695d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f479696e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zo5.e f479697f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f479698g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f479699h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(ro5.m1 m1Var, int i17, zo5.e eVar, int i18, int i19) {
        super(2);
        this.f479695d = m1Var;
        this.f479696e = i17;
        this.f479697f = eVar;
        this.f479698g = i18;
        this.f479699h = i19;
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
        if (h1Var.a()) {
            ro5.m1 m1Var = this.f479695d;
            ((zo5.i) m1Var.f479789r.mo141623x754a37bb()).b(new zo5.f(true, this.f479696e, this.f479697f, renderSize));
            z17 = h1Var.b("Camera");
            bp5.g b17 = m1Var.f479775d.f537335p.b(this.f479699h, "Camera");
            ro5.c0.a(ro5.m1.C, b17 != null ? b17.a() : null, z17);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MVR.VoIPMPRenderLogic", "render: makeCurrent for " + this.f479698g + " error");
            z17 = false;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
