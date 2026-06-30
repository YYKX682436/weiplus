package p012xc85e97e9.p016x746ad0e3.p019xd1075a44;

/* loaded from: classes13.dex */
public class z0 extends l.a {

    /* renamed from: e, reason: collision with root package name */
    public boolean f91278e;

    public z0(android.graphics.drawable.Drawable drawable) {
        super(drawable);
        this.f91278e = true;
    }

    @Override // l.a, android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        if (this.f91278e) {
            super.draw(canvas);
        }
    }

    @Override // l.a, android.graphics.drawable.Drawable
    public void setHotspot(float f17, float f18) {
        if (this.f91278e) {
            super.setHotspot(f17, f18);
        }
    }

    @Override // l.a, android.graphics.drawable.Drawable
    public void setHotspotBounds(int i17, int i18, int i19, int i27) {
        if (this.f91278e) {
            super.setHotspotBounds(i17, i18, i19, i27);
        }
    }

    @Override // l.a, android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        if (this.f91278e) {
            return super.setState(iArr);
        }
        return false;
    }

    @Override // l.a, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z17, boolean z18) {
        if (this.f91278e) {
            return super.setVisible(z17, z18);
        }
        return false;
    }
}
