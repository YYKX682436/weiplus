package b50;

/* loaded from: classes11.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.finderbox.flutter.model.BoxFlutterBizPlugin f17951d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f17952e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f17953f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f17954g;

    public k(com.tencent.mm.feature.finderbox.flutter.model.BoxFlutterBizPlugin boxFlutterBizPlugin, int i17, java.util.List list, yz5.l lVar) {
        this.f17951d = boxFlutterBizPlugin;
        this.f17952e = i17;
        this.f17953f = list;
        this.f17954g = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.pigeon.biz_base.BizBaseCallbackApi bizBaseCallbackApi = this.f17951d.f67062e;
        java.util.List<com.tencent.pigeon.biz_base.BizFinderLiveInfo> list = this.f17953f;
        if (bizBaseCallbackApi != null) {
            bizBaseCallbackApi.onBizFinderLiveInfoUpdate(this.f17952e, list, b50.j.f17949d);
        }
        yz5.l lVar = this.f17954g;
        if (lVar != null) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kz5.n0.V0(list))));
        }
    }
}
