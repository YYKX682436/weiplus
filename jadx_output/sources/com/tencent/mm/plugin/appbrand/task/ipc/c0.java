package com.tencent.mm.plugin.appbrand.task.ipc;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/task/ipc/c0;", "Lcom/tencent/mm/ipcinvoker/i;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "Lcom/tencent/mm/ipcinvoker/type/IPCBoolean;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes.dex */
public final class c0 implements com.tencent.mm.ipcinvoker.i<com.tencent.mm.ipcinvoker.type.IPCString, com.tencent.mm.ipcinvoker.type.IPCBoolean> {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.ipcinvoker.type.IPCString appId = (com.tencent.mm.ipcinvoker.type.IPCString) obj;
        kotlin.jvm.internal.o.g(appId, "appId");
        com.tencent.mm.plugin.appbrand.o6 b17 = com.tencent.mm.plugin.appbrand.l.b(appId.f68406d);
        if (b17 == null) {
            if (rVar != null) {
                rVar.a(new com.tencent.mm.ipcinvoker.type.IPCBoolean(false));
            }
        } else if (rVar != null) {
            rVar.a(new com.tencent.mm.ipcinvoker.type.IPCBoolean(b17.J1()));
        }
    }
}
