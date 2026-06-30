package gf;

/* loaded from: classes7.dex */
public final class a1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gf.f1 f352543d;

    public a1(gf.f1 f1Var) {
        this.f352543d = f1Var;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [gf.z0] */
    @Override // java.lang.Runnable
    public final void run() {
        final gf.f1 f1Var = this.f352543d;
        android.graphics.drawable.Drawable foreground = f1Var.getForeground();
        android.graphics.drawable.BitmapDrawable bitmapDrawable = foreground instanceof android.graphics.drawable.BitmapDrawable ? (android.graphics.drawable.BitmapDrawable) foreground : null;
        android.graphics.Bitmap bitmap = bitmapDrawable != null ? bitmapDrawable.getBitmap() : null;
        f1Var.setForeground(null);
        if (bitmap != null) {
            try {
                if (!bitmap.isRecycled()) {
                    bitmap.recycle();
                }
            } catch (java.lang.Exception unused) {
            }
        }
        io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1 c28553x45ef20c1 = (io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1) kz5.n0.Y(f1Var.f352589p);
        if (c28553x45ef20c1 != null) {
            c28553x45ef20c1.m137275xa2124329((io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28647x231975c6) new p3321xbce91901.jvm.p3324x21ffc6bd.y(f1Var) { // from class: gf.z0
                @Override // p3321xbce91901.jvm.p3324x21ffc6bd.y, f06.s
                public java.lang.Object get() {
                    return ((gf.f1) this.f72685xcfcbe9ef).f352592s;
                }
            }.get());
        }
    }
}
