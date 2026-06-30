package com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui;

/* loaded from: classes8.dex */
public class q implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ef3.a f230000a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16472xf5823d43 f230001b;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16472xf5823d43 activityC16472xf5823d43, ef3.a aVar) {
        this.f230001b = activityC16472xf5823d43;
        this.f230000a = aVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallFunctionSettingsUI", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(fVar.f152148a), java.lang.Integer.valueOf(fVar.f152149b), fVar.f152150c);
        int i17 = fVar.f152148a;
        ef3.a aVar = this.f230000a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16472xf5823d43 activityC16472xf5823d43 = this.f230001b;
        if (i17 != 0 || fVar.f152149b != 0) {
            for (r45.y55 y55Var : aVar.f333937q) {
                y55Var.f472336e = y55Var.f472336e == 0 ? 1 : 0;
            }
            activityC16472xf5823d43.f229767h.notifyDataSetChanged();
            at4.j0.b(fVar.f152149b, fVar.f152148a).a(activityC16472xf5823d43.mo55332x76847179(), true);
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallFunctionSettingsUI", "retcode: %s, retmsg: %s", java.lang.Integer.valueOf(((r45.af) fVar.f152151d).f451508d), ((r45.af) fVar.f152151d).f451509e);
        if (((r45.af) fVar.f152151d).f451508d == 0) {
            return null;
        }
        for (r45.y55 y55Var2 : aVar.f333937q) {
            y55Var2.f472336e = y55Var2.f472336e == 0 ? 1 : 0;
        }
        activityC16472xf5823d43.f229767h.notifyDataSetChanged();
        r45.af afVar = (r45.af) fVar.f152151d;
        at4.j0.c(afVar.f451508d, afVar.f451509e).a(activityC16472xf5823d43.mo55332x76847179(), true);
        return null;
    }
}
