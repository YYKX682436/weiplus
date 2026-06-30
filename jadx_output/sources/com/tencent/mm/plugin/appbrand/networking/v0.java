package com.tencent.mm.plugin.appbrand.networking;

/* loaded from: classes2.dex */
public final class v0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f86140d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f86141e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(java.lang.String str, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f86140d = str;
        this.f86141e = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.appbrand.networking.v0(this.f86140d, this.f86141e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.appbrand.networking.v0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.net.InetAddress inetAddress;
        java.lang.String str = this.f86140d;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        try {
            inetAddress = java.net.InetAddress.getByName(str);
            long j17 = this.f86141e;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("prefetchForUrl(");
            sb6.append(str);
            sb6.append(':');
            sb6.append(inetAddress);
            sb6.append("), succeed, cost:");
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            sb6.append(android.os.SystemClock.elapsedRealtime() - j17);
            com.tencent.mars.xlog.Log.i("Luggage.WxaPrefetchDNSDomainsUtils", sb6.toString());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i("Luggage.WxaPrefetchDNSDomainsUtils", "prefetchForUrl(" + str + "), failed with exception:" + e17);
            inetAddress = null;
        }
        return new jz5.l(str, inetAddress);
    }
}
