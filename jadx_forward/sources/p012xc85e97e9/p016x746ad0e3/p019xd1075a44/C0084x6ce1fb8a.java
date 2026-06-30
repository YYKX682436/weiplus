package p012xc85e97e9.p016x746ad0e3.p019xd1075a44;

/* renamed from: androidx.appcompat.widget.AppCompatImageButton */
/* loaded from: classes15.dex */
public class C0084x6ce1fb8a extends android.widget.ImageButton {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.p019xd1075a44.d0 f90901d;

    /* renamed from: e, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.p019xd1075a44.j0 f90902e;

    public C0084x6ce1fb8a(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.p314xaae8f345.mm.R.C30857x2dd9f1.f559827fy);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.d0 d0Var = this.f90901d;
        if (d0Var != null) {
            d0Var.a();
        }
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.j0 j0Var = this.f90902e;
        if (j0Var != null) {
            j0Var.a();
        }
    }

    /* renamed from: getSupportBackgroundTintList */
    public android.content.res.ColorStateList m2662x6bcb5100() {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.d0 d0Var = this.f90901d;
        if (d0Var != null) {
            return d0Var.b();
        }
        return null;
    }

    /* renamed from: getSupportBackgroundTintMode */
    public android.graphics.PorterDuff.Mode m2663x6bcbda05() {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.d0 d0Var = this.f90901d;
        if (d0Var != null) {
            return d0Var.c();
        }
        return null;
    }

    /* renamed from: getSupportImageTintList */
    public android.content.res.ColorStateList m2664x36b6d99b() {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.o2 o2Var;
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.j0 j0Var = this.f90902e;
        if (j0Var == null || (o2Var = j0Var.f91148b) == null) {
            return null;
        }
        return o2Var.f91199a;
    }

    /* renamed from: getSupportImageTintMode */
    public android.graphics.PorterDuff.Mode m2665x36b762a0() {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.o2 o2Var;
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.j0 j0Var = this.f90902e;
        if (j0Var == null || (o2Var = j0Var.f91148b) == null) {
            return null;
        }
        return o2Var.f91200b;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return ((this.f90902e.f91147a.getBackground() instanceof android.graphics.drawable.RippleDrawable) ^ true) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.d0 d0Var = this.f90901d;
        if (d0Var != null) {
            d0Var.e(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i17) {
        super.setBackgroundResource(i17);
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.d0 d0Var = this.f90901d;
        if (d0Var != null) {
            d0Var.f(i17);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(android.graphics.Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.j0 j0Var = this.f90902e;
        if (j0Var != null) {
            j0Var.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(android.graphics.drawable.Drawable drawable) {
        super.setImageDrawable(drawable);
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.j0 j0Var = this.f90902e;
        if (j0Var != null) {
            j0Var.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i17) {
        this.f90902e.c(i17);
    }

    @Override // android.widget.ImageView
    public void setImageURI(android.net.Uri uri) {
        super.setImageURI(uri);
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.j0 j0Var = this.f90902e;
        if (j0Var != null) {
            j0Var.a();
        }
    }

    /* renamed from: setSupportBackgroundTintList */
    public void m2666xb597a974(android.content.res.ColorStateList colorStateList) {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.d0 d0Var = this.f90901d;
        if (d0Var != null) {
            d0Var.h(colorStateList);
        }
    }

    /* renamed from: setSupportBackgroundTintMode */
    public void m2667xb5983279(android.graphics.PorterDuff.Mode mode) {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.d0 d0Var = this.f90901d;
        if (d0Var != null) {
            d0Var.i(mode);
        }
    }

    /* renamed from: setSupportImageTintList */
    public void m2668xb10a08a7(android.content.res.ColorStateList colorStateList) {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.j0 j0Var = this.f90902e;
        if (j0Var != null) {
            if (j0Var.f91148b == null) {
                j0Var.f91148b = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.o2();
            }
            p012xc85e97e9.p016x746ad0e3.p019xd1075a44.o2 o2Var = j0Var.f91148b;
            o2Var.f91199a = colorStateList;
            o2Var.f91202d = true;
            j0Var.a();
        }
    }

    /* renamed from: setSupportImageTintMode */
    public void m2669xb10a91ac(android.graphics.PorterDuff.Mode mode) {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.j0 j0Var = this.f90902e;
        if (j0Var != null) {
            if (j0Var.f91148b == null) {
                j0Var.f91148b = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.o2();
            }
            p012xc85e97e9.p016x746ad0e3.p019xd1075a44.o2 o2Var = j0Var.f91148b;
            o2Var.f91200b = mode;
            o2Var.f91201c = true;
            j0Var.a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0084x6ce1fb8a(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.n2.a(context);
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.d0 d0Var = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.d0(this);
        this.f90901d = d0Var;
        d0Var.d(attributeSet, i17);
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.j0 j0Var = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.j0(this);
        this.f90902e = j0Var;
        j0Var.b(attributeSet, i17);
    }
}
