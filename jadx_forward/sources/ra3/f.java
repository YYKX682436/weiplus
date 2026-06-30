package ra3;

/* loaded from: classes5.dex */
public class f extends qk.v9 implements com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.v9 {

    /* renamed from: b, reason: collision with root package name */
    public final ra3.k f475027b;

    public f(ra3.k kVar) {
        this.f475027b = kVar;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.v9
    public void a(boolean z17, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.e eVar;
        ra3.k kVar = this.f475027b;
        if (kVar != null) {
            if (z17) {
                ((ra3.i) kVar).f475049a[0].dismiss();
                return;
            }
            ra3.i iVar = (ra3.i) kVar;
            if (iVar.f475050b[0] || (eVar = iVar.f475049a[0]) == null) {
                return;
            }
            eVar.show();
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.v9
    public void b(com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb) {
        this.f445884a.a(interfaceC4987x84e327cb);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.v9
    public void c() {
        this.f445884a.mo9754xc39a57c1();
    }
}
