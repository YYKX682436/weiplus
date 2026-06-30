package tf;

/* loaded from: classes7.dex */
public abstract class j implements pd1.l {

    /* renamed from: e, reason: collision with root package name */
    public static final pd1.f f500357e = new tf.g();

    /* renamed from: f, reason: collision with root package name */
    public static android.os.Handler f500358f;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f500359a = "MicroMsg.AppBrand.AbsXWebVideoContainerChannel#" + hashCode();

    /* renamed from: b, reason: collision with root package name */
    public final android.util.SparseArray f500360b = new android.util.SparseArray();

    /* renamed from: c, reason: collision with root package name */
    public final android.util.SparseArray f500361c = new android.util.SparseArray();

    /* renamed from: d, reason: collision with root package name */
    public boolean f500362d = false;

    @Override // pd1.l
    public pd1.f a() {
        return f500357e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // pd1.l
    public void b(android.view.View view) {
        this.f500360b.remove(view.hashCode());
        ((tf.p) view).mo32289x1a400184(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // pd1.l
    public void c(android.view.View view, java.lang.Runnable runnable) {
        java.lang.String str = this.f500359a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "transferTo, textureImageViewLike: " + view);
        this.f500362d = true;
        ((tf.p) view).mo32288xd44890a8(null);
        int hashCode = view.hashCode();
        android.util.SparseArray sparseArray = this.f500360b;
        android.view.TextureView.SurfaceTextureListener surfaceTextureListener = (android.view.TextureView.SurfaceTextureListener) sparseArray.get(hashCode);
        if (surfaceTextureListener == null) {
            tf.i g17 = g(view, runnable);
            ((tf.p) view).mo32289x1a400184(g17);
            sparseArray.put(hashCode, g17);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "transferTo, surfaceTextureListener is not null");
        android.graphics.SurfaceTexture mo32286x182e20a4 = ((tf.p) view).mo32286x182e20a4();
        if (mo32286x182e20a4 != null) {
            surfaceTextureListener.onSurfaceTextureSizeChanged(mo32286x182e20a4, view.getWidth(), view.getHeight());
        }
        if (runnable != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "transferTo, run afterTransferToTask when surfaceTextureListener is not null");
            runnable.run();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // pd1.l
    public void f(android.view.View view) {
        java.lang.String str = this.f500359a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onPlayEndWorkaround, textureImageViewLike: " + view);
        if (!this.f500362d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onPlayEndWorkaround, video is not in pip container");
        }
        tf.p pVar = (tf.p) view;
        android.graphics.Bitmap mo32285x12501425 = pVar.mo32285x12501425();
        if (mo32285x12501425 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "onPlayEndWorkaround, bitmap is null");
        } else {
            pVar.mo32288xd44890a8(mo32285x12501425);
        }
    }

    public abstract tf.i g(android.view.View view, java.lang.Runnable runnable);
}
