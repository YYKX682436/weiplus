package bd2;

/* loaded from: classes2.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final bd2.r f100817a = new bd2.r();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f100818b = jz5.h.b(bd2.k.f100798d);

    public final void a(android.content.Context context, long j17, java.lang.String str, boolean z17, yz5.l lVar, yz5.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        r45.uw0 uw0Var = new r45.uw0();
        db2.t4 t4Var = db2.t4.f309704a;
        uw0Var.set(1, t4Var.a(11026));
        uw0Var.set(2, java.lang.Long.valueOf(j17));
        uw0Var.set(3, 0);
        uw0Var.set(6, java.lang.Integer.valueOf(z17 ? 2 : 0));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        int m75939xb282bd08 = nyVar != null ? nyVar.V6().m75939xb282bd08(5) : 0;
        uw0Var.set(4, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).ek(j17, str, m75939xb282bd08));
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = (com.p314xaae8f345.mm.p2495xc50a8b8b.g) ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).f206745h.get(pm0.v.u(j17));
        if (gVar != null) {
            uw0Var.set(8, gVar);
        }
        java.lang.String m75945x2fec8307 = uw0Var.m75945x2fec8307(4);
        if (m75945x2fec8307 != null) {
            t4Var.j((r45.kv0) uw0Var.m75936x14adae67(1), j17, m75945x2fec8307);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fetchDislikeReasons refCommentScene=");
        sb6.append(m75939xb282bd08);
        sb6.append(" session_buffer=");
        sb6.append(uw0Var.m75945x2fec8307(4) != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NoInterestedLogic", sb6.toString());
        pq5.g l17 = uw0Var.d().l();
        l17.K(new bd2.l(lVar, aVar));
        l17.f((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context);
    }

    public final boolean b() {
        return ((java.lang.Boolean) ((jz5.n) f100818b).mo141623x754a37bb()).booleanValue();
    }

    public final void c(android.content.Context context, long j17, java.lang.String str, java.lang.String objectNonceId, java.lang.Boolean bool, java.util.List list) {
        java.lang.String str2;
        ec2.d e27;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(objectNonceId, "objectNonceId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NoInterestedLogic", "handleNoInterested with feedId:" + ((java.lang.Object) jz5.x.a(j17)) + ", subTypeItems:" + list);
        i95.m c17 = i95.n0.c(cq.k.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        dq.b bVar = ((cq.k) c17).f302759g;
        bVar.getClass();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = bVar.f323818b;
        int o17 = (o4Var != null ? o4Var.o("KEY_FINDER_EDU_TIPS_FEATURE_USE_COUNT_".concat("dislike_edu_tips"), 0) : 0) + 1;
        if (o4Var != null) {
            o4Var.A("KEY_FINDER_EDU_TIPS_FEATURE_USE_COUNT_".concat("dislike_edu_tips"), o17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderMMKVManager", "markEduTipsFeatureUseOnce key=dislike_edu_tips, count=" + o17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy iyVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e17 = iyVar.e(context);
        new db2.j0(j17, str, objectNonceId, 1, 2, e17 != null ? e17.V6() : null, bool, list).l().H(new bd2.m(j17));
        jx3.f fVar = jx3.f.INSTANCE;
        fVar.mo68477x336bdfd8(1278L, 9L, 1L, false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
        java.lang.String simpleName = context.getClass().getSimpleName();
        o3Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 dk6 = o3Var.dk(j17);
        if (dk6 != null) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject = dk6.getFeedObject();
            java.lang.String str3 = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri() + ',' + simpleName + ',' + o3Var.Ui(feedObject.m76784x5db1b11()) + ',' + feedObject.m76836x6c03c64c() + ',' + dk6.getMediaType() + ',' + feedObject.m76820x794f1260() + ',' + feedObject.m76791xf4204902() + ',' + feedObject.m76758x8ed22866() + ',' + feedObject.m76779xf67fd084() + ",0,0,0,2";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderReportLogic", "18946 " + str3);
            fVar.mo68478xbd3cda5f(18946, str3);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e18 = iyVar.e(context);
        if (e18 != null && (e27 = zy2.ra.e2(e18, 0, 1, null)) != null) {
            e27.a(new ec2.a(12, j17, str));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e19 = iyVar.e(context);
        r45.qt2 V6 = e19 != null ? e19.V6() : null;
        if (V6 != null) {
            java.lang.String t17 = r26.i0.t(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).ek(j17, str, V6.m75939xb282bd08(5)), ",", ";", false);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 dk7 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).dk(j17);
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            jz5.l[] lVarArr = new jz5.l[7];
            lVarArr[0] = new jz5.l("feed_id", pm0.v.u(j17));
            lVarArr[1] = new jz5.l("finder_context_id", V6.m75945x2fec8307(1));
            lVarArr[2] = new jz5.l("finder_tab_context_id", V6.m75945x2fec8307(2));
            lVarArr[3] = new jz5.l("comment_scene", java.lang.Integer.valueOf(V6.m75939xb282bd08(5)));
            lVarArr[4] = new jz5.l("session_buffer", t17);
            if (dk7 == null || (str2 = dk7.m59299x6bf53a6c()) == null) {
                str2 = "";
            }
            lVarArr[5] = new jz5.l("finder_username", str2);
            lVarArr[6] = new jz5.l("extra_info", V6.m75945x2fec8307(11));
            ((cy1.a) rVar).Bj("no_interest", "view_clk", kz5.c1.k(lVarArr), 1, false);
        }
    }

    public final void d(android.content.Context context, long j17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5469x8288cd99 c5469x8288cd99 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5469x8288cd99();
        c5469x8288cd99.f135807g.f88080a = j17;
        c5469x8288cd99.e();
        if (z17) {
            r45.ls2 ls2Var = (r45.ls2) g92.b.f351302e.k2().d().m75936x14adae67(26);
            boolean z18 = false;
            if (ls2Var != null && ls2Var.m75939xb282bd08(0) == 1) {
                z18 = true;
            }
            java.lang.String string = z18 ? context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f1q) : context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f1p);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            db5.t7.i(context, string, com.p314xaae8f345.mm.R.raw.f79703xc84d169a);
        }
    }

    public final void e(android.content.Context context, long j17, java.lang.String str, java.lang.String objectNonceId, boolean z17, in5.s0 s0Var) {
        android.view.ViewGroup viewGroup;
        boolean z18;
        boolean z19;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(objectNonceId, "objectNonceId");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209538wb).mo141623x754a37bb()).r()).intValue() == 1) {
            android.view.View p17 = s0Var != null ? s0Var.p(com.p314xaae8f345.mm.R.id.e_k) : null;
            viewGroup = null;
            bd2.g gVar = new bd2.g(context, j17, str, objectNonceId, z17, p17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f) p17 : null);
            gVar.a();
            android.content.Context context2 = gVar.f100782d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            c03.g gVar2 = (c03.g) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).e(c03.g.class);
            if (gVar2 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderFlutterDislikePlugin", "open dislike panel with activityCls:" + context2.getClass());
                z19 = false;
            } else {
                bd2.e eVar = new bd2.e(gVar);
                com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.EnumC23878x4bcb0c82 enumC23878x4bcb0c82 = com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.EnumC23878x4bcb0c82.f42513x19d1382a;
                if (enumC23878x4bcb0c82 != gVar2.f119192i) {
                    gVar2.f119192i = enumC23878x4bcb0c82;
                    java.util.Objects.toString(gVar2.f119189f);
                    com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.C23879xfb507da3 c23879xfb507da3 = gVar2.f119189f;
                    if (c23879xfb507da3 != null) {
                        c23879xfb507da3.m88503x7668805a(enumC23878x4bcb0c82, new c03.a(gVar2));
                    }
                }
                android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(gVar2.m80379x76847179());
                frameLayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
                frameLayout.setId(com.p314xaae8f345.mm.R.id.f566049eh4);
                new java.lang.ref.WeakReference(frameLayout);
                gx2.a aVar = new gx2.a();
                int k17 = i65.a.k(gVar2.m80379x76847179()) + com.p314xaae8f345.mm.ui.bk.p(gVar2.m80379x76847179());
                float a17 = kx2.a.f394811a.a(gVar2.m80379x76847179());
                java.lang.Float valueOf = java.lang.Float.valueOf(0.5f);
                if (valueOf != null) {
                    a17 = valueOf.floatValue();
                }
                aVar.f358870c = a17 * k17;
                aVar.f358878k = gVar2.m80379x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560027f, null);
                android.app.Activity context3 = gVar2.m80379x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context3, "context");
                aVar.f358871d = new hx2.g(context3, com.p314xaae8f345.mm.R.C30859x5a72f63.f560027f, 0, 0, false, false, 60, null);
                aVar.f358872e = new hx2.c(frameLayout);
                android.app.Activity context4 = gVar2.m80379x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context4, "context");
                aVar.f358873f = new hx2.b(context4, false);
                aVar.a(new c03.f(gVar2));
                android.view.View mo144222x4ff8c0f0 = gVar2.mo144222x4ff8c0f0(android.R.id.content);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo144222x4ff8c0f0, "findViewById(...)");
                gx2.q b17 = aVar.b((android.view.ViewGroup) mo144222x4ff8c0f0);
                b17.m132488xe0229bde(new c03.b(gVar2, frameLayout));
                gVar2.f119187d = new java.lang.ref.WeakReference(b17);
                p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
                p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a), null, null, new c03.d(eVar, frameLayout, gVar2, b17, null), 3, null);
                z19 = true;
            }
            if (z19) {
                if (!b()) {
                    d(context, j17, false);
                    return;
                }
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5516x15e2361e c5516x15e2361e = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5516x15e2361e();
                am.tc tcVar = c5516x15e2361e.f135847g;
                tcVar.f89531a = true;
                tcVar.f89532b = j17;
                c5516x15e2361e.e();
                return;
            }
        } else {
            viewGroup = null;
        }
        jz5.g gVar3 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209502ub;
        ((lb2.j) ((jz5.n) gVar3).mo141623x754a37bb()).l();
        if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar3).mo141623x754a37bb()).r()).intValue() != 0) {
            z18 = true;
            if (!z17) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1(context);
                android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dhr, viewGroup);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
                y1Var.k(inflate);
                android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f569032qh0);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
                com.p314xaae8f345.mm.ui.fk.a(textView);
                inflate.findViewById(com.p314xaae8f345.mm.R.id.qgy).setOnClickListener(new bd2.n(y1Var));
                android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.m8m);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById;
                bd2.i iVar = new bd2.i();
                iVar.f100797f = new bd2.o(context, j17, str, objectNonceId, z17, y1Var);
                c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(context));
                c1163xf1deaba4.mo7960x6cab2c8d(iVar);
                a(context, j17, str, z17, new bd2.p(iVar, j17, y1Var), new bd2.q(context, j17, str, objectNonceId, z17));
                return;
            }
        } else {
            z18 = true;
        }
        d(context, j17, z18);
        c(context, j17, str, objectNonceId, java.lang.Boolean.valueOf(z17), null);
    }
}
