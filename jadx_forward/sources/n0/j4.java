package n0;

/* loaded from: classes14.dex */
public final class j4 {

    /* renamed from: a, reason: collision with root package name */
    public final n0.k4 f415102a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f415103b;

    /* renamed from: c, reason: collision with root package name */
    public final int f415104c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object[] f415105d;

    /* renamed from: e, reason: collision with root package name */
    public final int f415106e;

    /* renamed from: f, reason: collision with root package name */
    public int f415107f;

    /* renamed from: g, reason: collision with root package name */
    public int f415108g;

    /* renamed from: h, reason: collision with root package name */
    public int f415109h;

    /* renamed from: i, reason: collision with root package name */
    public int f415110i;

    /* renamed from: j, reason: collision with root package name */
    public int f415111j;

    /* renamed from: k, reason: collision with root package name */
    public int f415112k;

    public j4(n0.k4 table) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(table, "table");
        this.f415102a = table;
        this.f415103b = table.f415123d;
        int i17 = table.f415124e;
        this.f415104c = i17;
        this.f415105d = table.f415125f;
        this.f415106e = table.f415126g;
        this.f415108g = i17;
        this.f415109h = -1;
    }

    public final n0.d a(int i17) {
        java.util.ArrayList arrayList = this.f415102a.f415130n;
        int n17 = n0.l4.n(arrayList, i17, this.f415104c);
        if (n17 < 0) {
            n0.d dVar = new n0.d(i17);
            arrayList.add(-(n17 + 1), dVar);
            return dVar;
        }
        java.lang.Object obj = arrayList.get(n17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(location)");
        return (n0.d) obj;
    }

    public final void b() {
        n0.k4 k4Var = this.f415102a;
        k4Var.getClass();
        if (!(k4Var.f415127h > 0)) {
            throw new java.lang.IllegalArgumentException("Unexpected reader close()".toString());
        }
        k4Var.f415127h--;
    }

    public final void c() {
        if (this.f415110i == 0) {
            if (!(this.f415107f == this.f415108g)) {
                throw new java.lang.IllegalArgumentException("endGroup() not called at the end of a group".toString());
            }
            int i17 = (this.f415109h * 5) + 2;
            int[] iArr = this.f415103b;
            int i18 = iArr[i17];
            this.f415109h = i18;
            this.f415108g = i18 < 0 ? this.f415104c : i18 + iArr[(i18 * 5) + 3];
        }
    }

    public final java.lang.Object d() {
        int m17;
        int i17 = this.f415107f;
        if (i17 >= this.f415108g) {
            return 0;
        }
        int[] iArr = this.f415103b;
        if (!n0.l4.d(iArr, i17)) {
            return n0.n.f415153a;
        }
        int i18 = i17 * 5;
        if (i18 >= iArr.length) {
            m17 = iArr.length;
        } else {
            m17 = n0.l4.m(iArr[i18 + 1] >> 29) + iArr[i18 + 4];
        }
        return this.f415105d[m17];
    }

    public final int e() {
        int i17 = this.f415107f;
        if (i17 >= this.f415108g) {
            return 0;
        }
        return this.f415103b[i17 * 5];
    }

    public final java.lang.Object f(int i17, int i18) {
        int[] iArr = this.f415103b;
        int j17 = n0.l4.j(iArr, i17);
        int i19 = i17 + 1;
        int i27 = j17 + i18;
        if (i27 < (i19 < this.f415104c ? n0.l4.b(iArr, i19) : this.f415106e)) {
            return this.f415105d[i27];
        }
        int i28 = n0.o.f415162a;
        return n0.n.f415153a;
    }

    public final int g(int i17) {
        return n0.l4.c(this.f415103b, i17);
    }

    public final boolean h(int i17) {
        return n0.l4.f(this.f415103b, i17);
    }

    public final java.lang.Object i(int i17) {
        int[] iArr = this.f415103b;
        if (!n0.l4.f(iArr, i17)) {
            return null;
        }
        if (n0.l4.f(iArr, i17)) {
            return this.f415105d[iArr[(i17 * 5) + 4]];
        }
        int i18 = n0.o.f415162a;
        return n0.n.f415153a;
    }

    public final java.lang.Object j(int[] iArr, int i17) {
        if (n0.l4.e(iArr, i17)) {
            return this.f415105d[n0.l4.i(iArr, i17)];
        }
        return null;
    }

    public final int k(int i17) {
        return this.f415103b[(i17 * 5) + 2];
    }

    public final void l(int i17) {
        if (!(this.f415110i == 0)) {
            throw new java.lang.IllegalArgumentException("Cannot reposition while in an empty region".toString());
        }
        this.f415107f = i17;
        int[] iArr = this.f415103b;
        int i18 = this.f415104c;
        int i19 = i17 < i18 ? iArr[(i17 * 5) + 2] : -1;
        this.f415109h = i19;
        if (i19 < 0) {
            this.f415108g = i18;
        } else {
            this.f415108g = i19 + n0.l4.c(iArr, i19);
        }
        this.f415111j = 0;
        this.f415112k = 0;
    }

    public final int m() {
        if (!(this.f415110i == 0)) {
            throw new java.lang.IllegalArgumentException("Cannot skip while in an empty region".toString());
        }
        int i17 = this.f415107f;
        int[] iArr = this.f415103b;
        int h17 = n0.l4.f(iArr, i17) ? 1 : n0.l4.h(iArr, this.f415107f);
        int i18 = this.f415107f;
        this.f415107f = i18 + n0.l4.c(iArr, i18);
        return h17;
    }

    public final void n() {
        if (!(this.f415110i == 0)) {
            throw new java.lang.IllegalArgumentException("Cannot skip the enclosing group while in an empty region".toString());
        }
        this.f415107f = this.f415108g;
    }

    public final void o() {
        if (this.f415110i <= 0) {
            int i17 = this.f415107f;
            int[] iArr = this.f415103b;
            if (!(iArr[(i17 * 5) + 2] == this.f415109h)) {
                throw new java.lang.IllegalArgumentException("Invalid slot table detected".toString());
            }
            this.f415109h = i17;
            this.f415108g = iArr[(i17 * 5) + 3] + i17;
            int i18 = i17 + 1;
            this.f415107f = i18;
            this.f415111j = n0.l4.j(iArr, i17);
            this.f415112k = i17 >= this.f415104c - 1 ? this.f415106e : iArr[(i18 * 5) + 4];
        }
    }

    /* renamed from: toString */
    public java.lang.String m148731x9616526c() {
        return "SlotReader(current=" + this.f415107f + ", key=" + e() + ", parent=" + this.f415109h + ", end=" + this.f415108g + ')';
    }
}
