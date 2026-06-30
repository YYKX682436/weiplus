package com.tencent.maas.camstudio;

/* loaded from: classes16.dex */
public class t0 extends com.tencent.maas.camstudio.MJCamSessionCallback$BaseCallback {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.camstudio.i0 f47986a;

    public t0(com.tencent.maas.camstudio.MJCamSession mJCamSession, com.tencent.maas.camstudio.i0 i0Var) {
        super(mJCamSession);
        this.f47986a = i0Var;
    }

    @Override // com.tencent.maas.camstudio.MJCamSessionCallback$BaseCallback
    public void onInvoke(com.tencent.maas.camstudio.MJCamSession mJCamSession, java.lang.Object obj) {
        com.tencent.maas.camstudio.MJCamSessionCallback$MJCamSessionCallbackArg.SaveAIGCCraftCompleteArg saveAIGCCraftCompleteArg = (com.tencent.maas.camstudio.MJCamSessionCallback$MJCamSessionCallbackArg.SaveAIGCCraftCompleteArg) obj;
        com.tencent.maas.camstudio.i0 i0Var = this.f47986a;
        if (i0Var == null || saveAIGCCraftCompleteArg == null) {
            return;
        }
        ((px0.o) i0Var).a(saveAIGCCraftCompleteArg.asyncAIGCInfo, saveAIGCCraftCompleteArg.mjError);
    }

    public t0(com.tencent.maas.camstudio.MJCamoSession mJCamoSession, com.tencent.maas.camstudio.i0 i0Var) {
        super(mJCamoSession);
        this.f47986a = i0Var;
    }

    @Override // com.tencent.maas.camstudio.MJCamSessionCallback$BaseCallback
    public void onInvoke(com.tencent.maas.camstudio.MJCamoSession mJCamoSession, java.lang.Object obj) {
        com.tencent.maas.camstudio.MJCamSessionCallback$MJCamSessionCallbackArg.SaveAIGCCraftCompleteArg saveAIGCCraftCompleteArg = (com.tencent.maas.camstudio.MJCamSessionCallback$MJCamSessionCallbackArg.SaveAIGCCraftCompleteArg) obj;
        com.tencent.maas.camstudio.i0 i0Var = this.f47986a;
        if (i0Var == null || saveAIGCCraftCompleteArg == null) {
            return;
        }
        ((px0.o) i0Var).a(saveAIGCCraftCompleteArg.asyncAIGCInfo, saveAIGCCraftCompleteArg.mjError);
    }
}
