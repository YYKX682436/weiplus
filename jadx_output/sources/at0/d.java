package at0;

/* loaded from: classes10.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ at0.n f13562d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Float f13563e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f13564f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(at0.n nVar, java.lang.Float f17, yz5.l lVar) {
        super(1);
        this.f13562d = nVar;
        this.f13563e = f17;
        this.f13564f = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        at0.n nVar = this.f13562d;
        nVar.f13597e.post(new at0.c(nVar, (android.graphics.SurfaceTexture) obj, this.f13563e, this.f13564f));
        return jz5.f0.f302826a;
    }
}
