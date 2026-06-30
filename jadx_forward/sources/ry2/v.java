package ry2;

/* loaded from: classes10.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ry2.y f483030d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f483031e;

    public v(ry2.y yVar, android.graphics.Bitmap bitmap) {
        this.f483030d = yVar;
        this.f483031e = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f483030d.p().setImageBitmap(this.f483031e);
    }
}
