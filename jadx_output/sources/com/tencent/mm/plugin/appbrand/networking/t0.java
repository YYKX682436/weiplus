package com.tencent.mm.plugin.appbrand.networking;

/* loaded from: classes2.dex */
public final class t0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f86134d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f86135e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f86135e = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.appbrand.networking.t0(this.f86135e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.appbrand.networking.t0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f86134d;
        boolean z17 = true;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.String str = this.f86135e;
            this.f86134d = 1;
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            try {
                com.tencent.mars.xlog.Log.i("Luggage.WxaPrefetchDNSDomainsUtils", "prefetchForDomain(" + str + "):" + java.net.InetAddress.getByName(str) + " cost:" + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.i("Luggage.WxaPrefetchDNSDomainsUtils", "prefetchForDomain(" + str + "):failed with exception:" + e17);
                z17 = false;
            }
            rVar.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.valueOf(z17)));
            obj = rVar.j();
            pz5.a aVar2 = pz5.a.f359186d;
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
