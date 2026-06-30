package db2;

/* loaded from: classes.dex */
public final class k0 extends com.p314xaae8f345.mm.p944x882e457a.i {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f309570m;

    public k0(java.lang.String username, java.lang.String clientId, java.lang.String remoteUrl, java.lang.String appId, java.lang.String paramsJson) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clientId, "clientId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(remoteUrl, "remoteUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paramsJson, "paramsJson");
        this.f309570m = "Finder.CgiFinderFileDump";
        r45.g31 g31Var = new r45.g31();
        g31Var.set(0, username);
        g31Var.set(1, clientId);
        g31Var.set(2, remoteUrl);
        g31Var.set(3, appId);
        g31Var.set(4, paramsJson);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderFileDump", "CgiFinderFileDump clientId:".concat(clientId));
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = g31Var;
        r45.h31 h31Var = new r45.h31();
        h31Var.set(3, new r45.ie());
        r45.ie ieVar = (r45.ie) h31Var.m75936x14adae67(3);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = h31Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderfiledump";
        lVar.f152200d = 4659;
        p(lVar.a());
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.i
    /* renamed from: k */
    public void x(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.h31 resp = (r45.h31) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f309570m, "onCgiBack errType:" + i17 + ", errCode:" + i18 + ", errMsg:" + str);
    }
}
