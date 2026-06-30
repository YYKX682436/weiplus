package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui;

/* loaded from: classes14.dex */
public class w1 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.TextureViewSurfaceTextureListenerC17306x32f4bae6 f241196d;

    public w1(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.TextureViewSurfaceTextureListenerC17306x32f4bae6 textureViewSurfaceTextureListenerC17306x32f4bae6) {
        this.f241196d = textureViewSurfaceTextureListenerC17306x32f4bae6;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.List<java.lang.String> supportedFocusModes;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI$11", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.TextureViewSurfaceTextureListenerC17306x32f4bae6 textureViewSurfaceTextureListenerC17306x32f4bae6 = this.f241196d;
        if (textureViewSurfaceTextureListenerC17306x32f4bae6.H != 0 || view != textureViewSurfaceTextureListenerC17306x32f4bae6.E) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI$11", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        if (motionEvent.getAction() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanTranslationCaptureUI", "event down, (%f, %f)", java.lang.Float.valueOf(motionEvent.getX()), java.lang.Float.valueOf(motionEvent.getY()));
            float x17 = motionEvent.getX() / this.f241196d.E.getWidth();
            float y17 = motionEvent.getY() / this.f241196d.E.getHeight();
            xy3.a aVar = this.f241196d.f240885f;
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.v1 v1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.v1(this);
            aVar.getClass();
            int i17 = (int) (x17 * 2000.0f);
            int i18 = (int) (2000.0f * y17);
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxScanCamera", java.lang.String.format("fx %f, fy %f, x %d, y %d", java.lang.Float.valueOf(x17), java.lang.Float.valueOf(y17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)));
                android.graphics.Rect rect = new android.graphics.Rect();
                if (aVar.f448199k) {
                    int i19 = i18 - 1000;
                    rect.left = i19 - 250;
                    rect.right = i19 + 250;
                    int i27 = (2000 - i17) - 1000;
                    rect.top = i27 - 250;
                    rect.bottom = i27 + 250;
                } else {
                    int i28 = i17 - 1000;
                    rect.left = i28 - 250;
                    rect.right = i28 + 250;
                    int i29 = i18 - 1000;
                    rect.top = i29 - 250;
                    rect.bottom = i29 + 250;
                }
                android.hardware.Camera.Parameters parameters = aVar.f448189a.getParameters();
                if (rect.left < -1000) {
                    rect.left = -1000;
                }
                if (rect.right > 1000) {
                    rect.right = 1000;
                }
                if (rect.top < -1000) {
                    rect.top = -1000;
                }
                if (rect.bottom > 1000) {
                    rect.bottom = 1000;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxScanCamera", "focus area " + rect);
                android.graphics.Rect rect2 = new android.graphics.Rect(rect);
                if (parameters.getMaxNumMeteringAreas() > 0) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(new android.hardware.Camera.Area(rect2, 1000));
                    parameters.setMeteringAreas(arrayList2);
                    if (parameters.getMaxNumFocusAreas() > 0) {
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        arrayList3.add(new android.hardware.Camera.Area(rect, 1000));
                        parameters.setFocusAreas(arrayList3);
                        aVar.f448189a.cancelAutoFocus();
                        if (aVar.f448189a != null && aVar.f448191c && (supportedFocusModes = parameters.getSupportedFocusModes()) != null && supportedFocusModes.contains("auto")) {
                            java.lang.String focusMode = parameters.getFocusMode();
                            if (!(focusMode == null || focusMode.length() == 0) && !parameters.getFocusMode().equals("auto")) {
                                parameters.setFocusMode("auto");
                            }
                        }
                        aVar.f448189a.setParameters(parameters);
                        aVar.f448189a.autoFocus(v1Var);
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxScanCamera", "setCaptureFocusAndMeteringArea, camera not support area focus");
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxScanCamera", "setCaptureFocusAndMeteringArea, camera not support set metering area");
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxScanCamera", "setCaptureFocusAndMeteringArea error: " + e17.getMessage());
            }
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/scanner/ui/ScanTranslationCaptureUI$11", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
