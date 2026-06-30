package db2;

/* loaded from: classes.dex */
public final class y0 extends ek2.g0 {

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f309772u;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f309773v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(java.lang.String targetFinderUsername, long j17, long j18, java.lang.String nonceId, java.lang.String str, int i17, java.lang.String highLightId, r45.qt2 contextObj, int i18, boolean z17, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, java.lang.String requestUniqueCode) {
        super(contextObj);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetFinderUsername, "targetFinderUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nonceId, "nonceId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(highLightId, "highLightId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextObj, "contextObj");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(requestUniqueCode, "requestUniqueCode");
        this.f309772u = requestUniqueCode;
        this.f309773v = "Finder.CgiFinderGetLiveMsgWithOffset";
        r45.s71 s71Var = new r45.s71();
        db2.t4 t4Var = db2.t4.f309704a;
        s71Var.set(1, t4Var.a(5806));
        s71Var.set(3, targetFinderUsername);
        s71Var.set(2, java.lang.Long.valueOf(j17));
        s71Var.set(4, java.lang.Long.valueOf(j18));
        s71Var.set(5, nonceId);
        s71Var.set(10, highLightId);
        s71Var.set(6, java.lang.Integer.valueOf(i18));
        s71Var.set(7, java.lang.Boolean.valueOf(z17));
        s71Var.set(9, gVar);
        s71Var.set(8, java.lang.Integer.valueOf(i17));
        t4Var.h((r45.kv0) s71Var.m75936x14adae67(1), null, kz5.b0.c(new jz5.o(java.lang.Integer.valueOf(contextObj.m75939xb282bd08(5)), java.lang.Long.valueOf(j18), str)));
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = s71Var;
        r45.t71 t71Var = new r45.t71();
        t71Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) t71Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = t71Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/findergetlivemsgwithoffset";
        lVar.f152200d = 5806;
        lVar.f152206j = true;
        lVar.f152207k = 25000;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderGetLiveMsgWithOffset", "CgiFinderGetLiveMsg init " + s71Var.m75942xfb822ef2(2) + ", object_id:" + pm0.v.u(s71Var.m75942xfb822ef2(4)) + ", nonce_id:" + s71Var.m75945x2fec8307(5) + ", offset:" + s71Var.m75939xb282bd08(6) + ", continual:" + s71Var.m75933x41a8a7f2(7) + ", username:" + s71Var.m75945x2fec8307(3) + ", scene:" + s71Var.m75939xb282bd08(8) + ",requestUniqueCode:" + requestUniqueCode);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.t71 resp = (r45.t71) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        resp.set(9, this.f309772u);
        java.lang.String str2 = this.f309773v;
        long j17 = this.f334985t;
        if (i17 == 0 && i18 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + ' ');
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(j17, 22L);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(j17, 23L);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(j17, 21L);
    }
}
