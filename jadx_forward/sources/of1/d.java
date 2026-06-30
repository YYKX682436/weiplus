package of1;

/* loaded from: classes8.dex */
public class d implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ of1.e f426434d;

    public d(of1.e eVar) {
        this.f426434d = eVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.c1
    /* renamed from: onDismiss */
    public void mo889xb349b3ab() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0 v0Var;
        of1.e eVar = this.f426434d;
        of1.m mVar = eVar.f426439d;
        mVar.f426500n = null;
        mVar.f426499m = null;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17263x2beb5636) mVar.f426505s).n();
        of1.m mVar2 = eVar.f426439d;
        hy4.s sVar = mVar2.f426504r;
        if (sVar == null || (v0Var = mVar2.f426415f) == null) {
            return;
        }
        try {
            v0Var.b6(sVar.f367729c);
            eVar.f426439d.f426504r.b();
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.HTMLViewScanHelper", "cancel capture failed");
        }
    }
}
