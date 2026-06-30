package iu1;

/* loaded from: classes9.dex */
public final class p implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13064xaf775f76 f376464a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f376465b;

    public p(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13064xaf775f76 activityC13064xaf775f76, java.lang.String str) {
        this.f376464a = activityC13064xaf775f76;
        this.f376465b = str;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardHomePageNewUI", "errtype: %s, errcode: %s", java.lang.Integer.valueOf(fVar.f152148a), java.lang.Integer.valueOf(fVar.f152149b));
        int i17 = fVar.f152148a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13064xaf775f76 activityC13064xaf775f76 = this.f376464a;
        if (i17 == 0 && fVar.f152149b == 0) {
            r45.ic3 ic3Var = (r45.ic3) fVar.f152151d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardHomePageNewUI", "retCode: %s, refresh: %s", java.lang.Integer.valueOf(ic3Var.f458459d), java.lang.Integer.valueOf(ic3Var.f458462g));
            if (ic3Var.f458459d != 0) {
                lu1.a0.r(activityC13064xaf775f76, ic3Var.f458460e);
            } else if (ic3Var.f458462g == 1) {
                activityC13064xaf775f76.K = true;
                activityC13064xaf775f76.f176720p = 0;
                activityC13064xaf775f76.Y6();
            } else {
                int i18 = activityC13064xaf775f76.C;
                java.lang.String str = this.f376465b;
                if (i18 != 0) {
                    iu1.c cVar = activityC13064xaf775f76.f176717m;
                    if (cVar == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mHomePageAdapter");
                        throw null;
                    }
                    r45.wt card_pkg_mch_info = ic3Var.f458461f;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(card_pkg_mch_info, "card_pkg_mch_info");
                    cVar.B(str, card_pkg_mch_info);
                } else if (ic3Var.f458461f.f470969p.size() == 0) {
                    iu1.c cVar2 = activityC13064xaf775f76.f176717m;
                    if (cVar2 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mHomePageAdapter");
                        throw null;
                    }
                    cVar2.z(str);
                } else {
                    iu1.c cVar3 = activityC13064xaf775f76.f176717m;
                    if (cVar3 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mHomePageAdapter");
                        throw null;
                    }
                    r45.wt card_pkg_mch_info2 = ic3Var.f458461f;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(card_pkg_mch_info2, "card_pkg_mch_info");
                    cVar3.B(str, card_pkg_mch_info2);
                }
            }
        } else {
            lu1.a0.q(activityC13064xaf775f76, "");
        }
        activityC13064xaf775f76.C = -1;
        return jz5.f0.f384359a;
    }
}
