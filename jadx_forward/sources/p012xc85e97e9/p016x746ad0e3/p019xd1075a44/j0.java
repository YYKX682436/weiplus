package p012xc85e97e9.p016x746ad0e3.p019xd1075a44;

/* loaded from: classes15.dex */
public class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.ImageView f91147a;

    /* renamed from: b, reason: collision with root package name */
    public p012xc85e97e9.p016x746ad0e3.p019xd1075a44.o2 f91148b;

    public j0(android.widget.ImageView imageView) {
        this.f91147a = imageView;
    }

    public void a() {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.o2 o2Var;
        android.widget.ImageView imageView = this.f91147a;
        android.graphics.drawable.Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            android.graphics.Rect rect = p012xc85e97e9.p016x746ad0e3.p019xd1075a44.y0.f91271a;
        }
        if (drawable == null || (o2Var = this.f91148b) == null) {
            return;
        }
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.h0.m(drawable, o2Var, imageView.getDrawableState());
    }

    public void b(android.util.AttributeSet attributeSet, int i17) {
        int i18;
        android.widget.ImageView imageView = this.f91147a;
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q2 l17 = p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q2.l(imageView.getContext(), attributeSet, j.a.f377712g, i17, 0);
        try {
            android.graphics.drawable.Drawable drawable = imageView.getDrawable();
            if (drawable == null && (i18 = l17.i(1, -1)) != -1 && (drawable = k.a.a(imageView.getContext(), i18)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                android.graphics.Rect rect = p012xc85e97e9.p016x746ad0e3.p019xd1075a44.y0.f91271a;
            }
            if (l17.k(2)) {
                p012xc85e97e9.p075x2eaf9f.p079xd1075a44.j.c(imageView, l17.b(2));
            }
            if (l17.k(3)) {
                p012xc85e97e9.p075x2eaf9f.p079xd1075a44.j.d(imageView, p012xc85e97e9.p016x746ad0e3.p019xd1075a44.y0.c(l17.h(3, -1), null));
            }
        } finally {
            l17.m();
        }
    }

    public void c(int i17) {
        android.widget.ImageView imageView = this.f91147a;
        if (i17 != 0) {
            android.graphics.drawable.Drawable a17 = k.a.a(imageView.getContext(), i17);
            if (a17 != null) {
                android.graphics.Rect rect = p012xc85e97e9.p016x746ad0e3.p019xd1075a44.y0.f91271a;
            }
            imageView.setImageDrawable(a17);
        } else {
            imageView.setImageDrawable(null);
        }
        a();
    }
}
