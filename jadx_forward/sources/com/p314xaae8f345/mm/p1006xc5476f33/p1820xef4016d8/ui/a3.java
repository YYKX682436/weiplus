package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class a3 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16363x8a0a619d f228224a;

    public a3(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16363x8a0a619d activityC16363x8a0a619d) {
        this.f228224a = activityC16363x8a0a619d;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
        com.p314xaae8f345.mm.p944x882e457a.f fVar2 = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyDetailUI", "getRedpacketFission resp errType: %s, errCode: %s", java.lang.Integer.valueOf(fVar2.f152148a), java.lang.Integer.valueOf(fVar2.f152149b));
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16363x8a0a619d activityC16363x8a0a619d = this.f228224a;
        if (activityC16363x8a0a619d.isFinishing() || activityC16363x8a0a619d.isDestroyed()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyDetailUI", "this activity has finished do not show fissison entrance");
            return null;
        }
        if (fVar2.f152148a != 0 || fVar2.f152149b != 0 || (fVar = fVar2.f152151d) == null || !((r45.xm3) fVar).f471764d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyDetailUI", "do not show fissison entrance");
            activityC16363x8a0a619d.f227628s2 = false;
            activityC16363x8a0a619d.X.setVisibility(8);
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyDetailUI", "show fissison entrance");
        activityC16363x8a0a619d.f227628s2 = true;
        activityC16363x8a0a619d.X.setVisibility(0);
        gb3.m.a(21, activityC16363x8a0a619d.V2);
        activityC16363x8a0a619d.Z.setText(((r45.xm3) fVar2.f152151d).f471765e);
        n11.a b17 = n11.a.b();
        java.lang.String str = ((r45.xm3) fVar2.f152151d).f471766f;
        android.widget.ImageView imageView = activityC16363x8a0a619d.Y;
        o11.f fVar3 = new o11.f();
        fVar3.f423624o = com.p314xaae8f345.mm.R.C30861xcebc809e.bgo;
        fVar3.f423612c = true;
        b17.h(str, imageView, fVar3.a());
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(((r45.xm3) fVar2.f152151d).f471768h)) {
            return null;
        }
        activityC16363x8a0a619d.X.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.z2(this, fVar2));
        return null;
    }
}
