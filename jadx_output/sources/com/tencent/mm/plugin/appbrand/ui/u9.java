package com.tencent.mm.plugin.appbrand.ui;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/ui/u9;", "Lcom/tencent/mm/ipcinvoker/g;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class u9 extends com.tencent.mm.ipcinvoker.g<com.tencent.mm.ipcinvoker.type.IPCString, com.tencent.mm.ipcinvoker.type.IPCVoid> {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.ipcinvoker.type.IPCString data = (com.tencent.mm.ipcinvoker.type.IPCString) obj;
        kotlin.jvm.internal.o.g(data, "data");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.tencent.mm.plugin.appbrand.ui.w9.f90314a;
        java.lang.String value = data.f68406d;
        kotlin.jvm.internal.o.f(value, "value");
        com.tencent.mm.plugin.appbrand.ui.w9.f90314a.remove(value);
        if (rVar != null) {
            uk0.a.a(rVar);
        }
    }
}
