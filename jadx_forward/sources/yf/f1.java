package yf;

/* loaded from: classes7.dex */
public final class f1 extends tf.i {

    /* renamed from: h, reason: collision with root package name */
    public android.view.Surface f542881h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yf.g1 f542882i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(yf.g1 g1Var, com.p314xaae8f345.p425x1ea3c036.p451xfa7dc33e.p452x1688f2cd.p453xac8f1cfd.p456x6b0147b.C3961x5e8e15c textureImageViewLike, java.lang.Runnable runnable) {
        super(g1Var, textureImageViewLike, runnable);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textureImageViewLike, "textureImageViewLike");
        this.f542882i = g1Var;
    }

    @Override // tf.i
    public void b() {
    }

    @Override // tf.i
    public boolean c(android.view.Surface surface, int i17, int i18) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        try {
            android.view.Surface surface2 = this.f542881h;
            if (surface2 != null && surface2 == surface) {
                surface = null;
            }
            yf.g1 g1Var = this.f542882i;
            if (surface != null) {
                z17 = g1Var.f542888g.o(surface);
                if (z17) {
                    this.f542881h = surface;
                }
            } else {
                z17 = true;
            }
            if (!z17) {
                return z17;
            }
            g1Var.f542888g.p(i17, i18);
            return z17;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }
}
