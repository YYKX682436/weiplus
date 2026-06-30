package com.p314xaae8f345.mm.ui;

@gm0.a2
/* renamed from: com.tencent.mm.ui.SingleChatInfoUI */
/* loaded from: classes11.dex */
public class ActivityC21437xf483c2 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b implements p21.a {

    /* renamed from: x, reason: collision with root package name */
    public static boolean f278602x;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f278603d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.z3 f278604e;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19662x4f7a67f3 f278606g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe f278607h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe f278608i;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f278610n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f278611o;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f278605f = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());

    /* renamed from: m, reason: collision with root package name */
    public android.content.SharedPreferences f278609m = null;

    /* renamed from: p, reason: collision with root package name */
    public final ik1.b0 f278612p = new ik1.b0();

    /* renamed from: q, reason: collision with root package name */
    public final ik1.b0 f278613q = new ik1.b0();

    /* renamed from: r, reason: collision with root package name */
    public boolean f278614r = false;

    /* renamed from: s, reason: collision with root package name */
    public zy2.za f278615s = null;

    /* renamed from: t, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.b0 f278616t = new com.p314xaae8f345.mm.p2470x93e71c27.ui.b0(new com.p314xaae8f345.mm.ui.ki(this));

    /* renamed from: u, reason: collision with root package name */
    public bi4.v0 f278617u = null;

    /* renamed from: v, reason: collision with root package name */
    public final l75.q0 f278618v = new com.p314xaae8f345.mm.ui.ui(this);

    /* renamed from: w, reason: collision with root package name */
    public boolean f278619w = false;

    public static void V6(com.p314xaae8f345.mm.ui.ActivityC21437xf483c2 activityC21437xf483c2) {
        activityC21437xf483c2.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14553, 6, 2, activityC21437xf483c2.f278610n);
        f278602x = false;
        java.lang.String str = null;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q = db5.e1.Q(activityC21437xf483c2, activityC21437xf483c2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activityC21437xf483c2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, true, new com.p314xaae8f345.mm.ui.aj(null));
        if (!f278602x) {
            str = ((ng0.o) ((og0.n) i95.n0.c(og0.n.class))).wi(activityC21437xf483c2.f278604e.d1());
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            activityC21437xf483c2.X6(Q);
        } else {
            Q.dismiss();
            db5.e1.L(activityC21437xf483c2, false, activityC21437xf483c2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kk_, str), null, activityC21437xf483c2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fs8), activityC21437xf483c2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b96), new com.p314xaae8f345.mm.ui.zi(activityC21437xf483c2), new com.p314xaae8f345.mm.ui.ai(activityC21437xf483c2, Q), -1, com.p314xaae8f345.mm.R.C30859x5a72f63.f560155ch);
        }
    }

    public final void W6(java.lang.String str, java.util.Map map) {
        int intExtra = getIntent().getIntExtra("chat_from_scene", 0);
        java.lang.String stringExtra = getIntent().getStringExtra("chat_session");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("chat_name", this.f278604e.d1());
        hashMap.put("enter_sessionid", stringExtra);
        hashMap.put("enter_type", java.lang.Integer.valueOf(vh0.l2.a(intExtra)));
        hashMap.put("view_id", str);
        if (map != null) {
            hashMap.putAll(map);
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_clk", hashMap, 34004);
    }

    public final void X6(final android.app.ProgressDialog progressDialog) {
        if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.V3(this.f278610n)) {
            c01.w9.h(this.f278604e.d1(), new com.p314xaae8f345.mm.ui.bi(this, progressDialog));
            this.f278605f.mo50293x3498a0(new com.p314xaae8f345.mm.ui.ii(this));
            return;
        }
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        java.lang.String f17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.m4.f207681a.f(this.f278610n);
        if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.S3(f17)) {
            f17 = "";
        }
        zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
        java.lang.String sessionId = this.f278610n;
        android.view.LayoutInflater.Factory context = mo55332x76847179();
        yz5.l lVar = new yz5.l() { // from class: com.tencent.mm.ui.SingleChatInfoUI$$a
            @Override // yz5.l
            /* renamed from: invoke */
            public final java.lang.Object mo146xb9724478(java.lang.Object obj) {
                boolean z17 = com.p314xaae8f345.mm.ui.ActivityC21437xf483c2.f278602x;
                com.p314xaae8f345.mm.ui.ActivityC21437xf483c2 activityC21437xf483c2 = com.p314xaae8f345.mm.ui.ActivityC21437xf483c2.this;
                activityC21437xf483c2.getClass();
                boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
                android.app.ProgressDialog progressDialog2 = progressDialog;
                if (booleanValue) {
                    c01.w9.h(activityC21437xf483c2.f278604e.d1(), new com.p314xaae8f345.mm.ui.bi(activityC21437xf483c2, progressDialog2));
                    activityC21437xf483c2.f278605f.mo50293x3498a0(new com.p314xaae8f345.mm.ui.ii(activityC21437xf483c2));
                    return null;
                }
                progressDialog2.dismiss();
                db5.t7.i(activityC21437xf483c2, activityC21437xf483c2.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hen), com.p314xaae8f345.mm.R.raw.f79502x48ef2959);
                return null;
            }
        };
        ((c61.l7) b6Var).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pq5.g l17 = new db2.g(f17, sessionId).l();
        l17.K(new c61.k6(lVar));
        if (context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
            l17.f((im5.b) context);
        }
    }

    public final void Y6() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("showShare", false);
        if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.a4(this.f278610n)) {
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.V3(this.f278610n)) {
                intent.putExtra("rawUrl", java.lang.String.format(com.p314xaae8f345.mm.ui.n2.f290931a, 61));
            } else if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.H4(this.f278610n)) {
                ((ki4.x) ((bi4.w0) i95.n0.c(bi4.w0.class))).Ri(this.f278610n, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.e0.f33785x366c91de);
                intent.putExtra("rawUrl", java.lang.String.format(com.p314xaae8f345.mm.ui.n2.f290931a, 76));
            } else {
                intent.putExtra("rawUrl", java.lang.String.format(com.p314xaae8f345.mm.ui.n2.f290931a, 39));
            }
            intent.putExtra("k_username", this.f278610n);
            j45.l.j(this, "webview", ".ui.tools.WebViewUI", intent, null);
            return;
        }
        t53.m0 m0Var = (t53.m0) i95.n0.c(t53.m0.class);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        java.lang.String sessionId = this.f278610n;
        m0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        f63.e eVar = (f63.e) ((f63.h) ((u53.e0) i95.n0.c(u53.e0.class))).Ai(sessionId);
        java.lang.String v07 = eVar.v0();
        intent.putExtra("k_username", v07);
        java.lang.String KExposeGameLifeUrl = com.p314xaae8f345.mm.ui.n2.f290933c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(KExposeGameLifeUrl, "KExposeGameLifeUrl");
        java.lang.String format = java.lang.String.format(KExposeGameLifeUrl, java.util.Arrays.copyOf(new java.lang.Object[]{39}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        intent.putExtra("rawUrl", format);
        j45.l.j(mo55332x76847179, "webview", ".ui.tools.WebViewUI", intent, null);
        t53.m0.hj(m0Var, 8, 40L, eVar.u0(), eVar.t0(), v07, null, null, null, 224, null);
    }

    @Override // p21.a
    public void Z1(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19662x4f7a67f3 c19662x4f7a67f3;
        if (!str.equals(this.f278610n) || (c19662x4f7a67f3 = this.f278606g) == null) {
            return;
        }
        c19662x4f7a67f3.s();
    }

    public final boolean Z6(java.lang.String str) {
        return com.p314xaae8f345.mm.p2621x8fb0427b.z3.E3(str) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.G3(str);
    }

    public final void a7(boolean z17) {
        boolean V3 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.V3(this.f278610n);
        boolean H4 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.H4(this.f278610n);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f278603d).m("room_accept_message", true ^ (V3 || H4));
        if (V3 || H4) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f278603d).h("room_accept_message");
            c21541x1c1b08fe.J(com.p314xaae8f345.mm.R.C30867xcad56011.axr);
            c21541x1c1b08fe.O(z17);
            c21541x1c1b08fe.f279318v = false;
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f278603d).notifyDataSetChanged();
        }
    }

    public void b7() {
        this.f278604e = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.f278610n, true);
        ((un.j1) m80391xac8f1cfd(un.j1.class)).f510806d = this.f278604e;
    }

    public final void c7() {
        boolean z17;
        this.f278608i = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f278603d).h("force_notify");
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(this.f278604e.d1()) || c01.z1.J(this.f278604e.d1()) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.p4(this.f278604e.d1())) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f278603d).m("force_notify", true);
            return;
        }
        long Ai = ((h13.l0) ((f13.e) i95.n0.c(f13.e.class))).Ai(this.f278604e.d1());
        f13.e eVar = (f13.e) i95.n0.c(f13.e.class);
        java.lang.String username = this.f278604e.d1();
        h13.l0 l0Var = (h13.l0) eVar;
        l0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        try {
            z17 = l0Var.Ni(username.concat("@wxcontact"));
        } catch (java.lang.Exception unused) {
            z17 = false;
        }
        this.f278608i.O(z17);
        this.f278608i.S(z17);
        if (this.f278608i.N()) {
            this.f278608i.H(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.feu, new java.text.SimpleDateFormat("HH:mm").format(new java.util.Date(Ai))));
        } else {
            this.f278608i.H(null);
            m78594xca3c3c9a(c01.e2.P(this.f278604e) ? 0 : 8);
        }
        if (this.f278609m == null) {
            this.f278609m = getSharedPreferences(getPackageName() + "_preferences", 0);
        }
        this.f278609m.edit().putBoolean("force_notify", this.f278608i.N()).commit();
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f278603d).notifyDataSetChanged();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: createAdapter */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0 mo43515x4153c6b3(android.content.SharedPreferences sharedPreferences) {
        return new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.b(this, m79335xcc101dd9(), sharedPreferences);
    }

    public final void d7() {
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.V3(this.f278610n) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.a4(this.f278610n) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.H4(this.f278610n)) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f278603d).m(this.f278607h.f279313q, true);
            return;
        }
        if (this.f278609m == null) {
            this.f278609m = getSharedPreferences(getPackageName() + "_preferences", 0);
        }
        boolean P = c01.e2.P(this.f278604e);
        this.f278611o = P;
        java.lang.String string = P ? getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.blb) : "";
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        ((la5.i1) pf5.z.f435481a.a(activity).a(la5.i1.class)).m42291x53d8522f("is_mute", string);
        if (this.f278611o) {
            m78594xca3c3c9a(0);
            if (this.f278607h != null) {
                this.f278609m.edit().putBoolean("room_notify_new_msg", true).commit();
            }
        } else {
            m78594xca3c3c9a(8);
            if (this.f278607h != null) {
                this.f278609m.edit().putBoolean("room_notify_new_msg", false).commit();
            }
        }
        if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.L3(this.f278610n)) {
            ((un.j1) m80391xac8f1cfd(un.j1.class)).Y6(true ^ this.f278611o);
        }
        ((un.j1) m80391xac8f1cfd(un.j1.class)).b7(this.f278611o);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f278603d).notifyDataSetChanged();
    }

    public final void e7() {
        java.lang.String str;
        this.f278617u = new com.p314xaae8f345.mm.ui.si(this);
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        linkedList.add(this.f278610n);
        bi4.w0 w0Var = (bi4.w0) i95.n0.c(bi4.w0.class);
        bi4.v0 v0Var = this.f278617u;
        ki4.x xVar = (ki4.x) w0Var;
        xVar.getClass();
        java.util.Objects.toString(linkedList);
        java.util.Objects.toString(v0Var);
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        for (java.lang.String str2 : linkedList) {
            mj4.w Ai = xVar.Ai(str2);
            if (Ai != null && (str = Ai.f76648xdde069b) != null) {
                linkedList2.add(new jz5.l(str2, str));
            }
        }
        fi4.a aVar = new fi4.a(linkedList2, true);
        com.p314xaae8f345.mm.p944x882e457a.r1 d17 = gm0.j1.d();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getNetSceneQueue(...)");
        ii4.a.a(d17, aVar, this, new ki4.t(aVar, v0Var));
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getBottomView */
    public android.view.View mo60898x89f7f366() {
        java.lang.String talker = getIntent().getStringExtra("Single_Chat_Talker");
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.V3(talker)) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = mo55332x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.edj, (android.view.ViewGroup) null);
            inflate.findViewById(com.p314xaae8f345.mm.R.id.tuc).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.xu(context));
            return inflate;
        }
        if (!Z6(talker)) {
            return null;
        }
        rk.f fVar = (rk.f) ((jz5.n) ((gr1.n) ((rk.g) i95.n0.c(rk.g.class))).f356274d).mo141623x754a37bb();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context2 = mo55332x76847179();
        gr1.k kVar = (gr1.k) fVar;
        kVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        int i17 = r26.i0.n(talker, "@picfansmsg", false) ? 5 : 0;
        int i18 = i17 == 5 ? com.p314xaae8f345.mm.R.C30867xcad56011.o0v : com.p314xaae8f345.mm.R.C30867xcad56011.o0r;
        android.view.View inflate2 = com.p314xaae8f345.mm.ui.id.b(context2).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dzo, (android.view.ViewGroup) null);
        android.widget.TextView textView = (android.widget.TextView) inflate2.findViewById(com.p314xaae8f345.mm.R.id.ska);
        textView.setText(context2.getString(i18));
        textView.setOnClickListener(new gr1.j(kVar, context2, i17));
        return inflate2;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return com.p314xaae8f345.mm.R.xml.f576451bk;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        if (this.f278604e == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SingleChatInfoUI", "[initView] contact is null!");
            finish();
        }
        this.f278603d = m79336x8b97809d();
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.V3(this.f278610n) || Z6(this.f278610n)) {
            mo54450xbf7c1df6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.i79));
        } else {
            mo54450xbf7c1df6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.i78));
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19662x4f7a67f3 c19662x4f7a67f3 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19662x4f7a67f3) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f278603d).h("roominfo_contact_anchor");
        this.f278606g = c19662x4f7a67f3;
        c19662x4f7a67f3.R(this.f278603d, c19662x4f7a67f3.f279313q);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19662x4f7a67f3 c19662x4f7a67f32 = this.f278606g;
        c19662x4f7a67f32.T(true);
        c19662x4f7a67f32.V(false);
        if (this.f278606g != null) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.add(this.f278610n);
            this.f278606g.O(this.f278610n, linkedList, true);
            android.widget.ListView m79335xcc101dd9 = m79335xcc101dd9();
            com.p314xaae8f345.mm.p2470x93e71c27.ui.b0 b0Var = this.f278616t;
            m79335xcc101dd9.setOnScrollListener(b0Var);
            lz.f fVar = this.f278606g.M;
            if (fVar != null) {
                ((r35.u1) fVar).f450807f.f450836v = b0Var;
            }
            if (!Z6(this.f278610n)) {
                this.f278606g.Z(new com.p314xaae8f345.mm.ui.wi(this));
            }
        }
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.ui.xi(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i18 == -1 && i17 == 2 && i18 == -1) {
            finish();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        ((h13.l0) ((f13.e) i95.n0.c(f13.e.class))).getClass();
        j13.a.f378710d.add(this.f278618v);
        if (p21.l.a() != null) {
            ((dh4.t) p21.l.a()).a(this);
        }
        this.f278610n = getIntent().getStringExtra("Single_Chat_Talker");
        this.f278614r = getIntent().getBooleanExtra("fromChatting", false);
        b7();
        if (this.f278604e == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SingleChatInfoUI", "contact is null! talker:%s", this.f278610n);
            finish();
            return;
        }
        getPackageName();
        mo43517x10010bd5();
        ((h13.c0) ((i50.q) i95.n0.c(i50.q.class))).Bi(this.f278604e.d1(), 3, c01.id.c() / 1000);
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.a4(this.f278610n)) {
            t53.m0 m0Var = (t53.m0) i95.n0.c(t53.m0.class);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
            java.lang.String str = this.f278610n;
            com.p314xaae8f345.mm.ui.mi miVar = new com.p314xaae8f345.mm.ui.mi(this);
            m0Var.getClass();
            if (mo55332x76847179 != null) {
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6633xea2e527d c6633xea2e527d = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6633xea2e527d();
                c6633xea2e527d.f139873d = 4L;
                c6633xea2e527d.f139874e = 0L;
                c6633xea2e527d.f139875f = 0L;
                c6633xea2e527d.f139876g = 1L;
                c6633xea2e527d.f139877h = 301L;
                c6633xea2e527d.k();
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(mo55332x76847179, mo55332x76847179.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, 3, null);
                f17.show();
                y53.m Di = ((y53.x) ((u53.y) i95.n0.c(u53.y.class))).Di(((f63.h) ((u53.e0) i95.n0.c(u53.e0.class))).Bi(str));
                java.lang.String t07 = Di.t0();
                if (Di.f67426x9f600742 <= 0) {
                    dp.a.m125853x26a183b(mo55332x76847179, com.p314xaae8f345.mm.R.C30867xcad56011.fq9, 0).show();
                } else {
                    ((y53.x) ((u53.y) i95.n0.c(u53.y.class))).Ni(t07, new t53.y(f17, miVar, mo55332x76847179));
                }
            }
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.V3(this.f278610n)) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f278603d).m("room_placed_to_the_top", true);
            this.f278615s = new com.p314xaae8f345.mm.ui.ti(this);
            java.util.LinkedList linkedList = new java.util.LinkedList();
            r45.ui2 ui2Var = new r45.ui2();
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.m4 m4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.m4.f207681a;
            java.lang.String h17 = m4Var.h(this.f278610n);
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
            java.lang.String f18 = m4Var.f(this.f278610n);
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.S3(f18)) {
                ui2Var.set(0, 1);
            } else if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.T3(f18)) {
                ui2Var.set(0, 3);
            } else {
                ui2Var.set(0, 2);
            }
            ui2Var.set(2, this.f278610n);
            ui2Var.set(1, h17);
            linkedList.add(ui2Var);
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
            zy2.za zaVar = this.f278615s;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.p4 p4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.p4.f207708d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.p4.f207710f = zaVar;
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.p4.f207709e) {
                i95.m c17 = i95.n0.c(cq.k.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                pm0.v.T(new bq.r1(linkedList).l(), new cq.o0(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.n4(p4Var), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.o4(p4Var)));
            } else {
                gm0.j1.d().a(6218, p4Var);
                gm0.j1.d().g(new db2.z5(linkedList));
            }
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
            java.lang.String h18 = m4Var.h(this.f278610n);
            zy2.pa paVar = (zy2.pa) i95.n0.c(zy2.pa.class);
            long j17 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.S3(h18) ? 1L : 2L;
            java.lang.String talkUserName = this.f278610n;
            if (talkUserName == null) {
                talkUserName = "";
            }
            ((c61.w8) paVar).getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talkUserName, "talkUserName");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o oVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p.f206758d;
            oVar.getClass();
            oVar.f206729a = j17;
            oVar.f206730b = talkUserName;
            oVar.f206731c = h18;
            oVar.f206732d = java.lang.String.valueOf(c01.id.c());
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f278603d).h("room_clear_chatting_history").J(com.p314xaae8f345.mm.R.C30867xcad56011.i47);
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.H4(this.f278610n)) {
            e7();
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R3(this.f278604e.d1())) {
            e7();
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.L3(this.f278604e.d1())) {
            int intExtra = getIntent().getIntExtra("chat_from_scene", 0);
            java.lang.String stringExtra = getIntent().getStringExtra("chat_session");
            java.util.HashMap hashMap = new java.util.HashMap();
            iy1.c cVar = iy1.c.MainUI;
            hashMap.put("page_id", 50180);
            hashMap.put("page_name", "yuanbao_chat_setting");
            hashMap.put("chat_name", this.f278604e.d1());
            hashMap.put("enter_sessionid", stringExtra);
            hashMap.put("enter_type", java.lang.Integer.valueOf(vh0.l2.a(intExtra)));
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("session_in", hashMap, 34004);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        ((h13.l0) ((f13.e) i95.n0.c(f13.e.class))).getClass();
        j13.a.f378710d.mo49775xc84af884(this.f278618v);
        zg5.a.b();
        if (p21.l.a() != null) {
            ((dh4.t) p21.l.a()).f(this);
        }
        super.onDestroy();
        ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).Ai(mo55332x76847179(), 0, 0);
        r45.qt2 wi6 = ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).wi(mo55332x76847179());
        ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p pVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p.f206755a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o oVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p.f206758d;
        oVar.getClass();
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6472x1d7e5ac0 c6472x1d7e5ac0 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6472x1d7e5ac0();
        if (wi6 != null) {
            java.lang.String m75945x2fec8307 = wi6.m75945x2fec8307(0);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            c6472x1d7e5ac0.f138149d = c6472x1d7e5ac0.b("sessionid", m75945x2fec8307, true);
            java.lang.String m75945x2fec83072 = wi6.m75945x2fec8307(2);
            if (m75945x2fec83072 == null) {
                m75945x2fec83072 = "";
            }
            c6472x1d7e5ac0.f138150e = c6472x1d7e5ac0.b("clicktabcontextid", m75945x2fec83072, true);
        }
        java.lang.String str = c6472x1d7e5ac0.f138149d;
        if (str == null) {
            str = "";
        }
        c6472x1d7e5ac0.f138149d = c6472x1d7e5ac0.b("sessionid", str, true);
        java.lang.String str2 = c6472x1d7e5ac0.f138150e;
        if (str2 == null) {
            str2 = "";
        }
        c6472x1d7e5ac0.f138150e = c6472x1d7e5ac0.b("clicktabcontextid", str2, true);
        c6472x1d7e5ac0.f138151f = c6472x1d7e5ac0.b("chatSessionid", oVar.f206732d, true);
        c6472x1d7e5ac0.f138152g = oVar.f206729a;
        c6472x1d7e5ac0.f138153h = c6472x1d7e5ac0.b("chatName", oVar.f206730b, true);
        c6472x1d7e5ac0.f138154i = c6472x1d7e5ac0.b("talkerUsername", oVar.f206731c, true);
        c6472x1d7e5ac0.f138155j = oVar.f206736h;
        c6472x1d7e5ac0.f138156k = oVar.f206733e;
        c6472x1d7e5ac0.f138157l = oVar.f206735g;
        c6472x1d7e5ac0.f138158m = oVar.f206734f;
        c6472x1d7e5ac0.k();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p.a(pVar, "RecordFinderChatProfile", c6472x1d7e5ac0);
        oVar.f206729a = 0L;
        oVar.f206730b = "";
        oVar.f206731c = "";
        oVar.f206733e = 0L;
        oVar.f206734f = 0L;
        oVar.f206735g = 0L;
        oVar.f206736h = 0L;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179;
        java.lang.Object obj;
        boolean z17;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f;
        boolean z18;
        java.lang.String key = c21560x1fce98fb.f279313q;
        r45.k74 k74Var = null;
        if (Z6(this.f278610n)) {
            rk.f fVar = (rk.f) ((jz5.n) ((gr1.n) ((rk.g) i95.n0.c(rk.g.class))).f356274d).mo141623x754a37bb();
            java.lang.String talker = this.f278610n;
            gr1.k kVar = (gr1.k) fVar;
            kVar.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
            int i17 = r26.i0.n(talker, "@picfansmsg", false) ? 5 : 0;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(key, "room_expose")) {
                hr1.a y07 = i17 == 5 ? yq1.u0.Ui().y0(talker) : yq1.u0.Bi().y0(talker);
                if (y07 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BizFans.SafetyDelegate", "jumpToComplainH5 contact null for talker=".concat(talker));
                } else {
                    hr1.m z07 = i17 == 5 ? yq1.u0.Zi().z0(talker) : yq1.u0.Ni().y0(talker);
                    java.lang.String e17 = jr1.j.e(talker, i17);
                    java.lang.String str = y07.f66212x21f9b213;
                    if (str == null) {
                        str = "";
                    }
                    java.lang.String str2 = y07.f66211x3c018db3 ? "1" : "0";
                    java.lang.String valueOf = java.lang.String.valueOf(y07.f66210x4f9943d);
                    java.lang.String str3 = y07.f66209x4f67f8e;
                    if (str3 == null) {
                        str3 = "";
                    }
                    java.lang.String str4 = y07.f66207xff000111;
                    if (str4 == null) {
                        str4 = "";
                    }
                    java.lang.String str5 = z07.f66478x1362f030;
                    java.lang.String e18 = str5 != null ? jr1.j.e(str5, i17) : null;
                    if (e18 == null) {
                        e18 = "";
                    }
                    java.lang.String format = java.lang.String.format("https://mp.weixin.qq.com/publicpoc/wap_privatemsgcomplain?action=show&openId=%s&username=%s&nickname=%s&blackState=%s&identityType=%s&identityName=%s&headImageUrl=%s&__biz=%s#wechat_redirect", java.util.Arrays.copyOf(new java.lang.Object[]{kVar.a(e17), kVar.a(talker), kVar.a(str), str2, valueOf, kVar.a(str3), kVar.a(str4), kVar.a(e18)}, 8));
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizFans.SafetyDelegate", "jumpToComplainH5 urlLen=" + format.length() + " talker=" + talker + " serviceType=" + i17);
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("rawUrl", format);
                    intent.putExtra("KRightBtn", true);
                    j45.l.j(this, "webview", ".ui.tools.WebViewUI", intent, null);
                }
                z18 = true;
            } else {
                z18 = false;
            }
            if (z18) {
                return true;
            }
        }
        if (key.equals("room_notify_new_msg")) {
            boolean z19 = !this.f278611o;
            this.f278611o = z19;
            if (z19) {
                c01.e2.p0(this.f278604e, true);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.g) vg3.n3.f518269n1.a()).wi(new vg3.e(vg3.d.f518215h, vg3.b.f518178e, vg3.c.f518199u, 0, new java.util.ArrayList(java.util.Collections.singletonList(this.f278604e.d1()))));
            } else {
                c01.e2.z0(this.f278604e, true);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.g) vg3.n3.f518269n1.a()).wi(new vg3.e(vg3.d.f518215h, vg3.b.f518178e, vg3.c.f518200v, 0, new java.util.ArrayList(java.util.Collections.singletonList(this.f278604e.d1()))));
            }
            b7();
            if (this.f278609m == null) {
                this.f278609m = getSharedPreferences(getPackageName() + "_preferences", 0);
            }
            this.f278609m.edit().putBoolean("room_notify_new_msg", this.f278611o).commit();
            d7();
            if (!this.f278611o) {
                ((un.j1) m80391xac8f1cfd(un.j1.class)).Q6(java.lang.Boolean.FALSE, true);
            }
            un.j1 j1Var = (un.j1) m80391xac8f1cfd(un.j1.class);
            boolean z27 = this.f278611o;
            j1Var.getClass();
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6363x8f18fad7 c6363x8f18fad7 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6363x8f18fad7();
            c6363x8f18fad7.f137131d = c6363x8f18fad7.b("roomUsername", j1Var.U6(), true);
            c6363x8f18fad7.f137132e = z27 ? 11 : 10;
            c6363x8f18fad7.k();
            if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.L3(this.f278610n)) {
                return false;
            }
            if (this.f278611o) {
                W6("yuanbao_msg_not_disturb_open", null);
                return false;
            }
            W6("yuanbao_msg_not_disturb_close", null);
            return false;
        }
        if (key.equals("room_placed_to_the_top")) {
            ((un.j1) m80391xac8f1cfd(un.j1.class)).O6(true);
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.L3(this.f278610n)) {
                if (((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar).h("room_placed_to_the_top")).N()) {
                    W6("yuanbao_msg_top_open", null);
                } else {
                    W6("yuanbao_msg_top_close", null);
                }
            }
            if (((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar).h("room_placed_to_the_top")).N()) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.g) vg3.n3.f518269n1.a()).wi(new vg3.e(vg3.d.f518215h, vg3.b.f518178e, vg3.c.f518197s, 0, new java.util.ArrayList(java.util.Collections.singletonList(this.f278604e.d1()))));
                return false;
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.g) vg3.n3.f518269n1.a()).wi(new vg3.e(vg3.d.f518215h, vg3.b.f518178e, vg3.c.f518196r, 0, new java.util.ArrayList(java.util.Collections.singletonList(this.f278604e.d1()))));
            return false;
        }
        if (key.equals("force_notify")) {
            if (this.f278608i.N()) {
                m13.b.f404395a.a(mo55332x76847179(), 1, false, new com.p314xaae8f345.mm.ui.yi(this));
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.g) vg3.n3.f518269n1.a()).wi(new vg3.e(vg3.d.f518215h, vg3.b.f518178e, vg3.c.f518198t, 0, new java.util.ArrayList(java.util.Collections.singletonList(this.f278604e.d1()))));
                return false;
            }
            ((h13.l0) ((f13.e) i95.n0.c(f13.e.class))).wi(this.f278604e.d1() + "@wxcontact", 3);
            this.f278608i.H(null);
            return false;
        }
        if (key.equals("room_set_chatting_background")) {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("isApplyToAll", false);
            intent2.putExtra(dm.i4.f66875xa013b0d5, this.f278604e.d1());
            j45.l.n(this, "setting", ".ui.setting.SettingsChattingBackgroundUI", intent2, 2);
            return false;
        }
        if (key.equals("room_search_chatting_content")) {
            android.content.Intent intent3 = new android.content.Intent();
            intent3.putExtra("detail_username", this.f278610n);
            boolean z28 = bm5.o1.f104252a.g(bm5.h0.RepairerConfig_Global_FTSMultiTabSearch_Int, 0) == 1;
            boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_fts_multi_tab_search_entrance_v2, true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiTabEntranceConfig", "FTSMultiTabEntranceConfig >> " + z28 + ", " + fj6);
            if (z28 || fj6) {
                intent3.setClass(this, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2672xc9fa65a8.p2673x636d539.ActivityC21855xa077090f.class);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent3);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/ui/SingleChatInfoUI", "searchChattingContent", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(this, "com/tencent/mm/ui/SingleChatInfoUI", "searchChattingContent", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else {
                ((s50.g0) ((u50.v) i95.n0.c(u50.v.class))).getClass();
                o13.n.q(this, ".ui.FTSChattingConvUI", intent3);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14569, 1, 0, 0, 0, 0, 0, 0, 0, 0);
            if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.L3(this.f278604e.d1())) {
                return false;
            }
            W6("yuanbao_find_chat_history", null);
            return false;
        }
        if (key.equals("room_clear_chatting_history")) {
            ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o oVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p.f206758d;
            oVar.f206735g++;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RecordFinderChatProfile", "incClearHistoryCount:" + oVar.f206735g);
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.H4(this.f278610n)) {
                ((ki4.x) ((bi4.w0) i95.n0.c(bi4.w0.class))).Ri(this.f278610n, 157);
            }
            java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.fc7, this.f278604e.g2());
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.V3(this.f278610n)) {
                string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.fc8, this.f278604e.g2());
            }
            java.lang.String str6 = string;
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.L3(this.f278610n)) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(this, 1, 3, true);
                z2Var.t(android.view.View.inflate(mo55332x76847179(), com.p314xaae8f345.mm.R.C30864xbddafb2a.e0r, null));
                android.view.View inflate = android.view.View.inflate(mo55332x76847179(), com.p314xaae8f345.mm.R.C30864xbddafb2a.e0q, null);
                android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.spz);
                textView.setText(java.lang.String.format(getString(com.p314xaae8f345.mm.R.C30867xcad56011.n7h), this.f278604e.g2()));
                android.widget.CheckBox checkBox = (android.widget.CheckBox) inflate.findViewById(com.p314xaae8f345.mm.R.id.t3r);
                if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.L4(this.f278604e.d1())) {
                    textView.setVisibility(8);
                    checkBox.setVisibility(8);
                }
                inflate.findViewById(com.p314xaae8f345.mm.R.id.f565285by4).setOnClickListener(new com.p314xaae8f345.mm.ui.fi(this, checkBox));
                z2Var.j(inflate);
                z2Var.m(getString(com.p314xaae8f345.mm.R.C30867xcad56011.apj), getString(com.p314xaae8f345.mm.R.C30867xcad56011.apk));
                z2Var.o(2);
                com.p314xaae8f345.mm.ui.gi giVar = new com.p314xaae8f345.mm.ui.gi(this, z2Var, checkBox);
                com.p314xaae8f345.mm.ui.hi hiVar = new com.p314xaae8f345.mm.ui.hi(this, checkBox, z2Var);
                z2Var.D = giVar;
                z2Var.E = hiVar;
                z2Var.C();
            } else {
                db5.e1.B(mo55332x76847179(), str6, "", getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571886sl), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new com.p314xaae8f345.mm.ui.ci(this), null, com.p314xaae8f345.mm.R.C30859x5a72f63.f560155ch);
            }
            if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.L3(this.f278604e.d1())) {
                return false;
            }
            W6("yuanbao_msg_clear", null);
            return false;
        }
        if (key.equals("room_del_chatting")) {
            com.p314xaae8f345.mm.p2621x8fb0427b.l4 p17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).p(this.f278610n);
            if (p17 != null) {
                com.p314xaae8f345.mm.ui.p2695x2c1ddc83.t1.c(this.f278610n, this, p17, true, new com.p314xaae8f345.mm.ui.di(this), new com.p314xaae8f345.mm.ui.ei(this), true, false);
            } else {
                int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(this);
                e4Var.d(com.p314xaae8f345.mm.R.C30867xcad56011.ofq);
                e4Var.c();
            }
            if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.L3(this.f278610n)) {
                return false;
            }
            W6("yuanbao_chat_delete", null);
            return false;
        }
        if (key.equals("room_set_to_conv_box")) {
            ((un.j1) m80391xac8f1cfd(un.j1.class)).P6();
            if (((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar).h("room_set_to_conv_box")).N()) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.g) vg3.n3.f518269n1.a()).wi(new vg3.e(vg3.d.f518215h, vg3.b.f518178e, vg3.c.f518194p, 0, new java.util.ArrayList(java.util.Collections.singletonList(this.f278604e.d1()))));
                return false;
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.g) vg3.n3.f518269n1.a()).wi(new vg3.e(vg3.d.f518215h, vg3.b.f518178e, vg3.c.f518195q, 0, new java.util.ArrayList(java.util.Collections.singletonList(this.f278604e.d1()))));
            return false;
        }
        if (key.equals("room_expose")) {
            ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o oVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p.f206758d;
            oVar2.f206734f++;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RecordFinderChatProfile", "incCompanionCount:" + oVar2.f206734f);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("k_username", this.f278610n);
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.V3(this.f278610n)) {
                zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = mo55332x76847179();
                ((c61.l7) b6Var).getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                r45.k74 k74Var2 = new r45.k74();
                java.util.LinkedList m75941xfb821914 = g92.b.f351302e.k2().d().m75941xfb821914(24);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getFinder_config_item(...)");
                java.util.Iterator it = m75941xfb821914.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.yy0) obj).m75945x2fec8307(0), "personalmsg_complain_liteapp_info")) {
                        break;
                    }
                }
                r45.yy0 yy0Var = (r45.yy0) obj;
                byte[] g17 = (yy0Var == null || (m75934xbce7f2f = yy0Var.m75934xbce7f2f(1)) == null) ? null : m75934xbce7f2f.g();
                if (g17 != null) {
                    try {
                        k74Var2.mo11468x92b714fd(g17);
                        k74Var = k74Var2;
                    } catch (java.lang.Exception e19) {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e19);
                    }
                }
                if (k74Var == null) {
                    z17 = false;
                } else {
                    xc2.y2 y2Var = xc2.y2.f534876a;
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862();
                    c19786x6a1e2862.m76551x3af0573b(k74Var);
                    xc2.y2.L(y2Var, context, new xc2.p0(c19786x6a1e2862), null, null, bundle, 12, null);
                    z17 = true;
                }
                if (z17) {
                    return false;
                }
            }
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.a4(this.f278610n) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.V3(this.f278610n) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.H4(this.f278610n)) {
                Y6();
                return false;
            }
            if (!j62.e.g().l("clicfg_single_chat_expose_config_switch_android", false, false, true)) {
                Y6();
                return false;
            }
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putString("appId", "wxalited4df4810a40b1d9ddc0cbea44d263fd9");
            bundle2.putString("query", "{\"scene\":39}");
            bundle2.putBundle(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14345xae24a099, bundle);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SingleChatInfoUI", "open liteapp:wxalited4df4810a40b1d9ddc0cbea44d263fd9,page:");
            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).kk(this, bundle2, true, false, new com.p314xaae8f345.mm.ui.ji(this));
            return false;
        }
        if (key.equals("chat_app_brand")) {
            android.content.Intent intent4 = new android.content.Intent();
            intent4.putExtra("Chat_User", this.f278610n);
            j45.l.u(this, ".ui.chatting.gallery.AppBrandHistoryListUI", intent4, null);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(219L, 25L, 1L, true);
            return false;
        }
        if (!key.equals("room_accept_message")) {
            if (!key.equals("room_add_blacklist")) {
                if (!key.equals("close_chat") || (mo55332x76847179 = mo55332x76847179()) == null) {
                    return false;
                }
                q41.f.a(this.f278610n, 8, 0);
                db5.e1.B(mo55332x76847179, mo55332x76847179.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.heo), "", mo55332x76847179.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hem), mo55332x76847179.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new com.p314xaae8f345.mm.ui.pi(this, mo55332x76847179), null, com.p314xaae8f345.mm.R.C30859x5a72f63.f560155ch);
                return false;
            }
            if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.a4(this.f278610n)) {
                return false;
            }
            t53.k kVar2 = (t53.k) i95.n0.c(t53.k.class);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471792 = mo55332x76847179();
            java.lang.String str7 = this.f278610n;
            ik1.b0 isBlackList = this.f278613q;
            ik1.b0 isAssociateWithWAGame = this.f278612p;
            com.p314xaae8f345.mm.ui.oi oiVar = new com.p314xaae8f345.mm.ui.oi(this);
            t53.m0 m0Var = (t53.m0) kVar2;
            m0Var.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(isBlackList, "isBlackList");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(isAssociateWithWAGame, "isAssociateWithWAGame");
            if (mo55332x768471792 == null) {
                return false;
            }
            u53.c0 Ai = ((f63.h) ((u53.e0) i95.n0.c(u53.e0.class))).Ai(str7);
            f63.e eVar = (f63.e) Ai;
            java.lang.String v07 = eVar.v0();
            t53.m0.hj(m0Var, 5, 2L, eVar.u0(), eVar.t0(), v07, null, null, null, 224, null);
            y53.m Di = ((y53.x) ((u53.y) i95.n0.c(u53.y.class))).Di(v07);
            int i19 = Di.f67426x9f600742;
            java.lang.String t07 = Di.t0();
            if (i19 <= 0) {
                dp.a.m125853x26a183b(mo55332x768471792, com.p314xaae8f345.mm.R.C30867xcad56011.fq9, 0).show();
                return false;
            }
            if (i19 == 2) {
                if (isBlackList.f373357a == null || isAssociateWithWAGame.f373357a == null) {
                    return false;
                }
                m0Var.ij(mo55332x768471792, t07, i19, isBlackList, isAssociateWithWAGame, oiVar, Ai);
                return false;
            }
            if (i19 != 1) {
                return false;
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(mo55332x768471792, mo55332x768471792.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, 3, null);
            f17.show();
            ((y53.x) ((u53.y) i95.n0.c(u53.y.class))).Ni(t07, new t53.u(isBlackList, isAssociateWithWAGame, t07, f17, m0Var, mo55332x768471792, i19, oiVar, Ai));
            return false;
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f278603d).h("room_accept_message");
        if (c21541x1c1b08fe == null) {
            return false;
        }
        boolean N = c21541x1c1b08fe.N();
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.H4(this.f278610n)) {
            bi4.w0 w0Var = (bi4.w0) i95.n0.c(bi4.w0.class);
            java.lang.String str8 = this.f278610n;
            ki4.x xVar = (ki4.x) w0Var;
            xVar.getClass();
            hi4.m.f363088f.d(str8 != null ? str8 : "", N ? 155 : 156);
            mj4.w Ai2 = xVar.Ai(str8);
            if (Ai2 == null) {
                return false;
            }
            pj4.c2 c2Var = new pj4.c2();
            c2Var.f436544d = Ai2.f76648xdde069b;
            c2Var.f436545e = N;
            pj4.v0 v0Var = new pj4.v0();
            v0Var.f436841d = 11;
            byte[] mo14344x5f01b1f6 = c2Var.mo14344x5f01b1f6();
            v0Var.f436842e = com.p314xaae8f345.mm.p2495xc50a8b8b.g.c(android.util.Base64.encodeToString(mo14344x5f01b1f6, 0, mo14344x5f01b1f6.length, 2));
            ki4.v vVar = new ki4.v(xVar, str8, Ai2);
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.add(v0Var);
            fi4.b bVar = new fi4.b(linkedList);
            com.p314xaae8f345.mm.p944x882e457a.r1 d17 = gm0.j1.d();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getNetSceneQueue(...)");
            ii4.a.a(d17, bVar, this, new ki4.h0(bVar, vVar));
            return false;
        }
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.m4 m4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.m4.f207681a;
        java.lang.String h17 = m4Var.h(this.f278610n);
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        java.lang.String f18 = m4Var.f(this.f278610n);
        if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.S3(h17)) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            java.lang.String session = this.f278610n;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(session, "session");
            hb2.y0 y0Var = hb2.y0.f361649e;
            y0Var.getClass();
            r45.ji2 ji2Var = new r45.ji2();
            ji2Var.set(0, java.lang.Integer.valueOf(N ? 1 : 0));
            ji2Var.set(1, session);
            hb2.w0.m(y0Var, ji2Var, null, false, false, null, null, 60, null);
        } else if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.S3(f18)) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            java.lang.String session2 = this.f278610n;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(session2, "session");
            hb2.y0 y0Var2 = hb2.y0.f361649e;
            y0Var2.getClass();
            r45.ji2 ji2Var2 = new r45.ji2();
            ji2Var2.set(0, java.lang.Integer.valueOf(N ? 1 : 0));
            ji2Var2.set(1, session2);
            hb2.w0.m(y0Var2, ji2Var2, null, false, false, null, null, 60, null);
        } else {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            java.lang.String session3 = this.f278610n;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(session3, "session");
            hb2.t0 t0Var = hb2.t0.f361627e;
            t0Var.getClass();
            r45.ji2 ji2Var3 = new r45.ji2();
            ji2Var3.set(0, java.lang.Integer.valueOf(N ? 1 : 0));
            ji2Var3.set(1, session3);
            hb2.w0.m(t0Var, ji2Var3, null, false, false, null, null, 60, null);
        }
        zy2.pa paVar = (zy2.pa) i95.n0.c(zy2.pa.class);
        long j17 = N ? 1L : 0L;
        ((c61.w8) paVar).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p.f206758d.f206736h = j17;
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var;
        b7();
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var2 = this.f278604e;
        boolean z17 = false;
        if (z3Var2 != null && z3Var2.F0() == 1) {
            this.f278606g.T(false);
        }
        if (!com.p314xaae8f345.mm.ui.p2690x38b72420.i5.f() && (z3Var = this.f278604e) != null && com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(z3Var.d1())) {
            this.f278606g.T(false);
        }
        this.f278607h = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f278603d).h("room_notify_new_msg");
        ((un.j1) m80391xac8f1cfd(un.j1.class)).Y6(true);
        if (this.f278609m == null) {
            this.f278609m = getSharedPreferences(getPackageName() + "_preferences", 0);
        }
        if (this.f278604e != null) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f278603d).m("force_notify", !r4.r2());
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f278603d).m("room_del_chatting", this.f278604e.r2());
            this.f278611o = c01.e2.P(this.f278604e);
            this.f278609m.edit().putBoolean("room_notify_new_msg", this.f278611o).commit();
        } else {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f278603d).m("force_notify", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f278603d).m("room_del_chatting", true);
            this.f278609m.edit().putBoolean("room_notify_new_msg", false).commit();
            this.f278611o = false;
        }
        ((un.j1) m80391xac8f1cfd(un.j1.class)).Z6();
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.V3(this.f278610n)) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f278603d).m("room_search_chatting_content", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f278603d).m("force_notify", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f278603d).m("room_set_chatting_background", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f278603d).m("room_del_chatting", true);
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.H4(this.f278610n)) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f278603d).m("room_search_chatting_content", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f278603d).m("force_notify", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f278603d).m("room_set_chatting_background", true);
        }
        if (Z6(this.f278610n)) {
            rk.f fVar = (rk.f) ((jz5.n) ((gr1.n) ((rk.g) i95.n0.c(rk.g.class))).f356274d).mo141623x754a37bb();
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r screen = this.f278603d;
            java.lang.String talker = this.f278610n;
            ((gr1.k) fVar).getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(screen, "screen");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
            int i17 = r26.i0.n(talker, "@picfansmsg", false) ? 5 : 0;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("attachBizFansChatInfoSection talker=");
            sb6.append(talker);
            sb6.append(" serviceType=");
            sb6.append(i17);
            sb6.append(" complainOn=");
            sb6.append(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_biz_fans_private_msg_complaint_enable, 0) == 1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizFans.SafetyDelegate", sb6.toString());
            java.util.Iterator it = gr1.k.f356271a.iterator();
            while (it.hasNext()) {
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) screen).m((java.lang.String) it.next(), true);
            }
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0 h0Var = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) screen;
            h0Var.m("room_expose", !(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_biz_fans_private_msg_complaint_enable, 0) == 1));
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h17 = h0Var.h("room_expose");
            if (h17 != null) {
                h17.J(com.p314xaae8f345.mm.R.C30867xcad56011.o0o);
            }
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h18 = h0Var.h("roominfo_contact_anchor");
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19662x4f7a67f3 c19662x4f7a67f3 = h18 instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19662x4f7a67f3 ? (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19662x4f7a67f3) h18 : null;
            if (c19662x4f7a67f3 != null) {
                c19662x4f7a67f3.Z(new gr1.i(talker, i17, this));
            }
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.L3(this.f278610n)) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f278603d).m("room_set_to_conv_box", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f278603d).m("room_accept_message", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f278603d).m("force_notify", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f278603d).m("room_set_chatting_background", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f278603d).m("room_add_blacklist", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f278603d).m("room_expose", true);
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19662x4f7a67f3 c19662x4f7a67f32 = this.f278606g;
            c19662x4f7a67f32.T(true);
            c19662x4f7a67f32.V(false);
        }
        ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).j4(this.f278610n);
        boolean r27 = this.f278604e.r2();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SingleChatInfoUI", "initSingleView() called isContact:%s", java.lang.Boolean.valueOf(r27));
        if (!r27) {
            this.f278606g.T(false);
        }
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f278603d).notifyDataSetChanged();
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.a4(this.f278610n)) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f278603d).m("room_search_chatting_content", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f278603d).m("room_set_chatting_background", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f278603d).m("room_placed_to_the_top", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f278603d).m("force_notify", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f278603d).m("seperate_line_between_force_notify_and_background", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f278603d).m("seperate_line_between_background_and_clear_history", true);
        } else {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f278603d).m("room_add_blacklist", true);
        }
        if (!Z6(this.f278610n)) {
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var3 = this.f278604e;
            if (z3Var3 == null || !com.p314xaae8f345.mm.p2621x8fb0427b.z3.p4(z3Var3.d1())) {
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f278603d).m("close_chat", true);
                com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar = this.f278603d;
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var4 = this.f278604e;
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar).m("room_del_chatting", z3Var4 == null || z3Var4.r2() || com.p314xaae8f345.mm.p2621x8fb0427b.z3.V3(this.f278610n));
            } else {
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f278603d).m("room_placed_to_the_top", true);
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f278603d).m("force_notify", true);
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f278603d).m("seperate_line_between_force_notify_and_background", true);
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f278603d).m("room_set_chatting_background", true);
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f278603d).m("room_notify_new_msg", false);
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f278603d).m("close_chat", false);
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f278603d).m("room_del_chatting", true);
            }
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.H4(this.f278610n)) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f278603d).m("room_placed_to_the_top", true);
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R3(this.f278604e.d1())) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f278603d).m("room_expose", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f278603d).m("force_notify", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f278603d).m("room_notify_new_msg", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f278603d).m("room_set_to_conv_box", true);
            this.f278606g.T(false);
        }
        d7();
        if (this.f278606g != null) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.add(this.f278610n);
            this.f278606g.O(this.f278610n, linkedList, true);
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.V3(this.f278610n)) {
                this.f278606g.T(false);
                this.f278606g.V(false);
            }
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.H4(this.f278610n)) {
                this.f278606g.T(false);
                this.f278606g.V(false);
            }
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.a4(this.f278610n)) {
                this.f278606g.T(false);
                this.f278606g.V(false);
            }
            this.f278606g.W(true);
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.p4(this.f278610n)) {
                this.f278606g.T(false);
                this.f278606g.V(false);
                this.f278606g.W(false);
            }
        }
        boolean V3 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.V3(this.f278610n);
        boolean H4 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.H4(this.f278610n);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f278603d).m("room_accept_message", !(V3 || H4));
        if (V3) {
            a7(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.dj0) ((jz5.n) ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.s1) ((zy2.e6) i95.n0.c(zy2.e6.class))).f207729d).mo141623x754a37bb()).J0(this.f278610n).f65980x36454e5d == 1);
        }
        if (H4) {
            mj4.w Ai = ((ki4.x) ((bi4.w0) i95.n0.c(bi4.w0.class))).Ai(this.f278610n);
            if (Ai != null && Ai.f76636x28e0a508 == 1) {
                z17 = true;
            }
            a7(z17);
        }
        c7();
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f278603d).notifyDataSetChanged();
        super.onResume();
        if (this.f278619w) {
            return;
        }
        java.lang.String stringExtra = getIntent().getStringExtra("need_matte_high_light_item");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            int o17 = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f278603d).o(stringExtra);
            m79341xf579a34a(o17 - 3);
            new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo50297x7c4d7ca2(new com.p314xaae8f345.mm.ui.vi(this, o17), 10L);
        }
        this.f278619w = true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.add(la5.i1.class);
        hashSet.add(un.j1.class);
    }
}
