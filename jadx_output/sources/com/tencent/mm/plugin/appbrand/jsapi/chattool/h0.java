package com.tencent.mm.plugin.appbrand.jsapi.chattool;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/chattool/h0;", "Lcom/tencent/mm/ipcinvoker/i;", "Landroid/os/Bundle;", "Lcom/tencent/mm/ipcinvoker/type/IPCInteger;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class h0 implements com.tencent.mm.ipcinvoker.i<android.os.Bundle, com.tencent.mm.ipcinvoker.type.IPCInteger> {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        if (bundle == null) {
            if (rVar != null) {
                rVar.a(new com.tencent.mm.ipcinvoker.type.IPCInteger(0));
            }
        } else {
            int a17 = k01.d.a(bundle.getString("KEY_CHAT_TOOL_ROOM", ""));
            if (rVar != null) {
                rVar.a(new com.tencent.mm.ipcinvoker.type.IPCInteger(a17));
            }
        }
    }
}
