package n11;

/* loaded from: classes12.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f415589a;

    /* renamed from: b, reason: collision with root package name */
    public final int f415590b;

    public c(android.widget.ImageView imageView, java.lang.String str) {
        this.f415589a = new java.lang.ref.WeakReference(imageView);
        if (imageView != null) {
            this.f415590b = imageView.hashCode();
        } else {
            this.f415590b = hashCode();
        }
    }

    public android.widget.ImageView a() {
        android.widget.ImageView imageView;
        java.lang.ref.WeakReference weakReference = this.f415589a;
        if (weakReference == null || (imageView = (android.widget.ImageView) weakReference.get()) == null) {
            return null;
        }
        return imageView;
    }
}
