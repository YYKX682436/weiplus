package a6;

/* loaded from: classes14.dex */
public final class w implements a6.r {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Bitmap f83234a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f83235b;

    public w(android.graphics.Bitmap bitmap, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bitmap, "bitmap");
        this.f83234a = bitmap;
        this.f83235b = z17;
    }

    @Override // a6.r
    public boolean a() {
        return this.f83235b;
    }

    @Override // a6.r
    /* renamed from: getBitmap */
    public android.graphics.Bitmap mo721x12501425() {
        return this.f83234a;
    }
}
