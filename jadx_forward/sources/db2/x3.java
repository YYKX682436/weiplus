package db2;

/* loaded from: classes4.dex */
public final class x3 extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f309766t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public x3(java.util.LinkedList msgList, java.lang.String str) {
        super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgList, "msgList");
        this.f309766t = "Finder.CgiFinderTranslation";
        r45.jp3 jp3Var = new r45.jp3();
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = jp3Var;
        r45.kp3 kp3Var = new r45.kp3();
        kp3Var.mo11485x1f73abb4(new r45.ie());
        kp3Var.mo11484xe92ab0a8().f458493e = new r45.du5();
        lVar.f152198b = kp3Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/gettranstext";
        lVar.f152200d = 631;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        jp3Var.f459540e = msgList;
        jp3Var.f459539d = msgList.size();
        jp3Var.f459541f = str;
        p(a17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderTranslation", "init request.MsgCount " + jp3Var.f459539d);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.kp3 resp = (r45.kp3) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f309766t, "onCgiEnd errType " + i17 + ", errCode " + i18 + ", errMsg " + str);
    }
}
