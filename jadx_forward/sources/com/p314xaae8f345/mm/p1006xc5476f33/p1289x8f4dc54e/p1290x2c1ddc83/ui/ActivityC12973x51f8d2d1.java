package com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.p1290x2c1ddc83.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/brandservice/conversation/ui/BizFansSettingUI;", "Lcom/tencent/mm/ui/base/preference/MMPreference;", "<init>", "()V", "plugin-brandservice_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.brandservice.conversation.ui.BizFansSettingUI */
/* loaded from: classes11.dex */
public final class ActivityC12973x51f8d2d1 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f175490v = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f175491d;

    /* renamed from: g, reason: collision with root package name */
    public int f175494g;

    /* renamed from: i, reason: collision with root package name */
    public boolean f175496i;

    /* renamed from: s, reason: collision with root package name */
    public final p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.c f175503s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f175504t;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f175505u;

    /* renamed from: e, reason: collision with root package name */
    public boolean f175492e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f175493f = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f175495h = true;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f175497m = jz5.h.b(new ir1.t1(this));

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f175498n = jz5.h.b(new ir1.y1(this));

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f175499o = jz5.h.b(new ir1.w1(this));

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f175500p = jz5.h.b(new ir1.x1(this));

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f175501q = jz5.h.b(new ir1.a2(this));

    /* renamed from: r, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.r2 f175502r = p3325xe03a0797.p3326xc267989b.l.d(v65.m.b(this), null, null, new ir1.s1(this, null), 3, null);

    public ActivityC12973x51f8d2d1() {
        p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.c m2516xaf5070d2 = m2516xaf5070d2(new h.f(), new ir1.o1(this));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m2516xaf5070d2, "registerForActivityResult(...)");
        this.f175503s = m2516xaf5070d2;
    }

    public static final void V6(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.p1290x2c1ddc83.ui.ActivityC12973x51f8d2d1 activityC12973x51f8d2d1) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = activityC12973x51f8d2d1.f175505u;
        if (u3Var != null) {
            u3Var.dismiss();
            activityC12973x51f8d2d1.f175505u = null;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q = db5.e1.Q(activityC12973x51f8d2d1, null, activityC12973x51f8d2d1.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, false, ir1.d2.f375489d);
        activityC12973x51f8d2d1.f175505u = Q;
        if (Q != null) {
            Q.setOnCancelListener(new ir1.e2(activityC12973x51f8d2d1));
        }
    }

    public final void W6() {
        java.lang.String c17;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.vn3 vn3Var = new r45.vn3();
        if (this.f175491d == 5) {
            rm.d0 d0Var = (rm.d0) i95.n0.c(rm.d0.class);
            tk.s[] sVarArr = tk.s.f501403d;
            c17 = ((ox.r) d0Var).Bi(2).c();
        } else {
            rm.d0 d0Var2 = (rm.d0) i95.n0.c(rm.d0.class);
            tk.s[] sVarArr2 = tk.s.f501403d;
            c17 = ((ox.r) d0Var2).Bi(1).c();
        }
        vn3Var.f469927d = c17;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add("filter_spam_fansmsg");
        linkedList.add("close_notice_fansmsg");
        linkedList.add("private_msg_scope");
        linkedList.add("is_one_msg_before_reply");
        vn3Var.f469928e = linkedList;
        lVar.f152197a = vn3Var;
        lVar.f152198b = new r45.wn3();
        lVar.f152199c = "/cgi-bin/mmbiz-bin/mp/getsetting";
        lVar.f152200d = 26995;
        com.p314xaae8f345.mm.p944x882e457a.z2.d(lVar.a(), new ir1.p1(new p3321xbce91901.jvm.p3324x21ffc6bd.c0(), new java.lang.ref.WeakReference(this)), false);
    }

    public final com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe X6() {
        return (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) this.f175500p.mo141623x754a37bb();
    }

    public final r45.s26 Y6() {
        return (r45.s26) this.f175501q.mo141623x754a37bb();
    }

    public final boolean Z6() {
        java.util.LinkedList<r45.k36> list = Y6().f466981e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "list");
        for (r45.k36 k36Var : list) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(k36Var.f459874d, "filter_spam_fansmsg")) {
                return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(k36Var.f459875e, "0");
            }
        }
        return true;
    }

    public final boolean a7() {
        java.util.LinkedList<r45.k36> list = Y6().f466981e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "list");
        for (r45.k36 k36Var : list) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(k36Var.f459874d, "close_notice_fansmsg")) {
                return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(k36Var.f459875e, "0");
            }
        }
        return true;
    }

    public final void b7(java.lang.String str) {
        if (r26.i0.n("biz_fans_msg_hide_disturb_pref", str, false) || r26.i0.n("biz_fans_remind_pref", str, false) || r26.i0.n("biz_fans_private_msg_scope_pref", str, false) || r26.i0.n("biz_fans_receive_on_msg_limited_pref", str, false)) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            r45.k36 k36Var = new r45.k36();
            k36Var.f459874d = "filter_spam_fansmsg";
            k36Var.f459875e = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((jz5.n) this.f175497m).mo141623x754a37bb()).N() ? "0" : "1";
            linkedList.add(k36Var);
            r45.k36 k36Var2 = new r45.k36();
            k36Var2.f459874d = "close_notice_fansmsg";
            k36Var2.f459875e = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((jz5.n) this.f175498n).mo141623x754a37bb()).N() ? "0" : "1";
            linkedList.add(k36Var2);
            r45.k36 k36Var3 = new r45.k36();
            k36Var3.f459874d = "private_msg_scope";
            k36Var3.f459875e = java.lang.String.valueOf(this.f175494g);
            linkedList.add(k36Var3);
            r45.k36 k36Var4 = new r45.k36();
            k36Var4.f459874d = "is_one_msg_before_reply";
            k36Var4.f459875e = X6().N() ? "1" : "0";
            linkedList.add(k36Var4);
            Y6().f466981e = linkedList;
            ku5.u0 u0Var = ku5.t0.f394148d;
            ir1.q1 q1Var = new ir1.q1(this);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(q1Var, 800L, false);
            c7(Y6(), str);
        }
    }

    public final void c7(r45.s26 s26Var, java.lang.String str) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = s26Var;
        lVar.f152198b = new r45.t26();
        lVar.f152199c = "/cgi-bin/mmbiz-bin/mp/setsetting";
        lVar.f152200d = 29575;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(this);
        this.f175504t = true;
        com.p314xaae8f345.mm.p944x882e457a.z2.d(a17, new ir1.z1(c0Var, this, weakReference, str), false);
    }

    public final void d7(int i17) {
        java.lang.String string;
        this.f175494g = i17;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb) this.f175499o.mo141623x754a37bb();
        int i18 = this.f175494g;
        if (i18 == 0) {
            string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.nfr);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        } else if (i18 == 1) {
            string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.nfs);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        } else if (i18 == 2) {
            string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.nft);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        } else if (i18 != 3) {
            string = "";
        } else {
            string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.nfu);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        }
        c21560x1fce98fb.H(string);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        if (this.f175496i) {
            if (!a7() && this.f175493f) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("key_remind_changed", this.f175496i);
                setResult(-1, intent);
            }
            if (a7() && !this.f175493f) {
                if (this.f175491d == 5) {
                    nr1.f Vi = yq1.u0.Vi();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Vi, "getBizPhotoFansConversationStorage(...)");
                    nr1.d dVar = nr1.f.f420673e;
                    rm.d0 d0Var = (rm.d0) i95.n0.c(rm.d0.class);
                    tk.s[] sVarArr = tk.s.f501403d;
                    Vi.y0(jr1.j.c(((ox.r) d0Var).Bi(2).c()));
                } else {
                    hr1.i Di = yq1.u0.Di();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Di, "getBizFansConversationStorage(...)");
                    hr1.i.y0(Di, null, 1, null);
                }
                ((gr1.h) ((gr1.n) ((rk.g) i95.n0.c(rk.g.class))).wi()).b(this.f175491d);
            }
        }
        super.finish();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dzp;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        int intExtra = getIntent().getIntExtra("serviceType", 0);
        this.f175491d = intExtra;
        boolean z17 = intExtra == 5;
        if (!((qv.i) ((rv.q2) i95.n0.c(rv.q2.class))).wi() || z17) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).m("biz_fans_private_msg_scope_pref", true);
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).m("biz_fans_receive_on_msg_limited_pref", true);
        }
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.n5r);
        m78591x7f5d15fd(false);
        mo78530x8b45058f();
        mo54448x9c8c0d33(new ir1.u1(this));
        p3325xe03a0797.p3326xc267989b.l.d(v65.m.b(this), null, null, new ir1.v1(this, null), 3, null);
        W6();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        if (rVar == null) {
            return false;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c21560x1fce98fb);
        java.lang.String str = c21560x1fce98fb.f279313q;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BizFans.BizFansSettingUI", str + " item has been clicked!");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        if (r26.i0.n("biz_fans_private_msg_scope_pref", str, false)) {
            android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.p1290x2c1ddc83.ui.ActivityC12972x45ae6e01.class);
            intent.putExtra("key_ori_scope_type", this.f175494g);
            this.f175503s.a(intent, null);
            return true;
        }
        if (r26.i0.n("biz_fans_msg_hide_disturb_pref", str, false) || r26.i0.n("biz_fans_remind_pref", str, false)) {
            b7(str);
            return true;
        }
        if (!r26.i0.n("biz_fans_receive_on_msg_limited_pref", str, false)) {
            return false;
        }
        if (X6().N()) {
            db5.e1.A(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.nfx), getString(com.p314xaae8f345.mm.R.C30867xcad56011.nfz), getString(com.p314xaae8f345.mm.R.C30867xcad56011.nfy), getString(com.p314xaae8f345.mm.R.C30867xcad56011.nfw), new ir1.f2(this), new ir1.g2(this));
        } else {
            b7(str);
        }
        return true;
    }
}
