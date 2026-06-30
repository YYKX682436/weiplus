package yf;

/* loaded from: classes7.dex */
public final class g1 extends tf.j {

    /* renamed from: g, reason: collision with root package name */
    public final yf.e0 f542888g;

    public g1(yf.e0 originVideoContainer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(originVideoContainer, "originVideoContainer");
        this.f542888g = originVideoContainer;
    }

    @Override // pd1.l
    public void d(android.view.View view, java.lang.Runnable runnable) {
        com.p314xaae8f345.p425x1ea3c036.p451xfa7dc33e.p452x1688f2cd.p453xac8f1cfd.p456x6b0147b.C3961x5e8e15c textureImageViewLike = (com.p314xaae8f345.p425x1ea3c036.p451xfa7dc33e.p452x1688f2cd.p453xac8f1cfd.p456x6b0147b.C3961x5e8e15c) view;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textureImageViewLike, "textureImageViewLike");
        java.lang.String str = this.f500359a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "transferFrom, textureView: " + textureImageViewLike);
        this.f500362d = false;
        yf.e0 e0Var = this.f542888g;
        android.view.Surface surface = e0Var.f542870a.f542894h;
        if (surface == null || !surface.isValid()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "transferFrom, originSurface is invalid");
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        try {
            if (e0Var.o(surface)) {
                yf.i0 i0Var = e0Var.f542870a;
                e0Var.p(i0Var.f542900q, i0Var.f542901r);
            }
            if (runnable != null) {
                runnable.run();
            }
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // pd1.l
    public android.view.View e(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        return new com.p314xaae8f345.p425x1ea3c036.p451xfa7dc33e.p452x1688f2cd.p453xac8f1cfd.p456x6b0147b.C3961x5e8e15c(context, null);
    }

    @Override // tf.j
    public tf.i g(android.view.View view, java.lang.Runnable runnable) {
        com.p314xaae8f345.p425x1ea3c036.p451xfa7dc33e.p452x1688f2cd.p453xac8f1cfd.p456x6b0147b.C3961x5e8e15c textureImageViewLike = (com.p314xaae8f345.p425x1ea3c036.p451xfa7dc33e.p452x1688f2cd.p453xac8f1cfd.p456x6b0147b.C3961x5e8e15c) view;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textureImageViewLike, "textureImageViewLike");
        return new yf.f1(this, textureImageViewLike, runnable);
    }
}
