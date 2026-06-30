package dj4;

/* loaded from: classes3.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f314568d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f314569e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f314570f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f314571g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f314572h;

    public r(java.lang.String str, android.widget.ImageView imageView, boolean z17, android.graphics.Bitmap bitmap, float f17) {
        this.f314568d = str;
        this.f314569e = imageView;
        this.f314570f = z17;
        this.f314571g = bitmap;
        this.f314572h = f17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.Map map = dj4.u.f314583b;
        android.widget.ImageView imageView = this.f314569e;
        java.lang.String str = (java.lang.String) ((java.util.LinkedHashMap) map).get(java.lang.String.valueOf(imageView.hashCode()));
        imageView.hashCode();
        java.lang.String str2 = this.f314568d;
        if ((!r26.n0.N(str2)) && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.StatusImgHandler", "setImageWithGradient() skip, with: iv = " + imageView.hashCode() + ", oldIvBindInfo=" + str2 + ", needBindInfo=" + str);
            return;
        }
        boolean z17 = this.f314570f;
        android.graphics.Bitmap bitmap = this.f314571g;
        if (!z17 && bitmap.getWidth() != 0 && imageView.getWidth() != 0 && bitmap.getHeight() / bitmap.getWidth() >= imageView.getHeight() / imageView.getWidth()) {
            imageView.setImageBitmap(bitmap);
            return;
        }
        um5.d dVar = new um5.d();
        dVar.b(bitmap);
        int width = imageView.getWidth();
        int height = imageView.getHeight();
        dVar.f510674b = width;
        dVar.f510675c = height;
        um5.p pVar = dVar.f510677e;
        pVar.f510726b.d();
        if (z17) {
            pVar.f510726b.b().d(this.f314572h);
        }
        dVar.a(new dj4.q(imageView));
    }
}
