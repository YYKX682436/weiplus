package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2405x2dcbb45b;

/* loaded from: classes.dex */
public class b implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2405x2dcbb45b.a f263572d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2405x2dcbb45b.a(this, null);

    public b() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5847xb25c325a>(a0Var) { // from class: com.tencent.mm.plugin.webview.emojistore.EmojiStoreWebViewLogic$1
            {
                this.f39173x3fe91575 = 1238741578;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5847xb25c325a c5847xb25c325a) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5847xb25c325a c5847xb25c325a2 = c5847xb25c325a;
                if (!(c5847xb25c325a2 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5847xb25c325a)) {
                    return false;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2405x2dcbb45b.a aVar = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2405x2dcbb45b.b.this.f263572d;
                am.po poVar = c5847xb25c325a2.f136155g;
                int i17 = poVar.f89175b;
                java.lang.String str = poVar.f89174a;
                java.lang.String str2 = poVar.f89176c;
                poVar.getClass();
                aVar.a(i17, str, str2, 0, 0L);
                return true;
            }
        }.mo48813x58998cd();
    }

    public static int a(java.util.Map map, java.lang.String str, int i17) {
        java.lang.String b17 = b(map, str);
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17) ? i17 : com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(b17, 0);
    }

    public static java.lang.String b(java.util.Map map, java.lang.String str) {
        return (!map.containsKey(str) || map.get(str) == null) ? "" : map.get(str).toString();
    }

    public boolean c(java.util.Map map) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiStoreWebViewLogic", "getSearchEmotionData: %s", map.toString());
        java.lang.String b17 = b(map, "keyword");
        java.lang.String b18 = b(map, "nextPageBuffer");
        int a17 = a(map, "type", 0);
        int a18 = a(map, "webview_instance_id", 0);
        java.lang.String b19 = b(map, "searchID");
        this.f263572d.a(a17, b17, b18, a18, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b19) ? 0L : java.lang.Long.valueOf(b19).longValue());
        return false;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2405x2dcbb45b.c) {
            gm0.j1.d().q(234, this);
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2405x2dcbb45b.a aVar = this.f263572d;
            aVar.f263569d = false;
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2405x2dcbb45b.c cVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2405x2dcbb45b.c) m1Var;
            if (i17 == 0 && i18 == 0) {
                aVar.f263570e = true;
            } else {
                aVar.f263570e = false;
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.k8.a(cVar.f263578i).w6("{}", cVar.f263579m, "", 0L);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.k8.a(cVar.f263578i).w6(cVar.H().f463247d, cVar.f263579m, x51.j1.f(cVar.H().f463248e), cVar.H().f463249f);
        }
    }
}
