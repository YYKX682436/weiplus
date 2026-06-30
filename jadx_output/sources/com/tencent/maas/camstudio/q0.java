package com.tencent.maas.camstudio;

/* loaded from: classes16.dex */
public class q0 extends com.tencent.maas.camstudio.MJCamSessionCallback$BaseCallback {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.camstudio.f0 f47983a;

    public q0(com.tencent.maas.camstudio.MJCamSession mJCamSession, com.tencent.maas.camstudio.f0 f0Var, boolean z17) {
        super(mJCamSession, z17);
        this.f47983a = f0Var;
    }

    @Override // com.tencent.maas.camstudio.MJCamSessionCallback$BaseCallback
    public void onInvoke(com.tencent.maas.camstudio.MJCamSession mJCamSession, java.lang.Object obj) {
        com.tencent.maas.camstudio.MJCamSessionCallback$MJCamSessionCallbackArg.GestureEventArg gestureEventArg = (com.tencent.maas.camstudio.MJCamSessionCallback$MJCamSessionCallbackArg.GestureEventArg) obj;
        com.tencent.maas.camstudio.f0 f0Var = this.f47983a;
        if (f0Var == null || gestureEventArg == null) {
            return;
        }
        ((zx0.l) f0Var).a(gestureEventArg.gestureEvent);
    }

    public q0(com.tencent.maas.camstudio.MJCamoSession mJCamoSession, com.tencent.maas.camstudio.f0 f0Var, boolean z17) {
        super(mJCamoSession, z17);
        this.f47983a = f0Var;
    }

    @Override // com.tencent.maas.camstudio.MJCamSessionCallback$BaseCallback
    public void onInvoke(com.tencent.maas.camstudio.MJCamoSession mJCamoSession, java.lang.Object obj) {
        com.tencent.maas.camstudio.MJCamSessionCallback$MJCamSessionCallbackArg.GestureEventArg gestureEventArg = (com.tencent.maas.camstudio.MJCamSessionCallback$MJCamSessionCallbackArg.GestureEventArg) obj;
        com.tencent.maas.camstudio.f0 f0Var = this.f47983a;
        if (f0Var == null || gestureEventArg == null) {
            return;
        }
        ((zx0.l) f0Var).a(gestureEventArg.gestureEvent);
    }
}
