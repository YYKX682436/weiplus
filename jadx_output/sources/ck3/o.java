package ck3;

/* loaded from: classes8.dex */
public final class o implements ak3.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kk3.d f42504a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Point f42505b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ak3.c f42506c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f42507d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f42508e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f42509f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f42510g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f42511h;

    public o(kk3.d dVar, android.graphics.Point point, ak3.c cVar, android.graphics.Bitmap bitmap, boolean z17, float f17, boolean z18, boolean z19) {
        this.f42504a = dVar;
        this.f42505b = point;
        this.f42506c = cVar;
        this.f42507d = bitmap;
        this.f42508e = z17;
        this.f42509f = f17;
        this.f42510g = z18;
        this.f42511h = z19;
    }

    @Override // ak3.b
    public void onComplete(boolean z17) {
        if (z17) {
            pm0.v.X(new ck3.n(this.f42505b, this.f42506c, this.f42507d, this.f42508e, this.f42509f, this.f42504a, this.f42510g, this.f42511h));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskFBSwipeTransformationHelper", "doTransform, convertToTranslucent not complete");
            com.tencent.mm.sdk.platformtools.u3.h(new ck3.m(this.f42504a));
        }
    }
}
