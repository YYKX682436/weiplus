package cu3;

/* loaded from: classes8.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cu3.d f304006d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f304007e;

    public f(cu3.d dVar, android.graphics.Bitmap bitmap) {
        this.f304006d = dVar;
        this.f304007e = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cu3.d dVar = this.f304006d;
        dVar.getClass();
        android.graphics.Bitmap bitmap = this.f304007e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bitmap, "bitmap");
        dVar.f304002d.setImageBitmap(bitmap);
        dVar.f304004f = true;
    }
}
