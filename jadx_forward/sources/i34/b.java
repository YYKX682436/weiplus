package i34;

/* loaded from: classes11.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f369841d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i34.d f369842e;

    public b(i34.d dVar, android.graphics.Bitmap bitmap) {
        this.f369842e = dVar;
        this.f369841d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f369842e.f369849g.setImageBitmap(this.f369841d);
    }
}
