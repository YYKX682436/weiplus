package az0;

/* loaded from: classes10.dex */
public final class u2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15935d;

    public u2(int i17) {
        this.f15935d = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17;
        if (az0.w2.f15997m == null || (i17 = this.f15935d) <= 0) {
            return;
        }
        android.opengl.GLES20.glDeleteTextures(1, new int[]{i17}, 0);
    }
}
