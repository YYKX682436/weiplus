package zi2;

/* loaded from: classes3.dex */
public final class w extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l implements lj2.x0, lj2.v0 {

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f554686p;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.ViewGroup f554687q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f554688r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f554689s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f554690t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f554691u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f554692v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f554693w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.Boolean f554694x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(android.view.ViewGroup root, qo0.c statusMonitor, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14345xa5234440 shadeView, android.view.ViewGroup viewGroup) {
        super(root, statusMonitor, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shadeView, "shadeView");
        this.f554686p = statusMonitor;
        this.f554687q = viewGroup;
        this.f554690t = jz5.h.b(new zi2.v(this));
        this.f554691u = jz5.h.b(new zi2.f(this));
        this.f554692v = jz5.h.b(new zi2.b(this));
        this.f554693w = jz5.h.b(new zi2.c(root, this));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicCoverPlugin", "FinderLiveMicCoverPlugin init");
        android.content.Context context = root.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        android.content.Intent intent = ((android.app.Activity) context).getIntent();
        if (intent != null) {
            long longExtra = intent.getLongExtra("CURRENT_FEED_ID", 0L);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicCoverPlugin", "feedId: " + longExtra);
            if (longExtra == 0 || !((mm2.e1) P0(mm2.e1.class)).g7()) {
                return;
            }
            me2.a aVar = !me2.c.f407454a.a(longExtra) ? null : (me2.a) me2.c.f407455b.remove(java.lang.Long.valueOf(longExtra));
            if (aVar != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicCoverPlugin", "applyFeedData: " + aVar.f407452d.size());
                ((mm2.y2) P0(mm2.y2.class)).f411105y = aVar.f407451c;
                ((mm2.y2) P0(mm2.y2.class)).f411104x = aVar.f407449a;
                ((mm2.y2) P0(mm2.y2.class)).f411106z = aVar.f407450b;
                ((mm2.o4) P0(mm2.o4.class)).f410868z.clear();
                java.util.Collection values = aVar.f407452d.values();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
                java.util.Iterator it = ((java.util.ArrayList) kz5.n0.V(values)).iterator();
                while (it.hasNext()) {
                    km2.q qVar = (km2.q) it.next();
                    if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((mm2.c1) P0(mm2.c1.class)).f410385o, qVar.f390705c)) {
                        if (qVar.f390710h) {
                            java.util.List list = ((mm2.o4) P0(mm2.o4.class)).f410857s;
                            if (list != null) {
                                list.add(qVar);
                            }
                        } else {
                            java.util.List list2 = ((mm2.o4) P0(mm2.o4.class)).f410860v;
                            if (list2 != null) {
                                list2.add(qVar);
                            }
                        }
                        ((mm2.o4) P0(mm2.o4.class)).O7(qVar);
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0.m57628x9aa6f4f1(R0(), aVar.f407450b, aVar.f407449a, aVar.f407451c, true, null, 16, null);
                me2.c cVar = me2.c.f407454a;
                java.util.Map channelMap = me2.c.f407455b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(channelMap, "channelMap");
                kz5.h0.A(channelMap.keySet(), new me2.b(java.lang.Long.valueOf(longExtra)));
                java.util.Map ktvChannelMap = me2.c.f407456c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ktvChannelMap, "ktvChannelMap");
                kz5.h0.A(ktvChannelMap.keySet(), new me2.b(java.lang.Long.valueOf(longExtra)));
                java.util.Map ktvSurfaceTextureMap = me2.c.f407457d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ktvSurfaceTextureMap, "ktvSurfaceTextureMap");
                kz5.h0.A(ktvSurfaceTextureMap.keySet(), new me2.b(java.lang.Long.valueOf(longExtra)));
                x1().w(null, ((mm2.y2) P0(mm2.y2.class)).f411098r);
            }
        }
    }

    public final void A1(boolean z17) {
        java.util.ArrayList t17 = x1().t();
        if (t17 != null) {
            java.util.Iterator it = t17.iterator();
            while (it.hasNext()) {
                ((lj2.u0) it.next()).k(z17);
            }
        }
    }

    public final void B1() {
        java.util.Iterator it = ((fi2.a) x1()).t().iterator();
        while (it.hasNext()) {
            ((lj2.u0) it.next()).e();
        }
    }

    @Override // lj2.v0
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l C(java.lang.Class modelClass) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(modelClass, "modelClass");
        return X0(modelClass);
    }

    @Override // qo0.a
    public void C0(java.util.LinkedHashMap micUserMap) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(micUserMap, "micUserMap");
        df2.t6 t6Var = (df2.t6) U0(df2.t6.class);
        if (t6Var != null) {
            t6Var.g7(micUserMap);
        }
        x1().w(micUserMap, ((mm2.y2) P0(mm2.y2.class)).f411098r);
        if (micUserMap.get(((mm2.c1) P0(mm2.c1.class)).m8()) == null) {
            ((mm2.o4) P0(mm2.o4.class)).f410846h = false;
        }
    }

    public final void C1() {
        java.util.ArrayList t17 = x1().t();
        if (t17 != null) {
            java.util.Iterator it = t17.iterator();
            while (it.hasNext()) {
                wj2.w wVar = (wj2.w) ((lj2.u0) it.next());
                wVar.Y();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(wVar.m145853xb5886c64(), "onNotifyLikeEnableUpdate");
            }
        }
    }

    public final void D1() {
        java.lang.String str;
        km2.q m174007xdd2aa071;
        fi2.a aVar = (fi2.a) x1();
        for (lj2.u0 u0Var : aVar.t()) {
            zi2.w wVar = aVar.f344334a;
            mm2.y2 y2Var = (mm2.y2) wVar.P0(mm2.y2.class);
            wj2.w wVar2 = (wj2.w) u0Var;
            km2.q m174007xdd2aa0712 = wVar2.m174007xdd2aa071();
            if (m174007xdd2aa0712 == null || (str = m174007xdd2aa0712.f390703a) == null) {
                str = "";
            }
            xh2.g Q6 = y2Var.Q6(str, zl2.r4.f555483a.w1());
            if (Q6 == null && ((om2.l) wVar.P0(om2.l.class)).R6() && (m174007xdd2aa071 = wVar2.m174007xdd2aa071()) != null) {
                Q6 = new xh2.g(m174007xdd2aa071.f390716n, m174007xdd2aa071.f390724v, false);
            }
            if (Q6 != null) {
                wVar2.f(Q6.f536079a, Q6.f536080b, Q6.f536081c);
            }
        }
    }

    public final void E1(java.lang.String source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicCoverPlugin", "notifyUpdateMicSeatInfo: ".concat(source));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.e(this, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new zi2.g(this, null), 2, null);
    }

    public final void F1(boolean z17) {
        om2.i iVar;
        if (((mm2.e1) P0(mm2.e1.class)).b7() && (iVar = ((om2.g) P0(om2.g.class)).f427840n) != null && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(iVar.d(), ((mm2.c1) P0(mm2.c1.class)).m8())) {
            r45.ia4 ia4Var = iVar.f427856c;
            boolean z18 = false;
            if (ia4Var != null && ia4Var.f458406h == z17) {
                z18 = true;
            }
            if (z18) {
                return;
            }
            synchronized (ia4Var) {
                r45.ia4 ia4Var2 = iVar.f427856c;
                if (ia4Var2 != null) {
                    ia4Var2.f458406h = z17;
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return false;
    }

    public final void G1(java.lang.String userId, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userId, "userId");
        x1().i(userId, z17);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object H1(java.util.HashMap r23, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r24) {
        /*
            Method dump skipped, instructions count: 493
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zi2.w.H1(java.util.HashMap, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void I1(int i17, int i18) {
        android.view.View k17 = x1().k();
        jz5.f0 f0Var = null;
        android.view.ViewGroup.LayoutParams layoutParams = k17 != null ? k17.getLayoutParams() : null;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.setMargins(0, 0, 0, 0);
            marginLayoutParams.width = i17;
            marginLayoutParams.height = i18;
            android.view.ViewGroup p17 = x1().p();
            com.p314xaae8f345.mm.p2776x373aa5.p2785x674500b.C22840x82866af5 c22840x82866af5 = p17 instanceof com.p314xaae8f345.mm.p2776x373aa5.p2785x674500b.C22840x82866af5 ? (com.p314xaae8f345.mm.p2776x373aa5.p2785x674500b.C22840x82866af5) p17 : null;
            if (c22840x82866af5 != null) {
                if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.C).mo141623x754a37bb()).r()).intValue() != 1) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicCoverPlugin", "setCoverContentRootSize:FINDER_LIVE_ENABLE_RATIO_LAYOUT_ENHANCE is false");
                } else if (i18 > 0) {
                    c22840x82866af5.m82885x6bac6bd1(i18);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiAreaLayout", "unsetExactlyHeight");
                    c22840x82866af5.f295237n = -1;
                }
                f0Var = jz5.f0.f384359a;
            }
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveMicCoverPlugin", "layoutParams is null");
        }
    }

    @Override // lj2.x0
    public void J() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e = V0().f390664f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c14197x319b1b9e, "<this>");
        if2.z.f372686a.i(c14197x319b1b9e, new mf2.i(c14197x319b1b9e));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J1(java.util.LinkedList r23, boolean r24, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r25) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zi2.w.J1(java.util.LinkedList, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // lj2.v0
    public void K(int i17) {
        if (i17 == 10001) {
            i95.m c17 = i95.n0.c(ml2.r0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ml2.r0 r0Var = (ml2.r0) c17;
            ml2.b4 b4Var = ml2.b4.f408791p2;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("type", 2);
            ml2.r0.hj(r0Var, b4Var, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
            return;
        }
        if (i17 != 10002) {
            return;
        }
        i95.m c18 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
        ml2.r0 r0Var2 = (ml2.r0) c18;
        ml2.b4 b4Var2 = ml2.b4.f408783n2;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("type", 2);
        jSONObject2.put("pos", 3);
        ml2.r0.hj(r0Var2, b4Var2, jSONObject2.toString(), 0L, null, null, null, null, null, 252, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void K0(int i17) {
        super.K0(i17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setVisible: ");
        sb6.append(i17);
        sb6.append(", rootVisibility: ");
        android.view.ViewGroup viewGroup = this.f446856d;
        sb6.append(viewGroup.getVisibility());
        sb6.append(" alpha: ");
        sb6.append(viewGroup.getAlpha());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicCoverPlugin", sb6.toString());
    }

    public final void K1(java.lang.String str) {
        x1().f(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // lj2.x0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object M(java.util.HashMap r12, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r13) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zi2.w.M(java.util.HashMap, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c0, code lost:
    
        if ((r1 != -1) == true) goto L59;
     */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void M0(qo0.b r9, android.os.Bundle r10) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zi2.w.M0(qo0.b, android.os.Bundle):void");
    }

    @Override // lj2.x0
    public java.lang.Object O(xh2.a aVar, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicCoverPlugin", "opChangeTagName newTagName: " + str + " micCoverData: " + aVar);
        int i17 = aVar.f536054b.f536086e;
        java.util.HashMap S6 = ((mm2.y2) P0(mm2.y2.class)).S6();
        S6.put(new java.lang.Integer(i17), str);
        return H1(S6, interfaceC29045xdcb5ca57);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void O0() {
        super.O0();
        K0(8);
        x1();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicCoverPlugin", "unMount");
    }

    @Override // lj2.x0
    public void S(int i17) {
        java.lang.Object obj;
        java.util.List list = ((mm2.o4) P0(mm2.o4.class)).f410860v;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "<get-audienceLinkMicUserList>(...)");
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(((km2.q) obj).f390703a, ((mm2.c1) P0(mm2.c1.class)).m8())) {
                    break;
                }
            }
        }
        if ((obj != null) || zl2.r4.f555483a.w1() || ((mm2.c1) P0(mm2.c1.class)).T || ((mm2.n0) P0(mm2.n0.class)).f410806r) {
            return;
        }
        ml2.n4 n4Var = ml2.n4.f409296z;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicReportUtil", "reportLink21084 action: 23");
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0.ik((ml2.r0) c17, n4Var, null, 0, 6, null);
        qo0.c cVar = this.f554686p;
        qo0.b bVar = qo0.b.V3;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("PARAM_FINDER_LIVE_LINK_MIC_POSITION", i17);
        bundle.putInt("PARAM_FINDER_LIVE_LINK_MIC_SOURCE", 2);
        cVar.mo46557x60d69242(bVar, bundle);
    }

    @Override // lj2.v0
    public android.view.ViewGroup T() {
        return this.f554687q;
    }

    @Override // lj2.x0
    public boolean V() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x005d  */
    @Override // lj2.x0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void X(km2.q r11) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zi2.w.X(km2.q):void");
    }

    @Override // lj2.x0
    public p3325xe03a0797.p3326xc267989b.y0 a() {
        return R0().m57691xa0fa63f9();
    }

    @Override // lj2.v0
    public lj2.t0 a0() {
        return w1();
    }

    @Override // lj2.x0
    public void c(xh2.a micCoverData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(micCoverData, "micCoverData");
        x1().c(micCoverData);
    }

    @Override // lj2.x0
    public void c0() {
        boolean x17 = zl2.r4.f555483a.x1();
        qo0.c cVar = this.f554686p;
        if (x17) {
            qo0.b bVar = qo0.b.f446899i4;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("PARAM_FINDER_LIVE_AUDIO_MODE", true);
            cVar.mo46557x60d69242(bVar, bundle);
        } else {
            qo0.c.a(cVar, qo0.b.f446930p0, null, 2, null);
        }
        F1(false);
    }

    @Override // lj2.x0
    public void e(xh2.a micCoverData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(micCoverData, "micCoverData");
        if (w1().w()) {
            x1().e(micCoverData);
        }
    }

    @Override // lj2.v0
    public lj2.w0 f() {
        return lj2.w0.f400491d;
    }

    @Override // lj2.v0
    public void i0(int i17) {
        if (i17 == 10001) {
            i95.m c17 = i95.n0.c(ml2.r0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ml2.r0 r0Var = (ml2.r0) c17;
            ml2.b4 b4Var = ml2.b4.f408791p2;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("type", 1);
            ml2.r0.hj(r0Var, b4Var, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
            return;
        }
        if (i17 != 10002) {
            return;
        }
        i95.m c18 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
        ml2.r0 r0Var2 = (ml2.r0) c18;
        ml2.b4 b4Var2 = ml2.b4.f408783n2;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("type", 1);
        jSONObject2.put("pos", 3);
        ml2.r0.hj(r0Var2, b4Var2, jSONObject2.toString(), 0L, null, null, null, null, null, 252, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return true;
    }

    @Override // lj2.v0
    public boolean k0() {
        ae2.in inVar = ae2.in.f85221a;
        return ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.S).mo141623x754a37bb()).r()).intValue() == 1 && ((mm2.e1) P0(mm2.e1.class)).d7();
    }

    @Override // lj2.x0
    public zh2.b m() {
        return (zh2.b) U0(ch2.o2.class);
    }

    @Override // lj2.x0
    public void n0() {
        boolean x17 = zl2.r4.f555483a.x1();
        qo0.c cVar = this.f554686p;
        if (x17) {
            qo0.b bVar = qo0.b.f446899i4;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("PARAM_FINDER_LIVE_AUDIO_MODE", false);
            cVar.mo46557x60d69242(bVar, bundle);
        } else {
            qo0.c.a(cVar, qo0.b.f446964x0, null, 2, null);
        }
        F1(true);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l
    public void n1() {
        x1().h();
        u1();
        mm2.y2 y2Var = (mm2.y2) P0(mm2.y2.class);
        y2Var.f411090g.mo7806x9d92d11c(this, new zi2.h(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.m(this, null, null, new zi2.j(this, null), 3, null);
    }

    @Override // lj2.v0
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703 o(java.lang.Class ctrl) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ctrl, "ctrl");
        return U0(ctrl);
    }

    @Override // lj2.v0
    public qo0.c q() {
        return this.f194858g;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return false;
    }

    public final void t1() {
        java.lang.Object obj;
        java.lang.Object obj2;
        if (zl2.r4.f555483a.x1() && ((mm2.o4) P0(mm2.o4.class)).a7().f390725w != 1) {
            java.util.List list = ((mm2.o4) P0(mm2.o4.class)).f410860v;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "<get-audienceLinkMicUserList>(...)");
            synchronized (list) {
                java.util.Iterator it = list.iterator();
                while (true) {
                    obj = null;
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    } else {
                        obj2 = it.next();
                        if (((km2.q) obj2).f390725w == 1) {
                            break;
                        }
                    }
                }
            }
            km2.q qVar = (km2.q) obj2;
            if (qVar != null) {
                int i17 = ((mm2.o4) P0(mm2.o4.class)).a7().f390725w;
                java.util.ArrayList arrayList = zn0.x.f555947a.f555948a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(arrayList, "getRemoteUserConfigList(...)");
                java.util.Iterator it6 = arrayList.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it6.next();
                    java.lang.String str = ((zn0.v) next).f555939d;
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, str)) {
                        obj = next;
                        break;
                    }
                }
                zn0.v vVar = (zn0.v) obj;
                if (vVar != null) {
                    vVar.f555946n = i17;
                }
                qVar.f390725w = i17;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicCoverPlugin", "checkReplaceAnchorToFirstPos");
            ((mm2.o4) P0(mm2.o4.class)).a7().f390725w = 1;
            zn0.y yVar = zn0.x.f555947a;
            int size = yVar.f555948a.size();
            yVar.f555949b = 1;
            yVar.f555950c = size;
            E1("checkOnVoiceRoomUpdate");
        }
    }

    public void u1() {
        tn0.w0 Z0 = Z0();
        in0.q qVar = Z0 instanceof in0.q ? (in0.q) Z0 : null;
        if (qVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0.m57628x9aa6f4f1(R0(), qVar.T1, qVar.J(), qVar.W0(), true, null, 16, null);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0.m57628x9aa6f4f1(R0(), R0().m57668xd2eca5dc(), R0().m57662xce9bcbce(), R0().m57651x2474a935(), true, null, 16, null);
        }
    }

    public final android.view.ViewGroup v1() {
        lj2.u0 d17 = ((fi2.a) x1()).d(((mm2.e1) P0(mm2.e1.class)).f410520q.f461834n);
        if (d17 != null) {
            return d17.mo124425xd504a5f8();
        }
        return null;
    }

    public final zi2.y w1() {
        return (zi2.y) this.f554692v.mo141623x754a37bb();
    }

    public final fi2.m x1() {
        fi2.m mVar = ((mm2.e1) P0(mm2.e1.class)).g7() ? (fi2.j1) ((jz5.n) this.f554690t).mo141623x754a37bb() : (fi2.x0) ((jz5.n) this.f554691u).mo141623x754a37bb();
        mVar.n(this.f554688r, this.f554689s);
        return mVar;
    }

    public final sj2.m y1(java.lang.String sdkUserId) {
        lj2.u0 u0Var;
        mh2.n0 f17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sdkUserId, "sdkUserId");
        if (((mm2.e1) P0(mm2.e1.class)).b7() && (f17 = ((fi2.j1) ((jz5.n) this.f554690t).mo141623x754a37bb()).B().f()) != null && f17.isAttachedToWindow()) {
            int childCount = f17.getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                android.view.KeyEvent.Callback childAt = f17.getChildAt(i17);
                if (childAt instanceof wj2.w) {
                    km2.q m174007xdd2aa071 = ((wj2.w) childAt).m174007xdd2aa071();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m174007xdd2aa071 != null ? m174007xdd2aa071.f390703a : null, sdkUserId)) {
                        u0Var = (lj2.u0) childAt;
                        break;
                    }
                }
            }
        }
        u0Var = null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicCoverPlugin", "getMicGiftCallback ktvcallback sdkUserId: " + sdkUserId + " callback: " + u0Var);
        if (u0Var != null) {
            return u0Var;
        }
        lj2.u0 d17 = ((fi2.a) x1()).d(sdkUserId);
        if (d17 != null) {
            return d17.mo124435xb95f5746();
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void z0() {
        super.z0();
        K0(0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicCoverPlugin", "mount: " + w0());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.m(this, null, null, new zi2.e(this, null), 3, null);
    }

    public final void z1(boolean z17, boolean z18) {
        java.util.ArrayList t17 = x1().t();
        if (t17 != null) {
            java.util.Iterator it = t17.iterator();
            while (it.hasNext()) {
                ((lj2.u0) it.next()).b(z17, z18);
            }
        }
    }
}
