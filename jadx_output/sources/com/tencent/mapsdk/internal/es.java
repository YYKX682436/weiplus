package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public abstract class es implements com.tencent.mapsdk.internal.eu {
    @Override // com.tencent.mapsdk.internal.eu
    public android.graphics.Rect a() {
        android.view.View[] b17 = b();
        android.graphics.Rect rect = new android.graphics.Rect();
        for (android.view.View view : b17) {
            rect.union(com.tencent.mapsdk.internal.hs.a(view));
        }
        return rect;
    }

    public abstract android.view.View[] b();
}
