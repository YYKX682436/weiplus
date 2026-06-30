package com.tencent.maas.camstudio;

/* loaded from: classes5.dex */
public class d extends com.tencent.maas.camstudio.MJAIGCBridgeServiceCallback$BaseCallback {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.camstudio.a f47929a;

    public d(com.tencent.maas.camstudio.MJAIGCBridgeService mJAIGCBridgeService, com.tencent.maas.camstudio.a aVar, boolean z17) {
        super(mJAIGCBridgeService, z17);
        this.f47929a = aVar;
    }

    @Override // com.tencent.maas.camstudio.MJAIGCBridgeServiceCallback$BaseCallback
    public void onInvoke(com.tencent.maas.camstudio.MJAIGCBridgeService mJAIGCBridgeService, java.lang.Object obj) {
        com.tencent.maas.camstudio.MJAIGCBridgeServiceCallback$MJAIGCBridgeServiceCallbackArg.OnQueryArg onQueryArg = (com.tencent.maas.camstudio.MJAIGCBridgeServiceCallback$MJAIGCBridgeServiceCallbackArg.OnQueryArg) obj;
        com.tencent.maas.camstudio.a aVar = this.f47929a;
        if (aVar == null || onQueryArg == null) {
            return;
        }
        com.tencent.maas.camstudio.MJAIGCTaskInfo taskInfo = onQueryArg.taskInfo;
        zx0.f fVar = (zx0.f) aVar;
        kotlin.jvm.internal.o.g(taskInfo, "taskInfo");
        yx0.b8 b8Var = (yx0.b8) fVar.f477003a.get();
        if (b8Var == null) {
            return;
        }
        fVar.f477006d = kotlinx.coroutines.l.d(b8Var.L, null, null, new zx0.d(taskInfo, b8Var, fVar, null), 3, null);
    }
}
