package com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/brandservice/ui/timeline/BizTimeLineSettingUI;", "Lcom/tencent/mm/ui/base/preference/MMPreference;", "<init>", "()V", "plugin-brandservice_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineSettingUI */
/* loaded from: classes9.dex */
public final class ActivityC13008x3fe6d8d0 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f175618p = 0;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f175619d = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.v3(this));

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f175620e = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.n3(this));

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f175621f = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.u3(this));

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f175622g;

    /* renamed from: h, reason: collision with root package name */
    public final r45.x26 f175623h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.g5 f175624i;

    /* renamed from: m, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.r2 f175625m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f175626n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f175627o;

    public ActivityC13008x3fe6d8d0() {
        jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.k3(this));
        this.f175622g = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.l3(this));
        jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.s3(this));
        this.f175623h = new r45.x26();
        this.f175624i = com.p314xaae8f345.p3133xd0ce8b26.mm.biz.g5.kDefault;
        this.f175625m = p3325xe03a0797.p3326xc267989b.l.d(v65.m.b(this), null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p3(this, null), 3, null);
    }

    public static final void V6(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.ActivityC13008x3fe6d8d0 activityC13008x3fe6d8d0) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = activityC13008x3fe6d8d0.f175627o;
        if (u3Var != null) {
            u3Var.dismiss();
            activityC13008x3fe6d8d0.f175627o = null;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q = db5.e1.Q(activityC13008x3fe6d8d0, null, activityC13008x3fe6d8d0.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, false, com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.z3.f176086d);
        activityC13008x3fe6d8d0.f175627o = Q;
        if (Q != null) {
            Q.setOnCancelListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.a4(activityC13008x3fe6d8d0));
        }
    }

    public final com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe W6() {
        return (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((jz5.n) this.f175619d).mo141623x754a37bb();
    }

    public final void X6() {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.hp3();
        lVar.f152198b = new r45.ip3();
        lVar.f152199c = "/cgi-bin/mmbiz-bin/timeline/gettimelinesetting";
        lVar.f152200d = 4758;
        com.p314xaae8f345.mm.p944x882e457a.z2.d(lVar.a(), new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.q3(new p3321xbce91901.jvm.p3324x21ffc6bd.c0(), new java.lang.ref.WeakReference(this)), false);
    }

    public final void Y6(r45.x26 req, java.lang.String key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(req, "req");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizTimeLineSettingUI", "setTimelineSetting personalized_recommend_setting = " + req.f471233d, "pay for head = " + req.f471234e);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = req;
        lVar.f152198b = new r45.y26();
        lVar.f152199c = "/cgi-bin/mmbiz-bin/timeline/settimelinesetting";
        lVar.f152200d = 1460;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(this);
        this.f175626n = true;
        com.p314xaae8f345.mm.p944x882e457a.z2.d(a17, new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.w3(c0Var, this, weakReference, key, req), false);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        android.content.Intent intent = getIntent();
        intent.putExtra("personalizedOperation", this.f175624i.f299625d);
        setResult(-1, intent);
        super.finish();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569759nk;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.f572088ye);
        m78591x7f5d15fd(false);
        mo78530x8b45058f();
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.r3(this));
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r m79336x8b97809d = m79336x8b97809d();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m79336x8b97809d);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d).m("biz_msg_rec_pref", true);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r m79336x8b97809d2 = m79336x8b97809d();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m79336x8b97809d2);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d2).m("biz_msg_finder_rec_pref", true);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r m79336x8b97809d3 = m79336x8b97809d();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m79336x8b97809d3);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d3).m("biz_msg_pay_for_head_pref", true);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r m79336x8b97809d4 = m79336x8b97809d();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m79336x8b97809d4);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d4).m("biz_msg_rec_loading_pref", true);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r m79336x8b97809d5 = m79336x8b97809d();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m79336x8b97809d5);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d5).m("biz_msg_read_dot_switch", true);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r m79336x8b97809d6 = m79336x8b97809d();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m79336x8b97809d6);
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d6).m("biz_msg_my_my_biz_setting_title", true);
        p3325xe03a0797.p3326xc267989b.l.d(v65.m.b(this), null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.t3(this, null), 3, null);
        X6();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        if (rVar == null) {
            return false;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c21560x1fce98fb);
        java.lang.String str = c21560x1fce98fb.f279313q;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizTimeLineSettingUI", str + " item has been clicked!");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        if (r26.i0.n("biz_msg_rec_pref", str, false) || r26.i0.n("biz_msg_pay_for_head_pref", str, false) || r26.i0.n("biz_msg_read_dot_switch", str, false) || r26.i0.n("biz_msg_finder_rec_pref", str, false)) {
            this.f175623h.f471233d = W6().N();
            this.f175623h.f471237h = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((jz5.n) this.f175620e).mo141623x754a37bb()).N() ? 1 : 2;
            this.f175623h.f471234e = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((jz5.n) this.f175621f).mo141623x754a37bb()).N();
            this.f175623h.f471236g = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) ((jz5.n) this.f175622g).mo141623x754a37bb()).N() ? 1 : 2;
            if (r26.i0.n("biz_msg_rec_pref", str, false)) {
                com.p314xaae8f345.p3133xd0ce8b26.mm.biz.g5 g5Var = this.f175624i;
                com.p314xaae8f345.p3133xd0ce8b26.mm.biz.g5 g5Var2 = com.p314xaae8f345.p3133xd0ce8b26.mm.biz.g5.kDefault;
                if (g5Var != g5Var2) {
                    this.f175624i = g5Var2;
                } else if (W6().N()) {
                    this.f175624i = com.p314xaae8f345.p3133xd0ce8b26.mm.biz.g5.kOpen;
                } else {
                    this.f175624i = com.p314xaae8f345.p3133xd0ce8b26.mm.biz.g5.kClose;
                }
            }
            ku5.u0 u0Var = ku5.t0.f394148d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.m3 m3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.m3(this);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(m3Var, 800L, false);
            Y6(this.f175623h, str);
        }
        return false;
    }
}
