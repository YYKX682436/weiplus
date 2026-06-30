package com.tencent.mm.plugin.appbrand.skyline.nativeview;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0004\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00000\u0000 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/os/Bundle;", "kotlin.jvm.PlatformType", com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, "Lcom/tencent/mm/ipcinvoker/r;", "<anonymous parameter 1>", "Ljz5/f0;", "invoke", "(Landroid/os/Bundle;Lcom/tencent/mm/ipcinvoker/r;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes7.dex */
final class f0<InputType, ResultType> implements com.tencent.mm.ipcinvoker.j {
    static {
        new com.tencent.mm.plugin.appbrand.skyline.nativeview.f0();
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        sh1.g b17;
        android.os.Bundle bundle = (android.os.Bundle) obj;
        int i17 = bundle.getInt(dm.i4.COL_ID);
        com.tencent.mm.plugin.appbrand.skyline.nativeview.SkylineNativeViewManager$InnerMotionEvent skylineNativeViewManager$InnerMotionEvent = (com.tencent.mm.plugin.appbrand.skyline.nativeview.SkylineNativeViewManager$InnerMotionEvent) bundle.getParcelable("motion_event");
        java.util.Objects.toString(skylineNativeViewManager$InnerMotionEvent);
        if (skylineNativeViewManager$InnerMotionEvent == null || (b17 = com.tencent.mm.plugin.appbrand.skyline.nativeview.k0.f88902a.b(i17)) == null) {
            return;
        }
        java.util.List list = skylineNativeViewManager$InnerMotionEvent.f88884g;
        int size = list.size();
        android.view.MotionEvent.PointerProperties[] pointerPropertiesArr = new android.view.MotionEvent.PointerProperties[size];
        for (int i18 = 0; i18 < size; i18++) {
            android.view.MotionEvent.PointerProperties pointerProperties = new android.view.MotionEvent.PointerProperties();
            pointerProperties.id = ((java.lang.Number) list.get(i18)).intValue();
            pointerProperties.toolType = 1;
            pointerPropertiesArr[i18] = pointerProperties;
        }
        java.util.List list2 = skylineNativeViewManager$InnerMotionEvent.f88885h;
        int size2 = list2.size();
        android.view.MotionEvent.PointerCoords[] pointerCoordsArr = new android.view.MotionEvent.PointerCoords[size2];
        for (int i19 = 0; i19 < size2; i19++) {
            android.view.MotionEvent.PointerCoords pointerCoords = new android.view.MotionEvent.PointerCoords();
            pointerCoords.x = ((java.lang.Number) list2.get(i19)).floatValue();
            pointerCoords.y = ((java.lang.Number) skylineNativeViewManager$InnerMotionEvent.f88886i.get(i19)).floatValue();
            pointerCoordsArr[i19] = pointerCoords;
        }
        long j17 = skylineNativeViewManager$InnerMotionEvent.f88883f;
        android.view.MotionEvent obtain = android.view.MotionEvent.obtain(j17, j17, skylineNativeViewManager$InnerMotionEvent.f88881d, list.size(), pointerPropertiesArr, pointerCoordsArr, 0, 0, 1.0f, 1.0f, 0, 0, 0, 0);
        kotlin.jvm.internal.o.f(obtain, "obtain(...)");
        b17.onTouchEvent(obtain);
    }
}
