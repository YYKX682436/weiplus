package qm5;

/* loaded from: classes14.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f446359d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qm5.h f446360e;

    public g(qm5.h hVar, android.graphics.Bitmap bitmap) {
        this.f446360e = hVar;
        this.f446359d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.graphics.Bitmap bitmap;
        qm5.h hVar = this.f446360e;
        if (hVar.f446364r != -1 || (bitmap = this.f446359d) == null || bitmap.isRecycled()) {
            return;
        }
        android.opengl.GLES20.glActiveTexture(33987);
        hVar.f446364r = qm5.k.b(bitmap, -1, false);
    }
}
