package p3325xe03a0797.p3326xc267989b.p3328x30012e;

/* loaded from: classes14.dex */
public class q2 extends v26.b implements p3325xe03a0797.p3326xc267989b.p3328x30012e.i2, p3325xe03a0797.p3326xc267989b.p3328x30012e.j, v26.h0 {

    /* renamed from: h, reason: collision with root package name */
    public final int f391905h;

    /* renamed from: i, reason: collision with root package name */
    public final int f391906i;

    /* renamed from: m, reason: collision with root package name */
    public final u26.u f391907m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Object[] f391908n;

    /* renamed from: o, reason: collision with root package name */
    public long f391909o;

    /* renamed from: p, reason: collision with root package name */
    public long f391910p;

    /* renamed from: q, reason: collision with root package name */
    public int f391911q;

    /* renamed from: r, reason: collision with root package name */
    public int f391912r;

    public q2(int i17, int i18, u26.u uVar) {
        this.f391905h = i17;
        this.f391906i = i18;
        this.f391907m = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0094 A[Catch: all -> 0x005d, TryCatch #2 {all -> 0x005d, blocks: (B:14:0x0039, B:18:0x008c, B:20:0x0094, B:28:0x00a7, B:31:0x00ae, B:32:0x00b2, B:34:0x00b3, B:40:0x0059), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2, types: [kotlinx.coroutines.flow.q2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r9v0, types: [kotlinx.coroutines.flow.k] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v6, types: [kotlinx.coroutines.flow.s2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00c1 -> B:15:0x003c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object l(p3325xe03a0797.p3326xc267989b.p3328x30012e.q2 r8, p3325xe03a0797.p3326xc267989b.p3328x30012e.k r9, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r10) {
        /*
            Method dump skipped, instructions count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p3325xe03a0797.p3326xc267989b.p3328x30012e.q2.l(kotlinx.coroutines.flow.q2, kotlinx.coroutines.flow.k, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.j
    public java.lang.Object a(p3325xe03a0797.p3326xc267989b.p3328x30012e.k kVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return l(this, kVar, interfaceC29045xdcb5ca57);
    }

    @Override // v26.h0
    public p3325xe03a0797.p3326xc267989b.p3328x30012e.j b(oz5.l lVar, int i17, u26.u uVar) {
        return ((i17 == 0 || i17 == -3) && uVar == u26.u.SUSPEND) ? this : new v26.o(this, lVar, i17, uVar);
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.i2
    public void d() {
        synchronized (this) {
            u(p() + this.f391911q, this.f391910p, p() + this.f391911q, p() + this.f391911q + this.f391912r);
        }
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.i2
    public boolean e(java.lang.Object obj) {
        int i17;
        boolean z17;
        p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57[] interfaceC29045xdcb5ca57Arr = v26.c.f514520a;
        synchronized (this) {
            if (r(obj)) {
                interfaceC29045xdcb5ca57Arr = o(interfaceC29045xdcb5ca57Arr);
                z17 = true;
            } else {
                z17 = false;
            }
        }
        for (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57 : interfaceC29045xdcb5ca57Arr) {
            if (interfaceC29045xdcb5ca57 != null) {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a));
            }
        }
        return z17;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.i2, p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57[] interfaceC29045xdcb5ca57Arr;
        p3325xe03a0797.p3326xc267989b.p3328x30012e.o2 o2Var;
        if (e(obj)) {
            return jz5.f0.f384359a;
        }
        p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(interfaceC29045xdcb5ca57), 1);
        rVar.k();
        p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57[] interfaceC29045xdcb5ca57Arr2 = v26.c.f514520a;
        synchronized (this) {
            if (r(obj)) {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                rVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a));
                interfaceC29045xdcb5ca57Arr = o(interfaceC29045xdcb5ca57Arr2);
                o2Var = null;
            } else {
                p3325xe03a0797.p3326xc267989b.p3328x30012e.o2 o2Var2 = new p3325xe03a0797.p3326xc267989b.p3328x30012e.o2(this, this.f391911q + this.f391912r + p(), obj, rVar);
                n(o2Var2);
                this.f391912r++;
                if (this.f391906i == 0) {
                    interfaceC29045xdcb5ca57Arr2 = o(interfaceC29045xdcb5ca57Arr2);
                }
                interfaceC29045xdcb5ca57Arr = interfaceC29045xdcb5ca57Arr2;
                o2Var = o2Var2;
            }
        }
        if (o2Var != null) {
            rVar.m(new p3325xe03a0797.p3326xc267989b.t1(o2Var));
        }
        for (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca572 : interfaceC29045xdcb5ca57Arr) {
            if (interfaceC29045xdcb5ca572 != null) {
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                interfaceC29045xdcb5ca572.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a));
            }
        }
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f440719d;
        if (j17 != aVar) {
            j17 = jz5.f0.f384359a;
        }
        return j17 == aVar ? j17 : jz5.f0.f384359a;
    }

    @Override // v26.b
    public v26.d f() {
        return new p3325xe03a0797.p3326xc267989b.p3328x30012e.s2();
    }

    @Override // v26.b
    public v26.d[] g(int i17) {
        return new p3325xe03a0797.p3326xc267989b.p3328x30012e.s2[i17];
    }

    public final java.lang.Object j(p3325xe03a0797.p3326xc267989b.p3328x30012e.s2 s2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(interfaceC29045xdcb5ca57), 1);
        rVar.k();
        synchronized (this) {
            if (s(s2Var) < 0) {
                s2Var.f391936b = rVar;
            } else {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                rVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a));
            }
        }
        java.lang.Object j17 = rVar.j();
        return j17 == pz5.a.f440719d ? j17 : jz5.f0.f384359a;
    }

    public final void k() {
        if (this.f391906i != 0 || this.f391912r > 1) {
            java.lang.Object[] objArr = this.f391908n;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(objArr);
            while (this.f391912r > 0) {
                long p17 = p();
                int i17 = this.f391911q;
                int i18 = this.f391912r;
                if (objArr[((int) ((p17 + (i17 + i18)) - 1)) & (objArr.length - 1)] != p3325xe03a0797.p3326xc267989b.p3328x30012e.r2.f391922a) {
                    return;
                }
                this.f391912r = i18 - 1;
                objArr[((int) (p() + this.f391911q + this.f391912r)) & (objArr.length - 1)] = null;
            }
        }
    }

    public final void m() {
        v26.d[] dVarArr;
        java.lang.Object[] objArr = this.f391908n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(objArr);
        objArr[((int) p()) & (objArr.length - 1)] = null;
        this.f391911q--;
        long p17 = p() + 1;
        if (this.f391909o < p17) {
            this.f391909o = p17;
        }
        if (this.f391910p < p17) {
            if (this.f514517e != 0 && (dVarArr = this.f514516d) != null) {
                for (v26.d dVar : dVarArr) {
                    if (dVar != null) {
                        p3325xe03a0797.p3326xc267989b.p3328x30012e.s2 s2Var = (p3325xe03a0797.p3326xc267989b.p3328x30012e.s2) dVar;
                        long j17 = s2Var.f391935a;
                        if (j17 >= 0 && j17 < p17) {
                            s2Var.f391935a = p17;
                        }
                    }
                }
            }
            this.f391910p = p17;
        }
    }

    public final void n(java.lang.Object obj) {
        int i17 = this.f391911q + this.f391912r;
        java.lang.Object[] objArr = this.f391908n;
        if (objArr == null) {
            objArr = q(null, 0, 2);
        } else if (i17 >= objArr.length) {
            objArr = q(objArr, i17, objArr.length * 2);
        }
        objArr[((int) (p() + i17)) & (objArr.length - 1)] = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object[], java.lang.Object] */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57[] o(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57[] interfaceC29045xdcb5ca57Arr) {
        v26.d[] dVarArr;
        p3325xe03a0797.p3326xc267989b.p3328x30012e.s2 s2Var;
        p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57;
        int length = interfaceC29045xdcb5ca57Arr.length;
        if (this.f514517e != 0 && (dVarArr = this.f514516d) != null) {
            int length2 = dVarArr.length;
            int i17 = 0;
            interfaceC29045xdcb5ca57Arr = interfaceC29045xdcb5ca57Arr;
            while (i17 < length2) {
                v26.d dVar = dVarArr[i17];
                if (dVar != null && (interfaceC29045xdcb5ca57 = (s2Var = (p3325xe03a0797.p3326xc267989b.p3328x30012e.s2) dVar).f391936b) != null && s(s2Var) >= 0) {
                    int length3 = interfaceC29045xdcb5ca57Arr.length;
                    interfaceC29045xdcb5ca57Arr = interfaceC29045xdcb5ca57Arr;
                    if (length >= length3) {
                        ?? copyOf = java.util.Arrays.copyOf(interfaceC29045xdcb5ca57Arr, java.lang.Math.max(2, interfaceC29045xdcb5ca57Arr.length * 2));
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(copyOf, "copyOf(this, newSize)");
                        interfaceC29045xdcb5ca57Arr = copyOf;
                    }
                    interfaceC29045xdcb5ca57Arr[length] = interfaceC29045xdcb5ca57;
                    s2Var.f391936b = null;
                    length++;
                }
                i17++;
                interfaceC29045xdcb5ca57Arr = interfaceC29045xdcb5ca57Arr;
            }
        }
        return interfaceC29045xdcb5ca57Arr;
    }

    public final long p() {
        return java.lang.Math.min(this.f391910p, this.f391909o);
    }

    public final java.lang.Object[] q(java.lang.Object[] objArr, int i17, int i18) {
        if (!(i18 > 0)) {
            throw new java.lang.IllegalStateException("Buffer size overflow".toString());
        }
        java.lang.Object[] objArr2 = new java.lang.Object[i18];
        this.f391908n = objArr2;
        if (objArr == null) {
            return objArr2;
        }
        long p17 = p();
        for (int i19 = 0; i19 < i17; i19++) {
            int i27 = (int) (i19 + p17);
            objArr2[i27 & (i18 - 1)] = objArr[(objArr.length - 1) & i27];
        }
        return objArr2;
    }

    public final boolean r(java.lang.Object obj) {
        int i17 = this.f514517e;
        int i18 = this.f391905h;
        if (i17 == 0) {
            if (i18 != 0) {
                n(obj);
                int i19 = this.f391911q + 1;
                this.f391911q = i19;
                if (i19 > i18) {
                    m();
                }
                this.f391910p = p() + this.f391911q;
            }
            return true;
        }
        int i27 = this.f391911q;
        int i28 = this.f391906i;
        if (i27 >= i28 && this.f391910p <= this.f391909o) {
            int ordinal = this.f391907m.ordinal();
            if (ordinal == 0) {
                return false;
            }
            if (ordinal == 2) {
                return true;
            }
        }
        n(obj);
        int i29 = this.f391911q + 1;
        this.f391911q = i29;
        if (i29 > i28) {
            m();
        }
        long p17 = p() + this.f391911q;
        long j17 = this.f391909o;
        if (((int) (p17 - j17)) > i18) {
            u(j17 + 1, this.f391910p, p() + this.f391911q, p() + this.f391911q + this.f391912r);
        }
        return true;
    }

    public final long s(p3325xe03a0797.p3326xc267989b.p3328x30012e.s2 s2Var) {
        long j17 = s2Var.f391935a;
        if (j17 < p() + this.f391911q) {
            return j17;
        }
        if (this.f391906i <= 0 && j17 <= p() && this.f391912r != 0) {
            return j17;
        }
        return -1L;
    }

    public final java.lang.Object t(p3325xe03a0797.p3326xc267989b.p3328x30012e.s2 s2Var) {
        java.lang.Object obj;
        p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57[] interfaceC29045xdcb5ca57Arr = v26.c.f514520a;
        synchronized (this) {
            long s17 = s(s2Var);
            if (s17 < 0) {
                obj = p3325xe03a0797.p3326xc267989b.p3328x30012e.r2.f391922a;
            } else {
                long j17 = s2Var.f391935a;
                java.lang.Object[] objArr = this.f391908n;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(objArr);
                java.lang.Object obj2 = objArr[((int) s17) & (objArr.length - 1)];
                if (obj2 instanceof p3325xe03a0797.p3326xc267989b.p3328x30012e.o2) {
                    obj2 = ((p3325xe03a0797.p3326xc267989b.p3328x30012e.o2) obj2).f391887f;
                }
                s2Var.f391935a = s17 + 1;
                java.lang.Object obj3 = obj2;
                interfaceC29045xdcb5ca57Arr = v(j17);
                obj = obj3;
            }
        }
        for (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57 : interfaceC29045xdcb5ca57Arr) {
            if (interfaceC29045xdcb5ca57 != null) {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a));
            }
        }
        return obj;
    }

