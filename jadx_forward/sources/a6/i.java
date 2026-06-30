package a6;

/* loaded from: classes14.dex */
public final class i extends a6.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final s5.c f83186a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(s5.c referenceCounter) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(referenceCounter, "referenceCounter");
        this.f83186a = referenceCounter;
    }

    @Override // a6.b0
    public java.lang.Object e(c6.q qVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        android.graphics.drawable.Drawable a17 = qVar.a();
        android.graphics.drawable.BitmapDrawable bitmapDrawable = a17 instanceof android.graphics.drawable.BitmapDrawable ? (android.graphics.drawable.BitmapDrawable) a17 : null;
        android.graphics.Bitmap bitmap = bitmapDrawable != null ? bitmapDrawable.getBitmap() : null;
        if (bitmap != null) {
            this.f83186a.a(bitmap, false);
        }
        return jz5.f0.f384359a;
    }
}
