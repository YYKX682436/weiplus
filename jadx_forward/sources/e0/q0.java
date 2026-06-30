package e0;

/* loaded from: classes14.dex */
public final class q0 implements e0.n {

    /* renamed from: a, reason: collision with root package name */
    public final int f327211a;

    /* renamed from: b, reason: collision with root package name */
    public final int f327212b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Object f327213c;

    /* renamed from: d, reason: collision with root package name */
    public final int f327214d;

    /* renamed from: e, reason: collision with root package name */
    public final int f327215e;

    /* renamed from: f, reason: collision with root package name */
    public final int f327216f;

    /* renamed from: g, reason: collision with root package name */
    public final int f327217g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f327218h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f327219i;

    /* renamed from: j, reason: collision with root package name */
    public final e0.q f327220j;

    /* renamed from: k, reason: collision with root package name */
    public final long f327221k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f327222l;

    public q0(int i17, int i18, java.lang.Object obj, int i19, int i27, int i28, int i29, boolean z17, java.util.List list, e0.q qVar, long j17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f327211a = i17;
        this.f327212b = i18;
        this.f327213c = obj;
        this.f327214d = i19;
        this.f327215e = i27;
        this.f327216f = i28;
        this.f327217g = i29;
        this.f327218h = z17;
        this.f327219i = list;
        this.f327220j = qVar;
        this.f327221k = j17;
        int size = list.size();
        boolean z18 = false;
        int i37 = 0;
        while (true) {
            if (i37 >= size) {
                break;
            }
            if (a(i37) != null) {
                z18 = true;
                break;
            }
            i37++;
        }
        this.f327222l = z18;
    }

    public final z.k0 a(int i17) {
        java.lang.Object obj = ((e0.p0) this.f327219i.get(i17)).f327198c;
        if (obj instanceof z.k0) {
            return (z.k0) obj;
        }
        return null;
    }

    public final int b(int i17) {
        s1.o1 o1Var = ((e0.p0) this.f327219i.get(i17)).f327197b;
        return this.f327218h ? o1Var.f483584e : o1Var.f483583d;
    }

    public final long c(int i17) {
        return ((e0.p0) this.f327219i.get(i17)).f327196a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c7, code lost:
    
        if (r4.b(r7) > r5) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(s1.n1 r23) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.q0.d(s1.n1):void");
    }
}
