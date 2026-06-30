package a2;

/* loaded from: classes14.dex */
public final class j1 {

    /* renamed from: a, reason: collision with root package name */
    public final a2.d f82287a;

    /* renamed from: b, reason: collision with root package name */
    public final a2.o1 f82288b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f82289c;

    /* renamed from: d, reason: collision with root package name */
    public final int f82290d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f82291e;

    /* renamed from: f, reason: collision with root package name */
    public final int f82292f;

    /* renamed from: g, reason: collision with root package name */
    public final p2.f f82293g;

    /* renamed from: h, reason: collision with root package name */
    public final p2.s f82294h;

    /* renamed from: i, reason: collision with root package name */
    public final f2.g f82295i;

    /* renamed from: j, reason: collision with root package name */
    public final long f82296j;

    public j1(a2.d dVar, a2.o1 o1Var, java.util.List list, int i17, boolean z17, int i18, p2.f fVar, p2.s sVar, f2.g gVar, long j17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f82287a = dVar;
        this.f82288b = o1Var;
        this.f82289c = list;
        this.f82290d = i17;
        this.f82291e = z17;
        this.f82292f = i18;
        this.f82293g = fVar;
        this.f82294h = sVar;
        this.f82295i = gVar;
        this.f82296j = j17;
    }

    /* renamed from: equals */
    public boolean m360xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2.j1)) {
            return false;
        }
        a2.j1 j1Var = (a2.j1) obj;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f82287a, j1Var.f82287a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f82288b, j1Var.f82288b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f82289c, j1Var.f82289c) && this.f82290d == j1Var.f82290d && this.f82291e == j1Var.f82291e) {
            return (this.f82292f == j1Var.f82292f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f82293g, j1Var.f82293g) && this.f82294h == j1Var.f82294h && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f82295i, j1Var.f82295i) && p2.c.b(this.f82296j, j1Var.f82296j);
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m361x8cdac1b() {
        return (((((((((((((((((this.f82287a.m340x8cdac1b() * 31) + this.f82288b.m384x8cdac1b()) * 31) + this.f82289c.hashCode()) * 31) + this.f82290d) * 31) + java.lang.Boolean.hashCode(this.f82291e)) * 31) + java.lang.Integer.hashCode(this.f82292f)) * 31) + this.f82293g.hashCode()) * 31) + this.f82294h.hashCode()) * 31) + this.f82295i.hashCode()) * 31) + java.lang.Long.hashCode(this.f82296j);
    }

    /* renamed from: toString */
    public java.lang.String m362x9616526c() {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("TextLayoutInput(text=");
        sb6.append((java.lang.Object) this.f82287a);
        sb6.append(", style=");
        sb6.append(this.f82288b);
        sb6.append(", placeholders=");
        sb6.append(this.f82289c);
        sb6.append(", maxLines=");
        sb6.append(this.f82290d);
        sb6.append(", softWrap=");
        sb6.append(this.f82291e);
        sb6.append(", overflow=");
        int i17 = this.f82292f;
        if (i17 == 1) {
            str = "Clip";
        } else {
            if (i17 == 2) {
                str = "Ellipsis";
            } else {
                str = i17 == 3 ? "Visible" : "Invalid";
            }
        }
        sb6.append((java.lang.Object) str);
        sb6.append(", density=");
        sb6.append(this.f82293g);
        sb6.append(", layoutDirection=");
        sb6.append(this.f82294h);
        sb6.append(", fontFamilyResolver=");
        sb6.append(this.f82295i);
        sb6.append(", constraints=");
        sb6.append((java.lang.Object) p2.c.k(this.f82296j));
        sb6.append(')');
        return sb6.toString();
    }
}
