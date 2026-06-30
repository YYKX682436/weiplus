package fc;

/* loaded from: classes16.dex */
public class n extends fc.b implements fc.m {

    /* renamed from: i, reason: collision with root package name */
    public transient java.lang.Object[] f342450i;

    /* renamed from: m, reason: collision with root package name */
    public transient int[] f342451m;

    /* renamed from: n, reason: collision with root package name */
    public final fc.m f342452n = this;

    public static boolean p(java.lang.Object[] objArr, int i17) {
        java.lang.Object obj = objArr[i17];
        return (obj == null || obj == fc.s.f342459n) ? false : true;
    }

    @Override // fc.b
    /* renamed from: clone */
    public /* bridge */ /* synthetic */ java.lang.Object mo129315x5a5dd5d() {
        fc.n nVar = (fc.n) super.mo129315x5a5dd5d();
        nVar.f342450i = (java.lang.Object[]) this.f342450i.clone();
        return nVar;
    }

    @Override // fc.b
    public int d() {
        return this.f342450i.length;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0040, code lost:
    
        if ((r6 == r3 || (r6 != null && r6.equals(r3))) != false) goto L29;
     */
    /* renamed from: equals */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m129319xb2c87fbf(java.lang.Object r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof fc.n
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            fc.n r9 = (fc.n) r9
            int r0 = r9.f342433d
            int r2 = r8.f342433d
            if (r0 == r2) goto Lf
            return r1
        Lf:
            int[] r0 = r8.f342451m
            java.lang.Object[] r2 = r8.f342450i
            int r3 = r0.length
        L14:
            int r4 = r3 + (-1)
            r5 = 1
            if (r3 <= 0) goto L49
            boolean r3 = p(r2, r4)
            if (r3 == 0) goto L47
            r3 = r0[r4]
            r6 = r2[r4]
            fc.r r7 = fc.s.f342460o
            if (r6 != r7) goto L28
            r6 = 0
        L28:
            int r7 = r9.n(r3)
            if (r7 < 0) goto L43
            java.lang.Object r3 = r9.get(r3)
            if (r6 == r3) goto L3f
            if (r6 == 0) goto L3d
            boolean r3 = r6.equals(r3)
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
        throw new UnsupportedOperationException("Method not decompiled: fc.n.m129319xb2c87fbf(java.lang.Object):boolean");
    }

    public final java.lang.Object get(int i17) {
        java.lang.Object obj;
        int n17 = n(i17);
        if (n17 >= 0 && (obj = this.f342450i[n17]) != fc.s.f342460o) {
            return obj;
        }
        return null;
    }

    /* renamed from: hashCode */
    public int m129320x8cdac1b() {
        int[] iArr = this.f342451m;
        java.lang.Object[] objArr = this.f342450i;
        int length = iArr.length;
        int i17 = 0;
        while (true) {
            int i18 = length - 1;
            if (length <= 0) {
                return i17;
            }
            if (p(objArr, i18)) {
                int i19 = iArr[i18];
                java.lang.Object obj = objArr[i18];
                if (obj == fc.s.f342460o) {
                    obj = null;
                }
                ((fc.n) this.f342452n).getClass();
                i17 += i19 ^ (obj == null ? 0 : obj.hashCode());
            }
            length = i18;
        }
    }

    @Override // fc.b
    public void k(int i17) {
        int[] iArr = this.f342451m;
        int length = iArr.length;
        java.lang.Object[] objArr = this.f342450i;
        this.f342451m = new int[i17];
        this.f342450i = new java.lang.Object[i17];
        while (true) {
            int i18 = length - 1;
            if (length <= 0) {
                return;
            }
            if (p(objArr, i18)) {
                int i19 = iArr[i18];
                int o17 = o(i19);
                this.f342451m[o17] = i19;
                this.f342450i[o17] = objArr[i18];
            }
            length = i18;
        }
    }

    @Override // fc.b
    public void l(int i17) {
        this.f342450i[i17] = fc.s.f342459n;
        this.f342433d--;
        this.f342435f++;
        e();
    }

    @Override // fc.b
    public int m(int i17) {
        int a17 = fc.a.a(i17);
        g(a17);
        this.f342450i = new java.lang.Object[a17];
        this.f342451m = new int[a17];
        return a17;
    }

    public final int n(int i17) {
        int[] iArr = this.f342451m;
        java.lang.Object[] objArr = this.f342450i;
        int length = iArr.length;
        ((fc.n) this.f342452n).getClass();
        int i18 = Integer.MAX_VALUE & i17;
        int i19 = i18 % length;
        java.lang.Object obj = objArr[i19];
        if (!(obj == null)) {
            if ((obj == fc.s.f342459n) || iArr[i19] != i17) {
                int i27 = (i18 % (length - 2)) + 1;
                while (true) {
                    i19 -= i27;
                    if (i19 < 0) {
                        i19 += length;
                    }
                    java.lang.Object obj2 = objArr[i19];
                    if (!(obj2 == null)) {
                        if (!(obj2 == fc.s.f342459n) && iArr[i19] == i17) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
        }
        if (objArr[i19] == null) {
            return -1;
        }
        return i19;
    }

    public final int o(int i17) {
        java.lang.Object[] objArr = this.f342450i;
        int[] iArr = this.f342451m;
        int length = iArr.length;
        ((fc.n) this.f342452n).getClass();
        int i18 = Integer.MAX_VALUE & i17;
        int i19 = i18 % length;
        if (objArr[i19] == null) {
            return i19;
        }
        if (!p(objArr, i19) || iArr[i19] != i17) {
            int i27 = (i18 % (length - 2)) + 1;
            int i28 = objArr[i19] == fc.s.f342459n ? i19 : -1;
            do {
                i19 -= i27;
                if (i19 < 0) {
                    i19 += length;
                }
                if (i28 == -1) {
                    if (objArr[i19] == fc.s.f342459n) {
                        i28 = i19;
                    }
                }
                if (!p(objArr, i19)) {
                    break;
                }
            } while (iArr[i19] != i17);
            if (objArr[i19] == fc.s.f342459n) {
                while (true) {
                    java.lang.Object obj = objArr[i19];
                    if (!(obj == null)) {
                        if (!(obj == fc.s.f342459n) && iArr[i19] == i17) {
                            break;
                        }
                        i19 -= i27;
                        if (i19 < 0) {
                            i19 += length;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (!p(objArr, i19)) {
                return i28 == -1 ? i19 : i28;
            }
        }
        return (-i19) - 1;
    }

    public final java.lang.Object r(int i17, java.lang.Object obj) {
        boolean z17;
        java.lang.Object obj2;
        int o17 = o(i17);
        if (o17 < 0) {
            o17 = (-o17) - 1;
            java.lang.Object obj3 = this.f342450i[o17];
            obj2 = obj3 != fc.s.f342460o ? obj3 : null;
            z17 = false;
        } else {
            z17 = this.f342450i[o17] == null;
            r1 = true;
            obj2 = null;
        }
        this.f342451m[o17] = i17;
        java.lang.Object[] objArr = this.f342450i;
        if (obj == null) {
            obj = fc.s.f342460o;
        }
        objArr[o17] = obj;
        if (r1) {
            j(z17);
        }
        return obj2;
    }
}
