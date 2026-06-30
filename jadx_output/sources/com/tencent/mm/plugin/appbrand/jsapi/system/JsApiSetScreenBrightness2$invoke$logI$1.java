package com.tencent.mm.plugin.appbrand.jsapi.system;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, "Ljz5/f0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class JsApiSetScreenBrightness2$invoke$logI$1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f83450d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f83451e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsApiSetScreenBrightness2$invoke$logI$1(com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17) {
        super(1);
        this.f83450d = lVar;
        this.f83451e = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String message = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(message, "message");
        com.tencent.mars.xlog.Log.i("Luggage.JsApiSetScreenBrightness2", "invoke(appId:" + this.f83450d.getAppId() + ", callbackId:" + this.f83451e + ") " + message);
        return jz5.f0.f302826a;
    }
}
