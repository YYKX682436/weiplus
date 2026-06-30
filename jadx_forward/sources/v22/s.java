package v22;

/* loaded from: classes10.dex */
public final class s extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v22.z f514395d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(v22.z zVar) {
        super(1);
        this.f514395d = zVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        byte[] it = (byte[]) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        v22.z zVar = this.f514395d;
        v22.a0 a0Var = zVar.f514410h;
        if (a0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("videoDecoder");
            throw null;
        }
        a0Var.b(false);
        v22.f fVar = zVar.f514414l;
        if (fVar != null) {
            fVar.f514343b.mo50293x3498a0(new v22.d(fVar, it, -1L));
        }
        return jz5.f0.f384359a;
    }
}
