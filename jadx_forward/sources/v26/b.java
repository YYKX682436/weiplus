package v26;

/* loaded from: classes14.dex */
public abstract class b {

    /* renamed from: d, reason: collision with root package name */
    public v26.d[] f514516d;

    /* renamed from: e, reason: collision with root package name */
    public int f514517e;

    /* renamed from: f, reason: collision with root package name */
    public int f514518f;

    /* renamed from: g, reason: collision with root package name */
    public v26.s0 f514519g;

    public final v26.d c() {
        v26.d dVar;
        v26.s0 s0Var;
        synchronized (this) {
            v26.d[] dVarArr = this.f514516d;
            if (dVarArr == null) {
                dVarArr = g(2);
                this.f514516d = dVarArr;
            } else if (this.f514517e >= dVarArr.length) {
                java.lang.Object[] copyOf = java.util.Arrays.copyOf(dVarArr, dVarArr.length * 2);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(copyOf, "copyOf(this, newSize)");
                this.f514516d = (v26.d[]) copyOf;
                dVarArr = (v26.d[]) copyOf;
            }
            int i17 = this.f514518f;
            do {
                dVar = dVarArr[i17];
                if (dVar == null) {
                    dVar = f();
                    dVarArr[i17] = dVar;
                }
                i17++;
                if (i17 >= dVarArr.length) {
                    i17 = 0;
                }
            } while (!dVar.a(this));
            this.f514518f = i17;
            this.f514517e++;
            s0Var = this.f514519g;
        }
        if (s0Var != null) {
            synchronized (s0Var) {
                java.lang.Object[] objArr = s0Var.f391908n;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(objArr);
                s0Var.e(java.lang.Integer.valueOf(((java.lang.Number) objArr[((int) ((s0Var.f391909o + ((int) ((s0Var.p() + s0Var.f391911q) - s0Var.f391909o))) - 1)) & (objArr.length - 1)]).intValue() + 1));
            }
        }
        return dVar;
    }

    public abstract v26.d f();

    public abstract v26.d[] g(int i17);

    public final void h(v26.d dVar) {
        v26.s0 s0Var;
        int i17;
        p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57[] b17;
        synchronized (this) {
            int i18 = this.f514517e - 1;
            this.f514517e = i18;
            s0Var = this.f514519g;
            if (i18 == 0) {
                this.f514518f = 0;
            }
            b17 = dVar.b(this);
        }
        for (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57 : b17) {
            if (interfaceC29045xdcb5ca57 != null) {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a));
            }
        }
        if (s0Var != null) {
            synchronized (s0Var) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(s0Var.f391908n);
                s0Var.e(java.lang.Integer.valueOf(((java.lang.Number) r9[((int) ((s0Var.f391909o + ((int) ((s0Var.p() + s0Var.f391911q) - s0Var.f391909o))) - 1)) & (r9.length - 1)]).intValue() - 1));
            }
        }
    }

    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.f3 i() {
        v26.s0 s0Var;
        synchronized (this) {
            s0Var = this.f514519g;
            if (s0Var == null) {
                s0Var = new v26.s0(this.f514517e);
                this.f514519g = s0Var;
            }
        }
        return s0Var;
    }
}
