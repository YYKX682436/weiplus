package db2;

/* loaded from: classes.dex */
public final class y1 extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f309774t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(long j17, long j18, com.p314xaae8f345.mm.p2495xc50a8b8b.g liveCookies, java.lang.String finderUsername, java.lang.String nonce_id, java.lang.String dislikeId) {
        super(null, null, 3, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveCookies, "liveCookies");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUsername, "finderUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nonce_id, "nonce_id");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dislikeId, "dislikeId");
        this.f309774t = "Finder.CgiFinderLiveDislikeBanner";
        r45.yo1 yo1Var = new r45.yo1();
        yo1Var.set(1, db2.t4.f309704a.a(4268));
        yo1Var.set(4, java.lang.Long.valueOf(j17));
        yo1Var.set(5, java.lang.Long.valueOf(j18));
        yo1Var.set(3, liveCookies);
        yo1Var.set(2, finderUsername);
        yo1Var.set(6, dislikeId);
        yo1Var.set(7, nonce_id);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = yo1Var;
        r45.zo1 zo1Var = new r45.zo1();
        zo1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) zo1Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = zo1Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderlivedislikebanner";
        lVar.f152200d = 4268;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderLiveDislikeBanner", "init feedId:" + j17 + ", liveId:" + j18 + ", finderUsername:" + finderUsername + ", liveCookies size:" + liveCookies.f273689a.length + ", dislikeId:" + dislikeId);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.zo1 resp = (r45.zo1) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f309774t, "ljd [onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread() + ' ');
    }
}
