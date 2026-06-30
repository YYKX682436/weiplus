package db2;

/* loaded from: classes3.dex */
public final class j5 extends az2.u {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f309564g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f309565h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f309566i;

    public /* synthetic */ j5(int i17, java.util.List list, long j17, java.lang.String str, int i18, java.lang.String str2, java.lang.String str3, r45.i3 i3Var, r45.qt2 qt2Var, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(i17, list, j17, str, i18, str2, str3, (i19 & 128) != 0 ? r45.i3.AdFeedbackBusinessType_AdComment : i3Var, (i19 & 256) != 0 ? null : qt2Var);
    }

    @Override // az2.u
    public void J(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f309564g, "NetSceneFinderAdFeedback onGYNetEnd " + i18 + ' ' + i19 + ' ' + str + ' ');
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f309566i;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f309566i = u0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f309564g, "NetSceneFinderAdFeedback doScene");
        return mo9409x10f9447a(sVar, this.f309565h, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 8432;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5(int i17, java.util.List reasonIdList, long j17, java.lang.String str, int i18, java.lang.String reportExtraData, java.lang.String bypassData, r45.i3 businessType, r45.qt2 qt2Var) {
        super(null, 1, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reasonIdList, "reasonIdList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportExtraData, "reportExtraData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bypassData, "bypassData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(businessType, "businessType");
        this.f309564g = "Finder.NetSceneFinderAdFeedback";
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 8432;
        r45.pt0 pt0Var = new r45.pt0();
        pt0Var.set(2, new java.util.LinkedList(reasonIdList));
        pt0Var.set(3, reportExtraData);
        pt0Var.set(4, bypassData);
        db2.t4 t4Var = db2.t4.f309704a;
        pt0Var.set(1, t4Var.b(8432, qt2Var));
        pt0Var.set(5, java.lang.Integer.valueOf(i17));
        pt0Var.set(6, java.lang.Integer.valueOf(businessType.f458229d));
        t4Var.h((r45.kv0) pt0Var.m75936x14adae67(1), null, kz5.b0.c(new jz5.o(java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(j17), str)));
        lVar.f152197a = pt0Var;
        r45.mt0 mt0Var = new r45.mt0();
        mt0Var.set(0, new r45.ie());
        lVar.f152198b = mt0Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderadfeedback";
        this.f309565h = lVar.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NetSceneFinderAdFeedback", "NetSceneFinderAdFeedback adFeedbackType=" + i17 + ", reasonList=[" + kz5.n0.g0(reasonIdList, null, null, null, 0, null, db2.i5.f309550d, 31, null) + ']');
    }
}
