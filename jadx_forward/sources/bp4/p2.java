package bp4;

/* loaded from: classes10.dex */
public final class p2 extends yt3.a {

    /* renamed from: f, reason: collision with root package name */
    public final android.view.ViewGroup f104870f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f104871g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f104872h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f104873i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f104874m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f104875n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(android.view.ViewGroup parent, ju3.d0 status) {
        super(status, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        this.f104870f = parent;
        this.f104871g = jz5.h.b(new bp4.n2(this));
        jz5.g b17 = jz5.h.b(new bp4.o2(this));
        this.f104872h = b17;
        this.f104873i = true;
        this.f104874m = true;
        this.f104875n = new java.util.ArrayList();
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) ((jz5.n) b17).mo141623x754a37bb()).setOnClickListener(new bp4.l2(this, status));
    }

    public final void A() {
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) ((jz5.n) this.f104872h).mo141623x754a37bb()).setImageDrawable(com.p314xaae8f345.mm.ui.uk.e((android.content.Context) ((jz5.n) this.f104871g).mo141623x754a37bb(), com.p314xaae8f345.mm.R.raw.f79865xc8527e4c, -1));
        this.f104873i = false;
        java.util.Iterator it = ((java.util.ArrayList) this.f104875n).iterator();
        while (it.hasNext()) {
            ((bp4.m2) it.next()).mo10995x65d3157a();
        }
    }

    public final void B() {
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) ((jz5.n) this.f104872h).mo141623x754a37bb()).setImageDrawable(com.p314xaae8f345.mm.ui.uk.e((android.content.Context) ((jz5.n) this.f104871g).mo141623x754a37bb(), com.p314xaae8f345.mm.R.raw.f79844x41f895de, -1));
        this.f104873i = true;
        java.util.Iterator it = ((java.util.ArrayList) this.f104875n).iterator();
        while (it.hasNext()) {
            ((bp4.m2) it.next()).mo10996x4d9b9b30();
        }
    }

    @Override // yt3.r2
    /* renamed from: onPause */
    public void mo11000xb01dfb57() {
        A();
        ju3.d0.k(this.f546865d, ju3.c0.f383428p1, null, 2, null);
    }

    @Override // yt3.r2
    /* renamed from: onResume */
    public void mo11001x57429eec() {
        if (this.f104874m) {
            B();
            ju3.d0.k(this.f546865d, ju3.c0.f383446x1, null, 2, null);
        }
    }

    @Override // yt3.r2
    /* renamed from: reset */
    public void mo9066x6761d4f() {
        B();
    }

    public final void z(bp4.m2 listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        ((java.util.ArrayList) this.f104875n).add(listener);
    }
}
