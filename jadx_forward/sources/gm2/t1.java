package gm2;

/* loaded from: classes3.dex */
public final class t1 implements gm2.z1 {

    /* renamed from: c, reason: collision with root package name */
    public static final gm2.r1 f355014c = new gm2.r1(null);

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f355015d = jz5.h.b(gm2.m1.f354965d);

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f355016e = jz5.h.b(gm2.n1.f354968d);

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f355017f = jz5.h.b(gm2.o1.f354990d);

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f355018g = jz5.h.b(gm2.l1.f354961d);

    /* renamed from: h, reason: collision with root package name */
    public static final jz5.g f355019h = jz5.h.b(gm2.q1.f354997d);

    /* renamed from: i, reason: collision with root package name */
    public static final jz5.g f355020i = jz5.h.b(gm2.k1.f354956d);

    /* renamed from: j, reason: collision with root package name */
    public static final jz5.g f355021j = jz5.h.b(gm2.p1.f354992d);

    /* renamed from: a, reason: collision with root package name */
    public final gm2.c2 f355022a;

    /* renamed from: b, reason: collision with root package name */
    public final gm2.e2 f355023b;

    public t1(gm2.c2 spanMode, gm2.e2 sizeMode) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(spanMode, "spanMode");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sizeMode, "sizeMode");
        this.f355022a = spanMode;
        this.f355023b = sizeMode;
    }

    @Override // gm2.z1
    public int a(java.lang.Object obj) {
        ((java.lang.Number) obj).intValue();
        return android.graphics.Color.parseColor("#FFFFFF");
    }

    @Override // gm2.z1
    public /* bridge */ /* synthetic */ int b(java.lang.Object obj) {
        ((java.lang.Number) obj).intValue();
        return 1;
    }

    @Override // gm2.z1
    public /* bridge */ /* synthetic */ int c(java.lang.Object obj) {
        ((java.lang.Number) obj).intValue();
        return 0;
    }

    @Override // gm2.z1
    public int d(java.lang.Object obj) {
        return f355014c.b(((java.lang.Number) obj).intValue());
    }

    @Override // gm2.z1
    public int[] e(java.lang.Object obj) {
        int[] iArr;
        int intValue = ((java.lang.Number) obj).intValue();
        int a17 = ym5.x.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 16.0f);
        int a18 = ym5.x.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 20.0f);
        int a19 = ym5.x.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 11.0f);
        boolean z17 = 1 <= intValue && intValue < 10;
        gm2.e2 e2Var = this.f355023b;
        if (z17) {
            iArr = new int[2];
            int ordinal = e2Var.ordinal();
            if (ordinal == 1) {
                iArr[0] = (int) ((a18 * 20.0f) / 30.0f);
                iArr[1] = a18;
            } else if (ordinal != 2) {
                iArr[0] = (int) ((a17 * 20.0f) / 30.0f);
                iArr[1] = a17;
            } else {
                iArr[0] = (int) ((a19 * 20.0f) / 30.0f);
                iArr[1] = a19;
            }
        } else {
            if (10 <= intValue && intValue < 20) {
                iArr = new int[2];
                int ordinal2 = e2Var.ordinal();
                if (ordinal2 == 1) {
                    iArr[0] = (int) ((a18 * 25.0f) / 30.0f);
                    iArr[1] = a18;
                } else if (ordinal2 != 2) {
                    iArr[0] = (int) ((a17 * 25.0f) / 30.0f);
                    iArr[1] = a17;
                } else {
                    iArr[0] = (int) ((a19 * 25.0f) / 30.0f);
                    iArr[1] = a19;
                }
            } else {
                if ((((((20 <= intValue && intValue < 30) || (30 <= intValue && intValue < 40)) || (40 <= intValue && intValue < 50)) || (50 <= intValue && intValue < 60)) || (60 <= intValue && intValue < 70)) || (70 <= intValue && intValue <= Integer.MAX_VALUE)) {
                    iArr = new int[2];
                    int ordinal3 = e2Var.ordinal();
                    if (ordinal3 == 1) {
                        iArr[0] = a18;
                        iArr[1] = a18;
                    } else if (ordinal3 != 2) {
                        iArr[0] = a17;
                        iArr[1] = a17;
                    } else {
                        iArr[0] = a19;
                        iArr[1] = a19;
                    }
                } else {
                    iArr = new int[2];
                    int ordinal4 = e2Var.ordinal();
                    if (ordinal4 == 1) {
                        iArr[0] = a18;
                        iArr[1] = a18;
                    } else if (ordinal4 != 2) {
                        iArr[0] = a17;
                        iArr[1] = a17;
                    } else {
                        iArr[0] = a19;
                        iArr[1] = a19;
                    }
                }
            }
        }
        return iArr;
    }

    @Override // gm2.z1
    public /* bridge */ /* synthetic */ int f(java.lang.Object obj) {
        return i(((java.lang.Number) obj).intValue());
    }

    @Override // gm2.z1
    public gm2.u1 g(int i17) {
        int B = zl2.q4.f555466a.B(i17);
        boolean z17 = 70 <= B && B < 80;
        gm2.c2 c2Var = this.f355022a;
        gm2.r1 r1Var = f355014c;
        if (z17) {
            float i18 = gm2.c1.f354853a.i();
            gm2.c2 c2Var2 = gm2.c2.f354882h;
            gm2.s1 d17 = r1Var.d();
            return new gm2.u1(i18, c2Var == c2Var2 ? d17.f355004b : d17.f355006d, c2Var == c2Var2 ? r1Var.d().f355005c : r1Var.d().f355007e, c2Var == gm2.c2.f354884m ? r1Var.d().f355010h : r1Var.d().f355011i, r1Var.d().f355008f, r1Var.d().f355009g);
        }
        if (80 <= B && B < 90) {
            float i19 = gm2.c1.f354853a.i();
            gm2.c2 c2Var3 = gm2.c2.f354882h;
            gm2.s1 e17 = r1Var.e();
            return new gm2.u1(i19, c2Var == c2Var3 ? e17.f355004b : e17.f355006d, c2Var == c2Var3 ? r1Var.e().f355005c : r1Var.e().f355007e, c2Var == gm2.c2.f354884m ? r1Var.e().f355010h : r1Var.e().f355011i, r1Var.e().f355008f, r1Var.e().f355009g);
        }
        if (90 <= B && B < 100) {
            float i27 = gm2.c1.f354853a.i();
            gm2.c2 c2Var4 = gm2.c2.f354882h;
            gm2.s1 f17 = r1Var.f();
            return new gm2.u1(i27, c2Var == c2Var4 ? f17.f355004b : f17.f355006d, c2Var == c2Var4 ? r1Var.f().f355005c : r1Var.f().f355007e, c2Var == gm2.c2.f354884m ? r1Var.f().f355010h : r1Var.f().f355011i, r1Var.f().f355008f, r1Var.f().f355009g);
        }
        if (!(100 <= B && B <= Integer.MAX_VALUE)) {
            return null;
        }
        float i28 = gm2.c1.f354853a.i();
        gm2.c2 c2Var5 = gm2.c2.f354882h;
        gm2.s1 c17 = r1Var.c();
        return new gm2.u1(i28, c2Var == c2Var5 ? c17.f355004b : c17.f355006d, c2Var == c2Var5 ? r1Var.c().f355005c : r1Var.c().f355007e, c2Var == gm2.c2.f354884m ? r1Var.c().f355010h : r1Var.c().f355011i, r1Var.c().f355008f, r1Var.c().f355009g);
    }

    @Override // gm2.z1
    public gm2.v1 h(int i17) {
        int B = zl2.q4.f555466a.B(i17);
        boolean z17 = 70 <= B && B < 80;
        gm2.r1 r1Var = f355014c;
        if (z17) {
            return new gm2.v1(1000, 3000, r1Var.d().f355003a, r1Var.g(), r1Var.a(), null, 0);
        }
        boolean z18 = 80 <= B && B < 90;
        jz5.g gVar = f355021j;
        if (z18) {
            android.graphics.Bitmap bitmap = r1Var.e().f355003a;
            android.graphics.Bitmap g17 = r1Var.g();
            android.graphics.Bitmap a17 = r1Var.a();
            java.lang.Object mo141623x754a37bb = ((jz5.n) gVar).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
            return new gm2.v1(1000, 3000, bitmap, g17, a17, (android.graphics.Bitmap) mo141623x754a37bb, 80);
        }
        if (90 <= B && B < 100) {
            android.graphics.Bitmap bitmap2 = r1Var.f().f355003a;
            android.graphics.Bitmap g18 = r1Var.g();
            android.graphics.Bitmap a18 = r1Var.a();
            java.lang.Object mo141623x754a37bb2 = ((jz5.n) gVar).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb2, "getValue(...)");
            return new gm2.v1(1000, 3000, bitmap2, g18, a18, (android.graphics.Bitmap) mo141623x754a37bb2, 90);
        }
        if (!(100 <= B && B <= Integer.MAX_VALUE)) {
            return null;
        }
        android.graphics.Bitmap bitmap3 = r1Var.c().f355003a;
        android.graphics.Bitmap g19 = r1Var.g();
        android.graphics.Bitmap a19 = r1Var.a();
        java.lang.Object mo141623x754a37bb3 = ((jz5.n) gVar).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb3, "getValue(...)");
        return new gm2.v1(1000, 3000, bitmap3, g19, a19, (android.graphics.Bitmap) mo141623x754a37bb3, 100);
    }

    public int i(int i17) {
        int ordinal = this.f355022a.ordinal();
        if (ordinal == 1) {
            if (1 <= i17 && i17 < 10) {
                return com.p314xaae8f345.mm.R.C30861xcebc809e.a9e;
            }
            if (10 <= i17 && i17 < 20) {
                return com.p314xaae8f345.mm.R.C30861xcebc809e.a9c;
            }
            if (20 <= i17 && i17 < 30) {
                return com.p314xaae8f345.mm.R.C30861xcebc809e.a9g;
            }
            if (30 <= i17 && i17 < 40) {
                return com.p314xaae8f345.mm.R.C30861xcebc809e.a9i;
            }
            if (40 <= i17 && i17 < 50) {
                return com.p314xaae8f345.mm.R.C30861xcebc809e.a9k;
            }
            if (50 <= i17 && i17 < 60) {
                return com.p314xaae8f345.mm.R.C30861xcebc809e.a9m;
            }
            if (60 <= i17 && i17 < 70) {
                return com.p314xaae8f345.mm.R.C30861xcebc809e.a9o;
            }
            if (70 <= i17 && i17 < 80) {
                return com.p314xaae8f345.mm.R.C30861xcebc809e.a9q;
            }
            if (80 <= i17 && i17 < 90) {
                return com.p314xaae8f345.mm.R.C30861xcebc809e.a9r;
            }
            if (90 <= i17 && i17 < 100) {
                return com.p314xaae8f345.mm.R.C30861xcebc809e.a9s;
            }
            return 100 <= i17 && i17 <= Integer.MAX_VALUE ? com.p314xaae8f345.mm.R.C30861xcebc809e.a9a : com.p314xaae8f345.mm.R.C30861xcebc809e.a9e;
        }
        if (ordinal != 3) {
            if (1 <= i17 && i17 < 10) {
                return com.p314xaae8f345.mm.R.C30861xcebc809e.a9d;
            }
            if (10 <= i17 && i17 < 20) {
                return com.p314xaae8f345.mm.R.C30861xcebc809e.a9b;
            }
            if (20 <= i17 && i17 < 30) {
                return com.p314xaae8f345.mm.R.C30861xcebc809e.a9f;
            }
            if (30 <= i17 && i17 < 40) {
                return com.p314xaae8f345.mm.R.C30861xcebc809e.a9h;
            }
            if (40 <= i17 && i17 < 50) {
                return com.p314xaae8f345.mm.R.C30861xcebc809e.a9j;
            }
            if (50 <= i17 && i17 < 60) {
                return com.p314xaae8f345.mm.R.C30861xcebc809e.a9l;
            }
            if (60 <= i17 && i17 < 70) {
                return com.p314xaae8f345.mm.R.C30861xcebc809e.a9n;
            }
            if (70 <= i17 && i17 < 80) {
                return com.p314xaae8f345.mm.R.C30861xcebc809e.a9p;
            }
            if (80 <= i17 && i17 < 90) {
                return com.p314xaae8f345.mm.R.C30861xcebc809e.a99;
            }
            if (90 <= i17 && i17 < 100) {
                return com.p314xaae8f345.mm.R.C30861xcebc809e.a9_;
            }
            return 100 <= i17 && i17 <= Integer.MAX_VALUE ? com.p314xaae8f345.mm.R.C30861xcebc809e.a98 : com.p314xaae8f345.mm.R.C30861xcebc809e.a9d;
        }
        if (1 <= i17 && i17 < 10) {
            return com.p314xaae8f345.mm.R.C30861xcebc809e.a9d;
        }
        if (10 <= i17 && i17 < 20) {
            return com.p314xaae8f345.mm.R.C30861xcebc809e.a9u;
        }
        if (20 <= i17 && i17 < 30) {
            return com.p314xaae8f345.mm.R.C30861xcebc809e.a9v;
        }
        if (30 <= i17 && i17 < 40) {
            return com.p314xaae8f345.mm.R.C30861xcebc809e.a9w;
        }
        if (40 <= i17 && i17 < 50) {
            return com.p314xaae8f345.mm.R.C30861xcebc809e.a9x;
        }
        if (50 <= i17 && i17 < 60) {
            return com.p314xaae8f345.mm.R.C30861xcebc809e.a9y;
        }
        if (60 <= i17 && i17 < 70) {
            return com.p314xaae8f345.mm.R.C30861xcebc809e.a9z;
        }
        if (70 <= i17 && i17 < 80) {
            return com.p314xaae8f345.mm.R.C30861xcebc809e.a_0;
        }
        if (80 <= i17 && i17 < 90) {
            return com.p314xaae8f345.mm.R.C30861xcebc809e.a_1;
        }
        if (90 <= i17 && i17 < 100) {
            return com.p314xaae8f345.mm.R.C30861xcebc809e.a_2;
        }
        return 100 <= i17 && i17 <= Integer.MAX_VALUE ? com.p314xaae8f345.mm.R.C30861xcebc809e.a9t : com.p314xaae8f345.mm.R.C30861xcebc809e.a9d;
    }

    public /* synthetic */ t1(gm2.c2 c2Var, gm2.e2 e2Var, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i17 & 1) != 0 ? gm2.c2.f354881g : c2Var, (i17 & 2) != 0 ? gm2.e2.f354894g : e2Var);
    }
}
