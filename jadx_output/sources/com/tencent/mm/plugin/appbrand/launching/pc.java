package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes.dex */
public final class pc extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f84930d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pc(yz5.p pVar) {
        super(3);
        this.f84930d = pVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        java.lang.String str = (java.lang.String) obj3;
        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.WVADownloadInfoFetcher", "fetchWVADownloadInfo: CGI error, errType=" + intValue + ", errCode=" + intValue2 + ", errMsg=" + str);
        this.f84930d.invoke(java.lang.Integer.valueOf(intValue2), str);
        return jz5.f0.f302826a;
    }
}
