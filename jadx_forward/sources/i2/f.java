package i2;

/* loaded from: classes14.dex */
public final class f extends android.text.TextPaint {

    /* renamed from: a, reason: collision with root package name */
    public l2.g f369394a;

    /* renamed from: b, reason: collision with root package name */
    public e1.z0 f369395b;

    /* renamed from: c, reason: collision with root package name */
    public e1.r f369396c;

    /* renamed from: d, reason: collision with root package name */
    public d1.k f369397d;

    public f(int i17, float f17) {
        super(i17);
        ((android.text.TextPaint) this).density = f17;
        this.f369394a = l2.g.f396650b;
        e1.z0 z0Var = e1.z0.f327859d;
        this.f369395b = e1.z0.f327859d;
    }

    public final void a(e1.r rVar, long j17) {
        if (rVar == null) {
            setShader(null);
            return;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f369396c, rVar)) {
            d1.k kVar = this.f369397d;
            if (kVar == null ? false : d1.k.a(kVar.f307177a, j17)) {
                return;
            }
        }
        this.f369396c = rVar;
        this.f369397d = new d1.k(j17);
        if (rVar instanceof e1.e1) {
            setShader(null);
            b(((e1.e1) rVar).f327784b);
        } else if (rVar instanceof e1.y0) {
            int i17 = d1.k.f307176d;
            if (j17 != d1.k.f307175c) {
                setShader(((e1.y0) rVar).b(j17));
            }
        }
    }

    public final void b(long j17) {
        int h17;
        int i17 = e1.y.f327854l;
        if (!(j17 != e1.y.f327853k) || getColor() == (h17 = e1.a0.h(j17))) {
            return;
        }
        setColor(h17);
    }

    public final void c(e1.z0 z0Var) {
        if (z0Var == null) {
            e1.z0 z0Var2 = e1.z0.f327859d;
            z0Var = e1.z0.f327859d;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f369395b, z0Var)) {
            return;
        }
        this.f369395b = z0Var;
        e1.z0 z0Var3 = e1.z0.f327859d;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(z0Var, e1.z0.f327859d)) {
            clearShadowLayer();
        } else {
            e1.z0 z0Var4 = this.f369395b;
            setShadowLayer(z0Var4.f327862c, d1.e.c(z0Var4.f327861b), d1.e.d(this.f369395b.f327861b), e1.a0.h(this.f369395b.f327860a));
        }
    }

    public final void d(l2.g gVar) {
        if (gVar == null) {
            gVar = l2.g.f396650b;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f369394a, gVar)) {
            return;
        }
        this.f369394a = gVar;
        setUnderlineText(gVar.a(l2.g.f396651c));
        setStrikeThruText(this.f369394a.a(l2.g.f396652d));
    }
}
