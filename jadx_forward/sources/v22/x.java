package v22;

/* loaded from: classes10.dex */
public final class x extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v22.z f514400d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(v22.z zVar) {
        super(0);
        this.f514400d = zVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        v22.z zVar = this.f514400d;
        d32.j jVar = zVar.f514411i;
        if (jVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mixPixelBuffer");
            throw null;
        }
        jVar.f307691k.mo50293x3498a0(new d32.i(new v22.w(zVar)));
        return jz5.f0.f384359a;
    }
}
