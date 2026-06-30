package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public abstract class au<D extends com.tencent.mapsdk.internal.ao> implements com.tencent.mapsdk.internal.ez {

    /* renamed from: b, reason: collision with root package name */
    private static final java.util.concurrent.atomic.AtomicInteger f48863b = new java.util.concurrent.atomic.AtomicInteger(1);
    protected final java.lang.String c_ = java.lang.String.valueOf(f48863b.incrementAndGet());

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Boundable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public android.graphics.Rect getScreenBound(com.tencent.mapsdk.internal.ey eyVar) {
        return f_().getScreenBound(eyVar);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Boundable
    /* renamed from: b */
    public android.graphics.Rect getBound(com.tencent.mapsdk.internal.ey eyVar) {
        return f_().getBound(eyVar);
    }

    public abstract D f_();

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Boundable
    public java.util.List<com.tencent.tencentmap.mapsdk.maps.interfaces.Boundable<com.tencent.mapsdk.internal.ey>> getGroupBounds() {
        return f_().getGroupBounds();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.IOverlay
    public java.lang.String getId() {
        return f_().getId();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Levelable
    public int getLevel() {
        return f_().getLevel();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Levelable
    public int getZIndex() {
        return f_().getZIndex();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Tappable
    public boolean handleOnTap() {
        return f_().handleOnTap();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Removable
    public boolean isRemoved() {
        return f_().isRemoved();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Selectable
    public boolean isSelected() {
        return f_().isSelected();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Visible
    public boolean isVisible() {
        return f_().isVisible();
    }

    @Override // com.tencent.mapsdk.internal.ez
    public long o() {
        return f_().o();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Tappable
    public boolean onTap(float f17, float f18) {
        return f_().onTap(f17, f18);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Removable
    public void releaseData() {
        f_().releaseData();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Removable
    public void remove() {
        f_().remove();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Levelable, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay
    public void setLevel(int i17) {
        f_().setLevel(i17);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Selectable
    public void setSelected(boolean z17) {
        f_().setSelected(z17);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Selectable
    public <T> void setSelectedListener(com.tencent.tencentmap.mapsdk.maps.interfaces.Selectable.OnSelectedListener<T> onSelectedListener) {
        f_().setSelectedListener(onSelectedListener);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Visible
    public void setVisible(boolean z17) {
        f_().setVisible(z17);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Levelable
    public void setZIndex(int i17) {
        f_().setZIndex(i17);
    }

    @Override // com.tencent.mapsdk.internal.et
    public void a(javax.microedition.khronos.opengles.GL10 gl10) {
        f_().a(gl10);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Levelable
    public void setZIndex(float f17) {
        setZIndex((int) f17);
    }
}
