package com.tencent.mm.plugin.appbrand.task;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/task/u1;", "Lcom/tencent/mm/ipcinvoker/i;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes7.dex */
public final class u1 implements com.tencent.mm.ipcinvoker.i<com.tencent.mm.ipcinvoker.type.IPCVoid, com.tencent.mm.ipcinvoker.type.IPCVoid> {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.ipcinvoker.type.IPCVoid iPCVoid = com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d;
        try {
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeSuspendingMainProcessTriggerCheckEvent.f74857g.a(true);
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_appbrand_release_preloaded_instances_on_wx_bg, 0) == 1) {
                cf.d dVar = new cf.d(com.tencent.mm.plugin.appbrand.task.t1.f89196d, com.tencent.mm.plugin.appbrand.task.x0.values().length - 1);
                for (com.tencent.mm.plugin.appbrand.task.x0 x0Var : com.tencent.mm.plugin.appbrand.task.x0.values()) {
                    if (com.tencent.mm.plugin.appbrand.task.x0.NIL != x0Var) {
                        ((km5.q) com.tencent.mm.plugin.appbrand.task.r.p(x0Var)).a(new com.tencent.mm.plugin.appbrand.task.s1(dVar));
                    }
                }
                if (rVar == null) {
                }
            }
        } finally {
            if (rVar != null) {
                rVar.a(iPCVoid);
            }
        }
    }
}
