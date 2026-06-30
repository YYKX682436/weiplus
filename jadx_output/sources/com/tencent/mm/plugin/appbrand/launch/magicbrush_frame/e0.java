package com.tencent.mm.plugin.appbrand.launch.magicbrush_frame;

/* loaded from: classes7.dex */
public final class e0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f84272d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fh1.z f84273e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fj1.y f84274f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.WAMagicBrushFrameLaunchParams f84275g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(fh1.z zVar, fj1.y yVar, com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.WAMagicBrushFrameLaunchParams wAMagicBrushFrameLaunchParams, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f84273e = zVar;
        this.f84274f = yVar;
        this.f84275g = wAMagicBrushFrameLaunchParams;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.e0(this.f84273e, this.f84274f, this.f84275g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.e0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f84272d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            fh1.z zVar = this.f84273e;
            this.f84272d = 1;
            obj = zVar.b(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (!booleanValue) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WAMagicBrushFrameLauncher", "bizHostImpl.ensureMBServiceReady()==false, bizInstance:".concat(this.f84273e.c()));
            return f0Var;
        }
        this.f84274f.d().a0(this.f84273e);
        fh1.z zVar2 = this.f84273e;
        fj1.y yVar = this.f84274f;
        zVar2.f262636j = new com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.d0(yVar, zVar2);
        java.lang.String lowerCase = com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.b.b(yVar.f263147g).toString().toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
        fh1.z zVar3 = this.f84273e;
        java.lang.String c17 = this.f84274f.c();
        org.json.JSONObject jSONObject = (org.json.JSONObject) ((jz5.n) this.f84274f.f263155o).getValue();
        zVar3.getClass();
        zVar3.e(new fh1.x(zVar3, c17, lowerCase, jSONObject));
        fh1.z zVar4 = this.f84273e;
        java.lang.String c18 = this.f84274f.c();
        java.lang.String str = this.f84275g.f84246h;
        com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo appPkgInfo = this.f84274f.e().f305852r;
        kotlin.jvm.internal.o.f(appPkgInfo, "appPkgInfo");
        zVar4.getClass();
        zVar4.e(new fh1.t(zVar4, c18, lowerCase, str, appPkgInfo));
        return f0Var;
    }
}
