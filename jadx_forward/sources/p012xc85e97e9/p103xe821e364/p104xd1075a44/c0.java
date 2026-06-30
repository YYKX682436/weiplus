package p012xc85e97e9.p103xe821e364.p104xd1075a44;

/* loaded from: classes16.dex */
public class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f93509a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f93510b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f93511c;

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.b0 f93512d;

    /* renamed from: e, reason: collision with root package name */
    public final int f93513e;

    /* renamed from: f, reason: collision with root package name */
    public final int f93514f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f93515g;

    public c0(p012xc85e97e9.p103xe821e364.p104xd1075a44.b0 b0Var, java.util.List list, int[] iArr, int[] iArr2, boolean z17) {
        this.f93509a = list;
        this.f93510b = iArr;
        this.f93511c = iArr2;
        java.util.Arrays.fill(iArr, 0);
        java.util.Arrays.fill(iArr2, 0);
        this.f93512d = b0Var;
        int e17 = b0Var.e();
        this.f93513e = e17;
        int d17 = b0Var.d();
        this.f93514f = d17;
        this.f93515g = z17;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.g0 g0Var = list.isEmpty() ? null : (p012xc85e97e9.p103xe821e364.p104xd1075a44.g0) list.get(0);
        if (g0Var == null || g0Var.f93557a != 0 || g0Var.f93558b != 0) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.g0 g0Var2 = new p012xc85e97e9.p103xe821e364.p104xd1075a44.g0();
            g0Var2.f93557a = 0;
            g0Var2.f93558b = 0;
            g0Var2.f93560d = false;
            g0Var2.f93559c = 0;
            g0Var2.f93561e = false;
            list.add(0, g0Var2);
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.g0 g0Var3 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.g0) list.get(size);
            int i17 = g0Var3.f93557a;
            int i18 = g0Var3.f93559c;
            int i19 = i17 + i18;
            int i27 = g0Var3.f93558b + i18;
            boolean z18 = this.f93515g;
            int[] iArr3 = this.f93511c;
            int[] iArr4 = this.f93510b;
            if (z18) {
                while (e17 > i19) {
                    int i28 = e17 - 1;
                    if (iArr4[i28] == 0) {
                        c(e17, d17, size, false);
                    }
                    e17 = i28;
                }
                while (d17 > i27) {
                    int i29 = d17 - 1;
                    if (iArr3[i29] == 0) {
                        c(e17, d17, size, true);
                    }
                    d17 = i29;
                }
            }
            for (int i37 = 0; i37 < g0Var3.f93559c; i37++) {
                int i38 = g0Var3.f93557a + i37;
                int i39 = g0Var3.f93558b + i37;
                int i47 = this.f93512d.a(i38, i39) ? 1 : 2;
                iArr4[i38] = (i39 << 5) | i47;
                iArr3[i39] = (i38 << 5) | i47;
            }
            e17 = g0Var3.f93557a;
            d17 = g0Var3.f93558b;
        }
    }

    public static p012xc85e97e9.p103xe821e364.p104xd1075a44.e0 d(java.util.List list, int i17, boolean z17) {
        int size = list.size() - 1;
        while (size >= 0) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.e0 e0Var = (p012xc85e97e9.p103xe821e364.p104xd1075a44.e0) list.get(size);
            if (e0Var.f93538a == i17 && e0Var.f93540c == z17) {
                list.remove(size);
                while (size < list.size()) {
                    ((p012xc85e97e9.p103xe821e364.p104xd1075a44.e0) list.get(size)).f93539b += z17 ? 1 : -1;
                    size++;
                }
                return e0Var;
            }
            size--;
        }
        return null;
    }

    public void a(p012xc85e97e9.p103xe821e364.p104xd1075a44.r1 r1Var) {
        java.lang.String str;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.g0 g0Var;
        int i17;
        java.lang.String str2;
        int[] iArr;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.l lVar = r1Var instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.l ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.l) r1Var : new p012xc85e97e9.p103xe821e364.p104xd1075a44.l(r1Var);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List list = this.f93509a;
        int size = list.size() - 1;
        int i18 = this.f93513e;
        int i19 = this.f93514f;
        while (size >= 0) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.g0 g0Var2 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.g0) list.get(size);
            int i27 = g0Var2.f93559c;
            int i28 = g0Var2.f93557a + i27;
            int i29 = g0Var2.f93558b + i27;
            java.lang.String str3 = " ";
            int[] iArr2 = this.f93510b;
            boolean z17 = this.f93515g;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.b0 b0Var = this.f93512d;
            if (i28 < i18) {
                int i37 = i18 - i28;
                if (z17) {
                    int i38 = i37 - 1;
                    while (i38 >= 0) {
                        java.util.List list2 = list;
                        int i39 = i28 + i38;
                        int i47 = iArr2[i39];
                        int i48 = size;
                        int i49 = i47 & 31;
                        if (i49 != 0) {
                            iArr = iArr2;
                            if (i49 == 4 || i49 == 8) {
                                int i57 = i47 >> 5;
                                g0Var = g0Var2;
                                i17 = i27;
                                p012xc85e97e9.p103xe821e364.p104xd1075a44.e0 d17 = d(arrayList, i57, false);
                                str2 = str3;
                                lVar.d(i39, d17.f93539b - 1);
                                if (i49 == 4) {
                                    lVar.a(d17.f93539b - 1, 1, b0Var.c(i39, i57));
                                }
                            } else {
                                if (i49 != 16) {
                                    throw new java.lang.IllegalStateException("unknown flag for pos " + i39 + str3 + java.lang.Long.toBinaryString(i49));
                                }
                                arrayList.add(new p012xc85e97e9.p103xe821e364.p104xd1075a44.e0(i39, i39, true));
                                g0Var = g0Var2;
                                i17 = i27;
                                str2 = str3;
                            }
                        } else {
                            g0Var = g0Var2;
                            i17 = i27;
                            str2 = str3;
                            iArr = iArr2;
                            int i58 = 1;
                            lVar.c(i39, 1);
                            java.util.Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((p012xc85e97e9.p103xe821e364.p104xd1075a44.e0) it.next()).f93539b -= i58;
                                i58 = 1;
                            }
                        }
                        i38--;
                        list = list2;
                        g0Var2 = g0Var;
                        size = i48;
                        iArr2 = iArr;
                        i27 = i17;
                        str3 = str2;
                    }
                } else {
                    lVar.c(i28, i37);
                }
            }
            java.util.List list3 = list;
            int i59 = size;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.g0 g0Var3 = g0Var2;
            int i66 = i27;
            java.lang.String str4 = str3;
            int[] iArr3 = iArr2;
            if (i29 < i19) {
                int i67 = i19 - i29;
                if (z17) {
                    int i68 = i67 - 1;
                    while (i68 >= 0) {
                        int i69 = i29 + i68;
                        int i76 = this.f93511c[i69];
                        int i77 = i76 & 31;
                        if (i77 != 0) {
                            if (i77 == 4) {
                                str = str4;
                            } else if (i77 == 8) {
                                str = str4;
                            } else {
                                if (i77 != 16) {
                                    throw new java.lang.IllegalStateException("unknown flag for pos " + i69 + str4 + java.lang.Long.toBinaryString(i77));
                                }
                                arrayList.add(new p012xc85e97e9.p103xe821e364.p104xd1075a44.e0(i69, i28, false));
                                str = str4;
                            }
                            int i78 = i76 >> 5;
                            lVar.d(d(arrayList, i78, true).f93539b, i28);
                            if (i77 == 4) {
                                lVar.a(i28, 1, b0Var.c(i78, i69));
                            }
                        } else {
                            str = str4;
                            int i79 = 1;
                            lVar.b(i28, 1);
                            java.util.Iterator it6 = arrayList.iterator();
                            while (it6.hasNext()) {
                                ((p012xc85e97e9.p103xe821e364.p104xd1075a44.e0) it6.next()).f93539b += i79;
                                i79 = 1;
                            }
                        }
                        i68--;
                        str4 = str;
                    }
                } else {
                    lVar.b(i28, i67);
                }
            }
            int i86 = i66 - 1;
            while (i86 >= 0) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.g0 g0Var4 = g0Var3;
                int i87 = g0Var4.f93557a;
                if ((iArr3[i87 + i86] & 31) == 2) {
                    lVar.a(i87 + i86, 1, b0Var.c(i87 + i86, g0Var4.f93558b + i86));
                }
                i86--;
                g0Var3 = g0Var4;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.g0 g0Var5 = g0Var3;
            int i88 = g0Var5.f93557a;
            i19 = g0Var5.f93558b;
            size = i59 - 1;
            i18 = i88;
            list = list3;
        }
        lVar.e();
    }

    public void b(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f2Var) {
        a(new p012xc85e97e9.p103xe821e364.p104xd1075a44.d(f2Var));
    }

    public final boolean c(int i17, int i18, int i19, boolean z17) {
        int i27;
        int i28;
        int i29;
        if (z17) {
            i18--;
            i28 = i17;
            i27 = i18;
        } else {
            i27 = i17 - 1;
            i28 = i27;
        }
        while (i19 >= 0) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.g0 g0Var = (p012xc85e97e9.p103xe821e364.p104xd1075a44.g0) this.f93509a.get(i19);
            int i37 = g0Var.f93557a;
            int i38 = g0Var.f93559c;
            int i39 = i37 + i38;
            int i47 = g0Var.f93558b + i38;
            int[] iArr = this.f93511c;
            int[] iArr2 = this.f93510b;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.b0 b0Var = this.f93512d;
            if (z17) {
                for (int i48 = i28 - 1; i48 >= i39; i48--) {
                    if (b0Var.b(i48, i27)) {
                        i29 = b0Var.a(i48, i27) ? 8 : 4;
                        iArr[i27] = (i48 << 5) | 16;
                        iArr2[i48] = (i27 << 5) | i29;
                        return true;
                    }
                }
            } else {
                for (int i49 = i18 - 1; i49 >= i47; i49--) {
                    if (b0Var.b(i27, i49)) {
                        i29 = b0Var.a(i27, i49) ? 8 : 4;
                        int i57 = i17 - 1;
                        iArr2[i57] = (i49 << 5) | 16;
                        iArr[i49] = (i57 << 5) | i29;
                        return true;
                    }
                }
            }
            i28 = g0Var.f93557a;
            i18 = g0Var.f93558b;
            i19--;
        }
        return false;
    }
}
