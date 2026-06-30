package b50;

/* loaded from: classes11.dex */
public final class s0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.finderbox.flutter.model.BoxFlutterBizPlugin f17984d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f17985e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(com.tencent.mm.feature.finderbox.flutter.model.BoxFlutterBizPlugin boxFlutterBizPlugin, kotlin.jvm.internal.h0 h0Var) {
        super(0);
        this.f17984d = boxFlutterBizPlugin;
        this.f17985e = h0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.pigeon.biz_base.BizBaseCallbackApi bizBaseCallbackApi = this.f17984d.f67062e;
        if (bizBaseCallbackApi != null) {
            bizBaseCallbackApi.onDataChange(new com.tencent.pigeon.biz_base.BizNotifyInfo(java.lang.Long.valueOf(com.tencent.pigeon.biz_base.BizNotifyEventType.EVENT_TYPE_UPDATE.ordinal()), null, null, (java.lang.String) this.f17985e.f310123d, 6, null), b50.r0.f17982d);
        }
        return jz5.f0.f302826a;
    }
}
