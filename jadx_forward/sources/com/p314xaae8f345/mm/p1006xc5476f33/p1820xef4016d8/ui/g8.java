package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public final class g8 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d f228467a;

    public g8(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d activityC16371xf216ae6d) {
        this.f228467a = activityC16371xf216ae6d;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
        android.widget.LinearLayout linearLayout;
        com.p314xaae8f345.mm.p944x882e457a.f fVar2 = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewDetailUI", "getRedpacketFission resp errType: %s, errCode: %s", java.lang.Integer.valueOf(fVar2.f152148a), java.lang.Integer.valueOf(fVar2.f152149b));
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d activityC16371xf216ae6d = this.f228467a;
        if (activityC16371xf216ae6d.isFinishing() || activityC16371xf216ae6d.isDestroyed()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewDetailUI", "this activity has finished do not show fissison entrance");
        } else if (fVar2.f152148a == 0 && fVar2.f152149b == 0 && (fVar = fVar2.f152151d) != null && ((r45.xm3) fVar).f471764d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewDetailUI", "show fissison entrance");
            activityC16371xf216ae6d.f227754s2 = true;
            android.widget.LinearLayout linearLayout2 = activityC16371xf216ae6d.X;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(0);
            }
            gb3.m.a(21, activityC16371xf216ae6d.V2);
            android.widget.TextView textView = activityC16371xf216ae6d.Z;
            if (textView != null) {
                r45.xm3 xm3Var = (r45.xm3) fVar2.f152151d;
                textView.setText(xm3Var != null ? xm3Var.f471765e : null);
            }
            n11.a b17 = n11.a.b();
            r45.xm3 xm3Var2 = (r45.xm3) fVar2.f152151d;
            java.lang.String str = xm3Var2 != null ? xm3Var2.f471766f : null;
            android.widget.ImageView imageView = activityC16371xf216ae6d.Y;
            o11.f fVar3 = new o11.f();
            fVar3.f423624o = com.p314xaae8f345.mm.R.C30861xcebc809e.bgo;
            fVar3.f423612c = true;
            b17.h(str, imageView, fVar3.a());
            r45.xm3 xm3Var3 = (r45.xm3) fVar2.f152151d;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(xm3Var3 != null ? xm3Var3.f471768h : null) && (linearLayout = activityC16371xf216ae6d.X) != null) {
                linearLayout.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.f8(fVar2, activityC16371xf216ae6d));
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewDetailUI", "do not show fissison entrance");
            activityC16371xf216ae6d.f227754s2 = false;
            android.widget.LinearLayout linearLayout3 = activityC16371xf216ae6d.X;
            if (linearLayout3 != null) {
                linearLayout3.setVisibility(8);
            }
        }
        return null;
    }
}
