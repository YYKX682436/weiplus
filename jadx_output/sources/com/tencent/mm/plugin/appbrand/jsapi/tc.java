package com.tencent.mm.plugin.appbrand.jsapi;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/tc;", "Lcom/tencent/mm/ipcinvoker/k0;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class tc implements com.tencent.mm.ipcinvoker.k0 {
    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) obj;
        com.tencent.mm.autogen.events.RtosWatchSaveQuickReplyEvent rtosWatchSaveQuickReplyEvent = new com.tencent.mm.autogen.events.RtosWatchSaveQuickReplyEvent();
        rtosWatchSaveQuickReplyEvent.f54717g.f6787a = iPCString != null ? iPCString.toString() : null;
        rtosWatchSaveQuickReplyEvent.e();
        return new com.tencent.mm.ipcinvoker.type.IPCString(rtosWatchSaveQuickReplyEvent.f54718h.f6865a);
    }
}
