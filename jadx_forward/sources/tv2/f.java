package tv2;

/* loaded from: classes10.dex */
public final class f extends ov2.e {

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f503833h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.f0 f503834i;

    /* renamed from: m, reason: collision with root package name */
    public pv2.g f503835m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1646xce040e01.p1647x7817babe.p1649x76847298.C15160x73edd621 f503836n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderMediaProcessStage$feedDeleteListener$1] */
    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 finderObj) {
        super(java.lang.String.valueOf(finderObj.m59260x51f8f5b0()));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderObj, "finderObj");
        this.f503833h = finderObj;
        this.f503835m = new tv2.x(finderObj, 2);
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f503836n = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5437xe8b43b11>(a0Var) { // from class: com.tencent.mm.plugin.finder.upload.postlogic.finderstage.FinderMediaProcessStage$feedDeleteListener$1
            {
                this.f39173x3fe91575 = -108499199;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5437xe8b43b11 c5437xe8b43b11) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5437xe8b43b11 event = c5437xe8b43b11;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                am.da daVar = event.f135780g;
                long j17 = daVar.f87971b;
                if (j17 == 0) {
                    return false;
                }
                tv2.f fVar = tv2.f.this;
                if (j17 != fVar.f503833h.m59260x51f8f5b0()) {
                    return false;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LogPost.FinderMediaProcessStage", "feedDeleteListener localId:" + daVar.f87971b);
                cu2.t tVar = cu2.u.f303974a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = fVar.f503833h;
                if (tVar.k(c14994x9b99c079.m59260x51f8f5b0())) {
                    return false;
                }
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7 = c14994x9b99c079.f66946x284ddcb8;
                if (c19783xd9a946b7 != null) {
                    c19783xd9a946b7.m76447x75f6f6ad(200);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.f0 f0Var = fVar.f503834i;
                if (f0Var == null) {
                    return false;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.f0.b(f0Var, null, 1, null);
                return false;
            }
        };
    }

    @Override // pv2.g
    public int a() {
        return 2;
    }

    @Override // pv2.m
    public void d(pv2.g nextStage) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nextStage, "nextStage");
        boolean m59314x4d5c4d55 = this.f503833h.m59314x4d5c4d55();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.C(1253L, 20L, 1L);
        if (m59314x4d5c4d55) {
            if ((1253 == 1253 ? 1523L : 0L) > 0) {
                g0Var.C(1253 == 1253 ? 1523L : 0L, 20L, 1L);
            }
        }
    }

    @Override // pv2.m
    public void e(pv2.g nextStage) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nextStage, "nextStage");
    }

    @Override // pv2.m
    public void f(pv2.g nextStage) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nextStage, "nextStage");
        boolean m59314x4d5c4d55 = this.f503833h.m59314x4d5c4d55();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.C(1253L, 20L, 1L);
        if (m59314x4d5c4d55) {
            if ((1253 == 1253 ? 1523L : 0L) > 0) {
                g0Var.C(1253 == 1253 ? 1523L : 0L, 20L, 1L);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x0360, code lost:
    
        if ((r3 == null || r3.length() == 0) != false) goto L142;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:142:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0690  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x06cb  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x09d8  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0a0b  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0a2a  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0a56  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0a23 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x09da  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x092f  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0958  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0658 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:356:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x06b7  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x03ea  */
    /* JADX WARN: Type inference failed for: r0v60, types: [yy0.m7] */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v39, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v19 */
    @Override // ov2.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public pv2.g j() {
        /*
            Method dump skipped, instructions count: 2740
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tv2.f.j():pv2.g");
    }

    public final java.lang.String k() {
        java.lang.String a17;
        r45.mb4 mb4Var = (r45.mb4) kz5.n0.Z(this.f503833h.m59264x7efe73ec());
        return (mb4Var == null || (a17 = hc2.l0.a(mb4Var)) == null) ? "" : a17;
    }

    public final jz5.l l(long j17, int i17, java.lang.String str, com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d, r45.mb4 mb4Var, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1 c19791x8d6e6bf1, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LogPost.FinderMediaProcessStage", "remuxComposition outputPath:" + str);
        r45.h70 h70Var = (r45.h70) mb4Var.m75936x14adae67(21);
        if (h70Var == null) {
            h70Var = new r45.h70();
        }
        r45.h70 h70Var2 = h70Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
        f0Var2.f391649d = -1;
        r45.i70 i70Var = h70Var2.f457435i;
        if (i70Var == null) {
            i70Var = new r45.i70();
        }
        r45.i70 i70Var2 = i70Var;
        i70Var2.f458308d = str;
        i95.m c17 = i95.n0.c(bg0.v.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        i70Var2.f458325x = bg0.v.Tg((bg0.v) c17, false, 0L, 2, null);
        java.lang.Object obj = new java.lang.Object();
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
        ((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.n nVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.n();
        ((bg0.a0) i95.n0.c(bg0.a0.class)).getClass();
        nVar.f257217c = 1;
        r45.dd4 dd4Var = (r45.dd4) mb4Var.m75936x14adae67(14);
        nVar.f257215a = dd4Var != null ? dd4Var.m75939xb282bd08(7) : 0;
        nVar.f257216b = true;
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.t2()) {
            long j18 = uv2.e.f512911c;
            if (j18 > 0) {
                c11120x15dce88d.C = (int) ((((float) j18) / 1048576.0f) * 0.38f);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LogPost.FinderMediaProcessStage", "ABA finder video maxVideoSize:" + c11120x15dce88d.C);
            }
            nVar.i(true, c11120x15dce88d);
        }
        nVar.f257226l = new tv2.b(new p3321xbce91901.jvm.p3324x21ffc6bd.e0(), this, i17, i18);
        this.f503834i = nVar;
        float a17 = com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.f0.a(nVar, h70Var2, false, new tv2.c(this, f0Var2, i17, c19791x8d6e6bf1, j17, str, i70Var2, c11120x15dce88d, h70Var2, obj, c0Var), 2, null);
        synchronized (obj) {
            if (c0Var.f391645d) {
                f0Var = f0Var2;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LogPost.FinderMediaProcessStage", "wait " + i17);
                try {
                    obj.wait();
                } catch (java.lang.InterruptedException unused) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.LogPost.FinderMediaProcessStage", "wait interrupted");
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notify ");
                sb6.append(i17);
                sb6.append(", ");
                f0Var = f0Var2;
                sb6.append(f0Var.f391649d);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LogPost.FinderMediaProcessStage", sb6.toString());
            }
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7 = this.f503833h.f66946x284ddcb8;
        if (c19783xd9a946b7 != null) {
            c19783xd9a946b7.m76411xfa666b63(f0Var.f391649d);
        }
        cu2.u.f303974a.l(this.f503833h);
        return new jz5.l(java.lang.Integer.valueOf(f0Var.f391649d), java.lang.Float.valueOf(a17));
    }

    public final jz5.l m(long j17, com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d, r45.mb4 mb4Var, java.lang.String str, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1 c19791x8d6e6bf1, boolean z17, int i17, int i18) {
        android.graphics.Rect rect;
        int i19;
        int i27;
        int i28;
        int i29;
        int i37;
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var;
        android.graphics.Rect rect2;
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var;
        java.lang.String str2;
        java.util.LinkedList m75941xfb821914;
        int i38;
        int i39;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.C(1253L, 0L, 1L);
        g0Var.C(1523L, 0L, 1L);
        ((ag0.m) ((bg0.u) i95.n0.c(bg0.u.class))).Ai(z17);
        java.lang.Object obj = new java.lang.Object();
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
        java.lang.String m75945x2fec8307 = mb4Var.m75945x2fec8307(0);
        java.lang.Float valueOf = java.lang.Float.valueOf(0.0f);
        if (m75945x2fec8307 == null) {
            return new jz5.l(-1000, valueOf);
        }
        r45.dd4 dd4Var = (r45.dd4) mb4Var.m75936x14adae67(14);
        if (dd4Var == null) {
            return new jz5.l(java.lang.Integer.valueOf(com.p314xaae8f345.p414x32b0ec.C3856x24bb8022.ErrorCode.f15116xa552212a), valueOf);
        }
        android.graphics.Rect rect3 = new android.graphics.Rect();
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var3 = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
        int i47 = c11120x15dce88d.f152727g;
        qc0.d1 Ai = ((pc0.g2) ((qc0.e1) i95.n0.c(qc0.e1.class))).Ai(m75945x2fec8307, true);
        i95.m c17 = i95.n0.c(bg0.v.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.l0 Z2 = bg0.v.Z2((bg0.v) c17, m75945x2fec8307, false, 2, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1 i1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1) Z2;
        i1Var.c(dd4Var.m75939xb282bd08(3));
        i1Var.a(dd4Var.m75939xb282bd08(3));
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.k0 Bi = ((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).Bi(kz5.b0.c(Z2));
        if (Ai != null) {
            int i48 = Ai.f442896a;
            int i49 = Ai.f442897b;
            int i57 = Ai.f442901f;
            if (i57 == 90 || i57 == 270) {
                i49 = i48;
                i48 = i49;
            }
            i1Var.f257157i.f257320d.set(0, 0, i48, i49);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1) Bi).u(i48, i49);
            rect = rect3;
            rect.set(0, 0, i48, i49);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19790xac7db1e0 m76722x28f8d21c = c19791x8d6e6bf1.m76722x28f8d21c();
            if (m76722x28f8d21c == null) {
                i38 = i48;
                i39 = i49;
            } else {
                i38 = i48;
                i39 = i49;
                m76722x28f8d21c.m76710xc9923ded((int) Ai.f442899d);
            }
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19790xac7db1e0 m76722x28f8d21c2 = c19791x8d6e6bf1.m76722x28f8d21c();
            if (m76722x28f8d21c2 != null) {
                m76722x28f8d21c2.m76711x53e9ee84(Ai.f442896a);
            }
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19790xac7db1e0 m76722x28f8d21c3 = c19791x8d6e6bf1.m76722x28f8d21c();
            if (m76722x28f8d21c3 != null) {
                m76722x28f8d21c3.m76708xf84e829(Ai.f442897b);
            }
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19790xac7db1e0 m76722x28f8d21c4 = c19791x8d6e6bf1.m76722x28f8d21c();
            if (m76722x28f8d21c4 != null) {
                m76722x28f8d21c4.m76709x885d9bf4(Ai.f442900e);
            }
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19790xac7db1e0 m76722x28f8d21c5 = c19791x8d6e6bf1.m76722x28f8d21c();
            if (m76722x28f8d21c5 != null) {
                m76722x28f8d21c5.m76705x32952839(Ai.f442903h);
            }
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19790xac7db1e0 m76722x28f8d21c6 = c19791x8d6e6bf1.m76722x28f8d21c();
            if (m76722x28f8d21c6 != null) {
                m76722x28f8d21c6.m76707xca026527((int) Ai.f442898c);
            }
            i27 = i38;
            i28 = i39;
            i19 = 0;
        } else {
            rect = rect3;
            i19 = 0;
            i27 = 0;
            i28 = 0;
        }
        r45.c07 c07Var = (r45.c07) dd4Var.m75936x14adae67(i19);
        if (c07Var != null) {
            if (z17) {
                c0Var = c0Var2;
                str2 = "notify longvideo, ";
                rect.set(c07Var.m75939xb282bd08(i19), c07Var.m75939xb282bd08(3), c07Var.m75939xb282bd08(2), c07Var.m75939xb282bd08(1));
            } else {
                c0Var = c0Var2;
                str2 = "notify longvideo, ";
                r45.s23 s23Var = (r45.s23) dd4Var.m75936x14adae67(1);
                if (s23Var != null && (m75941xfb821914 = s23Var.m75941xfb821914(0)) != null) {
                    android.graphics.Matrix matrix = new android.graphics.Matrix();
                    matrix.setValues(kz5.n0.P0(m75941xfb821914));
                    float[] fArr = new float[9];
                    matrix.getValues(fArr);
                    float f17 = fArr[0];
                    float f18 = fArr[3];
                    double sqrt = (float) java.lang.Math.sqrt((f17 * f17) + (f18 * f18));
                    if (sqrt <= 0.0d) {
                        sqrt = 1.0d;
                    }
                    uv2.e eVar = uv2.e.f512909a;
                    int i58 = i27;
                    i37 = i28;
                    int t17 = eVar.t((int) java.lang.Math.floor((c07Var.m75939xb282bd08(1) - c07Var.m75939xb282bd08(3)) / sqrt));
                    i29 = i58;
                    f0Var = f0Var3;
                    int t18 = eVar.t((int) java.lang.Math.floor((c07Var.m75939xb282bd08(2) - c07Var.m75939xb282bd08(0)) / sqrt));
                    int floor = (int) java.lang.Math.floor(c07Var.m75939xb282bd08(0) / sqrt);
                    rect2 = rect;
                    int floor2 = (int) java.lang.Math.floor(c07Var.m75939xb282bd08(3) / sqrt);
                    rect2.set(floor, floor2, t18 + floor, t17 + floor2);
                }
            }
            i29 = i27;
            i37 = i28;
            f0Var = f0Var3;
            rect2 = rect;
        } else {
            i29 = i27;
            i37 = i28;
            f0Var = f0Var3;
            rect2 = rect;
            c0Var = c0Var2;
            str2 = "notify longvideo, ";
        }
        f0Var2.f391649d = z17 ? dd4Var.m75939xb282bd08(4) : uv2.e.f512909a.t(dd4Var.m75939xb282bd08(4));
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var4 = f0Var;
        f0Var4.f391649d = z17 ? dd4Var.m75939xb282bd08(5) : uv2.e.f512909a.t(dd4Var.m75939xb282bd08(5));
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1 h1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1) Bi;
        h1Var.t(rect2);
        if (z17) {
            long j18 = uv2.e.f512911c;
            if (j18 > 0) {
                c11120x15dce88d.C = (int) ((((float) j18) / 1048576.0f) * 0.38f);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LogPost.FinderMediaProcessStage", "ABA finder video maxVideoSize:" + c11120x15dce88d.C);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.g0 wi6 = ((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).wi(Bi);
        android.util.Size size = new android.util.Size(i29, i37);
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.p pVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.p) wi6;
        pVar.e(str, c11120x15dce88d, size, rect2, false, true);
        r45.h70 f19 = pVar.f();
        r45.i70 i70Var = f19.f457435i;
        i70Var.f458308d = str;
        i70Var.f458325x = ((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).Ui(z17, h1Var.g());
        ((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.n nVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.n();
        ((bg0.a0) i95.n0.c(bg0.a0.class)).getClass();
        nVar.f257217c = 2;
        r45.dd4 dd4Var2 = (r45.dd4) mb4Var.m75936x14adae67(14);
        nVar.f257215a = dd4Var2 != null ? dd4Var2.m75939xb282bd08(7) : 0;
        nVar.i(true, c11120x15dce88d);
        nVar.f257226l = new tv2.d(new p3321xbce91901.jvm.p3324x21ffc6bd.e0(), this, i17, i18);
        this.f503834i = nVar;
        f19.f457442s = dd4Var.m75945x2fec8307(8);
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var5 = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
        f0Var5.f391649d = -1;
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var3 = c0Var;
        float a17 = com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.f0.a(nVar, f19, false, new tv2.e(this, f0Var5, c19791x8d6e6bf1, j17, str, z17, f0Var2, f0Var4, c11120x15dce88d, obj, c0Var3), 2, null);
        synchronized (obj) {
            if (!c0Var3.f391645d) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LogPost.FinderMediaProcessStage", "wait longvideo");
                try {
                    obj.wait();
                } catch (java.lang.InterruptedException unused) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.LogPost.FinderMediaProcessStage", "wait interrupted");
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LogPost.FinderMediaProcessStage", str2 + f0Var5.f391649d);
            }
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7 = this.f503833h.f66946x284ddcb8;
        if (c19783xd9a946b7 != null) {
            c19783xd9a946b7.m76411xfa666b63(f0Var5.f391649d);
        }
        cu2.u.f303974a.l(this.f503833h);
        return new jz5.l(java.lang.Integer.valueOf(f0Var5.f391649d), java.lang.Float.valueOf(a17));
    }

    public final void n(pv2.g gVar) {
        mo48814x2efc64();
        this.f503835m = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x03b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d r24, r45.mb4 r25, java.lang.String r26, r45.mb4 r27, int r28, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1 r29, float r30, float r31, boolean r32) {
        /*
            Method dump skipped, instructions count: 1230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tv2.f.o(com.tencent.mm.modelcontrol.VideoTransPara, r45.mb4, java.lang.String, r45.mb4, int, com.tencent.mm.protocal.protobuf.FinderMediaReportObject, float, float, boolean):void");
    }

    public final void p(float f17) {
        if (f17 > 1.0f) {
            f17 = 1.0f;
        }
        int i17 = (int) (45 * f17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("feed ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = this.f503833h;
        sb6.append(c14994x9b99c079.m59260x51f8f5b0());
        sb6.append(" updateProgress  ");
        sb6.append(f17);
        sb6.append(", ");
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LogPost.FinderMediaProcessStage", sb6.toString());
        if (c14994x9b99c079.m59277xa8f45ee4().m75939xb282bd08(4) < i17) {
            c14994x9b99c079.m59277xa8f45ee4().set(4, java.lang.Integer.valueOf(i17));
            cu2.u.f303974a.l(c14994x9b99c079);
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5442xd807898f c5442xd807898f = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5442xd807898f();
        long m59260x51f8f5b0 = c14994x9b99c079.m59260x51f8f5b0();
        am.ga gaVar = c5442xd807898f.f135783g;
        gaVar.f88282a = m59260x51f8f5b0;
        gaVar.f88283b = c14994x9b99c079.m59277xa8f45ee4().m75939xb282bd08(4);
        c5442xd807898f.e();
    }
}
