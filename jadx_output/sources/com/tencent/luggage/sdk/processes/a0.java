package com.tencent.luggage.sdk.processes;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/luggage/sdk/processes/a0;", "Lcom/tencent/mm/ipcinvoker/i;", "Lcom/tencent/luggage/sdk/processes/LuggageClientProcessMessage2;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "luggage-wechat-full-sdk_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes.dex */
final class a0 implements com.tencent.mm.ipcinvoker.i<com.tencent.luggage.sdk.processes.LuggageClientProcessMessage2, com.tencent.mm.ipcinvoker.type.IPCVoid> {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r callback) {
        com.tencent.luggage.sdk.processes.LuggageClientProcessMessage2 data = (com.tencent.luggage.sdk.processes.LuggageClientProcessMessage2) obj;
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(callback, "callback");
        data.a();
        callback.a(com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d);
    }
}
