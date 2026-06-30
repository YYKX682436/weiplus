package bt3;

/* loaded from: classes12.dex */
public class d0 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public d0() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5864x3562e4e0 c5864x3562e4e0 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5864x3562e4e0) abstractC20979x809547d1;
        am.fp fpVar = c5864x3562e4e0.f136171g;
        java.lang.String str = fpVar.f88222a;
        long j17 = fpVar.f88223b;
        java.lang.String str2 = fpVar.f88224c;
        java.util.Iterator it = bt3.g2.A(str).f468998f.iterator();
        java.lang.String str3 = "";
        while (it.hasNext()) {
            str3 = str3 + bt3.g2.t((r45.gp0) it.next(), str2, j17, 1) + ":";
        }
        c5864x3562e4e0.f136172h.f88318a = str3;
        return true;
    }
}
