package com.tencent.mm.plugin.appbrand.ui;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/ui/y8;", "Lcom/tencent/mm/ipcinvoker/i;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes7.dex */
public final class y8 implements com.tencent.mm.ipcinvoker.i<com.tencent.mm.ipcinvoker.type.IPCString, com.tencent.mm.ipcinvoker.type.IPCVoid> {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        java.lang.String str;
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) obj;
        com.tencent.mm.plugin.appbrand.service.AppBrandUIEnterAnimationCompleteEvent appBrandUIEnterAnimationCompleteEvent = new com.tencent.mm.plugin.appbrand.service.AppBrandUIEnterAnimationCompleteEvent();
        if (iPCString == null || (str = iPCString.f68406d) == null) {
            str = "";
        }
        appBrandUIEnterAnimationCompleteEvent.f88602g.f88692a = str;
        appBrandUIEnterAnimationCompleteEvent.b(android.os.Looper.getMainLooper());
        if (rVar != null) {
            rVar.a(com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d);
        }
    }
}
