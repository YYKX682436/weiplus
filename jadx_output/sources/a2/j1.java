package a2;

/* loaded from: classes14.dex */
public final class j1 {

    /* renamed from: a, reason: collision with root package name */
    public final a2.d f754a;

    /* renamed from: b, reason: collision with root package name */
    public final a2.o1 f755b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f756c;

    /* renamed from: d, reason: collision with root package name */
    public final int f757d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f758e;

    /* renamed from: f, reason: collision with root package name */
    public final int f759f;

    /* renamed from: g, reason: collision with root package name */
    public final p2.f f760g;

    /* renamed from: h, reason: collision with root package name */
    public final p2.s f761h;

    /* renamed from: i, reason: collision with root package name */
    public final f2.g f762i;

    /* renamed from: j, reason: collision with root package name */
    public final long f763j;

    public j1(a2.d dVar, a2.o1 o1Var, java.util.List list, int i17, boolean z17, int i18, p2.f fVar, p2.s sVar, f2.g gVar, long j17, kotlin.jvm.internal.i iVar) {
        this.f754a = dVar;
        this.f755b = o1Var;
        this.f756c = list;
        this.f757d = i17;
        this.f758e = z17;
        this.f759f = i18;
        this.f760g = fVar;
        this.f761h = sVar;
        this.f762i = gVar;
        this.f763j = j17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2.j1)) {
            return false;
        }
        a2.j1 j1Var = (a2.j1) obj;
        if (kotlin.jvm.internal.o.b(this.f754a, j1Var.f754a) && kotlin.jvm.internal.o.b(this.f755b, j1Var.f755b) && kotlin.jvm.internal.o.b(this.f756c, j1Var.f756c) && this.f757d == j1Var.f757d && this.f758e == j1Var.f758e) {
            return (this.f759f == j1Var.f759f) && kotlin.jvm.internal.o.b(this.f760g, j1Var.f760g) && this.f761h == j1Var.f761h && kotlin.jvm.internal.o.b(this.f762i, j1Var.f762i) && p2.c.b(this.f763j, j1Var.f763j);
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((((((this.f754a.hashCode() * 31) + this.f755b.hashCode()) * 31) + this.f756c.hashCode()) * 31) + this.f757d) * 31) + java.lang.Boolean.hashCode(this.f758e)) * 31) + java.lang.Integer.hashCode(this.f759f)) * 31) + this.f760g.hashCode()) * 31) + this.f761h.hashCode()) * 31) + this.f762i.hashCode()) * 31) + java.lang.Long.hashCode(this.f763j);
    }

    public java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("TextLayoutInput(text=");
        sb6.append((java.lang.Object) this.f754a);
        sb6.append(", style=");
        sb6.append(this.f755b);
        sb6.append(", placeholders=");
        sb6.append(this.f756c);
        sb6.append(", maxLines=");
        sb6.append(this.f757d);
        sb6.append(", softWrap=");
        sb6.append(this.f758e);
        sb6.append(", overflow=");
        int i17 = this.f759f;
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
        sb6.append(this.f760g);
        sb6.append(", layoutDirection=");
        sb6.append(this.f761h);
        sb6.append(", fontFamilyResolver=");
        sb6.append(this.f762i);
        sb6.append(", constraints=");
        sb6.append((java.lang.Object) p2.c.k(this.f763j));
        sb6.append(')');
        return sb6.toString();
    }
}
