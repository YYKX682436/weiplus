package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

@db5.a(m123858x6ac9171 = 3)
/* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallTalkUI */
/* loaded from: classes14.dex */
public class ActivityC16150x8f474cc5 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.k6 {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f224244p = 0;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f224245d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f224246e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f224247f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f224248g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f224249h;

    /* renamed from: i, reason: collision with root package name */
    public int f224250i;

    /* renamed from: m, reason: collision with root package name */
    public int f224251m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.l6 f224252n;

    /* renamed from: o, reason: collision with root package name */
    public iq4.d f224253o;

    public final void T6() {
        int i17;
        java.lang.String str;
        int i18;
        java.lang.String str2;
        boolean z17;
        long j17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r Bi = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Bi();
        if (Bi.f224039g == null) {
            Bi.f224039g = new l83.d();
        }
        l83.d dVar = Bi.f224039g;
        if (!dVar.f398630c) {
            dVar.f398629b = new j83.b();
            dVar.f398630c = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.l6 l6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.l6(this);
        this.f224252n = l6Var;
        l6Var.f224460z = this;
        java.lang.String str3 = this.f224245d;
        java.lang.String str4 = this.f224246e;
        java.lang.String str5 = this.f224247f;
        java.lang.String str6 = this.f224248g;
        java.lang.String str7 = this.f224249h;
        int i19 = this.f224250i;
        int i27 = this.f224251m;
        boolean booleanExtra = l6Var.f224457w.getIntent().getBooleanExtra("IPCallTalkUI_isFromMiniNotification", false);
        l6Var.C = booleanExtra;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TalkUIController", "onCreate, mNickname: %s, mPhoneNumber: %s, mContactId: %s, mCountryCode: %s, toUsername: %s, isFromMinimize: %b", str3, str4, str5, str6, str7, java.lang.Boolean.valueOf(booleanExtra));
        l6Var.f224438d = (android.widget.ImageView) l6Var.f224457w.findViewById(com.p314xaae8f345.mm.R.id.f568756ny3);
        l6Var.f224439e = (android.widget.ImageView) l6Var.f224457w.findViewById(com.p314xaae8f345.mm.R.id.f568754ny1);
        l6Var.f224435a = (android.widget.EditText) l6Var.f224457w.findViewById(com.p314xaae8f345.mm.R.id.ny8);
        l6Var.f224437c = (android.widget.TextView) l6Var.f224457w.findViewById(com.p314xaae8f345.mm.R.id.nya);
        l6Var.f224436b = (android.widget.TextView) l6Var.f224457w.findViewById(com.p314xaae8f345.mm.R.id.ny9);
        l6Var.f224440f = (com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.C16138x11b4d11b) l6Var.f224457w.findViewById(com.p314xaae8f345.mm.R.id.ny7);
        l6Var.f224441g = (com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.C16138x11b4d11b) l6Var.f224457w.findViewById(com.p314xaae8f345.mm.R.id.f568757ny4);
        l6Var.f224442h = (com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.C16138x11b4d11b) l6Var.f224457w.findViewById(com.p314xaae8f345.mm.R.id.ny_);
        l6Var.f224443i = (android.widget.ImageButton) l6Var.f224457w.findViewById(com.p314xaae8f345.mm.R.id.ny6);
        l6Var.f224447m = (android.widget.ImageButton) l6Var.f224457w.findViewById(com.p314xaae8f345.mm.R.id.hgp);
        l6Var.f224445k = (android.widget.TextView) l6Var.f224457w.findViewById(com.p314xaae8f345.mm.R.id.f569155p80);
        l6Var.f224446l = l6Var.f224457w.findViewById(com.p314xaae8f345.mm.R.id.f569156p81);
        l6Var.f224444j = (com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ViewOnClickListenerC16124xc5ddcee3) l6Var.f224457w.findViewById(com.p314xaae8f345.mm.R.id.cyt);
        if (l6Var.C) {
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.cj().f224031u != null) {
                l6Var.f224448n = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.cj().f224031u.F;
                l6Var.f224454t = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.cj().f224031u.f386430J;
                l6Var.f224453s = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.cj().f224031u.I;
                l6Var.f224451q = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.cj().f224031u.H;
                l6Var.f224449o = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.cj().f224031u.G;
                int i28 = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.cj().f224031u.L;
                l6Var.f224450p = i28;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TalkUIController", "restoreParam nickname:%s,fianlPhoneNumber:%s,toUserName:%s,contactId:%s,phoneNumber:%s,phoneType:%d", l6Var.f224448n, l6Var.f224454t, l6Var.f224453s, l6Var.f224451q, l6Var.f224449o, java.lang.Integer.valueOf(i28));
            }
            l6Var.a();
            l6Var.c();
            com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.bj();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TalkUIController", com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.m.e(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.bj().f224015a));
            l6Var.g(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.bj().f224015a);
            java.lang.String str8 = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.cj().f224031u.f386430J;
            java.lang.String str9 = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.cj().f224031u.K;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str9)) {
                l6Var.h(str9);
                l6Var.f224436b.setText(t83.c.c(str9));
            } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str8)) {
                l6Var.h(str8);
                l6Var.f224436b.setText(t83.c.c(str8));
            }
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.bj().b()) {
                l6Var.f224442h.m65181xdd7d58e5(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Di().f398629b.n());
                l6Var.f224440f.m65181xdd7d58e5(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Di().f398629b.f379695m.f398640d);
            }
        } else if (com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.bj().d()) {
            db5.e1.o(l6Var.f224457w, com.p314xaae8f345.mm.R.C30867xcad56011.g19, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv, false, new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.b6(l6Var));
        } else {
            l6Var.a();
            l6Var.f224448n = str3;
            l6Var.f224449o = str4;
            l6Var.f224451q = str5;
            l6Var.f224452r = str6;
            l6Var.f224455u = i19;
            l6Var.f224456v = i27;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
                l6Var.f224449o = t83.f.i(l6Var.f224449o);
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(l6Var.f224452r)) {
                if (t83.c.m(l6Var.f224449o)) {
                    java.lang.String a17 = t83.c.a(l6Var.f224449o);
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17)) {
                        l6Var.f224449o = t83.c.o(l6Var.f224449o);
                        l6Var.f224452r = t83.f.f();
                    } else {
                        l6Var.f224449o = t83.c.b(l6Var.f224449o);
                        l6Var.f224452r = a17;
                    }
                } else {
                    l6Var.f224452r = t83.f.f();
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TalkUIController", "final mCountryCode: %s", l6Var.f224452r);
            com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.j a18 = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.j.a();
            java.lang.String str10 = l6Var.f224452r;
            if (!a18.f224006c) {
                a18.b(false);
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str10)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Ui().y0(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str10.replace("+", ""), 0), java.lang.System.currentTimeMillis());
                a18.d();
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(l6Var.f224448n)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16150x8f474cc5 activityC16150x8f474cc5 = l6Var.f224457w;
                java.lang.String e17 = t83.c.e(activityC16150x8f474cc5, l6Var.f224449o);
                l6Var.f224448n = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e17) ? o25.b.c(e17, activityC16150x8f474cc5) : null;
            }
            l6Var.f224453s = str7;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(l6Var.f224452r) || t83.c.m(l6Var.f224449o)) {
                l6Var.f224454t = l6Var.f224449o;
            } else {
                java.lang.String str11 = l6Var.f224452r + l6Var.f224449o;
                l6Var.f224454t = str11;
                if (!str11.startsWith("+")) {
                    l6Var.f224454t = "+" + l6Var.f224454t;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TalkUIController", "final call mPhoneNumber: %s", l6Var.f224454t);
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.j.a().e(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(l6Var.f224452r, -1))) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(12058, l6Var.f224452r);
                com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16150x8f474cc5 activityC16150x8f474cc52 = l6Var.f224457w;
                db5.e1.G(activityC16150x8f474cc52, activityC16150x8f474cc52.getString(com.p314xaae8f345.mm.R.C30867xcad56011.apz), l6Var.f224457w.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572305aq0), false, new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.d6(l6Var));
            } else if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40088x550b09c5(l6Var.f224457w)) {
                long j18 = l6Var.f224457w.getSharedPreferences("IPCall_LastInputPref", 0).getLong("IPCall_LastInvite", -1L);
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                if (j18 <= currentTimeMillis || j18 == -1) {
                    l6Var.c();
                    if (!l6Var.C || !com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.bj().d()) {
                        java.lang.String str12 = l6Var.f224451q;
                        java.lang.String str13 = l6Var.f224449o;
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.c5 c5Var = t83.c.f497944a;
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str12) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str13)) {
                            i17 = -1;
                        } else {
                            i17 = t83.c.i(str12, str13);
                            if (i17 == -1 && str13.startsWith("+")) {
                                java.lang.String a19 = t83.c.a(str13);
                                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a19)) {
                                    str13 = str13.substring(("+" + a19).length());
                                }
                                i17 = t83.c.i(str12, str13);
                            }
                        }
                        l6Var.f224450p = i17;
                        l6Var.g(1);
                        java.lang.String str14 = l6Var.f224448n;
                        java.lang.String str15 = l6Var.f224449o;
                        java.lang.String str16 = l6Var.f224453s;
                        java.lang.String str17 = l6Var.f224454t;
                        java.lang.String str18 = l6Var.f224451q;
                        int i29 = l6Var.f224450p;
                        int i37 = l6Var.f224455u;
                        int i38 = l6Var.f224456v;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.j jVar = l6Var.f224459y;
                        jVar.getClass();
                        if (com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.bj().d()) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallManager", "startIPCall, already start!");
                            str = "MicroMsg.TalkUIController";
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallManager", "startIPCall");
                            com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.cj().f224022i = jVar;
                            com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Ni().f406255f = jVar;
                            com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.bj().f224015a = -1;
                            com.p314xaae8f345.mm.sdk.p2603x2137b148.l5 l5Var = (com.p314xaae8f345.mm.sdk.p2603x2137b148.l5) i95.n0.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.l5.class);
                            com.p314xaae8f345.mm.sdk.p2603x2137b148.h5 h5Var = jVar.f223982i;
                            l5Var.Di(h5Var);
                            com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = jVar.f223984n;
                            abstractC20980x9b9ad01d.mo48814x2efc64();
                            str = "MicroMsg.TalkUIController";
                            com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d2 = jVar.f223983m;
                            abstractC20980x9b9ad01d2.mo48814x2efc64();
                            ((com.p314xaae8f345.mm.sdk.p2603x2137b148.l5) i95.n0.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.l5.class)).wi(h5Var);
                            abstractC20980x9b9ad01d.mo48813x58998cd();
                            abstractC20980x9b9ad01d2.mo48813x58998cd();
                            s83.l lVar = new s83.l();
                            lVar.f68176x5b3f2672 = str17;
                            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str18)) {
                                i18 = i38;
                                str2 = "MicroMsg.IPCallManager";
                                lVar.f68172xcebea32a = -1L;
                            } else {
                                s83.c D0 = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.wi().D0(str18);
                                if (D0 != null) {
                                    str2 = "MicroMsg.IPCallManager";
                                    long j19 = D0.f72763xa3c65b86;
                                    i18 = i38;
                                    j17 = -1;
                                    if (j19 != -1) {
                                        lVar.f68172xcebea32a = j19;
                                    }
                                } else {
                                    i18 = i38;
                                    str2 = "MicroMsg.IPCallManager";
                                    j17 = -1;
                                }
                                lVar.f68172xcebea32a = j17;
                            }
                            if (i29 != -1) {
                                lVar.f68175x5d4904c3 = i29;
                            } else {
                                lVar.f68175x5d4904c3 = -1;
                            }
                            lVar.f68173x138777d0 = java.lang.System.currentTimeMillis();
                            lVar.f68177x10a0fed7 = 1;
                            jVar.f223978e = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Vi().mo880xb970c2b9(lVar) ? lVar : null;
                            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.j.f223976u;
                            n3Var.mo50297x7c4d7ca2(jVar.f223986p, 1754L);
                            jVar.f223979f = false;
                            m83.d Zi = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Zi();
                            Zi.f406256a = 0;
                            Zi.f406257b = 0;
                            Zi.f406258c = 0;
                            Zi.f406259d = 0;
                            Zi.f406260e = 0;
                            Zi.f406261f = 0L;
                            Zi.f406262g = 0L;
                            Zi.f406263h = 0;
                            Zi.f406264i = 0L;
                            Zi.f406265j = 0;
                            Zi.f406267l = 0;
                            Zi.f406268m = 0L;
                            Zi.f406269n = 0L;
                            Zi.f406270o = "";
                            Zi.f406271p = 0;
                            Zi.f406272q = "";
                            Zi.f406274s = 0L;
                            Zi.f406273r = 0L;
                            Zi.f406275t = 0L;
                            Zi.f406276u = 0L;
                            Zi.f406277v = 0L;
                            Zi.A = 0L;
                            Zi.f406281z = 0L;
                            Zi.f406278w = "";
                            Zi.f406279x = "";
                            Zi.B = "";
                            Zi.C = 0L;
                            Zi.D = 0;
                            Zi.E = 0;
                            Zi.F = 0;
                            Zi.G = 0;
                            com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.bj().f224015a = -1;
                            com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.p cj6 = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.cj();
                            cj6.f224033w = false;
                            cj6.f224032v = false;
                            cj6.f224017d = 0;
                            cj6.f224018e = 0;
                            cj6.f224019f = 0;
                            cj6.f224020g = false;
                            cj6.f224021h = false;
                            cj6.f224034x = false;
                            k83.g gVar = new k83.g();
                            cj6.f224031u = gVar;
                            gVar.F = str14;
                            gVar.G = str15;
                            gVar.H = str18;
                            gVar.f386430J = str17;
                            gVar.I = str16;
                            gVar.f386434d = (int) java.lang.System.currentTimeMillis();
                            k83.g gVar2 = cj6.f224031u;
                            gVar2.f386435e = i37;
                            gVar2.f386436f = i18;
                            gVar2.L = i29;
                            cj6.f224023m.j(gVar2);
                            cj6.f224028r.j(cj6.f224031u);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallSvrLogic", "startIPCallInternal, inviteId: %d", java.lang.Integer.valueOf(cj6.f224031u.f386434d));
                            com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.bj().f(1);
                            m83.c Ni = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Ni();
                            if (!Ni.f406254e) {
                                Ni.f406253d = false;
                                Ni.f406252c = false;
                                Ni.f406254e = false;
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallEngineManager", "start engine");
                                com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.C18912x54425f62 c18912x54425f62 = Ni.f406250a;
                                if (c18912x54425f62.Q1) {
                                    c18912x54425f62.A(false);
                                    c18912x54425f62.B();
                                }
                                c18912x54425f62.f258407p = 1;
                                java.lang.System.currentTimeMillis();
                                int e18 = vq4.d0.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                                c18912x54425f62.f258380g = e18;
                                if (e18 == 5 || e18 == 6 || e18 == 7) {
                                    c18912x54425f62.f258380g = 4;
                                }
                                int[] iArr = new int[c18912x54425f62.f258374e * c18912x54425f62.f258377f];
                                c18912x54425f62.f258383h = gm0.j1.b().h();
                                int a27 = wo.r.a();
                                int i39 = android.os.Build.VERSION.SDK_INT;
                                int c17 = com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.C18924x4c862f65.c();
                                android.view.Display defaultDisplay = ((android.view.WindowManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("window")).getDefaultDisplay();
                                int width = defaultDisplay.getWidth();
                                int height = defaultDisplay.getHeight();
                                int i47 = c17 != 1 ? 1 : 4;
                                int m72830x316510 = c18912x54425f62.m72830x316510(c18912x54425f62.f258380g, 65538, (c18912x54425f62.f258374e << 16) | c18912x54425f62.f258377f, height | (width << 16), c18912x54425f62.f258383h, a27 | (i39 << 16) | (c17 << 24), lp0.b.X() + "lib/", 4, 0L, 0, 0, i47);
                                vq4.d0.a("MicroMsg.Voip", "protocalInitForPstn protocal init ret :" + m72830x316510 + ",uin= " + c18912x54425f62.f258383h + ", groupRsCap = 0, x_vcodec2_paras = 0, outfmt = " + i47);
                                c18912x54425f62.Q1 = true;
                                if (m72830x316510 < 0) {
                                    c18912x54425f62.B();
                                }
                                java.lang.System.currentTimeMillis();
                                byte[] bArr = c18912x54425f62.f38612x956ecd5b;
                                if (bArr != null && c18912x54425f62.m72803x394342ef(bArr, bArr.length) < 0) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.IPCallEngineManager", "exchangeCabInfo failed");
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Zi().f406265j = 24;
                                }
                                if (m72830x316510 < 0) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.IPCallEngineManager", "engine init failed!");
                                }
                                c18912x54425f62.f258407p = 1;
                                Ni.f406254e = true;
                            }
                            java.lang.Runnable runnable = jVar.f223985o;
                            n3Var.mo50300x3fa464aa(runnable);
                            n3Var.mo50297x7c4d7ca2(runnable, 60000L);
                            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c(str2, "bindIPCallForegroundIfNeed", new java.lang.Object[0]);
                            if (fp.h.c(26) && !jVar.f223980g) {
                                android.content.Intent intent = new android.content.Intent();
                                intent.setClass(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.ServiceC16121xac04f64d.class);
                                try {
                                    com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.startService(intent);
                                    z17 = true;
                                } catch (java.lang.Exception e19) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str2, e19, "using start service to bindIPCallForegroundIfNeed error: %s", e19.getMessage());
                                    try {
                                        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.startForegroundService(intent);
                                    } catch (java.lang.Exception e27) {
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str2, e27, "using start foreground service to bindIPCallForegroundIfNeed error: %s", e27.getMessage());
                                    }
                                    z17 = false;
                                }
                                if (z17) {
                                    jVar.f223980g = true;
                                }
                            }
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "startLaunchTalk, callNumber: %s", l6Var.f224454t);
                        m83.d Zi2 = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Zi();
                        java.lang.String str19 = l6Var.f224452r;
                        Zi2.getClass();
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str19)) {
                            Zi2.B = str19;
                        }
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TalkUIController", "onDisasterHappen");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16150x8f474cc5 activityC16150x8f474cc53 = l6Var.f224457w;
                    db5.e1.E(activityC16150x8f474cc53, activityC16150x8f474cc53.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g3m, java.lang.String.valueOf(((j18 - currentTimeMillis) / 1000) + 1)), l6Var.f224457w.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g3h), l6Var.f224457w.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g3i), false, new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.c6(l6Var));
                }
            } else {
                dp.a.m125853x26a183b(l6Var.f224457w, com.p314xaae8f345.mm.R.C30867xcad56011.f572033wu, 1).show();
                l6Var.f224457w.finish();
            }
        }
        iq4.d dVar2 = new iq4.d(new dp1.u(this));
        this.f224253o = dVar2;
        dVar2.b(9, "VOIPFloatBall");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.l6 l6Var = this.f224252n;
        if (l6Var != null) {
            l6Var.E = true;
        }
        super.finish();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.blt;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo2533x106ab264().o();
        getWindow().addFlags(6946944);
        this.f224245d = getIntent().getStringExtra("IPCallTalkUI_nickname");
        this.f224246e = getIntent().getStringExtra("IPCallTalkUI_phoneNumber");
        this.f224247f = getIntent().getStringExtra("IPCallTalkUI_contactId");
        this.f224248g = getIntent().getStringExtra("IPCallTalkUI_countryCode");
        this.f224249h = getIntent().getStringExtra("IPCallTalkUI_toWechatUsername");
        this.f224250i = getIntent().getIntExtra("IPCallTalkUI_dialScene", 0);
        this.f224251m = getIntent().getIntExtra("IPCallTalkUI_countryType", 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallTalkUI", "onCreate, mNickname: %s, mPhoneNumber: %s, mContactId: %s, mCountryCode: %s, toUsername:%s, mDialScene:%d ,mCountryType:%d", this.f224245d, this.f224246e, this.f224247f, this.f224248g, this.f224249h, java.lang.Integer.valueOf(this.f224250i), java.lang.Integer.valueOf(this.f224251m));
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(j35.u.a(this, "android.permission.RECORD_AUDIO", 80, null, null));
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallTalkUI", "summerper checkPermission checkMicrophone[%b],stack[%s]", valueOf, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        if (!((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Di(d85.g0.MICRO_PHONE, d85.f0.L, new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.h5(this))) {
            T6();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        mo65198x1aec5e91(true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.l6 l6Var = this.f224252n;
        if (l6Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TalkUIController", "onDestroy");
            l6Var.f224459y.f223977d = null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Di().f398632e = null;
            j83.b bVar = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Di().f398629b;
            if (bVar != null) {
                bVar.f379693k = null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Di().f398631d = null;
            l83.l lVar = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Di().f398628a;
            lVar.f398650h = null;
            lVar.f398646d.a();
            lVar.f398647e.b();
            l6Var.f224457w = null;
            l6Var.f224460z = null;
        }
        iq4.d dVar = this.f224253o;
        if (dVar != null) {
            dVar.o0();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        int i18;
        int i19;
        if (this.f224252n != null) {
            boolean z17 = false;
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.bj().b()) {
                if (i17 == 25) {
                    l83.c cVar = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Di().f398629b.f379694l;
                    if (cVar != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.e eVar = cVar.f398623a;
                        i19 = (eVar == null || !cVar.f398625c) ? -1 : eVar.g();
                    } else {
                        i19 = 0;
                    }
                    if (i19 != -1) {
                        i95.m c17 = i95.n0.c(ym1.f.class);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                        xm1.h hVar = ((ym1.f) c17).f544669e;
                        if (hVar == null) {
                            hVar = new xm1.j();
                            i95.m c18 = i95.n0.c(ym1.f.class);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                            ((ym1.f) c18).f544669e = hVar;
                            i95.m c19 = i95.n0.c(ym1.f.class);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getService(...)");
                            ((ym1.f) c19).f544671g[0] = "music";
                        }
                        to.a.a(hVar.c(), i19, -1, 5);
                        z17 = true;
                    }
                } else if (i17 == 24) {
                    l83.c cVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Di().f398629b.f379694l;
                    if (cVar2 != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.e eVar2 = cVar2.f398623a;
                        i18 = (eVar2 == null || !cVar2.f398625c) ? -1 : eVar2.g();
                    } else {
                        i18 = 0;
                    }
                    if (i18 != -1) {
                        i95.m c27 = i95.n0.c(ym1.f.class);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c27, "getService(...)");
                        xm1.h hVar2 = ((ym1.f) c27).f544669e;
                        if (hVar2 == null) {
                            hVar2 = new xm1.j();
                            i95.m c28 = i95.n0.c(ym1.f.class);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c28, "getService(...)");
                            ((ym1.f) c28).f544669e = hVar2;
                            i95.m c29 = i95.n0.c(ym1.f.class);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c29, "getService(...)");
                            ((ym1.f) c29).f544671g[0] = "music";
                        }
                        to.a.a(hVar2.c(), i18, 1, 5);
                        z17 = true;
                    }
                }
            }
            if (z17) {
                return true;
            }
        }
        return super.onKeyDown(i17, keyEvent);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.l6 l6Var = this.f224252n;
        if (l6Var != null) {
            boolean hasWindowFocus = hasWindowFocus();
            l6Var.getClass();
            l6Var.F = (hasWindowFocus || !((android.app.KeyguardManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) && ((android.os.PowerManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("power")).isScreenOn();
        }
        iq4.d dVar = this.f224253o;
        if (dVar != null) {
            dVar.z();
            qp1.h0.b();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallTalkUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallTalkUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr[0]), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (i17 != 80) {
            return;
        }
        if (iArr[0] == 0) {
            T6();
        } else {
            db5.e1.C(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.hhn), getString(com.p314xaae8f345.mm.R.C30867xcad56011.hht), getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), getString(com.p314xaae8f345.mm.R.C30867xcad56011.aq7), false, new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.j5(this), new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.k5(this));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.l6 l6Var = this.f224252n;
        if (l6Var != null) {
            l6Var.getClass();
            ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) c01.d9.f()).f(42);
        }
        iq4.d dVar = this.f224253o;
        if (dVar != null) {
            dVar.p0();
            qp1.h0.a(true, false, true);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        super.onStop();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallTalkUI", "onStop");
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.l6 l6Var = this.f224252n;
        if (l6Var == null || !l6Var.F || l6Var.E) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Bi().f224041i.d();
    }
}
