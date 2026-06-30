package com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui;

/* loaded from: classes15.dex */
public class w implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: m, reason: collision with root package name */
    public static int f234896m;

    /* renamed from: d, reason: collision with root package name */
    public final android.app.Activity f234897d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f234898e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f234899f = false;

    /* renamed from: g, reason: collision with root package name */
    public final wq3.j f234900g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.v f234901h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f234902i;

    public w(android.app.Activity activity, com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.v vVar) {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f234902i = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6249x2aa12f2e>(a0Var) { // from class: com.tencent.mm.plugin.product.ui.MallProductHelper$4
            {
                this.f39173x3fe91575 = 520089918;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6249x2aa12f2e c6249x2aa12f2e) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6249x2aa12f2e c6249x2aa12f2e2 = c6249x2aa12f2e;
                boolean z17 = false;
                if (c6249x2aa12f2e2 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6249x2aa12f2e) {
                    am.s10 s10Var = c6249x2aa12f2e2.f136498g;
                    if (s10Var.f89398e) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f("MicroMsg.MallProductUI", "WalletPayResultEvent is from kinda, ScanQRCodePay");
                    } else {
                        z17 = true;
                        if (s10Var.f89396c == -1) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.w wVar = com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.w.this;
                            if (!wVar.f234899f) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallProductUI", "MallProduct pay result : ok");
                                wVar.a();
                                wVar.f234899f = true;
                            }
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallProductUI", "MallProduct pay result : cancel");
                        }
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f("MicroMsg.MallProductUI", "mismatched event");
                }
                return z17;
            }
        };
        this.f234897d = activity;
        this.f234900g = vq3.e.wi().Ai();
        this.f234901h = vVar;
    }

    public final void a() {
        wq3.k Bi = vq3.e.wi().Bi();
        r45.ek5 h17 = this.f234900g.h();
        Bi.getClass();
        if (h17 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h17.f455116e) && !h17.f455116e.contains(";")) {
            java.util.ArrayList arrayList = (java.util.ArrayList) Bi.f530101a;
            arrayList.remove(h17.f455116e);
            arrayList.add(h17.f455116e);
            Bi.a();
        }
        android.content.Intent intent = new android.content.Intent(this.f234897d, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.ActivityC16818xbff037ef.class);
        intent.putExtra("key_go_finish", true);
        intent.addFlags(67108864);
        android.app.Activity activity = this.f234897d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(activity, arrayList2.toArray(), "com/tencent/mm/plugin/product/ui/MallProductHelper", "doSuccessFinish", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(activity, "com/tencent/mm/plugin/product/ui/MallProductHelper", "doSuccessFinish", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public void b(int i17, int i18, android.content.Intent intent) {
        wq3.j jVar = this.f234900g;
        if (i17 == 1) {
            if (i18 != -1 || intent == null) {
                return;
            }
            jVar.s(intent);
            com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.v vVar = this.f234901h;
            if (vVar != null) {
                vVar.a(0, 0, "");
            }
            gm0.j1.i();
            com.p314xaae8f345.mm.p944x882e457a.r1 r1Var = gm0.j1.n().f354821b;
            wq3.t tVar = jVar.f530082b;
            r1Var.g(new wq3.n(tVar != null ? tVar.f530128a : "", jVar.f530084d, jVar.f530089i));
            return;
        }
        if (i17 == 2) {
            if (i18 != -1 || intent == null) {
                return;
            }
            jVar.s(intent);
            gm0.j1.i();
            gm0.j1.n().f354821b.g(new wq3.q(jVar.i(), f234896m));
            return;
        }
        if (i17 == 3) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6249x2aa12f2e c6249x2aa12f2e = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6249x2aa12f2e();
            am.s10 s10Var = c6249x2aa12f2e.f136498g;
            s10Var.f89396c = i17;
            s10Var.f89394a = intent;
            this.f234902i.mo1xf5bc2045(c6249x2aa12f2e);
            return;
        }
        if (i17 == 4) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.v vVar2 = this.f234901h;
            if (vVar2 != null) {
                vVar2.a(0, 0, "");
                return;
            }
            return;
        }
        if (i17 != 10000) {
            return;
        }
        this.f234897d.showDialog(-10002);
        gm0.j1.i();
        gm0.j1.n().f354821b.g(new wq3.p(jVar.f530084d, jVar.f530092l));
    }

    public void c() {
        gm0.j1.i();
        gm0.j1.n().f354821b.a(553, this);
        gm0.j1.i();
        gm0.j1.n().f354821b.a(554, this);
        gm0.j1.i();
        gm0.j1.n().f354821b.a(uc1.s1.f76912x366c91de, this);
        gm0.j1.i();
        gm0.j1.n().f354821b.a(556, this);
        gm0.j1.i();
        gm0.j1.n().f354821b.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lab.d.f34388x366c91de, this);
        gm0.j1.i();
        gm0.j1.n().f354821b.a(578, this);
        gm0.j1.i();
        gm0.j1.n().f354821b.a(nd1.j2.f72947x366c91de, this);
    }

    public void d() {
        gm0.j1.i();
        gm0.j1.n().f354821b.q(553, this);
        gm0.j1.i();
        gm0.j1.n().f354821b.q(554, this);
        gm0.j1.i();
        gm0.j1.n().f354821b.q(uc1.s1.f76912x366c91de, this);
        gm0.j1.i();
        gm0.j1.n().f354821b.q(556, this);
        gm0.j1.i();
        gm0.j1.n().f354821b.q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lab.d.f34388x366c91de, this);
        gm0.j1.i();
        gm0.j1.n().f354821b.q(578, this);
        gm0.j1.i();
        gm0.j1.n().f354821b.q(nd1.j2.f72947x366c91de, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.lang.String str2;
        android.app.Activity activity = this.f234897d;
        wq3.j jVar = this.f234900g;
        if (i17 != 0 || i18 != 0) {
            if (i18 == -10010003) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallProductUI", "deal with MMBIZPAY_FUNC_ERR_NO_EXISTED_PRODUCT");
                if (m1Var instanceof wq3.o) {
                    wq3.o oVar = (wq3.o) m1Var;
                    jVar.u(oVar.f530112g, oVar.f530113h);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.v vVar = this.f234901h;
                    if (vVar != null) {
                        vVar.a(i17, i18, str);
                        return;
                    }
                    return;
                }
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallProductUI", "unkown errCode " + i18);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                str2 = i18 + " : " + activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gro);
            } else {
                str2 = str;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.v vVar2 = this.f234901h;
            if (vVar2 != null) {
                vVar2.a(i17, i18, str2);
                return;
            }
            return;
        }
        if (m1Var instanceof wq3.o) {
            wq3.o oVar2 = (wq3.o) m1Var;
            jVar.u(oVar2.f530112g, oVar2.f530113h);
            com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.v vVar3 = this.f234901h;
            if (vVar3 != null) {
                vVar3.a(i17, i18, str);
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(oVar2.f530112g.f530128a)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11007, jVar.j(), oVar2.f530111f, java.lang.Integer.valueOf(f234896m), 1);
                return;
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11007, jVar.j(), oVar2.f530112g.f530128a, java.lang.Integer.valueOf(f234896m), 1);
                return;
            }
        }
        if (m1Var instanceof wq3.q) {
            wq3.q qVar = (wq3.q) m1Var;
            java.lang.String str3 = qVar.f530120f;
            java.util.LinkedList linkedList = qVar.f530121g;
            java.util.LinkedList linkedList2 = qVar.f530122h;
            jVar.f530084d = str3;
            jVar.f530097q = linkedList2;
            jVar.f530096p = linkedList;
            jVar.t(0);
            android.app.Activity activity2 = this.f234897d;
            android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.ActivityC16817xdad885e7.class);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(activity2, arrayList.toArray(), "com/tencent/mm/plugin/product/ui/MallProductHelper", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity2.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(activity2, "com/tencent/mm/plugin/product/ui/MallProductHelper", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11009, jVar.j(), jVar.f530082b.f530128a, java.lang.Integer.valueOf(f234896m), 1);
            return;
        }
        if (m1Var instanceof wq3.m) {
            return;
        }
        if (m1Var instanceof wq3.s) {
            java.lang.String str4 = ((wq3.s) m1Var).f530127f;
            int i19 = f234896m == 7 ? 1001 : 6;
            xq3.n nVar = jVar.f530082b.f530133f;
            java.lang.String str5 = nVar != null ? nVar.f537638d : null;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
                com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56 = new com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56();
                c19760x34448d56.f273647m = str4;
                c19760x34448d56.f273649o = str5;
                c19760x34448d56.f273650p = null;
                c19760x34448d56.f273642e = i19;
                c19760x34448d56.f273654t = null;
                c19760x34448d56.f273644g = 0;
                h45.a0.f(activity, c19760x34448d56, 3);
            }
            this.f234902i.mo48813x58998cd();
            return;
        }
        if (m1Var instanceof wq3.r) {
            db5.e1.T(activity, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gs6));
            a();
            return;
        }
        if (m1Var instanceof wq3.n) {
            try {
                activity.dismissDialog(-10002);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MallProductUI", e17.toString());
            }
            jVar.f530096p = ((wq3.n) m1Var).f530108f;
            jVar.t(0);
            return;
        }
        if (m1Var instanceof wq3.p) {
            try {
                activity.dismissDialog(-10002);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MallProductUI", e18.toString());
            }
            wq3.p pVar = (wq3.p) m1Var;
            java.lang.String str6 = pVar.f530117g;
            java.util.LinkedList linkedList3 = pVar.f530116f;
            jVar.getClass();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str6) && linkedList3 != null && linkedList3.size() > 0) {
                if (jVar.f530100t == null) {
                    jVar.f530100t = new java.util.HashMap();
                }
                ((java.util.HashMap) jVar.f530100t).put(str6, linkedList3);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.v vVar4 = this.f234901h;
            if (vVar4 != null) {
                vVar4.a(i17, i18, str);
            }
        }
    }
}
