package b50;

/* loaded from: classes.dex */
public final class z0 implements l81.e1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f18008a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f18009b;

    public z0(boolean z17, java.lang.ref.WeakReference weakReference) {
        this.f18008a = z17;
        this.f18009b = weakReference;
    }

    @Override // l81.e1
    public void a() {
        com.tencent.pigeon.biz.BizPersonalCenterNativeToFlutterApi bizPersonalCenterNativeToFlutterApi;
        if (!this.f18008a || (bizPersonalCenterNativeToFlutterApi = (com.tencent.pigeon.biz.BizPersonalCenterNativeToFlutterApi) this.f18009b.get()) == null) {
            return;
        }
        bizPersonalCenterNativeToFlutterApi.requestAcct(true, b50.x0.f18002d);
    }

    @Override // l81.e1
    public void b() {
    }

    @Override // l81.e1
    public void d(java.lang.String str) {
    }

    @Override // l81.e1
    public void e() {
    }

    @Override // l81.e1
    public void f(boolean z17) {
        com.tencent.pigeon.biz.BizPersonalCenterNativeToFlutterApi bizPersonalCenterNativeToFlutterApi;
        if (!this.f18008a || (bizPersonalCenterNativeToFlutterApi = (com.tencent.pigeon.biz.BizPersonalCenterNativeToFlutterApi) this.f18009b.get()) == null) {
            return;
        }
        bizPersonalCenterNativeToFlutterApi.requestAcct(true, b50.y0.f18005d);
    }
}
