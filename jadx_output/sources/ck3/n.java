package ck3;

/* loaded from: classes8.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Point f42496d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ak3.c f42497e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f42498f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f42499g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f42500h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kk3.d f42501i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f42502m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f42503n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(android.graphics.Point point, ak3.c cVar, android.graphics.Bitmap bitmap, boolean z17, float f17, kk3.d dVar, boolean z18, boolean z19) {
        super(0);
        this.f42496d = point;
        this.f42497e = cVar;
        this.f42498f = bitmap;
        this.f42499g = z17;
        this.f42500h = f17;
        this.f42501i = dVar;
        this.f42502m = z18;
        this.f42503n = z19;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.graphics.Point point = this.f42496d;
        if (point != null) {
            ck3.q.f42513a.a(this.f42497e, point, this.f42498f, this.f42499g, this.f42500h, this.f42501i, this.f42502m, this.f42503n);
        } else {
            kk3.d dVar = this.f42501i;
            if (dVar != null) {
                kk3.d.f(dVar, 0, 1, null);
            }
        }
        return jz5.f0.f302826a;
    }
}
