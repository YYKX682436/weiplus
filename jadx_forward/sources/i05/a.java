package i05;

/* loaded from: classes8.dex */
public class a extends com.p314xaae8f345.mm.p944x882e457a.i {
    public a(java.lang.String wtId, java.lang.String wxId, java.lang.String token) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wtId, "wtId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wxId, "wxId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(token, "token");
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        i05.f fVar = new i05.f();
        i05.h hVar = new i05.h();
        hVar.f368106d = wtId;
        hVar.f368107e = wxId;
        hVar.f368108f = token;
        fVar.f368104d = hVar;
        i05.g gVar = new i05.g();
        gVar.mo11485x1f73abb4(new r45.ie());
        gVar.mo11484xe92ab0a8().f458493e = new r45.du5();
        lVar.f152197a = fVar;
        lVar.f152198b = gVar;
        lVar.f152199c = "/cgi-bin/micromsg-bin/keyboardverifywxtoken";
        lVar.f152200d = 11329;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiKeyBoardVerifyWxToken", "request wtId:" + wtId + ", wxId:" + wxId + ", token:" + token);
    }
}
