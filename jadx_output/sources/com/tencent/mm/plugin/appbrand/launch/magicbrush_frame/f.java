package com.tencent.mm.plugin.appbrand.launch.magicbrush_frame;

/* loaded from: classes7.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f84276d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.WAMagicBrushFrameLaunchParams f84277e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.m f84278f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.WAMagicBrushFrameLaunchParams wAMagicBrushFrameLaunchParams, com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.m mVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f84277e = wAMagicBrushFrameLaunchParams;
        this.f84278f = mVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.f(this.f84277e, this.f84278f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.f) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f84276d;
        com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.m mVar = this.f84278f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.WAMagicBrushFrameLaunchParams wAMagicBrushFrameLaunchParams = this.f84277e;
            ng1.g gVar = new ng1.g(wAMagicBrushFrameLaunchParams.f84242d, wAMagicBrushFrameLaunchParams.f84243e, new com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.e(mVar));
            com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.w wVar = new com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.w();
            this.f84276d = 1;
            obj = ng1.f.b(wVar, gVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        ((com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.c) mVar.a()).f84261d.f84243e = ((k91.v5) obj).field_appId;
        return obj;
    }
}
