package c43;

/* loaded from: classes15.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c43.h f38422d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f38423e;

    public f(c43.h hVar, android.graphics.Bitmap bitmap) {
        this.f38422d = hVar;
        this.f38423e = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x33.b C = this.f38422d.C();
        C.f451614b.setBackground(new android.graphics.drawable.BitmapDrawable(this.f38423e));
    }
}
