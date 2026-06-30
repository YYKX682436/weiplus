package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

@yn.c(m177365x976763e5 = sb5.x0.class)
/* loaded from: classes11.dex */
public class le extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a implements sb5.x0 {
    public static final java.lang.Long G = 604800000L;
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d D;
    public final android.view.View.OnClickListener E;
    public final java.lang.Runnable F;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f280946e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.LinearLayout f280947f;

    /* renamed from: g, reason: collision with root package name */
    public p012xc85e97e9.p075x2eaf9f.p079xd1075a44.C1095x65355f89 f280948g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.LinearLayout f280949h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.LinearLayout f280950i;

    /* renamed from: m, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f280951m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.LinearLayout f280952n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.LinearLayout f280953o;

    /* renamed from: p, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f280954p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.RelativeLayout f280955q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.ImageView f280956r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f280957s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.g0 f280958t;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ke f280960v;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ke f280961w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.Thread f280962x;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f280959u = null;

    /* renamed from: y, reason: collision with root package name */
    public rn.h f280963y = null;

    /* renamed from: z, reason: collision with root package name */
    public final java.util.ArrayList f280964z = new java.util.ArrayList();
    public boolean A = false;
    public final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ee B = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.wd(this);
    public final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ee C = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.xd(this);

    public le() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.D = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5760x1e77eb5>(a0Var) { // from class: com.tencent.mm.ui.chatting.component.GroupToolsComponet$3
            {
                this.f39173x3fe91575 = -1721696603;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5760x1e77eb5 c5760x1e77eb5) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5760x1e77eb5 c5760x1e77eb52 = c5760x1e77eb5;
                if (c5760x1e77eb52 != null) {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    am.rl rlVar = c5760x1e77eb52.f136079g;
                    java.lang.String str = rlVar.f89358a;
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    if (str == null) {
                        str = "";
                    }
                    objArr[0] = str;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.roomtools.GroupToolsComponet", "NotifyGroupToolsEvent %s", objArr);
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.le leVar = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.le.this;
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(leVar.f280113d.x(), rlVar.f89358a)) {
                        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.g0 g0Var = leVar.f280958t;
                        if (g0Var != null) {
                            g0Var.b();
                        }
                        leVar.q0(true);
                    }
                }
                return true;
            }
        };
        this.E = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.yd(this);
        this.F = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.sd(this);
    }

    public static void m0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.le leVar) {
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.n4(leVar.f280113d.x())) {
            db5.e1.E(leVar.f280113d.g(), leVar.f280113d.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ftc), "", leVar.f280113d.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.l_e), false, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.td(leVar));
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(leVar.f280113d.g(), "com.tencent.mm.plugin.aa.ui.LaunchAAUI");
        intent.putExtra("enter_scene", 7);
        intent.putExtra("chatroom_name", leVar.f280113d.x());
        android.app.Activity g17 = leVar.f280113d.g();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(g17, arrayList.toArray(), "com/tencent/mm/ui/chatting/component/GroupToolsComponet", "gotoAAPay", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        g17.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(g17, "com/tencent/mm/ui/chatting/component/GroupToolsComponet", "gotoAAPay", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public static void n0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.le leVar) {
        leVar.getClass();
        if (((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.roomtools.GroupToolsComponet", "exit in teen mode");
            ((uh4.c0) i95.n0.c(uh4.c0.class)).O8(leVar.f280113d.g());
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.roomtools.GroupToolsComponet", "gotoRoomLiveEntrance");
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        android.app.Activity g17 = leVar.f280113d.g();
        ((sb0.f) jVar).getClass();
        boolean a17 = j35.u.a(g17, "android.permission.CAMERA", 25, "", "");
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(a17);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.roomtools.GroupToolsComponet", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", valueOf, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3(), leVar.f280113d.g());
        if (a17) {
            tb0.j jVar2 = (tb0.j) i95.n0.c(tb0.j.class);
            android.app.Activity g18 = leVar.f280113d.g();
            ((sb0.f) jVar2).getClass();
            boolean a18 = j35.u.a(g18, "android.permission.RECORD_AUDIO", 25, "", "");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.roomtools.GroupToolsComponet", "summerper checkPermission checkmicrophone[%b], stack[%s], activity[%s]", java.lang.Boolean.valueOf(a18), new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3(), leVar.f280113d.g());
            if (!a18 || iq.b.g(leVar.f280113d.g()) || iq.b.C(leVar.f280113d.g()) || iq.b.v(leVar.f280113d.g()) || iq.b.e(leVar.f280113d.g()) || gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LIVE_MODE_INT_SYNC, 0) != 1) {
                return;
            }
            android.app.Activity g19 = leVar.f280113d.g();
            android.view.LayoutInflater.from(g19);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) g19, 1, false);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            new java.util.ArrayList();
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ud udVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ud(leVar, g19);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.vd vdVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.vd(leVar);
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                db5.h4 h4Var = (db5.h4) ((android.view.MenuItem) it.next());
                h4Var.f309914y = null;
                h4Var.f309915z = null;
            }
            arrayList.clear();
            db5.g4 g4Var = new db5.g4(g19);
            udVar.mo887xc459429a(g4Var);
            if (g4Var.z()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMSubMenuHelper", "show, menu empty");
                return;
            }
            k0Var.f293405n = udVar;
            k0Var.f293414s = vdVar;
            k0Var.f293387d = null;
            k0Var.G = null;
            k0Var.v();
        }
    }

    public static void o0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.le leVar, com.p314xaae8f345.mm.p648x55baa833.p651x8fb0427b.C10329x6f52684a c10329x6f52684a, java.lang.String str, boolean z17) {
        leVar.getClass();
        l81.b1 b1Var = new l81.b1();
        b1Var.f398545a = c10329x6f52684a.f145215d;
        if (z17) {
            b1Var.f398555f = c10329x6f52684a.f145216e;
        } else {
            b1Var.f398555f = "";
        }
        b1Var.f398565k = me1.a.f72878x366c91de;
        b1Var.f398575t = leVar.f280113d.x();
        b1Var.f398576u = leVar.f280113d.x();
        b1Var.f398567l = str;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).bj(leVar.f280113d.g(), b1Var);
    }

    public static void p0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.le leVar, com.p314xaae8f345.mm.p648x55baa833.p651x8fb0427b.C10329x6f52684a c10329x6f52684a, boolean z17) {
        java.lang.String str;
        leVar.getClass();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(c10329x6f52684a.f145215d, "roomaa@app.origin")) {
            str = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ftd);
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(c10329x6f52684a.f145215d, "roomlive@app.origin")) {
            str = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571934ty);
        } else {
            k91.v5 Bi = ((k91.g4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6.class))).Bi(c10329x6f52684a.f145215d);
            str = Bi == null ? "" : Bi.f68913x21f9b213;
        }
        java.lang.String x17 = leVar.f280113d.x();
        java.lang.String str2 = c10329x6f52684a.f145215d;
        int i17 = c01.e2.T(x17) ? 2 : c01.e2.V(x17) ? 1 : 0;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6371xedfe754e c6371xedfe754e = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6371xedfe754e();
        c6371xedfe754e.f137186d = c6371xedfe754e.b("roomusrname", x17, true);
        c6371xedfe754e.f137187e = 2L;
        c6371xedfe754e.f137190h = i17;
        c6371xedfe754e.f137191i = c6371xedfe754e.b("appid", str2, true);
        c6371xedfe754e.f137192j = c6371xedfe754e.b("appname", str, true);
        c6371xedfe754e.f137193k = z17 ? 1L : 0L;
        c6371xedfe754e.k();
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void E() {
        java.lang.String x17 = this.f280113d.x();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(x17)) {
            this.A = false;
        } else if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.N4(x17) && c01.e2.V(x17)) {
            this.A = true;
        } else {
            this.A = false;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.hg
    public void I() {
        super.I();
        android.view.View view = this.f280946e;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/component/GroupToolsComponet", "reset", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/chatting/component/GroupToolsComponet", "reset", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void K() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.roomtools.GroupToolsComponet", "onChattingExitAnimStart");
        this.D.mo48814x2efc64();
    }

    public final void q0(boolean z17) {
        rn.h y07 = ((nn.j) i95.n0.c(nn.j.class)).Di().y0(this.f280113d.x());
        this.f280963y = y07;
        if (y07 == null) {
            rn.h hVar = new rn.h();
            hVar.f66385x37548063 = this.f280113d.x();
            boolean mo880xb970c2b9 = ((nn.j) i95.n0.c(nn.j.class)).Di().mo880xb970c2b9(hVar);
            if (mo880xb970c2b9) {
                this.f280963y = ((nn.j) i95.n0.c(nn.j.class)).Di().y0(this.f280113d.x());
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.roomtools.GroupToolsComponet", "getGroupTools insert GroupTools: result(%s)", java.lang.Boolean.valueOf(mo880xb970c2b9));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.roomtools.GroupToolsComponet", "getGroupTools start:%s queryRecentUse:%s state:%s", this.f280113d.x(), java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(this.f280963y.f66386xae782d0e));
        if (z17) {
            if (this.f280963y.f66386xae782d0e == 1) {
                java.util.ArrayList arrayList = this.f280964z;
                arrayList.clear();
                arrayList.addAll(this.f280963y.f479138u);
                java.util.Collections.sort(arrayList, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.nd(this));
                r0();
                return;
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.od(this), 5000L);
            java.lang.Thread thread = new java.lang.Thread(this.F);
            this.f280962x = thread;
            thread.start();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pd(this), 200L);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0386 A[LOOP:0: B:52:0x037d->B:54:0x0386, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x03a4 A[LOOP:1: B:57:0x039e->B:59:0x03a4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r0() {
        /*
            Method dump skipped, instructions count: 1040
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.le.r0():void");
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void x() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.roomtools.GroupToolsComponet", "onChattingResume");
        this.D.mo48814x2efc64();
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void y() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.roomtools.GroupToolsComponet", "onChattingPause");
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void z() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.roomtools.GroupToolsComponet", "onChattingEnterAnimStart: user %s hashCode:%s", this.f280113d.x(), java.lang.Integer.valueOf(hashCode()));
    }
}
