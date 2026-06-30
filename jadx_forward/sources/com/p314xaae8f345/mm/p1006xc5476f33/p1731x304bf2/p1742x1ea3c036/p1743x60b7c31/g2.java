package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31;

/* loaded from: classes.dex */
public class g2 implements com.p314xaae8f345.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sd.b f221179d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f221180e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.h2 f221181f;

    public g2(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.h2 h2Var, sd.b bVar, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf) {
        this.f221181f = h2Var;
        this.f221179d = bVar;
        this.f221180e = abstractActivityC21394xb3d2c0cf;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        if (i17 == (this.f221181f.hashCode() & 65535)) {
            sd.b bVar = this.f221179d;
            if (i18 == -1) {
                if (intent != null) {
                    java.lang.String stringExtra = intent.getStringExtra("gameRegionName");
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    if (stringExtra == null) {
                        stringExtra = "";
                    }
                    java.util.HashMap hashMap = new java.util.HashMap();
                    hashMap.put("gameRegionName", stringExtra);
                    bVar.d(hashMap);
                } else {
                    bVar.c("fail", null);
                }
            } else if (i18 == 1) {
                bVar.c("fail", null);
            } else {
                bVar.c("cancel", null);
            }
            this.f221180e.m78545xde66c1f2(null);
        }
    }
}
