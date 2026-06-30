package com.tencent.maas.camstudio;

/* loaded from: classes5.dex */
public class c extends com.tencent.maas.camstudio.MJAIGCBridgeServiceCallback$BaseCallback {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.camstudio.a f47928a;

    public c(com.tencent.maas.camstudio.MJAIGCBridgeService mJAIGCBridgeService, com.tencent.maas.camstudio.a aVar, boolean z17) {
        super(mJAIGCBridgeService, z17);
        this.f47928a = aVar;
    }

    @Override // com.tencent.maas.camstudio.MJAIGCBridgeServiceCallback$BaseCallback
    public void onInvoke(com.tencent.maas.camstudio.MJAIGCBridgeService mJAIGCBridgeService, java.lang.Object obj) {
        com.tencent.maas.camstudio.MJAIGCBridgeServiceCallback$MJAIGCBridgeServiceCallbackArg.OnCancelWithInfoArg onCancelWithInfoArg = (com.tencent.maas.camstudio.MJAIGCBridgeServiceCallback$MJAIGCBridgeServiceCallbackArg.OnCancelWithInfoArg) obj;
        com.tencent.maas.camstudio.a aVar = this.f47928a;
        if (aVar == null || onCancelWithInfoArg == null) {
            return;
        }
        com.tencent.maas.camstudio.MJAIGCTaskInfo taskInfo = onCancelWithInfoArg.taskInfo;
        com.tencent.maas.camstudio.MJAIGCCancelInfo cancelInfo = onCancelWithInfoArg.cancelInfo;
        zx0.f fVar = (zx0.f) aVar;
        kotlin.jvm.internal.o.g(taskInfo, "taskInfo");
        kotlin.jvm.internal.o.g(cancelInfo, "cancelInfo");
        yx0.b8 b8Var = (yx0.b8) fVar.f477003a.get();
        if (b8Var == null) {
            return;
        }
        fVar.f477007e = kotlinx.coroutines.l.d(b8Var.L, null, null, new zx0.c(taskInfo, cancelInfo.cancelReason, b8Var, null), 3, null);
    }
}
