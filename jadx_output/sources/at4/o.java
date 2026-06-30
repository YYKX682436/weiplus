package at4;

/* loaded from: classes2.dex */
public class o extends com.tencent.mm.wallet_core.model.h1 {
    public o(java.lang.String str, java.util.LinkedList linkedList) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.b bVar = new r45.b();
        bVar.f370383e = str;
        bVar.f370382d = linkedList;
        lVar.f70664a = bVar;
        lVar.f70665b = new r45.c();
        lVar.f70666c = "/cgi-bin/mmpay-bin/newaabatchqueryorderinfo";
        lVar.f70667d = 5019;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiAABatchQueryOrderInfo", "CgiAABatchQueryOrderInfo groupId:%s", str);
    }
}
