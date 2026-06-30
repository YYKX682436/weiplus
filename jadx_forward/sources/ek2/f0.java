package ek2;

/* loaded from: classes.dex */
public final class f0 extends ek2.g0 {

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f334978u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(r45.kv0 finderBaseRequest, byte[] bArr, long j17, int i17, long j18, int i18, java.lang.String nonceId, java.lang.String str, java.lang.String finderUsername, r45.qt2 qt2Var, int i19, int i27, long j19, r45.o72 o72Var, java.lang.String str2, int i28, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        super(qt2Var);
        boolean z17;
        boolean z18;
        boolean z19;
        int i29 = (i28 & 1024) != 0 ? 1 : i19;
        int i37 = (i28 & 2048) != 0 ? 0 : i27;
        long j27 = (i28 & 4096) != 0 ? 0L : j19;
        r45.o72 o72Var2 = (i28 & 8192) != 0 ? null : o72Var;
        java.lang.String sessionBuffer = (i28 & 16384) != 0 ? "" : str2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderBaseRequest, "finderBaseRequest");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nonceId, "nonceId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUsername, "finderUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionBuffer, "sessionBuffer");
        this.f334978u = "Finder.CgiFinderLikeLive";
        r45.nd1 nd1Var = new r45.nd1();
        nd1Var.set(1, finderBaseRequest);
        nd1Var.set(2, java.lang.Long.valueOf(j17));
        nd1Var.set(4, com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(bArr));
        nd1Var.set(5, java.lang.Long.valueOf(j18));
        nd1Var.set(6, 0L);
        nd1Var.set(7, 0);
        nd1Var.set(8, zl2.q4.f555466a.m());
        nd1Var.set(3, java.lang.Long.valueOf(i17));
        nd1Var.set(9, java.lang.Integer.valueOf(i18));
        nd1Var.set(11, nonceId);
        nd1Var.set(12, finderUsername);
        nd1Var.set(13, o72Var2);
        nd1Var.set(10, java.lang.Integer.valueOf(i29));
        nd1Var.set(14, java.lang.Integer.valueOf(i37));
        nd1Var.set(15, java.lang.Long.valueOf(j27));
        db2.t4.f309704a.h((r45.kv0) nd1Var.m75936x14adae67(1), null, kz5.b0.c(new jz5.o(java.lang.Integer.valueOf(qt2Var != null ? qt2Var.m75939xb282bd08(7) : 0), java.lang.Long.valueOf(j18), str)));
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = nd1Var;
        r45.od1 od1Var = new r45.od1();
        od1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) od1Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = od1Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderlikelive";
        lVar.f152200d = 564;
        p(lVar.a());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[likeInfo]like live id:");
        sb6.append(j17);
        sb6.append(" objectId:");
        sb6.append(j18);
        sb6.append(" count:");
        sb6.append(i17);
        sb6.append(",finder_username is empty:");
        sb6.append(nd1Var.m75945x2fec8307(12) == null);
        sb6.append(",live_identity:");
        r45.kv0 kv0Var = (r45.kv0) nd1Var.m75936x14adae67(1);
        sb6.append(kv0Var != null ? java.lang.Integer.valueOf(kv0Var.m75939xb282bd08(6)) : null);
        sb6.append(", optype:");
        sb6.append(i29);
        sb6.append(", source:");
        sb6.append(i37);
        sb6.append(", accumulateLikeCount:");
        sb6.append(j27);
        sb6.append(", liveCookie-is-not-null:");
        if (bArr != null) {
            if (bArr.length == 0) {
                z19 = true;
                z18 = true;
            } else {
                z18 = false;
                z19 = true;
            }
            if ((!z18) == z19) {
                z17 = z19;
                sb6.append(z17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderLikeLive", sb6.toString());
            }
        }
        z17 = false;
        sb6.append(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderLikeLive", sb6.toString());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.od1 resp = (r45.od1) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f334978u, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
    }
}
