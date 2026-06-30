package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes8.dex */
public class z4 implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19732x78a3bb7f f273553a;

    public z4(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19732x78a3bb7f activityC19732x78a3bb7f) {
        this.f273553a = activityC19732x78a3bb7f;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19732x78a3bb7f activityC19732x78a3bb7f = this.f273553a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MiniQBReaderUI", "openReadFile, receiveValue = %s %s", str, activityC19732x78a3bb7f.toString());
        if ("query for feature_wx_float_window successfully".equals(str)) {
            activityC19732x78a3bb7f.f272937v = true;
            vt0.c.d(activityC19732x78a3bb7f.f272934s.s(), activityC19732x78a3bb7f.f272934s.a(), true, false, activityC19732x78a3bb7f, activityC19732x78a3bb7f.f272927i, activityC19732x78a3bb7f.f272931p, activityC19732x78a3bb7f.f272928m, activityC19732x78a3bb7f.f272932q, activityC19732x78a3bb7f.f272930o, activityC19732x78a3bb7f.f272921J, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19732x78a3bb7f.V6(activityC19732x78a3bb7f, true), activityC19732x78a3bb7f.f272930o, activityC19732x78a3bb7f.f272940y);
            return;
        }
        if ("xwebFileReaderReachEnd".equals(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MiniQBReaderUI", "xweb file reader reach end");
            md5.b bVar = activityC19732x78a3bb7f.f272934s;
            if (bVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MiniQBReaderUI", "mFloatBallHelper null");
                return;
            } else {
                bVar.f407416y = true;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FilesFloatBall.FilesPageMultiTaskHelper", "setEnded ended:%b", java.lang.Boolean.TRUE);
                return;
            }
        }
        if ("xwebFileReaderUserOperated".equals(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MiniQBReaderUI", "xweb file reader user operated");
            md5.b bVar2 = activityC19732x78a3bb7f.f272934s;
            if (bVar2 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MiniQBReaderUI", "mFloatBallHelper null");
                return;
            }
            ak3.c cVar = bVar2.f381644d;
            bVar2.m(bVar2.h(cVar != null ? cVar.mo2158x12501425() : null));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FilesFloatBall.FilesPageMultiTaskHelper", "setStart");
            return;
        }
        if ("xwebFileReaderMenuEditClick".equals(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MiniQBReaderUI", "xweb file reader menu edit click");
            new com.p314xaae8f345.mm.p2470x93e71c27.ui.n2(activityC19732x78a3bb7f, activityC19732x78a3bb7f.f272927i, activityC19732x78a3bb7f.f272931p, activityC19732x78a3bb7f.f272928m, activityC19732x78a3bb7f.f272932q, activityC19732x78a3bb7f.f272929n).f272444g.C();
            java.lang.String str2 = activityC19732x78a3bb7f.f272929n;
            java.lang.String str3 = activityC19732x78a3bb7f.f272928m;
            ((ht.s) ((jt.a0) i95.n0.c(jt.a0.class))).getClass();
            int i17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.t3.q(activityC19732x78a3bb7f) ? 1 : 2;
            java.lang.String str4 = activityC19732x78a3bb7f.f272932q;
            if (str4 == null || str4.isEmpty() || str2 == null || str2.isEmpty() || str3 == null || str3.isEmpty()) {
                by5.c4.c("WXWebReporter", "reportXFilesAction failed, invalid param");
                return;
            }
            java.lang.String str5 = str4 + "," + str2 + "," + str3 + ",6," + i17;
            by5.c4.f("WXWebReporter", "reportXFilesAction key = 25696, value = " + str5);
            by5.s0.t(25696, str5);
            return;
        }
        if ("fileReaderClosed".equals(str)) {
            md5.b bVar3 = activityC19732x78a3bb7f.f272934s;
            if (bVar3 == null || bVar3.U(1, bVar3.f407416y)) {
                return;
            }
            boolean z17 = activityC19732x78a3bb7f.f272936u;
            if (z17) {
                activityC19732x78a3bb7f.finish();
                return;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MiniQBReaderUI", "opCallback isFinishCurPage:%s", java.lang.Boolean.valueOf(z17));
                activityC19732x78a3bb7f.f272936u = true;
                return;
            }
        }
        if ("fileReaderMenuClicked".equals(str)) {
            if (activityC19732x78a3bb7f.D == null) {
                java.lang.String e17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f.e(activityC19732x78a3bb7f.f272928m);
                md5.b bVar4 = activityC19732x78a3bb7f.f272934s;
                gc5.b bVar5 = activityC19732x78a3bb7f.f272933r;
                com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.C16086xc05cbbfc c16086xc05cbbfc = activityC19732x78a3bb7f.f272939x;
                java.lang.String str6 = activityC19732x78a3bb7f.f272928m;
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.x3 x3Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.x3(bVar4, bVar5, c16086xc05cbbfc, str6, activityC19732x78a3bb7f.f272927i, activityC19732x78a3bb7f.f272931p, activityC19732x78a3bb7f.f272929n, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f.e(str6), 0, true, activityC19732x78a3bb7f.f272922d, activityC19732x78a3bb7f.f272923e, true, "", activityC19732x78a3bb7f.f272924f, activityC19732x78a3bb7f.f272925g);
                x3Var.f273531u = activityC19732x78a3bb7f.f272926h;
                jt.a0 a0Var = (jt.a0) i95.n0.c(jt.a0.class);
                java.lang.String e18 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f.e(activityC19732x78a3bb7f.f272928m);
                ((ht.s) a0Var).getClass();
                java.lang.String[] strArr = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.t3.f270975a;
                x3Var.f273529s = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e18) ? false : com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.t3.f270976b.contains(e18);
                jt.a0 a0Var2 = (jt.a0) i95.n0.c(jt.a0.class);
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC19732x78a3bb7f.mo55332x76847179();
                ((ht.s) a0Var2).getClass();
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.t3.q(mo55332x76847179);
                x3Var.f273528r = activityC19732x78a3bb7f.f272930o != 19 && ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).ij();
                activityC19732x78a3bb7f.D = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.g6(activityC19732x78a3bb7f, x3Var, activityC19732x78a3bb7f);
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.g2 g2Var = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.g2(e17, activityC19732x78a3bb7f.f272927i);
                activityC19732x78a3bb7f.F = g2Var;
                g2Var.f270844d = activityC19732x78a3bb7f.f272928m;
                g2Var.f270843c = activityC19732x78a3bb7f.f272931p;
                g2Var.f270845e = activityC19732x78a3bb7f.f272922d;
                g2Var.f270846f = activityC19732x78a3bb7f.f272923e;
                g2Var.f270848h = 4;
                if (((jb0.g) ((jt.x) i95.n0.c(jt.x.class))).Ai(4)) {
                    activityC19732x78a3bb7f.E = ((jb0.g) ((jt.x) i95.n0.c(jt.x.class))).wi(activityC19732x78a3bb7f.mo55332x76847179(), activityC19732x78a3bb7f.F);
                }
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC19732x78a3bb7f.f272923e) && activityC19732x78a3bb7f.f272922d > 0) {
                    com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.g6 g6Var = activityC19732x78a3bb7f.D;
                    yz5.a aVar = new yz5.a() { // from class: com.tencent.mm.pluginsdk.ui.tools.z4$$a
                        @Override // yz5.a
                        /* renamed from: invoke */
                        public final java.lang.Object mo152xb9724478() {
                            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19732x78a3bb7f activityC19732x78a3bb7f2;
                            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.z4 z4Var = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.z4.this;
                            z4Var.getClass();
                            ty.k0 k0Var = (ty.k0) i95.n0.c(ty.k0.class);
                            ty.p0 p0Var = ty.p0.f504279r;
                            ty.r0 r0Var = ty.r0.f504287f;
                            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19732x78a3bb7f activityC19732x78a3bb7f3 = z4Var.f273553a;
                            java.lang.String str7 = activityC19732x78a3bb7f3.f272923e;
                            ti3.q qVar = (ti3.q) k0Var;
                            qVar.getClass();
                            if (str7 == null || str7.length() == 0) {
                                activityC19732x78a3bb7f2 = activityC19732x78a3bb7f3;
                            } else {
                                activityC19732x78a3bb7f2 = activityC19732x78a3bb7f3;
                                qVar.Bi(p0Var, r0Var, null, null, 0, 0L, 0L, 0L, str7);
                            }
                            android.content.Intent className = new android.content.Intent().putExtra("msg_local_id", activityC19732x78a3bb7f2.f272922d).putExtra("Chat_User", activityC19732x78a3bb7f2.f272923e).putExtra("from_global_search", true).putExtra("need_hight_item", true).setClassName(activityC19732x78a3bb7f2, "com.tencent.mm.ui.chatting.ChattingUI");
                            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19732x78a3bb7f activityC19732x78a3bb7f4 = z4Var.f273553a;
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            arrayList.add(className);
                            java.util.Collections.reverse(arrayList);
                            yj0.a.d(activityC19732x78a3bb7f4, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/tools/MiniQBReaderUI$6", "lambda$onReceiveValue$0", "()Lkotlin/Unit;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            activityC19732x78a3bb7f4.startActivity((android.content.Intent) arrayList.get(0));
                            yj0.a.f(activityC19732x78a3bb7f4, "com/tencent/mm/pluginsdk/ui/tools/MiniQBReaderUI$6", "lambda$onReceiveValue$0", "()Lkotlin/Unit;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            return jz5.f0.f384359a;
                        }
                    };
                    g6Var.getClass();
                    g6Var.f273181e = aVar;
                }
            }
            activityC19732x78a3bb7f.D.b();
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.m2 m2Var = activityC19732x78a3bb7f.E;
            if (m2Var != null) {
                ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.v) m2Var).e(activityC19732x78a3bb7f.D.f273182f);
            } else {
                activityC19732x78a3bb7f.W6(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.c5(activityC19732x78a3bb7f.D.f273182f));
                ((jb0.g) ((jt.x) i95.n0.c(jt.x.class))).Ni(activityC19732x78a3bb7f.F);
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = activityC19732x78a3bb7f.D.f273182f;
            if (k0Var != null) {
                k0Var.v();
            }
            activityC19732x78a3bb7f.D.f273182f.B = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a5(this);
        }
    }
}
