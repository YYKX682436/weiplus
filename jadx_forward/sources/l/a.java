package l;

/* loaded from: classes13.dex */
public abstract class a extends android.graphics.drawable.Drawable implements android.graphics.drawable.Drawable.Callback {

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.drawable.Drawable f395556d;

    public a(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable drawable2 = this.f395556d;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f395556d = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        this.f395556d.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return this.f395556d.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable getCurrent() {
        return this.f395556d.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f395556d.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f395556d.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f395556d.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f395556d.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f395556d.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(android.graphics.Rect rect) {
        return this.f395556d.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        return this.f395556d.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.Region getTransparentRegion() {
        return this.f395556d.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(android.graphics.drawable.Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return f3.a.d(this.f395556d);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.f395556d.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f395556d.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(android.graphics.Rect rect) {
        this.f395556d.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i17) {
        return this.f395556d.setLevel(i17);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(android.graphics.drawable.Drawable drawable, java.lang.Runnable runnable, long j17) {
        scheduleSelf(runnable, j17);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i17) {
        this.f395556d.setAlpha(i17);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z17) {
        f3.a.e(this.f395556d, z17);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i17) {
        this.f395556d.setChangingConfigurations(i17);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.f395556d.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z17) {
        this.f395556d.setDither(z17);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z17) {
        this.f395556d.setFilterBitmap(z17);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f17, float f18) {
        f3.b.e(this.f395556d, f17, f18);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i17, int i18, int i19, int i27) {
        f3.b.f(this.f395556d, i17, i18, i19, i27);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return this.f395556d.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i17) {
        f3.b.g(this.f395556d, i17);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(android.content.res.ColorStateList colorStateList) {
        f3.b.h(this.f395556d, colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(android.graphics.PorterDuff.Mode mode) {
        f3.b.i(this.f395556d, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z17, boolean z18) {
        return super.setVisible(z17, z18) || this.f395556d.setVisible(z17, z18);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(android.graphics.drawable.Drawable drawable, java.lang.Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
