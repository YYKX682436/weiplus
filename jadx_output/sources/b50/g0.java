package b50;

/* loaded from: classes11.dex */
public final class g0 implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.finderbox.flutter.model.BoxFlutterBizPlugin f17943d;

    public g0(com.tencent.mm.feature.finderbox.flutter.model.BoxFlutterBizPlugin boxFlutterBizPlugin) {
        this.f17943d = boxFlutterBizPlugin;
    }

    @Override // com.tencent.mm.ui.xc
    public final void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.feature.finderbox.flutter.model.BoxFlutterBizPlugin boxFlutterBizPlugin = this.f17943d;
        if (i17 == boxFlutterBizPlugin.f67067m && i18 == -1 && intent != null) {
            int intExtra = intent.getIntExtra("personalizedOperation", 0);
            com.tencent.pigeon.biz.BizCallbackApi bizCallbackApi = boxFlutterBizPlugin.f67063f;
            if (bizCallbackApi != null) {
                bizCallbackApi.markPersonalizedChanged(intExtra, b50.f0.f17941d);
            }
        }
    }
}
