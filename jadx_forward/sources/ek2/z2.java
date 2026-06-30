package ek2;

/* loaded from: classes.dex */
public final class z2 extends ek2.g0 {

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f335117u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(r45.kv0 finderBaseRequest, long j17, java.lang.String finderUsername, long j18, int i17, java.lang.String str, int i18, ek2.y2 y2Var, java.lang.String str2, int i19, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, int i27, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        super(null, 1, null);
        java.lang.String str3 = (i27 & 32) != 0 ? null : str;
        int i28 = (i27 & 64) != 0 ? 0 : i18;
        java.lang.String str4 = (i27 & 256) != 0 ? null : str2;
        int i29 = (i27 & 512) != 0 ? 0 : i19;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = (i27 & 1024) != 0 ? null : gVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderBaseRequest, "finderBaseRequest");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUsername, "finderUsername");
        this.f335117u = "Finder.CgiFinderOnlineMember";
        r45.w71 w71Var = new r45.w71();
        w71Var.set(1, finderBaseRequest);
        w71Var.set(2, java.lang.Long.valueOf(j17));
        w71Var.set(4, finderUsername);
        w71Var.set(3, java.lang.Long.valueOf(j18));
        w71Var.set(6, java.lang.Integer.valueOf(i17));
        w71Var.set(9, str3);
        w71Var.set(10, str4);
        w71Var.set(11, java.lang.Integer.valueOf(i29));
        w71Var.set(12, java.lang.Integer.valueOf(i28));
        w71Var.set(13, gVar2);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = w71Var;
        r45.x71 x71Var = new r45.x71();
        x71Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) x71Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = x71Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/findergetliveonlinemember";
        lVar.f152200d = 3603;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderOnlineMember", "[initReqResp] liveId =" + w71Var.m75942xfb822ef2(2) + " finderUsername=" + w71Var.m75945x2fec8307(4) + " scene=" + w71Var.m75939xb282bd08(6) + " onlineMemBuf = " + w71Var.m75934xbce7f2f(13) + " micId=" + w71Var.m75945x2fec8307(9) + " boardKey=" + w71Var.m75945x2fec8307(10) + " boardType=" + w71Var.m75939xb282bd08(11));
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.x71 resp = (r45.x71) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f335117u, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
    }
}
