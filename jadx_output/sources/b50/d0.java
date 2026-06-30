package b50;

/* loaded from: classes11.dex */
public final class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.finderbox.flutter.model.BoxFlutterBizPlugin f17933d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f17934e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f17935f;

    public d0(com.tencent.mm.feature.finderbox.flutter.model.BoxFlutterBizPlugin boxFlutterBizPlugin, int i17, java.util.List list) {
        this.f17933d = boxFlutterBizPlugin;
        this.f17934e = i17;
        this.f17935f = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.feature.finderbox.flutter.model.BoxFlutterBizPlugin boxFlutterBizPlugin = this.f17933d;
        com.tencent.pigeon.biz_base.BizBaseCallbackApi bizBaseCallbackApi = boxFlutterBizPlugin.f67062e;
        if (bizBaseCallbackApi != null) {
            int i17 = this.f17934e;
            bizBaseCallbackApi.onBizFinderLiveInfoUpdate(i17, this.f17935f, new b50.c0(boxFlutterBizPlugin, i17));
        }
    }
}
