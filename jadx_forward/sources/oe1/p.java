package oe1;

/* loaded from: classes15.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f426263d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ oe1.q f426264e;

    public p(oe1.q qVar, android.graphics.Bitmap bitmap) {
        this.f426264e = qVar;
        this.f426263d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.graphics.Bitmap bitmap = this.f426263d;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        this.f426264e.f426266e.f165076t.setImageBitmap(bitmap);
    }
}
