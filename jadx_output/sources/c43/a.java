package c43;

/* loaded from: classes8.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f38388d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c43.b f38389e;

    public a(c43.b bVar, android.graphics.Bitmap bitmap) {
        this.f38389e = bVar;
        this.f38388d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.graphics.Bitmap bitmap = this.f38388d;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        c43.b bVar = this.f38389e;
        bVar.f38393b.Z.setTag(bVar.f38392a.bg_pic_url);
        bVar.f38393b.Z.setImageBitmap(bitmap);
    }
}
