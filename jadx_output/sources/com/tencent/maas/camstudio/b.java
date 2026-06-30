package com.tencent.maas.camstudio;

/* loaded from: classes5.dex */
public class b extends com.tencent.maas.camstudio.MJAIGCBridgeServiceCallback$BaseCallback {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.camstudio.a f47927a;

    public b(com.tencent.maas.camstudio.MJAIGCBridgeService mJAIGCBridgeService, com.tencent.maas.camstudio.a aVar, boolean z17) {
        super(mJAIGCBridgeService, z17);
        this.f47927a = aVar;
    }

    @Override // com.tencent.maas.camstudio.MJAIGCBridgeServiceCallback$BaseCallback
    public void onInvoke(com.tencent.maas.camstudio.MJAIGCBridgeService mJAIGCBridgeService, java.lang.Object obj) {
        com.tencent.maas.camstudio.MJAIGCBridgeServiceCallback$MJAIGCBridgeServiceCallbackArg.OnCancelArg onCancelArg = (com.tencent.maas.camstudio.MJAIGCBridgeServiceCallback$MJAIGCBridgeServiceCallbackArg.OnCancelArg) obj;
        com.tencent.maas.camstudio.a aVar = this.f47927a;
        if (aVar == null || onCancelArg == null) {
            return;
        }
        com.tencent.maas.camstudio.MJAIGCTaskInfo taskInfo = onCancelArg.taskInfo;
        zx0.f fVar = (zx0.f) aVar;
        kotlin.jvm.internal.o.g(taskInfo, "taskInfo");
        yx0.b8 b8Var = (yx0.b8) fVar.f477003a.get();
        if (b8Var == null) {
            return;
        }
        fVar.f477007e = kotlinx.coroutines.l.d(b8Var.L, null, null, new zx0.b(taskInfo, b8Var, null), 3, null);
    }
}
