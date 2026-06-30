package com.p314xaae8f345.mm.ui;

/* renamed from: com.tencent.mm.ui.AllRemindMsgUI */
/* loaded from: classes8.dex */
public class ActivityC21341x70473b8f extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f278101i = 0;

    /* renamed from: d, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f278102d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ProgressBar f278103e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f278104f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.h0 f278105g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.LinkedList f278106h;

    static {
        new jt0.j(32);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569530dw;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.hy_);
        this.f278102d = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById(com.p314xaae8f345.mm.R.id.f564474sf);
        this.f278103e = (android.widget.ProgressBar) findViewById(com.p314xaae8f345.mm.R.id.lbl);
        this.f278104f = findViewById(com.p314xaae8f345.mm.R.id.h0g);
        this.f278102d.setVisibility(8);
        this.f278102d.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(mo55332x76847179()));
        com.p314xaae8f345.mm.ui.h0 h0Var = new com.p314xaae8f345.mm.ui.h0(this);
        this.f278105g = h0Var;
        this.f278102d.mo7960x6cab2c8d(h0Var);
        this.f278105g.mo8163xed962dec(new com.p314xaae8f345.mm.ui.f0(this));
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.ui.g0(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        finish();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(795L, 3L, 1L, false);
        mo43517x10010bd5();
        ((ku5.t0) ku5.t0.f394148d).h(new java.lang.Runnable() { // from class: com.tencent.mm.ui.AllRemindMsgUI$$a
            @Override // java.lang.Runnable
            public final void run() {
                int i17 = com.p314xaae8f345.mm.ui.ActivityC21341x70473b8f.f278101i;
                final com.p314xaae8f345.mm.ui.ActivityC21341x70473b8f activityC21341x70473b8f = com.p314xaae8f345.mm.ui.ActivityC21341x70473b8f.this;
                p3325xe03a0797.p3326xc267989b.y0 lifecycleScope = activityC21341x70473b8f.getLifecycleAsyncScope();
                yz5.r rVar = new yz5.r() { // from class: com.tencent.mm.ui.AllRemindMsgUI$$b
                    @Override // yz5.r
                    public final java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                        final com.p314xaae8f345.mm.ui.ActivityC21341x70473b8f activityC21341x70473b8f2 = com.p314xaae8f345.mm.ui.ActivityC21341x70473b8f.this;
                        java.lang.Integer num = (java.lang.Integer) obj;
                        java.lang.Integer num2 = (java.lang.Integer) obj2;
                        java.lang.String str = (java.lang.String) obj3;
                        final java.util.LinkedList linkedList = (java.util.LinkedList) obj4;
                        int i18 = com.p314xaae8f345.mm.ui.ActivityC21341x70473b8f.f278101i;
                        activityC21341x70473b8f2.getClass();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.AllRemindMsgUI", "GetRemindCgi callback, errType: s, errCode: %s, errMsg: %s", num, num2, str);
                        if (num.intValue() == 0 && num2.intValue() == 0) {
                            ((ku5.t0) ku5.t0.f394148d).h(new java.lang.Runnable() { // from class: com.tencent.mm.ui.AllRemindMsgUI$$c
                                @Override // java.lang.Runnable
                                public final void run() {
                                    final com.p314xaae8f345.mm.ui.ActivityC21341x70473b8f activityC21341x70473b8f3 = com.p314xaae8f345.mm.ui.ActivityC21341x70473b8f.this;
                                    java.util.LinkedList linkedList2 = linkedList;
                                    int i19 = com.p314xaae8f345.mm.ui.ActivityC21341x70473b8f.f278101i;
                                    activityC21341x70473b8f3.getClass();
                                    java.util.LinkedList linkedList3 = new java.util.LinkedList();
                                    if (linkedList2 != null) {
                                        java.util.Iterator it = linkedList2.iterator();
                                        while (it.hasNext()) {
                                            r45.lo5 lo5Var = (r45.lo5) it.next();
                                            com.p314xaae8f345.mm.ui.o0 o0Var = new com.p314xaae8f345.mm.ui.o0(activityC21341x70473b8f3);
                                            o0Var.f290975i = lo5Var;
                                            o0Var.f290970d = lo5Var.f461210f * 1000;
                                            int i27 = lo5Var.f461211g;
                                            o0Var.f290971e = i27;
                                            o0Var.f290976j = lo5Var.f461208d;
                                            if (i27 == 1) {
                                                r45.wq4 wq4Var = new r45.wq4();
                                                try {
                                                    wq4Var.mo11468x92b714fd(lo5Var.f461212h.f273689a);
                                                } catch (java.io.IOException e17) {
                                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.AllRemindMsgUI", "GetRemindCgi callback, %s", e17.toString());
                                                }
                                                o0Var.f290969c = wq4Var.f470921d;
                                                java.lang.String str2 = wq4Var.f470923f;
                                                o0Var.f290967a = str2;
                                                o0Var.f290972f = wq4Var.f470924g;
                                                if (str2 != null) {
                                                    if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str2)) {
                                                        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(o0Var.f290967a, true);
                                                        if (n17 != null) {
                                                            o0Var.f290968b = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17.w0()) ? n17.P0() : n17.w0();
                                                        }
                                                        o0Var.f290968b = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(o0Var.f290968b) ? activityC21341x70473b8f3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b5v) : o0Var.f290968b;
                                                    } else {
                                                        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(o0Var.f290967a, true);
                                                        o0Var.f290968b = n18.g2() == null ? n18.f2() : n18.g2();
                                                    }
                                                }
                                            } else if (i27 == 2) {
                                                r45.cq0 cq0Var = new r45.cq0();
                                                try {
                                                    cq0Var.mo11468x92b714fd(lo5Var.f461212h.f273689a);
                                                } catch (java.io.IOException e18) {
                                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.AllRemindMsgUI", "GetRemindCgi callback, %s", e18.toString());
                                                }
                                                o0Var.f290969c = cq0Var.f453313d;
                                                o0Var.f290973g = cq0Var.f453315f;
                                                o0Var.f290974h = cq0Var.f453316g;
                                            }
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.AllRemindMsgUI", "GetRemindCgi callback, getRemind:%s", o0Var);
                                            linkedList3.add(o0Var);
                                        }
                                        activityC21341x70473b8f3.f278106h = linkedList3;
                                    }
                                    ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: com.tencent.mm.ui.AllRemindMsgUI$$d
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            com.p314xaae8f345.mm.ui.ActivityC21341x70473b8f activityC21341x70473b8f4 = com.p314xaae8f345.mm.ui.ActivityC21341x70473b8f.this;
                                            activityC21341x70473b8f4.f278102d.setVisibility(0);
                                            activityC21341x70473b8f4.f278103e.setVisibility(8);
                                            activityC21341x70473b8f4.f278105g.m8146xced61ae5();
                                        }
                                    });
                                }
                            }, "MicroMsg.emoji.AllRemindMsgUIGetRemindCgi");
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.AllRemindMsgUI", "GetRemindCgi callback, errType: %s, errCode: %s, errMsg: %s", num, num2, str);
                            activityC21341x70473b8f2.f278102d.setVisibility(0);
                            activityC21341x70473b8f2.f278103e.setVisibility(8);
                        }
                        return jz5.f0.f384359a;
                    }
                };
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lifecycleScope, "lifecycleScope");
                p3325xe03a0797.p3326xc267989b.l.d(lifecycleScope, null, null, new com.p314xaae8f345.mm.p957x53236a1b.w(rVar, null), 3, null);
            }
        }, "load remind data!");
    }
}
