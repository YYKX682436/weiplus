package oh4;

/* loaded from: classes8.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ph4.b f427010d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f427011e;

    public k(ph4.b bVar, android.graphics.Bitmap bitmap) {
        this.f427010d = bVar;
        this.f427011e = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f427010d.f435995e.setImageBitmap(this.f427011e);
    }
}
