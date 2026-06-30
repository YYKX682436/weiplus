package fk3;

/* loaded from: classes8.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kk3.d f345109d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f345110e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f345111f;

    public l(kk3.d dVar, android.graphics.Bitmap bitmap, int i17) {
        this.f345109d = dVar;
        this.f345110e = bitmap;
        this.f345111f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kk3.d dVar = this.f345109d;
        if (dVar != null) {
            dVar.b(this.f345110e, this.f345111f);
        }
    }
}
