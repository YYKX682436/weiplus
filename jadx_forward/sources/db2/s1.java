package db2;

/* loaded from: classes.dex */
public final class s1 extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f309681t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(java.util.List exptIds) {
        super(null, null, 2, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(exptIds, "exptIds");
        this.f309681t = "Finder.CgiFinderGetSvrExptConfig";
        r45.ha1 ha1Var = new r45.ha1();
        ha1Var.set(1, db2.t4.f309704a.b(5864, this.f97668n));
        ha1Var.m75941xfb821914(2).addAll(exptIds);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = ha1Var;
        r45.ia1 ia1Var = new r45.ia1();
        ia1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) ia1Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = ia1Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/findergetsvrexptconfig";
        lVar.f152200d = 5864;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderGetSvrExptConfig", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.ia1 resp = (r45.ia1) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f309681t, "[onCgiEnd] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread() + ' ');
    }
}
