package go0;

/* loaded from: classes14.dex */
public final class g0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ go0.h0 f355313d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(go0.h0 h0Var) {
        super(0);
        this.f355313d = h0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.graphics.SurfaceTexture b17;
        go0.h0 h0Var = this.f355313d;
        ft0.d dVar = h0Var.f355297m;
        if (dVar != null && (b17 = dVar.b()) != null) {
            b17.updateTexImage();
        }
        ft0.d dVar2 = h0Var.f355297m;
        if (dVar2 != null) {
            dVar2.d(null);
        }
        return jz5.f0.f384359a;
    }
}
