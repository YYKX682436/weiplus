package com.tencent.mm.plugin.appbrand.wxassistant.cdp;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0005\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroid/os/Bundle;", "kotlin.jvm.PlatformType", "<anonymous parameter 0>", "Lcom/tencent/mm/ipcinvoker/r;", "Lcom/tencent/mm/ipcinvoker/type/IPCBoolean;", "callback", "Ljz5/f0;", "invoke", "(Landroid/os/Bundle;Lcom/tencent/mm/ipcinvoker/r;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class g2<InputType, ResultType> implements com.tencent.mm.ipcinvoker.i {
    static {
        new com.tencent.mm.plugin.appbrand.wxassistant.cdp.g2();
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CDPCommand_LaunchApplet", "checkAnr in target process");
        rVar.a(new com.tencent.mm.ipcinvoker.type.IPCBoolean(true));
        com.tencent.mm.plugin.appbrand.wxassistant.o3 o3Var = com.tencent.mm.plugin.appbrand.wxassistant.h3.f92208a;
        rk0.c.c("MicroMsg.WxAssistantMonitor", "trigger", new java.lang.Object[0]);
        com.tencent.mm.plugin.appbrand.wxassistant.h3.f92208a.h();
    }
}
