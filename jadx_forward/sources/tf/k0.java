package tf;

/* loaded from: classes7.dex */
public final class k0 {

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.reflect.Field f500366c;

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.SurfaceTexture f500367a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f500368b = new java.util.ArrayList();

    static {
        java.lang.reflect.Field field = null;
        try {
            field = android.graphics.SurfaceTexture.class.getDeclaredField("mOnFrameAvailableHandler");
            field.setAccessible(true);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.SurfaceTextureWrapper", "get mOnFrameAvailableHandler fail since " + e17.toString());
        }
        f500366c = field;
    }

    public k0(android.graphics.SurfaceTexture surfaceTexture) {
        this.f500367a = surfaceTexture;
    }

    public static tf.k0 a(android.graphics.SurfaceTexture surfaceTexture) {
        synchronized (surfaceTexture) {
            java.lang.reflect.Field field = f500366c;
            if (field == null) {
                return null;
            }
            try {
                android.os.Handler handler = (android.os.Handler) field.get(surfaceTexture);
                if (handler == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.SurfaceTextureWrapper", "wrap, hookSurfaceTexture, originOnFrameAvailableHandler is null");
                    return null;
                }
                if (handler instanceof tf.i0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.SurfaceTextureWrapper", "wrap, hookSurfaceTexture, already hook");
                    return ((tf.i0) handler).f500355a;
                }
                tf.k0 k0Var = new tf.k0(surfaceTexture);
                field.set(surfaceTexture, new tf.i0(handler, k0Var));
                return k0Var;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.SurfaceTextureWrapper", "wrap, hookSurfaceTexture fail since " + e17.toString());
                return null;
            }
        }
    }
}
