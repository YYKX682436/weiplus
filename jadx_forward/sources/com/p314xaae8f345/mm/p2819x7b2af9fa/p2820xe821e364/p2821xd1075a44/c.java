package com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44;

/* loaded from: classes15.dex */
public final class c implements com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.g0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.a f296004d;

    /* renamed from: a, reason: collision with root package name */
    public final m3.e f296001a = new m3.f(30);

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f296002b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f296003c = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public int f296006f = 0;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.h0 f296005e = new com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.h0(this);

    public c(com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.a aVar) {
        this.f296004d = aVar;
    }

    public final boolean a(int i17) {
        java.util.ArrayList arrayList = this.f296003c;
        int size = arrayList.size();
        for (int i18 = 0; i18 < size; i18++) {
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.b bVar = (com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.b) arrayList.get(i18);
            int i19 = bVar.f295986a;
            if (i19 == 8) {
                if (f(bVar.f295989d, i18 + 1) == i17) {
                    return true;
                }
            } else if (i19 == 1) {
                int i27 = bVar.f295987b;
                int i28 = bVar.f295989d + i27;
                while (i27 < i28) {
                    if (f(i27, i18 + 1) == i17) {
                        return true;
                    }
                    i27++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public void b() {
        java.util.ArrayList arrayList = this.f296003c;
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            ((com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.s0) this.f296004d).a((com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.b) arrayList.get(i17));
        }
        l(arrayList);
        this.f296006f = 0;
    }

    public void c() {
        b();
        java.util.ArrayList arrayList = this.f296002b;
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.b bVar = (com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.b) arrayList.get(i17);
            int i18 = bVar.f295986a;
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.a aVar = this.f296004d;
            if (i18 == 1) {
                com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.s0 s0Var = (com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.s0) aVar;
                s0Var.a(bVar);
                s0Var.d(bVar.f295987b, bVar.f295989d);
            } else if (i18 == 2) {
                com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.s0 s0Var2 = (com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.s0) aVar;
                s0Var2.a(bVar);
                int i19 = bVar.f295987b;
                int i27 = bVar.f295989d;
                com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba4 = s0Var2.f296164a;
                c22949xf1deaba4.O(i19, i27, true);
                c22949xf1deaba4.I1 = true;
                c22949xf1deaba4.F1.f296181c += i27;
            } else if (i18 == 4) {
                com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.s0 s0Var3 = (com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.s0) aVar;
                s0Var3.a(bVar);
                s0Var3.c(bVar.f295987b, bVar.f295989d, bVar.f295988c);
            } else if (i18 == 8) {
                com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.s0 s0Var4 = (com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.s0) aVar;
                s0Var4.a(bVar);
                s0Var4.e(bVar.f295987b, bVar.f295989d);
            }
        }
        l(arrayList);
        this.f296006f = 0;
    }

    public final void d(com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.b bVar) {
        int i17;
        int i18 = bVar.f295986a;
        if (i18 == 1 || i18 == 8) {
            throw new java.lang.IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int m17 = m(bVar.f295987b, i18);
        int i19 = bVar.f295987b;
        int i27 = bVar.f295986a;
        if (i27 == 2) {
            i17 = 0;
        } else {
            if (i27 != 4) {
                throw new java.lang.IllegalArgumentException("op should be remove or update." + bVar);
            }
            i17 = 1;
        }
        int i28 = 1;
        for (int i29 = 1; i29 < bVar.f295989d; i29++) {
            int m18 = m(bVar.f295987b + (i17 * i29), bVar.f295986a);
            int i37 = bVar.f295986a;
            if (i37 == 2 ? m18 == m17 : i37 == 4 && m18 == m17 + 1) {
                i28++;
            } else {
                com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.b h17 = h(i37, m17, i28, bVar.f295988c);
                e(h17, i19);
                k(h17);
                if (bVar.f295986a == 4) {
                    i19 += i28;
                }
                i28 = 1;
                m17 = m18;
            }
        }
        java.lang.Object obj = bVar.f295988c;
        k(bVar);
        if (i28 > 0) {
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.b h18 = h(bVar.f295986a, m17, i28, obj);
            e(h18, i19);
            k(h18);
        }
    }

    public void e(com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.b bVar, int i17) {
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.s0 s0Var = (com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.s0) this.f296004d;
        s0Var.a(bVar);
        int i18 = bVar.f295986a;
        if (i18 != 2) {
            if (i18 != 4) {
                throw new java.lang.IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            s0Var.c(i17, bVar.f295989d, bVar.f295988c);
        } else {
            int i19 = bVar.f295989d;
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba4 = s0Var.f296164a;
            c22949xf1deaba4.O(i17, i19, true);
            c22949xf1deaba4.I1 = true;
            c22949xf1deaba4.F1.f296181c += i19;
        }
    }

    public int f(int i17, int i18) {
        java.util.ArrayList arrayList = this.f296003c;
        int size = arrayList.size();
        while (i18 < size) {
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.b bVar = (com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.b) arrayList.get(i18);
            int i19 = bVar.f295986a;
            if (i19 == 8) {
                int i27 = bVar.f295987b;
                if (i27 == i17) {
                    i17 = bVar.f295989d;
                } else {
                    if (i27 < i17) {
                        i17--;
                    }
                    if (bVar.f295989d <= i17) {
                        i17++;
                    }
                }
            } else {
                int i28 = bVar.f295987b;
                if (i28 > i17) {
                    continue;
                } else if (i19 == 2) {
                    int i29 = bVar.f295989d;
                    if (i17 < i28 + i29) {
                        return -1;
                    }
                    i17 -= i29;
                } else if (i19 == 1) {
                    i17 += bVar.f295989d;
                }
            }
            i18++;
        }
        return i17;
    }

    public boolean g() {
        return this.f296002b.size() > 0;
    }

    public com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.b h(int i17, int i18, int i19, java.lang.Object obj) {
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.b bVar = (com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.b) ((m3.f) this.f296001a).a();
        if (bVar == null) {
            return new com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.b(i17, i18, i19, obj);
        }
        bVar.f295986a = i17;
        bVar.f295987b = i18;
        bVar.f295989d = i19;
        bVar.f295988c = obj;
        return bVar;
    }

    public final void i(com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.b bVar) {
        this.f296003c.add(bVar);
        int i17 = bVar.f295986a;
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.a aVar = this.f296004d;
        if (i17 == 1) {
            ((com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.s0) aVar).d(bVar.f295987b, bVar.f295989d);
            return;
        }
        if (i17 == 2) {
            int i18 = bVar.f295987b;
            int i19 = bVar.f295989d;
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba4 = ((com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.s0) aVar).f296164a;
            c22949xf1deaba4.O(i18, i19, false);
            c22949xf1deaba4.I1 = true;
            return;
        }
        if (i17 == 4) {
            ((com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.s0) aVar).c(bVar.f295987b, bVar.f295989d, bVar.f295988c);
        } else if (i17 == 8) {
            ((com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.s0) aVar).e(bVar.f295987b, bVar.f295989d);
        } else {
            throw new java.lang.IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0112 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00cf A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j() {
        /*
            Method dump skipped, instructions count: 662
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.c.j():void");
    }

    public void k(com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.b bVar) {
        bVar.f295988c = null;
        ((m3.f) this.f296001a).b(bVar);
    }

    public void l(java.util.List list) {
        int size = list.size();
        for (int i17 = 0; i17 < size; i17++) {
            k((com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.b) list.get(i17));
        }
        list.clear();
    }

    public final int m(int i17, int i18) {
        int i19;
        int i27;
        java.util.ArrayList arrayList = this.f296003c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.b bVar = (com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.b) arrayList.get(size);
            int i28 = bVar.f295986a;
            if (i28 == 8) {
                int i29 = bVar.f295987b;
                int i37 = bVar.f295989d;
                if (i29 < i37) {
                    i27 = i29;
                    i19 = i37;
                } else {
                    i19 = i29;
                    i27 = i37;
                }
                if (i17 < i27 || i17 > i19) {
                    if (i17 < i29) {
                        if (i18 == 1) {
                            bVar.f295987b = i29 + 1;
                            bVar.f295989d = i37 + 1;
                        } else if (i18 == 2) {
                            bVar.f295987b = i29 - 1;
                            bVar.f295989d = i37 - 1;
                        }
                    }
                } else if (i27 == i29) {
                    if (i18 == 1) {
                        bVar.f295989d = i37 + 1;
                    } else if (i18 == 2) {
                        bVar.f295989d = i37 - 1;
                    }
                    i17++;
                } else {
                    if (i18 == 1) {
                        bVar.f295987b = i29 + 1;
                    } else if (i18 == 2) {
                        bVar.f295987b = i29 - 1;
                    }
                    i17--;
                }
            } else {
                int i38 = bVar.f295987b;
                if (i38 <= i17) {
                    if (i28 == 1) {
                        i17 -= bVar.f295989d;
                    } else if (i28 == 2) {
                        i17 += bVar.f295989d;
                    }
                } else if (i18 == 1) {
                    bVar.f295987b = i38 + 1;
                } else if (i18 == 2) {
                    bVar.f295987b = i38 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.b bVar2 = (com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.b) arrayList.get(size2);
            if (bVar2.f295986a == 8) {
                int i39 = bVar2.f295989d;
                if (i39 == bVar2.f295987b || i39 < 0) {
                    arrayList.remove(size2);
                    k(bVar2);
                }
            } else if (bVar2.f295989d <= 0) {
                arrayList.remove(size2);
                k(bVar2);
            }
        }
        return i17;
    }
}
