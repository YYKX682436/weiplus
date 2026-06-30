package fc;

/* loaded from: classes16.dex */
public class q extends fc.b implements fc.p {

    /* renamed from: i, reason: collision with root package name */
    public transient java.lang.Object[] f342456i;

    /* renamed from: m, reason: collision with root package name */
    public transient long[] f342457m;

    /* renamed from: n, reason: collision with root package name */
    public final fc.p f342458n = this;

    public static boolean r(java.lang.Object[] objArr, int i17) {
        java.lang.Object obj = objArr[i17];
        return (obj == null || obj == fc.s.f342459n) ? false : true;
    }

    @Override // fc.b, java.util.Map
    public void clear() {
        super.clear();
        long[] jArr = this.f342457m;
        java.lang.Object[] objArr = this.f342456i;
        int length = jArr.length;
        while (true) {
            int i17 = length - 1;
            if (length <= 0) {
                return;
            }
            jArr[i17] = 0;
            objArr[i17] = null;
            length = i17;
        }
    }

    @Override // fc.b
    /* renamed from: clone */
    public /* bridge */ /* synthetic */ java.lang.Object mo129315x5a5dd5d() {
        fc.q qVar = (fc.q) super.mo129315x5a5dd5d();
        qVar.f342456i = (java.lang.Object[]) this.f342456i.clone();
        return qVar;
    }

