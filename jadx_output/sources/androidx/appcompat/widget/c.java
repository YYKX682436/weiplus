package androidx.appcompat.widget;

/* loaded from: classes13.dex */
public class c extends android.graphics.drawable.Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.appcompat.widget.ActionBarContainer f9535a;

    public c(androidx.appcompat.widget.ActionBarContainer actionBarContainer) {
        this.f9535a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        androidx.appcompat.widget.ActionBarContainer actionBarContainer = this.f9535a;
        if (actionBarContainer.f9301n) {
            android.graphics.drawable.Drawable drawable = actionBarContainer.f9300m;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        android.graphics.drawable.Drawable drawable2 = actionBarContainer.f9298h;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        android.graphics.drawable.Drawable drawable3 = actionBarContainer.f9299i;
        if (drawable3 == null || !actionBarContainer.f9302o) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(android.graphics.Outline outline) {
        androidx.appcompat.widget.ActionBarContainer actionBarContainer = this.f9535a;
        if (actionBarContainer.f9301n) {
            android.graphics.drawable.Drawable drawable = actionBarContainer.f9300m;
            if (drawable != null) {
                drawable.getOutline(outline);
                return;
            }
            return;
        }
        android.graphics.drawable.Drawable drawable2 = actionBarContainer.f9298h;
        if (drawable2 != null) {
            drawable2.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i17) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
    }
}
