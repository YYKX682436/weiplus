package tf;

/* loaded from: classes7.dex */
public abstract class i implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f500351d;

    /* renamed from: e, reason: collision with root package name */
    public final int f500352e;

    /* renamed from: f, reason: collision with root package name */
    public volatile java.lang.Runnable f500353f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ tf.j f500354g;

    public i(tf.j jVar, java.lang.Object obj, java.lang.Runnable runnable) {
        this.f500354g = jVar;
        this.f500351d = obj;
        this.f500352e = obj.hashCode();
        this.f500353f = runnable;
    }

    public final void a(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        android.view.Surface surface;
        tf.j jVar = this.f500354g;
        android.util.SparseArray sparseArray = jVar.f500361c;
        int i19 = this.f500352e;
        android.util.Pair pair = (android.util.Pair) sparseArray.get(i19);
        if (pair == null || pair.second != surfaceTexture) {
            android.view.Surface surface2 = new android.view.Surface(surfaceTexture);
            pair = android.util.Pair.create(surface2, surfaceTexture);
            surface = surface2;
        } else {
            surface = (android.view.Surface) pair.first;
        }
        if (c(surface, i17, i18)) {
            jVar.f500361c.put(i19, pair);
        }
    }

    public abstract void b();

    public abstract boolean c(android.view.Surface surface, int i17, int i18);

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        java.lang.String str = this.f500354g.f500359a;
        java.util.Objects.toString(this.f500351d);
        a(surfaceTexture, i17, i18);
        java.lang.Runnable runnable = this.f500353f;
        this.f500353f = null;
        if (runnable != null) {
            tf.j jVar = this.f500354g;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(jVar.f500359a, "scheduleAfterTransferToTask");
            tf.k0 a17 = tf.k0.a(surfaceTexture);
            ku5.t0 t0Var = (ku5.t0) ku5.t0.f394148d;
            t0Var.getClass();
            wu5.c z17 = t0Var.z(runnable, 300L, false);
            if (a17 != null) {
                tf.h hVar = new tf.h(jVar, z17, runnable, a17);
                if (tf.j.f500358f == null) {
                    tf.j.f500358f = new android.os.Handler(android.os.Looper.getMainLooper());
                }
                android.os.Handler handler = tf.j.f500358f;
                synchronized (a17) {
                    tf.j0 j0Var = new tf.j0(hVar, handler);
                    ((java.util.ArrayList) a17.f500368b).remove(j0Var);
                    ((java.util.ArrayList) a17.f500368b).add(j0Var);
                }
            }
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        tf.j jVar = this.f500354g;
        java.lang.String str = jVar.f500359a;
        java.util.Objects.toString(this.f500351d);
        java.util.Objects.toString(surfaceTexture);
        b();
        android.util.SparseArray sparseArray = jVar.f500361c;
        int i17 = this.f500352e;
        android.util.Pair pair = (android.util.Pair) sparseArray.get(i17);
        if (pair == null) {
            return true;
        }
        jVar.f500361c.remove(i17);
        ((android.view.Surface) pair.first).release();
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        tf.j jVar = this.f500354g;
        if (jVar.f500362d) {
            a(surfaceTexture, i17, i18);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(jVar.f500359a, "onSurfaceTextureSizeChanged, video is not in pip container");
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
    }
}
