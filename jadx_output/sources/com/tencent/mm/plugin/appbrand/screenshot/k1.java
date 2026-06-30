package com.tencent.mm.plugin.appbrand.screenshot;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0005\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/screenshot/AppBrandScreenshotInfo;", "kotlin.jvm.PlatformType", "passedInfo", "Lcom/tencent/mm/ipcinvoker/r;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<anonymous parameter 1>", "Ljz5/f0;", "invoke", "(Lcom/tencent/mm/plugin/appbrand/screenshot/AppBrandScreenshotInfo;Lcom/tencent/mm/ipcinvoker/r;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class k1<InputType, ResultType> implements com.tencent.mm.ipcinvoker.j {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.screenshot.k1 f88504d = new com.tencent.mm.plugin.appbrand.screenshot.k1();

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.plugin.appbrand.screenshot.AppBrandScreenshotInfo appBrandScreenshotInfo = (com.tencent.mm.plugin.appbrand.screenshot.AppBrandScreenshotInfo) obj;
        if (appBrandScreenshotInfo == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.RecordScreenshotTakeReactor#Main", "onScreenshotTaken, passedInfo is null");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.RecordScreenshotTakeReactor#Main", "onScreenshotTaken, hasWindowFocus:true passedInfo: " + appBrandScreenshotInfo);
        if (com.tencent.mm.plugin.appbrand.screenshot.a0.f88464e.b(appBrandScreenshotInfo)) {
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.RecordScreenshotTakeReactor#Main", "onScreenshotTaken, insert passedInfo fail");
    }
}
