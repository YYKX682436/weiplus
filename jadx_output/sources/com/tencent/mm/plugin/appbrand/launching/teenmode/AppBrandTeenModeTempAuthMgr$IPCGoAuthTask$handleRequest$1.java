package com.tencent.mm.plugin.appbrand.launching.teenmode;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "<anonymous parameter 0>", "", "_bizKey", "", "_isAuthed", "Ljz5/f0;", "invoke", "(ILjava/lang/String;Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class AppBrandTeenModeTempAuthMgr$IPCGoAuthTask$handleRequest$1 extends kotlin.jvm.internal.q implements yz5.q {
    final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.teenmode.AppBrandTeenModeTempAuthMgr$IPCGoAuthTask this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBrandTeenModeTempAuthMgr$IPCGoAuthTask$handleRequest$1(com.tencent.mm.plugin.appbrand.launching.teenmode.AppBrandTeenModeTempAuthMgr$IPCGoAuthTask appBrandTeenModeTempAuthMgr$IPCGoAuthTask) {
        super(3);
        this.this$0 = appBrandTeenModeTempAuthMgr$IPCGoAuthTask;
    }

    @Override // yz5.q
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        invoke(((java.lang.Number) obj).intValue(), (java.lang.String) obj2, ((java.lang.Boolean) obj3).booleanValue());
        return jz5.f0.f302826a;
    }

    public final void invoke(int i17, java.lang.String _bizKey, boolean z17) {
        kotlin.jvm.internal.o.g(_bizKey, "_bizKey");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandTeenModeTempAuthMgr", "IPCGoAuthTask callback");
        com.tencent.mm.plugin.appbrand.launching.teenmode.AppBrandTeenModeTempAuthMgr$IPCGoAuthTask appBrandTeenModeTempAuthMgr$IPCGoAuthTask = this.this$0;
        com.tencent.mm.plugin.appbrand.launching.teenmode.AppBrandTeenModeTempAuthMgr$IPCGoAuthResult appBrandTeenModeTempAuthMgr$IPCGoAuthResult = new com.tencent.mm.plugin.appbrand.launching.teenmode.AppBrandTeenModeTempAuthMgr$IPCGoAuthResult();
        appBrandTeenModeTempAuthMgr$IPCGoAuthResult.setBizKey(_bizKey);
        appBrandTeenModeTempAuthMgr$IPCGoAuthResult.setCanGoOn(z17);
        appBrandTeenModeTempAuthMgr$IPCGoAuthTask.finishProcess(appBrandTeenModeTempAuthMgr$IPCGoAuthResult);
    }
}
