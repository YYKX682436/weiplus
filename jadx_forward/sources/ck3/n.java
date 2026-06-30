package ck3;

/* loaded from: classes8.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Point f124029d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ak3.c f124030e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f124031f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f124032g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f124033h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kk3.d f124034i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f124035m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f124036n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(android.graphics.Point point, ak3.c cVar, android.graphics.Bitmap bitmap, boolean z17, float f17, kk3.d dVar, boolean z18, boolean z19) {
        super(0);
        this.f124029d = point;
        this.f124030e = cVar;
        this.f124031f = bitmap;
        this.f124032g = z17;
        this.f124033h = f17;
        this.f124034i = dVar;
        this.f124035m = z18;
        this.f124036n = z19;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.graphics.Point point = this.f124029d;
        if (point != null) {
            ck3.q.f124046a.a(this.f124030e, point, this.f124031f, this.f124032g, this.f124033h, this.f124034i, this.f124035m, this.f124036n);
        } else {
            kk3.d dVar = this.f124034i;
            if (dVar != null) {
                kk3.d.f(dVar, 0, 1, null);
            }
        }
        return jz5.f0.f384359a;
    }
}
