package r35;

/* loaded from: classes3.dex */
public final class f0 implements p11.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f450638a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f450639b;

    public f0(java.lang.String str, android.widget.ImageView imageView) {
        this.f450638a = str;
        this.f450639b = imageView;
    }

    @Override // p11.h
    public void a(java.lang.String url, android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
    }

    @Override // p11.h
    public void b(java.lang.String url, android.view.View view, q11.b imageData) {
        android.graphics.Bitmap bitmap;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageData, "imageData");
        if ((imageData.f441064a != 0 || (bitmap = imageData.f441067d) == null || bitmap.isRecycled()) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(url, this.f450638a)) {
            pm0.v.X(new r35.e0(this.f450639b));
        }
    }

    @Override // p11.h
    public android.graphics.Bitmap c(java.lang.String url, android.view.View view, q11.b imageData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageData, "imageData");
        android.graphics.Bitmap bitmap = imageData.f441067d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bitmap, "bitmap");
        return bitmap;
    }
}
