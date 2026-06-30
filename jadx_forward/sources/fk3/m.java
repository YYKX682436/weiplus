package fk3;

/* loaded from: classes8.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fk3.o f345112d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kk3.d f345113e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f345114f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f345115g;

    public m(fk3.o oVar, kk3.d dVar, android.graphics.Bitmap bitmap, int i17) {
        this.f345112d = oVar;
        this.f345113e = dVar;
        this.f345114f = bitmap;
        this.f345115g = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f345112d.f345125h = false;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new fk3.l(this.f345113e, this.f345114f, this.f345115g));
    }
}
