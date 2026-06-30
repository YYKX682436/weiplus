package gk3;

/* loaded from: classes8.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk3.m f354052d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kk3.d f354053e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f354054f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f354055g;

    public k(gk3.m mVar, kk3.d dVar, android.graphics.Bitmap bitmap, int i17) {
        this.f354052d = mVar;
        this.f354053e = dVar;
        this.f354054f = bitmap;
        this.f354055g = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gk3.m mVar = this.f354052d;
        mVar.f354063f = false;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new gk3.j(this.f354053e, this.f354054f, this.f354055g, mVar));
    }
}
