package ww1;

/* loaded from: classes9.dex */
public class o extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.h1 {
    public o(int i17, int i18, java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, boolean z17, java.lang.String str3) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiSaveQrcodeNotify", "CgiSaveQrcodeNotify request：notifyType：%s，amount：%s，memo：%s，url：%s , desc_required:%s descPlaceholder:%s ", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, str2, java.lang.Boolean.valueOf(z17), str3);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.ax axVar = new r45.ax();
        axVar.f451852d = i17;
        axVar.f451853e = i18;
        axVar.f451854f = str;
        axVar.f451855g = str2;
        axVar.f451856h = (int) (java.lang.System.currentTimeMillis() / 1000);
        axVar.f451857i = gVar;
        axVar.f451858m = z17;
        axVar.f451859n = str3;
        lVar.f152197a = axVar;
        lVar.f152198b = new r45.bx();
        lVar.f152199c = "/cgi-bin/mmpay-bin/qrcodesavenotify";
        lVar.f152200d = 3781;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        p(lVar.a());
    }
}
