package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes4.dex */
public final class ai extends com.p314xaae8f345.mm.p944x882e457a.i {
    public ai(java.lang.String userName, java.lang.String url) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        jz5.g b17 = jz5.h.b(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.zh(userName, url));
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = (r45.tj3) ((jz5.n) b17).mo141623x754a37bb();
        lVar.f152198b = new r45.uj3();
        lVar.f152199c = "/cgi-bin/micromsg-bin/getopenimarchivepopupinfo";
        lVar.f152200d = 6987;
        p(lVar.a());
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.i
    /* renamed from: k */
    public void x(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetArchiveInfo", "onCgiBack errType:" + i17 + " errCode:" + i18 + " errMsg:" + str);
    }
}
