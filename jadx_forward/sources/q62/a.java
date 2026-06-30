package q62;

/* loaded from: classes12.dex */
public class a extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public a() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5395x2709c56d c5395x2709c56d = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5395x2709c56d) abstractC20979x809547d1;
        if (!(c5395x2709c56d instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5395x2709c56d)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f("ExtOpenApiCallEvent", "mismatched event");
            return false;
        }
        am.k8 k8Var = c5395x2709c56d.f135735g;
        if (k8Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ExtOpenApiCallEvent", "revent.data is null");
            return false;
        }
        int i17 = k8Var.f88663a;
        am.l8 l8Var = c5395x2709c56d.f135736h;
        if (i17 == 9 || i17 == 13) {
            l8Var.f88762a = new com.p314xaae8f345.mm.p1006xc5476f33.ext.p1400xc52405f1.C13502x57397e14(k8Var.f88665c, k8Var.f88663a, k8Var.f88664b).query(k8Var.f88666d, null, null, k8Var.f88667e, null);
        } else if (i17 == 3) {
            l8Var.f88762a = new com.p314xaae8f345.mm.p1006xc5476f33.ext.p1400xc52405f1.C13501x6e5f8645(k8Var.f88665c, k8Var.f88663a, k8Var.f88664b).query(k8Var.f88666d, null, null, k8Var.f88667e, null);
        } else if (i17 == 29) {
            l8Var.f88762a = new com.p314xaae8f345.mm.p1006xc5476f33.ext.p1401xd83027eb.C13508xbccd9e98(k8Var.f88665c, k8Var.f88663a, k8Var.f88664b).query(k8Var.f88666d, null, null, k8Var.f88667e, null);
            android.content.SharedPreferences d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.d();
            if (!n62.k.f416729t) {
                d17.edit().putBoolean("hasCallVoiceControlApi", true).commit();
                n62.k.f416729t = true;
            }
        } else {
            l8Var.f88762a = new com.p314xaae8f345.mm.p1006xc5476f33.ext.p1398xb4b53790.p1399xc52405f1.C13498x68291483(k8Var.f88665c, k8Var.f88663a, k8Var.f88664b, k8Var.f88668f).query(k8Var.f88666d, null, null, k8Var.f88667e, null);
        }
        return true;
    }
}
