package d35;

/* loaded from: classes12.dex */
public final class b extends com.p314xaae8f345.mm.p944x882e457a.i {
    static {
        new d35.a(null);
    }

    public b(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d attachInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attachInfo, "attachInfo");
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.yy5 yy5Var = new r45.yy5();
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 n17 = pt0.f0.f439742b1.n(attachInfo.f68107xaaaa6883, attachInfo.f68106x315a5445);
        yy5Var.f473033d = n17.Q0();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(java.lang.Long.valueOf(n17.m124847x74d37ac6()));
        sb6.append('_');
        sb6.append(java.lang.Long.valueOf(n17.mo78012x3fdd41df()));
        yy5Var.f473034e = sb6.toString();
        yy5Var.f473035f = 1;
        java.lang.String j17 = n17.j();
        v05.b bVar = new v05.b();
        bVar.m126728xdc93280d(j17 == null ? "" : j17);
        int i17 = bVar.f513848e;
        int i18 = i17 + 24;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bVar.m75945x2fec8307(i18))) {
            java.lang.String e17 = com.p314xaae8f345.mm.p947xba6de98f.s1.cj().e(attachInfo.f68099xfeae815);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e17, "nativeGetFileMD5(...)");
            bVar.set(i18, e17);
            l15.c cVar = new l15.c();
            cVar.q(bVar);
            n17.d1(cVar.m126747x696739c());
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(n17.m124847x74d37ac6(), n17, true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CgiSendFileUploadMsg", "set filemd5! msgId:" + java.lang.Long.valueOf(n17.m124847x74d37ac6()) + " path:" + attachInfo.f68099xfeae815);
        }
        r45.xy5 xy5Var = new r45.xy5();
        java.lang.String wi6 = ((bf5.o) ((e40.u) i95.n0.c(e40.u.class))).wi(bVar);
        xy5Var.f472128d = wi6 == null ? bVar.m75945x2fec8307(bVar.f449898d + 2) : wi6;
        v05.a aVar = (v05.a) bVar.m75936x14adae67(i17 + 8);
        xy5Var.f472129e = aVar != null ? aVar.r() : null;
        xy5Var.f472130f = bVar.m75945x2fec8307(i18);
        xy5Var.f472131g = com.p314xaae8f345.mm.vfs.w6.k(attachInfo.f68099xfeae815);
        yy5Var.f473036g = xy5Var;
        d35.i iVar = d35.i.f307880a;
        iVar.e();
        com.p314xaae8f345.mm.p814xbdd5bcd6.C10816x92410e25 c10816x92410e25 = new com.p314xaae8f345.mm.p814xbdd5bcd6.C10816x92410e25();
        c10816x92410e25.f29625x8f754a11 = com.p314xaae8f345.mm.p947xba6de98f.s1.cj().d();
        c10816x92410e25.cgi = iVar.a(n17);
        c10816x92410e25.f29626xd426afc1 = com.p314xaae8f345.mm.vfs.w6.i(attachInfo.f68099xfeae815, false);
        c10816x92410e25.f29628x811af173 = (int) iVar.b();
        c10816x92410e25.f29629xd6988f5b = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_file_lan_send_total_send_timeout_ms, -1);
        c10816x92410e25.f29624xb6bcc140 = (int) ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.d0.clicfg_file_lan_send_between_request_timeout_ms, 60000L);
        com.p314xaae8f345.mm.p814xbdd5bcd6.C10815xe2d7656b.m46373x9a115c0b(c10816x92410e25);
        java.lang.String cgi = c10816x92410e25.cgi;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(cgi, "cgi");
        java.lang.String cryptKey = c10816x92410e25.f29625x8f754a11;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(cryptKey, "cryptKey");
        java.lang.String c17 = iVar.c(cgi, cryptKey);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileSmartServerMgr", "addFileInfo msgInfo:" + n17.m124847x74d37ac6() + " filePath:" + attachInfo.f68099xfeae815 + " url:" + c17 + " aesKey:" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(c10816x92410e25.f29625x8f754a11));
        if (c17 != null) {
            yy5Var.f473039m = c17;
        }
        r45.zy5 zy5Var = new r45.zy5();
        zy5Var.mo11485x1f73abb4(new r45.ie());
        zy5Var.mo11484xe92ab0a8().f458493e = new r45.du5();
        lVar.f152197a = yy5Var;
        lVar.f152198b = zy5Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/sendfileuploadmsg";
        lVar.f152200d = 6691;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiSendFileUploadMsg", "request msgId:" + attachInfo.f68106x315a5445 + " md5:" + xy5Var.f472130f + " fileExt:" + xy5Var.f472129e + " path:" + attachInfo.f68099xfeae815 + " lanInfo:" + yy5Var.f473039m);
    }
}
