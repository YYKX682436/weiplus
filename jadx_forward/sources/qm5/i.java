package qm5;

/* loaded from: classes14.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f446366d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qm5.j f446367e;

    public i(qm5.j jVar, android.graphics.Bitmap bitmap) {
        this.f446367e = jVar;
        this.f446366d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.graphics.Bitmap bitmap;
        qm5.j jVar = this.f446367e;
        if (jVar.f446370m != -1 || (bitmap = this.f446366d) == null || bitmap.isRecycled()) {
            return;
        }
        android.opengl.GLES20.glActiveTexture(33986);
        jVar.f446370m = qm5.k.b(bitmap, -1, false);
    }
}
