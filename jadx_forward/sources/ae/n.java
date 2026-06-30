package ae;

/* loaded from: classes7.dex */
public class n implements gh.t {

    /* renamed from: a, reason: collision with root package name */
    public boolean f84894a = true;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ae.a f84895b;

    public n(ae.a aVar, ae.b bVar) {
        this.f84895b = aVar;
    }

    @Override // gh.t
    public void a(java.lang.Object obj, boolean z17) {
    }

    @Override // gh.t
    public void b(java.lang.Object obj, int i17, int i18, boolean z17, boolean z18) {
        boolean z19 = this.f84894a;
        ae.a aVar = this.f84895b;
        if (z19) {
            this.f84894a = false;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.w.e(aVar.N(), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1193x3606cc.C12595xe6b43f9f.f35253x12bfe388);
            return;
        }
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y yVar = (com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) aVar.F();
        if (yVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.AppBrandGameServiceLogicImp", "hy: on resizeWindow");
            yVar.p(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.q2());
        }
    }

    @Override // gh.t
    public void c(java.lang.Object obj, int i17, int i18) {
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y yVar = (com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) this.f84895b.F();
        if (yVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.AppBrandGameServiceLogicImp", "hy: on resizeWindow");
            yVar.p(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.q2());
        }
    }
}
