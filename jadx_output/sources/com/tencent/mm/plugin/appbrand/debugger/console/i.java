package com.tencent.mm.plugin.appbrand.debugger.console;

/* loaded from: classes5.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.debugger.console.o f77676d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.tencent.mm.plugin.appbrand.debugger.console.o oVar) {
        super(0);
        this.f77676d = oVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.Display defaultDisplay;
        android.graphics.Point point = new android.graphics.Point();
        android.view.WindowManager windowManager = (android.view.WindowManager) ((jz5.n) this.f77676d.f77697b).getValue();
        if (windowManager != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
            defaultDisplay.getRealSize(point);
        }
        return point;
    }
}
