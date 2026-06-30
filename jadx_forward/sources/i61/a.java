package i61;

/* loaded from: classes8.dex */
public class a extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.h1 {
    public a(java.lang.String str, long j17, int i17, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        r45.w wVar = new r45.w();
        wVar.f470266d = str;
        wVar.f470267e = j17;
        wVar.f470268f = i17;
        wVar.f470269g = str2;
        wVar.f470270h = str3;
        wVar.f470271i = str4;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = wVar;
        lVar.f152198b = new r45.x();
        lVar.f152200d = 1344;
        lVar.f152199c = "/cgi-bin/mmpay-bin/newaapaysucc";
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiAAPaySucc", "CgiAAPaySucc, bill_no: %s, pay_amount: %s, scene: %s, groupid: %s, out_trade_no: %s, trans_id: %s", wVar.f470266d, java.lang.Long.valueOf(wVar.f470267e), java.lang.Integer.valueOf(wVar.f470268f), wVar.f470269g, wVar.f470270h, wVar.f470271i);
    }
}
