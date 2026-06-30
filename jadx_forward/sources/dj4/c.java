package dj4;

/* loaded from: classes10.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f314467d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f314468e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f314469f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ mj4.h f314470g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f314471h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f314472i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ dj4.a f314473m;

    public c(android.widget.ImageView imageView, int i17, android.graphics.Bitmap bitmap, mj4.h hVar, java.lang.ref.WeakReference weakReference, java.lang.String str, dj4.a aVar) {
        this.f314467d = imageView;
        this.f314468e = i17;
        this.f314469f = bitmap;
        this.f314470g = hVar;
        this.f314471h = weakReference;
        this.f314472i = str;
        this.f314473m = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f314467d.getTag(com.p314xaae8f345.mm.R.id.f565654d41), java.lang.Integer.valueOf(this.f314468e))) {
            dj4.u.i(dj4.u.f314582a, this.f314467d, this.f314469f, ((mj4.k) this.f314470g).v(), (android.content.Context) this.f314471h.get(), 0.0f, this.f314472i, 16, null);
            dj4.a aVar = this.f314473m;
            if (aVar != null) {
                ((dj4.h) aVar).a();
            }
        }
    }
}
