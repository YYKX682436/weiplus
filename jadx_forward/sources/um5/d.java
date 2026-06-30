package um5;

/* loaded from: classes10.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public int f510674b;

    /* renamed from: c, reason: collision with root package name */
    public int f510675c;

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Bitmap f510676d;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f510673a = "BitmapEffector@" + hashCode();

    /* renamed from: e, reason: collision with root package name */
    public final um5.p f510677e = new um5.p();

    public final void a(yz5.l callback) {
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        int i18 = this.f510674b;
        if (i18 <= 0 || (i17 = this.f510675c) <= 0) {
            xm5.b.f(this.f510673a, "size error [" + this.f510674b + ", " + this.f510675c + ']', new java.lang.Object[0]);
            callback.mo146xb9724478(this.f510676d);
            return;
        }
        boolean z17 = tq5.k.f502805a;
        um5.p pVar = this.f510677e;
        if (z17) {
            pVar.j(i18, i17);
            pVar.d();
            pVar.i(new um5.b(callback));
        } else {
            callback.mo146xb9724478(null);
        }
        pVar.f(new um5.c(this));
    }

    public final void b(android.graphics.Bitmap bitmap) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bitmap, "bitmap");
        xm5.b.c(this.f510673a, "setInputBitmap: " + bitmap + ", size:[" + bitmap.getWidth() + ',' + bitmap.getHeight() + ']', new java.lang.Object[0]);
        this.f510676d = bitmap;
        this.f510677e.l(bitmap);
    }
}
