package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class av extends com.tencent.mapsdk.internal.au<com.tencent.mapsdk.internal.an> implements com.tencent.tencentmap.mapsdk.maps.model.Marker {

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mapsdk.internal.an f48864b;

    public av(com.tencent.mapsdk.internal.an anVar) {
        this.f48864b = anVar;
    }

    private com.tencent.mapsdk.internal.an b() {
        return this.f48864b;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final com.tencent.tencentmap.mapsdk.maps.model.MarkerCollisionRelationUnit addCollisionUnit(com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions markerOptions) {
        return this.f48864b.addCollisionUnit(markerOptions);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.tencent.mapsdk.internal.av.class != obj.getClass()) {
            return false;
        }
        return java.util.Objects.equals(this.f48864b.getId(), ((com.tencent.mapsdk.internal.av) obj).f48864b.getId());
    }

    @Override // com.tencent.mapsdk.internal.au
    public final /* bridge */ /* synthetic */ com.tencent.mapsdk.internal.an f_() {
        return this.f48864b;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Alphable
    public final float getAlpha() {
        return this.f48864b.getAlpha();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Anchorable
    public final float getAnchorU() {
        return this.f48864b.getAnchorU();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Anchorable
    public final float getAnchorV() {
        return this.f48864b.getAnchorV();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Accessible
    public final java.lang.String getContentDescription() {
        com.tencent.mapsdk.internal.an anVar = this.f48864b;
        if (anVar != null) {
            return anVar.getContentDescription();
        }
        return null;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Scalable
    public final float getEqualScale() {
        com.tencent.mapsdk.internal.an anVar = this.f48864b;
        if (anVar == null) {
            return 0.0f;
        }
        return anVar.getEqualScale();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final int getHeight(android.content.Context context) {
        com.tencent.mapsdk.internal.an anVar = this.f48864b;
        if (anVar == null) {
            return 0;
        }
        return anVar.getHeight(context);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final com.tencent.tencentmap.mapsdk.maps.model.MarkerType getMarkerType() {
        com.tencent.mapsdk.internal.an anVar = this.f48864b;
        return anVar == null ? com.tencent.tencentmap.mapsdk.maps.model.MarkerType.ICON_MARKER : anVar.getMarkerType();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions getOptions() {
        return this.f48864b.getOptions();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final com.tencent.tencentmap.mapsdk.maps.model.LatLng getPosition() {
        return this.f48864b.getPosition();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Rotatable
    public final float getRotation() {
        com.tencent.mapsdk.internal.an anVar = this.f48864b;
        if (anVar == null) {
            return 0.0f;
        }
        return anVar.getRotation();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Scalable
    public final float[] getScale() {
        com.tencent.mapsdk.internal.an anVar = this.f48864b;
        return anVar == null ? new float[]{0.0f, 0.0f} : anVar.getScale();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final java.lang.String getSnippet() {
        return this.f48864b.getSnippet();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Tagable
    public final java.lang.Object getTag() {
        return this.f48864b.getTag();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final java.lang.String getText() {
        com.tencent.mapsdk.internal.an anVar = this.f48864b;
        if (anVar == null) {
            return null;
        }
        return anVar.getText();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final com.tencent.tencentmap.mapsdk.maps.model.MarkerTextStyle getTextStyle() {
        com.tencent.mapsdk.internal.an anVar = this.f48864b;
        if (anVar == null) {
            return null;
        }
        return anVar.getTextStyle();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final java.lang.String getTitle() {
        return this.f48864b.getTitle();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final int getWidth(android.content.Context context) {
        com.tencent.mapsdk.internal.an anVar = this.f48864b;
        if (anVar == null) {
            return 0;
        }
        return anVar.getWidth(context);
    }

    public final int hashCode() {
        return java.util.Objects.hash(this.f48864b.getId());
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final void hideInfoWindow() {
        com.tencent.mapsdk.internal.an anVar = this.f48864b;
        if (anVar == null) {
            return;
        }
        anVar.hideInfoWindow();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Clickable
    public final boolean isClickable() {
        com.tencent.mapsdk.internal.an anVar = this.f48864b;
        if (anVar == null) {
            return false;
        }
        return anVar.isClickable();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Collisionable
    public final boolean isCollisionBy(com.tencent.tencentmap.mapsdk.maps.interfaces.Collision collision) {
        com.tencent.mapsdk.internal.an anVar = this.f48864b;
        if (anVar != null) {
            return anVar.isCollisionBy(collision);
        }
        return false;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Draggable
    public final boolean isDraggable() {
        return this.f48864b.isDraggable();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final boolean isFastLoad() {
        com.tencent.mapsdk.internal.an anVar = this.f48864b;
        if (anVar == null) {
            return false;
        }
        return anVar.isFastLoad();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final boolean isInfoWindowEnable() {
        return this.f48864b.isInfoWindowEnable();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final boolean isInfoWindowShown() {
        com.tencent.mapsdk.internal.an anVar = this.f48864b;
        if (anVar == null) {
            return false;
        }
        return anVar.isInfoWindowShown();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final void refreshInfoWindow() {
        com.tencent.mapsdk.internal.an anVar = this.f48864b;
        if (anVar == null) {
            return;
        }
        anVar.refreshInfoWindow();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final void removeCollisionUnit(com.tencent.tencentmap.mapsdk.maps.model.MarkerCollisionRelationUnit markerCollisionRelationUnit) {
        this.f48864b.removeCollisionUnit(markerCollisionRelationUnit);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Alphable
    public final void setAlpha(float f17) {
        com.tencent.mapsdk.internal.an anVar = this.f48864b;
        if (anVar == null) {
            return;
        }
        anVar.setAlpha(f17);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Anchorable
    public final void setAnchor(float f17, float f18) {
        com.tencent.mapsdk.internal.an anVar = this.f48864b;
        if (anVar == null) {
            return;
        }
        anVar.setAnchor(f17, f18);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Animationable
    public final void setAnimation(com.tencent.tencentmap.mapsdk.maps.model.Animation animation) {
        com.tencent.mapsdk.internal.an anVar = this.f48864b;
        if (anVar == null || animation == null) {
            return;
        }
        anVar.setAnimation(animation);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Clickable
    public final void setClickable(boolean z17) {
        com.tencent.mapsdk.internal.an anVar = this.f48864b;
        if (anVar == null) {
            return;
        }
        anVar.setClickable(z17);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Collisionable
    public final void setCollisions(com.tencent.tencentmap.mapsdk.maps.interfaces.Collision... collisionArr) {
        com.tencent.mapsdk.internal.an anVar = this.f48864b;
        if (anVar != null) {
            anVar.setCollisions(collisionArr);
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Accessible
    public final void setContentDescription(java.lang.String str) {
        com.tencent.mapsdk.internal.an anVar = this.f48864b;
        if (anVar != null) {
            anVar.setContentDescription(str);
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Draggable
    public final void setDraggable(boolean z17) {
        com.tencent.mapsdk.internal.an anVar = this.f48864b;
        if (anVar == null) {
            return;
        }
        anVar.setDraggable(z17);
        com.tencent.mapsdk.internal.an anVar2 = this.f48864b;
        anVar2.setFixingPointEnable(!z17 && anVar2.b());
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Scalable
    public final void setEqualScale(float f17) {
        com.tencent.mapsdk.internal.an anVar = this.f48864b;
        if (anVar == null) {
            return;
        }
        anVar.setEqualScale(f17);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final void setFastLoad(boolean z17) {
        this.f48864b.setFastLoad(z17);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final void setFixingPoint(int i17, int i18) {
        this.f48864b.setFixingPoint(i17, i18);
        this.f48864b.setDraggable(false);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final void setFixingPointEnable(boolean z17) {
        this.f48864b.setFixingPointEnable(z17);
        if (this.f48864b.isDraggable()) {
            setDraggable(!z17);
        }
        if (z17) {
            return;
        }
        com.tencent.mapsdk.internal.an anVar = this.f48864b;
        anVar.setPosition(anVar.getPosition());
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final void setIcon(com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor bitmapDescriptor) {
        com.tencent.mapsdk.internal.an anVar = this.f48864b;
        if (anVar == null) {
            return;
        }
        anVar.setIcon(bitmapDescriptor);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final void setIconLooper(com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor bitmapDescriptor, boolean z17, int i17) {
        this.f48864b.setIconLooper(bitmapDescriptor, z17, i17);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final void setInfoWindowAnchor(float f17, float f18) {
        com.tencent.mapsdk.internal.an anVar = this.f48864b;
        if (anVar == null) {
            return;
        }
        anVar.setInfoWindowAnchor(f17, f18);
        refreshInfoWindow();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final void setInfoWindowEnable(boolean z17) {
        com.tencent.mapsdk.internal.an anVar = this.f48864b;
        if (anVar == null) {
            return;
        }
        anVar.setInfoWindowEnable(z17);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final void setInfoWindowOffset(int i17, int i18) {
        com.tencent.mapsdk.internal.an anVar = this.f48864b;
        if (anVar == null) {
            return;
        }
        anVar.setInfoWindowOffset(i17, i18);
        refreshInfoWindow();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final void setOnTop() {
        com.tencent.mapsdk.internal.an anVar = this.f48864b;
        if (anVar == null) {
            return;
        }
        anVar.setOnTop();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final void setPosition(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        com.tencent.mapsdk.internal.an anVar = this.f48864b;
        if (anVar == null || latLng == null) {
            return;
        }
        anVar.setPosition(latLng);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Rotatable
    public final void setRotation(float f17) {
        com.tencent.mapsdk.internal.an anVar = this.f48864b;
        if (anVar == null) {
            return;
        }
        anVar.setRotation(f17);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Scalable
    public final void setScale(float f17, float f18) {
        com.tencent.mapsdk.internal.an anVar = this.f48864b;
        if (anVar == null) {
            return;
        }
        anVar.setScale(f17, f18);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final void setSnippet(java.lang.String str) {
        com.tencent.mapsdk.internal.an anVar = this.f48864b;
        if (anVar == null) {
            return;
        }
        anVar.setSnippet(str);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Tagable
    public final void setTag(java.lang.Object obj) {
        this.f48864b.setTag(obj);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final void setText(java.lang.String str) {
        com.tencent.mapsdk.internal.an anVar = this.f48864b;
        if (anVar == null) {
            return;
        }
        anVar.setText(str);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final void setTextStyle(com.tencent.tencentmap.mapsdk.maps.model.MarkerTextStyle markerTextStyle) {
        com.tencent.mapsdk.internal.an anVar = this.f48864b;
        if (anVar == null) {
            return;
        }
        anVar.setTextStyle(markerTextStyle);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final void setTitle(java.lang.String str) {
        com.tencent.mapsdk.internal.an anVar = this.f48864b;
        if (anVar == null) {
            return;
        }
        anVar.setTitle(str);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final void showInfoWindow() {
        com.tencent.mapsdk.internal.an anVar = this.f48864b;
        if (anVar == null) {
            return;
        }
        anVar.showInfoWindow();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Animationable
    public final boolean startAnimation() {
        com.tencent.mapsdk.internal.an anVar = this.f48864b;
        if (anVar == null) {
            return false;
        }
        return anVar.startAnimation();
    }

    public final java.lang.String toString() {
        return "MarkerOverlay{id='" + getId() + "'nativeId='" + this.f48864b.a() + "'}";
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Animationable
    public final void startAnimation(com.tencent.tencentmap.mapsdk.maps.model.Animation animation) {
        setAnimation(animation);
        startAnimation();
    }
}
