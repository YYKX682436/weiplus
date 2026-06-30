package com.tencent.mapsdk.internal;

/* loaded from: classes16.dex */
public final class ty implements com.tencent.tencentmap.mapsdk.maps.UiSettings {

    /* renamed from: a, reason: collision with root package name */
    private com.tencent.mapsdk.internal.ae f52261a;

    public ty(com.tencent.mapsdk.internal.ae aeVar) {
        this.f52261a = aeVar;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.UiSettings
    public final boolean isCompassEnabled() {
        com.tencent.mapsdk.internal.ak akVar;
        com.tencent.mapsdk.internal.ae aeVar = this.f52261a;
        if (aeVar == null || (akVar = aeVar.f48857a) == null) {
            return false;
        }
        return akVar.b();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.UiSettings
    public final boolean isIndoorLevelPickerEnabled() {
        com.tencent.mapsdk.internal.ak akVar;
        com.tencent.mapsdk.internal.ae aeVar = this.f52261a;
        if (aeVar == null || (akVar = aeVar.f48857a) == null) {
            return false;
        }
        return akVar.h();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.UiSettings
    public final boolean isMyLocationButtonEnabled() {
        com.tencent.mapsdk.internal.ak akVar;
        com.tencent.mapsdk.internal.ae aeVar = this.f52261a;
        if (aeVar == null || (akVar = aeVar.f48857a) == null) {
            return false;
        }
        return akVar.c();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.UiSettings
    public final boolean isRotateGesturesEnabled() {
        com.tencent.mapsdk.internal.ak akVar;
        com.tencent.mapsdk.internal.ae aeVar = this.f52261a;
        if (aeVar == null || (akVar = aeVar.f48857a) == null) {
            return false;
        }
        return akVar.g();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.UiSettings
    public final boolean isScaleViewEnabled() {
        com.tencent.mapsdk.internal.ak akVar;
        com.tencent.mapsdk.internal.ae aeVar = this.f52261a;
        if (aeVar == null || (akVar = aeVar.f48857a) == null) {
            return false;
        }
        return akVar.i();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.UiSettings
    public final boolean isScrollGesturesEnabled() {
        com.tencent.mapsdk.internal.ak akVar;
        com.tencent.mapsdk.internal.ae aeVar = this.f52261a;
        if (aeVar == null || (akVar = aeVar.f48857a) == null) {
            return false;
        }
        return akVar.d();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.UiSettings
    public final boolean isTiltGesturesEnabled() {
        com.tencent.mapsdk.internal.ak akVar;
        com.tencent.mapsdk.internal.ae aeVar = this.f52261a;
        if (aeVar == null || (akVar = aeVar.f48857a) == null) {
            return false;
        }
        return akVar.f();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.UiSettings
    public final boolean isZoomControlsEnabled() {
        com.tencent.mapsdk.internal.ak akVar;
        com.tencent.mapsdk.internal.ae aeVar = this.f52261a;
        if (aeVar == null || (akVar = aeVar.f48857a) == null) {
            return false;
        }
        return akVar.a();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.UiSettings
    public final boolean isZoomGesturesEnabled() {
        com.tencent.mapsdk.internal.ak akVar;
        com.tencent.mapsdk.internal.ae aeVar = this.f52261a;
        if (aeVar == null || (akVar = aeVar.f48857a) == null) {
            return false;
        }
        return akVar.e();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.UiSettings
    public final void setAllGesturesEnabled(boolean z17) {
        com.tencent.mapsdk.internal.ak akVar;
        com.tencent.mapsdk.internal.ae aeVar = this.f52261a;
        if (aeVar == null || (akVar = aeVar.f48857a) == null) {
            return;
        }
        akVar.i(z17);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.UiSettings
    public final void setCompassEnabled(boolean z17) {
        com.tencent.mapsdk.internal.ak akVar;
        com.tencent.mapsdk.internal.ae aeVar = this.f52261a;
        if (aeVar == null || (akVar = aeVar.f48857a) == null) {
            return;
        }
        akVar.b(z17);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.UiSettings
    public final void setCompassExtraPadding(int i17) {
        com.tencent.mapsdk.internal.ak akVar;
        com.tencent.mapsdk.internal.ae aeVar = this.f52261a;
        if (aeVar == null || (akVar = aeVar.f48857a) == null) {
            return;
        }
        akVar.f(i17);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.UiSettings
    public final void setFlingGestureEnabled(boolean z17) {
        com.tencent.mapsdk.internal.ak akVar;
        com.tencent.mapsdk.internal.ae aeVar = this.f52261a;
        if (aeVar == null || (akVar = aeVar.f48857a) == null) {
            return;
        }
        akVar.e(z17);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.UiSettings
    public final void setGestureRotateByMapCenter(boolean z17) {
        com.tencent.mapsdk.internal.ak akVar;
        com.tencent.mapsdk.internal.ae aeVar = this.f52261a;
        if (aeVar == null || (akVar = aeVar.f48857a) == null) {
            return;
        }
        akVar.m(z17);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.UiSettings
    public final void setGestureScaleByMapCenter(boolean z17) {
        com.tencent.mapsdk.internal.ak akVar;
        com.tencent.mapsdk.internal.ae aeVar = this.f52261a;
        if (aeVar == null || (akVar = aeVar.f48857a) == null) {
            return;
        }
        akVar.l(z17);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.UiSettings
    public final void setIndoorLevelPickerEnabled(boolean z17) {
        com.tencent.mapsdk.internal.ak akVar;
        com.tencent.mapsdk.internal.ae aeVar = this.f52261a;
        if (aeVar == null || (akVar = aeVar.f48857a) == null) {
            return;
        }
        akVar.n(z17);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.UiSettings
    public final void setLogoPosition(int i17) {
        com.tencent.mapsdk.internal.ak akVar;
        com.tencent.mapsdk.internal.ae aeVar = this.f52261a;
        if (aeVar == null || (akVar = aeVar.f48857a) == null) {
            return;
        }
        akVar.b(i17);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.UiSettings
    public final void setLogoPositionWithMargin(int i17, int i18, int i19, int i27, int i28) {
        com.tencent.mapsdk.internal.ak akVar;
        com.tencent.mapsdk.internal.ae aeVar = this.f52261a;
        if (aeVar == null || (akVar = aeVar.f48857a) == null) {
            return;
        }
        akVar.a(i17, i18, i19, i27, i28);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.UiSettings
    public final void setLogoScale(float f17) {
        com.tencent.mapsdk.internal.ak akVar;
        com.tencent.mapsdk.internal.ae aeVar = this.f52261a;
        if (aeVar == null || (akVar = aeVar.f48857a) == null) {
            return;
        }
        akVar.a(f17);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.UiSettings
    public final void setLogoSize(int i17) {
        com.tencent.mapsdk.internal.ak akVar;
        com.tencent.mapsdk.internal.ae aeVar = this.f52261a;
        if (aeVar == null || aeVar == null || (akVar = aeVar.f48857a) == null) {
            return;
        }
        akVar.g(i17);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.UiSettings
    public final void setMyLocationButtonEnabled(boolean z17) {
        com.tencent.mapsdk.internal.ak akVar;
        com.tencent.mapsdk.internal.ae aeVar = this.f52261a;
        if (aeVar == null || (akVar = aeVar.f48857a) == null) {
            return;
        }
        akVar.c(z17);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.UiSettings
    public final void setRotateGesturesEnabled(boolean z17) {
        com.tencent.mapsdk.internal.ak akVar;
        com.tencent.mapsdk.internal.ae aeVar = this.f52261a;
        if (aeVar == null || (akVar = aeVar.f48857a) == null) {
            return;
        }
        akVar.h(z17);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.UiSettings
    public final void setScaleViewEnabled(boolean z17) {
        com.tencent.mapsdk.internal.ak akVar;
        com.tencent.mapsdk.internal.ae aeVar = this.f52261a;
        if (aeVar == null || (akVar = aeVar.f48857a) == null) {
            return;
        }
        akVar.j(z17);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.UiSettings
    public final void setScaleViewFadeEnable(boolean z17) {
        com.tencent.mapsdk.internal.ak akVar;
        com.tencent.mapsdk.internal.ae aeVar = this.f52261a;
        if (aeVar == null || (akVar = aeVar.f48857a) == null) {
            return;
        }
        akVar.o(z17);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.UiSettings
    public final void setScaleViewPosition(int i17) {
        com.tencent.mapsdk.internal.ak akVar;
        com.tencent.mapsdk.internal.ae aeVar = this.f52261a;
        if (aeVar == null || (akVar = aeVar.f48857a) == null) {
            return;
        }
        akVar.e(i17);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.UiSettings
    public final void setScaleViewPositionWithMargin(int i17, int i18, int i19, int i27, int i28) {
        com.tencent.mapsdk.internal.ak akVar;
        com.tencent.mapsdk.internal.ae aeVar = this.f52261a;
        if (aeVar == null || (akVar = aeVar.f48857a) == null) {
            return;
        }
        akVar.b(i17, i18, i19, i27, i28);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.UiSettings
    public final void setScrollGesturesEnabled(boolean z17) {
        com.tencent.mapsdk.internal.ak akVar;
        com.tencent.mapsdk.internal.ae aeVar = this.f52261a;
        if (aeVar == null || (akVar = aeVar.f48857a) == null) {
            return;
        }
        akVar.d(z17);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.UiSettings
    public final void setTiltGesturesEnabled(boolean z17) {
        com.tencent.mapsdk.internal.ak akVar;
        com.tencent.mapsdk.internal.ae aeVar = this.f52261a;
        if (aeVar == null || (akVar = aeVar.f48857a) == null) {
            return;
        }
        akVar.g(z17);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.UiSettings
    public final void setZoomControlsEnabled(boolean z17) {
        com.tencent.mapsdk.internal.ak akVar;
        com.tencent.mapsdk.internal.ae aeVar = this.f52261a;
        if (aeVar == null || (akVar = aeVar.f48857a) == null) {
            return;
        }
        akVar.a(z17);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.UiSettings
    public final void setZoomGesturesEnabled(boolean z17) {
        com.tencent.mapsdk.internal.ak akVar;
        com.tencent.mapsdk.internal.ae aeVar = this.f52261a;
        if (aeVar == null || (akVar = aeVar.f48857a) == null) {
            return;
        }
        akVar.f(z17);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.UiSettings
    public final void setZoomPosition(int i17) {
        com.tencent.mapsdk.internal.ak akVar;
        com.tencent.mapsdk.internal.ae aeVar = this.f52261a;
        if (aeVar == null || (akVar = aeVar.f48857a) == null) {
            return;
        }
        akVar.h(i17);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.UiSettings
    public final void setCompassExtraPadding(int i17, int i18) {
        com.tencent.mapsdk.internal.ak akVar;
        com.tencent.mapsdk.internal.ae aeVar = this.f52261a;
        if (aeVar == null || (akVar = aeVar.f48857a) == null) {
            return;
        }
        akVar.a(i17, i18);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.UiSettings
    public final void setLogoPosition(int i17, int[] iArr) {
        com.tencent.mapsdk.internal.ak akVar;
        com.tencent.mapsdk.internal.ae aeVar = this.f52261a;
        if (aeVar == null || (akVar = aeVar.f48857a) == null) {
            return;
        }
        akVar.a(i17, iArr);
    }
}
