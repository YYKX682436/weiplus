package v22;

/* loaded from: classes10.dex */
public final class y extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v22.z f514401d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b f514402e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(v22.z zVar, com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b bVar) {
        super(0);
        this.f514401d = zVar;
        this.f514402e = bVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        v22.a0 oVar;
        boolean c17 = fp.h.c(23);
        v22.z zVar = this.f514401d;
        if (c17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiMixer", "api level 23 user async decoder");
            java.lang.String str = zVar.f514403a;
            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b bVar = this.f514402e;
            int i17 = bVar != null ? bVar.f243915a : 0;
            d32.j jVar = zVar.f514411i;
            if (jVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mixPixelBuffer");
                throw null;
            }
            android.view.Surface surface = jVar.f307690j;
            if (surface == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("videoDecodeSurface");
                throw null;
            }
            oVar = new v22.q(str, i17, surface);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiMixer", "api level below 23 user sync decoder");
            java.lang.String str2 = zVar.f514403a;
            d32.j jVar2 = zVar.f514411i;
            if (jVar2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mixPixelBuffer");
                throw null;
            }
            android.view.Surface surface2 = jVar2.f307690j;
            if (surface2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("videoDecodeSurface");
                throw null;
            }
            oVar = new v22.o(str2, surface2);
        }
        zVar.f514410h = oVar;
        oVar.f514333a = v22.v.f514398d;
        oVar.f514334b = new v22.x(zVar);
        if (oVar.a() < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiCaptureDetailIDKeyStat", "markVideoDecoderInitFailed");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1012L, 26L, 1L);
        }
        v22.a0 a0Var = zVar.f514410h;
        if (a0Var != null) {
            a0Var.c();
            return jz5.f0.f384359a;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("videoDecoder");
        throw null;
    }
}
