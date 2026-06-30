package p05;

/* loaded from: classes14.dex */
public final class l4 implements rh0.d0, rh0.e0 {
    public static final p05.z3 R;
    public static final java.lang.String[] S;
    public static final java.lang.String[] T;
    public final int[] A;
    public final long[] B;
    public final int[] C;
    public rh0.b0 D;
    public boolean E;
    public final com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7132x39917fe6 F;
    public final p05.p4 G;
    public boolean H;
    public final java.util.LinkedList I;

    /* renamed from: J, reason: collision with root package name */
    public final java.util.Map f432120J;
    public final java.util.Map K;
    public final java.util.Map L;
    public int M;
    public int N;
    public int O;
    public int P;
    public os0.c Q;

    /* renamed from: a, reason: collision with root package name */
    public final int f432121a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f432122b;

    /* renamed from: c, reason: collision with root package name */
    public final rh0.z f432123c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f432124d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f432125e;

    /* renamed from: f, reason: collision with root package name */
    public long f432126f;

    /* renamed from: g, reason: collision with root package name */
    public int f432127g;

    /* renamed from: h, reason: collision with root package name */
    public int f432128h;

    /* renamed from: i, reason: collision with root package name */
    public int f432129i;

    /* renamed from: j, reason: collision with root package name */
    public long f432130j;

    /* renamed from: k, reason: collision with root package name */
    public long f432131k;

    /* renamed from: l, reason: collision with root package name */
    public long f432132l;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.ArrayList f432133m;

    /* renamed from: n, reason: collision with root package name */
    public long f432134n;

    /* renamed from: o, reason: collision with root package name */
    public int f432135o;

    /* renamed from: p, reason: collision with root package name */
    public long f432136p;

    /* renamed from: q, reason: collision with root package name */
    public final int[] f432137q;

    /* renamed from: r, reason: collision with root package name */
    public final os0.a f432138r;

    /* renamed from: s, reason: collision with root package name */
    public int f432139s;

    /* renamed from: t, reason: collision with root package name */
    public final is0.a f432140t;

    /* renamed from: u, reason: collision with root package name */
    public int f432141u;

    /* renamed from: v, reason: collision with root package name */
    public int f432142v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f432143w;

    /* renamed from: x, reason: collision with root package name */
    public int f432144x;

    /* renamed from: y, reason: collision with root package name */
    public long f432145y;

    /* renamed from: z, reason: collision with root package name */
    public final long[] f432146z;

    static {
        p05.z3 z3Var = new p05.z3(null);
        R = z3Var;
        S = new java.lang.String[]{"/Slimer/natureslim", "/smallhead/smallhead", "/shouquangu/shouquangu", "/shouxiagu/shouxiagu", "/shoubiyi/shoubiyi", "/chin/chin", "/chin/chin1", "/hairline/hairline", "/hairline/hairline1", "/bigeye/bigeye", "/Slimer/boyslim", "/Slimer/girlslim", "/zhailian/zhailian1"};
        T = new java.lang.String[]{"/contour"};
        boolean z17 = p05.e5.f432043a;
        boolean z18 = tq5.k.f502805a;
        tq5.k.f502806b = p05.c5.f432009d;
        z3Var.b();
        com.p314xaae8f345.mm.p2825x7e128009.C22975x1301938d.f39983x4fbc8495.m83793x764b91a2(new p05.y3());
    }

    public l4(int i17) {
        this(i17, false, false, false, false, false, null, null, false, ac1.g.f19x366c91de, null);
    }

    public static int y(p05.l4 l4Var, is0.c cVar, is0.c cVar2, long j17, int i17, boolean z17, boolean z18, int i18, java.lang.Object obj) {
        long j18 = (i18 & 4) != 0 ? 0L : j17;
        int i19 = (i18 & 8) != 0 ? 0 : i17;
        boolean z19 = (i18 & 16) != 0 ? false : z17;
        boolean z27 = (i18 & 32) != 0 ? true : z18;
        l4Var.getClass();
        if (cVar == null || cVar2 == null) {
            return -1;
        }
        return rh0.d0.c(l4Var, cVar.f375928e, cVar2.f375928e, j18, i19, z19, z27, false, 64, null);
    }

