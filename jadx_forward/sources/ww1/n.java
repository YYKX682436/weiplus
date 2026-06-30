package ww1;

/* loaded from: classes9.dex */
public class n extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.h1 {
    public n(double d17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, java.lang.String str6, boolean z17, java.lang.String str7) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiSaveQrcodeMch", "CgiSaveQrcodeMch request ");
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.gx gxVar = new r45.gx();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.i0(d17 + "", "100"));
        sb6.append("");
        gxVar.f457116d = sb6.toString();
        gxVar.f457117e = str;
        gxVar.f457118f = str2;
        gxVar.f457119g = str3;
        gxVar.f457120h = str4;
        gxVar.f457121i = str5;
        gxVar.f457122m = gVar;
        gxVar.f457123n = str6;
        gxVar.f457124o = z17;
        gxVar.f457125p = str7;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiSaveQrcodeMch", "fee：%s desc:%s desc_required:%s descPlaceholder:%s", java.lang.Double.valueOf(d17), str6, java.lang.Boolean.valueOf(z17), str7);
        lVar.f152197a = gxVar;
        lVar.f152198b = new r45.hx();
        lVar.f152199c = "/cgi-bin/mmpay-bin/sjtsaveqrcheck";
        lVar.f152200d = 5166;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        p(lVar.a());
    }
}
