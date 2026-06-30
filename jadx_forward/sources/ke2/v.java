package ke2;

/* loaded from: classes.dex */
public final class v extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f388524t;

    public /* synthetic */ v(long j17, long j18, int i17, java.lang.String str, byte[] bArr, java.lang.String str2, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(j17, j18, i17, (i18 & 8) != 0 ? "" : str, (i18 & 16) != 0 ? null : bArr, str2, gVar, str3, str4, (i18 & 512) != 0 ? "" : str5);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.zs1 resp = (r45.zs1) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f388524t, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread() + ' ');
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(long j17, long j18, int i17, java.lang.String finderUsername, byte[] bArr, java.lang.String jumpId, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, java.lang.String str, java.lang.String str2, java.lang.String ecSource) {
        super(null, null, 2, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUsername, "finderUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpId, "jumpId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ecSource, "ecSource");
        this.f388524t = "Finder.CgiFinderLiveGetJumpInfo";
        r45.ys1 ys1Var = new r45.ys1();
        ys1Var.set(1, db2.t4.f309704a.a(6283));
        ys1Var.set(2, java.lang.Long.valueOf(j17));
        ys1Var.set(3, java.lang.Long.valueOf(j18));
        ys1Var.set(4, java.lang.Integer.valueOf(i17));
        ys1Var.set(5, jumpId);
        ys1Var.set(6, gVar);
        ys1Var.set(7, ecSource);
        ys1Var.set(8, finderUsername);
        ys1Var.set(9, bArr != null ? com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(bArr) : null);
        if (str != null) {
            ys1Var.set(10, com.p314xaae8f345.mm.p2495xc50a8b8b.g.c(str));
        }
        if (str2 != null) {
            ys1Var.set(11, com.p314xaae8f345.mm.p2495xc50a8b8b.g.c(str2));
        }
        ys1Var.set(12, 1);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = ys1Var;
        r45.zs1 zs1Var = new r45.zs1();
        zs1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) zs1Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = zs1Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderlivegetjumpinfo";
        lVar.f152200d = 6283;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderLiveGetJumpInfo", "init liveId:" + j18 + ", objectId:" + j17 + '}');
    }
}
