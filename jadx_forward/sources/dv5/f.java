package dv5;

/* loaded from: classes16.dex */
public final class f extends dv5.e {

    /* renamed from: b, reason: collision with root package name */
    public final dv5.h f325574b;

    /* renamed from: c, reason: collision with root package name */
    public final dv5.c f325575c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f325576d;

    /* renamed from: e, reason: collision with root package name */
    public int f325577e;

    /* renamed from: f, reason: collision with root package name */
    public int f325578f;

    /* renamed from: g, reason: collision with root package name */
    public int f325579g;

    /* renamed from: h, reason: collision with root package name */
    public long f325580h;

    /* renamed from: i, reason: collision with root package name */
    public int f325581i;

    /* renamed from: j, reason: collision with root package name */
    public int f325582j;

    /* renamed from: k, reason: collision with root package name */
    public int f325583k;

    /* renamed from: l, reason: collision with root package name */
    public int f325584l;

    /* renamed from: m, reason: collision with root package name */
    public int f325585m;

    /* renamed from: n, reason: collision with root package name */
    public int f325586n;

    /* renamed from: o, reason: collision with root package name */
    public int f325587o;

    /* renamed from: p, reason: collision with root package name */
    public int f325588p;

    /* renamed from: q, reason: collision with root package name */
    public int f325589q;

    /* renamed from: r, reason: collision with root package name */
    public int[] f325590r;

    /* renamed from: s, reason: collision with root package name */
    public int[] f325591s;

    /* renamed from: t, reason: collision with root package name */
    public int f325592t;

    /* renamed from: u, reason: collision with root package name */
    public int f325593u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.Object f325594v;

    /* renamed from: w, reason: collision with root package name */
    public int f325595w;

    public f(dv5.h hVar, dv5.c cVar) {
        super(null);
        this.f325577e = 0;
        this.f325578f = 0;
        this.f325579g = 0;
        this.f325580h = 0L;
        this.f325581i = 0;
        this.f325582j = 0;
        this.f325583k = 0;
        this.f325584l = 0;
        this.f325585m = 0;
        this.f325586n = 0;
        this.f325587o = 0;
        this.f325588p = 0;
        this.f325589q = 0;
        this.f325590r = null;
        this.f325591s = null;
        this.f325592t = 0;
        this.f325593u = 0;
        this.f325594v = null;
        this.f325595w = 0;
        this.f325574b = hVar;
        this.f325575c = cVar;
        this.f325576d = cVar != null;
    }

    @Override // dv5.e
    public void a(int i17, int i18, java.lang.Object obj, int i19, int i27) {
        this.f325577e = i18;
        this.f325594v = obj;
        this.f325595w = i19;
        this.f325593u = i27;
        this.f325581i = 0;
        this.f325582j = 0;
        this.f325583k = 0;
        this.f325584l = 0;
        this.f325585m = 0;
        this.f325586n = 0;
        this.f325587o = 0;
        this.f325588p = 0;
        dv5.b.c(this.f325574b, this);
    }

    @Override // dv5.e
    public void b(int i17, int i18, int i19, int i27, int i28, long j17, int i29, int i37, int i38, int i39, int i47) {
        this.f325577e = i18;
        this.f325578f = i19;
        this.f325579g = i28;
        this.f325580h = j17;
        this.f325581i = 5;
        this.f325582j = i29;
        this.f325583k = i37;
        this.f325584l = i38;
        this.f325585m = i39;
        this.f325586n = i47;
        this.f325587o = 0;
        this.f325588p = 0;
        dv5.b.c(this.f325574b, this);
    }

    @Override // dv5.e
    public void c(int i17, int i18, int i19, int i27, int i28, long j17, int i29, int i37, int i38, int i39) {
        this.f325577e = i18;
        this.f325578f = i19;
        this.f325579g = i28;
        this.f325580h = j17;
        this.f325581i = 4;
        this.f325582j = i29;
        this.f325583k = i37;
        this.f325584l = i38;
        this.f325585m = i39;
        this.f325586n = 0;
        this.f325587o = 0;
        this.f325588p = 0;
        dv5.b.c(this.f325574b, this);
    }

    @Override // dv5.e
    public void d(int i17, int i18, int i19, int i27, int i28, int[] iArr) {
        this.f325577e = i18;
        this.f325578f = i19;
        this.f325589q = i28;
        this.f325581i = iArr.length;
        this.f325582j = 0;
        this.f325583k = 0;
        this.f325584l = iArr.length > 0 ? iArr[0] : 0;
        this.f325585m = iArr.length > 1 ? iArr[1] : 0;
        this.f325586n = iArr.length > 2 ? iArr[2] : 0;
        this.f325587o = iArr.length > 3 ? iArr[3] : 0;
        this.f325588p = iArr.length > 4 ? iArr[4] : 0;
        dv5.b.c(this.f325574b, this);
    }

    @Override // dv5.e
    public void e(int i17, int i18, int i19, int i27, int i28, int i29, int i37) {
        this.f325577e = i18;
        this.f325578f = i19;
        this.f325581i = i29;
        this.f325582j = 0;
        this.f325583k = 0;
        this.f325584l = i28;
        this.f325585m = 0;
        this.f325586n = 0;
        this.f325587o = 0;
        this.f325588p = 0;
        this.f325589q = i37;
        dv5.b.c(this.f325574b, this);
    }

