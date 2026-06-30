package androidx.recyclerview.widget;

/* loaded from: classes16.dex */
public class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f11976a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f11977b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f11978c;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.recyclerview.widget.b0 f11979d;

    /* renamed from: e, reason: collision with root package name */
    public final int f11980e;

    /* renamed from: f, reason: collision with root package name */
    public final int f11981f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f11982g;

    public c0(androidx.recyclerview.widget.b0 b0Var, java.util.List list, int[] iArr, int[] iArr2, boolean z17) {
        this.f11976a = list;
        this.f11977b = iArr;
        this.f11978c = iArr2;
        java.util.Arrays.fill(iArr, 0);
        java.util.Arrays.fill(iArr2, 0);
        this.f11979d = b0Var;
        int e17 = b0Var.e();
        this.f11980e = e17;
        int d17 = b0Var.d();
        this.f11981f = d17;
        this.f11982g = z17;
        androidx.recyclerview.widget.g0 g0Var = list.isEmpty() ? null : (androidx.recyclerview.widget.g0) list.get(0);
        if (g0Var == null || g0Var.f12024a != 0 || g0Var.f12025b != 0) {
            androidx.recyclerview.widget.g0 g0Var2 = new androidx.recyclerview.widget.g0();
            g0Var2.f12024a = 0;
            g0Var2.f12025b = 0;
            g0Var2.f12027d = false;
            g0Var2.f12026c = 0;
            g0Var2.f12028e = false;
            list.add(0, g0Var2);
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            androidx.recyclerview.widget.g0 g0Var3 = (androidx.recyclerview.widget.g0) list.get(size);
            int i17 = g0Var3.f12024a;
            int i18 = g0Var3.f12026c;
            int i19 = i17 + i18;
            int i27 = g0Var3.f12025b + i18;
            boolean z18 = this.f11982g;
            int[] iArr3 = this.f11978c;
            int[] iArr4 = this.f11977b;
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
            for (int i37 = 0; i37 < g0Var3.f12026c; i37++) {
                int i38 = g0Var3.f12024a + i37;
                int i39 = g0Var3.f12025b + i37;
                int i47 = this.f11979d.a(i38, i39) ? 1 : 2;
                iArr4[i38] = (i39 << 5) | i47;
                iArr3[i39] = (i38 << 5) | i47;
            }
            e17 = g0Var3.f12024a;
            d17 = g0Var3.f12025b;
        }
    }

    public static androidx.recyclerview.widget.e0 d(java.util.List list, int i17, boolean z17) {
        int size = list.size() - 1;
        while (size >= 0) {
            androidx.recyclerview.widget.e0 e0Var = (androidx.recyclerview.widget.e0) list.get(size);
            if (e0Var.f12005a == i17 && e0Var.f12007c == z17) {
                list.remove(size);
                while (size < list.size()) {
                    ((androidx.recyclerview.widget.e0) list.get(size)).f12006b += z17 ? 1 : -1;
                    size++;
                }
                return e0Var;
            }
            size--;
        }
        return null;
    }

    public void a(androidx.recyclerview.widget.r1 r1Var) {
        java.lang.String str;
        androidx.recyclerview.widget.g0 g0Var;
        int i17;
        java.lang.String str2;
        int[] iArr;
        androidx.recyclerview.widget.l lVar = r1Var instanceof androidx.recyclerview.widget.l ? (androidx.recyclerview.widget.l) r1Var : new androidx.recyclerview.widget.l(r1Var);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List list = this.f11976a;
        int size = list.size() - 1;
        int i18 = this.f11980e;
        int i19 = this.f11981f;
        while (size >= 0) {
            androidx.recyclerview.widget.g0 g0Var2 = (androidx.recyclerview.widget.g0) list.get(size);
            int i27 = g0Var2.f12026c;
            int i28 = g0Var2.f12024a + i27;
            int i29 = g0Var2.f12025b + i27;
            java.lang.String str3 = " ";
            int[] iArr2 = this.f11977b;
            boolean z17 = this.f11982g;
            androidx.recyclerview.widget.b0 b0Var = this.f11979d;
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
                                androidx.recyclerview.widget.e0 d17 = d(arrayList, i57, false);
                                str2 = str3;
                                lVar.d(i39, d17.f12006b - 1);
                                if (i49 == 4) {
                                    lVar.a(d17.f12006b - 1, 1, b0Var.c(i39, i57));
                                }
                            } else {
                                if (i49 != 16) {
                                    throw new java.lang.IllegalStateException("unknown flag for pos " + i39 + str3 + java.lang.Long.toBinaryString(i49));
                                }
                                arrayList.add(new androidx.recyclerview.widget.e0(i39, i39, true));
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
                                ((androidx.recyclerview.widget.e0) it.next()).f12006b -= i58;
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
            androidx.recyclerview.widget.g0 g0Var3 = g0Var2;
            int i66 = i27;
            java.lang.String str4 = str3;
            int[] iArr3 = iArr2;
            if (i29 < i19) {
                int i67 = i19 - i29;
                if (z17) {
                    int i68 = i67 - 1;
                    while (i68 >= 0) {
                        int i69 = i29 + i68;
                        int i76 = this.f11978c[i69];
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
                                arrayList.add(new androidx.recyclerview.widget.e0(i69, i28, false));
                                str = str4;
                            }
                            int i78 = i76 >> 5;
                            lVar.d(d(arrayList, i78, true).f12006b, i28);
                            if (i77 == 4) {
                                lVar.a(i28, 1, b0Var.c(i78, i69));
                            }
                        } else {
                            str = str4;
                            int i79 = 1;
                            lVar.b(i28, 1);
                            java.util.Iterator it6 = arrayList.iterator();
                            while (it6.hasNext()) {
                                ((androidx.recyclerview.widget.e0) it6.next()).f12006b += i79;
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
                androidx.recyclerview.widget.g0 g0Var4 = g0Var3;
                int i87 = g0Var4.f12024a;
                if ((iArr3[i87 + i86] & 31) == 2) {
                    lVar.a(i87 + i86, 1, b0Var.c(i87 + i86, g0Var4.f12025b + i86));
                }
                i86--;
                g0Var3 = g0Var4;
            }
            androidx.recyclerview.widget.g0 g0Var5 = g0Var3;
            int i88 = g0Var5.f12024a;
            i19 = g0Var5.f12025b;
            size = i59 - 1;
            i18 = i88;
            list = list3;
        }
        lVar.e();
    }

    public void b(androidx.recyclerview.widget.f2 f2Var) {
        a(new androidx.recyclerview.widget.d(f2Var));
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
            androidx.recyclerview.widget.g0 g0Var = (androidx.recyclerview.widget.g0) this.f11976a.get(i19);
            int i37 = g0Var.f12024a;
            int i38 = g0Var.f12026c;
            int i39 = i37 + i38;
            int i47 = g0Var.f12025b + i38;
            int[] iArr = this.f11978c;
            int[] iArr2 = this.f11977b;
            androidx.recyclerview.widget.b0 b0Var = this.f11979d;
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
            i28 = g0Var.f12024a;
            i18 = g0Var.f12025b;
            i19--;
        }
        return false;
    }
}
