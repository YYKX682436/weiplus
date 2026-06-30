package com.tencent.mm.plugin.appbrand.jsapi.pay;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/pay/j0;", "Lcom/tencent/mm/ipcinvoker/j;", "Landroid/os/Bundle;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes9.dex */
public final class j0 implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        jz5.f0 f0Var;
        android.os.Bundle bundle = (android.os.Bundle) obj;
        if (bundle != null) {
            com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
            create.putBool("startFromOpenSpecificView", bundle.getBoolean("startFromOpenSpecificView"));
            create.putString("openView", bundle.getString("openView"));
            create.putInt("entryScene", bundle.getInt("entryScene"));
            ((h45.q) i95.n0.c(h45.q.class)).startUseCase(bundle.getString("useCaseUrl"), create, new com.tencent.mm.plugin.appbrand.jsapi.pay.i0(rVar));
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOpenWCPaySpecificView", "StartKindaSpecificUseCaseTask invoke data is null");
        }
    }
}
