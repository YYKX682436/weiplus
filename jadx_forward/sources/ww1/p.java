package ww1;

/* loaded from: classes8.dex */
public class p extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.h1 {
    public p(int i17, int i18, java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, boolean z17, java.lang.String str3) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiSaveQrcodeNotifyMch", "CgiSaveQrcodeNotifyMch request：notifyType：%s，amount：%s，memo：%s，url：%s , desc_required:%s descPlaceholder:%s ", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, str2, java.lang.Boolean.valueOf(z17), str3);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.yw ywVar = new r45.yw();
        ywVar.f472963d = i17;
        ywVar.f472964e = i18;
        ywVar.f472965f = str;
        ywVar.f472966g = str2;
        ywVar.f472967h = (int) (java.lang.System.currentTimeMillis() / 1000);
        ywVar.f472968i = gVar;
        ywVar.f472969m = z17;
        ywVar.f472970n = str3;
        lVar.f152197a = ywVar;
        lVar.f152198b = new r45.zw();
        lVar.f152199c = "/cgi-bin/mmpay-bin/sjtsaveqrnotify";
        lVar.f152200d = 4590;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        p(lVar.a());
    }
}
