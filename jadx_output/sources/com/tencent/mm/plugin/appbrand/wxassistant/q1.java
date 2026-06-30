package com.tencent.mm.plugin.appbrand.wxassistant;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0004\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00000\u0000 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/os/Bundle;", "kotlin.jvm.PlatformType", com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, "Lcom/tencent/mm/ipcinvoker/r;", "<anonymous parameter 1>", "Ljz5/f0;", "invoke", "(Landroid/os/Bundle;Lcom/tencent/mm/ipcinvoker/r;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class q1<InputType, ResultType> implements com.tencent.mm.ipcinvoker.i {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.wxassistant.q1 f92297d = new com.tencent.mm.plugin.appbrand.wxassistant.q1();

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        int i17 = bundle.getInt("callbackId");
        android.os.Parcelable parcelable = bundle.getParcelable("params");
        kotlin.jvm.internal.o.d(parcelable);
        com.tencent.mm.plugin.appbrand.service.u5 u5Var = (com.tencent.mm.plugin.appbrand.service.u5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.u5.class);
        com.tencent.mm.plugin.appbrand.service.CdpCommandParamsWrapper cdpCommandParamsWrapper = new com.tencent.mm.plugin.appbrand.service.CdpCommandParamsWrapper(i17, (com.tencent.mm.plugin.appbrand.service.CdpCommandParams) parcelable);
        com.tencent.mm.plugin.appbrand.wxassistant.u0 u0Var = (com.tencent.mm.plugin.appbrand.wxassistant.u0) u5Var;
        u0Var.getClass();
        com.tencent.mm.plugin.appbrand.wxassistant.j1 j1Var = u0Var.f92318e;
        j1Var.getClass();
        kotlinx.coroutines.l.d(j1Var.f92216b, null, null, new com.tencent.mm.plugin.appbrand.wxassistant.d1(cdpCommandParamsWrapper, j1Var, null), 3, null);
    }
}
