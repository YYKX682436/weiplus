package b50;

/* loaded from: classes11.dex */
public final class u0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.finderbox.flutter.model.BoxFlutterBizPlugin f17990d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(com.tencent.mm.feature.finderbox.flutter.model.BoxFlutterBizPlugin boxFlutterBizPlugin) {
        super(0);
        this.f17990d = boxFlutterBizPlugin;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.feature.finderbox.flutter.model.BoxFlutterBizPlugin boxFlutterBizPlugin = this.f17990d;
        com.tencent.mars.xlog.Log.i(boxFlutterBizPlugin.f67061d, "onScreenShot");
        com.tencent.pigeon.biz_base.BizBaseCallbackApi bizBaseCallbackApi = boxFlutterBizPlugin.f67062e;
        if (bizBaseCallbackApi != null) {
            bizBaseCallbackApi.onBizPageScreenShot(b50.t0.f17988d);
        }
        return jz5.f0.f302826a;
    }
}
