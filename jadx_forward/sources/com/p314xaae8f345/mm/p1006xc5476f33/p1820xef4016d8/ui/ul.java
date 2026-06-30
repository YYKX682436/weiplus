package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class ul implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f229045a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16390x60cac25d f229046b;

    public ul(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16390x60cac25d activityC16390x60cac25d, java.lang.String str) {
        this.f229046b = activityC16390x60cac25d;
        this.f229045a = str;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "do confirm errType: %s, errCode: %s", java.lang.Integer.valueOf(fVar.f152148a), java.lang.Integer.valueOf(fVar.f152149b));
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16390x60cac25d activityC16390x60cac25d = this.f229046b;
        android.app.Dialog dialog = activityC16390x60cac25d.B;
        if (dialog != null) {
            dialog.dismiss();
        }
        if (fVar.f152148a != 0 || fVar.f152149b != 0) {
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.K(activityC16390x60cac25d.mo55332x76847179(), fVar.f152150c);
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "retcode: %s", java.lang.Integer.valueOf(((r45.g80) fVar.f152151d).f456510d));
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2 = fVar.f152151d;
        if (fVar2 == null || ((r45.g80) fVar2).f456510d != 0) {
            if (fVar2 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(((r45.g80) fVar2).f456511e)) {
                return null;
            }
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.M(activityC16390x60cac25d.mo55332x76847179(), ((r45.g80) fVar.f152151d).f456511e);
            return null;
        }
        android.content.Intent intent = new android.content.Intent();
        r45.wv3 U6 = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16390x60cac25d.U6(activityC16390x60cac25d, this.f229045a);
        if (U6 != null) {
            try {
                intent.putExtra("key_envelope_source", U6.mo14344x5f01b1f6());
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LuckyMoneyPickEnvelopeUI", e17, "", new java.lang.Object[0]);
            }
        }
        activityC16390x60cac25d.setResult(-1, intent);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC16390x60cac25d.L)) {
            activityC16390x60cac25d.finish();
            return null;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.j.b(activityC16390x60cac25d.mo55332x76847179(), activityC16390x60cac25d.findViewById(com.p314xaae8f345.mm.R.id.jlt), activityC16390x60cac25d.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.gk_), new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.tl(this));
        return null;
    }
}
