package rr4;

/* loaded from: classes2.dex */
public class b extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.h1 {
    public b(long j17, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.cw cwVar = new r45.cw();
        cwVar.f453390d = j17;
        cwVar.f453391e = str;
        cwVar.f453392f = str2;
        lVar.f152197a = cwVar;
        lVar.f152198b = new r45.dw();
        lVar.f152199c = "/cgi-bin/mmpay-bin/tenpay/getfreefeedetail";
        lVar.f152200d = 1236;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiGetFreeFeeDetail", "get free fee detail: %s, %s, %s", java.lang.Long.valueOf(j17), str, str2);
    }
}
