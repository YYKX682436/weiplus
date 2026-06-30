package com.tencent.maas.camstudio;

/* loaded from: classes5.dex */
public class e extends com.tencent.maas.camstudio.MJAIGCBridgeServiceCallback$BaseCallback {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.camstudio.a f47930a;

    public e(com.tencent.maas.camstudio.MJAIGCBridgeService mJAIGCBridgeService, com.tencent.maas.camstudio.a aVar, boolean z17) {
        super(mJAIGCBridgeService, z17);
        this.f47930a = aVar;
    }

    @Override // com.tencent.maas.camstudio.MJAIGCBridgeServiceCallback$BaseCallback
    public void onInvoke(com.tencent.maas.camstudio.MJAIGCBridgeService mJAIGCBridgeService, java.lang.Object obj) {
        com.tencent.maas.camstudio.MJAIGCBridgeServiceCallback$MJAIGCBridgeServiceCallbackArg.OnSubmitArg onSubmitArg = (com.tencent.maas.camstudio.MJAIGCBridgeServiceCallback$MJAIGCBridgeServiceCallbackArg.OnSubmitArg) obj;
        com.tencent.maas.camstudio.a aVar = this.f47930a;
        if (aVar == null || onSubmitArg == null) {
            return;
        }
        com.tencent.maas.camstudio.MJAIGCSubmitRequest request = onSubmitArg.request;
        zx0.f fVar = (zx0.f) aVar;
        kotlin.jvm.internal.o.g(request, "request");
        yx0.b8 b8Var = (yx0.b8) fVar.f477003a.get();
        if (b8Var == null) {
            return;
        }
        fVar.f477005c = kotlinx.coroutines.l.d(b8Var.L, null, null, new zx0.e(b8Var, request, fVar, null), 3, null);
    }
}
