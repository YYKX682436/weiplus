package n7;

/* loaded from: classes13.dex */
public abstract class e extends n7.k {

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.drawable.Animatable f416763f;

    public e(android.widget.ImageView imageView) {
        super(imageView);
    }

    @Override // n7.h
    public void b(android.graphics.drawable.Drawable drawable) {
        n7.j jVar = this.f416770e;
        android.view.ViewTreeObserver viewTreeObserver = jVar.f416766a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(jVar.f416768c);
        }
        jVar.f416768c = null;
        ((java.util.ArrayList) jVar.f416767b).clear();
        android.graphics.drawable.Animatable animatable = this.f416763f;
        if (animatable != null) {
            animatable.stop();
        }
        i(null);
        this.f416763f = null;
        ((android.widget.ImageView) this.f416769d).setImageDrawable(drawable);
    }

    @Override // n7.h
    public void c(java.lang.Object obj, o7.c cVar) {
        i(obj);
        if (!(obj instanceof android.graphics.drawable.Animatable)) {
            this.f416763f = null;
            return;
        }
        android.graphics.drawable.Animatable animatable = (android.graphics.drawable.Animatable) obj;
        this.f416763f = animatable;
        animatable.start();
    }

    @Override // n7.h
    public void g(android.graphics.drawable.Drawable drawable) {
        i(null);
        this.f416763f = null;
        ((android.widget.ImageView) this.f416769d).setImageDrawable(drawable);
    }

    @Override // n7.h
    public void h(android.graphics.drawable.Drawable drawable) {
        i(null);
        this.f416763f = null;
        ((android.widget.ImageView) this.f416769d).setImageDrawable(drawable);
    }

    public abstract void i(java.lang.Object obj);

    @Override // j7.k
    /* renamed from: onStart */
    public void mo15462xb05099c3() {
        android.graphics.drawable.Animatable animatable = this.f416763f;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // j7.k
    /* renamed from: onStop */
    public void mo15463xc39f8281() {
        android.graphics.drawable.Animatable animatable = this.f416763f;
        if (animatable != null) {
            animatable.stop();
        }
    }
}
