package iv5;

/* loaded from: classes16.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public final jv5.a f376692a;

    /* renamed from: b, reason: collision with root package name */
    public final av5.y f376693b;

    /* renamed from: c, reason: collision with root package name */
    public final kv5.i f376694c;

    public j(jv5.a aVar, av5.y yVar, kv5.i iVar) {
        this.f376692a = aVar;
        this.f376693b = yVar;
        this.f376694c = iVar;
    }

    public java.lang.Comparable a(kv5.f fVar, java.lang.Comparable comparable) {
        return comparable;
    }

    public void b() {
        av5.u uVar;
        int i17;
        int i18;
        int i19;
        jv5.a aVar = this.f376692a;
        bv5.b bVar = aVar.f383798a;
        bVar.getClass();
        int[] g17 = g(av5.f0.b(bVar));
        bv5.b bVar2 = aVar.f383798a;
        bVar2.getClass();
        int[] g18 = g(av5.f0.b(bVar2));
        bVar2.getClass();
        int[] g19 = g(av5.f0.b(bVar2));
        av5.y yVar = this.f376693b;
        av5.n0 c17 = c(yVar);
        int i27 = 0;
        if (c17.h()) {
            uVar = yVar.d(c17);
            i17 = c17.f95953f;
        } else {
            uVar = null;
            i17 = 0;
        }
        int length = g17.length;
        int length2 = g18.length;
        int length3 = g19.length;
        int i28 = (i17 + length2) - length;
        int i29 = 0;
        int i37 = 0;
        int i38 = 0;
        int i39 = 0;
        while (true) {
            if (i39 >= i17 && i27 >= i28) {
                break;
            }
            int i47 = i28;
            if (i38 < length2 && g18[i38] == i27) {
                i(e(bVar2));
                i38++;
            } else if (i37 >= length3 || g19[i37] != i27) {
                int binarySearch = java.util.Arrays.binarySearch(g17, i39);
                int i48 = i37;
                kv5.i iVar = this.f376694c;
                if (binarySearch >= 0) {
                    java.lang.Comparable e17 = e(uVar);
                    i18 = i38;
                    d(iVar, i39, e17 instanceof av5.m0 ? ((av5.m0) e17).f95950d : i39);
                    i39++;
                    i29++;
                } else {
                    i18 = i38;
                    if (java.util.Arrays.binarySearch(g19, i39) >= 0) {
                        java.lang.Comparable e18 = e(uVar);
                        d(iVar, i39, e18 instanceof av5.m0 ? ((av5.m0) e18).f95950d : i39);
                        i39++;
                    } else if (i39 < i17) {
                        java.lang.Comparable a17 = a(iVar, e(uVar));
                        int i49 = i29;
                        int i57 = i27;
                        h(this.f376694c, i39, a17 instanceof av5.m0 ? ((av5.m0) a17).f95950d : i39, i57, i(a17));
                        i39++;
                        i27 = i57 + 1;
                        i28 = i47;
                        i37 = i48;
                        i38 = i18;
                        i29 = i49;
                    } else {
                        i19 = i27;
                        i28 = i47;
                        i37 = i48;
                        i38 = i18;
                        i27 = i19;
                    }
                }
                i19 = i27;
                i28 = i47;
                i37 = i48;
                i38 = i18;
                i27 = i19;
            } else {
                i(e(bVar2));
                i37++;
            }
            i27++;
            i28 = i47;
        }
        if (i38 != length2 || i29 != length || i37 != length3) {
            throw new java.lang.IllegalStateException(java.lang.String.format("bad patch operation sequence. addCounter: %d, addCount: %d, delCounter: %d, delCount: %d, replaceCounter: %d, replaceCount:%d", java.lang.Integer.valueOf(i38), java.lang.Integer.valueOf(length2), java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(length), java.lang.Integer.valueOf(i37), java.lang.Integer.valueOf(length3)));
        }
        f();
    }

    public abstract av5.n0 c(av5.y yVar);

    public void d(kv5.i iVar, int i17, int i18) {
    }

    public abstract java.lang.Comparable e(bv5.b bVar);

    public void f() {
    }

    public final int[] g(int i17) {
        int[] iArr = new int[i17];
        int i18 = 0;
        for (int i19 = 0; i19 < i17; i19++) {
            bv5.b bVar = this.f376692a.f383798a;
            bVar.getClass();
            i18 += av5.f0.a(bVar);
            iArr[i19] = i18;
        }
        return iArr;
    }

    public void h(kv5.i iVar, int i17, int i18, int i19, int i27) {
    }

    public abstract int i(java.lang.Comparable comparable);
}
