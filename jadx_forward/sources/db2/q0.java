package db2;

/* loaded from: classes2.dex */
public final class q0 extends az2.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(java.lang.String activityId, java.lang.String str, byte[] bArr, long j17, long j18, java.lang.String str2, int i17, boolean z17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        super(null, null, 3, null);
        java.lang.String finderUsername = (i18 & 2) != 0 ? "" : str;
        byte[] bArr2 = (i18 & 4) != 0 ? null : bArr;
        long j19 = (i18 & 8) != 0 ? 0L : j17;
        long j27 = (i18 & 16) == 0 ? j18 : 0L;
        java.lang.String noticeId = (i18 & 32) == 0 ? str2 : "";
        boolean z18 = (i18 & 128) != 0 ? true : z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activityId, "activityId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUsername, "finderUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(noticeId, "noticeId");
        r45.yr1 yr1Var = new r45.yr1();
        yr1Var.set(1, db2.t4.f309704a.a(10635));
        yr1Var.set(2, activityId);
        yr1Var.set(4, java.lang.Long.valueOf(j19));
        yr1Var.set(5, com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(bArr2));
        yr1Var.set(3, java.lang.Long.valueOf(j27));
        yr1Var.set(6, noticeId);
        yr1Var.set(7, java.lang.Integer.valueOf(i17));
        yr1Var.set(8, finderUsername);
        yr1Var.set(9, java.lang.Boolean.valueOf(z18));
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = yr1Var;
        r45.zr1 zr1Var = new r45.zr1();
        zr1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) zr1Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = zr1Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderlivegetconcertticket";
        lVar.f152200d = 10635;
        p(lVar.a());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.zr1 resp = (r45.zr1) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
    }
}
