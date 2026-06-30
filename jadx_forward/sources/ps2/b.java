package ps2;

/* loaded from: classes3.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f439589d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f439590e;

    public b(android.graphics.Bitmap bitmap, android.widget.ImageView imageView) {
        this.f439589d = bitmap;
        this.f439590e = imageView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        um5.d dVar = new um5.d();
        android.graphics.Bitmap resource = this.f439589d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(resource, "$resource");
        dVar.b(resource);
        android.widget.ImageView imageView = this.f439590e;
        int width = imageView.getWidth();
        int height = imageView.getHeight();
        dVar.f510674b = width;
        dVar.f510675c = height;
        dVar.f510677e.f510726b.d();
        dVar.a(new ps2.a(imageView));
    }
}
