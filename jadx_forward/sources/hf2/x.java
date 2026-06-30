package hf2;

/* loaded from: classes10.dex */
public final class x extends if2.b implements mf2.c {
    public final jz5.g A;
    public final jz5.g B;
    public final jz5.g C;
    public final jz5.g D;
    public final jz5.g E;
    public boolean F;
    public android.animation.ValueAnimator G;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f362714m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f362715n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f362716o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f362717p;

    /* renamed from: q, reason: collision with root package name */
    public r45.ei0 f362718q;

    /* renamed from: r, reason: collision with root package name */
    public r45.h84 f362719r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f362720s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f362721t;

    /* renamed from: u, reason: collision with root package name */
    public hf2.r2 f362722u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f362723v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.ViewGroup f362724w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f362725x;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f362726y;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f362727z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f362714m = "LiveAnchorStickerController";
        this.f362715n = jz5.h.b(hf2.t.f362699d);
        this.f362716o = jz5.h.b(hf2.e.f362582d);
        jz5.g b17 = jz5.h.b(hf2.l.f362630d);
        this.f362717p = jz5.h.b(hf2.k.f362626d);
        this.f362722u = new hf2.r2(new android.graphics.Point(0, 0), new android.util.Size((int) ((java.lang.Number) ((jz5.n) b17).mo141623x754a37bb()).floatValue(), (int) i7()));
        this.f362725x = jz5.h.b(new hf2.h(this));
        this.f362726y = jz5.h.b(new hf2.a(this));
        this.f362727z = jz5.h.b(new hf2.v(this));
        this.A = jz5.h.b(new hf2.b(this));
        this.B = jz5.h.b(new hf2.j(this));
        this.C = jz5.h.b(new hf2.u(this));
        this.D = jz5.h.b(new hf2.w(this));
        this.E = jz5.h.b(new hf2.r(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Z6(hf2.x r8, java.lang.String r9, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r10) {
        /*
            r8.getClass()
            boolean r0 = r10 instanceof hf2.m
            if (r0 == 0) goto L16
            r0 = r10
            hf2.m r0 = (hf2.m) r0
            int r1 = r0.f362646h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f362646h = r1
            goto L1b
        L16:
            hf2.m r0 = new hf2.m
            r0.<init>(r8, r10)
        L1b:
            r4 = r0
            java.lang.Object r10 = r4.f362644f
            pz5.a r0 = pz5.a.f440719d
            int r1 = r4.f362646h
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L4b
            if (r1 == r3) goto L3e
            if (r1 != r2) goto L36
            java.lang.Object r8 = r4.f362643e
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r4.f362642d
            hf2.x r9 = (hf2.x) r9
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            goto L79
        L36:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3e:
            java.lang.Object r8 = r4.f362643e
            r9 = r8
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r8 = r4.f362642d
            hf2.x r8 = (hf2.x) r8
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            goto L5f
        L4b:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            hf2.y0 r10 = r8.g7()
            r4.f362642d = r8
            r4.f362643e = r9
            r4.f362646h = r3
            java.lang.Object r10 = r10.d(r9, r4)
            if (r10 != r0) goto L5f
            goto L87
        L5f:
            hf2.y0 r1 = r8.g7()
            r45.h84 r10 = r8.f362719r
            r3 = 0
            r5 = 2
            r6 = 0
            r4.f362642d = r8
            r4.f362643e = r9
            r4.f362646h = r2
            r2 = r10
            java.lang.Object r10 = hf2.y0.b(r1, r2, r3, r4, r5, r6)
            if (r10 != r0) goto L76
            goto L87
        L76:
            r7 = r9
            r9 = r8
            r8 = r7
        L79:
            android.graphics.Bitmap r10 = (android.graphics.Bitmap) r10
            if (r10 == 0) goto L85
            hf2.n r0 = new hf2.n
            r0.<init>(r9, r8, r10)
            d75.b.g(r0)
        L85:
            jz5.f0 r0 = jz5.f0.f384359a
        L87:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: hf2.x.Z6(hf2.x, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // mf2.c
    public void M2(xh2.b micInfoData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(micInfoData, "micInfoData");
        int size = micInfoData.f536056b.size();
        java.lang.String str = this.f362714m;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onMicInfoChanged size:" + size);
        boolean z17 = size > 1;
        if (z17 != this.f362721t) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "set linkMic from " + this.f362721t + " to " + z17);
        }
        this.f362721t = z17;
    }

    public final void a7(java.lang.String source, java.lang.String initTextContent) {
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        r45.ji0 ji0Var;
        java.util.LinkedList linkedList3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(initTextContent, "initTextContent");
        if (this.f362718q == null) {
            t7(source.concat(" buildDefaultStickerTextItem"), new r45.ei0());
        }
        r45.ei0 ei0Var = this.f362718q;
        r45.ji0 ji0Var2 = null;
        java.util.LinkedList linkedList4 = ei0Var != null ? ei0Var.f455062d : null;
        if (linkedList4 == null || linkedList4.isEmpty()) {
            r45.ei0 ei0Var2 = this.f362718q;
            if ((ei0Var2 != null ? ei0Var2.f455062d : null) == null && ei0Var2 != null) {
                ei0Var2.f455062d = new java.util.LinkedList();
            }
            r45.ei0 ei0Var3 = this.f362718q;
            if (ei0Var3 != null && (linkedList3 = ei0Var3.f455062d) != null) {
                r45.ji0 ji0Var3 = new r45.ji0();
                ji0Var3.f459355d = ((je2.g) m56788xbba4bfc0(je2.g.class)).f380758m;
                ji0Var3.f459356e = ((je2.g) m56788xbba4bfc0(je2.g.class)).f380759n;
                ji0Var3.f459360i = 1.0f;
                android.graphics.Bitmap bitmap = h7().f362545g;
                if (bitmap != null) {
                    ji0Var3.f459363o = bitmap.getWidth();
                    ji0Var3.f459364p = bitmap.getHeight();
                }
                ((je2.g) m56788xbba4bfc0(je2.g.class)).getClass();
                linkedList3.add(ji0Var3);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f362714m, source + " buildDefaultStickerTextItem new instance EditorTextItemRestoreData," + je2.g.f380753u.b(this.f362718q) + '!');
        }
        r45.ei0 ei0Var4 = this.f362718q;
        java.lang.String str = (ei0Var4 == null || (linkedList2 = ei0Var4.f455062d) == null || (ji0Var = (r45.ji0) kz5.n0.Z(linkedList2)) == null) ? null : ji0Var.f459362n;
        if (str == null || str.length() == 0) {
            if (initTextContent.length() > 0) {
                r45.ei0 ei0Var5 = this.f362718q;
                if (ei0Var5 != null && (linkedList = ei0Var5.f455062d) != null) {
                    ji0Var2 = (r45.ji0) kz5.n0.Z(linkedList);
                }
                if (ji0Var2 == null) {
                    return;
                }
                ji0Var2.f459362n = initTextContent;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final r45.ee6 b7(int r12, int r13, java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hf2.x.b7(int, int, java.lang.String):r45.ee6");
    }

    public final void c7(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.o9 o9Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f362714m, "enablePreviewScale " + z17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ub ubVar = this.f372632e;
        if (ubVar == null || (o9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.o9) ubVar.mo57682x2a5e9229(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.o9.class)) == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCoreAnchor", "setCameraOptionEnable " + z17);
        o9Var.f195250r.m46526xf9281a1f(z17);
    }

    public final void d7(boolean z17) {
        in0.q m129720xd052bc21;
        if (z17 != this.f362720s) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f362714m, "set enableStickerToScreen from " + this.f362720s + " to " + z17);
        }
        this.f362720s = z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ub ubVar = this.f372632e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.v1 v1Var = ubVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.v1 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.v1) ubVar : null;
        if (v1Var == null || (m129720xd052bc21 = v1Var.m129720xd052bc21()) == null) {
            return;
        }
        go0.f0 f0Var = m129720xd052bc21.f502304r;
        f0Var.getClass();
        f0Var.l(new go0.m(f0Var, z17));
    }

    public final hf2.r2 e7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.o9 o9Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ub ubVar = this.f372632e;
        android.view.ViewGroup viewGroup = (ubVar == null || (o9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.o9) ubVar.mo57682x2a5e9229(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.o9.class)) == null) ? null : o9Var.f446856d;
        int[] iArr = new int[2];
        if (viewGroup != null) {
            viewGroup.getLocationOnScreen(iArr);
        }
        hf2.r2 r2Var = new hf2.r2(new android.graphics.Point(iArr[0], iArr[1]), new android.util.Size(viewGroup != null ? viewGroup.getWidth() : 0, viewGroup != null ? viewGroup.getHeight() : 0));
        this.f362722u = r2Var;
        return r2Var;
    }

    public final hf2.h0 f7() {
        return (hf2.h0) ((jz5.n) this.f362726y).mo141623x754a37bb();
    }

    public final hf2.y0 g7() {
        return (hf2.y0) ((jz5.n) this.A).mo141623x754a37bb();
    }

    public final hf2.b2 h7() {
        return (hf2.b2) ((jz5.n) this.f362725x).mo141623x754a37bb();
    }

    public final float i7() {
        return ((java.lang.Number) this.f362717p.mo141623x754a37bb()).floatValue();
    }

    public final hf2.e1 k7() {
        return (hf2.e1) ((jz5.n) this.C).mo141623x754a37bb();
    }

    public final hf2.l2 l7() {
        return (hf2.l2) ((jz5.n) this.f362727z).mo141623x754a37bb();
    }

    public final void m7(java.lang.String source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f362714m, source.concat(" hideStickerEdit!"));
        d7(true);
        u7(false);
        s7();
        m133483x41012807();
    }

    public final void n7(java.lang.String source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f362714m, source.concat(" hideStickerOperation!"));
        d7(true);
        u7(false);
        s7();
        m133483x41012807();
    }

    public final void o7(java.lang.String source) {
        r45.ei0 ei0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        je2.g gVar = (je2.g) m56788xbba4bfc0(je2.g.class);
        r45.ei0 ei0Var2 = gVar.f380755g;
        if (ei0Var2 != null) {
            ei0Var = new r45.ei0();
            byte[] mo14344x5f01b1f6 = ei0Var2.mo14344x5f01b1f6();
            if (mo14344x5f01b1f6 != null) {
                try {
                    ei0Var.mo11468x92b714fd(mo14344x5f01b1f6);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
                }
            }
        } else {
            ei0Var = null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cloneRestoreData stickerRestoreData:");
        r45.ei0 ei0Var3 = gVar.f380755g;
        sb6.append(ei0Var3 != null ? ei0Var3.hashCode() : 0);
        sb6.append(",cloneRestoreData:");
        sb6.append(ei0Var != null ? ei0Var.hashCode() : 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveAnchorStickerSlice", sb6.toString());
        t7(source, ei0Var);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveActivate */
    public void mo8997x8001c97e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f362714m, "startPolling");
        dk2.ef.f314925k.e(18, new r45.xc2(), new hf2.s(this, r45.yc2.class), false);
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveDeactivate */
    public void mo14860x9606ce3f() {
        super.mo14860x9606ce3f();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f362714m, "stopPolling");
        dk2.ef.f314925k.f(18);
        f7().a();
        android.graphics.Bitmap bitmap = h7().f362545g;
        if (bitmap != null) {
            bitmap.recycle();
        }
        ((hf2.p1) ((jz5.n) this.E).mo141623x754a37bb()).a().clear();
        hf2.y0 g76 = g7();
        p3325xe03a0797.p3326xc267989b.r2 r2Var = g76.f362743k;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        hf2.l0 l0Var = g76.f362742j;
        if (l0Var != null) {
            l0Var.a("onLiveDeactivate");
        }
        g76.f362742j = null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveStart */
    public void mo14863x39a513b7(r45.hc1 hc1Var) {
        jz5.f0 f0Var;
        hf2.e1 k76 = k7();
        hf2.x xVar = k76.f362584a;
        r45.ei0 ei0Var = ((je2.g) xVar.m56788xbba4bfc0(je2.g.class)).f380755g;
        if (ei0Var != null) {
            if ((k76.f362587d.length() > 0) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(k76.f362587d, com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(pm0.b0.g(ei0Var).toString()))) {
                java.lang.String str = "upload StickTask When LiveStart:" + k76.f362587d + '!';
                java.lang.String str2 = k76.f362585b;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, str);
                k76.f362587d = "";
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf N6 = xVar.N6();
                if (N6 != null) {
                    k76.b("before:", N6, ei0Var);
                    f0Var = jz5.f0.f384359a;
                } else {
                    f0Var = null;
                }
                if (f0Var == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "upload StickTask When LiveStart but activity is null!");
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewMount */
    public void mo8998x9f682d55(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        super.mo8998x9f682d55(pluginLayout);
        hf2.y0 g76 = g7();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(g76.f362733a, null, null, new hf2.q0(g76, null), 3, null);
        hf2.p1 p1Var = (hf2.p1) ((jz5.n) this.E).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(p1Var.f362669a, null, null, new hf2.o1(p1Var, null), 3, null);
        hf2.q2 q2Var = (hf2.q2) ((jz5.n) this.D).mo141623x754a37bb();
        if (((je2.g) q2Var.f362681a.m56788xbba4bfc0(je2.g.class)).T6()) {
            q2Var.d();
            q2Var.a();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(this, null, null, new hf2.g(this, null), 3, null);
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewUnmount */
    public void mo8999xb1ef75c(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f362714m, "onViewUnmount");
        m7("onViewUnmount");
    }

    public final void p7(java.util.LinkedList linkedList, float f17, float f18) {
        android.animation.ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        android.animation.ValueAnimator duration = android.animation.ValueAnimator.ofFloat(f17, f18).setDuration(300L);
        duration.addListener(new hf2.c(this, f17, f18));
        duration.addUpdateListener(new hf2.d(linkedList));
        duration.setInterpolator(new android.view.animation.DecelerateInterpolator());
        this.G = duration;
        duration.start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x01db, code lost:
    
        if (kz5.n0.Z(r3) == null) goto L76;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q7(java.lang.String r24, android.graphics.Bitmap r25, boolean r26, r45.ei0 r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hf2.x.q7(java.lang.String, android.graphics.Bitmap, boolean, r45.ei0, boolean):void");
    }

    public final java.lang.Boolean r7() {
        if (this.f362724w != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f362714m, "prepareContainer but have init!");
            return java.lang.Boolean.TRUE;
        }
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf N6 = N6();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ub ubVar = this.f372632e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.v1 v1Var = ubVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.v1 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.v1) ubVar : null;
        if (N6 == null || v1Var == null) {
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14294x41206b57 c14294x41206b57 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14294x41206b57(N6, null);
        c14294x41206b57.setOnClickListener(new hf2.i(this));
        v1Var.addView(c14294x41206b57, new android.view.ViewGroup.LayoutParams(-1, -1));
        this.f362724w = c14294x41206b57;
        return java.lang.Boolean.TRUE;
    }

    /* renamed from: release */
    public final void m133483x41012807() {
        this.f362723v = false;
        hf2.h0 f76 = f7();
        qc0.g1 g1Var = f76.f362605c;
        if (g1Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2013x8f55093d.C17090xc5b6aeb7 c17090xc5b6aeb7 = (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2013x8f55093d.C17090xc5b6aeb7) g1Var;
            ym5.y5 y5Var = c17090xc5b6aeb7.f237961f;
            l45.q m177317xc879b3f2 = y5Var != null ? y5Var.m177317xc879b3f2() : null;
            if (m177317xc879b3f2 != null) {
                ((l45.n) m177317xc879b3f2).f398008p = null;
            }
            c17090xc5b6aeb7.f237962g = null;
        }
        f76.f362606d = null;
        hf2.y0 g76 = g7();
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = g76.f362736d;
        if (f5Var != null) {
            f5Var.d();
        }
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var2 = g76.f362736d;
        if (f5Var2 != null) {
            f5Var2.f291933e = null;
        }
        g76.f362736d = null;
        g76.c(g76.f362738f);
        g76.f362737e = null;
        g76.f362738f = null;
        g76.f362739g = null;
        g76.f362740h = null;
        g76.f362741i = null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("launchMaasReleaseJob maasReleaseJob is activate:");
        p3325xe03a0797.p3326xc267989b.r2 r2Var = g76.f362743k;
        sb6.append(r2Var != null ? java.lang.Boolean.valueOf(((p3325xe03a0797.p3326xc267989b.a) r2Var).a()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(g76.f362734b, sb6.toString());
        p3325xe03a0797.p3326xc267989b.r2 r2Var2 = g76.f362743k;
        if (r2Var2 != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var2, null, 1, null);
        }
        g76.f362743k = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.d(g76.f362733a, null, null, new hf2.n0(g76, null), 3, null);
        android.view.ViewGroup viewGroup = this.f362724w;
        if (viewGroup != null) {
            zl2.r4.f555483a.Q2(viewGroup);
        }
        android.view.ViewGroup viewGroup2 = this.f362724w;
        if (viewGroup2 != null) {
            viewGroup2.removeAllViews();
        }
        this.f362724w = null;
        hf2.b2 h76 = h7();
        android.view.View view = h76.f362547i;
        if (view != null) {
            zl2.r4.f555483a.Q2(view);
        }
        h76.f362547i = null;
        hf2.l2 l76 = l7();
        android.view.View view2 = l76.f362639c;
        if (view2 != null) {
            zl2.r4.f555483a.Q2(view2);
        }
        l76.f362639c = null;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c c22613xe7040d9c = l76.f362640d;
        if (c22613xe7040d9c != null) {
            c22613xe7040d9c.m81307xf9cef5a7(null);
        }
        ((hf2.q2) ((jz5.n) this.D).mo141623x754a37bb()).getClass();
    }

    public final void s7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.o9 o9Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f362714m, "resumePreviewScaleState");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ub ubVar = this.f372632e;
        if (ubVar == null || (o9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.o9) ubVar.mo57682x2a5e9229(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.o9.class)) == null) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("resumeCameraOptionState ");
        sb6.append(o9Var.f195254v == 1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCoreAnchor", sb6.toString());
        o9Var.f195250r.m46526xf9281a1f(o9Var.f195254v == 1);
    }

    public final void t7(java.lang.String source, r45.ei0 ei0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        this.f362718q = ei0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f362714m, source + " saveTmpRestoreData " + je2.g.f380753u.b(ei0Var));
    }

    public final void u7(boolean z17) {
        if (z17 != this.F) {
            boolean T7 = ((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).T7();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f362714m, "modify editing from " + this.F + " to " + z17 + ",is beforeLive:" + T7 + ", liveState:" + ((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).f410346h2);
            if (z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ub ubVar = this.f372632e;
                if (ubVar != null) {
                    ubVar.mo57727x9929ae66(1.0f, 0.3f);
                }
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ub ubVar2 = this.f372632e;
                if (ubVar2 != null) {
                    ubVar2.mo57727x9929ae66(0.3f, 1.0f);
                }
            }
            if (T7) {
                java.util.LinkedList linkedList = null;
                if (z17) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.qa qaVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.qa) R6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.qa.class);
                    if (qaVar != null) {
                        linkedList = new java.util.LinkedList();
                        linkedList.add(qaVar);
                    }
                    p7(linkedList, 1.0f, 0.3f);
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.qa qaVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.qa) R6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.qa.class);
                    if (qaVar2 != null) {
                        linkedList = new java.util.LinkedList();
                        linkedList.add(qaVar2);
                    }
                    p7(linkedList, 0.3f, 1.0f);
                }
            }
        }
        if (!z17) {
            hf2.p1 p1Var = (hf2.p1) ((jz5.n) this.E).mo141623x754a37bb();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(p1Var.f362670b, "runDropTask size:" + p1Var.a().size());
            if (!p1Var.a().isEmpty()) {
                synchronized (p1Var.a()) {
                    java.util.Iterator it = p1Var.a().iterator();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it, "iterator(...)");
                    while (it.hasNext()) {
                        java.lang.Object next = it.next();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(next, "next(...)");
                        ((java.lang.Runnable) next).run();
                        it.remove();
                    }
                }
            }
        }
        this.F = z17;
    }

    public final void v7(r45.h84 h84Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("set selectTextSticker:");
        sb6.append(h84Var != null ? je2.g.f380753u.d(h84Var) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f362714m, sb6.toString());
        this.f362719r = h84Var;
    }

    public final void w7(int i17, java.lang.String pictureFilePath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pictureFilePath, "pictureFilePath");
        boolean z17 = i17 == 2 || i17 == 1;
        java.lang.String str = this.f362714m;
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "showStickerEdit fail,stickerType:" + i17 + " invalid!");
            return;
        }
        if (this.f362721t) {
            db5.t7.m(O6(), O6().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lju));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "showStickerEdit is linking!");
        } else if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r7(), java.lang.Boolean.TRUE)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "showStickerEdit fail,sticker edit container is null!");
            m7("showStickerEdit fail");
        } else {
            if (i17 == 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(this, null, null, new hf2.q(this, i17, pictureFilePath, null), 3, null);
            } else {
                f7().b(i17, 1, pictureFilePath);
            }
            u7(true);
        }
    }
}
