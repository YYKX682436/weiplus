package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic;

/* loaded from: classes3.dex */
public class q1 extends x92.o {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // x92.o, x92.r
    public void O6(int i17, java.lang.String str) {
        super.O6(i17, str);
        aa2.b bVar = new aa2.b(m158354x19263085());
        bVar.b();
        bVar.a(i17, str);
        if (i17 == -4058) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 c5445x963cab3 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3();
            long longExtra = bVar.f84024a.getIntent().getLongExtra("key_feed_ref_id", 0L);
            am.ia iaVar = c5445x963cab3.f135785g;
            iaVar.f88451a = longExtra;
            iaVar.f88452b = 13;
            c5445x963cab3.e();
        }
    }

    @Override // x92.o, x92.r
    public void P6(int i17, java.lang.String str) {
        super.P6(i17, str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderActivityTipsUIC", "responseCode:" + i17 + ", errMsg:" + str);
        if (m158354x19263085().isFinishing()) {
            return;
        }
        m158354x19263085().finish();
    }

    @Override // x92.o
    public void W6() {
        android.widget.FrameLayout V6;
        super.W6();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m158359x1e885992().getStringExtra("key_cover_url")) || (V6 = V6()) == null) {
            return;
        }
        V6.setBackground(m158361x893a2f6f().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.awq));
    }
}
