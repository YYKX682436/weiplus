package at4;

/* loaded from: classes2.dex */
public class o extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.h1 {
    public o(java.lang.String str, java.util.LinkedList linkedList) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.b bVar = new r45.b();
        bVar.f451916e = str;
        bVar.f451915d = linkedList;
        lVar.f152197a = bVar;
        lVar.f152198b = new r45.c();
        lVar.f152199c = "/cgi-bin/mmpay-bin/newaabatchqueryorderinfo";
        lVar.f152200d = 5019;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiAABatchQueryOrderInfo", "CgiAABatchQueryOrderInfo groupId:%s", str);
    }
}
