package ho2;

/* loaded from: classes2.dex */
public final class c extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f364398t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(r45.qt2 qt2Var, java.lang.String finderUsername, int i17) {
        super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUsername, "finderUsername");
        this.f364398t = finderUsername;
        r45.wr0 wr0Var = new r45.wr0();
        wr0Var.f470930d = db2.t4.f309704a.b(9537, qt2Var);
        wr0Var.f470931e = finderUsername;
        wr0Var.f470932f = i17;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = wr0Var;
        r45.xr0 xr0Var = new r45.xr0();
        xr0Var.mo11485x1f73abb4(new r45.ie());
        r45.ie mo11484xe92ab0a8 = xr0Var.mo11484xe92ab0a8();
        if (mo11484xe92ab0a8 != null) {
            mo11484xe92ab0a8.f458493e = new r45.du5();
        }
        lVar.f152198b = xr0Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/fetchfindermemberstatus";
        lVar.f152200d = 9537;
        p(lVar.a());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.xr0 resp = (r45.xr0) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Cgi.FinderFetchMemberStatusCgi", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread() + " memberStatus=" + resp.f471884d + " visitorStatus=" + resp.f471885e + " username=" + this.f364398t);
    }

    public /* synthetic */ c(r45.qt2 qt2Var, java.lang.String str, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i18 & 1) != 0 ? null : qt2Var, str, (i18 & 4) != 0 ? 0 : i17);
    }
}
