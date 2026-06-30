package y92;

/* loaded from: classes2.dex */
public final class a {
    public a(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final com.p314xaae8f345.mm.p944x882e457a.o a(r45.la1 request) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = request;
        r45.ma1 ma1Var = new r45.ma1();
        ma1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) ma1Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = ma1Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/findergettopicinfo";
        lVar.f152200d = 6277;
        if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40539x7a994349()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Cgi.FinderGetTopicInfoCgi", "initReqResp init request:" + request.mo12245xcc313de3());
        }
        return lVar.a();
    }
}
