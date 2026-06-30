package ys2;

/* loaded from: classes10.dex */
public final class n implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ys2.o f546705a;

    public n(ys2.o oVar) {
        this.f546705a = oVar;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        if (bitmap != null) {
            pm0.v.X(new ys2.m(bitmap, this.f546705a));
        }
    }
}
