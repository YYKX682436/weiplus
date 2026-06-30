package m8;

/* loaded from: classes15.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final d9.x f406139a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f406140b;

    /* renamed from: c, reason: collision with root package name */
    public final int f406141c;

    /* renamed from: d, reason: collision with root package name */
    public final d9.g0[] f406142d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f406143e;

    /* renamed from: f, reason: collision with root package name */
    public final long f406144f;

    /* renamed from: g, reason: collision with root package name */
    public m8.v f406145g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f406146h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f406147i;

    /* renamed from: j, reason: collision with root package name */
    public m8.l f406148j;

    /* renamed from: k, reason: collision with root package name */
    public q9.p f406149k;

    /* renamed from: l, reason: collision with root package name */
    public final m8.b0[] f406150l;

    /* renamed from: m, reason: collision with root package name */
    public final m8.c0[] f406151m;

    /* renamed from: n, reason: collision with root package name */
    public final q9.o f406152n;

    /* renamed from: o, reason: collision with root package name */
    public final m8.u f406153o;

    /* renamed from: p, reason: collision with root package name */
    public final d9.a0 f406154p;

    /* renamed from: q, reason: collision with root package name */
    public q9.p f406155q;

    public l(m8.b0[] b0VarArr, m8.c0[] c0VarArr, long j17, q9.o oVar, m8.u uVar, d9.a0 a0Var, java.lang.Object obj, int i17, m8.v vVar) {
        this.f406150l = b0VarArr;
        this.f406151m = c0VarArr;
        this.f406144f = j17;
        this.f406152n = oVar;
        this.f406153o = uVar;
        this.f406154p = a0Var;
        obj.getClass();
        this.f406140b = obj;
        this.f406141c = i17;
        this.f406145g = vVar;
        this.f406142d = new d9.g0[b0VarArr.length];
        this.f406143e = new boolean[b0VarArr.length];
        d9.x d17 = a0Var.d(vVar.f406200a, ((m8.c) uVar).f406078a);
        long j18 = vVar.f406202c;
        if (j18 != Long.MIN_VALUE) {
            d9.k kVar = new d9.k(d17, true);
            kVar.f308899f = 0L;
            kVar.f308900g = j18;
            d17 = kVar;
        }
        this.f406139a = d17;
    }

    public long a() {
        int i17 = this.f406141c;
        long j17 = this.f406144f;
        return i17 == 0 ? j17 : j17 - this.f406145g.f406201b;
    }

    public void b() {
        try {
            long j17 = this.f406145g.f406202c;
            d9.x xVar = this.f406139a;
            d9.a0 a0Var = this.f406154p;
            if (j17 != Long.MIN_VALUE) {
                a0Var.b(((d9.k) xVar).f308897d);
            } else {
                a0Var.b(xVar);
            }
        } catch (java.lang.RuntimeException unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x068e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:439:0x0690  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x022c A[LOOP:8: B:57:0x011c->B:66:0x022c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0227 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean c() {
        /*
            Method dump skipped, instructions count: 1684
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m8.l.c():boolean");
    }

    public long d(long j17, boolean z17, boolean[] zArr) {
        int i17;
        q9.n nVar = this.f406149k.f442404b;
        int i18 = 0;
        while (true) {
            boolean z18 = true;
            if (i18 >= nVar.f442400a) {
                break;
            }
            if (z17 || !this.f406149k.a(this.f406155q, i18)) {
                z18 = false;
            }
            this.f406143e[i18] = z18;
            i18++;
        }
        d9.x xVar = this.f406139a;
        q9.m[] mVarArr = nVar.f442401b;
        long i19 = xVar.i((q9.m[]) mVarArr.clone(), this.f406143e, this.f406142d, zArr, j17);
        this.f406155q = this.f406149k;
        this.f406147i = false;
        int i27 = 0;
        while (true) {
            d9.g0[] g0VarArr = this.f406142d;
            if (i27 >= g0VarArr.length) {
                break;
            }
            if (g0VarArr[i27] != null) {
                t9.a.d(mVarArr[i27] != null);
                this.f406147i = true;
            } else {
                t9.a.d(mVarArr[i27] == null);
            }
            i27++;
        }
        d9.l0 l0Var = this.f406149k.f442403a;
        m8.c cVar = (m8.c) this.f406153o;
        cVar.f406083f = 0;
        int i28 = 0;
        while (true) {
            m8.b0[] b0VarArr = this.f406150l;
            if (i28 >= b0VarArr.length) {
                r9.o oVar = cVar.f406078a;
                int i29 = cVar.f406083f;
                synchronized (oVar) {
                    boolean z19 = i29 < oVar.f474926d;
                    oVar.f474926d = i29;
                    if (z19) {
                        oVar.b();
                    }
                }
                return i19;
            }
            if (mVarArr[i28] != null) {
                int i37 = cVar.f406083f;
                int i38 = ((m8.a) b0VarArr[i28]).f406068d;
                int i39 = t9.d0.f498031a;
                if (i38 == 0) {
                    i17 = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52070xe96767bb;
                } else if (i38 == 1) {
                    i17 = 3538944;
                } else if (i38 == 2) {
                    i17 = 13107200;
                } else {
                    if (i38 != 3 && i38 != 4) {
                        throw new java.lang.IllegalStateException();
                    }
                    i17 = 131072;
                }
                cVar.f406083f = i37 + i17;
            }
            i28++;
        }
    }
}