    public final void u(long j17, long j18, long j19, long j27) {
        long min = java.lang.Math.min(j18, j17);
        for (long p17 = p(); p17 < min; p17++) {
            java.lang.Object[] objArr = this.f391908n;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(objArr);
            objArr[((int) p17) & (objArr.length - 1)] = null;
        }
        this.f391909o = j17;
        this.f391910p = j18;
        this.f391911q = (int) (j19 - min);
        this.f391912r = (int) (j27 - j19);
    }

    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57[] v(long j17) {
        long j18;
        long j19;
        long j27;
        v26.d[] dVarArr;
        long j28 = this.f391910p;
        p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57[] interfaceC29045xdcb5ca57Arr = v26.c.f514520a;
        if (j17 > j28) {
            return interfaceC29045xdcb5ca57Arr;
        }
        long p17 = p();
        long j29 = this.f391911q + p17;
        int i17 = this.f391906i;
        if (i17 == 0 && this.f391912r > 0) {
            j29++;
        }
        if (this.f514517e != 0 && (dVarArr = this.f514516d) != null) {
            for (v26.d dVar : dVarArr) {
                if (dVar != null) {
                    long j37 = ((p3325xe03a0797.p3326xc267989b.p3328x30012e.s2) dVar).f391935a;
                    if (j37 >= 0 && j37 < j29) {
                        j29 = j37;
                    }
                }
            }
        }
        if (j29 <= this.f391910p) {
            return interfaceC29045xdcb5ca57Arr;
        }
        long p18 = p() + this.f391911q;
        int min = this.f514517e > 0 ? java.lang.Math.min(this.f391912r, i17 - ((int) (p18 - j29))) : this.f391912r;
        long j38 = this.f391912r + p18;
        p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.l0 l0Var = p3325xe03a0797.p3326xc267989b.p3328x30012e.r2.f391922a;
        if (min > 0) {
            interfaceC29045xdcb5ca57Arr = new p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57[min];
            java.lang.Object[] objArr = this.f391908n;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(objArr);
            long j39 = p18;
            int i18 = 0;
            while (true) {
                if (p18 >= j38) {
                    j18 = j29;
                    j19 = j38;
                    break;
                }
                j18 = j29;
                int i19 = (int) p18;
                java.lang.Object obj = objArr[(objArr.length - 1) & i19];
                if (obj == l0Var) {
                    j19 = j38;
                    j27 = 1;
                } else {
                    if (obj == null) {
                        throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                    }
                    p3325xe03a0797.p3326xc267989b.p3328x30012e.o2 o2Var = (p3325xe03a0797.p3326xc267989b.p3328x30012e.o2) obj;
                    j19 = j38;
                    int i27 = i18 + 1;
                    interfaceC29045xdcb5ca57Arr[i18] = o2Var.f391888g;
                    objArr[i19 & (objArr.length - 1)] = l0Var;
                    objArr[((int) j39) & (objArr.length - 1)] = o2Var.f391887f;
                    j27 = 1;
                    j39++;
                    if (i27 >= min) {
                        break;
                    }
                    i18 = i27;
                }
                p18 += j27;
                j29 = j18;
                j38 = j19;
            }
            p18 = j39;
        } else {
            j18 = j29;
            j19 = j38;
        }
        p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57[] interfaceC29045xdcb5ca57Arr2 = interfaceC29045xdcb5ca57Arr;
        int i28 = (int) (p18 - p17);
        long j47 = this.f514517e == 0 ? p18 : j18;
        long max = java.lang.Math.max(this.f391909o, p18 - java.lang.Math.min(this.f391905h, i28));
        if (i17 == 0 && max < j19) {
            java.lang.Object[] objArr2 = this.f391908n;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(objArr2);
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(objArr2[((int) max) & (objArr2.length - 1)], l0Var)) {
                p18++;
                max++;
            }
        }
        u(max, j47, p18, j19);
        k();
        return (interfaceC29045xdcb5ca57Arr2.length == 0) ^ true ? o(interfaceC29045xdcb5ca57Arr2) : interfaceC29045xdcb5ca57Arr2;
    }
}
