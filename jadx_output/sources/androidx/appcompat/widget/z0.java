package androidx.appcompat.widget;

/* loaded from: classes13.dex */
public class z0 extends l.a {

    /* renamed from: e, reason: collision with root package name */
    public boolean f9745e;

    public z0(android.graphics.drawable.Drawable drawable) {
        super(drawable);
        this.f9745e = true;
    }

    @Override // l.a, android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        if (this.f9745e) {
            super.draw(canvas);
        }
    }

    @Override // l.a, android.graphics.drawable.Drawable
    public void setHotspot(float f17, float f18) {
        if (this.f9745e) {
            super.setHotspot(f17, f18);
        }
    }

    @Override // l.a, android.graphics.drawable.Drawable
    public void setHotspotBounds(int i17, int i18, int i19, int i27) {
        if (this.f9745e) {
            super.setHotspotBounds(i17, i18, i19, i27);
        }
    }

    @Override // l.a, android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        if (this.f9745e) {
            return super.setState(iArr);
        }
        return false;
    }

    @Override // l.a, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z17, boolean z18) {
        if (this.f9745e) {
            return super.setVisible(z17, z18);
        }
        return false;
    }
}
