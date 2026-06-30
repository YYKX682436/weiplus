package d35;

@j95.b
/* loaded from: classes12.dex */
public final class j extends jm0.o implements qx.h0 {
    public java.lang.String Zi(oi3.g gVar, java.lang.String sendFilePath) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sendFilePath, "sendFilePath");
        d35.i iVar = d35.i.f307880a;
        if (gVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileSmartServerMgr", "msgInfo is null, or attachInfo is null");
            return null;
        }
        iVar.e();
        com.p314xaae8f345.mm.p814xbdd5bcd6.C10816x92410e25 c10816x92410e25 = new com.p314xaae8f345.mm.p814xbdd5bcd6.C10816x92410e25();
        c10816x92410e25.f29625x8f754a11 = com.p314xaae8f345.mm.p947xba6de98f.s1.cj().d();
        boolean z17 = d35.i.f307881b;
        int i17 = gVar.f427150d;
        if (z17) {
            str = "/lan_" + gVar.m75945x2fec8307(i17 + 3) + '_' + gm0.m.g() + '_' + gVar.m75942xfb822ef2(i17 + 0) + '_' + gVar.m75942xfb822ef2(i17 + 2);
        } else {
            str = "";
        }
        c10816x92410e25.cgi = str;
        c10816x92410e25.f29626xd426afc1 = com.p314xaae8f345.mm.vfs.w6.i(sendFilePath, false);
        c10816x92410e25.f29628x811af173 = (int) iVar.b();
        c10816x92410e25.f29629xd6988f5b = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_file_lan_send_total_send_timeout_ms, -1);
        c10816x92410e25.f29624xb6bcc140 = (int) ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.d0.clicfg_file_lan_send_between_request_timeout_ms, 60000L);
        com.p314xaae8f345.mm.p814xbdd5bcd6.C10815xe2d7656b.m46373x9a115c0b(c10816x92410e25);
        java.lang.String cgi = c10816x92410e25.cgi;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(cgi, "cgi");
        java.lang.String cryptKey = c10816x92410e25.f29625x8f754a11;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(cryptKey, "cryptKey");
        java.lang.String c17 = iVar.c(cgi, cryptKey);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileSmartServerMgr", "addFileInfo msgInfo:" + gVar.m75942xfb822ef2(i17 + 0) + " filePath:" + sendFilePath + " url:" + c17 + " aesKey:" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(c10816x92410e25.f29625x8f754a11));
        return c17;
    }

    public void aj(long j17, java.lang.String str) {
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d J0 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.wi().J0(j17, str);
        if (J0 != null) {
            com.p314xaae8f345.mm.vfs.w6.h(J0.f68099xfeae815);
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.wi().mo9951xb06685ab(J0, "msgInfoId");
        }
        tg3.o1 o1Var = tg3.p1.f500739a;
        if (str == null) {
            str = "";
        }
        o1Var.e(str, j17);
    }

    public boolean bj() {
        return j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2529x2ff57c.C20165x8e783398()) != 1;
    }
}
