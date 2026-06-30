package ek2;

/* loaded from: classes.dex */
public final class w0 extends ek2.g0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(java.lang.String finder_username, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, long j17, long j18, java.lang.String str, int i17, r45.ss1 reqBuffer) {
        super(null, 1, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finder_username, "finder_username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reqBuffer, "reqBuffer");
        r45.cs1 cs1Var = new r45.cs1();
        cs1Var.set(1, db2.t4.f309704a.b(4119, this.f97668n));
        cs1Var.set(2, finder_username);
        cs1Var.set(3, gVar);
        cs1Var.set(4, java.lang.Long.valueOf(j17));
        cs1Var.set(5, java.lang.Long.valueOf(j18));
        cs1Var.set(6, str);
        cs1Var.set(7, java.lang.Integer.valueOf(i17));
        cs1Var.set(8, hc2.b.a(reqBuffer));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderLiveGetDeliveryDetail", "#init objectId=" + j17 + " liveId=" + j18 + " objectNonceId=" + str + " cmdId=" + i17 + " reqBuffer.package_id=" + reqBuffer.m75945x2fec8307(0));
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = cs1Var;
        r45.ds1 ds1Var = new r45.ds1();
        ds1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) ds1Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = ds1Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderlivegetdeliverydetail";
        lVar.f152200d = 4119;
        p(lVar.a());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.ds1 resp = (r45.ds1) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#onCgiEnd errType=");
        sb6.append(i17);
        sb6.append(" errCode=");
        sb6.append(i18);
        sb6.append(" errMsg=");
        sb6.append(str);
        sb6.append(", cmd_id:");
        sb6.append(resp.m75939xb282bd08(1));
        sb6.append(" resp_buffer:");
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = resp.m75934xbce7f2f(2);
        sb6.append(m75934xbce7f2f != null ? m75934xbce7f2f.i() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderLiveGetDeliveryDetail", sb6.toString());
    }
}
