package com.tencent.mm.minigame;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/minigame/c;", "Lcom/tencent/mm/ipcinvoker/g;", "Lcom/tencent/mm/minigame/AppBrandProcessWVARunningNotifyTask$Args;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class c extends com.tencent.mm.ipcinvoker.g<com.tencent.mm.minigame.AppBrandProcessWVARunningNotifyTask$Args, com.tencent.mm.ipcinvoker.type.IPCVoid> {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.minigame.AppBrandProcessWVARunningNotifyTask$Args data = (com.tencent.mm.minigame.AppBrandProcessWVARunningNotifyTask$Args) obj;
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mars.xlog.Log.i("AppBrandProcessWVARunningNotifyTask", "execute notify wva running, in main process");
        java.util.Iterator it = ((java.util.ArrayList) com.tencent.mm.plugin.appbrand.task.u0.f89199h.a().h(new com.tencent.mm.minigame.b(data.f68986d))).iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.appbrand.task.k kVar = (com.tencent.mm.plugin.appbrand.task.k) it.next();
            kVar.f89083n = true;
            com.tencent.mars.xlog.Log.i("AppBrandProcessWVARunningNotifyTask", "execute notify wva running, set " + kVar.i() + " -> isRunningWVA = true");
        }
    }
}
