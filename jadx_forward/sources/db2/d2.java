package db2;

/* loaded from: classes.dex */
public final class d2 extends ek2.g0 {

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f309474u;

    /* renamed from: v, reason: collision with root package name */
    public final db2.c2 f309475v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(long j17, long j18, java.lang.String anchorUsername, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, java.util.LinkedList stockIds, db2.c2 callback, java.lang.String noticeId) {
        super(null, 1, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anchorUsername, "anchorUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stockIds, "stockIds");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(noticeId, "noticeId");
        this.f309474u = "Finder.CgiFinderLiveReceiveCoupon";
        this.f309475v = callback;
        r45.p62 p62Var = new r45.p62();
        p62Var.set(1, db2.t4.f309704a.a(6219));
        p62Var.set(3, java.lang.Long.valueOf(j17));
        p62Var.set(2, java.lang.Long.valueOf(j18));
        p62Var.set(5, anchorUsername);
        p62Var.set(8, str);
        p62Var.set(6, gVar);
        p62Var.set(4, stockIds);
        p62Var.set(7, java.util.UUID.randomUUID().toString());
        p62Var.set(10, noticeId);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = p62Var;
        r45.q62 q62Var = new r45.q62();
        q62Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) q62Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = q62Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderlivereceivecoupon";
        lVar.f152200d = 6219;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderLiveReceiveCoupon", "init " + p62Var.m75942xfb822ef2(3));
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.q62 resp = (r45.q62) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f309474u, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
        this.f309475v.a(i17, i18, str, resp);
    }
}
