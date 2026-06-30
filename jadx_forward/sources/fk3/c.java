package fk3;

/* loaded from: classes8.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ek3.e f345078d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fk3.o f345079e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f345080f;

    public c(ek3.e eVar, fk3.o oVar, android.graphics.Bitmap bitmap) {
        this.f345078d = eVar;
        this.f345079e = oVar;
        this.f345080f = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f345078d.setVisibility(8);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new fk3.b(this.f345079e, this.f345080f));
    }
}
