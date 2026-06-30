package a6;

/* loaded from: classes14.dex */
public final class w implements a6.r {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Bitmap f1701a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1702b;

    public w(android.graphics.Bitmap bitmap, boolean z17) {
        kotlin.jvm.internal.o.g(bitmap, "bitmap");
        this.f1701a = bitmap;
        this.f1702b = z17;
    }

    @Override // a6.r
    public boolean a() {
        return this.f1702b;
    }

    @Override // a6.r
    public android.graphics.Bitmap getBitmap() {
        return this.f1701a;
    }
}
