package com.tencent.mm.plugin.appbrand.complaint;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0004\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00000\u0000 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "kotlin.jvm.PlatformType", "<anonymous parameter 0>", "Lcom/tencent/mm/ipcinvoker/r;", "<anonymous parameter 1>", "Ljz5/f0;", "invoke", "(Lcom/tencent/mm/ipcinvoker/type/IPCVoid;Lcom/tencent/mm/ipcinvoker/r;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class d<InputType, ResultType> implements com.tencent.mm.ipcinvoker.j {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.complaint.d f77183d = new com.tencent.mm.plugin.appbrand.complaint.d();

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.plugin.appbrand.complaint.f.f77185d.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cleanCacheDir, cacheDir:");
        java.lang.String str = com.tencent.mm.plugin.appbrand.complaint.f.f77187f;
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandComplaintService", sb6.toString());
        com.tencent.mm.vfs.w6.f(str);
        for (java.lang.String str2 : com.tencent.mm.plugin.appbrand.complaint.f.f77186e) {
            ((yg0.q4) ((zg0.p3) i95.n0.c(zg0.p3.class))).getClass();
            com.tencent.mm.plugin.webview.model.l4 l4Var = com.tencent.mm.plugin.webview.model.l4.f183002b;
            l4Var.getClass();
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WebViewJSSDKFileItemManager", "removeJSSDKFileItem, local id is null");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.WebViewJSSDKFileItemManager", "removeJSSDKFileItem, localId:%s", str2);
                l4Var.f183003a.remove(str2);
            }
        }
    }
}
