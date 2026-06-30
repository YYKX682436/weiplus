package fv2;

/* loaded from: classes10.dex */
public final class b extends com.p314xaae8f345.mm.p944x882e457a.i {

    /* renamed from: m, reason: collision with root package name */
    public final jv2.i f348505m;

    public b(java.lang.String userName, java.lang.String entity_id, long j17, jv2.i rootComment, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(entity_id, "entity_id");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootComment, "rootComment");
        this.f348505m = rootComment;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.y03 y03Var = new r45.y03();
        y03Var.f472214q = userName;
        y03Var.f472206f = entity_id;
        y03Var.f472204d = db2.t4.f309704a.a(6953);
        y03Var.f472208h = j17;
        y03Var.f472215r = rootComment.f383756d.u0().m76078x44e5026c();
        y03Var.f472211n = z17 ? 2 : 1;
        lVar.f152197a = y03Var;
        lVar.f152198b = new r45.z03();
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderunigetcomment";
        lVar.f152200d = 6953;
        p(lVar.a());
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.i
    /* renamed from: k */
    public void x(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.z03 z03Var = (r45.z03) fVar;
        if (i17 == 0 && i18 == 0 && z03Var != null) {
            jv2.c cVar = this.f348505m.f383756d;
            cVar.u0().m76129x73095078(z03Var.f473102h);
            cVar.u0().m76114x6a498235(z03Var.f473101g);
            cVar.u0().m76152x27177bf0(z03Var.f473100f);
        }
    }
}
