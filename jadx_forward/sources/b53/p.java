package b53;

/* loaded from: classes8.dex */
public class p extends b53.a {

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.g f99626b;

    public p(int i17) {
        super(i17);
        this.f99626b = new b53.o(this);
    }

    @Override // b53.a
    public void b(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0 e0Var, r45.rk4 rk4Var) {
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
            e0Var.f488188i.c(new b53.n(this));
        } else {
            n82.e eVar = (n82.e) i95.n0.c(n82.e.class);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.g gVar = this.f99626b;
            ((a40.k) eVar).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.u1.g(c19259x34e16419.f263653m, 35, (android.app.Activity) context, gVar);
        }
    }
}
