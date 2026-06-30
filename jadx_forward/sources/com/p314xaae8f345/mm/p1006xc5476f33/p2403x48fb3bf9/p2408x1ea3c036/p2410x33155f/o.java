package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2410x33155f;

/* loaded from: classes8.dex */
public class o extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2410x33155f.a {

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.g f264100b;

    public o() {
        super(3);
        this.f264100b = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2410x33155f.n(this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2410x33155f.a
    public void a(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0 e0Var, db5.g4 g4Var) {
        if (e0Var.f488190n.getBoolean("is_favorite_item", false)) {
            return;
        }
        g4Var.h(3, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjg), com.p314xaae8f345.mm.R.raw.f78683x36757420, 0);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2410x33155f.a
    public void b(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0 e0Var, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2410x33155f.z zVar) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putLong("msg_id", e0Var.f488190n.getLong("msg_id", Long.MIN_VALUE));
        android.os.Bundle bundle2 = e0Var.f488190n;
        bundle.putString("msg_talker", bundle2.getString("msg_talker"));
        bundle.putString("sns_local_id", bundle2.getString("sns_local_id"));
        bundle.putInt("news_svr_id", bundle2.getInt("news_svr_id", 0));
        bundle.putString("news_svr_tweetid", bundle2.getString("news_svr_tweetid"));
        bundle.putInt("message_index", bundle2.getInt("message_index", 0));
        java.lang.String u17 = e0Var.u();
        java.lang.String s17 = e0Var.s();
        bundle.putString("rawUrl", s17);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(s17) && s17.endsWith("#rd")) {
            java.lang.String substring = s17.substring(0, s17.length() - 3);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(u17) && !u17.startsWith(substring)) {
                bundle.putString("rawUrl", u17);
                bundle.putLong("msg_id", Long.MIN_VALUE);
            }
        } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(u17) && !u17.startsWith(s17)) {
            bundle.putString("rawUrl", u17);
            bundle.putLong("msg_id", Long.MIN_VALUE);
            bundle.putString("sns_local_id", "");
        }
        bundle.putString("preChatName", bundle2.getString("preChatName"));
        bundle.putInt("preMsgIndex", bundle2.getInt("preMsgIndex", 0));
        bundle.putString("prePublishId", bundle2.getString("prePublishId"));
        bundle.putString("preUsername", bundle2.getString("preUsername"));
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.C19259x34e16419 c19259x34e16419 = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.C19259x34e16419();
        c19259x34e16419.f263649f = 1;
        c19259x34e16419.f263650g = bundle;
        c19259x34e16419.s();
        if (c19259x34e16419.f263651h) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.w3.f264027f = 1;
            ((java.util.HashSet) e0Var.L.f264192e).add("sendAppMessage");
            e0Var.f488188i.c(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2410x33155f.m(this));
        } else {
            o72.e4 e4Var = (o72.e4) i95.n0.c(o72.e4.class);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.g gVar = this.f264100b;
            ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.s1) e4Var).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.u1.g(c19259x34e16419.f263653m, 35, (android.app.Activity) context, gVar);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ga.f34328x366c91de, 2);
    }
}
