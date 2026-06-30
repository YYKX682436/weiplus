package com.tencent.liteapp.framework.dynamic_module;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lorg/json/JSONObject;", com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, "", "keepAliveCallback", "Ljz5/f0;", "invoke", "(Lorg/json/JSONObject;Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class WeixinPayService$startYunShanFuPay$1 extends kotlin.jvm.internal.q implements yz5.p {
    final /* synthetic */ com.tencent.liteapp.framework.dynamic_module.WeixinPayService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WeixinPayService$startYunShanFuPay$1(com.tencent.liteapp.framework.dynamic_module.WeixinPayService weixinPayService) {
        super(2);
        this.this$0 = weixinPayService;
    }

    @Override // yz5.p
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        invoke((org.json.JSONObject) obj, ((java.lang.Boolean) obj2).booleanValue());
        return jz5.f0.f302826a;
    }

    public final void invoke(org.json.JSONObject jSONObject, boolean z17) {
        this.this$0.getCallback().a(jSONObject, z17, false);
    }
}
