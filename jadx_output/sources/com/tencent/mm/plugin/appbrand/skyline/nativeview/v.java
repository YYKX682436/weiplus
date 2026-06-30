package com.tencent.mm.plugin.appbrand.skyline.nativeview;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0004\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00000\u0000 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/os/Bundle;", "kotlin.jvm.PlatformType", com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, "Lcom/tencent/mm/ipcinvoker/r;", "<anonymous parameter 1>", "Ljz5/f0;", "invoke", "(Landroid/os/Bundle;Lcom/tencent/mm/ipcinvoker/r;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class v<InputType, ResultType> implements com.tencent.mm.ipcinvoker.j {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.skyline.nativeview.v f88950d = new com.tencent.mm.plugin.appbrand.skyline.nativeview.v();

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        sh1.g gVar;
        sh1.e eVar;
        android.os.Bundle bundle = (android.os.Bundle) obj;
        com.tencent.mm.plugin.appbrand.skyline.nativeview.k0 k0Var = com.tencent.mm.plugin.appbrand.skyline.nativeview.k0.f88902a;
        k0Var.c();
        int i17 = bundle.getInt(dm.i4.COL_ID);
        java.lang.String string = bundle.getString("processName", "");
        java.lang.String string2 = bundle.getString("viewType", "");
        java.lang.String string3 = bundle.getString("params", "");
        android.view.Surface surface = (android.view.Surface) bundle.getParcelable("surface");
        com.tencent.mars.xlog.Log.i("SkylineNativeViewManager", "createSkylineNativeView id:" + i17 + " processName:" + string + " viewType:" + string2 + " surface:" + surface + " params:" + string3);
        kotlin.jvm.internal.o.d(string2);
        synchronized (k0Var) {
            com.tencent.mm.plugin.appbrand.skyline.nativeview.t tVar = (com.tencent.mm.plugin.appbrand.skyline.nativeview.t) com.tencent.mm.plugin.appbrand.skyline.nativeview.k0.f88903b.get(string2);
            gVar = null;
            eVar = tVar != null ? tVar.f88945b : null;
        }
        if (eVar != null) {
            kotlin.jvm.internal.o.d(string3);
            kotlin.jvm.internal.o.d(string);
            gVar = eVar.a(i17, string3, surface, new com.tencent.mm.plugin.appbrand.skyline.nativeview.s(string, i17));
        }
        com.tencent.mars.xlog.Log.i("SkylineNativeViewManager", "createSkylineNativeView factory:" + eVar + " receiver:" + gVar);
        if (gVar != null) {
            synchronized (k0Var) {
                com.tencent.mm.plugin.appbrand.skyline.nativeview.k0.f88905d.put(java.lang.Integer.valueOf(i17), gVar);
            }
        }
    }
}
