package df2;

/* loaded from: classes3.dex */
public final class xh implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ df2.fi f313312a;

    public xh(df2.fi fiVar) {
        this.f313312a = fiVar;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        df2.fi fiVar = this.f313312a;
        fiVar.f311677n = bitmap;
        pm0.v.X(new df2.wh(fiVar, bitmap));
    }
}
