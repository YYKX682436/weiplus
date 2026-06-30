package go0;

/* loaded from: classes14.dex */
public final class x extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f355434d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ go0.f0 f355435e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(yz5.l lVar, go0.f0 f0Var) {
        super(0);
        this.f355434d = lVar;
        this.f355435e = f0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        go0.f0 f0Var = this.f355435e;
        yz5.l lVar = this.f355434d;
        if (lVar != null) {
            ft0.d dVar = f0Var.f355297m;
            lVar.mo146xb9724478(dVar != null ? dVar.b() : null);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("tryCameraPreview  ");
        ft0.d dVar2 = f0Var.f355297m;
        sb6.append(dVar2 != null ? dVar2.b() : null);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.LiveCoreRender", sb6.toString(), new java.lang.Object[0]);
        return jz5.f0.f384359a;
    }
}
