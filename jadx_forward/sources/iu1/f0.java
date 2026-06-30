package iu1;

/* loaded from: classes9.dex */
public final class f0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13065x7a79a025 f376402a;

    public f0(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13065x7a79a025 activityC13065x7a79a025) {
        this.f376402a = activityC13065x7a79a025;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardInvalidTicketListUI", "errtype: %s, errcode: %s", java.lang.Integer.valueOf(fVar.f152148a), java.lang.Integer.valueOf(fVar.f152149b));
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13065x7a79a025 activityC13065x7a79a025 = this.f376402a;
        activityC13065x7a79a025.f176738r = false;
        if (fVar.f152148a != 0 || fVar.f152149b != 0) {
            if (activityC13065x7a79a025.f176740t) {
                activityC13065x7a79a025.f176740t = false;
            }
            lu1.a0.q(activityC13065x7a79a025, "");
            return jz5.f0.f384359a;
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2 = fVar.f152151d;
        r45.vi3 vi3Var = (r45.vi3) fVar2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardInvalidTicketListUI", "retCode: %s", java.lang.Integer.valueOf(vi3Var.f469817d));
        if (vi3Var.f469817d != 0) {
            if (activityC13065x7a79a025.f176740t) {
                activityC13065x7a79a025.f176740t = false;
            }
            lu1.a0.r(activityC13065x7a79a025, vi3Var.f469818e);
            return fVar2;
        }
        activityC13065x7a79a025.f176735o = vi3Var.f469819f;
        activityC13065x7a79a025.f176737q = vi3Var.f469820g == 1;
        boolean z17 = vi3Var.f469822i == 1;
        activityC13065x7a79a025.f176739s = z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardInvalidTicketListUI", "update clear btn: %s", java.lang.Boolean.valueOf(z17));
        boolean z18 = activityC13065x7a79a025.f176739s;
        java.util.ArrayList arrayList = activityC13065x7a79a025.f176734n;
        if (z18) {
            activityC13065x7a79a025.mo78491xd9193382(0, activityC13065x7a79a025.getString(com.p314xaae8f345.mm.R.C30867xcad56011.arp), new iu1.q0(activityC13065x7a79a025));
            if (arrayList.isEmpty()) {
                activityC13065x7a79a025.m78500x43e00957(0, false);
            } else {
                activityC13065x7a79a025.m78500x43e00957(0, true);
            }
        } else {
            activityC13065x7a79a025.m78551x8f8ecf18(0);
        }
        if (activityC13065x7a79a025.f176737q) {
            activityC13065x7a79a025.Z6().m1(false);
        } else {
            activityC13065x7a79a025.Z6().m1(true);
        }
        if (activityC13065x7a79a025.f176740t) {
            arrayList.clear();
            activityC13065x7a79a025.f176740t = false;
        }
        activityC13065x7a79a025.b7(vi3Var.f469821h);
        return fVar2;
    }
}
