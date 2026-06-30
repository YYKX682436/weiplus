package com.tencent.mm.plugin.appbrand.skyline.nativeview;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0004\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00000\u0000 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/os/Bundle;", "kotlin.jvm.PlatformType", com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, "Lcom/tencent/mm/ipcinvoker/r;", "<anonymous parameter 1>", "Ljz5/f0;", "invoke", "(Landroid/os/Bundle;Lcom/tencent/mm/ipcinvoker/r;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes7.dex */
final class m<InputType, ResultType> implements com.tencent.mm.ipcinvoker.j {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.skyline.nativeview.m f88920d = new com.tencent.mm.plugin.appbrand.skyline.nativeview.m();

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        int i17 = bundle.getInt(dm.i4.COL_ID);
        int i18 = bundle.getInt("viewId");
        java.lang.String string = bundle.getString("event");
        if (string == null) {
            string = "";
        }
        java.lang.String string2 = bundle.getString("params");
        java.lang.String str = string2 != null ? string2 : "";
        com.tencent.mars.xlog.Log.i("SkylineNativeViewHandlerClient", "onNativeViewEvent viewId:" + i18 + " event:" + string + " params:" + str);
        sh1.f a17 = com.tencent.mm.plugin.appbrand.skyline.nativeview.k0.f88902a.a(i17);
        if (a17 == null) {
            com.tencent.mars.xlog.Log.w("SkylineNativeViewHandlerClient", "invoker is null, onNativeViewEvent, return");
            return;
        }
        com.tencent.mars.xlog.Log.i("SkylineNativeViewHandlerClient", "onNativeViewEvent 222 viewId:" + i18 + " event:" + string + " params:" + str);
        a17.a(i18, string, str);
    }
}