    @Override // dv5.e
    public void f(int i17, int i18, int i19, int i27, int i28, long j17, int i29) {
        boolean z17 = this.f325576d;
        if (z17) {
            i28 = this.f325575c.m(i28);
        }
        if (i18 == 26) {
            if (z17) {
                if (i19 > 65535) {
                    i18 = 27;
                }
            } else if (i19 > 65535) {
                throw new av5.z("string index out of bound: " + ev5.a.d(i19) + ", perhaps you need to enable force jumbo mode.");
            }
        }
        this.f325577e = i18;
        this.f325578f = i19;
        this.f325579g = i28;
        this.f325580h = j17;
        this.f325581i = 1;
        this.f325582j = i29;
        this.f325583k = 0;
        this.f325584l = 0;
        this.f325585m = 0;
        this.f325586n = 0;
        this.f325587o = 0;
        this.f325588p = 0;
        dv5.b.c(this.f325574b, this);
    }

    @Override // dv5.e
    public void g(int i17, int i18, int i19, int[] iArr) {
        this.f325577e = i18;
        this.f325592t = i19;
        if (this.f325576d) {
            this.f325591s = new int[iArr.length];
            for (int i27 = 0; i27 < iArr.length; i27++) {
                this.f325591s[i27] = this.f325575c.m(iArr[i27]);
            }
        } else {
            this.f325591s = iArr;
        }
        this.f325581i = 0;
        this.f325582j = 0;
        this.f325583k = 0;
        this.f325584l = 0;
        this.f325585m = 0;
        this.f325586n = 0;
        this.f325587o = 0;
        this.f325588p = 0;
        dv5.b.c(this.f325574b, this);
    }

    @Override // dv5.e
    public void h(int i17, int i18, int i19, int i27, int i28, long j17, int i29, int i37) {
        this.f325577e = i18;
        this.f325578f = i19;
        this.f325579g = i28;
        this.f325580h = j17;
        this.f325581i = i37;
        this.f325582j = i29;
        this.f325583k = 0;
        this.f325584l = 0;
        this.f325585m = 0;
        this.f325586n = 0;
        this.f325587o = 0;
        this.f325588p = 0;
        dv5.b.c(this.f325574b, this);
    }

    @Override // dv5.e
    public void i(int i17, int i18, int[] iArr, int[] iArr2) {
        this.f325577e = i18;
        this.f325590r = iArr;
        if (this.f325576d) {
            this.f325591s = new int[iArr2.length];
            for (int i19 = 0; i19 < iArr2.length; i19++) {
                this.f325591s[i19] = this.f325575c.m(iArr2[i19]);
            }
        } else {
            this.f325591s = iArr2;
        }
        this.f325581i = 0;
        this.f325582j = 0;
        this.f325583k = 0;
        this.f325584l = 0;
        this.f325585m = 0;
        this.f325586n = 0;
        this.f325587o = 0;
        this.f325588p = 0;
        dv5.b.c(this.f325574b, this);
    }

    @Override // dv5.e
    public void j(int i17, int i18, int i19, int i27, int i28, long j17, int i29, int i37, int i38) {
        this.f325577e = i18;
        this.f325578f = i19;
        this.f325579g = i28;
        this.f325580h = j17;
        this.f325581i = 3;
        this.f325582j = i29;
        this.f325583k = i37;
        this.f325584l = i38;
        this.f325585m = 0;
        this.f325586n = 0;
        this.f325587o = 0;
        this.f325588p = 0;
        dv5.b.c(this.f325574b, this);
    }

    @Override // dv5.e
    public void k(int i17, int i18, int i19, int i27, int i28, long j17, int i29, int i37) {
        if (this.f325576d) {
            i28 = this.f325575c.m(i28);
        }
        this.f325577e = i18;
        this.f325578f = i19;
        this.f325579g = i28;
        this.f325580h = j17;
        this.f325581i = 2;
        this.f325582j = i29;
        this.f325583k = i37;
        this.f325584l = 0;
        this.f325585m = 0;
        this.f325586n = 0;
        this.f325587o = 0;
        this.f325588p = 0;
        dv5.b.c(this.f325574b, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001c, code lost:
    
        if (r4 != ((short) r4)) goto L10;
     */
    @Override // dv5.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l(int r4, int r5, int r6, int r7, int r8, long r9) {
        /*
            r3 = this;
            boolean r4 = r3.f325576d
            dv5.h r7 = r3.f325574b
            if (r4 == 0) goto L2b
            dv5.c r4 = r3.f325575c
            int r8 = r4.m(r8)
            r4 = 40
            r0 = 42
            r1 = 41
            if (r5 == r4) goto L20
            if (r5 == r1) goto L17
            goto L2b
        L17:
            int r4 = r7.f325569b
            int r4 = r8 - r4
            short r1 = (short) r4
            if (r4 == r1) goto L2b
        L1e:
            r5 = r0
            goto L2b
        L20:
            int r4 = r7.f325569b
            int r4 = r8 - r4
            byte r2 = (byte) r4
            if (r4 == r2) goto L2b
            short r5 = (short) r4
            if (r4 != r5) goto L1e
            r5 = r1
        L2b:
            r3.f325577e = r5
            r3.f325578f = r6
            r3.f325579g = r8
            r3.f325580h = r9
            r4 = 0
            r3.f325581i = r4
            r3.f325582j = r4
            r3.f325583k = r4
            r3.f325584l = r4
            r3.f325585m = r4
            r3.f325586n = r4
            r3.f325587o = r4
            r3.f325588p = r4
            dv5.b.c(r7, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dv5.f.l(int, int, int, int, int, long):void");
    }
}
