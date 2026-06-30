package gx0;

/* loaded from: classes5.dex */
public final class x4 extends du0.o {
    public final jz5.g A;
    public final jz5.g B;
    public final jz5.g C;
    public final jz5.g D;

    /* renamed from: y, reason: collision with root package name */
    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 f358689y;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f358690z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f358690z = jz5.h.b(new gx0.q4(this));
        this.A = jz5.h.b(new gx0.n4(this));
        this.B = jz5.h.b(new gx0.s4(this));
        this.C = jz5.h.b(new gx0.w4(this));
        this.D = jz5.h.b(new gx0.t4(this));
    }

    @Override // dv0.a
    public boolean C5() {
        return ((rv0.n1) ((jz5.n) this.A).mo141623x754a37bb()).X6();
    }

    @Override // dv0.a
    public void F5(au0.b boxItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(boxItem, "boxItem");
        gx0.kh v76 = v7();
        java.lang.String string = j65.q.a(m80379x76847179()).getString(com.p314xaae8f345.mm.R.C30867xcad56011.lm7);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        v76.r7(string, null);
        Y6().e();
        s7();
    }

    @Override // dv0.a
    public boolean H4(au0.b selectedBoxItem, com.p314xaae8f345.p457x3304c6.p466x3d27ea3.p467x633fb29.C4051xa7726999.MJRectCorner corner) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selectedBoxItem, "selectedBoxItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(corner, "corner");
        cv0.m a17 = cv0.h.a(selectedBoxItem.b(), corner);
        if (a17 == cv0.m.f304076e) {
            return false;
        }
        W6().H7(selectedBoxItem.c(), selectedBoxItem.b(), a17, zw0.b.f558085f);
        return true;
    }

    @Override // dv0.a
    public com.p314xaae8f345.p457x3304c6.p466x3d27ea3.p467x633fb29.C4051xa7726999.MJRectCorner M5(android.graphics.PointF location, com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3972x4b2f2ae rect) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(location, "location");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rect, "rect");
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4152x8b3cf7db u76 = u7();
        com.p314xaae8f345.p457x3304c6.p466x3d27ea3.p467x633fb29.C4051xa7726999.MJRectCorner m34150xba5f35c3 = u76 != null ? u76.m34150xba5f35c3(location, rect) : null;
        return m34150xba5f35c3 == null ? com.p314xaae8f345.p457x3304c6.p466x3d27ea3.p467x633fb29.C4051xa7726999.MJRectCorner.MJRectCornerInvalid : m34150xba5f35c3;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b2  */
    @Override // dv0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean N2(au0.b r11) {
        /*
            r10 = this;
            java.lang.String r0 = "boxItem"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r11, r0)
            gx0.w r0 = r10.W6()
            jz5.g r1 = r0.f358621o
            jz5.n r1 = (jz5.n) r1
            java.lang.Object r1 = r1.mo141623x754a37bb()
            hw0.z r1 = (hw0.z) r1
            com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel r1 = r1.f150773i
            boolean r1 = com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.z.a(r1)
            r2 = 0
            r3 = 1
            if (r1 != 0) goto Lae
            jz5.g r1 = r0.f358620n
            jz5.n r1 = (jz5.n) r1
            java.lang.Object r1 = r1.mo141623x754a37bb()
            uw0.t0 r1 = (uw0.t0) r1
            com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel r1 = r1.f150773i
            boolean r1 = com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.z.a(r1)
            if (r1 != 0) goto Lae
            jz5.g r1 = r0.f358622p
            jz5.n r1 = (jz5.n) r1
            java.lang.Object r1 = r1.mo141623x754a37bb()
            uw0.o r1 = (uw0.o) r1
            com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel r1 = r1.f150773i
            boolean r1 = com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.z.a(r1)
            if (r1 != 0) goto Lae
            jz5.g r1 = r0.f358628v
            jz5.n r1 = (jz5.n) r1
            java.lang.Object r1 = r1.mo141623x754a37bb()
            lw0.l r1 = (lw0.l) r1
            com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel r1 = r1.f150773i
            boolean r1 = com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.z.a(r1)
            if (r1 != 0) goto Lae
            jz5.g r1 = r0.f358631y
            jz5.n r1 = (jz5.n) r1
            java.lang.Object r1 = r1.mo141623x754a37bb()
            ew0.l r1 = (ew0.l) r1
            if (r1 == 0) goto L6d
            com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel r1 = r1.f150773i
            ew0.a r1 = (ew0.a) r1
            if (r1 == 0) goto L6d
            boolean r1 = com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.z.a(r1)
            if (r1 != r3) goto L6d
            r1 = r3
            goto L6e
        L6d:
            r1 = r2
        L6e:
            if (r1 != 0) goto Lae
            jz5.g r1 = r0.f358632z
            jz5.n r1 = (jz5.n) r1
            java.lang.Object r1 = r1.mo141623x754a37bb()
            bw0.l r1 = (bw0.l) r1
            com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel r1 = r1.f150773i
            boolean r1 = com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.z.a(r1)
            if (r1 != 0) goto Lae
            jz5.g r1 = r0.A
            jz5.n r1 = (jz5.n) r1
            java.lang.Object r1 = r1.mo141623x754a37bb()
            uw0.e1 r1 = (uw0.e1) r1
            if (r1 == 0) goto L9c
            com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel r1 = r1.f150773i
            uw0.u0 r1 = (uw0.u0) r1
            if (r1 == 0) goto L9c
            boolean r1 = com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.z.a(r1)
            if (r1 != r3) goto L9c
            r1 = r3
            goto L9d
        L9c:
            r1 = r2
        L9d:
            if (r1 != 0) goto Lae
            jv0.g r0 = r0.Y6()
            com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel r0 = r0.f150773i
            boolean r0 = com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.z.a(r0)
            if (r0 == 0) goto Lac
            goto Lae
        Lac:
            r0 = r2
            goto Laf
        Lae:
            r0 = r3
        Laf:
            if (r0 == 0) goto Lb2
            return r2
        Lb2:
            gx0.w r0 = r10.W6()
            bu0.b r1 = r11.b()
            boolean r0 = r0.f7(r1)
            if (r0 == 0) goto Lc4
            r10.U6(r2)
            goto Ld5
        Lc4:
            yt0.c r0 = r10.a7()
            boolean r0 = r0.A4()
            if (r0 == 0) goto Ld2
            r10.p7()
            goto Ld5
        Ld2:
            r10.U6(r2)
        Ld5:
            com.tencent.maas.base.MJID r5 = r11.c()
            r6 = 0
            r7 = 0
            r8 = 6
            r9 = 0
            r4 = r10
            du0.o.o7(r4, r5, r6, r7, r8, r9)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: gx0.x4.N2(au0.b):boolean");
    }

    @Override // dv0.a
    public boolean P4(au0.b boxItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(boxItem, "boxItem");
        if (!f7(boxItem.c())) {
            return false;
        }
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a h76 = t7().h7();
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 B = ((com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4183xefcb50b7) boxItem.f95586a).B();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(B, "getPresentationTimeRange(...)");
        return B.m34002x805f158c(h76);
    }

    @Override // du0.o
    public cv0.c V6() {
        return new cv0.j(new cv0.d(), this);
    }

    @Override // dv0.a
    public com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 W0(android.graphics.PointF pointF) {
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4152x8b3cf7db.SegmentIDAndFrame m34156x955af2ce;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pointF, "pointF");
        gx0.fd fdVar = (gx0.fd) t7().f357788v.mo3195x754a37bb();
        if (fdVar == null || fdVar == gx0.fd.f357962e || fdVar == gx0.fd.f357963f || fdVar == gx0.fd.f357967m || fdVar == gx0.fd.f357968n) {
            return null;
        }
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4152x8b3cf7db u76 = u7();
        java.lang.String str = (u76 == null || (m34156x955af2ce = u76.m34156x955af2ce(pointF)) == null) ? null : m34156x955af2ce.f129930a;
        if (str == null || str.length() == 0) {
            return null;
        }
        return com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78.of(str);
    }

    @Override // dv0.a
    public void a4(au0.b boxItem, float f17, float f18, com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3972x4b2f2ae renderViewRect2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(boxItem, "boxItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(renderViewRect2, "renderViewRect2");
        cv0.i iVar = boxItem instanceof cv0.i ? (cv0.i) boxItem : null;
        boolean z17 = false;
        if (iVar != null ? ((com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4183xefcb50b7) iVar.f95586a).q0() : false) {
            java.lang.Object obj = boxItem.f95586a;
            r7((com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713) obj);
            com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4183xefcb50b7 c4183xefcb50b7 = (com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4183xefcb50b7) obj;
            android.graphics.PointF m07 = c4183xefcb50b7.m0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m07, "getLayerPosition(...)");
            m07.toString();
            com.p314xaae8f345.p457x3304c6.p479x4179489f.C4152x8b3cf7db u76 = u7();
            if (u76 == null) {
                return;
            }
            android.graphics.PointF m34134xb175183b = u76.m34134xb175183b(m07);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m34134xb175183b, "calcPoint(...)");
            yw0.k Y6 = Y6();
            android.graphics.PointF l07 = c4183xefcb50b7.l0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(l07, "getLayerNormalizedPosition(...)");
            Y6.getClass();
            float f19 = l07.x * renderViewRect2.m32427xfb854877().f129332x;
            float f27 = l07.y * renderViewRect2.m32427xfb854877().f129333y;
            float d17 = Y6.d(Y6.f548100i, renderViewRect2.m32427xfb854877().f129332x, f19, f17);
            float d18 = Y6.d(Y6.f548101j, renderViewRect2.m32427xfb854877().f129333y, f27, f18);
            android.graphics.PointF pointF = Y6.f548097f;
            pointF.set(m34134xb175183b.x + d17, m34134xb175183b.y + d18);
            ((yw0.l) Y6.f548093b).a();
            android.graphics.PointF m34135xeeb76d6a = u76.m34135xeeb76d6a(pointF);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m34135xeeb76d6a, "calcRenderCoord(...)");
            gx0.kh v76 = v7();
            com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 segmentId = boxItem.c();
            v76.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentId, "segmentId");
            ex0.a0 a0Var = v76.f358175r;
            if (a0Var != null) {
                ex0.f e17 = ex0.i0.e(a0Var, segmentId);
                if (e17 != null && e17.r(m34135xeeb76d6a)) {
                    java.util.EnumSet of6 = java.util.EnumSet.of(cx0.d.f306041d);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(of6, "of(...)");
                    a0Var.J(of6, null);
                    z17 = true;
                }
            }
            ug.m C = c4183xefcb50b7.C();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(C, "getSegmentType(...)");
            if (C == ug.m.ContentDesc || C == ug.m.Narration || C == ug.m.Caption) {
                v7().Z6(c4183xefcb50b7);
            }
            if (z17) {
                t7().c7();
            }
        }
    }

    @Override // du0.o
    public void c7(au0.b boxItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(boxItem, "boxItem");
        jz5.g gVar = this.f324925n;
        if (!((ow0.a0) ((jz5.n) gVar).mo141623x754a37bb()).X6()) {
            jz5.g gVar2 = this.f324926o;
            if (((hw0.n) ((jz5.n) gVar2).mo141623x754a37bb()).X6()) {
                hw0.n nVar = (hw0.n) ((jz5.n) gVar2).mo141623x754a37bb();
                nVar.getClass();
                nVar.f367005q = boxItem;
                return;
            } else {
                jz5.g gVar3 = this.f358690z;
                if (((cw0.l0) ((jz5.n) gVar3).mo141623x754a37bb()).X6()) {
                    ((cw0.l0) ((jz5.n) gVar3).mo141623x754a37bb()).C7(boxItem.c());
                    return;
                }
                return;
            }
        }
        ow0.a0 a0Var = (ow0.a0) ((jz5.n) gVar).mo141623x754a37bb();
        bu0.b materialType = boxItem.b();
        a0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(materialType, "materialType");
        int ordinal = materialType.ordinal();
        if (ordinal == 1) {
            sw0.f fVar = sw0.f.f494964f;
            ow0.g gVar4 = (ow0.g) a0Var.f150773i;
            if (gVar4 != null) {
                gVar4.C(fVar);
                return;
            }
            return;
        }
        if (ordinal == 9) {
            sw0.f fVar2 = sw0.f.f494965g;
            ow0.g gVar5 = (ow0.g) a0Var.f150773i;
            if (gVar5 != null) {
                gVar5.C(fVar2);
                return;
            }
            return;
        }
        if (ordinal == 5) {
            sw0.f fVar3 = sw0.f.f494962d;
            ow0.g gVar6 = (ow0.g) a0Var.f150773i;
            if (gVar6 != null) {
                gVar6.C(fVar3);
                return;
            }
            return;
        }
        if (ordinal != 6) {
            return;
        }
        sw0.f fVar4 = sw0.f.f494963e;
        ow0.g gVar7 = (ow0.g) a0Var.f150773i;
        if (gVar7 != null) {
            gVar7.C(fVar4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // dv0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d5(boolean r5, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof gx0.r4
            if (r0 == 0) goto L13
            r0 = r6
            gx0.r4 r0 = (gx0.r4) r0
            int r1 = r0.f358448g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f358448g = r1
            goto L18
        L13:
            gx0.r4 r0 = new gx0.r4
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f358446e
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f358448g
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.f358445d
            gx0.x4 r5 = (gx0.x4) r5
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            goto L42
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            r0.f358445d = r4
            r0.f358448g = r3
            java.lang.Object r5 = r4.x7(r5, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            r5 = r4
        L42:
            r5.s7()
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: gx0.x4.d5(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // du0.o
    public void d7() {
        t7().A.mo7806x9d92d11c(m158354x19263085(), new gx0.o4(this));
        t7().f357788v.mo7806x9d92d11c(m158354x19263085(), new gx0.p4(this));
    }

    @Override // du0.o
    public boolean e7(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 mjID) {
        ex0.v vVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mjID, "mjID");
        ex0.a0 a0Var = v7().f358175r;
        if (a0Var == null || (vVar = a0Var.f338630g) == null) {
            return false;
        }
        return vVar.b(mjID);
    }

    @Override // du0.o
    public hw0.n g7() {
        return (hw0.n) T6(gx0.r1.class);
    }

    @Override // du0.o
    public ow0.a0 h7() {
        return (ow0.a0) T6(gx0.u2.class);
    }

    @Override // du0.o
    public gx0.w i7() {
        return (gx0.w) T6(gx0.f4.class);
    }

    @Override // du0.o
    public yt0.c k7() {
        return (yt0.c) T6(gx0.w8.class);
    }

    @Override // dv0.a
    public boolean l0(android.graphics.PointF location, com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3972x4b2f2ae rect) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(location, "location");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rect, "rect");
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4152x8b3cf7db u76 = u7();
        if (u76 != null) {
            return u76.m34159x85265579(location, rect);
        }
        return false;
    }

    @Override // du0.o
    public void m7(au0.b boxItem, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(boxItem, "boxItem");
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4152x8b3cf7db u76 = u7();
        if (u76 == null) {
            return;
        }
        cv0.e a76 = W6().a7(boxItem.b());
        if (boxItem.mo9048xdac2174d()) {
            p3325xe03a0797.p3326xc267989b.l.d(m158345xefc66565(), null, null, new gx0.u4(z17, this, a76, boxItem, u76, null), 3, null);
        }
    }

    @Override // dv0.a
    public au0.b o6(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 mjID) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mjID, "mjID");
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 b76 = v7().b7(mjID);
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4183xefcb50b7 c4183xefcb50b7 = b76 instanceof com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4183xefcb50b7 ? (com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4183xefcb50b7) b76 : null;
        if (c4183xefcb50b7 != null) {
            return new cv0.i(c4183xefcb50b7);
        }
        return null;
    }

    @Override // dv0.a
    public boolean q() {
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4152x8b3cf7db u76 = u7();
        return u76 != null && u76.m34158x88661088();
    }

    public void q7(java.util.List decorationBoxConfigs) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(decorationBoxConfigs, "decorationBoxConfigs");
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4152x8b3cf7db u76 = u7();
        if (u76 != null) {
            u76.m34129xff7f5208(decorationBoxConfigs);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b3  */
    @Override // dv0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void r2(au0.b r12, float r13, float r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gx0.x4.r2(au0.b, float, float, boolean):void");
    }

    @Override // dv0.a
    public void r6(com.p314xaae8f345.p457x3304c6.p479x4179489f.x onChange) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onChange, "onChange");
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4152x8b3cf7db u76 = u7();
        if (u76 != null) {
            u76.m34168xa41edb5a(onChange);
        }
    }

    public final void r7(com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 segment) {
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4152x8b3cf7db u76 = u7();
        if (u76 != null) {
            yw0.t tVar = (yw0.t) ((jz5.n) this.D).mo141623x754a37bb();
            tVar.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segment, "segment");
            ((yw0.l) tVar.f548120a).b(java.lang.Integer.valueOf(((int) tVar.f548125f.top) - ((int) (j65.q.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).getDisplayMetrics().density * 10))));
            tVar.f548127h = true;
            com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3972x4b2f2ae c3972x4b2f2ae = tVar.f548122c;
            java.util.Objects.toString(c3972x4b2f2ae);
            u76.m34132x6c2e9c5a(segment.f130065a, c3972x4b2f2ae, tVar);
        }
    }

    public final void s7() {
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4152x8b3cf7db u76 = u7();
        if (u76 != null) {
            yw0.t tVar = (yw0.t) ((jz5.n) this.D).mo141623x754a37bb();
            tVar.getClass();
            yw0.l lVar = (yw0.l) tVar.f548120a;
            lVar.b(null);
            java.lang.String safaPlaceTip = tVar.f548123d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(safaPlaceTip, "safaPlaceTip");
            lVar.c(safaPlaceTip, false);
            u76.m34146x4ba9088c();
            tVar.f548127h = false;
            lVar.a();
        }
    }

    public final gx0.bf t7() {
        return (gx0.bf) ((jz5.n) this.B).mo141623x754a37bb();
    }

    public final com.p314xaae8f345.p457x3304c6.p479x4179489f.C4152x8b3cf7db u7() {
        return t7().k7();
    }

    public final gx0.kh v7() {
        return (gx0.kh) ((jz5.n) this.C).mo141623x754a37bb();
    }

    @Override // dv0.a
    public boolean w5(au0.b boxItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(boxItem, "boxItem");
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.q qVar = (com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.q) a7().v6().f421961b.j();
        if ((qVar == null ? false : qVar instanceof com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.r) && com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.z.a(qVar)) {
            return true;
        }
        gx0.w W6 = W6();
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 segmentID = boxItem.c();
        bu0.b materialType = boxItem.b();
        cv0.m mVar = cv0.m.f304078g;
        zw0.b bVar = zw0.b.f558085f;
        W6.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentID, "segmentID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(materialType, "materialType");
        W6.z7(segmentID, materialType, mVar, bVar, true);
        l7();
        return true;
    }

    public void w7() {
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4152x8b3cf7db u76 = u7();
        if (u76 != null) {
            u76.m34163x23784cac();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object x7(boolean r12, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof gx0.v4
            if (r0 == 0) goto L13
            r0 = r13
            gx0.v4 r0 = (gx0.v4) r0
            int r1 = r0.f358587h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f358587h = r1
            goto L18
        L13:
            gx0.v4 r0 = new gx0.v4
            r0.<init>(r11, r13)
        L18:
            r7 = r0
            java.lang.Object r13 = r7.f358585f
            pz5.a r0 = pz5.a.f440719d
            int r1 = r7.f358587h
            jz5.f0 r10 = jz5.f0.f384359a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L45
            if (r1 == r3) goto L39
            if (r1 != r2) goto L31
            java.lang.Object r12 = r7.f358583d
            gx0.x4 r12 = (gx0.x4) r12
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)
            goto L86
        L31:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L39:
            boolean r12 = r7.f358584e
            java.lang.Object r1 = r7.f358583d
            gx0.x4 r1 = (gx0.x4) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)
            r13 = r12
            r12 = r1
            goto L5a
        L45:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)
            r7.f358583d = r11
            r7.f358584e = r12
            r7.f358587h = r3
            yw0.k r13 = r11.Y6()
            r13.e()
            if (r10 != r0) goto L58
            return r0
        L58:
            r13 = r12
            r12 = r11
        L5a:
            com.tencent.maas.moviecomposing.PlaybackSession r1 = r12.u7()
            if (r1 == 0) goto L63
            r1.m34143x6cfac87b()
        L63:
            com.tencent.maas.moviecomposing.PlaybackSession r1 = r12.u7()
            if (r1 == 0) goto L6c
            r1.m34166x81ae825f()
        L6c:
            if (r13 == 0) goto L86
            gx0.bf r1 = r12.t7()
            r13 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r8 = 31
            r9 = 0
            r7.f358583d = r12
            r7.f358587h = r2
            r2 = r13
            java.lang.Object r13 = gx0.bf.r7(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            if (r13 != r0) goto L86
            return r0
        L86:
            r13 = 0
            r12.f358689y = r13
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: gx0.x4.x7(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
