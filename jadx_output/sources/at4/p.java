package at4;

/* loaded from: classes4.dex */
public class p extends com.tencent.mm.wallet_core.model.h1 {
    public p(java.lang.String str, java.lang.String str2, java.util.LinkedList linkedList) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.rf rfVar = new r45.rf();
        rfVar.f384784d = str;
        rfVar.f384785e = str2;
        rfVar.f384786f = linkedList;
        lVar.f70664a = rfVar;
        lVar.f70665b = new r45.sf();
        lVar.f70666c = "/cgi-bin/mmpay-bin/hb/batchgetorders";
        lVar.f70667d = 5066;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiBatchGetOrders", "CgiBatchGetOrders sessionUsername:%s", str2);
    }
}
