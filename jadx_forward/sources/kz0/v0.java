package kz0;

/* loaded from: classes14.dex */
public final class v0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.TextureView f395354d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(android.view.TextureView textureView) {
        super(2);
        this.f395354d = textureView;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        n0.o oVar = (n0.o) obj;
        if ((((java.lang.Number) obj2).intValue() & 11) == 2) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f384359a;
            }
        }
        java.lang.Object obj3 = n0.e1.f415025a;
        android.view.TextureView textureView = this.f395354d;
        if (textureView != null) {
            r2.f0.a(new kz0.t0(textureView), null, kz0.u0.f395346d, oVar, 384, 2);
        }
        return jz5.f0.f384359a;
    }
}
