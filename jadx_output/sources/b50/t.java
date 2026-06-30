package b50;

/* loaded from: classes11.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.finderbox.flutter.model.BoxFlutterBizPlugin f17986d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.FinderLiveSwitchEvent f17987e;

    public t(com.tencent.mm.feature.finderbox.flutter.model.BoxFlutterBizPlugin boxFlutterBizPlugin, com.tencent.mm.autogen.events.FinderLiveSwitchEvent finderLiveSwitchEvent) {
        this.f17986d = boxFlutterBizPlugin;
        this.f17987e = finderLiveSwitchEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.pigeon.biz_base.BizBaseCallbackApi bizBaseCallbackApi = this.f17986d.f67062e;
        if (bizBaseCallbackApi != null) {
            java.lang.String liveId = this.f17987e.f54299g.f6442b;
            kotlin.jvm.internal.o.f(liveId, "liveId");
            bizBaseCallbackApi.onFinderLiveStatusChange(liveId, b50.s.f17983d);
        }
    }
}
