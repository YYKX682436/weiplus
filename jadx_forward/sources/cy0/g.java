package cy0;

/* loaded from: classes15.dex */
public final class g extends wo0.c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ip0.a reqValue, cy0.c configuration) {
        super(reqValue, configuration);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reqValue, "reqValue");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(configuration, "configuration");
    }

    @Override // vo0.b
    public void b(android.widget.ImageView imageView, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageView, "imageView");
    }

    @Override // vo0.b
    public void c(android.widget.ImageView imageView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageView, "imageView");
        android.graphics.drawable.Drawable drawable = imageView.getDrawable();
        com.p314xaae8f345.mm.p1006xc5476f33.gif.k kVar = drawable instanceof com.p314xaae8f345.mm.p1006xc5476f33.gif.k ? (com.p314xaae8f345.mm.p1006xc5476f33.gif.k) drawable : null;
        if (kVar != null) {
            kVar.stop();
        }
        if (this.f529415m == null) {
            this.f529415m = new cy0.f(new cp0.n(imageView, this.f529403a));
        }
        f();
    }
}
