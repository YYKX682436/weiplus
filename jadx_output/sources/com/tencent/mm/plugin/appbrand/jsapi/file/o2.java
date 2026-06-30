package com.tencent.mm.plugin.appbrand.jsapi.file;

/* loaded from: classes8.dex */
public class o2 extends uh0.v {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.file.OpenFileRequest.a f81114b;

    public o2(com.tencent.mm.plugin.appbrand.jsapi.file.OpenFileRequest.a aVar) {
        this.f81114b = aVar;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.ui.MMActivity activityContext;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.Integer num = (java.lang.Integer) obj;
        if (this.f427739a) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.OpenFileRequest", "openReadFile, ignore ret = %d", num);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.OpenFileRequest", "openReadFile, ret = %d", num);
        int intValue = num.intValue();
        com.tencent.mm.plugin.appbrand.jsapi.file.OpenFileRequest.a aVar = this.f81114b;
        if (intValue == -102) {
            try {
                str = aVar.f81026e;
                str2 = aVar.f81028g;
                aVar.H(str, str2);
                return;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrand.OpenFileRequest", e17, " openOuterAppDirectly exp = %s ", e17);
            }
        }
        com.tencent.mm.plugin.appbrand.jsapi.file.OpenFileRequest.OpenResult openResult = new com.tencent.mm.plugin.appbrand.jsapi.file.OpenFileRequest.OpenResult();
        int intValue2 = num.intValue();
        openResult.f81023d = intValue2;
        if (-102 == intValue2) {
            aVar.finishProcess(openResult);
            return;
        }
        if (num.intValue() == 0) {
            uh0.r rVar = (uh0.r) i95.n0.c(uh0.r.class);
            activityContext = aVar.getActivityContext();
            str3 = aVar.f81026e;
            str4 = aVar.f81028g;
            int i17 = openResult.f81023d;
            ((th0.u) rVar).getClass();
            com.tencent.mm.xwebutil.i.g(activityContext, str3, str4, i17);
            aVar.sendResult(openResult);
        }
    }
}
