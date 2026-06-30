package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2410x33155f;

/* loaded from: classes8.dex */
public class l extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2410x33155f.a {
    public l() {
        super(12);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2410x33155f.a
    public void a(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0 e0Var, db5.g4 g4Var) {
        boolean z17 = e0Var.f488190n.getBoolean("is_favorite_item", false);
        boolean z18 = e0Var.f488190n.getBoolean("key_detail_can_delete", true);
        if (z17 && z18) {
            g4Var.g(12, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c_a), com.p314xaae8f345.mm.R.raw.f78672x65d03434);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2410x33155f.a
    public void b(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0 e0Var, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2410x33155f.z zVar) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_fav_scene", 2);
        intent.putExtra("key_fav_item_id", e0Var.f488190n.getLong("fav_local_id", -1L));
        ((y30.q) ((z30.u) i95.n0.c(z30.u.class))).getClass();
        o72.x1.L0(context, ".ui.FavTagEditUI", intent, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ga.f34328x366c91de, 1);
    }
}
