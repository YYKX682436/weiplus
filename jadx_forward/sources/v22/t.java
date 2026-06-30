package v22;

/* loaded from: classes10.dex */
public final class t extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v22.z f514396d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(v22.z zVar) {
        super(1);
        this.f514396d = zVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        v22.z zVar = this.f514396d;
        if (booleanValue) {
            v22.a0 a0Var = zVar.f514410h;
            if (a0Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("videoDecoder");
                throw null;
            }
            a0Var.b(false);
        } else {
            d32.j jVar = zVar.f514411i;
            if (jVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mixPixelBuffer");
                throw null;
            }
            v22.s sVar = new v22.s(zVar);
            d32.k kVar = jVar.f307689i;
            if (kVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("renderer");
                throw null;
            }
            byte[] bArr = new byte[kVar.f307697c * kVar.f307698d * 4];
            kVar.f307694J.position(0);
            kVar.f307694J.get(bArr);
            sVar.mo146xb9724478(bArr);
        }
        return jz5.f0.f384359a;
    }
}
