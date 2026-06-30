package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class ve extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.b6 {

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 f287382g;

    public ve(yb5.d dVar, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 a0Var) {
        super(dVar);
        this.f287382g = a0Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.b6
    public void a(android.view.View view, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        int i17;
        java.lang.String str;
        ((fq3.w) ((bx1.t) i95.n0.c(bx1.t.class))).Di(f9Var.Q0(), 1);
        ot0.q v17 = ot0.q.v(c01.w9.l(dVar.D(), f9Var.j(), f9Var.A0()));
        if (v17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WeishiVideoClickListener", "weishi chatItemClick, content is null");
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(v17.f430210k2) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(v17.f430206j2)) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", ((kt.e) ((lt.m0) i95.n0.c(lt.m0.class))).wi(v17.f430207k, dVar.D() ? "groupmessage" : "singlemessage"));
            intent.putExtra("webpageTitle", v17.f430187f);
            intent.putExtra("shortUrl", v17.f430207k);
            j45.l.j(dVar.g(), "webview", ".ui.tools.WebViewUI", intent, null);
            return;
        }
        java.lang.String x17 = dVar.x();
        java.lang.String A = this.f287382g.A(dVar, f9Var);
        android.os.Bundle bundle = new android.os.Bundle();
        if (dVar.D()) {
            bundle.putInt("stat_scene", 2);
        } else {
            bundle.putInt("stat_scene", c01.e2.G(x17) ? 7 : 1);
        }
        bundle.putString("stat_msg_id", "msg_" + java.lang.Long.toString(f9Var.I0()));
        bundle.putString("stat_chat_talker_username", x17);
        bundle.putString("stat_send_msg_user", A);
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        java.lang.String str2 = v17.f430179d;
        int i18 = v17.G;
        ((kt.c) i0Var).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m i19 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.i(str2, i18);
        bundle.putString("stat_weishi_app_name", (i19 == null || (str = i19.f67372x453d1e07) == null || str.trim().length() <= 0) ? v17.H : i19.f67372x453d1e07);
        bundle.putString("stat_weishi_app_id", v17.f430179d);
        bundle.putString("stat_weishi_source_username", v17.f430255w);
        ot0.a aVar = (ot0.a) v17.y(ot0.a.class);
        bundle.putBoolean("stat_weishi_from_opensdk", aVar != null && aVar.D == 1);
        bundle.putString("stat_weishi_msg_img_path", f9Var.z0());
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        bundle.putString("stat_weishi_thumb_path", m11.b1.Di().D2(f9Var, f9Var.z0(), true));
        bundle.putString("stat_weishi_thumb_url", aVar != null ? aVar.C : null);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.d(16979, v17.f430210k2, v17.f430202i2, 0, 1);
        g0Var.mo68477x336bdfd8(1129L, 0L, 1L, false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6 h6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class);
        android.app.Activity g17 = dVar.g();
        boolean D = dVar.D();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) h6Var).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559();
        com.p314xaae8f345.mm.p942x40c3c02f.C11105x57aff1b9 c11105x57aff1b9 = new com.p314xaae8f345.mm.p942x40c3c02f.C11105x57aff1b9();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98 c11812xa040dc98 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98();
        if (bundle.getBoolean("stat_weishi_from_opensdk", false)) {
            ot0.a aVar2 = (ot0.a) v17.y(ot0.a.class);
            if (aVar2 == null || (i17 = aVar2.O) <= 0) {
                c12559xbdae8559.f169323f = 1036;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeAppLauncher", "launchWeishiVideoMiniProgram use VISIT_SCENE_FROM_OPEN_SDK scene");
            } else {
                c12559xbdae8559.f169323f = i17;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeAppLauncher", "launchWeishiVideoMiniProgram use launchscene:%d", java.lang.Integer.valueOf(i17));
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.lang.String str3 = v17.f430179d;
            if (str3 == null) {
                str3 = "";
            }
            sb6.append(str3);
            sb6.append(":");
            java.lang.String a17 = fp.s0.a(v17.f430207k);
            if (a17 == null) {
                a17 = "";
            }
            sb6.append(a17);
            sb6.append(":");
            java.lang.String str4 = v17.f430222n2;
            sb6.append(str4 != null ? str4 : "");
            c12559xbdae8559.f169324g = sb6.toString();
            c12559xbdae8559.f169321d = D ? 2 : 1;
            if (D) {
                A = java.lang.String.format("%s:%s", x17, A);
            }
            c12559xbdae8559.f169322e = A;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeAppLauncher", "launchWeishiVideoMiniProgram, from opensdk appmsg, scene:%s", java.lang.Integer.valueOf(c12559xbdae8559.f169323f));
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(v17.f430226o2)) {
                c12559xbdae8559.f169324g += ":0";
            } else {
                c12559xbdae8559.f169324g += ":1";
            }
            c11812xa040dc98.f158856e = v17.f430179d;
            c11812xa040dc98.f158855d = 4;
        } else {
            java.lang.String str5 = v17.f430222n2;
            if (D) {
                c12559xbdae8559.f169323f = 1008;
                c12559xbdae8559.f169324g = x17 + ":" + A + ":" + str5;
            } else {
                c12559xbdae8559.f169323f = 1007;
                c12559xbdae8559.f169324g = A + ":" + str5;
            }
            c12559xbdae8559.f169321d = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.z0.a(c12559xbdae8559.f169323f, bundle);
            c12559xbdae8559.f169322e = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.z0.b(c12559xbdae8559.f169323f, bundle);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeAppLauncher", "launchWeishiVideoMiniProgram, from chatting appmsg, scene:%s", java.lang.Integer.valueOf(c12559xbdae8559.f169323f));
            c11812xa040dc98.f158856e = v17.f430179d;
            c11812xa040dc98.f158855d = 6;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(v17.f430226o2)) {
            c11105x57aff1b9.f151948d = x17;
            c11105x57aff1b9.f151949e = v17.f430226o2;
        }
        oe1.b2.a(v17.f430210k2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.ActivityC12328x4aa1de9.e7(g17, v17.f430206j2, v17.f430210k2, v17.f430202i2, v17.f430270z2, v17.A2, c12559xbdae8559, c11812xa040dc98, c11105x57aff1b9);
    }
}
