package p012xc85e97e9.p016x746ad0e3.p019xd1075a44;

/* loaded from: classes13.dex */
public class c extends android.graphics.drawable.Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0072x2565c324 f91068a;

    public c(p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0072x2565c324 c0072x2565c324) {
        this.f91068a = c0072x2565c324;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0072x2565c324 c0072x2565c324 = this.f91068a;
        if (c0072x2565c324.f90834n) {
            android.graphics.drawable.Drawable drawable = c0072x2565c324.f90833m;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        android.graphics.drawable.Drawable drawable2 = c0072x2565c324.f90831h;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        android.graphics.drawable.Drawable drawable3 = c0072x2565c324.f90832i;
        if (drawable3 == null || !c0072x2565c324.f90835o) {
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
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0072x2565c324 c0072x2565c324 = this.f91068a;
        if (c0072x2565c324.f90834n) {
            android.graphics.drawable.Drawable drawable = c0072x2565c324.f90833m;
            if (drawable != null) {
                drawable.getOutline(outline);
                return;
            }
            return;
        }
        android.graphics.drawable.Drawable drawable2 = c0072x2565c324.f90831h;
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
