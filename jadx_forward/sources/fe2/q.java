package fe2;

/* loaded from: classes3.dex */
public final class q extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l {
    public final int A;
    public int B;
    public boolean C;
    public final p012xc85e97e9.p093xedfae76a.k0 D;
    public final p012xc85e97e9.p093xedfae76a.k0 E;
    public final fe2.n F;
    public final fe2.p G;

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f343058p;

    /* renamed from: q, reason: collision with root package name */
    public final qo0.c f343059q;

    /* renamed from: r, reason: collision with root package name */
    public final android.view.ViewGroup f343060r;

    /* renamed from: s, reason: collision with root package name */
    public final com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff f343061s;

    /* renamed from: t, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.box.p1477xa324943e.C14178x7908fa05 f343062t;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg f343063u;

    /* renamed from: v, reason: collision with root package name */
    public final he2.h f343064v;

    /* renamed from: w, reason: collision with root package name */
    public he2.f f343065w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f343066x;

    /* renamed from: y, reason: collision with root package name */
    public int f343067y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f343068z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context, android.view.ViewGroup root, qo0.c statusMonitor, android.view.ViewGroup viewGroup) {
        super(root, statusMonitor, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.f343058p = context;
        this.f343059q = statusMonitor;
        this.f343060r = viewGroup;
        this.f343061s = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff) root.findViewById(com.p314xaae8f345.mm.R.id.nv8);
        this.f343062t = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.box.p1477xa324943e.C14178x7908fa05) root.findViewById(com.p314xaae8f345.mm.R.id.c8a);
        this.f343064v = new he2.h(context, S0(), statusMonitor, this);
        this.f343066x = true;
        this.f343067y = i65.a.b(context, 240);
        this.A = (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561200c4);
        this.B = 2;
        this.D = new fe2.j(this);
        this.E = new fe2.l(this);
        K0(8);
        this.F = new fe2.n();
        this.G = new fe2.p(this);
    }

    public final void A1() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44 c14227x4262fb44;
        if (this.C) {
            return;
        }
        this.C = true;
        df2.a9 a9Var = (df2.a9) U0(df2.a9.class);
        if (a9Var == null || (c14227x4262fb44 = a9Var.A) == null) {
            return;
        }
        c14227x4262fb44.mo7806x9d92d11c(this, new fe2.k(this));
    }

    public final void B1() {
        he2.h hVar = this.f343064v;
        java.util.Iterator it = hVar.f362431e.iterator();
        boolean z17 = false;
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            } else if (((ee2.a) it.next()).f333116g instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.vk0) {
                break;
            } else {
                i17++;
            }
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        int intValue = valueOf.intValue();
        if (intValue >= 0 && intValue < hVar.f362431e.size()) {
            z17 = true;
        }
        if (!z17) {
            valueOf = null;
        }
        if (valueOf != null) {
            this.B = valueOf.intValue();
        }
    }

    public final void C1() {
        oa.i k17 = this.f343061s.k(this.B);
        java.lang.Object obj = k17 != null ? k17.f425311a : null;
        he2.e eVar = obj instanceof he2.e ? (he2.e) obj : null;
        if (eVar != null) {
            android.widget.ImageView imageView = eVar.f362423d;
            if (imageView != null && imageView.getVisibility() == 0) {
                return;
            }
            eVar.c(true);
            r45.t12 t12Var = new r45.t12();
            t12Var.set(3, 100002);
            t12Var.set(2, this.f343058p.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mox));
            t12Var.set(15, java.lang.Boolean.TRUE);
            t12Var.set(16, 1);
            ((mm2.x4) P0(mm2.x4.class)).f411067o.add(new dk2.mf(t12Var));
        }
    }

    public final void D1() {
        java.lang.String str;
        java.lang.String str2;
        df2.nw nwVar = df2.xw.f313341w;
        df2.xw xwVar = (df2.xw) U0(df2.xw.class);
        if (xwVar != null) {
            str = xwVar.f313343n;
            if (str == null) {
                str = "";
            }
        } else {
            str = null;
        }
        nwVar.a(6, kz5.b1.e(new jz5.l("sessionid", java.lang.String.valueOf(str))));
        int i17 = this.B;
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff = this.f343061s;
        oa.i k17 = c2718xca2902ff.k(i17);
        if (k17 != null && !k17.a()) {
            k17.b();
        }
        oa.i k18 = c2718xca2902ff.k(this.B);
        java.lang.Object obj = k18 != null ? k18.f425311a : null;
        he2.e eVar = obj instanceof he2.e ? (he2.e) obj : null;
        if (eVar != null) {
            eVar.c(false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.box.p1477xa324943e.C14178x7908fa05 c14178x7908fa05 = this.f343062t;
        int m8300xfda78ef6 = c14178x7908fa05.m8300xfda78ef6();
        int i18 = this.B;
        if (m8300xfda78ef6 != i18) {
            c14178x7908fa05.m8316x940d026a(i18);
        }
        df2.xw xwVar2 = (df2.xw) U0(df2.xw.class);
        if (xwVar2 != null && (str2 = xwVar2.f313343n) != null) {
            qo2.e d76 = xwVar2.d7();
            d76.getClass();
            java.lang.String concat = "[updateMsgRead] sessionId = ".concat(str2);
            java.lang.String str3 = d76.f447113b;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, concat);
            try {
                so0.c cVar = new so0.c();
                cVar.f491744h = java.lang.Boolean.TRUE;
                com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae c26924x4cd4bae = d76.f447115d;
                if (c26924x4cd4bae == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("msgTable");
                    throw null;
                }
                com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da c26981x40bb0da = so0.a.f491724j;
                c26924x4cd4bae.m107168xc0204d68((com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae) cVar, (com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae>) c26981x40bb0da, so0.a.f491718d.eq(str2).and(c26981x40bb0da.eq(false)));
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "[updateMsgRead] e:" + e17.getMessage());
            }
        }
        mm2.e0 e0Var = (mm2.e0) P0(mm2.e0.class);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("LiveBoxSlice enterShopMsgBox: ");
        r45.qm1 qm1Var = (r45.qm1) e0Var.f410503m.mo3195x754a37bb();
        sb6.append(qm1Var != null ? qm1Var.m75945x2fec8307(1) : null);
        java.lang.String str4 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str4, "str");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveBoxSlice", "mainFlowLog ".concat(str4));
        r45.qm1 qm1Var2 = (r45.qm1) e0Var.f410503m.mo3195x754a37bb();
        if (!(qm1Var2 != null && qm1Var2.m75939xb282bd08(0) == 2)) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("LiveBoxSlice stopPollingMsg: ");
            r45.qm1 qm1Var3 = (r45.qm1) e0Var.f410503m.mo3195x754a37bb();
            sb7.append(qm1Var3 != null ? qm1Var3.m75945x2fec8307(1) : null);
            java.lang.String str5 = sb7.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str5, "str");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveBoxSlice", "mainFlowLog ".concat(str5));
            lm2.h0 h0Var = e0Var.f410509s;
            if (h0Var != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.BoxDataStore", "stopPollingMsg");
                km2.m0 m0Var = h0Var.f400933g;
                if (m0Var != null) {
                    p3325xe03a0797.p3326xc267989b.r2 r2Var = m0Var.f390679d;
                    if (r2Var != null) {
                        p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
                    }
                    m0Var.f390679d = null;
                }
            }
            r45.qm1 qm1Var4 = new r45.qm1();
            qm1Var4.set(0, 2);
            qm1Var4.set(1, "shopbox-" + ((mm2.e1) e0Var.m147920xbba4bfc0(mm2.e1.class)).f410521r.m75942xfb822ef2(0));
            e0Var.f410503m.mo523x53d8522f(qm1Var4);
            e0Var.f410504n = 0L;
        }
        qo0.b bVar = qo0.b.f446908k5;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("isShow", true);
        this.f343059q.mo46557x60d69242(bVar, bundle);
    }

    public final void E1(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveViewPagerComm", "switchTabLayoutAndViewPager " + i17);
        oa.i k17 = this.f343061s.k(i17);
        if (k17 != null && !k17.a()) {
            k17.b();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.box.p1477xa324943e.C14178x7908fa05 c14178x7908fa05 = this.f343062t;
        if (c14178x7908fa05.m8300xfda78ef6() != i17) {
            c14178x7908fa05.m8316x940d026a(i17);
        }
        if (i17 != 1) {
            mm2.e0 e0Var = (mm2.e0) P0(mm2.e0.class);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveBoxSlice", "redDotFlowLog ".concat("resumeRedDotPolling"));
            lm2.h0 h0Var = e0Var.f410509s;
            if (h0Var == null) {
                return;
            }
            h0Var.f400932f = true;
            return;
        }
        mm2.e0 e0Var2 = (mm2.e0) P0(mm2.e0.class);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveBoxSlice", "redDotFlowLog ".concat("pauseRedDotPolling"));
        lm2.h0 h0Var2 = e0Var2.f410509s;
        if (h0Var2 != null) {
            h0Var2.f400932f = false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveViewPagerComm", "redDotFlowLog ".concat("dismiss reddot"));
        lm2.h0 h0Var3 = ((mm2.e0) P0(mm2.e0.class)).f410509s;
        p012xc85e97e9.p093xedfae76a.j0 j0Var = h0Var3 != null ? h0Var3.f400931e : null;
        if (j0Var != null) {
            mm2.y yVar = mm2.y.f411080d;
            java.lang.Object mo3195x754a37bb = j0Var.mo3195x754a37bb();
            if (mo3195x754a37bb != null) {
                yVar.mo146xb9724478(mo3195x754a37bb);
                j0Var.mo523x53d8522f(mo3195x754a37bb);
            }
        }
    }

    public final void F1() {
        E1(0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tb tbVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tb) X0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tb.class);
        if (tbVar == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveViewPagerComm", "mainFlowLog ".concat("status FINDER_LIVE_SWITCH_BOX false"));
        qo0.b bVar = qo0.b.f446908k5;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("isShow", false);
        this.f343059q.mo46557x60d69242(bVar, bundle);
        tbVar.w1();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return true;
    }

    public final void G1(java.lang.String src) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(src, "src");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveViewPagerComm", src.concat(" switchToPublicForDanmaku"));
        r45.qm1 qm1Var = (r45.qm1) ((mm2.e0) P0(mm2.e0.class)).f410503m.mo3195x754a37bb();
        boolean z17 = false;
        if (qm1Var != null) {
            int m75939xb282bd08 = qm1Var.m75939xb282bd08(0);
            int i17 = qs5.v.f448005a;
            if (m75939xb282bd08 == 1) {
                z17 = true;
            }
        }
        if (z17) {
            android.view.ViewGroup viewGroup = this.f446856d;
            db5.t7.m(viewGroup.getContext(), viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d7z));
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("type", 6);
            i95.m c17 = i95.n0.c(ml2.r0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ml2.r0.hj((ml2.r0) c17, ml2.b4.V1, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
        }
        w1("switchToPublicForDanmaku");
    }

    public final void H1(android.os.Bundle bundle) {
        this.f343064v.a(bundle);
        u1();
        he2.f fVar = this.f343065w;
        if (fVar != null) {
            fVar.a();
        }
        he2.f fVar2 = this.f343065w;
        if (fVar2 != null) {
            fVar2.mo8343xced61ae5();
        }
        I1();
        B1();
    }

    public final void I1() {
        boolean z17;
        java.lang.CharSequence charSequence;
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff = this.f343061s;
        int m20352xe06bcb0d = c2718xca2902ff.m20352xe06bcb0d();
        c2718xca2902ff.n();
        java.util.Iterator it = this.f343064v.f362431e.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                x1(null);
                return;
            }
            java.lang.Object next = it.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            ee2.a aVar = (ee2.a) next;
            oa.i l17 = c2718xca2902ff.l();
            boolean z18 = true;
            java.lang.Integer num = 1;
            java.lang.Integer num2 = num.intValue() == 0 ? num : null;
            he2.e eVar = new he2.e(l17, num2 != null ? num2.intValue() : 2, new fe2.o(aVar, this));
            java.lang.String title = aVar.f333114e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
            android.widget.TextView textView = eVar.f362422c;
            if (textView == null) {
                z17 = false;
            } else if ((eVar.f362421b == 0 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(title, textView.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dg7))) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(title, textView.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573072dg4)) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(title, textView.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mol))) {
                z17 = false;
                textView.setText(title);
            } else {
                android.content.Context context = textView.getContext();
                java.lang.Object[] objArr = new java.lang.Object[1];
                int i19 = j65.f.f379476g <= 1.0f ? 6 : 2;
                android.content.Context context2 = textView.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                int b17 = i65.a.b(context2, (i19 * 15) + 1);
                android.content.Context context3 = textView.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
                int b18 = i65.a.b(context3, ((i19 + 1) * 15) + 1);
                android.text.StaticLayout staticLayout = new android.text.StaticLayout(title, 0, title.length(), textView.getPaint(), b17, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
                if (new android.text.StaticLayout(title, 0, title.length(), textView.getPaint(), b18, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount() <= 1) {
                    z17 = false;
                    charSequence = title;
                } else {
                    z17 = false;
                    int lineEnd = staticLayout.getLineEnd(0);
                    le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                    android.content.Context context4 = textView.getContext();
                    java.lang.String substring = title.toString().substring(0, lineEnd);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
                    java.lang.String concat = substring.concat("...");
                    ((ke0.e) xVar).getClass();
                    charSequence = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context4, concat);
                }
                objArr[z17 ? 1 : 0] = charSequence;
                textView.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.dg_, objArr));
            }
            eVar.f362421b = i17;
            if (i17 != m20352xe06bcb0d) {
                z18 = z17;
            }
            c2718xca2902ff.d(eVar.f362420a, z18);
            i17 = i18;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void K0(int i17) {
        if (!((mm2.j2) P0(mm2.j2.class)).O6(x0())) {
            super.K0(i17);
            return;
        }
        super.K0(8);
        this.f194860i = i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveViewPagerComm", "danmaku intercept visible:" + i17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        int ordinal = status.ordinal();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.o0 o0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.o0.f183953a;
        if (ordinal == 41) {
            if (!o0Var.a(S0())) {
                df2.xw xwVar = (df2.xw) U0(df2.xw.class);
                if (!(xwVar != null && xwVar.e7())) {
                    return;
                }
            }
            boolean z17 = bundle != null ? bundle.getBoolean("PARAM_IS_ENTERING_COMMENT") : false;
            x1(java.lang.Boolean.valueOf(z17));
            boolean z18 = !z17;
            this.f343066x = z18;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.box.p1477xa324943e.C14178x7908fa05 c14178x7908fa05 = this.f343062t;
            c14178x7908fa05.m56772x5cc2687b(z18);
            c14178x7908fa05.m56773x915f0d3(z17 ? new fe2.m(this) : null);
            return;
        }
        p012xc85e97e9.p093xedfae76a.k0 k0Var = this.D;
        fe2.n nVar = this.F;
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff = this.f343061s;
        qo0.c cVar = this.f343059q;
        if (ordinal == 246) {
            K0(0);
            t1(bundle);
            z1();
            I1();
            c2718xca2902ff.m20374x5ef8445b(false);
            c2718xca2902ff.a(nVar);
            qo0.b bVar = qo0.b.f446908k5;
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putBoolean("isShow", false);
            cVar.mo46557x60d69242(bVar, bundle2);
            F1();
            A1();
            oa.i k17 = c2718xca2902ff.k(c2718xca2902ff.m20352xe06bcb0d());
            if (k17 != null) {
                oa.i iVar = k17.a() ^ true ? k17 : null;
                if (iVar != null) {
                    iVar.b();
                }
            }
            ((mm2.e0) P0(mm2.e0.class)).f410503m.mo522xb5bdeb7a(k0Var);
            ((mm2.e0) P0(mm2.e0.class)).f410503m.mo7806x9d92d11c(this, k0Var);
            if (bundle != null ? bundle.getBoolean("PARAM_FINDER_LIVE_SHOW_REDDOT_ON_BOX_TAB_INIT", false) : false) {
                C1();
                return;
            }
            return;
        }
        if (ordinal != 243) {
            if (ordinal == 244 && o0Var.a(S0())) {
                H1(bundle);
                return;
            }
            return;
        }
        K0(0);
        t1(bundle);
        z1();
        I1();
        c2718xca2902ff.m20374x5ef8445b(false);
        c2718xca2902ff.a(nVar);
        java.lang.String str = "status FINDER_LIVE_SWITCH_BOX " + ((mm2.e0) P0(mm2.e0.class)).P6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "str");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveViewPagerComm", "mainFlowLog ".concat(str));
        qo0.b bVar2 = qo0.b.f446908k5;
        android.os.Bundle bundle3 = new android.os.Bundle();
        bundle3.putBoolean("isShow", ((mm2.e0) P0(mm2.e0.class)).P6());
        cVar.mo46557x60d69242(bVar2, bundle3);
        this.f343068z = true;
        if (!((mm2.e0) P0(mm2.e0.class)).P6()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveViewPagerComm", "liveDataLog ".concat("curBoxObserver manually switchToPublic"));
            F1();
        } else if (((mm2.j2) P0(mm2.j2.class)).O6(x0())) {
            G1("initData");
        } else {
            mm2.g0 g0Var = (mm2.g0) P0(mm2.g0.class);
            if (((mm2.c1) g0Var.m147920xbba4bfc0(mm2.c1.class)).e8() && ((mm2.g0) g0Var.m147920xbba4bfc0(mm2.g0.class)).O6()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveViewPagerComm", "change to public for charge live");
                w1("initData");
            }
        }
        ((mm2.e0) P0(mm2.e0.class)).f410503m.mo522xb5bdeb7a(k0Var);
        ((mm2.e0) P0(mm2.e0.class)).f410503m.mo7806x9d92d11c(this, k0Var);
        lm2.h0 h0Var = ((mm2.e0) P0(mm2.e0.class)).f410509s;
        p012xc85e97e9.p093xedfae76a.j0 j0Var = h0Var != null ? h0Var.f400931e : null;
        if (j0Var != null) {
            j0Var.mo7806x9d92d11c(this, this.E);
        }
        A1();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void O0() {
        super.O0();
        K0(8);
        this.f343066x = true;
        ge2.a.f352489b = "";
        this.f343061s.n();
        this.f343064v.f362431e.clear();
        he2.f fVar = this.f343065w;
        if (fVar != null) {
            fVar.mo8343xced61ae5();
        }
        this.C = false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f410334f2 != 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return x0() || this.f343066x;
    }

    public final void t1(android.os.Bundle bundle) {
        android.view.View view;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg mgVar = this.f343063u;
        if (mgVar == null) {
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mgVar);
        he2.h hVar = this.f343064v;
        hVar.getClass();
        java.util.ArrayList arrayList = hVar.f362431e;
        arrayList.clear();
        java.lang.String string = hVar.f362427a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dg7);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        arrayList.add(0, new ee2.a("", string, 0L, mgVar));
        hVar.a(bundle);
        B1();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveViewPagerComm", "adjustLayout");
        android.view.ViewGroup viewGroup = this.f446856d;
        android.view.ViewParent parent = viewGroup.getParent();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup.LayoutParams layoutParams = ((android.widget.LinearLayout) ((android.view.ViewGroup) parent).findViewById(com.p314xaae8f345.mm.R.id.f39)).getLayoutParams();
        android.widget.RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.addRule(2, viewGroup.getId());
        }
        boolean z17 = pm0.v.z(((mm2.c1) P0(mm2.c1.class)).f410340g2, 8);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg mgVar2 = this.f343063u;
        if (mgVar2 != null) {
            mgVar2.K0(0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.box.p1477xa324943e.C14178x7908fa05 c14178x7908fa05 = this.f343062t;
        if (!z17) {
            if (x0()) {
                android.view.ViewGroup.LayoutParams layoutParams3 = c14178x7908fa05.getLayoutParams();
                if (layoutParams3 != null) {
                    int b17 = i65.a.b(this.f343058p, 50);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg mgVar3 = this.f343063u;
                    int i17 = b17 + (mgVar3 != null ? mgVar3.f195035J : this.f343067y);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveViewPagerComm", "adjustLayout commentHeight: " + i17);
                    layoutParams3.height = i17;
                    this.f343067y = i17;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.me meVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg.f195028p0;
                    android.content.Context context = viewGroup.getContext();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                    layoutParams3.width = meVar.a(context);
                    android.view.ViewGroup.LayoutParams layoutParams4 = this.f343061s.getLayoutParams();
                    if (layoutParams4 != null) {
                        layoutParams4.width = layoutParams3.width;
                    }
                }
                zl2.r4.f555483a.e(this, true);
            }
            android.view.ViewGroup viewGroup2 = this.f343060r;
            if (viewGroup2 != null) {
                view = viewGroup2.findViewById(x0() ? com.p314xaae8f345.mm.R.id.f566389fq4 : com.p314xaae8f345.mm.R.id.tp9);
            } else {
                view = null;
            }
            android.view.ViewGroup.LayoutParams layoutParams5 = viewGroup.getLayoutParams();
            android.widget.RelativeLayout.LayoutParams layoutParams6 = layoutParams5 instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams5 : null;
            if (layoutParams6 != null) {
                layoutParams6.removeRule(2);
                layoutParams6.addRule(2, view != null ? view.getId() : 0);
                layoutParams6.bottomMargin = 0;
            }
            u1();
        }
        c14178x7908fa05.m56775xf90c7ee5(fe2.i.f343050d);
    }

    public final void u1() {
        int i17 = com.p314xaae8f345.mm.ui.bl.b(this.f446856d.getContext()).x;
        int size = this.f343064v.f362431e.size();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.box.p1477xa324943e.C14178x7908fa05 c14178x7908fa05 = this.f343062t;
        if (size == 1) {
            android.view.ViewGroup.LayoutParams layoutParams = c14178x7908fa05.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = -2;
                this.f343067y = -2;
                layoutParams.width = i17;
            }
        } else {
            android.view.ViewGroup.LayoutParams layoutParams2 = c14178x7908fa05.getLayoutParams();
            if (layoutParams2 != null) {
                int b17 = i65.a.b(this.f343058p, 50);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg mgVar = this.f343063u;
                int i18 = b17 + (mgVar != null ? mgVar.f195035J : this.f343067y);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("adjustLayout commentHeight: ");
                sb6.append(i18);
                sb6.append(" , commentPlugin?.getMaxHeight():");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg mgVar2 = this.f343063u;
                sb6.append(mgVar2 != null ? java.lang.Integer.valueOf(mgVar2.f195035J) : null);
                sb6.append(", contentMaxHeight：");
                sb6.append(this.f343067y);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveViewPagerComm", sb6.toString());
                layoutParams2.height = i18;
                this.f343067y = i18;
                layoutParams2.width = i17;
            }
        }
        c14178x7908fa05.m56774x25bfb969(this.f343067y);
        c14178x7908fa05.requestLayout();
        he2.f fVar = this.f343065w;
        if (fVar == null) {
            return;
        }
        fVar.f362425e = this.f343067y;
    }

    public final void v1(java.lang.String boxId) {
        java.lang.String m75945x2fec8307;
        if (!this.f343068z) {
            ge2.a.f352488a.a(true);
        }
        this.f343068z = false;
        if (!(boxId == null || boxId.length() == 0)) {
            mm2.e0 e0Var = (mm2.e0) P0(mm2.e0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(boxId, "boxId");
            r45.qm1 qm1Var = new r45.qm1();
            int i17 = qs5.v.f448005a;
            qm1Var.set(0, 1);
            qm1Var.set(1, boxId);
            e0Var.N6(qm1Var);
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("event_type", 1);
                jSONObject.put("group_box_number", boxId);
                ((ml2.r0) i95.n0.c(ml2.r0.class)).wj(jSONObject);
                return;
            } catch (java.lang.Throwable unused) {
                return;
            }
        }
        r45.qm1 qm1Var2 = (r45.qm1) ((mm2.e0) P0(mm2.e0.class)).f410503m.mo3195x754a37bb();
        if (qm1Var2 != null && (m75945x2fec8307 = qm1Var2.m75945x2fec8307(1)) != null) {
            if (m75945x2fec8307.length() > 0) {
                long j17 = ((mm2.e0) P0(mm2.e0.class)).f410504n;
                long j18 = 0;
                if (j17 != 0) {
                    try {
                        j18 = c01.id.c() - j17;
                    } catch (java.lang.Throwable unused2) {
                    }
                }
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("event_type", 2);
                jSONObject2.put("group_box_number", m75945x2fec8307);
                jSONObject2.put("box_stay_time", j18);
                ((ml2.r0) i95.n0.c(ml2.r0.class)).wj(jSONObject2);
            }
        }
        ((mm2.e0) P0(mm2.e0.class)).O6();
    }

    public final void w1(java.lang.String source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(S0(), "<this>");
        ae2.b2 b2Var = ae2.b2.f84994a;
        boolean z17 = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.b2.f85019t).mo141623x754a37bb()).r()).intValue() == 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.BoxCommon", "local enable:" + z17);
        if (!z17 || !((mm2.e0) P0(mm2.e0.class)).P6()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveViewPagerComm", source.concat(" changeToPublic"));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveViewPagerComm", source.concat(" changeToPublic in box!"));
            v1("");
        }
    }

    public final boolean x1(java.lang.Boolean bool) {
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff = this.f343061s;
        int visibility = c2718xca2902ff.getVisibility();
        if (bool != null ? bool.booleanValue() : pm0.v.z(((mm2.c1) P0(mm2.c1.class)).f410340g2, 8)) {
            c2718xca2902ff.setVisibility(8);
        } else if (this.f343064v.f362431e.size() <= 1) {
            c2718xca2902ff.setVisibility(8);
        } else {
            c2718xca2902ff.setVisibility(0);
        }
        if (visibility != c2718xca2902ff.getVisibility()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l.b1(this, null, "FinderLiveViewPagerComm", false, 4, null);
        }
        return c2718xca2902ff.getVisibility() == 0;
    }

    public final java.lang.Integer y1() {
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff = this.f343061s;
        if (!(c2718xca2902ff.getVisibility() == 0)) {
            c2718xca2902ff = null;
        }
        if (c2718xca2902ff == null) {
            return null;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(c2718xca2902ff.getHeight());
        if (valueOf.intValue() > 0) {
            return valueOf;
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void z0() {
        super.z0();
    }

    public final void z1() {
        he2.f fVar = new he2.f(this.f343064v.f362431e, this.f343067y);
        this.f343065w = fVar;
        fVar.a();
        he2.f fVar2 = this.f343065w;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.box.p1477xa324943e.C14178x7908fa05 c14178x7908fa05 = this.f343062t;
        c14178x7908fa05.m8315x6cab2c8d(fVar2);
        fe2.p pVar = this.G;
        c14178x7908fa05.m8314x7cd807d6(pVar);
        c14178x7908fa05.m8289xa5a25773(pVar);
    }
}
