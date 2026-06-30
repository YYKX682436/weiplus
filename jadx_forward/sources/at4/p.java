package at4;

/* loaded from: classes4.dex */
public class p extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.h1 {
    public p(java.lang.String str, java.lang.String str2, java.util.LinkedList linkedList) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.rf rfVar = new r45.rf();
        rfVar.f466317d = str;
        rfVar.f466318e = str2;
        rfVar.f466319f = linkedList;
        lVar.f152197a = rfVar;
        lVar.f152198b = new r45.sf();
        lVar.f152199c = "/cgi-bin/mmpay-bin/hb/batchgetorders";
        lVar.f152200d = 5066;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiBatchGetOrders", "CgiBatchGetOrders sessionUsername:%s", str2);
    }
}
