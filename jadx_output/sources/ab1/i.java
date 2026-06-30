package ab1;

/* loaded from: classes.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ab1.l f2718d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f2719e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.address.AddressSelectorContract$SelectRequest f2720f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f2721g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.a f2722h;

    public i(ab1.l lVar, android.content.Context context, com.tencent.mm.plugin.appbrand.jsapi.address.AddressSelectorContract$SelectRequest addressSelectorContract$SelectRequest, yz5.l lVar2, yz5.a aVar) {
        this.f2718d = lVar;
        this.f2719e = context;
        this.f2720f = addressSelectorContract$SelectRequest;
        this.f2721g = lVar2;
        this.f2722h = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2718d.Ai(this.f2719e, this.f2720f, this.f2721g, this.f2722h);
    }
}
