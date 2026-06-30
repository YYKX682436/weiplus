package ek2;

/* loaded from: classes.dex */
public final class m1 extends ek2.g0 {
    public m1(byte[] bArr, long j17, long j18, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17) {
        super(null, 1, null);
        r45.oy1 oy1Var = new r45.oy1();
        oy1Var.set(1, db2.t4.f309704a.a(19408));
        oy1Var.set(2, com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(bArr));
        oy1Var.set(3, java.lang.Long.valueOf(j17));
        oy1Var.set(4, java.lang.Long.valueOf(j18));
        oy1Var.set(5, str);
        oy1Var.set(6, str2);
        oy1Var.set(7, str3);
        oy1Var.set(8, java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CgiFinderLiveLikeAudience", "CgiFinderLiveLikeAudience:liveCookies=" + bArr + ",liveId=" + j17 + ",objectId=" + j18 + ",objectNonceId=" + str + ",finderUserName=" + str2 + ",micId=" + str3 + ",count=" + i17);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = oy1Var;
        r45.py1 py1Var = new r45.py1();
        py1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) py1Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = py1Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderlivelikeaudience";
        lVar.f152200d = 19408;
        p(lVar.a());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.py1 resp = (r45.py1) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CgiFinderLiveLikeAudience", "CgiFinderLiveLikeAudience onCgiEnd:errType=" + i17 + ",errCode=" + i18 + ",errMsg=" + str);
    }
}
