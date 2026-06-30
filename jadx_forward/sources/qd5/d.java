package qd5;

/* loaded from: classes9.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final qd5.d f443438a = new qd5.d();

    public final int a(java.util.List list, int i17) {
        int i18 = 0;
        int i19 = 0;
        while (i18 < list.size()) {
            qd5.d dVar = f443438a;
            int f17 = dVar.f((com.p314xaae8f345.mm.p2621x8fb0427b.f9) list.get(i18));
            if (f17 > 0) {
                int i27 = i18 + 1;
                while (i27 < list.size() && dVar.f((com.p314xaae8f345.mm.p2621x8fb0427b.f9) list.get(i27)) == f17) {
                    i27++;
                }
                i19 += (((i27 - i18) + i17) - 1) / i17;
                i18 = i27;
            } else {
                i19++;
                i18++;
            }
        }
        return i19;
    }

    public final java.util.List b(sd5.o coreDataSource) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(coreDataSource, "coreDataSource");
        java.util.List list = coreDataSource.f488256d;
        int a17 = a(list, 100);
        coreDataSource.f488255c.getClass();
        int max = java.lang.Math.max(a17, 17);
        boolean z17 = (f((com.p314xaae8f345.mm.p2621x8fb0427b.f9) kz5.n0.k0(list)) > 0) && !coreDataSource.f();
        if (!z17) {
            return list;
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) list;
        int size = arrayList.size();
        java.util.List list2 = list;
        int i17 = 0;
        while (z17) {
            list2 = coreDataSource.j();
            int size2 = list2.size();
            if (size2 == size) {
                break;
            }
            i17 = a(list2, 100);
            size = size2;
            z17 = !(f((com.p314xaae8f345.mm.p2621x8fb0427b.f9) kz5.n0.k0(list2)) > 0) ? i17 >= max || coreDataSource.f() : i17 > max || coreDataSource.f();
        }
        if (i17 > max) {
            int g17 = a(list2, 100) > max ? g(kz5.i0.H(list2), max, 100) : 0;
            if (g17 > 0 && g17 > 0 && !arrayList.isEmpty()) {
                arrayList.subList(arrayList.size() - java.lang.Math.min(g17, arrayList.size()), arrayList.size()).clear();
            }
        }
        return list;
    }

    public final java.util.List c(sd5.o coreDataSource) {
        int g17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(coreDataSource, "coreDataSource");
        java.util.List list = coreDataSource.f488256d;
        int a17 = a(list, 100);
        coreDataSource.f488255c.getClass();
        int max = java.lang.Math.max(a17, 17);
        boolean z17 = (f((com.p314xaae8f345.mm.p2621x8fb0427b.f9) kz5.n0.a0(list, 0)) > 0) && !coreDataSource.f488257e;
        if (!z17) {
            return list;
        }
        int size = ((java.util.ArrayList) list).size();
        java.util.List list2 = list;
        int i17 = 0;
        while (z17) {
            list2 = coreDataSource.k();
            int size2 = list2.size();
            if (size2 == size) {
                break;
            }
            i17 = a(list2, 100);
            size = size2;
            z17 = !(f((com.p314xaae8f345.mm.p2621x8fb0427b.f9) kz5.n0.a0(list2, 0)) > 0) ? i17 >= max || coreDataSource.f488257e : i17 > max || coreDataSource.f488257e;
        }
        if (i17 > max && (g17 = g(list2, max, 100)) > 0) {
            coreDataSource.a(g17);
        }
        return list;
    }

    public final java.util.List d(sd5.o coreDataSource) {
        int g17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(coreDataSource, "coreDataSource");
        java.util.List g18 = coreDataSource.g();
        if (g18.isEmpty()) {
            return g18;
        }
        coreDataSource.f488255c.getClass();
        int a17 = a(g18, 100);
        boolean z17 = !(f((com.p314xaae8f345.mm.p2621x8fb0427b.f9) kz5.n0.a0(g18, 0)) > 0) ? a17 >= 17 || coreDataSource.f488257e : a17 > 17 || coreDataSource.f488257e;
        int size = g18.size();
        while (z17) {
            g18 = coreDataSource.k();
            int size2 = g18.size();
            if (size2 == size) {
                break;
            }
            a17 = a(g18, 100);
            size = size2;
            z17 = !(f((com.p314xaae8f345.mm.p2621x8fb0427b.f9) kz5.n0.a0(g18, 0)) > 0) ? a17 >= 17 || coreDataSource.f488257e : a17 > 17 || coreDataSource.f488257e;
        }
        java.util.List list = coreDataSource.f488256d;
        if (a17 > 17 && (g17 = g(g18, 17, 100)) > 0) {
            coreDataSource.a(g17);
        }
        return list;
    }

    public final java.util.List e(sd5.o coreDataSource) {
        int g17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(coreDataSource, "coreDataSource");
        int i17 = coreDataSource.f488255c.f488260a;
        java.util.List list = coreDataSource.f488256d;
        if (i17 <= 0) {
            return list;
        }
        int a17 = a(list, 100);
        int size = ((java.util.ArrayList) list).size();
        java.util.List list2 = list;
        int i18 = a17;
        while (!coreDataSource.f488257e && i18 - a17 <= i17) {
            list2 = coreDataSource.k();
            int size2 = list2.size();
            int a18 = a(list2, 100);
            if (size2 == size && a18 == i18) {
                break;
            }
            size = size2;
            i18 = a18;
        }
        int min = java.lang.Math.min(a17 + i17, i18);
        if (i18 > min && (g17 = g(list2, min, 100)) > 0) {
            coreDataSource.a(g17);
        }
        return list;
    }

    public final int f(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (f9Var == null) {
            return 0;
        }
        if (!(f9Var.W2() || f9Var.J2() || f9Var.m78014x7b98c171())) {
            return 0;
        }
        java.lang.String b17 = ic5.f.f371970c.b(f9Var);
        return r26.n0.N(b17) ? f9Var.W2() ? 1 : 0 : b17.hashCode() & Integer.MAX_VALUE;
    }

    public final int g(java.util.List list, int i17, int i18) {
        int a17 = a(list, i18);
        if (a17 <= i17) {
            return 0;
        }
        int i19 = a17 - i17;
        int i27 = 0;
        while (i19 > 0 && i27 < list.size()) {
            qd5.d dVar = f443438a;
            int f17 = dVar.f((com.p314xaae8f345.mm.p2621x8fb0427b.f9) list.get(i27));
            if (f17 > 0) {
                int i28 = i27 + 1;
                while (i28 < list.size() && dVar.f((com.p314xaae8f345.mm.p2621x8fb0427b.f9) list.get(i28)) == f17) {
                    i28++;
                }
                int i29 = i28 - i27;
                while (i19 > 0 && i29 > 0) {
                    int i37 = i29 % i18;
                    if (i37 == 0) {
                        i37 = i18;
                    }
                    if (i37 > i29) {
                        i37 = i29;
                    }
                    i27 += i37;
                    i29 -= i37;
                    i19--;
                }
            } else {
                i27++;
                i19--;
            }
        }
        int size = list.size();
        return i27 > size ? size : i27;
    }
}
