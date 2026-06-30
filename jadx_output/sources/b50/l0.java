package b50;

/* loaded from: classes11.dex */
public final class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.BizRecommandMockCardEvent f17957d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.finderbox.flutter.model.BoxFlutterBizPlugin f17958e;

    public l0(com.tencent.mm.autogen.events.BizRecommandMockCardEvent bizRecommandMockCardEvent, com.tencent.mm.feature.finderbox.flutter.model.BoxFlutterBizPlugin boxFlutterBizPlugin) {
        this.f17957d = bizRecommandMockCardEvent;
        this.f17958e = boxFlutterBizPlugin;
    }

    @Override // java.lang.Runnable
    public final void run() {
        am.z0 z0Var = this.f17957d.f54009g;
        com.tencent.pigeon.biz_base.MockCanvasModel mockCanvasModel = new com.tencent.pigeon.biz_base.MockCanvasModel(z0Var.f8498a, z0Var.f8499b);
        com.tencent.pigeon.biz_base.BizBaseCallbackApi bizBaseCallbackApi = this.f17958e.f67062e;
        if (bizBaseCallbackApi != null) {
            bizBaseCallbackApi.onInsertMockCanvasModel(0L, mockCanvasModel, b50.k0.f17955d);
        }
    }
}
