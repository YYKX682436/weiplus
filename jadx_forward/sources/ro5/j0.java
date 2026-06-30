package ro5;

/* loaded from: classes14.dex */
public final class j0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so5.b f479754d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ro5.m1 f479755e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f479756f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(so5.b bVar, ro5.m1 m1Var, int i17) {
        super(2);
        this.f479754d = bVar;
        this.f479755e = m1Var;
        this.f479756f = i17;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Integer num;
        xo5.o textureRender = (xo5.o) obj;
        android.util.Size renderSize = (android.util.Size) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textureRender, "$this$textureRender");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(renderSize, "renderSize");
        so5.b bVar = this.f479754d;
        android.util.Size size = bVar.f492325a;
        android.util.Size size2 = bVar.f492326b;
        zo5.e eVar = new zo5.e(size2.getWidth(), size2.getHeight(), 0, false, false, size, 24, null);
        ro5.m1 m1Var = this.f479755e;
        zo5.i iVar = (zo5.i) m1Var.f479790s.mo141623x754a37bb();
        int i17 = this.f479756f;
        int intValue = (iVar == null || (num = (java.lang.Integer) iVar.b(new zo5.f(true, i17, eVar, size))) == null) ? i17 : num.intValue();
        ro5.h1 h1Var = (ro5.h1) textureRender;
        boolean z17 = false;
        if (h1Var.a()) {
            zo5.i iVar2 = m1Var.f479788q;
            boolean z18 = intValue == i17;
            if (intValue != i17) {
                eVar = new zo5.e(size.getWidth(), size.getHeight(), 0, false, false, null, 56, null);
            }
            iVar2.b(new zo5.f(z18, intValue, eVar, renderSize));
            z17 = h1Var.b("HWDecode");
            bp5.g b17 = m1Var.f479775d.f537335p.b(intValue, "HWDecode");
            ro5.c0.a(ro5.m1.C, b17 != null ? b17.a() : null, z17);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MVR.VoIPMPRenderLogic", "hw decode: make current error");
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
