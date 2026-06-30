package cp0;

/* loaded from: classes15.dex */
public class d extends cp0.m {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f302274b;

    public d(cp0.n nVar) {
        super(nVar);
        this.f302274b = true;
    }

    @Override // cp0.f
    public int c() {
        return this.f302278a.f302294c;
    }

    @Override // cp0.f
    public void d(cp0.n nVar, vo0.h hVar) {
        if (nVar == null || hVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Loader.ImageViewShowTarget", "[ViewShowTarget] should show default view or options is null.");
            return;
        }
        android.widget.ImageView imageView = (android.widget.ImageView) nVar.b();
        if (imageView != null && this.f302274b) {
            android.graphics.drawable.Drawable drawable = hVar.f520023t;
            int i17 = hVar.f520021r;
            if (!(i17 > 0 || drawable != null)) {
                imageView.setImageBitmap(null);
            } else if (i17 == 0) {
                imageView.setImageDrawable(drawable);
            } else {
                imageView.setImageResource(i17);
            }
        }
    }

    @Override // cp0.f
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean b(android.graphics.Bitmap bitmap, cp0.n nVar) {
        android.widget.ImageView imageView = (android.widget.ImageView) nVar.b();
        java.lang.Object obj = nVar.f302293b.f375106a;
        if (imageView == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Loader.ImageViewShowTarget", "[onResourceReadyUI]  imageView is null");
            return true;
        }
        imageView.setImageMatrix(null);
        if (obj instanceof ip0.d) {
            imageView.addOnLayoutChangeListener(new cp0.c(this, obj, imageView));
        }
        imageView.setImageBitmap(bitmap);
        return true;
    }

    public d(cp0.n nVar, boolean z17) {
        super(nVar);
        this.f302274b = true;
        this.f302274b = z17;
    }
}
