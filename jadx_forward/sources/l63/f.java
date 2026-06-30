package l63;

/* loaded from: classes8.dex */
public class f implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m63.e f398305d;

    public f(l63.h hVar, m63.e eVar) {
        this.f398305d = eVar;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        m63.e eVar = this.f398305d;
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12946xbb486840 activityC12946xbb486840 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.z0) eVar).f175359b;
            if (str != null) {
                int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12946xbb486840.f175218y;
                activityC12946xbb486840.l7(str);
                return 0;
            }
            java.lang.String string = activityC12946xbb486840.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574662j46);
            int i27 = com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12946xbb486840.f175218y;
            activityC12946xbb486840.l7(string);
            return 0;
        }
        r45.og3 og3Var = (r45.og3) oVar.f152244b.f152233a;
        if (og3Var == null) {
            return 0;
        }
        r45.l74 l74Var = og3Var.f463767e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1767x491bc7bd.C16075xd72ab138 c16075xd72ab138 = new com.p314xaae8f345.mm.p1006xc5476f33.p1767x491bc7bd.C16075xd72ab138(l74Var.f460724d, l74Var.f460725e, l74Var.f460726f, l74Var.f460727g, java.lang.Integer.valueOf(l74Var.f460728h), og3Var.f463767e.f460729i);
        java.lang.String str2 = og3Var.f463766d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.z0 z0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.z0) eVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12946xbb486840 activityC12946xbb4868402 = z0Var.f175359b;
        if (str2 == null) {
            java.lang.String string2 = activityC12946xbb4868402.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574662j46);
            int i28 = com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12946xbb486840.f175218y;
            activityC12946xbb4868402.l7(string2);
            return 0;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("kWXEntryActivity_bundle_game_share_card_msgid", str2);
        bundle.putParcelable("kWXEntryActivity_bundle_game_share_card_liteapp", c16075xd72ab138);
        int i29 = com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12946xbb486840.f175218y;
        activityC12946xbb4868402.b7(z0Var.f175358a, bundle);
        return 0;
    }
}
