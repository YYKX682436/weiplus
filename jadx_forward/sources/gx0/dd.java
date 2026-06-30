package gx0;

/* loaded from: classes5.dex */
public final class dd extends lw0.l {

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f357870s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f357871t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f357872u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f357873v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f357874w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dd(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f357870s = jz5.h.b(new gx0.cd(this));
        this.f357871t = jz5.h.b(new gx0.zc(this));
        this.f357872u = jz5.h.b(new gx0.ad(this));
        this.f357873v = jz5.h.b(new gx0.bd(this));
        this.f357874w = jz5.h.b(new gx0.uc(this));
    }

    @Override // lw0.l, com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k
    public void b7() {
        super.b7();
        ex0.a0 a0Var = y7().f358175r;
        if (a0Var != null) {
            ex0.i0.l(a0Var);
        }
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k
    public void e7() {
        zw0.d dVar;
        gx0.kc kcVar = (gx0.kc) ((jz5.n) this.f357873v).mo141623x754a37bb();
        lw0.c cVar = (lw0.c) this.f150773i;
        if (cVar == null || (dVar = cVar.mo47067x3a90fbd6()) == null) {
            dVar = zw0.d.f558094f;
        }
        gx0.hf.b7(kcVar, dVar, null, 2, null);
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k
    public void f7(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6 abstractC10936x89d53ec6) {
        lw0.c panel = (lw0.c) abstractC10936x89d53ec6;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(panel, "panel");
        p3325xe03a0797.p3326xc267989b.l.d(m158345xefc66565(), null, null, new gx0.yc(this, null), 3, null);
    }

    @Override // lw0.l
    public boolean l7(kw0.e state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4193x18f1b4c6 z76 = z7();
        if (z76 == null) {
            return false;
        }
        gx0.kh y76 = y7();
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78 = z76.f130065a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c3971x241f78, "getSegmentID(...)");
        ex0.k0 p76 = y76.p7(c3971x241f78);
        if (p76 == null) {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            p76 = null;
        }
        if (p76 == null) {
            return false;
        }
        kw0.a b17 = fv0.e.b(state);
        if (zu0.i.f557209f != (b17 != null ? b17.f394322b : null)) {
            return false;
        }
        java.lang.String str2 = b17.f394321a.f129757b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "getMaterialID(...)");
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4193x18f1b4c6 c4193x18f1b4c6 = p76.f338678p;
        c4193x18f1b4c6.getClass();
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D = c4193x18f1b4c6.D();
        boolean booleanValue = (D != null ? com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4193x18f1b4c6.E0(c4193x18f1b4c6, str2, D) : bool).booleanValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, "onWhenWhereReplaced: updateResult " + booleanValue);
        if (!booleanValue) {
            return false;
        }
        c4193x18f1b4c6.getClass();
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D2 = c4193x18f1b4c6.D();
        boolean booleanValue2 = (D2 != null ? com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4193x18f1b4c6.v0(c4193x18f1b4c6, D2) : bool).booleanValue();
        jz5.g gVar = this.f357873v;
        if (booleanValue2 && c4193x18f1b4c6.I0() == 0) {
            ex0.c g76 = y7().g7(((gx0.kc) ((jz5.n) gVar).mo141623x754a37bb()).e7());
            if (g76 == null) {
                java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                g76 = null;
            }
            if (g76 == null) {
                return false;
            }
            p76.B(g76.A());
        }
        c4193x18f1b4c6.getClass();
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D3 = c4193x18f1b4c6.D();
        if (D3 != null) {
            bool = com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4193x18f1b4c6.z0(c4193x18f1b4c6, D3);
        }
        boolean booleanValue3 = bool.booleanValue();
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 c4190xd8dd3713 = p76.f338700a;
        if (!booleanValue3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, "onWhenWhereReplaced: isDisplayingLocation false ");
            w7(c4190xd8dd3713);
            return true;
        }
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4186x9bb007e5 H0 = c4193x18f1b4c6.H0();
        java.lang.String m34563xfb82e301 = H0 != null ? H0.m34563xfb82e301() : null;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4186x9bb007e5 H02 = m34563xfb82e301 == null || m34563xfb82e301.length() == 0 ? null : c4193x18f1b4c6.H0();
        if (H02 != null) {
            p76.A(H02);
            w7(c4190xd8dd3713);
        } else {
            ex0.c g77 = y7().g7(((gx0.kc) ((jz5.n) gVar).mo141623x754a37bb()).e7());
            if (g77 == null) {
                java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                g77 = null;
            }
            if (g77 == null) {
                return false;
            }
            du0.i0 P6 = P6();
            com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 c4181x2248e1a3 = g77.f338652p;
            c4181x2248e1a3.getClass();
            com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D4 = c4181x2248e1a3.D();
            P6.O6(D4 != null ? com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3.U0(c4181x2248e1a3, D4) : null, new gx0.tc(p76, this));
        }
        return true;
    }

    @Override // lw0.l
    public lw0.d o7() {
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4193x18f1b4c6 z76 = z7();
        if (z76 != null) {
            return zt0.b.a(z76);
        }
        return null;
    }

    @Override // lw0.l
    public void p7(lw0.c panel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(panel, "panel");
        super.p7(panel);
        ((gx0.gf) ((jz5.n) this.f357872u).mo141623x754a37bb()).f358006f.mo7806x9d92d11c(W6(), new gx0.vc(this));
    }

    @Override // lw0.l
    public void q7(java.util.Calendar calendarDate) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(calendarDate, "calendarDate");
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4193x18f1b4c6 z76 = z7();
        if (z76 == null) {
            return;
        }
        gx0.kh y76 = y7();
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78 = z76.f130065a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c3971x241f78, "getSegmentID(...)");
        ex0.k0 p76 = y76.p7(c3971x241f78);
        if (p76 == null) {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            p76 = null;
        }
        if (p76 == null) {
            return;
        }
        p76.B(calendarDate.getTimeInMillis());
        p3325xe03a0797.p3326xc267989b.l.d(m158345xefc66565(), null, null, new gx0.wc(this, null), 3, null);
        gx0.bf x76 = x7();
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 B = z76.B();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(B, "getPresentationTimeRange(...)");
        ou0.d.b(x76, B);
    }

    @Override // lw0.l
    public void r7(com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4186x9bb007e5 geographicInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(geographicInfo, "geographicInfo");
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4193x18f1b4c6 z76 = z7();
        if (z76 == null) {
            return;
        }
        lw0.c cVar = (lw0.c) this.f150773i;
        if (cVar != null) {
            com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4186x9bb007e5 H0 = z76.H0();
            cVar.m146403x221fdc72(H0 != null ? H0.m34563xfb82e301() : null);
        }
        gx0.kh y76 = y7();
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78 = z76.f130065a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c3971x241f78, "getSegmentID(...)");
        ex0.k0 p76 = y76.p7(c3971x241f78);
        if (p76 != null) {
            p76.A(geographicInfo);
        }
        p3325xe03a0797.p3326xc267989b.l.d(m158345xefc66565(), null, null, new gx0.xc(this, null), 3, null);
        gx0.bf x76 = x7();
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 B = z76.B();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(B, "getPresentationTimeRange(...)");
        ou0.d.b(x76, B);
    }

    @Override // lw0.l
    public void s7() {
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4193x18f1b4c6 z76 = z7();
        if (z76 != null) {
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D = z76.D();
            if ((D != null ? com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4193x18f1b4c6.v0(z76, D) : bool).booleanValue()) {
                com.p314xaae8f345.p457x3304c6.p479x4179489f.e eVar = new com.p314xaae8f345.p457x3304c6.p479x4179489f.e(false, false, false, false, false, false);
                com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D2 = z76.D();
                if (D2 != null) {
                    eVar = com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4193x18f1b4c6.F0(z76, D2);
                }
                k7(eVar, z76.I0());
                return;
            }
            com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D3 = z76.D();
            if (D3 != null) {
                bool = com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4193x18f1b4c6.z0(z76, D3);
            }
            if (bool.booleanValue()) {
                m7(z76.H0());
            }
        }
    }

    @Override // lw0.l
    public void t7() {
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4193x18f1b4c6 z76 = z7();
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78 = z76 != null ? z76.f130065a : null;
        ex0.a0 a0Var = y7().f358175r;
        ex0.v vVar = a0Var != null ? a0Var.f338630g : null;
        if (c3971x241f78 != null) {
            boolean z17 = false;
            if (vVar != null && !vVar.b(c3971x241f78)) {
                z17 = true;
            }
            if (z17) {
                return;
            }
            com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a = (ou0.g) x7().A.mo3195x754a37bb();
            if (c4128x879fba0a == null) {
                c4128x879fba0a = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16098x2ccb95b5;
            }
            gx0.kh y76 = y7();
            java.lang.String string = j65.q.a(m80379x76847179()).getString(com.p314xaae8f345.mm.R.C30867xcad56011.llz);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            y76.r7(string, c4128x879fba0a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // lw0.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void u7() {
        /*
            r6 = this;
            com.tencent.maas.moviecomposing.segments.WhenWhereSegment r0 = r6.z7()
            r1 = 0
            if (r0 == 0) goto La
            com.tencent.maas.base.MJID r0 = r0.f130065a
            goto Lb
        La:
            r0 = r1
        Lb:
            gx0.kh r2 = r6.y7()
            ex0.a0 r2 = r2.f358175r
            if (r2 == 0) goto L16
            ex0.v r2 = r2.f338630g
            goto L17
        L16:
            r2 = r1
        L17:
            r3 = 2131771422(0x7f10401e, float:1.9174175E38)
            if (r0 == 0) goto L5b
            r4 = 0
            if (r2 == 0) goto L27
            boolean r2 = r2.b(r0)
            r5 = 1
            if (r2 != r5) goto L27
            r4 = r5
        L27:
            if (r4 == 0) goto L5b
            gx0.kh r2 = r6.y7()
            ex0.k0 r0 = r2.p7(r0)
            if (r0 == 0) goto L36
            com.tencent.maas.moviecomposing.segments.Segment r0 = r0.f338700a
            goto L37
        L36:
            r0 = r1
        L37:
            boolean r2 = r0 instanceof com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4193x18f1b4c6
            if (r2 == 0) goto L3e
            com.tencent.maas.moviecomposing.segments.WhenWhereSegment r0 = (com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4193x18f1b4c6) r0
            goto L3f
        L3e:
            r0 = r1
        L3f:
            if (r0 == 0) goto L67
            lw0.d r0 = zt0.b.a(r0)
            lw0.d r2 = r6.f403076p
            boolean r0 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r0, r2)
            if (r0 != 0) goto L67
            android.app.Activity r0 = r6.m80379x76847179()
            android.content.res.Resources r0 = j65.q.a(r0)
            java.lang.String r0 = r0.getString(r3)
            r1 = r0
            goto L67
        L5b:
            android.app.Activity r0 = r6.m80379x76847179()
            android.content.res.Resources r0 = j65.q.a(r0)
            java.lang.String r1 = r0.getString(r3)
        L67:
            if (r1 == 0) goto L81
            gx0.bf r0 = r6.x7()
            androidx.lifecycle.g0 r0 = r0.A
            java.lang.Object r0 = r0.mo3195x754a37bb()
            ou0.g r0 = (ou0.g) r0
            if (r0 == 0) goto L78
            goto L7a
        L78:
            com.tencent.maas.model.time.MJTime r0 = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16098x2ccb95b5
        L7a:
            gx0.kh r2 = r6.y7()
            r2.r7(r1, r0)
        L81:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gx0.dd.u7():void");
    }

    @Override // lw0.l
    public void v7(lw0.c panel, kw0.e state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(panel, "panel");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4193x18f1b4c6 z76 = z7();
        if (z76 != null) {
            gx0.bf x76 = x7();
            com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 B = z76.B();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(B, "getPresentationTimeRange(...)");
            ou0.d.b(x76, B);
        }
        super.v7(panel, state);
    }

    public final void w7(com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 c4190xd8dd3713) {
        gx0.kc kcVar = (gx0.kc) ((jz5.n) this.f357873v).mo141623x754a37bb();
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78 = c4190xd8dd3713.f130065a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c3971x241f78, "getSegmentID(...)");
        gx0.hf.V6(kcVar, c3971x241f78, null, 2, null);
    }

    public final gx0.bf x7() {
        return (gx0.bf) ((jz5.n) this.f357871t).mo141623x754a37bb();
    }

    public final gx0.kh y7() {
        return (gx0.kh) ((jz5.n) this.f357870s).mo141623x754a37bb();
    }

    public final com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4193x18f1b4c6 z7() {
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 m146398x95ce11a9;
        lw0.c cVar = (lw0.c) this.f150773i;
        if (cVar == null || (m146398x95ce11a9 = cVar.m146398x95ce11a9()) == null) {
            return null;
        }
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 o76 = y7().o7();
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 m17 = o76 != null ? o76.m(m146398x95ce11a9) : null;
        if (m17 instanceof com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4193x18f1b4c6) {
            return (com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4193x18f1b4c6) m17;
        }
        return null;
    }
}
