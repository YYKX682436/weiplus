package fl1;

/* loaded from: classes7.dex */
public final class l1 implements l01.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fl1.m1 f345335d;

    public l1(fl1.m1 m1Var) {
        this.f345335d = m1Var;
    }

    @Override // l01.r
    public android.graphics.Bitmap c(android.graphics.Bitmap bitmap) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bitmap, "bitmap");
        android.graphics.Bitmap t07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.t0(bitmap, false, i65.a.b(this.f345335d.f345375d.getContext(), 4) * 1.0f, false, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(t07, "getRoundedCornerBitmap(...)");
        return t07;
    }

    @Override // l01.i0
    public java.lang.String key() {
        return "appbrand_user_avatar";
    }
}
