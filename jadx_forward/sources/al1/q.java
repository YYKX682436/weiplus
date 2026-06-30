package al1;

/* loaded from: classes7.dex */
public abstract class q extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public int f87338d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Bitmap f87339e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Bitmap f87340f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f87341g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.l f87342h;

    public final void a(java.lang.String url, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        l01.d0.f396294a.m(new al1.p(z17, this), url, null);
    }

    public final void b(int i17) {
        if (i17 == -1) {
            android.graphics.Bitmap bitmap = this.f87339e;
            if (bitmap != null) {
                m2255xfb80a4ef().setImageBitmap(bitmap);
                return;
            }
            return;
        }
        android.graphics.Bitmap bitmap2 = this.f87340f;
        if (bitmap2 != null) {
            m2255xfb80a4ef().setImageBitmap(bitmap2);
        }
    }

    /* renamed from: getIcon */
    public final android.widget.ImageView m2255xfb80a4ef() {
        android.widget.ImageView imageView = this.f87341g;
        if (imageView != null) {
            return imageView;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("icon");
        throw null;
    }

    /* renamed from: getMDmBitmap */
    public final android.graphics.Bitmap m2256xb505b7ef() {
        return this.f87339e;
    }

    /* renamed from: getMLmBitmap */
    public final android.graphics.Bitmap m2257xf40f1ee7() {
        return this.f87340f;
    }

    /* renamed from: getMOnViewCreated */
    public final yz5.l m2258xa2f0e6ad() {
        yz5.l lVar = this.f87342h;
        if (lVar != null) {
            return lVar;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mOnViewCreated");
        throw null;
    }

    /* renamed from: getMStyleColor */
    public final int m2259xbcd54749() {
        return this.f87338d;
    }

    /* renamed from: setColor */
    public void mo2260x52d2f021(int i17) {
        if (this.f87338d == i17) {
            return;
        }
        b(i17);
        this.f87338d = i17;
    }

    /* renamed from: setIcon */
    public final void m2261x764b6bfb(android.widget.ImageView imageView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageView, "<set-?>");
        this.f87341g = imageView;
    }

    /* renamed from: setMDmBitmap */
    public final void m2262x11597863(android.graphics.Bitmap bitmap) {
        this.f87339e = bitmap;
    }

    /* renamed from: setMLmBitmap */
    public final void m2263x5062df5b(android.graphics.Bitmap bitmap) {
        this.f87340f = bitmap;
    }

    /* renamed from: setMOnViewCreated */
    public final void m2264x6ae74eb9(yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lVar, "<set-?>");
        this.f87342h = lVar;
    }

    /* renamed from: setMStyleColor */
    public final void m2265x533ababd(int i17) {
        this.f87338d = i17;
    }
}
