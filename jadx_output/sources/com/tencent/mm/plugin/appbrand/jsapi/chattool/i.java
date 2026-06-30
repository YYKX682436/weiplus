package com.tencent.mm.plugin.appbrand.jsapi.chattool;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/chattool/i;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/plugin/appbrand/jsapi/chattool/ChatToolRoomsBundle;", "Lcom/tencent/mm/ipcinvoker/type/IPCBoolean;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes4.dex */
public final class i implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.plugin.appbrand.jsapi.chattool.ChatToolRoomsBundle data = (com.tencent.mm.plugin.appbrand.jsapi.chattool.ChatToolRoomsBundle) obj;
        kotlin.jvm.internal.o.g(data, "data");
        k01.q0 q0Var = (k01.q0) i95.n0.c(k01.q0.class);
        boolean Ai = q0Var != null ? ((com.tencent.mm.plugin.appbrand.jsapi.chattool.w0) q0Var).Ai(data.f80356e, data.f80355d) : false;
        if (rVar != null) {
            rVar.a(new com.tencent.mm.ipcinvoker.type.IPCBoolean(Ai));
        }
    }
}
