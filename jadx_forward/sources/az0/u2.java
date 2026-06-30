package az0;

/* loaded from: classes10.dex */
public final class u2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f97468d;

    public u2(int i17) {
        this.f97468d = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17;
        if (az0.w2.f97530m == null || (i17 = this.f97468d) <= 0) {
            return;
        }
        android.opengl.GLES20.glDeleteTextures(1, new int[]{i17}, 0);
    }
}
