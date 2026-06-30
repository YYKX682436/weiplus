package r33;

/* loaded from: classes4.dex */
public final class a extends r33.i {
    public a(java.util.LinkedList linkedList) {
        p33.b bVar = new p33.b();
        p33.d dVar = new p33.d();
        p33.a aVar = new p33.a();
        aVar.f433050d = linkedList;
        bVar.f433053d = aVar;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = bVar;
        lVar.f152198b = dVar;
        lVar.f152200d = 4647;
        lVar.f152199c = "/cgi-bin/mmgame-bin/gamegamelifeappsvr/batchgetcontentinfobycontentid";
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        p(lVar.a());
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = linkedList != null ? java.lang.Integer.valueOf(linkedList.size()) : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiGetInteractiveMsgContentRequest", "contentIdList。size: %d", objArr);
    }
}
