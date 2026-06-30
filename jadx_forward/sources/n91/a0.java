package n91;

/* loaded from: classes4.dex */
public final class a0 implements l01.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f417385d;

    public a0(android.content.Context context) {
        this.f417385d = context;
    }

    @Override // l01.r
    public android.graphics.Bitmap c(android.graphics.Bitmap bitmap) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bitmap, "bitmap");
        android.graphics.Bitmap t07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.t0(bitmap, false, i65.a.b(this.f417385d, 3) * 1.0f, false, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(t07, "getRoundedCornerBitmap(...)");
        return t07;
    }

    @Override // l01.i0
    public java.lang.String key() {
        return "appbrand_custom_game_loading_age";
    }
}
