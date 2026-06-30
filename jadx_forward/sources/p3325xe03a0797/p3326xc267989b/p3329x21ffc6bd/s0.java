package p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd;

/* loaded from: classes14.dex */
public abstract class s0 {

    /* renamed from: _size */
    private volatile /* synthetic */ int f72719x57098e0 = 0;

    /* renamed from: a, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t0[] f392057a;

    public final void a(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t0 t0Var) {
        p3325xe03a0797.p3326xc267989b.z1 z1Var = (p3325xe03a0797.p3326xc267989b.z1) t0Var;
        z1Var.j(this);
        p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t0[] t0VarArr = this.f392057a;
        if (t0VarArr == null) {
            t0VarArr = new p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t0[4];
            this.f392057a = t0VarArr;
        } else if (this.f72719x57098e0 >= t0VarArr.length) {
            java.lang.Object[] copyOf = java.util.Arrays.copyOf(t0VarArr, this.f72719x57098e0 * 2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(copyOf, "copyOf(this, newSize)");
            t0VarArr = (p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t0[]) copyOf;
            this.f392057a = t0VarArr;
        }
        int i17 = this.f72719x57098e0;
        this.f72719x57098e0 = i17 + 1;
        t0VarArr[i17] = z1Var;
        z1Var.f392241e = i17;
        e(i17);
    }

    public final boolean b() {
        return this.f72719x57098e0 == 0;
    }

    public final p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t0 c(int i17) {
        p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t0[] t0VarArr = this.f392057a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(t0VarArr);
        this.f72719x57098e0--;
        if (i17 < this.f72719x57098e0) {
            f(i17, this.f72719x57098e0);
            int i18 = (i17 - 1) / 2;
            if (i17 > 0) {
                p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t0 t0Var = t0VarArr[i17];
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(t0Var);
                p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t0 t0Var2 = t0VarArr[i18];
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(t0Var2);
                if (((java.lang.Comparable) t0Var).compareTo(t0Var2) < 0) {
                    f(i17, i18);
                    e(i18);
                }
            }
            while (true) {
                int i19 = (i17 * 2) + 1;
                if (i19 >= this.f72719x57098e0) {
                    break;
                }
                p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t0[] t0VarArr2 = this.f392057a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(t0VarArr2);
                int i27 = i19 + 1;
                if (i27 < this.f72719x57098e0) {
                    p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t0 t0Var3 = t0VarArr2[i27];
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(t0Var3);
                    p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t0 t0Var4 = t0VarArr2[i19];
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(t0Var4);
                    if (((java.lang.Comparable) t0Var3).compareTo(t0Var4) < 0) {
                        i19 = i27;
                    }
                }
                p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t0 t0Var5 = t0VarArr2[i17];
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(t0Var5);
                p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t0 t0Var6 = t0VarArr2[i19];
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(t0Var6);
                if (((java.lang.Comparable) t0Var5).compareTo(t0Var6) <= 0) {
                    break;
                }
                f(i17, i19);
                i17 = i19;
            }
        }
        p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t0 t0Var7 = t0VarArr[this.f72719x57098e0];
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(t0Var7);
        p3325xe03a0797.p3326xc267989b.z1 z1Var = (p3325xe03a0797.p3326xc267989b.z1) t0Var7;
        z1Var.j(null);
        z1Var.f392241e = -1;
        t0VarArr[this.f72719x57098e0] = null;
        return t0Var7;
    }

    public final p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t0 d() {
        p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t0 c17;
        synchronized (this) {
            c17 = this.f72719x57098e0 > 0 ? c(0) : null;
        }
        return c17;
    }

    public final void e(int i17) {
        while (i17 > 0) {
            p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t0[] t0VarArr = this.f392057a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(t0VarArr);
            int i18 = (i17 - 1) / 2;
            p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t0 t0Var = t0VarArr[i18];
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(t0Var);
            p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t0 t0Var2 = t0VarArr[i17];
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(t0Var2);
            if (((java.lang.Comparable) t0Var).compareTo(t0Var2) <= 0) {
                return;
            }
            f(i17, i18);
            i17 = i18;
        }
    }

    public final void f(int i17, int i18) {
        p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t0[] t0VarArr = this.f392057a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(t0VarArr);
        p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t0 t0Var = t0VarArr[i18];
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(t0Var);
        p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t0 t0Var2 = t0VarArr[i17];
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(t0Var2);
        t0VarArr[i17] = t0Var;
        t0VarArr[i18] = t0Var2;
        ((p3325xe03a0797.p3326xc267989b.z1) t0Var).f392241e = i17;
        ((p3325xe03a0797.p3326xc267989b.z1) t0Var2).f392241e = i18;
    }
}
