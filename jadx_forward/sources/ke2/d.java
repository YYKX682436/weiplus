package ke2;

/* loaded from: classes.dex */
public final class d extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f388474t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(java.lang.String activityId) {
        super(null, null, 3, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activityId, "activityId");
        this.f388474t = "Finder.CgiFinderLiveActivitiyClickReport";
        r45.w52 w52Var = new r45.w52();
        w52Var.set(3, activityId);
        w52Var.set(4, 1);
        w52Var.set(2, xy2.c.f(this.f97668n));
        w52Var.set(1, db2.t4.f309704a.a(5246));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderLiveActivitiyClickReport", "CgiFinderLiveActivitiyClickReport init " + activityId + '}');
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = w52Var;
        r45.x52 x52Var = new r45.x52();
        x52Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) x52Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = x52Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderlivequestactivityclickreport";
        lVar.f152200d = 5246;
        p(lVar.a());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.x52 resp = (r45.x52) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f388474t, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
    }
}
