package sz0;

/* loaded from: classes14.dex */
public final class f extends h1.c implements n0.e4 {

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f495454i;

    /* renamed from: m, reason: collision with root package name */
    public final n0.v2 f495455m;

    public f(android.graphics.drawable.Drawable drawable) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(drawable, "drawable");
        this.f495454i = drawable;
        this.f495455m = n0.s4.c(0, null, 2, null);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    @Override // h1.c
    public boolean a(float f17) {
        this.f495454i.setAlpha(e06.p.f(a06.d.b(f17 * 255), 0, 255));
        return true;
    }

    @Override // n0.e4
    public void b() {
    }

    @Override // n0.e4
    public void c() {
    }

    @Override // n0.e4
    public void d() {
    }

    @Override // h1.c
    public boolean e(e1.z zVar) {
        this.f495454i.setColorFilter(zVar != null ? zVar.f327858a : null);
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
        return this.f495454i.setLayoutDirection(i17);
    }

    @Override // h1.c
    public long h() {
        android.graphics.drawable.Drawable drawable = this.f495454i;
        return d1.l.a(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    @Override // h1.c
    public void i(g1.i iVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iVar, "<this>");
        e1.u a17 = ((g1.b) iVar.p()).a();
        ((java.lang.Number) ((n0.q4) this.f495455m).mo128745x754a37bb()).intValue();
        int b17 = a06.d.b(d1.k.d(iVar.a()));
        int b18 = a06.d.b(d1.k.b(iVar.a()));
        android.graphics.drawable.Drawable drawable = this.f495454i;
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
