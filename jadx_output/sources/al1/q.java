package al1;

/* loaded from: classes7.dex */
public abstract class q extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public int f5805d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Bitmap f5806e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Bitmap f5807f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f5808g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.l f5809h;

    public final void a(java.lang.String url, boolean z17) {
        kotlin.jvm.internal.o.g(url, "url");
        l01.d0.f314761a.m(new al1.p(z17, this), url, null);
    }

    public final void b(int i17) {
        if (i17 == -1) {
            android.graphics.Bitmap bitmap = this.f5806e;
            if (bitmap != null) {
                getIcon().setImageBitmap(bitmap);
                return;
            }
            return;
        }
        android.graphics.Bitmap bitmap2 = this.f5807f;
        if (bitmap2 != null) {
            getIcon().setImageBitmap(bitmap2);
        }
    }

    public final android.widget.ImageView getIcon() {
        android.widget.ImageView imageView = this.f5808g;
        if (imageView != null) {
            return imageView;
        }
        kotlin.jvm.internal.o.o("icon");
        throw null;
    }

    public final android.graphics.Bitmap getMDmBitmap() {
        return this.f5806e;
    }

    public final android.graphics.Bitmap getMLmBitmap() {
        return this.f5807f;
    }

    public final yz5.l getMOnViewCreated() {
        yz5.l lVar = this.f5809h;
        if (lVar != null) {
            return lVar;
        }
        kotlin.jvm.internal.o.o("mOnViewCreated");
        throw null;
    }

    public final int getMStyleColor() {
        return this.f5805d;
    }

    public void setColor(int i17) {
        if (this.f5805d == i17) {
            return;
        }
        b(i17);
        this.f5805d = i17;
    }

    public final void setIcon(android.widget.ImageView imageView) {
        kotlin.jvm.internal.o.g(imageView, "<set-?>");
        this.f5808g = imageView;
    }

    public final void setMDmBitmap(android.graphics.Bitmap bitmap) {
        this.f5806e = bitmap;
    }

    public final void setMLmBitmap(android.graphics.Bitmap bitmap) {
        this.f5807f = bitmap;
    }

    public final void setMOnViewCreated(yz5.l lVar) {
        kotlin.jvm.internal.o.g(lVar, "<set-?>");
        this.f5809h = lVar;
    }

    public final void setMStyleColor(int i17) {
        this.f5805d = i17;
    }
}
