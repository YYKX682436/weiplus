package l8;

/* loaded from: classes14.dex */
public final class c extends h1.c implements n0.e4 {

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f398517i;

    /* renamed from: m, reason: collision with root package name */
    public final n0.v2 f398518m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f398519n;

    public c(android.graphics.drawable.Drawable drawable) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(drawable, "drawable");
        this.f398517i = drawable;
        this.f398518m = n0.s4.c(0, null, 2, null);
        this.f398519n = jz5.h.b(new l8.b(this));
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    @Override // h1.c
    public boolean a(float f17) {
        this.f398517i.setAlpha(e06.p.f(a06.d.b(f17 * 255), 0, 255));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // n0.e4
    public void b() {
        android.graphics.drawable.Drawable.Callback callback = (android.graphics.drawable.Drawable.Callback) ((jz5.n) this.f398519n).mo141623x754a37bb();
        android.graphics.drawable.Drawable drawable = this.f398517i;
        drawable.setCallback(callback);
        drawable.setVisible(true, true);
        if (drawable instanceof android.graphics.drawable.Animatable) {
            ((android.graphics.drawable.Animatable) drawable).start();
        }
    }

    @Override // n0.e4
    public void c() {
        d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // n0.e4
    public void d() {
        android.graphics.drawable.Drawable drawable = this.f398517i;
        if (drawable instanceof android.graphics.drawable.Animatable) {
            ((android.graphics.drawable.Animatable) drawable).stop();
        }
        drawable.setVisible(false, false);
        drawable.setCallback(null);
    }

    @Override // h1.c
    public boolean e(e1.z zVar) {
        this.f398517i.setColorFilter(zVar == null ? null : zVar.f327858a);
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
        return this.f398517i.setLayoutDirection(i17);
    }

    @Override // h1.c
    public long h() {
        android.graphics.drawable.Drawable drawable = this.f398517i;
        return d1.l.a(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    @Override // h1.c
    public void i(g1.i iVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iVar, "<this>");
        e1.u a17 = ((g1.b) iVar.p()).a();
        ((java.lang.Number) ((n0.q4) this.f398518m).mo128745x754a37bb()).intValue();
        int b17 = a06.d.b(d1.k.d(iVar.a()));
        int b18 = a06.d.b(d1.k.b(iVar.a()));
        android.graphics.drawable.Drawable drawable = this.f398517i;
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
