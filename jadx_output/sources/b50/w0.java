package b50;

/* loaded from: classes11.dex */
public final class w0 implements rv.e3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.finderbox.flutter.model.BoxFlutterBizPlugin f17995a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f17996b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f17997c;

    public w0(com.tencent.mm.feature.finderbox.flutter.model.BoxFlutterBizPlugin boxFlutterBizPlugin, boolean z17, java.lang.ref.WeakReference weakReference) {
        this.f17995a = boxFlutterBizPlugin;
        this.f17996b = z17;
        this.f17997c = weakReference;
    }

    @Override // rv.e3
    public final void a(com.tencent.pigeon.biz.BizPublishResultPiegonInfo bizPublishResultPiegonInfo, org.json.JSONObject jSONObject) {
        com.tencent.pigeon.biz.BizPersonalCenterNativeToFlutterApi bizPersonalCenterNativeToFlutterApi;
        com.tencent.mars.xlog.Log.i(this.f17995a.f67061d, "openPersonalCenterMiniAppPage receive publishCallback");
        if (!this.f17996b || (bizPersonalCenterNativeToFlutterApi = (com.tencent.pigeon.biz.BizPersonalCenterNativeToFlutterApi) this.f17997c.get()) == null) {
            return;
        }
        bizPersonalCenterNativeToFlutterApi.requestAcct(true, b50.v0.f17993d);
    }
}
