package bh0;

/* loaded from: classes9.dex */
public class n1 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public n1() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5145x1e9b259c c5145x1e9b259c = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5145x1e9b259c) abstractC20979x809547d1;
        if (c5145x1e9b259c instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5145x1e9b259c) {
            android.content.Intent intent = new android.content.Intent();
            am.b bVar = c5145x1e9b259c.f135495g;
            if (bVar != null) {
                intent.putExtra("card_list", bVar.f87732a);
                intent.putExtra("result_code", bVar.f87733b);
            }
            if (bVar == null || bVar.f87733b != -1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.k8.b().mo9729x757c998b(16, 0, intent);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.k8.b().mo9729x757c998b(16, -1, intent);
            }
        }
        return false;
    }
}
