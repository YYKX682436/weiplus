package ys2;

/* loaded from: classes3.dex */
public final class r implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ys2.s f546718a;

    public r(ys2.s sVar) {
        this.f546718a = sVar;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        if (bitmap != null) {
            pm0.v.X(new ys2.q(this.f546718a, bitmap));
        }
    }
}
