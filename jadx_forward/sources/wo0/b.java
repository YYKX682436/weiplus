package wo0;

/* loaded from: classes15.dex */
public final class b extends wo0.c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ip0.a reqValue, yo0.e mImageLoaderConfiguration) {
        super(reqValue, mImageLoaderConfiguration);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reqValue, "reqValue");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mImageLoaderConfiguration, "mImageLoaderConfiguration");
    }

    @Override // wo0.c, vo0.b
    public void a() {
        if (this.f529415m == null) {
            this.f529415m = new cp0.a();
        }
        f();
    }

    @Override // vo0.b
    public void b(android.widget.ImageView imageView, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageView, "imageView");
        if (this.f529415m == null) {
            this.f529415m = new cp0.d(new cp0.n(imageView, this.f529403a), z17);
        }
        f();
    }

    @Override // vo0.b
    public void c(android.widget.ImageView imageView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageView, "imageView");
        if (this.f529415m == null) {
            this.f529415m = new cp0.d(new cp0.n(imageView, this.f529403a));
        }
        f();
    }

    public final void i(android.widget.ImageView imageView, yz5.p pVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageView, "imageView");
        if (this.f529415m == null) {
            this.f529415m = new wo0.a(pVar, new cp0.n(imageView));
        }
        f();
    }
}
