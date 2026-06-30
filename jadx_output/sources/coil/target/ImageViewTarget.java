package coil.target;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcoil/target/ImageViewTarget;", "Le6/a;", "Landroid/widget/ImageView;", "Lg6/f;", "Landroidx/lifecycle/f;", "view", "<init>", "(Landroid/widget/ImageView;)V", "coil-base_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes10.dex */
public class ImageViewTarget implements e6.a, g6.f, androidx.lifecycle.f {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f43914d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f43915e;

    public ImageViewTarget(android.widget.ImageView view) {
        kotlin.jvm.internal.o.g(view, "view");
        this.f43914d = view;
    }

    @Override // e6.b
    public void a(android.graphics.drawable.Drawable result) {
        kotlin.jvm.internal.o.g(result, "result");
        d(result);
    }

    @Override // e6.b
    public void b(android.graphics.drawable.Drawable drawable) {
        d(drawable);
    }

    @Override // e6.b
    public void c(android.graphics.drawable.Drawable drawable) {
        d(drawable);
    }

    public void d(android.graphics.drawable.Drawable drawable) {
        android.widget.ImageView imageView = this.f43914d;
        java.lang.Object drawable2 = imageView.getDrawable();
        android.graphics.drawable.Animatable animatable = drawable2 instanceof android.graphics.drawable.Animatable ? (android.graphics.drawable.Animatable) drawable2 : null;
        if (animatable != null) {
            animatable.stop();
        }
        imageView.setImageDrawable(drawable);
        e();
    }

    public void e() {
        java.lang.Object drawable = this.f43914d.getDrawable();
        android.graphics.drawable.Animatable animatable = drawable instanceof android.graphics.drawable.Animatable ? (android.graphics.drawable.Animatable) drawable : null;
        if (animatable == null) {
            return;
        }
        if (this.f43915e) {
            animatable.start();
        } else {
            animatable.stop();
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this != obj) {
            if (obj instanceof coil.target.ImageViewTarget) {
                if (kotlin.jvm.internal.o.b(this.f43914d, ((coil.target.ImageViewTarget) obj).f43914d)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f43914d.hashCode();
    }

    @Override // androidx.lifecycle.f, androidx.lifecycle.h
    public void onStart(androidx.lifecycle.y owner) {
        kotlin.jvm.internal.o.g(owner, "owner");
        this.f43915e = true;
        e();
    }

    @Override // androidx.lifecycle.f, androidx.lifecycle.h
    public void onStop(androidx.lifecycle.y owner) {
        kotlin.jvm.internal.o.g(owner, "owner");
        this.f43915e = false;
        e();
    }

    public java.lang.String toString() {
        return "ImageViewTarget(view=" + this.f43914d + ')';
    }
}
