package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2405x2dcbb45b.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/webview/emojistore/ui/SosSimilarUI;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "Lcom/tencent/mm/modelbase/u0;", "Lcom/tencent/mm/feature/emoji/api/y6;", "<init>", "()V", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.webview.emojistore.ui.SosSimilarUI */
/* loaded from: classes15.dex */
public final class ActivityC19250xb79f2208 extends com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a implements com.p314xaae8f345.mm.p944x882e457a.u0, com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.y6 {

    /* renamed from: d, reason: collision with root package name */
    public final iw4.d f263583d = new iw4.d();

    /* renamed from: e, reason: collision with root package name */
    public final lr.n0 f263584e;

    /* renamed from: f, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f263585f;

    /* renamed from: g, reason: collision with root package name */
    public int f263586g;

    /* renamed from: h, reason: collision with root package name */
    public long f263587h;

    public ActivityC19250xb79f2208() {
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.u0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.a6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.a6.class))).getClass();
        this.f263584e = new a85.a();
    }

    public final int U6() {
        int g17 = com.p314xaae8f345.mm.ui.bk.g();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        int i17 = (g17 - (((int) ((108.0f * mo55332x76847179.getResources().getDisplayMetrics().density) + 0.5f)) * 3)) / 8;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.SosSimilarUI", "recycler view padding :" + i17);
        if (i17 > 0) {
            return i17;
        }
        return 0;
    }

    public final void V6(com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb emojiInfo, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(emojiInfo, "emojiInfo");
        int i17 = z17 ? 1 : 2;
        jx3.f fVar = jx3.f.INSTANCE;
        iw4.d dVar = this.f263583d;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(dVar.c() ? 59 : 78);
        java.lang.String str = dVar.f376782i;
        fVar.d(18742, valueOf, str, str, str, java.lang.Integer.valueOf(i17), emojiInfo.mo42933xb5885648());
    }

    public final void W6() {
        java.lang.String str;
        int i17 = this.f263586g;
        lr.n0 n0Var = this.f263584e;
        if (i17 < ((a85.a) n0Var).f83919q) {
            r45.lq5 lq5Var = new r45.lq5();
            iw4.d dVar = this.f263583d;
            int i18 = 0;
            java.lang.String str2 = "";
            if (dVar.c()) {
                for (java.lang.Object obj : dVar.f376784n) {
                    int i19 = i18 + 1;
                    if (i18 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    ir.g gVar = (ir.g) obj;
                    if (i18 > this.f263586g && i18 <= ((a85.a) n0Var).f83919q - 2) {
                        str2 = str2 + gVar.f375369b.mo42933xb5885648() + ';';
                    }
                    i18 = i19;
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("logid=17368&sessionid=");
                sb6.append(dVar.f376782i);
                sb6.append("&searchid=");
                sb6.append(dVar.f376782i);
                sb6.append("&scene=59&md5=");
                com.p314xaae8f345.mm.p2608xc9fa65a8.p2609x2eefaa.C21007x2f4a06dc c21007x2f4a06dc = dVar.f376778e;
                sb6.append(c21007x2f4a06dc != null ? c21007x2f4a06dc.f274683e : null);
                sb6.append("&md5content=");
                sb6.append(str2);
                sb6.append("&pos=");
                sb6.append(this.f263586g + 2);
                sb6.append("&clienttimestamp=");
                sb6.append(java.lang.System.currentTimeMillis());
                sb6.append("&tab=0&requestid=");
                sb6.append(dVar.f376782i);
                lq5Var.f461289t = sb6.toString();
            } else {
                java.lang.String str3 = "";
                for (java.lang.Object obj2 : dVar.f376784n) {
                    int i27 = i18 + 1;
                    if (i18 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    ir.g gVar2 = (ir.g) obj2;
                    if (i18 > this.f263586g && i18 <= ((a85.a) n0Var).f83919q - 2) {
                        str3 = str3 + "256:" + gVar2.f375371d + ':' + c01.id.c() + ';';
                    }
                    i18 = i27;
                }
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("isexpose=1&searchid=");
                sb7.append(dVar.f376782i);
                sb7.append("&content=");
                sb7.append(str3);
                sb7.append("&query=");
                com.p314xaae8f345.mm.p2608xc9fa65a8.p2609x2eefaa.C21007x2f4a06dc c21007x2f4a06dc2 = dVar.f376778e;
                if (c21007x2f4a06dc2 != null && (str = c21007x2f4a06dc2.f274682d) != null) {
                    str2 = str;
                }
                sb7.append(str2);
                sb7.append("&ishomepage=0&&sessionid=");
                sb7.append(dVar.f376781h);
                sb7.append("&scene=78&logtype=1&requestid=");
                sb7.append(dVar.f376782i);
                sb7.append("&pageno=");
                sb7.append(dVar.f376780g);
                lq5Var.f461289t = sb7.toString();
            }
            ((sg0.u3) ((tg0.w1) i95.n0.c(tg0.w1.class))).getClass();
            gm0.j1.d().g(new su4.a2(lq5Var));
            this.f263586g = ((a85.a) n0Var).f83919q;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.SosSimilarUI", lq5Var.f461289t);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String string;
        super.onCreate(bundle);
        getWindow().getDecorView().setBackgroundColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77698x3cb0744));
        android.content.Intent intent = getIntent();
        iw4.d dVar = this.f263583d;
        dVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        gm0.j1.d().a(2999, dVar);
        gm0.j1.d().a(719, dVar);
        dVar.f376778e = (com.p314xaae8f345.mm.p2608xc9fa65a8.p2609x2eefaa.C21007x2f4a06dc) intent.getParcelableExtra("KEY_NET_PARAM");
        r45.h66 h66Var = (r45.h66) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ri(this, 1, 1, r45.h66.class);
        if (h66Var != null) {
            java.lang.String str = h66Var.f457415d;
            if (str == null) {
                str = "";
            }
            dVar.f376781h = str;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SimilarEmoji", "report sessionId=" + dVar.f376781h);
        }
        com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.a7 a7Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.a7) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.a7.class);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        com.p314xaae8f345.mm.ui.xb xbVar = new com.p314xaae8f345.mm.ui.xb(mo55332x76847179, com.p314xaae8f345.mm.R.C30868x68b1db1.f575688fn);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.eb) a7Var).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2405x2dcbb45b.ui.C19249x9201c4d6 c19249x9201c4d6 = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2405x2dcbb45b.ui.C19249x9201c4d6(xbVar);
        this.f263585f = c19249x9201c4d6;
        c19249x9201c4d6.setBackgroundColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77698x3cb0744));
        android.view.ViewParent viewParent = this.f263585f;
        com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z6 z6Var = viewParent instanceof com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z6 ? (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z6) viewParent : null;
        if (z6Var != null) {
            z6Var.mo44656x6891e372(this);
        }
        android.view.ViewGroup.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        com.p314xaae8f345.mm.p2776x373aa5.C22814x6ec16583 c22814x6ec16583 = new com.p314xaae8f345.mm.p2776x373aa5.C22814x6ec16583(this);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f263585f;
        if (c1163xf1deaba4 != null) {
            c1163xf1deaba4.setPadding(U6(), 0, U6(), 0);
        }
        c22814x6ec16583.addView(this.f263585f, layoutParams);
        setContentView(c22814x6ec16583, layoutParams);
        com.p314xaae8f345.mm.p2608xc9fa65a8.p2609x2eefaa.C21007x2f4a06dc c21007x2f4a06dc = dVar.f376778e;
        if (c21007x2f4a06dc == null || (string = c21007x2f4a06dc.f274682d) == null) {
            string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jia);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        }
        mo54450xbf7c1df6(string);
        mo54448x9c8c0d33(new iw4.e(this));
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d c1161x57298f5d = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d(mo55332x76847179(), 3);
        c1161x57298f5d.B = new iw4.f(this, c1161x57298f5d);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.f263585f;
        if (c1163xf1deaba42 != null) {
            c1163xf1deaba42.mo7967x900dcbe1(c1161x57298f5d);
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba43 = this.f263585f;
        if (c1163xf1deaba43 != null) {
            c1163xf1deaba43.m7965x440a0e9(0);
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba44 = this.f263585f;
        lr.n0 n0Var = this.f263584e;
        if (c1163xf1deaba44 != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(n0Var, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.Adapter<*>");
            c1163xf1deaba44.mo7960x6cab2c8d((p012xc85e97e9.p103xe821e364.p104xd1075a44.f2) n0Var);
        }
        ((lr.z) n0Var).f402153g = new iw4.j(this);
        a85.a aVar = (a85.a) n0Var;
        aVar.f83917o = false;
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb a17 = dVar.a();
        if (a17 != null) {
            if (dVar.c()) {
                aVar.I(a17);
            } else {
                aVar.J(a17);
            }
            aVar.x(aVar.mo1894x7e414b06(), new ir.z0(105));
        }
        n0Var.m146211xced61ae5();
        dVar.b(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(1257L, 3L);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        W6();
        super.onDestroy();
        iw4.d dVar = this.f263583d;
        dVar.f376777d = null;
        gm0.j1.n().f354821b.c(2999);
        gm0.j1.n().f354821b.q(2999, dVar);
        gm0.j1.n().f354821b.c(719);
        gm0.j1.d().q(719, dVar);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        android.view.ViewParent viewParent = this.f263585f;
        com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z6 z6Var = viewParent instanceof com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z6 ? (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z6) viewParent : null;
        if (z6Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2405x2dcbb45b.ui.C19248x6e465e5a c19248x6e465e5a = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2405x2dcbb45b.ui.C19248x6e465e5a) z6Var;
            if (c19248x6e465e5a.f263582v2) {
                c19248x6e465e5a.f263582v2 = false;
            }
        }
        lr.m0 m0Var = this.f263584e;
        iw4.d dVar = this.f263583d;
        if (i17 == 0 && i18 == 0 && dVar.f376784n.size() > 1) {
            lr.z zVar = (lr.z) m0Var;
            int mo1894x7e414b06 = zVar.mo1894x7e414b06();
            ((a85.a) m0Var).f83917o = true;
            zVar.E(dVar.f376784n);
            if (mo1894x7e414b06 - 2 <= 0) {
                m0Var.m146211xced61ae5();
                return;
            }
            m0Var.m146212xed6e4d18(mo1894x7e414b06 - 1);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.SosSimilarUI", "onSceneEnd errType:" + i17 + " errCode:" + i18 + " errMsg:" + str + ' ');
            java.util.ArrayList arrayList = new java.util.ArrayList();
            a85.a aVar = (a85.a) m0Var;
            aVar.getClass();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                r45.yk5 yk5Var = (r45.yk5) it.next();
                com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = new com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4();
                r45.ri0 ri0Var = yk5Var.f472713d;
                java.lang.String str2 = yk5Var.f472714e;
                n22.m.a(ri0Var, c21053xdbf1e5f4);
                c21053xdbf1e5f4.H2 = str2;
                int i19 = yk5Var.f472715f;
                int i27 = i19 & 1;
                if (i27 == 0) {
                    c21053xdbf1e5f4.G2 = 1;
                }
                if (i27 == 0 && (i19 & 16) == 0) {
                    c21053xdbf1e5f4.F2 = 1;
                }
                c21053xdbf1e5f4.f68653x95b20dd4 = 65;
                c21053xdbf1e5f4.f68663x861009b5 = yk5Var.f472713d.f466425m;
                arrayList2.add(new ir.g(c21053xdbf1e5f4, 102, null, 0, 12, null));
            }
            aVar.E(arrayList2);
            com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb a17 = dVar.a();
            if (a17 != null) {
                if (dVar.c()) {
                    aVar.I(a17);
                } else {
                    aVar.J(a17);
                }
            }
            aVar.x(aVar.mo1894x7e414b06(), new ir.z0(106));
            m0Var.m146211xced61ae5();
        }
        W6();
    }
}
