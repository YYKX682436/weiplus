package com.tencent.mm.plugin.appbrand.task.preload;

@mk0.a
/* loaded from: classes7.dex */
public class t implements com.tencent.mm.ipcinvoker.i<android.content.Intent, com.tencent.mm.ipcinvoker.type.IPCVoid> {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.plugin.appbrand.task.AppBrandTaskPreloadReceiver.a("PreloadIPCTaskImpl", (android.content.Intent) obj);
        rVar.a(com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d);
    }
}
