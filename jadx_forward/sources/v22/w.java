package v22;

/* loaded from: classes10.dex */
public final class w extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v22.z f514399d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(v22.z zVar) {
        super(0);
        this.f514399d = zVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        v22.z zVar = this.f514399d;
        boolean z17 = zVar.f514412j > 0;
        v22.f fVar = zVar.f514414l;
        if (fVar != null) {
            fVar.f514343b.mo50293x3498a0(new v22.e(fVar, new v22.r(zVar, z17)));
        }
        d32.j jVar = zVar.f514411i;
        if (jVar != null) {
            jVar.f307691k.mo50293x3498a0(new d32.i(new d32.e(jVar)));
            return jz5.f0.f384359a;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mixPixelBuffer");
        throw null;
    }
}
