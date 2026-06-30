package ro5;

/* loaded from: classes14.dex */
public final class z0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ro5.m1 f479855d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f479856e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zo5.e f479857f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f479858g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(ro5.m1 m1Var, int i17, zo5.e eVar, int i18) {
        super(2);
        this.f479855d = m1Var;
        this.f479856e = i17;
        this.f479857f = eVar;
        this.f479858g = i18;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        xo5.o textureRender = (xo5.o) obj;
        android.util.Size renderSize = (android.util.Size) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textureRender, "$this$textureRender");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(renderSize, "renderSize");
        ro5.h1 h1Var = (ro5.h1) textureRender;
        boolean a17 = h1Var.a();
        boolean z17 = false;
        int i17 = this.f479858g;
        ro5.m1 m1Var = this.f479855d;
        if (a17) {
            if (m1Var.f479784m) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MVR.VoIPMPRenderLogic", "skip one local frame due to resolution switching");
                m1Var.f479784m = false;
            } else {
                m1Var.f479787p.b(new zo5.f(true, this.f479856e, this.f479857f, renderSize));
            }
            z17 = h1Var.b("Process");
            bp5.g b17 = m1Var.f479775d.f537335p.b(i17, "Process");
            ro5.c0.a(ro5.m1.C, b17 != null ? b17.a() : null, z17);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MVR.VoIPMPRenderLogic", "render: makeCurrent for " + i17 + " error");
            bp5.g b18 = m1Var.f479775d.f537335p.b(i17, "Process");
            bp5.h a18 = b18 != null ? b18.a() : null;
            if (a18 != null) {
                a18.mo11010xc3db8127(true);
            }
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
