package cy0;

/* loaded from: classes15.dex */
public final class f extends cp0.f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(cp0.n holder) {
        super(holder);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }

    @Override // cp0.f
    public boolean b(java.lang.Object obj, cp0.n viewWeakHolder) {
        com.p314xaae8f345.mm.p1006xc5476f33.gif.k resource = (com.p314xaae8f345.mm.p1006xc5476f33.gif.k) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resource, "resource");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewWeakHolder, "viewWeakHolder");
        android.view.View b17 = viewWeakHolder.b();
        android.widget.ImageView imageView = b17 instanceof android.widget.ImageView ? (android.widget.ImageView) b17 : null;
        if (imageView == null) {
            return false;
        }
        java.lang.Object obj2 = viewWeakHolder.f302293b.f375106a;
        imageView.setImageMatrix(null);
        if (obj2 instanceof ip0.d) {
            imageView.addOnLayoutChangeListener(new cy0.e(obj2, imageView));
        }
        imageView.setImageDrawable(resource);
        resource.start();
        return true;
    }

    @Override // cp0.f
    public int c() {
        return this.f302278a.f302294c;
    }

    @Override // cp0.f
    public void d(cp0.n viewWeakHolder, vo0.h request) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewWeakHolder, "viewWeakHolder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
    }
}
