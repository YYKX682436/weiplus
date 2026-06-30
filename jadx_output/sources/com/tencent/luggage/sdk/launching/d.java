package com.tencent.luggage.sdk.launching;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "R", "Landroid/os/Parcelable;", com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, "Lcom/tencent/luggage/sdk/launching/OnWXAppResultXPCMessage;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
final class d<InputType, ResultType> implements com.tencent.mm.ipcinvoker.k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.luggage.sdk.launching.d f47609a = new com.tencent.luggage.sdk.launching.d();

    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.luggage.sdk.launching.OnWXAppResultXPCMessage onWXAppResultXPCMessage = (com.tencent.luggage.sdk.launching.OnWXAppResultXPCMessage) obj;
        com.tencent.mm.ipcinvoker.type.IPCVoid iPCVoid = com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d;
        if (onWXAppResultXPCMessage != null) {
            try {
                android.os.Parcelable parcelable = onWXAppResultXPCMessage.f47602f;
                com.tencent.mars.xlog.Log.i("MicroMsg.OnWXAppResultEventSender", "IPCSyncInvokeTask publish event, " + parcelable);
                com.tencent.luggage.sdk.launching.OnWXAppResultLocalEvent onWXAppResultLocalEvent = new com.tencent.luggage.sdk.launching.OnWXAppResultLocalEvent();
                onWXAppResultLocalEvent.f47595g = onWXAppResultXPCMessage.f47600d;
                onWXAppResultLocalEvent.f47596h = onWXAppResultXPCMessage.f47601e;
                onWXAppResultLocalEvent.f47597i = parcelable;
                onWXAppResultLocalEvent.e();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.OnWXAppResultEventSender", "IPCSyncInvokeTask error, " + android.util.Log.getStackTraceString(e17));
            }
        }
        return iPCVoid;
    }
}
