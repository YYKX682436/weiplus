package i61;

/* loaded from: classes2.dex */
public class d extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.h1 {
    public d(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.d dVar = new r45.d();
        dVar.f453485d = str;
        dVar.f453486e = str2;
        lVar.f152197a = dVar;
        lVar.f152198b = new r45.e();
        lVar.f152199c = "/cgi-bin/mmpay-bin/newaaclosenotify";
        lVar.f152200d = 1672;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiCloseAAUrgeNotify", "CgiCloseAAUrgeNotify, billNo: %s, chatroom: %s", str, str2);
    }
}
