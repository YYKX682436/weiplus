package ww1;

/* loaded from: classes8.dex */
public class j extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.h1 {
    public j(int i17, java.lang.String str, java.lang.String str2, boolean z17, java.lang.String str3, int i18, long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiF2fShortTermQrcodeMch", "fee:%s，fee_type:%s，desc:%s payer_desc_required：%s, payer_desc_placeholder：%s, scene:%s", java.lang.Integer.valueOf(i17), str, str2, java.lang.Boolean.valueOf(z17), str3, java.lang.Integer.valueOf(i18));
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.kw kwVar = new r45.kw();
        kwVar.f460526f = str2;
        if (i17 == 0) {
            kwVar.f460524d = "";
        } else {
            kwVar.f460524d = i17 + "";
        }
        kwVar.f460525e = str;
        kwVar.f460527g = z17;
        kwVar.f460528h = str3;
        kwVar.f460529i = i18;
        kwVar.f460530m = j17;
        lVar.f152197a = kwVar;
        lVar.f152198b = new r45.lw();
        lVar.f152200d = 4419;
        lVar.f152199c = "/cgi-bin/mmpay-bin/sjtgetshorttermmchqr";
        p(lVar.a());
    }
}
