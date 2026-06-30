package f0;

/* loaded from: classes5.dex */
public final class k1 {

    /* renamed from: a, reason: collision with root package name */
    public final f0.q f339668a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f339669b;

    /* renamed from: c, reason: collision with root package name */
    public int f339670c;

    /* renamed from: d, reason: collision with root package name */
    public int f339671d;

    /* renamed from: e, reason: collision with root package name */
    public int f339672e;

    /* renamed from: f, reason: collision with root package name */
    public int f339673f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f339674g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f339675h;

    /* renamed from: i, reason: collision with root package name */
    public int f339676i;

    public k1(f0.q itemProvider) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemProvider, "itemProvider");
        this.f339668a = itemProvider;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new f0.g1(0, 0, 2, null));
        this.f339669b = arrayList;
        this.f339673f = -1;
        this.f339674g = new java.util.ArrayList();
        this.f339675h = kz5.p0.f395529d;
    }

    public final int a() {
        return ((int) java.lang.Math.sqrt((d() * 1.0d) / this.f339676i)) + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c9 A[ADDED_TO_REGION, LOOP:1: B:40:0x00c9->B:68:0x00c9, LOOP_START, PHI: r4 r5 r6
  0x00c9: PHI (r4v8 int) = (r4v7 int), (r4v11 int) binds: [B:39:0x00c7, B:68:0x00c9] A[DONT_GENERATE, DONT_INLINE]
  0x00c9: PHI (r5v5 int) = (r5v4 int), (r5v6 int) binds: [B:39:0x00c7, B:68:0x00c9] A[DONT_GENERATE, DONT_INLINE]
  0x00c9: PHI (r6v5 int) = (r6v4 int), (r6v12 int) binds: [B:39:0x00c7, B:68:0x00c9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final f0.i1 b(int r14) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.k1.b(int):f0.i1");
    }

    public final int c(int i17) {
        if (d() <= 0) {
            return 0;
        }
        if (!(i17 < d())) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        if (!((f0.b0) ((f0.s) this.f339668a).f339759a.mo128745x754a37bb()).f339541b) {
            return i17 / this.f339676i;
        }
        java.util.ArrayList arrayList = this.f339669b;
        int e17 = kz5.c0.e(arrayList, 0, arrayList.size(), new f0.j1(i17));
        if (e17 < 0) {
            e17 = (-e17) - 2;
        }
        int a17 = a() * e17;
        int i18 = ((f0.g1) arrayList.get(e17)).f339626a;
        if (!(i18 <= i17)) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        int i19 = 0;
        while (i18 < i17) {
            int i27 = i18 + 1;
            int e18 = e(i18, this.f339676i - i19);
            i19 += e18;
            int i28 = this.f339676i;
            if (i19 >= i28) {
                a17++;
                i19 = i19 == i28 ? 0 : e18;
            }
            if (a17 % a() == 0 && a17 / a() >= arrayList.size()) {
                arrayList.add(new f0.g1(i27 - (i19 > 0 ? 1 : 0), 0, 2, null));
            }
            i18 = i27;
        }
        return i19 + e(i17, this.f339676i - i19) > this.f339676i ? a17 + 1 : a17;
    }

    public final int d() {
        return ((f0.s) this.f339668a).e();
    }

    public final int e(int i17, int i18) {
        f0.h1 h1Var = f0.h1.f339642a;
        f0.s sVar = (f0.s) this.f339668a;
        sVar.getClass();
        f0.b0 b0Var = (f0.b0) sVar.f339759a.mo128745x754a37bb();
        b0Var.getClass();
        p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.c b17 = b0Var.b(i17);
        return e06.p.f((int) ((f0.d) ((f0.j) b17.f91929c).f339653b.mo149xb9724478(h1Var, java.lang.Integer.valueOf(i17 - b17.f91927a))).f339573a, 1, this.f339676i);
    }
}
