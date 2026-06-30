package l01;

/* loaded from: classes7.dex */
public abstract class w implements l01.u {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f396321d;

    /* renamed from: e, reason: collision with root package name */
    public final l01.b f396322e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f396324g = false;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f396323f = "ImageView";

    public w(android.widget.ImageView imageView, l01.b bVar, java.lang.String str, l01.e0 e0Var, l01.c cVar) {
        this.f396321d = new java.lang.ref.WeakReference(imageView);
        this.f396322e = bVar;
    }

    @Override // l01.u
    public void b() {
        android.widget.ImageView imageView = (android.widget.ImageView) this.f396321d.get();
        if (imageView != null) {
            ((java.util.concurrent.ConcurrentHashMap) this.f396322e.f396274c).remove(java.lang.Integer.valueOf(imageView.hashCode()));
        }
    }

    @Override // l01.i0
    public java.lang.String key() {
        return this.f396323f;
    }

    @Override // l01.u
    /* renamed from: onBitmapLoaded */
    public void mo1040x5481b993(android.graphics.Bitmap bitmap) {
        java.lang.ref.WeakReference weakReference = this.f396321d;
        android.widget.ImageView imageView = (android.widget.ImageView) weakReference.get();
        if (imageView != null) {
            ((java.util.concurrent.ConcurrentHashMap) this.f396322e.f396274c).remove(java.lang.Integer.valueOf(imageView.hashCode()));
        }
        android.widget.ImageView imageView2 = (android.widget.ImageView) weakReference.get();
        this.f396324g = true;
        if (imageView2 != null) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.e()) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("Luggage.AppBrandSimpleImageLoader", "onBitmapLoaded invoke in non-main thread!!!", new java.lang.Object[0]);
            }
            imageView2.setImageDrawable(new l01.p0(imageView2.getResources(), bitmap));
        }
    }
}
