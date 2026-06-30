package j0;

/* loaded from: classes14.dex */
public final class k3 {

    /* renamed from: a, reason: collision with root package name */
    public final a2.d f377936a;

    /* renamed from: b, reason: collision with root package name */
    public final a2.o1 f377937b;

    /* renamed from: c, reason: collision with root package name */
    public final int f377938c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f377939d;

    /* renamed from: e, reason: collision with root package name */
    public final int f377940e;

    /* renamed from: f, reason: collision with root package name */
    public final p2.f f377941f;

    /* renamed from: g, reason: collision with root package name */
    public final f2.g f377942g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f377943h;

    /* renamed from: i, reason: collision with root package name */
    public a2.j f377944i;

    /* renamed from: j, reason: collision with root package name */
    public p2.s f377945j;

    public k3(a2.d dVar, a2.o1 o1Var, int i17, boolean z17, int i18, p2.f fVar, f2.g gVar, java.util.List list, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f377936a = dVar;
        this.f377937b = o1Var;
        this.f377938c = i17;
        this.f377939d = z17;
        this.f377940e = i18;
        this.f377941f = fVar;
        this.f377942g = gVar;
        this.f377943h = list;
        if (!(i17 > 0)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b8, code lost:
    
        if ((r6 == 2) == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00cf, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00cd, code lost:
    
        if (p2.c.g(r31) == p2.c.g(r7)) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0157  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final a2.k1 a(long r31, p2.s r33, a2.k1 r34) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.k3.a(long, p2.s, a2.k1):a2.k1");
    }

    public final void b(p2.s layoutDirection) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layoutDirection, "layoutDirection");
        a2.j jVar = this.f377944i;
        if (jVar == null || layoutDirection != this.f377945j || jVar.a()) {
            this.f377945j = layoutDirection;
            jVar = new a2.j(this.f377936a, a2.p1.a(this.f377937b, layoutDirection), this.f377943h, this.f377941f, this.f377942g);
        }
        this.f377944i = jVar;
    }

    public /* synthetic */ k3(a2.d dVar, a2.o1 o1Var, int i17, boolean z17, int i18, p2.f fVar, f2.g gVar, java.util.List list, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(dVar, o1Var, (i19 & 4) != 0 ? Integer.MAX_VALUE : i17, (i19 & 8) != 0 ? true : z17, (i19 & 16) != 0 ? 1 : i18, fVar, gVar, (i19 & 128) != 0 ? kz5.p0.f395529d : list, null);
    }
}
