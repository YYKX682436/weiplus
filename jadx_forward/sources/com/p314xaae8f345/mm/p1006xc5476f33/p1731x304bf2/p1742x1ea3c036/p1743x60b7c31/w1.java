package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31;

/* loaded from: classes.dex */
public class w1 implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f221300d;

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.C15885x920c565c c15885x920c565c = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.C15885x920c565c) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6 h6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        java.lang.String string = c15885x920c565c.f221108d.getString("referrerUrl");
        android.os.Bundle bundle = c15885x920c565c.f221108d;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) h6Var).fj(context, string, bundle.getString("referrerAppId"), bundle.getString("businessType"), bundle.getString("queryString"), bundle.getInt("versionType"), 32);
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5726xa4aac895> abstractC20980x9b9ad01d = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5726xa4aac895>(a0Var) { // from class: com.tencent.mm.plugin.game.luggage.jsapi.JsApiOpenBusinessView$OpenWxAppTask$1
            {
                this.f39173x3fe91575 = 123962501;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5726xa4aac895 c5726xa4aac895) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5726xa4aac895 c5726xa4aac8952 = c5726xa4aac895;
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.w1.this.f221300d.mo48814x2efc64();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenBusinessView", "doOpenBusinessView errCode %d", java.lang.Integer.valueOf(c5726xa4aac8952.f136048g.f88885a));
                android.os.Bundle bundle2 = new android.os.Bundle();
                am.mk mkVar = c5726xa4aac8952.f136048g;
                bundle2.putInt("err_code", mkVar.f88885a);
                if (mkVar.f88885a != 0) {
                    return false;
                }
                bundle2.putString(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14345xae24a099, mkVar.f88886b);
                return false;
            }
        };
        this.f221300d = abstractC20980x9b9ad01d;
        abstractC20980x9b9ad01d.mo48813x58998cd();
    }
}
