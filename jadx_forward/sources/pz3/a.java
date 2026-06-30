package pz3;

/* loaded from: classes10.dex */
public final class a extends com.p314xaae8f345.mm.p944x882e457a.i {
    public a(int i17, java.lang.String url, r45.fw5 searchContactContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(searchContactContext, "searchContactContext");
        r45.c05 c05Var = new r45.c05();
        c05Var.f452725d = i17;
        if (i17 == 1) {
            r45.c15 c15Var = new r45.c15();
            c15Var.f452752e = url;
            c15Var.f452751d = searchContactContext;
            c05Var.f452726e = c15Var;
        } else if (i17 == 2) {
            r45.d15 d15Var = new r45.d15();
            d15Var.f453525e = url;
            d15Var.f453524d = searchContactContext;
            c05Var.f452727f = d15Var;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiScanJoinOpenIMRoomReport", "reportScanOpenIMRoom reportType: " + i17 + ", url: " + url + ", searchContactContext: " + searchContactContext);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 15693;
        lVar.f152199c = "/cgi-bin/micromsg-bin/openimdatareport";
        lVar.f152197a = c05Var;
        lVar.f152198b = new r45.d05();
        p(lVar.a());
    }
}
