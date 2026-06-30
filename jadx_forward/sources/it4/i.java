package it4;

/* loaded from: classes.dex */
public class i extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public i() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        java.lang.String[] split;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5314x8b748bae c5314x8b748bae = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5314x8b748bae) abstractC20979x809547d1;
        ht4.g gVar = (ht4.g) i95.n0.c(ht4.g.class);
        gVar.getClass();
        am.i4 i4Var = c5314x8b748bae.f135629g;
        java.util.HashMap hashMap = new java.util.HashMap();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(i4Var.f88436d) && (split = i4Var.f88436d.split("&")) != null && split.length > 0) {
            for (int i17 = 0; i17 < split.length; i17++) {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(split[i17])) {
                    java.lang.String[] split2 = split[i17].split("=");
                    if (split2.length == 2 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(split2[0])) {
                        hashMap.put(split2[0], split2[1]);
                    }
                }
            }
        }
        java.lang.String str = (java.lang.String) hashMap.get("extradata");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreECard", "start openECard, extraData: %s, packageExt: %s", str, hashMap);
        ss4.d dVar = new ss4.d(i4Var.f88433a, i4Var.f88434b, i4Var.f88435c, i4Var.f88436d, i4Var.f88438f, i4Var.f88437e, i4Var.f88439g, 15, "openECard", i4Var.f88445m);
        gm0.j1.i();
        gm0.j1.n().f354821b.a(580, new ht4.e(gVar, i4Var, c5314x8b748bae, str));
        gm0.j1.i();
        gm0.j1.n().f354821b.g(dVar);
        return false;
    }
}
