package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class l4 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f228657a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f228658b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16367x1189c620 f228659c;

    public l4(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16367x1189c620 activityC16367x1189c620, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var, java.lang.String str) {
        this.f228659c = activityC16367x1189c620;
        this.f228657a = u3Var;
        this.f228658b = str;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyHistoryEnvelopeUI", "do confirm errType: %s, errCode: %s", java.lang.Integer.valueOf(fVar.f152148a), java.lang.Integer.valueOf(fVar.f152149b));
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16367x1189c620 activityC16367x1189c620 = this.f228659c;
        if (activityC16367x1189c620.isDestroyed() || activityC16367x1189c620.isFinishing()) {
            return null;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f228657a;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        if (fVar.f152148a != 0 || fVar.f152149b != 0) {
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.K(activityC16367x1189c620.mo55332x76847179(), fVar.f152150c);
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyHistoryEnvelopeUI", "retcode: %s", java.lang.Integer.valueOf(((r45.g80) fVar.f152151d).f456510d));
        r45.g80 g80Var = (r45.g80) fVar.f152151d;
        if (g80Var.f456510d != 0) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g80Var.f456511e)) {
                return null;
            }
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.M(activityC16367x1189c620.mo55332x76847179(), ((r45.g80) fVar.f152151d).f456511e);
            return null;
        }
        java.util.ArrayList arrayList = activityC16367x1189c620.f227669w;
        java.util.Iterator it = arrayList.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            }
            in5.c cVar = (in5.c) it.next();
            if ((cVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.i5) && ((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.i5) cVar).f228548d.f471033f.equals(this.f228658b)) {
                arrayList.remove(cVar);
                break;
            }
            i17++;
        }
        if (i17 < 0) {
            return null;
        }
        activityC16367x1189c620.f227668v.m8155x27702c4(i17);
        return null;
    }
}
