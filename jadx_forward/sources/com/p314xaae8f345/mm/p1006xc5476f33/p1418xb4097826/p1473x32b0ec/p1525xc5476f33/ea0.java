package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class ea0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0 {

    /* renamed from: p, reason: collision with root package name */
    public final android.view.ViewGroup f193919p;

    /* renamed from: q, reason: collision with root package name */
    public final qo0.c f193920q;

    /* renamed from: r, reason: collision with root package name */
    public final yz5.l f193921r;

    /* renamed from: s, reason: collision with root package name */
    public final cm2.t f193922s;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f193923t;

    /* renamed from: u, reason: collision with root package name */
    public so2.j5 f193924u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f193925v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ea0(android.view.ViewGroup entranceRoot, android.view.ViewGroup shoppingWidgetRoot, qo0.c statusMonitor, yz5.l lVar, cm2.t tVar) {
        super(shoppingWidgetRoot, statusMonitor, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(entranceRoot, "entranceRoot");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shoppingWidgetRoot, "shoppingWidgetRoot");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.f193919p = shoppingWidgetRoot;
        this.f193920q = statusMonitor;
        this.f193921r = lVar;
        this.f193922s = tVar;
        this.f193923t = "Finder.LiveShoppingBubblePlugin";
        this.f193925v = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ca0(entranceRoot, this));
    }

    public static final void t1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ea0 ea0Var, cm2.m0 m0Var, boolean z17, l81.b1 b1Var, r45.y23 y23Var) {
        r45.ce0 ce0Var;
        boolean z18;
        boolean z19;
        java.lang.String str;
        cm2.m0 m0Var2;
        boolean z27;
        bw5.x7 x7Var;
        long j17;
        r45.bd5 bd5Var;
        android.content.Context context = ea0Var.f446856d.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        gk2.e live = ea0Var.S0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 Y0 = ea0Var.Y0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(live, "live");
        if (z17) {
            if (y23Var != null && (bd5Var = (r45.bd5) y23Var.m75936x14adae67(70)) != null) {
                ce0Var = (r45.ce0) bd5Var.m75936x14adae67(2);
            }
            ce0Var = null;
        } else {
            if (y23Var != null) {
                ce0Var = (r45.ce0) y23Var.m75936x14adae67(9);
            }
            ce0Var = null;
        }
        if (ce0Var == null || (x7Var = (bw5.x7) ce0Var.m75936x14adae67(10)) == null) {
            z18 = false;
            z19 = false;
            str = "";
        } else {
            byte[] s07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(s07);
            java.lang.String str2 = "live_bubble:" + ((mm2.e1) live.a(mm2.e1.class)).f410521r.m75942xfb822ef2(0) + ':' + ((mm2.c1) live.a(mm2.c1.class)).f410385o + "::" + ((mm2.c1) live.a(mm2.c1.class)).f410394p2 + ':' + s07 + ':' + ((mm2.c1) live.a(mm2.c1.class)).P3 + ':' + ((mm2.c1) live.a(mm2.c1.class)).f410324d3;
            ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
            ml2.y4 y4Var = ml2.j0.f409116i;
            y4Var.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str2, "<set-?>");
            y4Var.f409839n = str2;
            p52.c cVar = p52.h.f433549a;
            java.lang.String obj = s07.toString();
            bw5.u7 f17 = x7Var.f();
            java.lang.String m13091x74292946 = f17 != null ? f17.m13091x74292946() : null;
            n30.r rVar = (n30.r) i95.n0.c(n30.r.class);
            long m75942xfb822ef2 = ((mm2.e1) live.a(mm2.e1.class)).f410521r.m75942xfb822ef2(0);
            ((m30.m) rVar).getClass();
            java.lang.String q17 = b52.b.q(m75942xfb822ef2);
            n30.r rVar2 = (n30.r) i95.n0.c(n30.r.class);
            long j18 = ((mm2.c1) live.a(mm2.c1.class)).f410394p2;
            ((m30.m) rVar2).getClass();
            cVar.g(obj, m13091x74292946, q17, "", b52.b.q(j18));
            bw5.x7 x7Var2 = new bw5.x7();
            x7Var2.f116516q = x7Var.b();
            boolean[] zArr = x7Var2.f116517r;
            zArr[11] = true;
            x7Var2.f116512m = x7Var.f116512m;
            zArr[7] = true;
            x7Var2.f116506d = 4;
            zArr[1] = true;
            x7Var2.j(new java.util.LinkedList(kz5.b0.c("wxa")));
            bw5.u7 u7Var = new bw5.u7();
            u7Var.e(ce0Var.m75945x2fec8307(0));
            u7Var.f(ce0Var.m75945x2fec8307(1));
            u7Var.g(1177);
            u7Var.i(str2);
            u7Var.f115293m = true;
            boolean[] zArr2 = u7Var.f115301u;
            zArr2[7] = true;
            u7Var.f115294n = 1;
            zArr2[8] = true;
            u7Var.f115297q = z17;
            zArr2[11] = true;
            bw5.t7 t7Var = new bw5.t7();
            t7Var.f114815d = z17;
            boolean[] zArr3 = t7Var.f114820i;
            zArr3[1] = true;
            t7Var.f114819h = ce0Var.m75933x41a8a7f2(8);
            zArr3[5] = true;
            t7Var.f114816e = true;
            zArr3[2] = true;
            u7Var.f115299s = t7Var;
            zArr2[13] = true;
            x7Var2.k(u7Var);
            pq.a aVar = new pq.a(context);
            if (z17) {
                str = "";
                z18 = false;
            } else {
                dk2.ah ahVar = new dk2.ah();
                java.lang.String str3 = ((mm2.c1) live.a(mm2.c1.class)).f410385o;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str3, "<set-?>");
                ahVar.f314750m = str3;
                java.lang.String m75945x2fec8307 = y23Var != null ? y23Var.m75945x2fec8307(13) : null;
                if (m75945x2fec8307 == null) {
                    m75945x2fec8307 = "";
                }
                ahVar.f314744d = m75945x2fec8307;
                if (y23Var != null) {
                    z18 = false;
                    j17 = y23Var.m75942xfb822ef2(0);
                } else {
                    z18 = false;
                    j17 = 0;
                }
                ahVar.f314745e = j17;
                str = "";
                ahVar.f314748h = str;
                ahVar.f314753p = 3;
                ahVar.f314754q = s07;
                ahVar.f314757t = z18;
                ahVar.f314751n = ce0Var.m75939xb282bd08(6) == 1 ? true : z18;
                ahVar.f314760w = ce0Var.m75933x41a8a7f2(8) ? true : z18;
                ahVar.f314752o = "bubble";
                aVar.b(ahVar.b());
            }
            aVar.f439087d.f439089a = new st2.e(new java.lang.ref.WeakReference(context), ce0Var, Y0, live, y23Var);
            i95.m c17 = i95.n0.c(pq.q.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            pq.q.Lb((pq.q) c17, aVar, x7Var2, null, 4, null);
            z19 = true;
        }
        if (z19) {
            m0Var2 = m0Var;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.m(ea0Var, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r90(ea0Var, m0Var2, y23Var, null), 3, null);
            z27 = true;
        } else {
            m0Var2 = m0Var;
            z27 = z18;
        }
        if (z27) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98 c11812xa040dc98 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.lang.String m75945x2fec83072 = y23Var.m75945x2fec8307(26);
        jSONObject.put("cookies", m75945x2fec83072 == null ? str : m75945x2fec83072);
        c11812xa040dc98.f158855d = 1;
        c11812xa040dc98.f158858g = jSONObject.toString();
        b1Var.f398574s = c11812xa040dc98;
        r45.ce0 i17 = zl2.q4.f555466a.i(b1Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.l e17 = b1Var.G.e();
        st2.c2 c2Var = st2.c2.f493782a;
        e17.f159074u = c2Var.b(ea0Var.S0(), m0Var2.f124901v, i17);
        b1Var.G = e17.a();
        c2Var.k(b1Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.m(ea0Var, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.q90(z17, ea0Var, m0Var, b1Var, y23Var, null), 3, null);
    }

    public static final void u1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ea0 ea0Var, boolean z17) {
        yz5.l lVar;
        boolean x07 = ea0Var.x0();
        boolean L9 = ((mm2.c1) ea0Var.S0().a(mm2.c1.class)).L9();
        boolean y17 = com.p314xaae8f345.mm.ui.bk.y();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(ea0Var.f193923t, "onShoppingBubbleClick btnClick:" + z17 + " isLandscape:" + x07 + " supportRotate:" + L9 + " inMagicWindowMode:" + y17);
        so2.j5 j5Var = ((mm2.f6) ea0Var.P0(mm2.f6.class)).f410582w;
        cm2.t tVar = j5Var instanceof cm2.t ? (cm2.t) j5Var : null;
        if (tVar != null && (lVar = ea0Var.f193921r) != null) {
            lVar.mo146xb9724478(tVar);
        }
        if (x07 && L9 && !y17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l.s1(ea0Var, "PORTRAIT_ACTION_BUBBLE_CLICK", java.lang.Boolean.valueOf(z17), 0, 4, null);
        } else {
            ea0Var.B1(z17, false);
        }
    }

    public static final void v1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ea0 ea0Var, boolean z17, cm2.m0 m0Var, l81.b1 b1Var) {
        ea0Var.getClass();
        r45.y23 y23Var = m0Var.f124901v;
        r45.gt3 gt3Var = (r45.gt3) y23Var.m75936x14adae67(61);
        boolean z18 = true;
        java.lang.String m75945x2fec8307 = gt3Var != null ? gt3Var.m75945x2fec8307(1) : null;
        int i17 = ((m75945x2fec8307 == null || m75945x2fec8307.length() == 0) ? 1 : 0) ^ 1;
        st2.g3 g3Var = st2.g3.f493859a;
        org.json.JSONObject k17 = g3Var.k(y23Var);
        g3Var.h(k17, m0Var.f124901v.m75941xfb821914(54));
        k17.put("click_type", z17 ? 1 : 0);
        if (z17) {
            k17.put("buy_btn_word", ea0Var.y1().m175922xb3ec590().getText().toString());
        }
        k17.put("if_explaining", y23Var.m75939xb282bd08(10));
        k17.put("product_flag", ea0Var.z1(m0Var));
        k17.put("is_gift_show", i17);
        r45.bd5 bd5Var = (r45.bd5) y23Var.m75936x14adae67(70);
        java.lang.String m75945x2fec83072 = bd5Var != null ? bd5Var.m75945x2fec8307(0) : null;
        if (m75945x2fec83072 != null && m75945x2fec83072.length() != 0) {
            z18 = false;
        }
        if (z18) {
            m75945x2fec83072 = y23Var.m75945x2fec8307(15);
        }
        k17.put("buy_btn_word", m75945x2fec83072);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("on click, product_button_info button_wording:");
        r45.bd5 bd5Var2 = (r45.bd5) y23Var.m75936x14adae67(70);
        sb6.append(bd5Var2 != null ? bd5Var2.m75945x2fec8307(0) : null);
        sb6.append(", button_wording:");
        sb6.append(y23Var.m75945x2fec8307(15));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(ea0Var.f193923t, sb6.toString());
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0.Dj((ml2.r0) c17, ml2.f4.f408965f, b1Var != null ? b1Var.f398567l : null, java.lang.String.valueOf(y23Var.m75942xfb822ef2(0)), null, null, null, 0, 0L, k17, null, null, null, false, null, 16120, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    public cm2.t A() {
        return this.f193922s;
    }

    public final void A1(cm2.m0 m0Var, boolean z17, boolean z18) {
        r45.ce0 ce0Var;
        r45.y23 y23Var = m0Var.f124901v;
        if ((zl2.r4.f555483a.w1() || ((mm2.c1) P0(mm2.c1.class)).T) && !z18 && !z17) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putLong("PARAM_FINDER_LIVE_BUBBLE_PRODUCTID", y23Var.m75942xfb822ef2(0));
            this.f193920q.mo46557x60d69242(qo0.b.f446882f2, bundle);
            return;
        }
        r45.bd5 bd5Var = (r45.bd5) y23Var.m75936x14adae67(70);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = (bd5Var == null || (ce0Var = (r45.ce0) bd5Var.m75936x14adae67(2)) == null) ? null : (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) ce0Var.m75936x14adae67(9);
        r45.bd5 bd5Var2 = (r45.bd5) y23Var.m75936x14adae67(70);
        java.lang.String m75945x2fec8307 = bd5Var2 != null ? bd5Var2.m75945x2fec8307(0) : null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("shopping bubble click, btnClick:");
        sb6.append(z17);
        sb6.append(", productId:");
        sb6.append(y23Var.m75942xfb822ef2(0));
        sb6.append(",buy appId:");
        r45.ce0 ce0Var2 = (r45.ce0) y23Var.m75936x14adae67(8);
        sb6.append(ce0Var2 != null ? ce0Var2.m75945x2fec8307(0) : null);
        sb6.append(",buy path:");
        r45.ce0 ce0Var3 = (r45.ce0) y23Var.m75936x14adae67(8);
        sb6.append(ce0Var3 != null ? ce0Var3.m75945x2fec8307(1) : null);
        sb6.append(",detail appId:");
        r45.ce0 ce0Var4 = (r45.ce0) y23Var.m75936x14adae67(9);
        sb6.append(ce0Var4 != null ? ce0Var4.m75945x2fec8307(0) : null);
        sb6.append(" detail path:");
        r45.ce0 ce0Var5 = (r45.ce0) y23Var.m75936x14adae67(9);
        sb6.append(ce0Var5 != null ? ce0Var5.m75945x2fec8307(1) : null);
        sb6.append(", detail stockId: ");
        sb6.append(y23Var.m75945x2fec8307(14));
        sb6.append(", detail disCountPrice: ");
        sb6.append(y23Var.m75939xb282bd08(18));
        sb6.append(",buttonWording = ");
        sb6.append(m75945x2fec8307);
        sb6.append(", jumpInfo = ");
        sb6.append(c19786x6a1e2862);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f193923t, sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.m(this, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.p90(c19786x6a1e2862, this, z17, m0Var, y23Var, null), 3, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l
    public void B(android.os.Bundle bundle, java.lang.Object obj, long j17) {
        java.lang.String string = bundle != null ? bundle.getString("ACTION_POST_PORTRAIT", "") : null;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(string != null ? string : "", "PORTRAIT_ACTION_BUBBLE_CLICK")) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.s90 s90Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.s90(this, obj, j17);
            java.util.regex.Pattern pattern = pm0.v.f438335a;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(s90Var, j17);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0069, code lost:
    
        if ((r10.length() > 0) == true) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B1(boolean r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ea0.B1(boolean, boolean):void");
    }

    public final void C1() {
        if (this.f193920q.mo11219xd0598cf8() != 2) {
            return;
        }
        so2.j5 j5Var = ((mm2.f6) P0(mm2.f6.class)).f410582w;
        cm2.m0 m0Var = j5Var instanceof cm2.m0 ? (cm2.m0) j5Var : null;
        if (m0Var == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.m(this, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.z90(this, m0Var, null), 3, null);
    }

    public final void D1(cm2.k0 newCouponItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newCouponItem, "newCouponItem");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f193923t, "[updateCouponBubble] " + newCouponItem);
        qo0.b bVar = qo0.b.N2;
        android.os.Bundle bundle = new android.os.Bundle();
        r45.f52 J2 = zl2.r4.f555483a.J2(newCouponItem);
        bundle.putByteArray("PARAM_FINDER_LIVE_PROMOTE_DATA", J2 != null ? J2.mo14344x5f01b1f6() : null);
        this.f193920q.mo46557x60d69242(bVar, bundle);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void K0(int i17) {
        if (((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7()) {
            this.f446856d.setVisibility(8);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f193923t, "setVisible return for isTeenMode");
        } else {
            if (((mm2.c1) P0(mm2.c1.class)).a8() || i17 != 0) {
                super.K0(i17);
                return;
            }
            dk2.xf W0 = W0();
            if (W0 != null) {
                ((dk2.r4) W0).n(this.f193919p, i17);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        mm2.f6 f6Var;
        mm2.y5 y5Var;
        r45.y23 y23Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        int ordinal = status.ordinal();
        if (ordinal != 85) {
            if (ordinal != 90) {
                return;
            }
            so2.j5 j5Var = ((mm2.f6) S0().a(mm2.f6.class)).f410582w;
            if (j5Var instanceof cm2.k0) {
                D1((cm2.k0) j5Var);
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f193923t, "shopping panel hide → replay pending subsidy anim if needed");
        xt2.e3 y17 = y1();
        gk2.e eVar = y17.R;
        if (eVar == null || (y5Var = (f6Var = (mm2.f6) eVar.a(mm2.f6.class)).I) == null) {
            return;
        }
        java.lang.Long l17 = null;
        f6Var.I = null;
        so2.j5 j5Var2 = f6Var.f410582w;
        cm2.m0 m0Var = j5Var2 instanceof cm2.m0 ? (cm2.m0) j5Var2 : null;
        java.lang.String str = y17.f538239h;
        long j17 = y5Var.f411107a;
        if (m0Var == null || m0Var.f124901v.m75942xfb822ef2(0) != j17) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("subsidyAnim replay skipped: productId changed (");
            sb6.append(j17);
            sb6.append(" → ");
            if (m0Var != null && (y23Var = m0Var.f124901v) != null) {
                l17 = java.lang.Long.valueOf(y23Var.m75942xfb822ef2(0));
            }
            sb6.append(l17);
            sb6.append(')');
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
            return;
        }
        long m75942xfb822ef2 = y5Var.f411108b.m75942xfb822ef2(4);
        long c17 = c01.id.c() / 1000;
        if (m75942xfb822ef2 > c17) {
            synchronized (xt2.e3.f538233y0) {
                xt2.e3.f538232l1.put(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.m(y17.f538238g, null, null, new xt2.v2(y17, m0Var, y5Var, null), 3, null);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "subsidyAnim replay skipped: subsidy expired, productId=" + j17 + ", endTime=" + m75942xfb822ef2 + ", now=" + c17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void O0() {
        super.O0();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    public void U() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    public int e0() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15317x5870b165 m175927x1297bbe1 = y1().m175927x1297bbe1();
        boolean z17 = false;
        if (m175927x1297bbe1 != null && m175927x1297bbe1.isShown()) {
            z17 = true;
        }
        return z17 ? com.p314xaae8f345.mm.R.id.bzl : com.p314xaae8f345.mm.R.id.bys;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    public void f0(java.lang.Object data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.da0(data, this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    /* renamed from: getView */
    public android.view.View mo56902xfb86a31b() {
        return this.f193919p;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    public void l(java.lang.Object data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        y1().n(S0(), data);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    public void l0() {
        dk2.ef efVar = dk2.ef.f314905a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = dk2.ef.f314913e;
        if (k0Var != null) {
            k0Var.m57775x91b7d28f(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ea0.class);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0
    public int p0() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15317x5870b165 m175927x1297bbe1 = y1().m175927x1297bbe1();
        boolean z17 = false;
        if (m175927x1297bbe1 != null && m175927x1297bbe1.isShown()) {
            z17 = true;
        }
        return z17 ? com.p314xaae8f345.mm.R.id.ckg : com.p314xaae8f345.mm.R.id.hhj;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return true;
    }

    public final void w1(boolean z17) {
        so2.j5 j5Var = ((mm2.f6) S0().a(mm2.f6.class)).f410582w;
        java.lang.String str = this.f193923t;
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "stop syncCouponOrGoods " + this.f193924u);
            so2.j5 j5Var2 = this.f193924u;
            if (j5Var2 instanceof cm2.m0) {
                dk2.ef efVar = dk2.ef.f314905a;
                dk2.ef.f314925k.f(2);
            } else if (j5Var2 instanceof cm2.k0) {
                dk2.ef efVar2 = dk2.ef.f314905a;
                dk2.ef.f314925k.f(1);
            }
            this.f193924u = null;
            return;
        }
        if ((j5Var instanceof cm2.k0) && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(j5Var, this.f193924u)) {
            if (this.f193924u instanceof cm2.m0) {
                dk2.ef efVar3 = dk2.ef.f314905a;
                dk2.ef.f314925k.f(2);
            }
            this.f193924u = j5Var;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "start SyncCoupon " + this.f193924u);
            r45.my2 my2Var = new r45.my2();
            my2Var.set(0, ((cm2.k0) j5Var).f124895x);
            dk2.ef efVar4 = dk2.ef.f314905a;
            dk2.ef.f314925k.e(1, my2Var, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.k90(this, r45.ny2.class), false);
            return;
        }
        if (!(j5Var instanceof cm2.m0) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(j5Var, this.f193924u)) {
            return;
        }
        if (this.f193924u instanceof cm2.k0) {
            dk2.ef efVar5 = dk2.ef.f314905a;
            dk2.ef.f314925k.f(1);
        }
        this.f193924u = j5Var;
        r45.xy2 xy2Var = new r45.xy2();
        xy2Var.set(0, java.lang.Long.valueOf(((cm2.m0) j5Var).f124902w));
        xy2Var.set(1, ((mm2.c1) P0(mm2.c1.class)).P3);
        xy2Var.set(2, 1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "start SyncGoods " + this.f193924u);
        dk2.ef efVar6 = dk2.ef.f314905a;
        dk2.ef.f314925k.e(2, xy2Var, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l90(xy2Var, this, r45.yy2.class), false);
    }

    public final void x1(yz5.a aVar) {
        java.lang.String str;
        so2.j5 j5Var = ((mm2.f6) P0(mm2.f6.class)).f410582w;
        cm2.m0 m0Var = j5Var instanceof cm2.m0 ? (cm2.m0) j5Var : null;
        if (m0Var == null) {
            return;
        }
        qo0.c cVar = this.f193920q;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(cVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.FinderBaseLivePluginLayout");
        mm2.e1 e1Var = (mm2.e1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) cVar).m57654xd7793f26().a(mm2.e1.class);
        long j17 = e1Var.f410516m;
        long m75942xfb822ef2 = e1Var.f410521r.m75942xfb822ef2(0);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        java.lang.String e17 = xy2.c.e(context);
        byte[] bArr = ((mm2.e1) S0().a(mm2.e1.class)).f410518o;
        java.lang.String str2 = m0Var.f124920f;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(m0Var.f124901v.mo14344x5f01b1f6());
        java.lang.String f17 = zl2.r4.f555483a.f1(S0(), null);
        java.lang.String str3 = ((mm2.e1) P0(mm2.e1.class)).f410526w;
        gk2.e eVar = gk2.e.f354004n;
        if (eVar == null || (str = ((mm2.c1) eVar.a(mm2.c1.class)).f410324d3) == null) {
            str = "";
        }
        pq5.g l17 = new ke2.v(j17, m75942xfb822ef2, 5, e17, bArr, str2, gVar, f17, str3, str).l();
        l17.K(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.m90(aVar, m0Var, this));
        android.content.Context context2 = this.f446856d.getContext();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = context2 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context2 : null;
        if (abstractActivityC21394xb3d2c0cf != null) {
            l17.f(abstractActivityC21394xb3d2c0cf);
        }
    }

    public final xt2.e3 y1() {
        return (xt2.e3) ((jz5.n) this.f193925v).mo141623x754a37bb();
    }

    public final org.json.JSONArray z1(cm2.m0 item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.LinkedList m75941xfb821914 = item.f124901v.m75941xfb821914(54);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getShow_box_item_lists(...)");
        java.util.Iterator it = m75941xfb821914.iterator();
        while (it.hasNext()) {
            java.util.LinkedList<r45.p56> m75941xfb8219142 = ((r45.q56) it.next()).m75941xfb821914(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getShow_box_items(...)");
            for (r45.p56 p56Var : m75941xfb8219142) {
                try {
                    jSONArray.put(new org.json.JSONObject(p56Var.m75945x2fec8307(3)));
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(this.f193923t, e17, "parse report data " + p56Var.m75945x2fec8307(3) + " failed", new java.lang.Object[0]);
                }
            }
        }
        return jSONArray;
    }
}
