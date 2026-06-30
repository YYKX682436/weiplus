package dp5;

/* loaded from: classes14.dex */
public final class a implements dp5.f {

    /* renamed from: d, reason: collision with root package name */
    public final int f323805d;

    /* renamed from: e, reason: collision with root package name */
    public int f323806e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f323807f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f323808g = com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5294x32ebd04e;

    /* renamed from: h, reason: collision with root package name */
    public int f323809h;

    public a(int i17) {
        this.f323805d = i17;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        android.opengl.GLES20.glDeleteTextures(1, new int[]{this.f323805d}, 0);
    }
}
