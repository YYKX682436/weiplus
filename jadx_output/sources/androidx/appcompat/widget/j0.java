package androidx.appcompat.widget;

/* loaded from: classes15.dex */
public class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.ImageView f9614a;

    /* renamed from: b, reason: collision with root package name */
    public androidx.appcompat.widget.o2 f9615b;

    public j0(android.widget.ImageView imageView) {
        this.f9614a = imageView;
    }

    public void a() {
        androidx.appcompat.widget.o2 o2Var;
        android.widget.ImageView imageView = this.f9614a;
        android.graphics.drawable.Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            android.graphics.Rect rect = androidx.appcompat.widget.y0.f9738a;
        }
        if (drawable == null || (o2Var = this.f9615b) == null) {
            return;
        }
        androidx.appcompat.widget.h0.m(drawable, o2Var, imageView.getDrawableState());
    }

    public void b(android.util.AttributeSet attributeSet, int i17) {
        int i18;
        android.widget.ImageView imageView = this.f9614a;
        androidx.appcompat.widget.q2 l17 = androidx.appcompat.widget.q2.l(imageView.getContext(), attributeSet, j.a.f296179g, i17, 0);
        try {
            android.graphics.drawable.Drawable drawable = imageView.getDrawable();
            if (drawable == null && (i18 = l17.i(1, -1)) != -1 && (drawable = k.a.a(imageView.getContext(), i18)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                android.graphics.Rect rect = androidx.appcompat.widget.y0.f9738a;
            }
            if (l17.k(2)) {
                androidx.core.widget.j.c(imageView, l17.b(2));
            }
            if (l17.k(3)) {
                androidx.core.widget.j.d(imageView, androidx.appcompat.widget.y0.c(l17.h(3, -1), null));
            }
        } finally {
            l17.m();
        }
    }

    public void c(int i17) {
        android.widget.ImageView imageView = this.f9614a;
        if (i17 != 0) {
            android.graphics.drawable.Drawable a17 = k.a.a(imageView.getContext(), i17);
            if (a17 != null) {
                android.graphics.Rect rect = androidx.appcompat.widget.y0.f9738a;
            }
            imageView.setImageDrawable(a17);
        } else {
            imageView.setImageDrawable(null);
        }
        a();
    }
}
