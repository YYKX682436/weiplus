package com.tencent.mm.plugin.appbrand.launching.teenmode;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "<anonymous parameter 0>", "", "bizKey", "", "isAuthed", "Ljz5/f0;", "invoke", "(ILjava/lang/String;Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class AppBrandTeenModeTempAuthMgr$jumpToSendAuthorizationReqUI$1 extends kotlin.jvm.internal.q implements yz5.q {
    final /* synthetic */ yz5.p $afterCheckAuthCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBrandTeenModeTempAuthMgr$jumpToSendAuthorizationReqUI$1(yz5.p pVar) {
        super(3);
        this.$afterCheckAuthCallback = pVar;
    }

    @Override // yz5.q
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        invoke(((java.lang.Number) obj).intValue(), (java.lang.String) obj2, ((java.lang.Boolean) obj3).booleanValue());
        return jz5.f0.f302826a;
    }

    public final void invoke(int i17, java.lang.String bizKey, boolean z17) {
        kotlin.jvm.internal.o.g(bizKey, "bizKey");
        yz5.p pVar = this.$afterCheckAuthCallback;
        java.lang.String w17 = r26.i0.w(bizKey, "weapp_", "", false);
        pVar.invoke(w17 != null ? w17 : "", java.lang.Boolean.valueOf(z17));
    }
}
