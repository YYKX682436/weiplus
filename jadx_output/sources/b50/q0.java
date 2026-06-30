package b50;

/* loaded from: classes11.dex */
public final class q0 implements com.tencent.mm.storage.z1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.finderbox.flutter.model.BoxFlutterBizPlugin f17980a;

    public q0(com.tencent.mm.feature.finderbox.flutter.model.BoxFlutterBizPlugin boxFlutterBizPlugin) {
        this.f17980a = boxFlutterBizPlugin;
    }

    @Override // com.tencent.mm.storage.z1
    public final void a(java.lang.Object obj, com.tencent.mm.storage.x1 x1Var) {
        com.tencent.pigeon.biz_base.BizBaseCallbackApi bizBaseCallbackApi;
        com.tencent.pigeon.biz_base.BizNotifyTipsInfo g17 = yw.h1.f466332a.g();
        if (g17 == null || (bizBaseCallbackApi = this.f17980a.f67062e) == null) {
            return;
        }
        bizBaseCallbackApi.onNotifyChange(g17, b50.p0.f17978d);
    }
}
