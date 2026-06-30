package bp4;

/* loaded from: classes10.dex */
public final class p2 extends yt3.a {

    /* renamed from: f, reason: collision with root package name */
    public final android.view.ViewGroup f23337f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f23338g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f23339h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f23340i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f23341m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f23342n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(android.view.ViewGroup parent, ju3.d0 status) {
        super(status, null);
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(status, "status");
        this.f23337f = parent;
        this.f23338g = jz5.h.b(new bp4.n2(this));
        jz5.g b17 = jz5.h.b(new bp4.o2(this));
        this.f23339h = b17;
        this.f23340i = true;
        this.f23341m = true;
        this.f23342n = new java.util.ArrayList();
        ((com.tencent.mm.ui.widget.imageview.WeImageView) ((jz5.n) b17).getValue()).setOnClickListener(new bp4.l2(this, status));
    }

    public final void A() {
        ((com.tencent.mm.ui.widget.imageview.WeImageView) ((jz5.n) this.f23339h).getValue()).setImageDrawable(com.tencent.mm.ui.uk.e((android.content.Context) ((jz5.n) this.f23338g).getValue(), com.tencent.mm.R.raw.icons_filled_play, -1));
        this.f23340i = false;
        java.util.Iterator it = ((java.util.ArrayList) this.f23342n).iterator();
        while (it.hasNext()) {
            ((bp4.m2) it.next()).onVideoPause();
        }
    }

    public final void B() {
        ((com.tencent.mm.ui.widget.imageview.WeImageView) ((jz5.n) this.f23339h).getValue()).setImageDrawable(com.tencent.mm.ui.uk.e((android.content.Context) ((jz5.n) this.f23338g).getValue(), com.tencent.mm.R.raw.icons_filled_pause, -1));
        this.f23340i = true;
        java.util.Iterator it = ((java.util.ArrayList) this.f23342n).iterator();
        while (it.hasNext()) {
            ((bp4.m2) it.next()).onVideoPlay();
        }
    }

    @Override // yt3.r2
    public void onPause() {
        A();
        ju3.d0.k(this.f465332d, ju3.c0.f301895p1, null, 2, null);
    }

    @Override // yt3.r2
    public void onResume() {
        if (this.f23341m) {
            B();
            ju3.d0.k(this.f465332d, ju3.c0.f301913x1, null, 2, null);
        }
    }

    @Override // yt3.r2
    public void reset() {
        B();
    }

    public final void z(bp4.m2 listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        ((java.util.ArrayList) this.f23342n).add(listener);
    }
}
