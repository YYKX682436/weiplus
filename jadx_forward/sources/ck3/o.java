package ck3;

/* loaded from: classes8.dex */
public final class o implements ak3.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kk3.d f124037a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Point f124038b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ak3.c f124039c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f124040d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f124041e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f124042f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f124043g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f124044h;

    public o(kk3.d dVar, android.graphics.Point point, ak3.c cVar, android.graphics.Bitmap bitmap, boolean z17, float f17, boolean z18, boolean z19) {
        this.f124037a = dVar;
        this.f124038b = point;
        this.f124039c = cVar;
        this.f124040d = bitmap;
        this.f124041e = z17;
        this.f124042f = f17;
        this.f124043g = z18;
        this.f124044h = z19;
    }

    @Override // ak3.b
    /* renamed from: onComplete */
    public void mo2156x815f5438(boolean z17) {
        if (z17) {
            pm0.v.X(new ck3.n(this.f124038b, this.f124039c, this.f124040d, this.f124041e, this.f124042f, this.f124037a, this.f124043g, this.f124044h));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskFBSwipeTransformationHelper", "doTransform, convertToTranslucent not complete");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new ck3.m(this.f124037a));
        }
    }
}
