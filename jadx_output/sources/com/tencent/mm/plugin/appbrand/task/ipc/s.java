package com.tencent.mm.plugin.appbrand.task.ipc;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/task/ipc/s;", "Lcom/tencent/mm/ipcinvoker/g;", "Lcom/tencent/mm/plugin/appbrand/task/ipc/AppBrandProcessSuicideNotifyTask$Args;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class s extends com.tencent.mm.ipcinvoker.g<com.tencent.mm.plugin.appbrand.task.ipc.AppBrandProcessSuicideNotifyTask$Args, com.tencent.mm.ipcinvoker.type.IPCVoid> {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.plugin.appbrand.task.ipc.AppBrandProcessSuicideNotifyTask$Args data = (com.tencent.mm.plugin.appbrand.task.ipc.AppBrandProcessSuicideNotifyTask$Args) obj;
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String str = data.f89047d;
        int i17 = data.f89049f;
        try {
            java.util.List h17 = com.tencent.mm.plugin.appbrand.task.u0.f89199h.a().h(new com.tencent.mm.plugin.appbrand.task.ipc.r(str));
            java.util.ArrayList arrayList = (java.util.ArrayList) h17;
            java.util.Iterator it = arrayList.iterator();
            long j17 = 0;
            while (it.hasNext()) {
                j17 = java.lang.Math.max(j17, ((com.tencent.mm.plugin.appbrand.task.k) it.next()).v());
            }
            long j18 = data.f89048e;
            boolean z17 = false;
            if (j17 <= j18) {
                ((com.tencent.mm.plugin.appbrand.task.k) kz5.n0.X(h17)).m();
                java.util.Iterator it6 = arrayList.iterator();
                while (it6.hasNext()) {
                    com.tencent.mm.plugin.appbrand.task.k kVar = (com.tencent.mm.plugin.appbrand.task.k) it6.next();
                    kVar.getClass();
                    kVar.f47642c = com.tencent.luggage.sdk.processes.LuggageServiceType.f47628g;
                    kVar.a();
                    kVar.j();
                    kVar.f89083n = false;
                }
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(365, i17);
                z17 = true;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandProcessSuicideNotifyTask", "executeAsync in main process, processName:" + str + ", killed:" + z17 + ", timestamp:(" + j17 + " , " + j18 + ')');
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandProcessSuicideNotifyTask", "executeAsync in main process, processName:" + str + ", get exception:" + e17);
        }
    }
}
