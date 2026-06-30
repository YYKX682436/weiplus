package b50;

/* loaded from: classes11.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.finderbox.flutter.model.BoxFlutterBizPlugin f17926d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.tencent.mm.feature.finderbox.flutter.model.BoxFlutterBizPlugin boxFlutterBizPlugin) {
        super(0);
        this.f17926d = boxFlutterBizPlugin;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.pigeon.biz_base.BizBaseCallbackApi bizBaseCallbackApi = this.f17926d.f67062e;
        if (bizBaseCallbackApi != null) {
            bizBaseCallbackApi.onDataChange(new com.tencent.pigeon.biz_base.BizNotifyInfo(java.lang.Long.valueOf(com.tencent.pigeon.biz_base.BizNotifyEventType.EVENT_TYPE_UPDATE.ordinal()), null, null, null, 14, null), b50.b.f17923d);
        }
        return jz5.f0.f302826a;
    }
}
