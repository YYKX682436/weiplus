package a6;

/* loaded from: classes14.dex */
public final class t implements a6.r {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Bitmap f83227a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f83228b;

    /* renamed from: c, reason: collision with root package name */
    public final int f83229c;

    public t(android.graphics.Bitmap bitmap, boolean z17, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bitmap, "bitmap");
        this.f83227a = bitmap;
        this.f83228b = z17;
        this.f83229c = i17;
    }

    @Override // a6.r
    public boolean a() {
        return this.f83228b;
    }

    @Override // a6.r
    /* renamed from: getBitmap */
    public android.graphics.Bitmap mo721x12501425() {
        return this.f83227a;
    }
}
