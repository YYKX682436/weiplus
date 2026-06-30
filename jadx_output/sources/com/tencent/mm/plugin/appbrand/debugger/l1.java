package com.tencent.mm.plugin.appbrand.debugger;

/* loaded from: classes7.dex */
public class l1 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public int f77781d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.debugger.RemoteDebugMoveView f77782e;

    public l1(com.tencent.mm.plugin.appbrand.debugger.RemoteDebugMoveView remoteDebugMoveView) {
        this.f77782e = remoteDebugMoveView;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        int i17 = this.f77781d + 1;
        this.f77781d = i17;
        if (i17 < 2) {
            return;
        }
        com.tencent.mm.plugin.appbrand.debugger.RemoteDebugMoveView remoteDebugMoveView = this.f77782e;
        remoteDebugMoveView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        remoteDebugMoveView.post(new com.tencent.mm.plugin.appbrand.debugger.k1(this));
    }
}
