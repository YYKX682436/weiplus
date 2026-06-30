package w8;

/* loaded from: classes15.dex */
public final class e implements w8.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f525152a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f525153b;

    public e(int i17, java.util.List list) {
        this.f525152a = i17;
        if (!c(32) && list.isEmpty()) {
            list = java.util.Collections.singletonList(com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417.h(null, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54222x14e2122e, 0, null, null));
        }
        this.f525153b = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    public final w8.y a(w8.e0 e0Var) {
        int i17;
        java.lang.String str;
        boolean c17 = c(32);
        java.util.List list = this.f525153b;
        if (c17) {
            return new w8.y(list);
        }
        t9.p pVar = new t9.p(e0Var.f525156c);
        java.util.ArrayList arrayList = list;
        while (pVar.f498075c - pVar.f498074b > 0) {
            int m17 = pVar.m();
            int m18 = pVar.f498074b + pVar.m();
            if (m17 == 134) {
                arrayList = new java.util.ArrayList();
                int m19 = pVar.m() & 31;
                for (int i18 = 0; i18 < m19; i18++) {
                    java.lang.String k17 = pVar.k(3);
                    int m27 = pVar.m();
                    if ((m27 & 128) != 0) {
                        i17 = m27 & 63;
                        str = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54223x14e215ef;
                    } else {
                        i17 = 1;
                        str = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54222x14e2122e;
                    }
                    arrayList.add(com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417.i(null, str, null, -1, 0, k17, i17, null, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697, java.util.Collections.emptyList()));
                    pVar.x(2);
                }
            }
            pVar.w(m18);
            arrayList = arrayList;
        }
        return new w8.y(arrayList);
    }

    public w8.h0 b(int i17, w8.e0 e0Var) {
        if (i17 == 2) {
            return new w8.t(new w8.j());
        }
        if (i17 == 3 || i17 == 4) {
            return new w8.t(new w8.r(e0Var.f525154a));
        }
        if (i17 == 15) {
            if (c(2)) {
                return null;
            }
            return new w8.t(new w8.d(false, e0Var.f525154a));
        }
        if (i17 == 21) {
            return new w8.t(new w8.q());
        }
        if (i17 == 27) {
            if (c(4)) {
                return null;
            }
            return new w8.t(new w8.n(a(e0Var), c(1), c(8)));
        }
        if (i17 == 36) {
            return new w8.t(new w8.p(a(e0Var)));
        }
        if (i17 == 89) {
            return new w8.t(new w8.g(e0Var.f525155b));
        }
        if (i17 != 138) {
            if (i17 != 129) {
                if (i17 != 130) {
                    if (i17 == 134) {
                        if (c(16)) {
                            return null;
                        }
                        return new w8.x(new w8.z());
                    }
                    if (i17 != 135) {
                        return null;
                    }
                }
            }
            return new w8.t(new w8.b(e0Var.f525154a));
        }
        return new w8.t(new w8.f(e0Var.f525154a));
    }

    public final boolean c(int i17) {
        return (i17 & this.f525152a) != 0;
    }
}
