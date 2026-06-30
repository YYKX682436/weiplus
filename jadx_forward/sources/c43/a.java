package c43;

/* loaded from: classes8.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f119921d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c43.b f119922e;

    public a(c43.b bVar, android.graphics.Bitmap bitmap) {
        this.f119922e = bVar;
        this.f119921d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.graphics.Bitmap bitmap = this.f119921d;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        c43.b bVar = this.f119922e;
        bVar.f119926b.Z.setTag(bVar.f119925a.f36515x95bc6f40);
        bVar.f119926b.Z.setImageBitmap(bitmap);
    }
}
