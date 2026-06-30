package at0;

/* loaded from: classes10.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ at0.n f95095d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Float f95096e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f95097f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(at0.n nVar, java.lang.Float f17, yz5.l lVar) {
        super(1);
        this.f95095d = nVar;
        this.f95096e = f17;
        this.f95097f = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        at0.n nVar = this.f95095d;
        nVar.f95130e.mo50293x3498a0(new at0.c(nVar, (android.graphics.SurfaceTexture) obj, this.f95096e, this.f95097f));
        return jz5.f0.f384359a;
    }
}
