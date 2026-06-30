package p012xc85e97e9.p103xe821e364.p104xd1075a44;

/* loaded from: classes15.dex */
public class c implements p012xc85e97e9.p103xe821e364.p104xd1075a44.s1 {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.a f93506d;

    /* renamed from: a, reason: collision with root package name */
    public final m3.e f93503a = new m3.f(30);

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f93504b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f93505c = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public int f93508f = 0;

    /* renamed from: e, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.t1 f93507e = new p012xc85e97e9.p103xe821e364.p104xd1075a44.t1(this);

    public c(p012xc85e97e9.p103xe821e364.p104xd1075a44.a aVar) {
        this.f93506d = aVar;
    }

    public final boolean a(int i17) {
        java.util.ArrayList arrayList = this.f93505c;
        int size = arrayList.size();
        for (int i18 = 0; i18 < size; i18++) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.b bVar = (p012xc85e97e9.p103xe821e364.p104xd1075a44.b) arrayList.get(i18);
            int i19 = bVar.f93492a;
            if (i19 == 8) {
                if (f(bVar.f93495d, i18 + 1) == i17) {
                    return true;
                }
            } else if (i19 == 1) {
                int i27 = bVar.f93493b;
                int i28 = bVar.f93495d + i27;
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
        java.util.ArrayList arrayList = this.f93505c;
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            ((p012xc85e97e9.p103xe821e364.p104xd1075a44.e2) this.f93506d).a((p012xc85e97e9.p103xe821e364.p104xd1075a44.b) arrayList.get(i17));
        }
        l(arrayList);
        this.f93508f = 0;
    }

    public void c() {
        b();
        java.util.ArrayList arrayList = this.f93504b;
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.b bVar = (p012xc85e97e9.p103xe821e364.p104xd1075a44.b) arrayList.get(i17);
            int i18 = bVar.f93492a;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.a aVar = this.f93506d;
            if (i18 == 1) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.e2 e2Var = (p012xc85e97e9.p103xe821e364.p104xd1075a44.e2) aVar;
                e2Var.a(bVar);
                e2Var.c(bVar.f93493b, bVar.f93495d);
            } else if (i18 == 2) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.e2 e2Var2 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.e2) aVar;
                e2Var2.a(bVar);
                int i19 = bVar.f93493b;
                int i27 = bVar.f93495d;
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = e2Var2.f93543a;
                c1163xf1deaba4.H0(i19, i27, true);
                c1163xf1deaba4.I1 = true;
                c1163xf1deaba4.F1.f93594c += i27;
            } else if (i18 == 4) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.e2 e2Var3 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.e2) aVar;
                e2Var3.a(bVar);
                e2Var3.b(bVar.f93493b, bVar.f93495d, bVar.f93494c);
            } else if (i18 == 8) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.e2 e2Var4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.e2) aVar;
                e2Var4.a(bVar);
                e2Var4.d(bVar.f93493b, bVar.f93495d);
            }
        }
        l(arrayList);
        this.f93508f = 0;
    }

    public final void d(p012xc85e97e9.p103xe821e364.p104xd1075a44.b bVar) {
        int i17;
        int i18 = bVar.f93492a;
        if (i18 == 1 || i18 == 8) {
            throw new java.lang.IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int m17 = m(bVar.f93493b, i18);
        int i19 = bVar.f93493b;
        int i27 = bVar.f93492a;
        if (i27 == 2) {
            i17 = 0;
        } else {
            if (i27 != 4) {
                throw new java.lang.IllegalArgumentException("op should be remove or update." + bVar);
            }
            i17 = 1;
        }
        int i28 = 1;
        for (int i29 = 1; i29 < bVar.f93495d; i29++) {
            int m18 = m(bVar.f93493b + (i17 * i29), bVar.f93492a);
            int i37 = bVar.f93492a;
            if (i37 == 2 ? m18 == m17 : i37 == 4 && m18 == m17 + 1) {
                i28++;
            } else {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.b h17 = h(i37, m17, i28, bVar.f93494c);
                e(h17, i19);
                k(h17);
                if (bVar.f93492a == 4) {
                    i19 += i28;
                }
                i28 = 1;
                m17 = m18;
            }
        }
        java.lang.Object obj = bVar.f93494c;
        k(bVar);
        if (i28 > 0) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.b h18 = h(bVar.f93492a, m17, i28, obj);
            e(h18, i19);
            k(h18);
        }
    }

    public void e(p012xc85e97e9.p103xe821e364.p104xd1075a44.b bVar, int i17) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.e2 e2Var = (p012xc85e97e9.p103xe821e364.p104xd1075a44.e2) this.f93506d;
        e2Var.a(bVar);
        int i18 = bVar.f93492a;
        if (i18 != 2) {
            if (i18 != 4) {
                throw new java.lang.IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            e2Var.b(i17, bVar.f93495d, bVar.f93494c);
        } else {
            int i19 = bVar.f93495d;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = e2Var.f93543a;
            c1163xf1deaba4.H0(i17, i19, true);
            c1163xf1deaba4.I1 = true;
            c1163xf1deaba4.F1.f93594c += i19;
        }
    }

    public int f(int i17, int i18) {
        java.util.ArrayList arrayList = this.f93505c;
        int size = arrayList.size();
        while (i18 < size) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.b bVar = (p012xc85e97e9.p103xe821e364.p104xd1075a44.b) arrayList.get(i18);
            int i19 = bVar.f93492a;
            if (i19 == 8) {
                int i27 = bVar.f93493b;
                if (i27 == i17) {
                    i17 = bVar.f93495d;
                } else {
                    if (i27 < i17) {
                        i17--;
                    }
                    if (bVar.f93495d <= i17) {
                        i17++;
                    }
                }
            } else {
                int i28 = bVar.f93493b;
                if (i28 > i17) {
                    continue;
                } else if (i19 == 2) {
                    int i29 = bVar.f93495d;
                    if (i17 < i28 + i29) {
                        return -1;
                    }
                    i17 -= i29;
                } else if (i19 == 1) {
                    i17 += bVar.f93495d;
                }
            }
            i18++;
        }
        return i17;
    }

    public boolean g() {
        return this.f93504b.size() > 0;
    }

    public p012xc85e97e9.p103xe821e364.p104xd1075a44.b h(int i17, int i18, int i19, java.lang.Object obj) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.b bVar = (p012xc85e97e9.p103xe821e364.p104xd1075a44.b) ((m3.f) this.f93503a).a();
        if (bVar == null) {
            return new p012xc85e97e9.p103xe821e364.p104xd1075a44.b(i17, i18, i19, obj);
        }
        bVar.f93492a = i17;
        bVar.f93493b = i18;
        bVar.f93495d = i19;
        bVar.f93494c = obj;
        return bVar;
    }

    public final void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.b bVar) {
        this.f93505c.add(bVar);
        int i17 = bVar.f93492a;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.a aVar = this.f93506d;
        if (i17 == 1) {
            ((p012xc85e97e9.p103xe821e364.p104xd1075a44.e2) aVar).c(bVar.f93493b, bVar.f93495d);
            return;
        }
        if (i17 == 2) {
            int i18 = bVar.f93493b;
            int i19 = bVar.f93495d;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = ((p012xc85e97e9.p103xe821e364.p104xd1075a44.e2) aVar).f93543a;
            c1163xf1deaba4.H0(i18, i19, false);
            c1163xf1deaba4.I1 = true;
            return;
        }
        if (i17 == 4) {
            ((p012xc85e97e9.p103xe821e364.p104xd1075a44.e2) aVar).b(bVar.f93493b, bVar.f93495d, bVar.f93494c);
        } else if (i17 == 8) {
            ((p012xc85e97e9.p103xe821e364.p104xd1075a44.e2) aVar).d(bVar.f93493b, bVar.f93495d);
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
            Method dump skipped, instructions count: 713
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p103xe821e364.p104xd1075a44.c.j():void");
    }

    public void k(p012xc85e97e9.p103xe821e364.p104xd1075a44.b bVar) {
        bVar.f93494c = null;
        ((m3.f) this.f93503a).b(bVar);
    }

    public void l(java.util.List list) {
        int size = list.size();
        for (int i17 = 0; i17 < size; i17++) {
            k((p012xc85e97e9.p103xe821e364.p104xd1075a44.b) list.get(i17));
        }
        list.clear();
    }

    public final int m(int i17, int i18) {
        int i19;
        int i27;
        java.util.ArrayList arrayList = this.f93505c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.b bVar = (p012xc85e97e9.p103xe821e364.p104xd1075a44.b) arrayList.get(size);
            int i28 = bVar.f93492a;
            if (i28 == 8) {
                int i29 = bVar.f93493b;
                int i37 = bVar.f93495d;
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
                            bVar.f93493b = i29 + 1;
                            bVar.f93495d = i37 + 1;
                        } else if (i18 == 2) {
                            bVar.f93493b = i29 - 1;
                            bVar.f93495d = i37 - 1;
                        }
                    }
                } else if (i27 == i29) {
                    if (i18 == 1) {
                        bVar.f93495d = i37 + 1;
                    } else if (i18 == 2) {
                        bVar.f93495d = i37 - 1;
                    }
                    i17++;
                } else {
                    if (i18 == 1) {
                        bVar.f93493b = i29 + 1;
                    } else if (i18 == 2) {
                        bVar.f93493b = i29 - 1;
                    }
                    i17--;
                }
            } else {
                int i38 = bVar.f93493b;
                if (i38 <= i17) {
                    if (i28 == 1) {
                        i17 -= bVar.f93495d;
                    } else if (i28 == 2) {
                        i17 += bVar.f93495d;
                    }
                } else if (i18 == 1) {
                    bVar.f93493b = i38 + 1;
                } else if (i18 == 2) {
                    bVar.f93493b = i38 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.b bVar2 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.b) arrayList.get(size2);
            if (bVar2.f93492a == 8) {
                int i39 = bVar2.f93495d;
                if (i39 == bVar2.f93493b || i39 < 0) {
                    arrayList.remove(size2);
                    k(bVar2);
                }
            } else if (bVar2.f93495d <= 0) {
                arrayList.remove(size2);
                k(bVar2);
            }
        }
        return i17;
    }
}
