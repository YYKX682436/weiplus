package tf;

/* loaded from: classes7.dex */
public class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.SurfaceTexture.OnFrameAvailableListener f500363a;

    /* renamed from: b, reason: collision with root package name */
    public final android.os.Handler f500364b;

    public j0(android.graphics.SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener, android.os.Handler handler) {
        this.f500363a = onFrameAvailableListener;
        this.f500364b = handler;
    }

    /* renamed from: equals */
    public boolean m166405xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || tf.j0.class != obj.getClass()) {
            return false;
        }
        return this.f500363a.equals(((tf.j0) obj).f500363a);
    }

    /* renamed from: hashCode */
    public int m166406x8cdac1b() {
        return java.util.Objects.hash(this.f500363a);
    }
}
