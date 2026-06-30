package com.tencent.mm.plugin.appbrand.debugger.console;

/* loaded from: classes5.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.debugger.console.o f77674d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.tencent.mm.plugin.appbrand.debugger.console.o oVar) {
        super(0);
        this.f77674d = oVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams();
        layoutParams.type = android.os.Build.VERSION.SDK_INT >= 26 ? 2038 : 2002;
        layoutParams.format = 1;
        layoutParams.packageName = com.tencent.mm.sdk.platformtools.x2.f193071a.getPackageName();
        layoutParams.flags = 196904;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.gravity = 51;
        com.tencent.mm.plugin.appbrand.debugger.console.o oVar = this.f77674d;
        android.graphics.Point point = new android.graphics.Point(oVar.b().getMinimumWidth(), oVar.b().getMinimumHeight());
        layoutParams.x = com.tencent.mm.plugin.appbrand.debugger.console.o.a(oVar).x - point.x;
        layoutParams.y = (com.tencent.mm.plugin.appbrand.debugger.console.o.a(oVar).y - point.y) - ((java.lang.Number) ((jz5.n) oVar.f77699d).getValue()).intValue();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ConsolePrintControlFloatWindow", "init#layoutParams, screenSize: " + com.tencent.mm.plugin.appbrand.debugger.console.o.a(oVar) + ", guestedViewSize: " + point + ", x: " + layoutParams.x + ", y: " + layoutParams.y);
        return layoutParams;
    }
}
