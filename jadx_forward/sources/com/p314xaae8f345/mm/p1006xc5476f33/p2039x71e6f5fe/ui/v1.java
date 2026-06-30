package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui;

/* loaded from: classes14.dex */
public class v1 implements android.hardware.Camera.AutoFocusCallback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.w1 f241191d;

    public v1(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.w1 w1Var) {
        this.f241191d = w1Var;
    }

    @Override // android.hardware.Camera.AutoFocusCallback
    public void onAutoFocus(boolean z17, android.hardware.Camera camera) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanTranslationCaptureUI", "camera auto focus call back");
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.w1 w1Var = this.f241191d;
        xy3.a aVar = w1Var.f241196d.f240885f;
        aVar.getClass();
        try {
            android.hardware.Camera camera2 = aVar.f448189a;
            if (camera2 != null) {
                camera2.cancelAutoFocus();
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.w(qt5.c.f448188u, "cancelAutoFocus " + e17.getMessage());
        }
        w1Var.f241196d.f240885f.u();
    }
}
