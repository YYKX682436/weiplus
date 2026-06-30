package db2;

/* loaded from: classes3.dex */
public final class h5 extends az2.u {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f309541g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f309542h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f309543i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5(long j17, java.lang.String str, int i17, java.lang.String reportData, java.lang.String bypassData) {
        super(null, 1, null);
        java.util.LinkedList m75941xfb821914;
        r45.fl2 fl2Var;
        java.lang.String m75945x2fec8307;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportData, "reportData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bypassData, "bypassData");
        this.f309541g = "Finder.NetSceneFinderAdCommentReport";
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 8083;
        r45.lt0 lt0Var = new r45.lt0();
        lt0Var.set(2, reportData);
        lt0Var.set(3, bypassData);
        db2.t4 t4Var = db2.t4.f309704a;
        lt0Var.set(1, t4Var.a(8083));
        t4Var.h((r45.kv0) lt0Var.m75936x14adae67(1), null, kz5.b0.c(new jz5.o(java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17), str)));
        lVar.f152197a = lt0Var;
        r45.mt0 mt0Var = new r45.mt0();
        mt0Var.set(0, new r45.ie());
        lVar.f152198b = mt0Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderadcommentreport";
        this.f309542h = lVar.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NetSceneFinderAdCommentReport", "NetSceneFinderAdCommentReport  ".concat(reportData));
        r45.kv0 kv0Var = (r45.kv0) lt0Var.m75936x14adae67(1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NetSceneFinderAdCommentReport", "NetSceneFinderAdCommentReport sessionBuffer: ".concat((kv0Var == null || (m75941xfb821914 = kv0Var.m75941xfb821914(7)) == null || (fl2Var = (r45.fl2) kz5.n0.Z(m75941xfb821914)) == null || (m75945x2fec8307 = fl2Var.m75945x2fec8307(1)) == null) ? "" : m75945x2fec8307));
    }

    @Override // az2.u
    public void J(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f309541g, "NetSceneFinderCommentAdReport onGYNetEnd " + i18 + ' ' + i19 + ' ' + str + ' ');
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f309543i;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f309543i = u0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f309541g, "NetSceneFinderAdCommentReport doScene");
        return mo9409x10f9447a(sVar, this.f309542h, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 8083;
    }
}
