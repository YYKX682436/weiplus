package db2;

/* loaded from: classes.dex */
public final class c0 extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f309447t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(long j17, java.lang.String finderUsername) {
        super(null, null, 3, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUsername, "finderUsername");
        this.f309447t = "Finder.CgiFinderDelDraft";
        r45.x01 x01Var = new r45.x01();
        x01Var.set(1, java.lang.Long.valueOf(j17));
        x01Var.set(3, db2.t4.f309704a.b(6662, this.f97668n));
        if (finderUsername.length() == 0) {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            finderUsername = xy2.c.e(context);
        }
        x01Var.set(2, finderUsername);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = x01Var;
        r45.y01 y01Var = new r45.y01();
        y01Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) y01Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = y01Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderdeldraft";
        lVar.f152200d = 6662;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderDelDraft", "init id:" + j17);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.y01 resp = (r45.y01) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f309447t, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread() + ' ');
    }
}
