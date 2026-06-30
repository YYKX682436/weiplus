package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class nt extends com.tencent.mapsdk.internal.ng<com.tencent.mapsdk.internal.nv> implements com.tencent.tencentmap.mapsdk.maps.model.GroundOverlay {
    public nt(com.tencent.mapsdk.internal.nu nuVar, com.tencent.mapsdk.internal.nv nvVar) {
        super(nuVar, nvVar);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.GroundOverlay
    public final void setAlpha(float f17) {
        T t17 = this.f50567d;
        if (((com.tencent.mapsdk.internal.nv) t17).f50588a != null) {
            ((com.tencent.mapsdk.internal.nv) t17).f50588a.alpha(f17);
        }
        ((com.tencent.mapsdk.internal.nv) this.f50567d).setAlpha(f17);
        a((com.tencent.mapsdk.internal.nt) this.f50567d);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.GroundOverlay
    public final void setAnchor(float f17, float f18) {
        T t17 = this.f50567d;
        if (((com.tencent.mapsdk.internal.nv) t17).f50588a != null) {
            ((com.tencent.mapsdk.internal.nv) t17).f50588a.anchor(f17, f18);
        }
        ((com.tencent.mapsdk.internal.nv) this.f50567d).a();
        a((com.tencent.mapsdk.internal.nt) this.f50567d);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.GroundOverlay
    public final void setBitmap(com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor bitmapDescriptor) {
        if (bitmapDescriptor == null) {
            return;
        }
        T t17 = this.f50567d;
        if (((com.tencent.mapsdk.internal.nv) t17).f50588a != null) {
            ((com.tencent.mapsdk.internal.nv) t17).f50588a.bitmap(bitmapDescriptor);
        }
        com.tencent.mapsdk.internal.nh<T> nhVar = this.f50566c;
        if (nhVar != 0) {
            ((com.tencent.mapsdk.internal.nv) this.f50567d).setBitmap(bitmapDescriptor.getBitmap(nhVar.a()));
        }
        a((com.tencent.mapsdk.internal.nt) this.f50567d);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.GroundOverlay
    public final void setLatLongBounds(com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds latLngBounds) {
        T t17 = this.f50567d;
        if (((com.tencent.mapsdk.internal.nv) t17).f50588a != null) {
            ((com.tencent.mapsdk.internal.nv) t17).f50588a.latLngBounds(latLngBounds);
        }
        ((com.tencent.mapsdk.internal.nv) this.f50567d).setLatLngBounds(latLngBounds);
        a((com.tencent.mapsdk.internal.nt) this.f50567d);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.GroundOverlay
    public final void setLevel(int i17) {
        T t17 = this.f50567d;
        if (((com.tencent.mapsdk.internal.nv) t17).f50588a != null) {
            ((com.tencent.mapsdk.internal.nv) t17).f50588a.level(i17);
        }
        ((com.tencent.mapsdk.internal.nv) this.f50567d).setLevel(i17);
        a((com.tencent.mapsdk.internal.nt) this.f50567d);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.GroundOverlay
    public final void setPosition(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        T t17 = this.f50567d;
        if (((com.tencent.mapsdk.internal.nv) t17).f50588a != null) {
            ((com.tencent.mapsdk.internal.nv) t17).f50588a.position(latLng);
        }
        ((com.tencent.mapsdk.internal.nv) this.f50567d).a();
        a((com.tencent.mapsdk.internal.nt) this.f50567d);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.GroundOverlay
    public final void setVisibility(boolean z17) {
        T t17 = this.f50567d;
        if (((com.tencent.mapsdk.internal.nv) t17).f50588a != null) {
            ((com.tencent.mapsdk.internal.nv) t17).f50588a.visible(z17);
        }
        ((com.tencent.mapsdk.internal.nv) this.f50567d).setVisibility(z17);
        a((com.tencent.mapsdk.internal.nt) this.f50567d);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.GroundOverlay
    public final void setZindex(int i17) {
        T t17 = this.f50567d;
        if (((com.tencent.mapsdk.internal.nv) t17).f50588a != null) {
            ((com.tencent.mapsdk.internal.nv) t17).f50588a.zIndex(i17);
        }
        ((com.tencent.mapsdk.internal.nv) this.f50567d).setZIndex(i17);
        a((com.tencent.mapsdk.internal.nt) this.f50567d);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.GroundOverlay
    public final void setZoom(float f17) {
        T t17 = this.f50567d;
        if (((com.tencent.mapsdk.internal.nv) t17).f50588a != null) {
            ((com.tencent.mapsdk.internal.nv) t17).f50588a.zoom(f17);
        }
        ((com.tencent.mapsdk.internal.nv) this.f50567d).a();
        a((com.tencent.mapsdk.internal.nt) this.f50567d);
    }
}
