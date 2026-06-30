package pk2;

/* loaded from: classes3.dex */
public final class i7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f437373d;

    public i7(android.widget.ImageView imageView) {
        this.f437373d = imageView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.drawable.Drawable mutate;
        android.widget.ImageView imageView = this.f437373d;
        android.graphics.drawable.Drawable background = imageView.getBackground();
        if (background != null && (mutate = background.mutate()) != null) {
            mutate.clearColorFilter();
        }
        imageView.setAlpha(1.0f);
    }
}
