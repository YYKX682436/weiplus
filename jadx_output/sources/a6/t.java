package a6;

/* loaded from: classes14.dex */
public final class t implements a6.r {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Bitmap f1694a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1695b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1696c;

    public t(android.graphics.Bitmap bitmap, boolean z17, int i17) {
        kotlin.jvm.internal.o.g(bitmap, "bitmap");
        this.f1694a = bitmap;
        this.f1695b = z17;
        this.f1696c = i17;
    }

    @Override // a6.r
    public boolean a() {
        return this.f1695b;
    }

    @Override // a6.r
    public android.graphics.Bitmap getBitmap() {
        return this.f1694a;
    }
}
