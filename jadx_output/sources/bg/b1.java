package bg;

/* loaded from: classes7.dex */
public class b1 extends tf.j {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fg1.g1 f19744g;

    public b1(bg.c1 c1Var, fg1.g1 g1Var) {
        this.f19744g = g1Var;
    }

    @Override // pd1.l
    public void d(android.view.View view, java.lang.Runnable runnable) {
        com.tencent.mars.xlog.Log.i(this.f418826a, "transferFrom, textureView: " + ((com.tencent.luggage.xweb_ext.extendplugin.component.video.TextureImageViewLikeImpl) view));
        this.f418829d = false;
        h(runnable);
    }

    @Override // pd1.l
    public android.view.View e(android.content.Context context) {
        com.tencent.luggage.xweb_ext.extendplugin.component.video.TextureImageViewLikeImpl textureImageViewLikeImpl = new com.tencent.luggage.xweb_ext.extendplugin.component.video.TextureImageViewLikeImpl(context, null);
        fg1.g1 g1Var = this.f19744g;
        g1Var.f261868a.H1 = new bg.d(g1Var, textureImageViewLikeImpl);
        return textureImageViewLikeImpl;
    }

    @Override // tf.j
    public tf.i g(android.view.View view, java.lang.Runnable runnable) {
        return new bg.a1(this, (com.tencent.luggage.xweb_ext.extendplugin.component.video.TextureImageViewLikeImpl) view, runnable);
    }

    public final void h(java.lang.Runnable runnable) {
        fg1.g1 g1Var = this.f19744g;
        bg.f fVar = g1Var.f261868a;
        bg.f fVar2 = g1Var.f261868a;
        android.view.Surface surface = fVar.f19763g;
        java.lang.String str = this.f418826a;
        if (surface == null || !surface.isValid()) {
            com.tencent.mars.xlog.Log.w(str, "transferFrom, originSurface is invalid");
            if (runnable != null) {
                com.tencent.mars.xlog.Log.i(str, "transferFrom, run afterTransferFromTask when originSurface is invalid");
                runnable.run();
                return;
            }
            return;
        }
        try {
            fVar2.T(surface);
            if (runnable != null) {
                fVar2.getClass();
                com.tencent.mars.xlog.Log.i(str, "transferFrom, run afterTransferFromTask when originSurfaceTexture is null");
                runnable.run();
            }
        } catch (java.lang.Exception unused) {
        }
    }
}
