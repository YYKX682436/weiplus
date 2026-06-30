package gk3;

/* loaded from: classes8.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk3.m f354044d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kk3.d f354045e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f354046f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f354047g;

    public i(gk3.m mVar, kk3.d dVar, android.graphics.Bitmap bitmap, int i17) {
        this.f354044d = mVar;
        this.f354045e = dVar;
        this.f354046f = bitmap;
        this.f354047g = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f354044d.e();
        kk3.d dVar = this.f354045e;
        if (dVar != null) {
            dVar.d(this.f354046f, false, this.f354047g);
        }
    }
}
