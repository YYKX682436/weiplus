package sc2;

/* loaded from: classes2.dex */
public final class g8 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.av f487451d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f487452e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sc2.p8 f487453f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f487454g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g8(r45.av avVar, android.graphics.Bitmap bitmap, sc2.p8 p8Var, yz5.l lVar) {
        super(0);
        this.f487451d = avVar;
        this.f487452e = bitmap;
        this.f487453f = p8Var;
        this.f487454g = lVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ff0.t tVar = (ff0.t) i95.n0.c(ff0.t.class);
        java.lang.String m75945x2fec8307 = this.f487451d.m75945x2fec8307(0);
        if (!(m75945x2fec8307 instanceof java.lang.String)) {
            m75945x2fec8307 = null;
        }
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        ((dl4.m0) tVar).cj(m75945x2fec8307, this.f487452e, new sc2.f8(this.f487453f, this.f487454g));
        return jz5.f0.f384359a;
    }
}
