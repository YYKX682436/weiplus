package x5;

/* loaded from: classes14.dex */
public final class d implements x5.g {

    /* renamed from: a, reason: collision with root package name */
    public final v5.h f533476a;

    public d(v5.h drawableDecoder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(drawableDecoder, "drawableDecoder");
        this.f533476a = drawableDecoder;
    }

    @Override // x5.g
    public boolean a(java.lang.Object obj) {
        android.graphics.drawable.Drawable data = (android.graphics.drawable.Drawable) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        return true;
    }

    @Override // x5.g
    public java.lang.Object b(s5.a aVar, java.lang.Object obj, p135x2eae8f.p138x35e001.AbstractC1421x275421 abstractC1421x275421, v5.k kVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        android.graphics.drawable.Drawable drawable = (android.graphics.drawable.Drawable) obj;
        l36.i0 i0Var = h6.d.f360649a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(drawable, "<this>");
        boolean z17 = (drawable instanceof v4.d) || (drawable instanceof android.graphics.drawable.VectorDrawable);
        if (z17) {
            android.graphics.Bitmap a17 = this.f533476a.a(drawable, kVar.f514823b, abstractC1421x275421, kVar.f514825d, kVar.f514826e);
            android.content.res.Resources resources = kVar.f514822a.getResources();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(resources, "context.resources");
            drawable = new android.graphics.drawable.BitmapDrawable(resources, a17);
        }
        return new x5.e(drawable, z17, v5.d.MEMORY);
    }

    @Override // x5.g
    public java.lang.String c(java.lang.Object obj) {
        android.graphics.drawable.Drawable data = (android.graphics.drawable.Drawable) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        return null;
    }
}
