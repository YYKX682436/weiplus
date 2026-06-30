package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class oa extends com.tencent.mapsdk.internal.ng<com.tencent.mapsdk.internal.ob> implements com.tencent.mapsdk.internal.nj, com.tencent.tencentmap.mapsdk.maps.model.IntersectionOverlay {
    public oa(com.tencent.mapsdk.internal.nz nzVar, com.tencent.mapsdk.internal.ob obVar) {
        super(nzVar, obVar);
    }

    @Override // com.tencent.mapsdk.internal.nj
    public final int a() {
        return ((com.tencent.mapsdk.internal.nz) this.f50566c).a(this.f50565b);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.IntersectionOverlay
    public final void setBounds(android.graphics.Rect rect) {
        ((com.tencent.mapsdk.internal.ob) this.f50567d).setBounds(rect);
        a((com.tencent.mapsdk.internal.oa) this.f50567d);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.IntersectionOverlay
    public final void setDarkMode(boolean z17) {
        ((com.tencent.mapsdk.internal.ob) this.f50567d).enableDarkMode(z17);
        a((com.tencent.mapsdk.internal.oa) this.f50567d);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.IntersectionOverlay
    public final void setData(byte[] bArr) {
        if (bArr == null) {
            return;
        }
        ((com.tencent.mapsdk.internal.ob) this.f50567d).setData(bArr);
        a((com.tencent.mapsdk.internal.oa) this.f50567d);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.IntersectionOverlay
    public final void setDistance(int i17) {
        ((com.tencent.mapsdk.internal.ob) this.f50567d).setDistance(i17);
        a((com.tencent.mapsdk.internal.oa) this.f50567d);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.IntersectionOverlay
    public final void setRoundedCorner(boolean z17) {
        ((com.tencent.mapsdk.internal.ob) this.f50567d).enableRoundedCorner(z17);
        a((com.tencent.mapsdk.internal.oa) this.f50567d);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.IntersectionOverlay
    public final void setVisibility(boolean z17) {
        ((com.tencent.mapsdk.internal.ob) this.f50567d).setVisibility(z17);
        a((com.tencent.mapsdk.internal.oa) this.f50567d);
    }
}
