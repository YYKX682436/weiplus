package c43;

/* loaded from: classes15.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c43.h f119955d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f119956e;

    public f(c43.h hVar, android.graphics.Bitmap bitmap) {
        this.f119955d = hVar;
        this.f119956e = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x33.b C = this.f119955d.C();
        C.f533147b.setBackground(new android.graphics.drawable.BitmapDrawable(this.f119956e));
    }
}
