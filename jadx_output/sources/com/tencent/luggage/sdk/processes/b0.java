package com.tencent.luggage.sdk.processes;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/luggage/sdk/processes/b0;", "Lcom/tencent/mm/ipcinvoker/i;", "Lcom/tencent/luggage/sdk/processes/client/LuggageClientProcessMessage;", "Lze/n;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "luggage-wechat-full-sdk_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes7.dex */
public final class b0 implements com.tencent.mm.ipcinvoker.i<com.tencent.luggage.sdk.processes.client.LuggageClientProcessMessage<? extends ze.n>, com.tencent.mm.ipcinvoker.type.IPCVoid> {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r callback) {
        com.tencent.luggage.sdk.processes.client.LuggageClientProcessMessage data = (com.tencent.luggage.sdk.processes.client.LuggageClientProcessMessage) obj;
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(callback, "callback");
        xe.g.f453740a.a(data);
        callback.a(com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d);
    }
}
