package c34;

/* loaded from: classes9.dex */
public class k0 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public k0() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6150xa1024095 c6150xa1024095 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6150xa1024095) abstractC20979x809547d1;
        am.jy jyVar = c6150xa1024095.f136411g;
        jyVar.getClass();
        j34.i b17 = j34.j.b(jyVar.f88639b);
        am.jy jyVar2 = c6150xa1024095.f136411g;
        am.ky kyVar = c6150xa1024095.f136412h;
        if (b17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TVOperationListener", "error, xml[%s] can not parse", jyVar2.f88639b);
            kyVar.f88723a = false;
        } else {
            kyVar.f88724b = j34.j.c(jyVar2.f88638a, b17);
            kyVar.f88725c = c34.h0.Ai(b17.f72370x7b28c57e, "@B");
            kyVar.f88723a = true;
        }
        return false;
    }
}