    @Override // fc.b
    public int d() {
        return this.f342456i.length;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0040, code lost:
    
        if ((r3 == r6 || (r3 != null && r3.equals(r6))) != false) goto L29;
     */
    /* renamed from: equals */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m129323xb2c87fbf(java.lang.Object r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof fc.q
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            fc.q r10 = (fc.q) r10
            int r0 = r10.f342433d
            int r2 = r9.f342433d
            if (r0 == r2) goto Lf
            return r1
        Lf:
            long[] r0 = r9.f342457m
            java.lang.Object[] r2 = r9.f342456i
            int r3 = r0.length
        L14:
            int r4 = r3 + (-1)
            r5 = 1
            if (r3 <= 0) goto L49
            boolean r3 = r(r2, r4)
            if (r3 == 0) goto L47
            r6 = r0[r4]
            r3 = r2[r4]
            fc.r r8 = fc.s.f342460o
            if (r3 != r8) goto L28
            r3 = 0
        L28:
            int r8 = r10.o(r6)
            if (r8 < 0) goto L43
            java.lang.Object r6 = r10.n(r6)
            if (r3 == r6) goto L3f
            if (r3 == 0) goto L3d
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L3d
            goto L3f
        L3d:
            r3 = r1
            goto L40
        L3f:
            r3 = r5
        L40:
            if (r3 == 0) goto L43
            goto L44
        L43:
            r5 = r1
        L44:
            if (r5 != 0) goto L47
            goto L4a
        L47:
            r3 = r4
            goto L14
        L49:
            r1 = r5
        L4a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: fc.q.m129323xb2c87fbf(java.lang.Object):boolean");
    }

    /* renamed from: hashCode */
    public int m129324x8cdac1b() {
        long[] jArr = this.f342457m;
        java.lang.Object[] objArr = this.f342456i;
        int length = jArr.length;
        int i17 = 0;
        while (true) {
            int i18 = length - 1;
            if (length <= 0) {
                return i17;
            }
            if (r(objArr, i18)) {
                long j17 = jArr[i18];
                java.lang.Object obj = objArr[i18];
                if (obj == fc.s.f342460o) {
                    obj = null;
                }
                ((fc.q) this.f342458n).getClass();
                i17 += (obj == null ? 0 : obj.hashCode()) ^ ((int) (j17 ^ (j17 >> 32)));
            }
            length = i18;
        }
    }

    @Override // fc.b
    public void k(int i17) {
        long[] jArr = this.f342457m;
        int length = jArr.length;
        java.lang.Object[] objArr = this.f342456i;
        this.f342457m = new long[i17];
        this.f342456i = new java.lang.Object[i17];
        while (true) {
            int i18 = length - 1;
            if (length <= 0) {
                return;
            }
            if (r(objArr, i18)) {
                long j17 = jArr[i18];
                int p17 = p(j17);
                this.f342457m[p17] = j17;
                this.f342456i[p17] = objArr[i18];
            }
            length = i18;
        }
    }

    @Override // fc.b
    public void l(int i17) {
        this.f342456i[i17] = fc.s.f342459n;
        this.f342433d--;
        this.f342435f++;
        e();
    }

    @Override // fc.b
    public int m(int i17) {
        int a17 = fc.a.a(i17);
        g(a17);
        this.f342456i = new java.lang.Object[a17];
        this.f342457m = new long[a17];
        return a17;
    }

    public final java.lang.Object n(long j17) {
        java.lang.Object obj;
        int o17 = o(j17);
        if (o17 >= 0 && (obj = this.f342456i[o17]) != fc.s.f342460o) {
            return obj;
        }
        return null;
    }

    public final int o(long j17) {
        long[] jArr = this.f342457m;
        java.lang.Object[] objArr = this.f342456i;
        int length = jArr.length;
        ((fc.q) this.f342458n).getClass();
        int i17 = ((int) ((j17 >> 32) ^ j17)) & Integer.MAX_VALUE;
        int i18 = i17 % length;
        java.lang.Object obj = objArr[i18];
        if (!(obj == null)) {
            if ((obj == fc.s.f342459n) || jArr[i18] != j17) {
                int i19 = (i17 % (length - 2)) + 1;
                while (true) {
                    i18 -= i19;
                    if (i18 < 0) {
                        i18 += length;
                    }
                    java.lang.Object obj2 = objArr[i18];
                    if (!(obj2 == null)) {
                        if (!(obj2 == fc.s.f342459n) && jArr[i18] == j17) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
        }
        if (objArr[i18] == null) {
            return -1;
        }
        return i18;
    }

    public final int p(long j17) {
        java.lang.Object[] objArr = this.f342456i;
        long[] jArr = this.f342457m;
        int length = jArr.length;
        ((fc.q) this.f342458n).getClass();
        int i17 = ((int) ((j17 >> 32) ^ j17)) & Integer.MAX_VALUE;
        int i18 = i17 % length;
        if (objArr[i18] == null) {
            return i18;
        }
        if (!r(objArr, i18) || jArr[i18] != j17) {
            int i19 = (i17 % (length - 2)) + 1;
            int i27 = objArr[i18] == fc.s.f342459n ? i18 : -1;
            do {
                i18 -= i19;
                if (i18 < 0) {
                    i18 += length;
                }
                if (i27 == -1) {
                    if (objArr[i18] == fc.s.f342459n) {
                        i27 = i18;
                    }
                }
                if (!r(objArr, i18)) {
                    break;
                }
            } while (jArr[i18] != j17);
            if (objArr[i18] == fc.s.f342459n) {
                while (true) {
                    java.lang.Object obj = objArr[i18];
                    if (!(obj == null)) {
                        if (!(obj == fc.s.f342459n) && jArr[i18] == j17) {
                            break;
                        }
                        i18 -= i19;
                        if (i18 < 0) {
                            i18 += length;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (!r(objArr, i18)) {
                return i27 == -1 ? i18 : i27;
            }
        }
        return (-i18) - 1;
    }

    public final java.lang.Object s(long j17, java.lang.Object obj) {
        boolean z17;
        java.lang.Object obj2;
        int p17 = p(j17);
        if (p17 < 0) {
            p17 = (-p17) - 1;
            java.lang.Object obj3 = this.f342456i[p17];
            obj2 = obj3 != fc.s.f342460o ? obj3 : null;
            z17 = false;
        } else {
            z17 = this.f342456i[p17] == null;
            r1 = true;
            obj2 = null;
        }
        this.f342457m[p17] = j17;
        java.lang.Object[] objArr = this.f342456i;
        if (obj == null) {
            obj = fc.s.f342460o;
        }
        objArr[p17] = obj;
        if (r1) {
            j(z17);
        }
        return obj2;
    }
}
