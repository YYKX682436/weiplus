package e0;

/* loaded from: classes14.dex */
public final class i1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f327131a;

    /* renamed from: b, reason: collision with root package name */
    public final s1.o1[] f327132b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f327133c;

    /* renamed from: d, reason: collision with root package name */
    public final z0.b f327134d;

    /* renamed from: e, reason: collision with root package name */
    public final z0.c f327135e;

    /* renamed from: f, reason: collision with root package name */
    public final p2.s f327136f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f327137g;

    /* renamed from: h, reason: collision with root package name */
    public final int f327138h;

    /* renamed from: i, reason: collision with root package name */
    public final int f327139i;

    /* renamed from: j, reason: collision with root package name */
    public final e0.q f327140j;

    /* renamed from: k, reason: collision with root package name */
    public final int f327141k;

    /* renamed from: l, reason: collision with root package name */
    public final long f327142l;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.Object f327143m;

    /* renamed from: n, reason: collision with root package name */
    public final int f327144n;

    /* renamed from: o, reason: collision with root package name */
    public final int f327145o;

    /* renamed from: p, reason: collision with root package name */
    public final int f327146p;

    public i1(int i17, s1.o1[] o1VarArr, boolean z17, z0.b bVar, z0.c cVar, p2.s sVar, boolean z18, int i18, int i19, e0.q qVar, int i27, long j17, java.lang.Object obj, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f327131a = i17;
        this.f327132b = o1VarArr;
        this.f327133c = z17;
        this.f327134d = bVar;
        this.f327135e = cVar;
        this.f327136f = sVar;
        this.f327137g = z18;
        this.f327138h = i18;
        this.f327139i = i19;
        this.f327140j = qVar;
        this.f327141k = i27;
        this.f327142l = j17;
        this.f327143m = obj;
        int i28 = 0;
        int i29 = 0;
        for (s1.o1 o1Var : o1VarArr) {
            boolean z19 = this.f327133c;
            i28 += z19 ? o1Var.f483584e : o1Var.f483583d;
            i29 = java.lang.Math.max(i29, !z19 ? o1Var.f483584e : o1Var.f483583d);
        }
        this.f327144n = i28;
        this.f327145o = i28 + this.f327141k;
        this.f327146p = i29;
    }

    public final e0.q0 a(int i17, int i18, int i19) {
        long a17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        boolean z17 = this.f327133c;
        int i27 = z17 ? i19 : i18;
        boolean z18 = this.f327137g;
        int i28 = z18 ? (i27 - i17) - this.f327144n : i17;
        s1.o1[] o1VarArr = this.f327132b;
        int P = z18 ? kz5.z.P(o1VarArr) : 0;
        while (true) {
            boolean z19 = true;
            if (!z18 ? P >= o1VarArr.length : P < 0) {
                z19 = false;
            }
            if (!z19) {
                int i29 = this.f327131a;
                java.lang.Object obj = this.f327143m;
                int i37 = this.f327144n;
                int i38 = this.f327145o;
                int i39 = this.f327138h;
                int i47 = this.f327139i;
                int i48 = -(!z18 ? i39 : i47);
                if (!z18) {
                    i39 = i47;
                }
                return new e0.q0(i17, i29, obj, i37, i38, i48, i27 + i39, this.f327133c, arrayList, this.f327140j, this.f327142l, null);
            }
            s1.o1 o1Var = o1VarArr[P];
            int size = z18 ? 0 : arrayList.size();
            if (z17) {
                z0.b bVar = this.f327134d;
                if (bVar == null) {
                    throw new java.lang.IllegalArgumentException("Required value was null.".toString());
                }
                a17 = p2.n.a(((z0.e) bVar).a(o1Var.f483583d, i18, this.f327136f), i28);
            } else {
                z0.c cVar = this.f327135e;
                if (cVar == null) {
                    throw new java.lang.IllegalArgumentException("Required value was null.".toString());
                }
                a17 = p2.n.a(i28, ((z0.f) cVar).a(o1Var.f483584e, i19));
            }
            i28 += z17 ? o1Var.f483584e : o1Var.f483583d;
            arrayList.add(size, new e0.p0(a17, o1Var, o1VarArr[P].g(), null));
            P = z18 ? P - 1 : P + 1;
        }
    }
}
