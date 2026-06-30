package sz0;

/* loaded from: classes14.dex */
public final class g extends h1.c {

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f495456i;

    public g(android.graphics.drawable.Drawable drawable) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(drawable, "drawable");
        this.f495456i = drawable;
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    @Override // h1.c
    public boolean a(float f17) {
        this.f495456i.setAlpha(e06.p.f(a06.d.b(f17 * 255), 0, 255));
        return true;
    }

    @Override // h1.c
    public boolean e(e1.z zVar) {
        this.f495456i.setColorFilter(zVar != null ? zVar.f327858a : null);
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
        return this.f495456i.setLayoutDirection(i17);
    }

    @Override // h1.c
    public long h() {
        android.graphics.drawable.Drawable drawable = this.f495456i;
        return d1.l.a(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    @Override // h1.c
    public void i(g1.i iVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iVar, "<this>");
        e1.u a17 = ((g1.b) iVar.p()).a();
        int b17 = a06.d.b(d1.k.d(iVar.a()));
        int b18 = a06.d.b(d1.k.b(iVar.a()));
        android.graphics.drawable.Drawable drawable = this.f495456i;
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
