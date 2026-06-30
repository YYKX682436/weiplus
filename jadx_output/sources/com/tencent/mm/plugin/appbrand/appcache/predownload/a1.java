package com.tencent.mm.plugin.appbrand.appcache.predownload;

/* loaded from: classes4.dex */
public class a1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appcache.predownload.b1 f75742a;

    public a1(com.tencent.mm.plugin.appbrand.appcache.predownload.b1 b1Var) {
        this.f75742a = b1Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        try {
            com.tencent.mm.plugin.appbrand.appcache.predownload.b1.b(this.f75742a, (java.lang.String) obj);
            return null;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrand.PredownloadXmlProcessor", e17, "process pbBase64", new java.lang.Object[0]);
            return null;
        }
    }
}
