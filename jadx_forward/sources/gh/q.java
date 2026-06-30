package gh;

/* loaded from: classes14.dex */
public abstract class q {
    public static java.lang.Object a(gh.r rVar) {
        android.view.View mo131549xc514bbd9 = rVar.mo131549xc514bbd9();
        if (mo131549xc514bbd9 == null) {
            return null;
        }
        if (mo131549xc514bbd9 instanceof android.view.TextureView) {
            return ((android.view.TextureView) mo131549xc514bbd9).getSurfaceTexture();
        }
        if (mo131549xc514bbd9 instanceof android.view.SurfaceView) {
            return ((android.view.SurfaceView) mo131549xc514bbd9).getHolder().getSurface();
        }
        return null;
    }
}
