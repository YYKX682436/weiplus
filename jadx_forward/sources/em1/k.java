package em1;

/* loaded from: classes7.dex */
public class k extends com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.b {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ em1.l f336585g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(em1.l lVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m mVar) {
        super(mVar);
        this.f336585g = lVar;
    }

    @Override // bl.a
    public void W(int i17) {
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.b, bl.a
    public java.lang.String c0(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, boolean z17, int i18, int i19) {
        em1.l lVar = this.f336585g;
        java.util.List list = lVar.f336587e;
        if (list == null || !list.contains(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m mVar = lVar.f336586d;
            mVar.d0(i17, mVar.s0(str, "fail:not supported"), lVar.f336588f);
            return "fail:not supported";
        }
        try {
            return lVar.f336586d.q0(str, str2, str3, i17, z17, lVar.f336588f, i19);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.V8EngineWorkerManagerLU", th6, "IMBInvokeHandler.invoke", new java.lang.Object[0]);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new em1.j(this, th6));
            return "";
        }
    }

    @Override // bl.a
    public void e() {
        ((cl.a) this.f336585g.f336589g.f124257b).f124102b.e();
    }

    @Override // bl.a
    public boolean j() {
        return ((cl.a) this.f336585g.f336589g.f124257b).f124102b.j();
    }

    @Override // bl.a
    public java.lang.String k(int i17, long j17, long j18, long j19) {
        return "";
    }
}
