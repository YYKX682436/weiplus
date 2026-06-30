package k0;

/* loaded from: classes14.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public final a2.d f384459a;

    /* renamed from: b, reason: collision with root package name */
    public final long f384460b;

    /* renamed from: c, reason: collision with root package name */
    public final a2.k1 f384461c;

    /* renamed from: d, reason: collision with root package name */
    public final g2.v f384462d;

    /* renamed from: e, reason: collision with root package name */
    public final k0.i1 f384463e;

    /* renamed from: f, reason: collision with root package name */
    public long f384464f;

    /* renamed from: g, reason: collision with root package name */
    public final a2.d f384465g;

    public j(a2.d dVar, long j17, a2.k1 k1Var, g2.v vVar, k0.i1 i1Var, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f384459a = dVar;
        this.f384460b = j17;
        this.f384461c = k1Var;
        this.f384462d = vVar;
        this.f384463e = i1Var;
        this.f384464f = j17;
        this.f384465g = dVar;
    }

    public final java.lang.Integer a() {
        a2.k1 k1Var = this.f384461c;
        if (k1Var == null) {
            return null;
        }
        int e17 = a2.m1.e(this.f384464f);
        g2.v vVar = this.f384462d;
        ((g2.t) vVar).getClass();
        int e18 = k1Var.e(k1Var.f(e17), true);
        ((g2.t) vVar).getClass();
        return java.lang.Integer.valueOf(e18);
    }

    public final java.lang.Integer b() {
        a2.k1 k1Var = this.f384461c;
        if (k1Var == null) {
            return null;
        }
        int f17 = a2.m1.f(this.f384464f);
        g2.v vVar = this.f384462d;
        ((g2.t) vVar).getClass();
        int j17 = k1Var.j(k1Var.f(f17));
        ((g2.t) vVar).getClass();
        return java.lang.Integer.valueOf(j17);
    }

    public final int c(a2.k1 k1Var, int i17) {
        a2.d dVar = this.f384459a;
        if (i17 >= dVar.length()) {
            return dVar.length();
        }
        int length = this.f384465g.f82214d.length() - 1;
        if (i17 <= length) {
            length = i17;
        }
        long n17 = k1Var.n(length);
        if (a2.m1.c(n17) <= i17) {
            return c(k1Var, i17 + 1);
        }
        int c17 = a2.m1.c(n17);
        ((g2.t) this.f384462d).getClass();
        return c17;
    }

    public final int d(a2.k1 k1Var, int i17) {
        if (i17 < 0) {
            return 0;
        }
        int length = this.f384465g.f82214d.length() - 1;
        if (i17 <= length) {
            length = i17;
        }
        int n17 = (int) (k1Var.n(length) >> 32);
        if (n17 >= i17) {
            return d(k1Var, i17 - 1);
        }
        ((g2.t) this.f384462d).getClass();
        return n17;
    }

    public final boolean e() {
        a2.k1 k1Var = this.f384461c;
        return (k1Var != null ? k1Var.m(a2.m1.c(this.f384464f)) : null) != l2.e.Rtl;
    }

    public final int f(a2.k1 k1Var, int i17) {
        int c17 = a2.m1.c(this.f384464f);
        g2.v vVar = this.f384462d;
        ((g2.t) vVar).getClass();
        k0.i1 i1Var = this.f384463e;
        if (i1Var.f384458a == null) {
            i1Var.f384458a = java.lang.Float.valueOf(k1Var.c(c17).f307162a);
        }
        int f17 = k1Var.f(c17) + i17;
        if (f17 < 0) {
            return 0;
        }
        if (f17 >= k1Var.f82299b.f82252f) {
            return this.f384465g.f82214d.length();
        }
        float d17 = k1Var.d(f17) - 1;
        java.lang.Float f18 = i1Var.f384458a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(f18);
        float floatValue = f18.floatValue();
        if ((e() && floatValue >= k1Var.i(f17)) || (!e() && floatValue <= k1Var.h(f17))) {
            return k1Var.e(f17, true);
        }
        int l17 = k1Var.l(d1.f.a(f18.floatValue(), d17));
        ((g2.t) vVar).getClass();
        return l17;
    }

    public final k0.j g() {
        this.f384463e.f384458a = null;
        if (this.f384465g.f82214d.length() > 0) {
            if (e()) {
                l();
            } else {
                i();
            }
        }
        return this;
    }

    public final k0.j h() {
        this.f384463e.f384458a = null;
        if (this.f384465g.f82214d.length() > 0) {
            if (e()) {
                n();
            } else {
                k();
            }
        }
        return this;
    }

    public final k0.j i() {
        this.f384463e.f384458a = null;
        a2.d dVar = this.f384465g;
        if (dVar.f82214d.length() > 0) {
            java.lang.String str = dVar.f82214d;
            int c17 = a2.m1.c(this.f384464f);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<this>");
            java.text.BreakIterator characterInstance = java.text.BreakIterator.getCharacterInstance();
            characterInstance.setText(str);
            int following = characterInstance.following(c17);
            if (following != -1) {
                w(following, following);
            }
        }
        return this;
    }

    public final k0.j j() {
        this.f384463e.f384458a = null;
        a2.d dVar = this.f384465g;
        if (dVar.f82214d.length() > 0) {
            int a17 = j0.a3.a(dVar.f82214d, a2.m1.e(this.f384464f));
            w(a17, a17);
        }
        return this;
    }

    public final k0.j k() {
        java.lang.Integer num = null;
        this.f384463e.f384458a = null;
        if (this.f384465g.f82214d.length() > 0) {
            a2.k1 k1Var = this.f384461c;
            if (k1Var != null) {
                int c17 = a2.m1.c(this.f384464f);
                ((g2.t) this.f384462d).getClass();
                num = java.lang.Integer.valueOf(c(k1Var, c17));
            }
            if (num != null) {
                int intValue = num.intValue();
                w(intValue, intValue);
            }
        }
        return this;
    }

    public final k0.j l() {
        this.f384463e.f384458a = null;
        a2.d dVar = this.f384465g;
        if (dVar.f82214d.length() > 0) {
            java.lang.String str = dVar.f82214d;
            int c17 = a2.m1.c(this.f384464f);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<this>");
            java.text.BreakIterator characterInstance = java.text.BreakIterator.getCharacterInstance();
            characterInstance.setText(str);
            int preceding = characterInstance.preceding(c17);
            if (preceding != -1) {
                w(preceding, preceding);
            }
        }
        return this;
    }

    public final k0.j m() {
        this.f384463e.f384458a = null;
        a2.d dVar = this.f384465g;
        int i17 = 0;
        if (dVar.f82214d.length() > 0) {
            int f17 = a2.m1.f(this.f384464f);
            java.lang.String str = dVar.f82214d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<this>");
            int i18 = f17 - 1;
            while (true) {
                if (i18 <= 0) {
                    break;
                }
                int i19 = i18 - 1;
                if (str.charAt(i19) == '\n') {
                    i17 = i18;
                    break;
                }
                i18 = i19;
            }
            w(i17, i17);
        }
        return this;
    }

    public final k0.j n() {
        java.lang.Integer num = null;
        this.f384463e.f384458a = null;
        if (this.f384465g.f82214d.length() > 0) {
            a2.k1 k1Var = this.f384461c;
            if (k1Var != null) {
                int c17 = a2.m1.c(this.f384464f);
                ((g2.t) this.f384462d).getClass();
                num = java.lang.Integer.valueOf(d(k1Var, c17));
            }
            if (num != null) {
                int intValue = num.intValue();
                w(intValue, intValue);
            }
        }
        return this;
    }

    public final k0.j o() {
        this.f384463e.f384458a = null;
        if (this.f384465g.f82214d.length() > 0) {
            if (e()) {
                i();
            } else {
                l();
            }
        }
        return this;
    }

    public final k0.j p() {
        this.f384463e.f384458a = null;
        if (this.f384465g.f82214d.length() > 0) {
            if (e()) {
                k();
            } else {
                n();
            }
        }
        return this;
    }

    public final k0.j q() {
        this.f384463e.f384458a = null;
        a2.d dVar = this.f384465g;
        if (dVar.f82214d.length() > 0) {
            int length = dVar.f82214d.length();
            w(length, length);
        }
        return this;
    }

    public final k0.j r() {
        java.lang.Integer a17;
        this.f384463e.f384458a = null;
        if ((this.f384465g.f82214d.length() > 0) && (a17 = a()) != null) {
            int intValue = a17.intValue();
            w(intValue, intValue);
        }
        return this;
    }

    public final k0.j s() {
        this.f384463e.f384458a = null;
        if (this.f384465g.f82214d.length() > 0) {
            if (e()) {
                u();
            } else {
                r();
            }
        }
        return this;
    }

    public final k0.j t() {
        this.f384463e.f384458a = null;
        if (this.f384465g.f82214d.length() > 0) {
            if (e()) {
                r();
            } else {
                u();
            }
        }
        return this;
    }

    public final k0.j u() {
        java.lang.Integer b17;
        this.f384463e.f384458a = null;
        if ((this.f384465g.f82214d.length() > 0) && (b17 = b()) != null) {
            int intValue = b17.intValue();
            w(intValue, intValue);
        }
        return this;
    }

    public final k0.j v() {
        if (this.f384465g.f82214d.length() > 0) {
            int i17 = a2.m1.f82315c;
            this.f384464f = a2.n1.a((int) (this.f384460b >> 32), a2.m1.c(this.f384464f));
        }
        return this;
    }

    public final void w(int i17, int i18) {
        this.f384464f = a2.n1.a(i17, i18);
    }
}
