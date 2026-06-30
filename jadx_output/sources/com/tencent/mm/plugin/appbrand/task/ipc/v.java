package com.tencent.mm.plugin.appbrand.task.ipc;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/task/ipc/v;", "Lcom/tencent/mm/ipcinvoker/g;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class v extends com.tencent.mm.ipcinvoker.g<com.tencent.mm.ipcinvoker.type.IPCString, com.tencent.mm.ipcinvoker.type.IPCVoid> {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        java.lang.String str;
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) obj;
        if (iPCString != null) {
            try {
                str = iPCString.f68406d;
            } finally {
                if (rVar != null) {
                    uk0.a.a(rVar);
                }
            }
        } else {
            str = null;
        }
        if (str != null) {
            com.tencent.mm.plugin.appbrand.task.u0.f89199h.a().N(new com.tencent.mm.plugin.appbrand.task.ipc.u(str));
            if (rVar == null) {
            }
        }
    }
}
