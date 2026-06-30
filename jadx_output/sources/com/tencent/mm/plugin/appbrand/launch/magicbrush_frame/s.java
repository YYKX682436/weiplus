package com.tencent.mm.plugin.appbrand.launch.magicbrush_frame;

/* loaded from: classes7.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f84313d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.WAMagicBrushFrameLaunchParams f84314e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f84315f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.WAMagicBrushFrameLaunchParams wAMagicBrushFrameLaunchParams, com.tencent.mm.ipcinvoker.r rVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f84314e = wAMagicBrushFrameLaunchParams;
        this.f84315f = rVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.s(this.f84314e, this.f84315f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.s) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f84313d;
        com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.WAMagicBrushFrameLaunchParams params = this.f84314e;
        com.tencent.mm.ipcinvoker.r rVar = this.f84315f;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.m mVar = new com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.m();
                kotlin.jvm.internal.o.f(params, "$params");
                this.f84313d = 1;
                obj = mVar.b(params, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC appBrandSysConfigWC = (com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC) obj;
            params.f84243e = appBrandSysConfigWC.f305842e;
            if (rVar != null) {
                rVar.a(new com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.WAMagicBrushFrameColdLaunchRuntimeLoaderProxy$WAMagicBrushFrameColdLaunchResultIPCWrapper(true, appBrandSysConfigWC, null, 4, null));
            }
        } catch (java.lang.Exception e17) {
            if (rVar != null) {
                rVar.a(new com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.WAMagicBrushFrameColdLaunchRuntimeLoaderProxy$WAMagicBrushFrameColdLaunchResultIPCWrapper(false, null, e17.getMessage(), 2, null));
            }
        }
        return jz5.f0.f302826a;
    }
}
