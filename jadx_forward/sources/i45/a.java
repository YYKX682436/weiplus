package i45;

/* loaded from: classes8.dex */
public class a extends com.p314xaae8f345.mm.p944x882e457a.i {
    public a(java.lang.String wtId, java.lang.String wxId, java.lang.String token) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wtId, "wtId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wxId, "wxId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(token, "token");
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.m44 m44Var = new r45.m44();
        r45.uy6 uy6Var = new r45.uy6();
        uy6Var.f469273d = wtId;
        uy6Var.f469274e = wxId;
        uy6Var.f469275f = token;
        m44Var.f461674d = uy6Var;
        r45.n44 n44Var = new r45.n44();
        n44Var.mo11485x1f73abb4(new r45.ie());
        n44Var.mo11484xe92ab0a8().f458493e = new r45.du5();
        lVar.f152197a = m44Var;
        lVar.f152198b = n44Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/keyboardverifywxtoken";
        lVar.f152200d = 11329;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiKeyBoardVerifyWxToken", "request wtId:" + wtId + ", wxId:" + wxId + ", token:" + token);
    }
}
