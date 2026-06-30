package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class pu extends com.tencent.map.lib.models.AccessibleTouchItem {

    /* renamed from: a, reason: collision with root package name */
    private com.tencent.mapsdk.internal.an f50785a;

    /* renamed from: b, reason: collision with root package name */
    private com.tencent.mapsdk.internal.tr f50786b;

    public pu(com.tencent.mapsdk.internal.tr trVar, com.tencent.mapsdk.internal.an anVar) {
        this.f50786b = trVar;
        this.f50785a = anVar;
    }

    private static android.graphics.Rect a(android.graphics.Rect rect) {
        if (rect == null) {
            return null;
        }
        int i17 = rect.left;
        int i18 = rect.right;
        int i19 = rect.top;
        int i27 = rect.bottom;
        int i28 = (i18 + i17) / 2;
        int i29 = (i19 + i27) / 2;
        int i37 = i27 - i19;
        if (i18 - i17 < com.tencent.mapsdk.internal.hn.o() * 40.0f) {
            float f17 = i28;
            int o17 = (int) (f17 - (com.tencent.mapsdk.internal.hn.o() * 20.0f));
            i18 = (int) (f17 + (com.tencent.mapsdk.internal.hn.o() * 20.0f));
            i17 = o17;
        }
        if (i37 < com.tencent.mapsdk.internal.hn.o() * 40.0f) {
            float f18 = i29;
            i19 = (int) (f18 - (com.tencent.mapsdk.internal.hn.o() * 20.0f));
            i27 = (int) (f18 + (com.tencent.mapsdk.internal.hn.o() * 20.0f));
        }
        return new android.graphics.Rect(i17, i19, i18, i27);
    }

    @Override // com.tencent.map.lib.models.AccessibleTouchItem
    public final android.graphics.Rect getBounds() {
        android.graphics.Rect j17;
        com.tencent.mapsdk.internal.an anVar = this.f50785a;
        if (anVar == null || (j17 = anVar.j()) == null) {
            return null;
        }
        int i17 = j17.left;
        int i18 = j17.right;
        int i19 = j17.top;
        int i27 = j17.bottom;
        int i28 = (i18 + i17) / 2;
        int i29 = (i19 + i27) / 2;
        int i37 = i27 - i19;
        if (i18 - i17 < com.tencent.mapsdk.internal.hn.o() * 40.0f) {
            float f17 = i28;
            int o17 = (int) (f17 - (com.tencent.mapsdk.internal.hn.o() * 20.0f));
            i18 = (int) (f17 + (com.tencent.mapsdk.internal.hn.o() * 20.0f));
            i17 = o17;
        }
        if (i37 < com.tencent.mapsdk.internal.hn.o() * 40.0f) {
            float f18 = i29;
            i19 = (int) (f18 - (com.tencent.mapsdk.internal.hn.o() * 20.0f));
            i27 = (int) (f18 + (com.tencent.mapsdk.internal.hn.o() * 20.0f));
        }
        return new android.graphics.Rect(i17, i19, i18, i27);
    }

    @Override // com.tencent.map.lib.models.AccessibleTouchItem
    public final java.lang.String getContentDescription() {
        com.tencent.mapsdk.internal.an anVar = this.f50785a;
        if (anVar == null) {
            return null;
        }
        return anVar.getContentDescription();
    }

    @Override // com.tencent.map.lib.models.AccessibleTouchItem
    public final void onClick() {
        com.tencent.mapsdk.internal.tr trVar = this.f50786b;
        if (trVar != null) {
            com.tencent.tencentmap.mapsdk.maps.TencentMap.OnMarkerClickListener U = trVar.U();
            com.tencent.mapsdk.internal.an anVar = this.f50785a;
            if (anVar == null || U == null) {
                return;
            }
            U.onMarkerClick(anVar);
        }
    }
}