    public void A(int i17, int i18, int i19, int i27, int i28) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XLabEffect", "setBeautyConfig: skinSmooth " + i17 + ", eyeMorph " + i18 + ", faceMorph " + i19 + ", skinBright " + i27 + ", eyeBright " + i28);
        if (i17 < 0) {
            p05.q4 q4Var = p05.q4.f432194a;
            i17 = p05.q4.f432195b;
        }
        int[] iArr = this.f432137q;
        iArr[0] = i17;
        if (i18 < 0) {
            p05.q4 q4Var2 = p05.q4.f432194a;
            i18 = p05.q4.f432196c;
        }
        iArr[1] = i18;
        if (i19 < 0) {
            p05.q4 q4Var3 = p05.q4.f432194a;
            i19 = p05.q4.f432197d;
        }
        iArr[2] = i19;
        if (i27 < 0) {
            p05.q4 q4Var4 = p05.q4.f432194a;
            i27 = p05.q4.f432198e;
        }
        iArr[3] = i27;
        if (i28 < 0) {
            p05.q4 q4Var5 = p05.q4.f432194a;
            i28 = p05.q4.f432199f;
        }
        iArr[4] = i28;
    }

    public void B(boolean z17, int i17) {
        if (!z17) {
            h(null, 1.0f);
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        p05.a3 a3Var = p05.a3.f431972a;
        sb6.append(p05.a3.f431974c);
        sb6.append("/LutFilters/DefaultLut");
        h(sb6.toString(), i17 / 100.0f);
    }

    public void C(boolean z17) {
        if (!z17) {
            D(0, 0);
            D(1, 0);
            D(2, 0);
            D(3, 0);
            D(4, 0);
            return;
        }
        int[] iArr = this.f432137q;
        D(0, iArr[0]);
        D(1, iArr[1]);
        D(2, iArr[2]);
        D(3, iArr[3]);
        D(4, iArr[4]);
        p05.q4 q4Var = p05.q4.f432194a;
        p05.q4.f432202i = new p05.b4(this);
    }

    public void D(int i17, int i18) {
        if (this.f432126f == 0) {
            return;
        }
        if (i17 != 5) {
            if (i17 != 8) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XLabEffect", "setEffectLevel: " + i17 + ", " + i18);
                com.p314xaae8f345.mm.p2825x7e128009.C22970xcc6c2095.m83752x32bc72bf(this.f432126f, i17, ((float) i18) / 100.0f, this.f432123c.f477154d);
            } else {
                L(rh0.c0.f477116d, i18);
            }
        } else if (this.f432135o != i18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XLabEffect", "setRosy: " + i18);
            long j17 = this.f432134n;
            if (j17 > 0 && i18 <= 0) {
                com.p314xaae8f345.mm.p2825x7e128009.C22970xcc6c2095.m83739x3c6d5caa(this.f432126f, j17);
                this.f432134n = 0L;
            }
            if (this.f432134n <= 0 && i18 > 0) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                p05.a3 a3Var = p05.a3.f431972a;
                sb6.append(p05.a3.f431974c);
                sb6.append("/LutFilters/WechatRosy/");
                this.f432134n = com.p314xaae8f345.mm.p2825x7e128009.C22970xcc6c2095.m83721x1ef986a(this.f432126f, sb6.toString());
            }
            long j18 = this.f432134n;
            if (j18 > 0 && i18 > 0) {
                com.p314xaae8f345.mm.p2825x7e128009.C22970xcc6c2095.m83753xb899ce6f(this.f432126f, j18, i18 / 100.0f);
            }
            this.f432135o = i18;
        }
        s(i17, i18 > 0);
    }

    public void E(com.p314xaae8f345.mm.p2825x7e128009.InterfaceC22961x9807eced interfaceC22961x9807eced) {
        long j17 = this.f432126f;
        if (j17 == 0) {
            return;
        }
        com.p314xaae8f345.mm.p2825x7e128009.C22970xcc6c2095.b(j17, interfaceC22961x9807eced);
    }

    public void F(com.p314xaae8f345.mm.p1006xc5476f33.p2467x5de743e6.C19568xd45988ab config) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        boolean z17 = false;
        D(0, config.f270132g);
        D(1, config.f270133h);
        D(8, config.f270134i);
        D(3, config.f270135m);
        D(4, config.f270136n);
        D(5, config.f270137o);
        int i17 = config.E;
        long j17 = this.f432126f;
        if (j17 != 0) {
            com.p314xaae8f345.mm.p2825x7e128009.C22970xcc6c2095.m83758xce67c0b5(j17, i17 / 100.0f);
        }
        int i18 = config.f270138p;
        int i19 = config.f270139q;
        long j18 = this.f432126f;
        if (j18 != 0) {
            com.p314xaae8f345.mm.p2825x7e128009.C22970xcc6c2095.m83747xe06cf0b6(j18, i18 / 100.0f, i19 / 100.0f);
        }
        int i27 = config.f270140r;
        long j19 = this.f432126f;
        if (j19 != 0) {
            com.p314xaae8f345.mm.p2825x7e128009.C22970xcc6c2095.m83748xdb41929b(j19, i27 / 100.0f);
        }
        int i28 = config.f270141s;
        long j27 = this.f432126f;
        if (j27 != 0) {
            com.p314xaae8f345.mm.p2825x7e128009.C22970xcc6c2095.m83764x2f0c9cee(j27, i28 / 100.0f);
        }
        L(rh0.c0.f477117e, config.f270142t);
        L(rh0.c0.f477118f, config.f270143u);
        L(rh0.c0.f477119g, config.f270144v);
        L(rh0.c0.f477120h, config.f270145w);
        L(rh0.c0.f477121i, config.f270146x);
        L(rh0.c0.f477122m, config.f270147y);
        L(rh0.c0.f477123n, config.f270148z);
        L(rh0.c0.f477124o, config.A);
        L(rh0.c0.f477125p, config.B);
        L(rh0.c0.f477126q, config.C);
        L(rh0.c0.f477127r, config.D);
        L(rh0.c0.f477128s, config.F);
        rh0.a0[] a0VarArr = rh0.a0.f477111d;
        int i29 = config.G;
        long j28 = this.f432126f;
        if (j28 != 0) {
            long[] jArr = this.B;
            long j29 = jArr[0];
            if (j29 >= 0 || i29 > 0) {
                float f17 = i29 / 100.0f;
                int[] iArr = this.C;
                if (i29 > 0) {
                    if (j29 < 0) {
                        jArr[0] = com.p314xaae8f345.mm.p2825x7e128009.C22970xcc6c2095.m83723x5227fed3(this.f432126f, 0, p05.a3.f431978g + T[0]);
                    }
                    if (iArr[0] != i29) {
                        com.p314xaae8f345.mm.p2825x7e128009.C22970xcc6c2095.m83756xdc67401(this.f432126f, jArr[0], f17);
                    }
                } else if (j29 >= 0) {
                    com.p314xaae8f345.mm.p2825x7e128009.C22970xcc6c2095.m83740xed30d0c0(j28, j29);
                    jArr[0] = -1;
                }
                iArr[0] = i29;
                int length = jArr.length;
                int i37 = 0;
                while (true) {
                    if (i37 >= length) {
                        break;
                    }
                    if (jArr[i37] >= 0) {
                        z17 = true;
                        break;
                    }
                    i37++;
                }
                if (z17) {
                    this.f432129i = this.f432129i | 128 | 2048;
                }
            }
        }
        if (config.f270141s > 40 || config.G > 40 || config.f270138p > 40 || config.f270139q > 40) {
            this.f432129i |= 32768;
        } else {
            this.f432129i &= -32769;
        }
    }

    public void G(long j17, java.lang.String message, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(message, "message");
        long j18 = this.f432126f;
        if (j18 == 0) {
            return;
        }
        com.p314xaae8f345.mm.p2825x7e128009.C22970xcc6c2095.m83738xc50c2c2a(j18, j17, message, message.length(), i17);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000e, code lost:
    
        if (((r4.f432144x & 1024) != 0) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void H(boolean r5) {
        /*
            r4 = this;
            r0 = 0
            r1 = 1024(0x400, float:1.435E-42)
            r2 = 1
            if (r5 == 0) goto L10
            int r3 = r4.f432144x
            r3 = r3 & r1
            if (r3 == 0) goto Ld
            r3 = r2
            goto Le
        Ld:
            r3 = r0
        Le:
            if (r3 == 0) goto L1a
        L10:
            if (r5 != 0) goto L22
            int r3 = r4.f432144x
            r1 = r1 & r3
            if (r1 == 0) goto L18
            r0 = r2
        L18:
            if (r0 == 0) goto L22
        L1a:
            r0 = 10
            r4.s(r0, r5)
            r4.M()
        L22:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p05.l4.H(boolean):void");
    }

    public void I(boolean z17, float f17, rh0.b0 mode) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mode, "mode");
        long j17 = this.f432126f;
        if (j17 == 0) {
            return;
        }
        if (z17 == this.E && mode == this.D) {
            return;
        }
        this.E = z17;
        this.D = mode;
        com.p314xaae8f345.mm.p2825x7e128009.C22970xcc6c2095.m83762x70b1eaab(j17, z17, f17, mode.ordinal());
    }

    public void J(int i17, int i18) {
        if (this.f432128h == i17 && this.f432127g == i18) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XLabEffect", "setSize: " + i17 + ", " + i18);
        this.f432128h = i17;
        this.f432127g = i18;
        this.f432138r.w(i17, i18);
    }

    public void K(boolean z17) {
        if (z17) {
            D(0, this.f432137q[0]);
        } else {
            D(0, 0);
        }
    }

    public void L(rh0.c0 type, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        if (this.f432126f == 0) {
            return;
        }
        int ordinal = type.ordinal();
        long[] jArr = this.f432146z;
        long j17 = jArr[ordinal];
        if (j17 >= 0 || i17 > 0) {
            float f17 = i17 / 100.0f;
            if (i17 > 0 && j17 < 0) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                p05.a3 a3Var = p05.a3.f431972a;
                sb6.append(p05.a3.f431978g);
                sb6.append("/slimer_temp");
                sb6.append(S[ordinal]);
                jArr[ordinal] = com.p314xaae8f345.mm.p2825x7e128009.C22970xcc6c2095.m83719x6246c7a9(this.f432126f, sb6.toString());
                com.p314xaae8f345.mm.p2825x7e128009.C22970xcc6c2095.m83760x4e444bc2(this.f432126f, 0.95f);
            }
            int[] iArr = this.A;
            if (iArr[ordinal] != i17) {
                com.p314xaae8f345.mm.p2825x7e128009.C22970xcc6c2095.m83763x7756cede(this.f432126f, jArr[ordinal], f17);
            }
            iArr[ordinal] = i17;
            int length = jArr.length;
            boolean z17 = false;
            int i18 = 0;
            while (true) {
                if (i18 >= length) {
                    break;
                }
                if (jArr[i18] >= 0) {
                    z17 = true;
                    break;
                }
                i18++;
            }
            if (z17) {
                this.f432129i = this.f432129i | 2048 | 4096;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void M() {
        /*
            r10 = this;
            long r0 = r10.f432126f
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L9
            return
        L9:
            int r0 = r10.f432144x
            r1 = 1024(0x400, float:1.435E-42)
            r1 = r1 & r0
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L14
            r1 = r3
            goto L15
        L14:
            r1 = r2
        L15:
            if (r1 == 0) goto L23
            r1 = 4096(0x1000, float:5.74E-42)
            r0 = r0 & r1
            if (r0 == 0) goto L1e
            r0 = r3
            goto L1f
        L1e:
            r0 = r2
        L1f:
            if (r0 != 0) goto L23
            r6 = r3
            goto L24
        L23:
            r6 = r2
        L24:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "setSegment:"
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r1 = ", "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.XLabEffect"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            long r4 = r10.f432126f
            r7 = 0
            if (r6 == 0) goto L46
            r2 = 4
        L46:
            r8 = r2
            r9 = -1
            com.p314xaae8f345.mm.p2825x7e128009.C22970xcc6c2095.m83761x97f9d37f(r4, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p05.l4.M():void");
    }

    public long d(java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        long j17 = this.f432126f;
        if (j17 == 0) {
            return -1L;
        }
        return com.p314xaae8f345.mm.p2825x7e128009.C22970xcc6c2095.m83723x5227fed3(j17, 0, path);
    }

    public final void e(p05.o4 o4Var, java.util.Map map, yz5.l lVar, yz5.l lVar2, yz5.p pVar) {
        if (this.f432126f == 0) {
            return;
        }
        if (o4Var.f432166a.length() == 0) {
            return;
        }
        java.lang.String str = o4Var.f432166a;
        p05.a4 a4Var = (p05.a4) map.get(str);
        java.lang.String str2 = o4Var.f432169d;
        if (a4Var != null && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(a4Var.f431985a, str2)) {
            lVar2.mo146xb9724478(java.lang.Long.valueOf(a4Var.f431986b));
            map.remove(str);
        }
        if (str2.length() == 0) {
            return;
        }
        if (map.get(str) == null) {
            long longValue = ((java.lang.Number) lVar.mo146xb9724478(str2)).longValue();
            if (longValue != -1) {
                map.put(str, new p05.a4(str2, longValue, 0));
            }
        }
        p05.a4 a4Var2 = (p05.a4) map.get(str);
        if (a4Var2 != null) {
            int i17 = a4Var2.f431987c;
            int i18 = o4Var.f432168c;
            if (i17 != i18) {
                pVar.mo149xb9724478(java.lang.Long.valueOf(a4Var2.f431986b), java.lang.Float.valueOf(i18 / 100.0f));
                a4Var2.f431987c = i18;
            }
        }
    }

    public void f(p05.e2 e2Var) {
        if (e2Var != null) {
            java.util.LinkedList linkedList = this.I;
            if (linkedList.contains(e2Var)) {
                return;
            }
            linkedList.add(e2Var);
        }
    }

    public void g(java.lang.String str, float f17) {
        if (this.f432126f == 0) {
            return;
        }
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.mm.p2825x7e128009.C22970xcc6c2095.m83739x3c6d5caa(this.f432126f, this.f432145y);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XLabEffect", "changeFilter: remove filter " + this.f432145y);
            s(9, false);
            return;
        }
        long j17 = this.f432126f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        this.f432145y = com.p314xaae8f345.mm.p2825x7e128009.C22970xcc6c2095.m83720xcad5cb22(j17, str, f17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XLabEffect", "changeFilter: create filter " + this.f432145y);
        s(9, true);
    }

    public void h(java.lang.String str, float f17) {
        if (this.f432126f == 0) {
            return;
        }
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.mm.p2825x7e128009.C22970xcc6c2095.m83739x3c6d5caa(this.f432126f, this.f432145y);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XLabEffect", "changeFilter: remove filter " + this.f432145y);
            s(9, false);
            return;
        }
        long j17 = this.f432126f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        long m83721x1ef986a = com.p314xaae8f345.mm.p2825x7e128009.C22970xcc6c2095.m83721x1ef986a(j17, str);
        this.f432145y = m83721x1ef986a;
        com.p314xaae8f345.mm.p2825x7e128009.C22970xcc6c2095.m83753xb899ce6f(this.f432126f, m83721x1ef986a, f17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XLabEffect", "changeFilter: create filter " + this.f432145y);
        s(9, true);
    }

    public void i(t85.j jVar) {
        long j17 = this.f432126f;
        if (j17 == 0) {
            return;
        }
        com.p314xaae8f345.mm.p2825x7e128009.C22970xcc6c2095.m83740xed30d0c0(j17, this.f432130j);
        com.p314xaae8f345.mm.p2825x7e128009.C22970xcc6c2095.m83740xed30d0c0(this.f432126f, this.f432131k);
        com.p314xaae8f345.mm.p2825x7e128009.C22970xcc6c2095.m83740xed30d0c0(this.f432126f, this.f432132l);
        java.util.ArrayList arrayList = this.f432133m;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p2825x7e128009.C22970xcc6c2095.m83740xed30d0c0(this.f432126f, ((java.lang.Number) it.next()).longValue());
        }
        this.f432130j = 0L;
        this.f432131k = 0L;
        this.f432132l = 0L;
        arrayList.clear();
        boolean z17 = false;
        s(11, false);
        s(12, false);
        s(13, false);
        if (jVar != null && jVar.a()) {
            z17 = true;
        }
        if (z17) {
            t85.f fVar = jVar.f498014h;
            if (fVar != null) {
                this.f432130j = n(fVar);
                s(11, true);
            }
            t85.f fVar2 = jVar.f498015i;
            if (fVar2 != null) {
                this.f432131k = n(fVar2);
                s(12, true);
            }
            t85.f fVar3 = jVar.f498016j;
            if (fVar3 != null) {
                this.f432132l = n(fVar3);
                s(13, true);
            }
            java.util.ArrayList arrayList2 = jVar.f498017k;
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
            java.util.Iterator it6 = arrayList2.iterator();
            while (it6.hasNext()) {
                arrayList3.add(java.lang.Long.valueOf(n((t85.f) it6.next())));
            }
            arrayList.addAll(arrayList3);
        } else {
            this.f432129i &= -51;
        }
        M();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XLabEffect", "change sticker " + this.f432130j + ", " + this.f432132l + ", " + arrayList);
    }

    public final void j() {
        if (this.f432126f == 0) {
            return;
        }
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        if (this.f432136p < elapsedRealtime) {
            com.p314xaae8f345.mm.p2825x7e128009.C22970xcc6c2095.m83769x73167666(this.f432126f);
            long j17 = this.f432136p + 83;
            this.f432136p = j17;
            if (j17 < elapsedRealtime) {
                this.f432136p = elapsedRealtime;
            }
        }
    }

    public final int k(int i17) {
        if (i17 == 90) {
            return 1;
        }
        if (i17 != 180) {
            return i17 != 270 ? 0 : 3;
        }
        return 2;
    }

    public final void l(int i17, int i18, boolean z17, int i19, boolean z18) {
        is0.a aVar = this.f432140t;
        if (!z17) {
            android.opengl.GLES20.glBindFramebuffer(36160, aVar != null ? aVar.f375920e : -1);
            android.opengl.GLES20.glFramebufferTexture2D(36160, 36064, 3553, i17, 0);
            android.opengl.GLES20.glBindTexture(3553, i18);
            android.opengl.GLES20.glCopyTexImage2D(3553, 0, 32856, 0, 0, this.f432128h, this.f432127g, 0);
            android.opengl.GLES20.glBindFramebuffer(36160, 0);
            android.opengl.GLES20.glBindTexture(3553, 0);
            return;
        }
        if (this.Q == null) {
            this.Q = new os0.c(this.f432128h, this.f432127g, 0, 0, 2, 0, 44, null);
        }
        os0.c cVar = this.Q;
        if (cVar != null) {
            cVar.H = i17;
        }
        if (z18) {
            if (cVar != null) {
                cVar.s(360 - i19);
            }
        } else if (cVar != null) {
            cVar.s(i19);
        }
        os0.c cVar2 = this.Q;
        if (cVar2 != null) {
            cVar2.f429540p = !z18;
        }
        if (cVar2 != null) {
            cVar2.o();
        }
        android.opengl.GLES20.glBindFramebuffer(36160, aVar != null ? aVar.f375920e : -1);
        os0.c cVar3 = this.Q;
        is0.c cVar4 = cVar3 != null ? cVar3.f429533i : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(cVar4);
        android.opengl.GLES20.glFramebufferTexture2D(36160, 36064, 3553, cVar4.f375928e, 0);
        android.opengl.GLES20.glBindTexture(3553, i18);
        android.opengl.GLES20.glCopyTexImage2D(3553, 0, 32856, 0, 0, this.f432128h, this.f432127g, 0);
        android.opengl.GLES20.glBindFramebuffer(36160, 0);
        android.opengl.GLES20.glBindTexture(3553, 0);
    }

    public long m(int i17, java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        long j17 = this.f432126f;
        if (j17 == 0) {
            return -1L;
        }
        return i17 != 0 ? i17 != 1 ? i17 != 2 ? i17 != 3 ? com.p314xaae8f345.mm.p2825x7e128009.C22970xcc6c2095.m83722xd6564cd3(j17, 4, path) : com.p314xaae8f345.mm.p2825x7e128009.C22970xcc6c2095.m83722xd6564cd3(j17, 3, path) : com.p314xaae8f345.mm.p2825x7e128009.C22970xcc6c2095.m83722xd6564cd3(j17, 2, path) : com.p314xaae8f345.mm.p2825x7e128009.C22970xcc6c2095.m83722xd6564cd3(j17, 1, path) : com.p314xaae8f345.mm.p2825x7e128009.C22970xcc6c2095.m83722xd6564cd3(j17, 0, path);
    }

    public long n(t85.f sticker) {
        boolean z17;
        boolean z18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sticker, "sticker");
        if (this.f432126f == 0) {
            return -1L;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XLabEffect", "create sticker: " + sticker.f498001d + ' ' + sticker.f498000c);
        this.f432129i = this.f432129i | 2 | 4;
        java.util.Collection values = sticker.f498003f.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
        java.util.Collection collection = values;
        if (!collection.isEmpty()) {
            java.util.Iterator it = collection.iterator();
            while (it.hasNext()) {
                int i17 = ((t85.e) it.next()).f497993b;
                if (10 <= i17 && i17 < 18) {
                    z17 = true;
                    break;
                }
            }
        }
        z17 = false;
        if (z17) {
            this.f432129i |= 32;
        }
        java.util.Collection values2 = sticker.f498003f.values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values2, "<get-values>(...)");
        java.util.Collection collection2 = values2;
        if (!collection2.isEmpty()) {
            java.util.Iterator it6 = collection2.iterator();
            while (it6.hasNext()) {
                int i18 = ((t85.e) it6.next()).f497993b;
                if (100 <= i18 && i18 < 200) {
                    z18 = true;
                    break;
                }
            }
        }
        z18 = false;
        if (z18) {
            this.f432129i |= 16;
        }
        java.lang.String str = sticker.f498000c;
        switch (str.hashCode()) {
            case -2052467665:
                if (str.equals("Sticker2D")) {
                    return com.p314xaae8f345.mm.p2825x7e128009.C22970xcc6c2095.m83723x5227fed3(this.f432126f, 0, sticker.f498001d);
                }
                break;
            case -1890090921:
                if (str.equals("StickerFixed")) {
                    return com.p314xaae8f345.mm.p2825x7e128009.C22970xcc6c2095.m83723x5227fed3(this.f432126f, 2, sticker.f498001d);
                }
                break;
            case -964830573:
                if (str.equals("FaceDeformation")) {
                    return com.p314xaae8f345.mm.p2825x7e128009.C22970xcc6c2095.m83723x5227fed3(this.f432126f, 3, sticker.f498001d);
                }
                break;
            case -656591085:
                if (str.equals("Segment")) {
                    return com.p314xaae8f345.mm.p2825x7e128009.C22970xcc6c2095.m83723x5227fed3(this.f432126f, 1, sticker.f498001d);
                }
                break;
        }
        return com.p314xaae8f345.mm.p2825x7e128009.C22970xcc6c2095.m83723x5227fed3(this.f432126f, 0, sticker.f498001d);
    }

    public void o() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("destroy: ");
        sb6.append(this.f432126f);
        sb6.append(' ');
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XLabEffect", sb6.toString());
        p05.q4 q4Var = p05.q4.f432194a;
        p05.q4.f432202i = null;
        os0.c cVar = this.Q;
        if (cVar != null) {
            cVar.n();
        }
        this.f432138r.n();
        if (this.f432126f != 0) {
            int i17 = 0;
            for (java.lang.Object obj : this.f432120J.entrySet()) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                com.p314xaae8f345.mm.p2825x7e128009.C22970xcc6c2095.m83740xed30d0c0(this.f432126f, ((p05.a4) ((java.util.Map.Entry) obj).getValue()).f431986b);
                i17 = i18;
            }
            int i19 = 0;
            for (java.lang.Object obj2 : this.K.entrySet()) {
                int i27 = i19 + 1;
                if (i19 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                com.p314xaae8f345.mm.p2825x7e128009.C22970xcc6c2095.m83739x3c6d5caa(this.f432126f, ((p05.a4) ((java.util.Map.Entry) obj2).getValue()).f431986b);
                i19 = i27;
            }
            int i28 = 0;
            for (java.lang.Object obj3 : this.L.entrySet()) {
                int i29 = i28 + 1;
                if (i28 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                com.p314xaae8f345.mm.p2825x7e128009.C22970xcc6c2095.m83740xed30d0c0(this.f432126f, ((p05.a4) ((java.util.Map.Entry) obj3).getValue()).f431986b);
                i28 = i29;
            }
            com.p314xaae8f345.mm.p2825x7e128009.C22970xcc6c2095.m83740xed30d0c0(this.f432126f, this.f432130j);
            com.p314xaae8f345.mm.p2825x7e128009.C22970xcc6c2095.m83740xed30d0c0(this.f432126f, this.f432131k);
            com.p314xaae8f345.mm.p2825x7e128009.C22970xcc6c2095.m83740xed30d0c0(this.f432126f, this.f432132l);
            java.util.Iterator it = this.f432133m.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p2825x7e128009.C22970xcc6c2095.m83740xed30d0c0(this.f432126f, ((java.lang.Number) it.next()).longValue());
            }
            com.p314xaae8f345.mm.p2825x7e128009.C22970xcc6c2095.b(this.f432126f, null);
            com.p314xaae8f345.mm.p2825x7e128009.C22970xcc6c2095.m83724x62cd7fac(this.f432126f);
            com.p314xaae8f345.mm.p2825x7e128009.C22969x864e13f4.f39979x4fbc8495.m83715xc9bb9db2(this.f432126f);
            this.f432126f = 0L;
        } else {
            is0.a aVar = this.f432140t;
            if (aVar != null) {
                aVar.close();
            }
        }
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_wevision_data_report, false)) {
            this.F.k();
        }
    }

    public int p(java.nio.Buffer dataBuffer, int i17, int i18) {
        java.lang.Object obj;
        int i19;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataBuffer, "dataBuffer");
        long j17 = this.f432126f;
        if (j17 == 0) {
            return -1;
        }
        if (!(j17 != 0 ? com.p314xaae8f345.mm.p2825x7e128009.C22970xcc6c2095.m83737xfa794f2a(j17) : false)) {
            this.f432143w = true;
            return 0;
        }
        if (this.f432141u != i17 || this.f432142v != i18) {
            this.f432141u = i17;
            this.f432142v = i18;
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        android.os.SystemClock.elapsedRealtime();
        p05.p4 p4Var = this.G;
        p4Var.getClass();
        p4Var.f432185h = android.os.SystemClock.elapsedRealtime();
        java.util.LinkedList linkedList = this.I;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Integer.valueOf(((p05.e2) it.next()).a()));
        }
        java.util.Iterator it6 = arrayList.iterator();
        if (it6.hasNext()) {
            java.lang.Object next = it6.next();
            while (it6.hasNext()) {
                next = java.lang.Integer.valueOf(((java.lang.Number) next).intValue() | ((java.lang.Number) it6.next()).intValue());
            }
            obj = next;
        } else {
            obj = null;
        }
        java.lang.Integer num = (java.lang.Integer) obj;
        int intValue = (num != null ? num.intValue() : 0) | this.f432129i;
        rh0.x xVar = (rh0.x) i95.n0.c(rh0.x.class);
        rh0.z zVar = rh0.z.f477146g;
        java.lang.String wi6 = ((p05.v2) xVar).wi(zVar, "FaceMakeUpLevel");
        boolean z18 = !(wi6 == null || wi6.length() == 0) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.B1(wi6) == 1.0f;
        rh0.z zVar2 = this.f432123c;
        if ((zVar2 != zVar && zVar2 != rh0.z.f477147h) || !z18) {
            intValue &= -32769;
        }
        int i27 = this.H ? intValue | 64 : intValue & (-65);
        java.lang.System.nanoTime();
        com.p314xaae8f345.mm.p2825x7e128009.C22970xcc6c2095.m83754x9b1e87f7(this.f432126f, i17 * 3.0f);
        java.lang.System.nanoTime();
        java.lang.System.nanoTime();
        int i28 = this.f432139s;
        if (this.f432125e) {
            i27 &= -2;
            i19 = 0;
        } else {
            i19 = i28;
        }
        int m83728xf7324f6d = com.p314xaae8f345.mm.p2825x7e128009.C22970xcc6c2095.m83728xf7324f6d(this.f432126f, dataBuffer, i17, i18, i27, i19);
        java.lang.System.nanoTime();
        p4Var.f432180c++;
        long j18 = p4Var.f432179b;
        long j19 = p4Var.f432185h;
        boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        p4Var.f432179b = j18 + (android.os.SystemClock.elapsedRealtime() - j19);
        this.f432143w = m83728xf7324f6d == 0;
        return m83728xf7324f6d;
    }

    public void q(int i17, boolean z17, int i18, boolean z18) {
        long j17 = this.f432126f;
        if (j17 != 0 ? com.p314xaae8f345.mm.p2825x7e128009.C22970xcc6c2095.m83737xfa794f2a(j17) : false) {
            this.f432139s = k(0);
            this.f432138r.r(i17);
            if (this.f432125e) {
                this.f432138r.j(false);
                os0.a aVar = this.f432138r;
                aVar.f429539o = z17;
                aVar.s(0);
            } else {
                if (z17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.XLabEffect", "Upside down is not support on non-rci mode");
                }
                this.f432138r.s(i18);
                this.f432138r.j(z18);
            }
            this.f432138r.f429546v = true;
            this.f432138r.o();
        }
    }

    public final void r() {
        p05.a3 a3Var = p05.a3.f431972a;
        rh0.z zVar = this.f432123c;
        java.lang.String f17 = a3Var.f(zVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XLabEffect", "initSettings: " + f17);
        if (this.f432126f == 0 || f17 == null) {
            return;
        }
        java.util.Map Ai = ((p05.v2) ((rh0.x) i95.n0.c(rh0.x.class))).Ai(zVar);
        java.util.Map map = this.f432124d;
        if (map != null) {
            Ai = kz5.c1.t(Ai);
            Ai.putAll(map);
        }
        long j17 = this.f432126f;
        int i17 = com.p314xaae8f345.mm.p2825x7e128009.C22970xcc6c2095.f296335a;
        java.lang.String m83735x62b894e1 = com.p314xaae8f345.mm.p2825x7e128009.C22970xcc6c2095.m83735x62b894e1(j17, f17, tq5.i.f502803b.a(Ai));
        if (m83735x62b894e1 != null) {
            int i18 = zVar.f477154d;
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7142x175d408b c7142x175d408b = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7142x175d408b();
            if (tq5.i.f502802a == 0) {
                tq5.i.f502802a = 2014500;
            }
            c7142x175d408b.f144512d = tq5.i.f502802a;
            c7142x175d408b.f144514f = 4;
            c7142x175d408b.f144513e = i18;
            c7142x175d408b.f144516h = c7142x175d408b.b("SwitchRes", m83735x62b894e1, true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeVisConfigReporter", "reportUsage: " + c7142x175d408b.n());
            c7142x175d408b.k();
        }
    }

    public void s(int i17, boolean z17) {
        if (z17) {
            this.f432144x |= 1 << i17;
            if (i17 == 14) {
                this.f432129i |= 8192;
                return;
            } else {
                if (i17 != 17) {
                    return;
                }
                this.f432129i |= 2048;
                return;
            }
        }
        this.f432144x &= ~(1 << i17);
        if (i17 == 14) {
            this.f432129i &= -8193;
        } else {
            if (i17 != 17) {
                return;
            }
            this.f432129i &= -2049;
        }
    }

    public void t(long j17) {
        long j18 = this.f432126f;
        if (j18 == 0) {
            return;
        }
        com.p314xaae8f345.mm.p2825x7e128009.C22970xcc6c2095.m83740xed30d0c0(j18, j17);
        com.p314xaae8f345.mm.p2825x7e128009.C22970xcc6c2095.a(this.f432126f, j17, null);
    }

    public void u(p05.e2 e2Var) {
        if (e2Var != null) {
            this.I.remove(e2Var);
        }
    }

    public int v(int i17, int i18, long j17, int i19, int i27, boolean z17, boolean z18, boolean z19, int i28, int i29) {
        if (this.f432126f == 0) {
            l(i17, i18, z17, i19, z19);
            return -1;
        }
        int k17 = k(i27);
        int k18 = k(i19);
        boolean z27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        android.os.SystemClock.elapsedRealtime();
        j();
        p05.p4 p4Var = this.G;
        p4Var.getClass();
        p4Var.f432186i = android.os.SystemClock.elapsedRealtime();
        int m83744x5b55cab8 = com.p314xaae8f345.mm.p2825x7e128009.C22970xcc6c2095.m83744x5b55cab8(this.f432126f, i17, i18, i28, i29, k18, k17, z17, z19);
        p4Var.a();
        if (z18) {
            android.opengl.GLES20.glFinish();
        }
        android.os.SystemClock.elapsedRealtime();
        return m83744x5b55cab8;
    }

    public int w(int i17, int i18, long j17, int i19, boolean z17, boolean z18, boolean z19) {
        boolean z27;
        int i27;
        if (this.f432128h == 0 || this.f432127g == 0) {
            return -1;
        }
        if (this.f432126f == 0) {
            l(i17, i18, z17, i19, z19);
            return -1;
        }
        int k17 = k(i19);
        boolean z28 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        android.os.SystemClock.elapsedRealtime();
        java.lang.System.nanoTime();
        j();
        java.lang.System.nanoTime();
        p05.p4 p4Var = this.G;
        p4Var.getClass();
        p4Var.f432186i = android.os.SystemClock.elapsedRealtime();
        java.lang.System.nanoTime();
        if (this.f432125e) {
            i27 = 0;
            z27 = false;
        } else {
            z27 = z19;
            i27 = k17;
        }
        int m83742x95e382dc = com.p314xaae8f345.mm.p2825x7e128009.C22970xcc6c2095.m83742x95e382dc(this.f432126f, i17, i18, this.f432128h, this.f432127g, i27, z17, z27);
        java.lang.System.nanoTime();
        p4Var.a();
        if (z18) {
            java.lang.System.nanoTime();
            android.opengl.GLES20.glFinish();
            java.lang.System.nanoTime();
        }
        return m83742x95e382dc;
    }

    public int x(byte[] inputBuffer, int i17, int i18, byte[] outputBuffer, int i19, int i27) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inputBuffer, "inputBuffer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outputBuffer, "outputBuffer");
        if (this.f432126f == 0) {
            return -1;
        }
        p05.p4 p4Var = this.G;
        p4Var.getClass();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        p4Var.f432186i = android.os.SystemClock.elapsedRealtime();
        int m83741x6b18aa5f = com.p314xaae8f345.mm.p2825x7e128009.C22970xcc6c2095.m83741x6b18aa5f(this.f432126f, inputBuffer, i17, i18, outputBuffer, i19, 0, false);
        android.opengl.GLES20.glFinish();
        p4Var.a();
        return m83741x6b18aa5f;
    }

    public void z(long j17, com.p314xaae8f345.mm.p2825x7e128009.InterfaceC22960x759189cd interfaceC22960x759189cd) {
        long j18 = this.f432126f;
        if (j18 == 0) {
            return;
        }
        com.p314xaae8f345.mm.p2825x7e128009.C22970xcc6c2095.a(j18, j17, interfaceC22960x759189cd);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0144, code lost:
    
        if (r26.n0.B(r0, "Mali-G77", false) != false) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0204  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public l4(int r21, boolean r22, boolean r23, boolean r24, boolean r25, boolean r26, rh0.z r27, java.util.Map r28, boolean r29, int r30, p3321xbce91901.jvm.p3324x21ffc6bd.i r31) {
        /*
            Method dump skipped, instructions count: 879
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p05.l4.<init>(int, boolean, boolean, boolean, boolean, boolean, rh0.z, java.util.Map, boolean, int, kotlin.jvm.internal.i):void");
    }
}
