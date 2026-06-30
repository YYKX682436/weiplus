package sz0;

/* loaded from: classes14.dex */
public final class c extends h1.c implements n0.e4 {

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f495447i;

    /* renamed from: m, reason: collision with root package name */
    public final n0.v2 f495448m;

    /* renamed from: n, reason: collision with root package name */
    public final n0.v2 f495449n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f495450o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f495451p;

    public c(java.lang.String key, android.graphics.drawable.Drawable drawable) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(drawable, "drawable");
        this.f495447i = drawable;
        this.f495448m = n0.s4.c(0, null, 2, null);
        this.f495449n = n0.s4.c(new d1.k(sz0.e.a(drawable)), null, 2, null);
        this.f495451p = jz5.h.b(new sz0.b(this));
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            return;
        }
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    @Override // h1.c
    public boolean a(float f17) {
        this.f495447i.setAlpha(e06.p.f(a06.d.b(f17 * 255), 0, 255));
        return true;
    }

    @Override // n0.e4
    public void b() {
        android.graphics.drawable.Drawable.Callback callback = (android.graphics.drawable.Drawable.Callback) ((jz5.n) this.f495451p).mo141623x754a37bb();
        android.graphics.drawable.Drawable drawable = this.f495447i;
        drawable.setCallback(callback);
        drawable.setVisible(true, true);
        if (this.f495450o) {
            return;
        }
        if (drawable instanceof com.p314xaae8f345.mm.p1006xc5476f33.gif.u) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.gif.u) drawable).d();
        }
        if (drawable instanceof com.p314xaae8f345.mm.p1006xc5476f33.gif.k) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.gif.k) drawable).d();
        }
    }

    @Override // n0.e4
    public void c() {
        android.graphics.drawable.Drawable drawable = this.f495447i;
        if (drawable instanceof com.p314xaae8f345.mm.p1006xc5476f33.gif.u) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.gif.u) drawable).b();
        }
        if (drawable instanceof com.p314xaae8f345.mm.p1006xc5476f33.gif.k) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.gif.k) drawable).b();
        }
        drawable.setVisible(false, false);
        drawable.setCallback(null);
    }

    @Override // n0.e4
    public void d() {
        android.graphics.drawable.Drawable drawable = this.f495447i;
        if (drawable instanceof com.p314xaae8f345.mm.p1006xc5476f33.gif.u) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.gif.u) drawable).b();
        }
        if (drawable instanceof com.p314xaae8f345.mm.p1006xc5476f33.gif.k) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.gif.k) drawable).b();
        }
        drawable.setVisible(false, false);
        drawable.setCallback(null);
    }

    @Override // h1.c
    public boolean e(e1.z zVar) {
        this.f495447i.setColorFilter(zVar != null ? zVar.f327858a : null);
        return true;
    }

    @Override // h1.c
    public boolean f(p2.s layoutDirection) {
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layoutDirection, "layoutDirection");
        int ordinal = layoutDirection.ordinal();
        if (ordinal != 0) {
            i17 = 1;
            if (ordinal != 1) {
                throw new jz5.j();
            }
        } else {
            i17 = 0;
        }
        return this.f495447i.setLayoutDirection(i17);
    }

    @Override // h1.c
    public long h() {
        return ((d1.k) ((n0.q4) this.f495449n).mo128745x754a37bb()).f307177a;
    }

    @Override // h1.c
    public void i(g1.i iVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iVar, "<this>");
        e1.u a17 = ((g1.b) iVar.p()).a();
        ((java.lang.Number) ((n0.q4) this.f495448m).mo128745x754a37bb()).intValue();
        int b17 = a06.d.b(d1.k.d(iVar.a()));
        int b18 = a06.d.b(d1.k.b(iVar.a()));
        android.graphics.drawable.Drawable drawable = this.f495447i;
        drawable.setBounds(0, 0, b17, b18);
        try {
            a17.c();
            android.graphics.Canvas canvas = e1.c.f327762a;
            drawable.draw(((e1.b) a17).f327758a);
        } finally {
            a17.b();
        }
    }
}
