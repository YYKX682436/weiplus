package yw;

/* loaded from: classes11.dex */
public final class q3 {

    /* renamed from: d, reason: collision with root package name */
    public static boolean f547973d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f547974e;

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.Boolean f547976g;

    /* renamed from: a, reason: collision with root package name */
    public static final yw.q3 f547970a = new yw.q3();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f547971b = jz5.h.b(yw.m3.f547934d);

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f547972c = yw.x0.f548033a.b();

    /* renamed from: f, reason: collision with root package name */
    public static boolean f547975f = true;

    static {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() && gm0.j1.h() && gm0.j1.a()) {
            ((ku5.t0) ku5.t0.f394148d).a(yw.f3.f547854d);
        }
    }

    public final com.p314xaae8f345.p3133xd0ce8b26.mm.biz.f1 a(com.p314xaae8f345.mm.p2621x8fb0427b.s1 info, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.f1 f1Var = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.f1();
        f1Var.f299540f = info.f67306x114ef53e;
        boolean[] zArr = f1Var.M;
        char c17 = 3;
        zArr[3] = true;
        f1Var.f299541g = info.f67293xd09be28e;
        char c18 = 4;
        zArr[4] = true;
        f1Var.f299542h = info.f67282xac3be4e;
        zArr[5] = true;
        f1Var.f299543i = info.f67287x15a25b3 ? 2 : info.f67286xff7b64c5 == 1 ? 1 : 0;
        zArr[6] = true;
        f1Var.f299544m = 0;
        zArr[7] = true;
        f1Var.f299545n = (info.f67279x6e664fd4 & 1) != 0;
        zArr[8] = true;
        f1Var.f299546o = info.f67285xf918da09;
        zArr[9] = true;
        f1Var.f299547p = info.f67283x9e1cb272 != 1 && z17;
        zArr[10] = true;
        f1Var.f299548q = z17;
        zArr[11] = true;
        f1Var.f299555x = info.f67292x297eb4f7;
        zArr[18] = true;
        f1Var.f299549r = info.f67299x4a963900;
        zArr[12] = true;
        f1Var.B = info.f67297x7c6e898e;
        zArr[22] = true;
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.i1 i1Var = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.i1();
        java.util.LinkedList<ot0.s0> linkedList = ((ot0.r0) ((com.p314xaae8f345.mm.p1006xc5476f33.biz.a) ((bq1.l) i95.n0.c(bq1.l.class))).Di(info.f67292x297eb4f7, info.f67281xad49e234)).f430114i;
        if (linkedList != null) {
            for (ot0.s0 s0Var : linkedList) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(s0Var);
                com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h1 h1Var = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.h1();
                java.lang.String str = s0Var.f430294d;
                if (str == null) {
                    str = "";
                }
                h1Var.f299628d = str;
                boolean[] zArr2 = h1Var.f299627J;
                zArr2[1] = true;
                java.lang.String str2 = s0Var.f430295e;
                if (str2 == null) {
                    str2 = "";
                }
                h1Var.f299629e = str2;
                zArr2[2] = true;
                h1Var.f299630f = s0Var.f430298h;
                zArr2[c17] = true;
                java.lang.String str3 = s0Var.f430299i;
                if (str3 == null) {
                    str3 = "";
                }
                h1Var.f299631g = str3;
                zArr2[c18] = true;
                java.lang.String str4 = s0Var.D;
                if (str4 == null) {
                    str4 = "";
                }
                h1Var.f299632h = str4;
                zArr2[5] = true;
                java.lang.String str5 = s0Var.f430305p0;
                if (str5 == null) {
                    str5 = "";
                }
                h1Var.I = str5;
                zArr2[29] = true;
                java.lang.String str6 = s0Var.f430302n;
                if (str6 == null) {
                    str6 = "";
                }
                h1Var.f299633i = str6;
                zArr2[6] = true;
                h1Var.f299634m = s0Var.f430303o;
                zArr2[7] = true;
                h1Var.f299635n = s0Var.f430307q;
                zArr2[8] = true;
                java.lang.String str7 = s0Var.f430318z;
                if (str7 == null) {
                    str7 = "";
                }
                h1Var.f299636o = str7;
                zArr2[9] = true;
                h1Var.f299638q = s0Var.C;
                zArr2[11] = true;
                h1Var.f299639r = s0Var.I == 1;
                zArr2[12] = true;
                java.lang.String str8 = s0Var.G;
                if (str8 == null) {
                    str8 = "";
                }
                h1Var.f299640s = str8;
                zArr2[13] = true;
                h1Var.f299641t = s0Var.E;
                zArr2[14] = true;
                h1Var.f299642u = s0Var.F;
                zArr2[15] = true;
                java.lang.String str9 = s0Var.P;
                if (str9 == null) {
                    str9 = "";
                }
                h1Var.f299643v = str9;
                zArr2[16] = true;
                java.lang.String str10 = s0Var.Q;
                if (str10 == null) {
                    str10 = "";
                }
                h1Var.f299644w = str10;
                zArr2[17] = true;
                java.lang.String str11 = s0Var.R;
                if (str11 == null) {
                    str11 = "";
                }
                h1Var.f299645x = str11;
                zArr2[18] = true;
                h1Var.f299646y = s0Var.S;
                zArr2[19] = true;
                java.util.AbstractCollection abstractCollection = s0Var.f430300l1;
                if (abstractCollection == null) {
                    abstractCollection = new java.util.ArrayList();
                }
                h1Var.f299647z.addAll(abstractCollection);
                zArr2[20] = true;
                h1Var.A = s0Var.f430306p1;
                zArr2[21] = true;
                java.lang.String str12 = s0Var.T;
                if (str12 == null) {
                    str12 = "";
                }
                h1Var.B = str12;
                zArr2[22] = true;
                h1Var.C = s0Var.U == 1;
                zArr2[23] = true;
                h1Var.F = s0Var.W;
                zArr2[26] = true;
                h1Var.G = s0Var.Y;
                zArr2[27] = true;
                h1Var.H = s0Var.Z;
                zArr2[28] = true;
                i1Var.f299709d.add(h1Var);
                i1Var.f299712g[1] = true;
                c17 = 3;
                c18 = 4;
            }
        }
        f1Var.f299539e = i1Var;
        zArr[2] = true;
        f1Var.f299551t = info.f67281xad49e234;
        zArr[14] = true;
        f1Var.f299554w = info.M;
        zArr[17] = true;
        return f1Var;
    }

    public final com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b1 b() {
        if (f547973d) {
            return com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b1.f299435b;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FlutterBizMsgBridge", "getBizDynamicCardMrg hasInit=" + f547973d);
        return null;
    }

    public final com.p314xaae8f345.p3133xd0ce8b26.mm.biz.g0 c() {
        if (f547973d) {
            return com.p314xaae8f345.p3133xd0ce8b26.mm.biz.g0.f299596b;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FlutterBizMsgBridge", "getBizManagerInstance hasInit=" + f547973d);
        return null;
    }

    public final synchronized void d() {
        if (f547973d) {
            return;
        }
        yw.h1 h1Var = yw.h1.f547865a;
        if (!h1Var.n()) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("init but not use aff ");
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            sb6.append(new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FlutterBizMsgBridge", sb6.toString());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterBizMsgBridge", "init resetData= " + f547976g);
        ((u71.f) ((e70.q) i95.n0.c(e70.q.class))).wi();
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.y0.f300325a = yw.g3.f547861a;
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.y0.f300326b = yw.h3.f547881a;
        com.p314xaae8f345.p3133xd0ce8b26.iam.biz.a.f299271a = yw.i3.f547888a;
        yw.q0.f547965d.mo48813x58998cd();
        if (!h1Var.p()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizFlutterDigestHelper", "init finder live dot, switch is off");
        } else if (z40.e.l4()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizFlutterDigestHelper", "use Finder exp, skip initFinderLiveDot");
        } else {
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.g0.f299596b.d(yw.p0.f547954a);
        }
        ur1.j jVar = ur1.j.f511887a;
        if (ur1.n.f511894a.a()) {
            jVar.a().d(ur1.f.f511883a);
            jVar.a().h("biz_publish_personal_center_event", ur1.i.f511886a);
        }
        java.lang.String i17 = com.p314xaae8f345.mm.vfs.w6.i(com.p314xaae8f345.mm.vfs.q7.c("biz_persist"), false);
        java.lang.String j17 = gm0.j1.b().j();
        if (!com.p314xaae8f345.mm.vfs.w6.j(i17)) {
            com.p314xaae8f345.mm.vfs.w6.u(i17);
        }
        dw5.a aVar = new dw5.a();
        aVar.f325832d = false;
        boolean[] zArr = aVar.f325842q;
        zArr[1] = true;
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        aVar.f325833e = false;
        zArr[2] = true;
        java.lang.Boolean bool = f547976g;
        aVar.f325834f = bool != null ? bool.booleanValue() : false;
        boolean[] zArr2 = aVar.f325842q;
        zArr2[3] = true;
        aVar.f325835g = f547972c;
        zArr2[4] = true;
        aVar.f325836h = yw.h1.f547872h;
        zArr2[5] = true;
        aVar.f325837i = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_biz_time_empty_list_resort, 0) == 1;
        boolean[] zArr3 = aVar.f325842q;
        zArr3[6] = true;
        aVar.f325839n = false;
        zArr3[8] = true;
        aVar.f325838m = true;
        zArr3[7] = true;
        c01.y0 y0Var = c01.a1.f118578a;
        aVar.f325840o = y0Var.a().o("BizTLRecommendFeedsEnterBoxFilter", 0) == 1;
        aVar.f325842q[9] = true;
        aVar.f325841p = y0Var.a().o("BizTLRecommendFeedsOutBoxPullFeedsControlSwitch", 0);
        aVar.f325842q[10] = true;
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.g0 g0Var = com.p314xaae8f345.p3133xd0ce8b26.mm.biz.g0.f299596b;
        g0Var.p(i17, j17, o45.wf.f424562g, aVar, yw.j3.f547900a);
        dw5.q qVar = new dw5.q();
        qVar.f325941d = h1Var.j();
        qVar.f325949o[1] = true;
        qVar.f325942e = h1Var.m().o("lift_read_area_size", 0);
        qVar.f325949o[2] = true;
        qVar.f325943f = h1Var.k();
        qVar.f325949o[3] = true;
        qVar.f325944g = h1Var.m().q("resort_scene_bit_switch", 0L);
        qVar.f325949o[4] = true;
        qVar.f325945h = h1Var.m().o("resort_blocked_when_client_running_back", 0);
        qVar.f325949o[5] = true;
        qVar.f325946i = y0Var.a().o("BizTLRecommendFeedsBatchWithBizMsgResort", 0);
        qVar.f325949o[6] = true;
        qVar.f325947m = y0Var.a().o("BizTLRecommendFeedsOutBoxPullFeedsNeedUplineCard", 0);
        qVar.f325949o[7] = true;
        qVar.f325948n = h1Var.q();
        qVar.f325949o[8] = true;
        g0Var.J(1, qVar, yw.k3.f547917a);
        f547973d = true;
    }

    public final void e(java.lang.String type, java.lang.String xml) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(xml, "xml");
        if (!f547973d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FlutterBizMsgBridge", "onReceiveXmlPush hasInit=" + f547973d);
        } else {
            if (!yw.h1.f547865a.n()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FlutterBizMsgBridge", "onReceiveXmlPush but not use aff. discard this msg");
                return;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.c()) {
                d();
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.g0.f299596b.B(type, xml, yw.n3.f547943a);
        }
    }
}
