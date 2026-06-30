package com.tencent.mm.plugin.appbrand.screenshot;

/* loaded from: classes.dex */
public final class p implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f88539a;

    public p(kotlinx.coroutines.q qVar) {
        this.f88539a = qVar;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public final void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        boolean z17 = i17 == 0 && i18 == 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandScreenshotComponentHelper", "generateDefaultPosterPath: sun code request result - success=" + z17 + ", errType=" + i17 + ", errCode=" + i18);
        kotlinx.coroutines.q qVar = this.f88539a;
        if (!z17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandScreenshotComponentHelper", "generateDefaultPosterPath: failed to get sun code");
            qVar.resumeWith(kotlin.Result.m521constructorimpl(null));
            return;
        }
        com.tencent.mm.protobuf.f fVar = oVar.f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.GetWxaSunCodeResponse");
        com.tencent.mm.protobuf.g gVar = ((r45.bt3) fVar).f371035d;
        if (gVar != null) {
            byte[] bArr = gVar.f192156a;
        }
        qVar.resumeWith(kotlin.Result.m521constructorimpl(gVar));
    }
}
