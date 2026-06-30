package t43;

/* loaded from: classes2.dex */
public final class a extends i43.a {
    public a(android.os.Bundle atInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(atInfo, "atInfo");
        o33.a aVar = new o33.a();
        o33.b bVar = new o33.b();
        aVar.f424257e = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(atInfo.getByteArray("context"));
        aVar.f424256d = atInfo.getString("contentId");
        aVar.f424258f = atInfo.getInt("limit", 50);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = aVar;
        lVar.f152198b = bVar;
        lVar.f152200d = 4712;
        lVar.f152199c = "/cgi-bin/mmgame-bin/gamegamelifeappsvr/getreminduserlist";
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiGetAtSomeoneList", "RemindUserList。content_id: %s", aVar.f424256d);
    }
}
