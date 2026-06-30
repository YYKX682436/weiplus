package androidx.appcompat.widget;

/* loaded from: classes15.dex */
public class AppCompatImageView extends android.widget.ImageView {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.appcompat.widget.d0 f9370d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.appcompat.widget.j0 f9371e;

    public AppCompatImageView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        androidx.appcompat.widget.d0 d0Var = this.f9370d;
        if (d0Var != null) {
            d0Var.a();
        }
        androidx.appcompat.widget.j0 j0Var = this.f9371e;
        if (j0Var != null) {
            j0Var.a();
        }
    }

    public android.content.res.ColorStateList getSupportBackgroundTintList() {
        androidx.appcompat.widget.d0 d0Var = this.f9370d;
        if (d0Var != null) {
            return d0Var.b();
        }
        return null;
    }

    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
        androidx.appcompat.widget.d0 d0Var = this.f9370d;
        if (d0Var != null) {
            return d0Var.c();
        }
        return null;
    }

    public android.content.res.ColorStateList getSupportImageTintList() {
        androidx.appcompat.widget.o2 o2Var;
        androidx.appcompat.widget.j0 j0Var = this.f9371e;
        if (j0Var == null || (o2Var = j0Var.f9615b) == null) {
            return null;
        }
        return o2Var.f9666a;
    }

    public android.graphics.PorterDuff.Mode getSupportImageTintMode() {
        androidx.appcompat.widget.o2 o2Var;
        androidx.appcompat.widget.j0 j0Var = this.f9371e;
        if (j0Var == null || (o2Var = j0Var.f9615b) == null) {
            return null;
        }
        return o2Var.f9667b;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return ((this.f9371e.f9614a.getBackground() instanceof android.graphics.drawable.RippleDrawable) ^ true) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        androidx.appcompat.widget.d0 d0Var = this.f9370d;
        if (d0Var != null) {
            d0Var.e(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i17) {
        super.setBackgroundResource(i17);
        androidx.appcompat.widget.d0 d0Var = this.f9370d;
        if (d0Var != null) {
            d0Var.f(i17);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(android.graphics.Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        androidx.appcompat.widget.j0 j0Var = this.f9371e;
        if (j0Var != null) {
            j0Var.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(android.graphics.drawable.Drawable drawable) {
        super.setImageDrawable(drawable);
        androidx.appcompat.widget.j0 j0Var = this.f9371e;
        if (j0Var != null) {
            j0Var.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i17) {
        androidx.appcompat.widget.j0 j0Var = this.f9371e;
        if (j0Var != null) {
            j0Var.c(i17);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(android.net.Uri uri) {
        super.setImageURI(uri);
        androidx.appcompat.widget.j0 j0Var = this.f9371e;
        if (j0Var != null) {
            j0Var.a();
        }
    }

    public void setSupportBackgroundTintList(android.content.res.ColorStateList colorStateList) {
        androidx.appcompat.widget.d0 d0Var = this.f9370d;
        if (d0Var != null) {
            d0Var.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode mode) {
        androidx.appcompat.widget.d0 d0Var = this.f9370d;
        if (d0Var != null) {
            d0Var.i(mode);
        }
    }

    public void setSupportImageTintList(android.content.res.ColorStateList colorStateList) {
        androidx.appcompat.widget.j0 j0Var = this.f9371e;
        if (j0Var != null) {
            if (j0Var.f9615b == null) {
                j0Var.f9615b = new androidx.appcompat.widget.o2();
            }
            androidx.appcompat.widget.o2 o2Var = j0Var.f9615b;
            o2Var.f9666a = colorStateList;
            o2Var.f9669d = true;
            j0Var.a();
        }
    }

    public void setSupportImageTintMode(android.graphics.PorterDuff.Mode mode) {
        androidx.appcompat.widget.j0 j0Var = this.f9371e;
        if (j0Var != null) {
            if (j0Var.f9615b == null) {
                j0Var.f9615b = new androidx.appcompat.widget.o2();
            }
            androidx.appcompat.widget.o2 o2Var = j0Var.f9615b;
            o2Var.f9667b = mode;
            o2Var.f9668c = true;
            j0Var.a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatImageView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        androidx.appcompat.widget.n2.a(context);
        androidx.appcompat.widget.d0 d0Var = new androidx.appcompat.widget.d0(this);
        this.f9370d = d0Var;
        d0Var.d(attributeSet, i17);
        androidx.appcompat.widget.j0 j0Var = new androidx.appcompat.widget.j0(this);
        this.f9371e = j0Var;
        j0Var.b(attributeSet, i17);
    }
}
