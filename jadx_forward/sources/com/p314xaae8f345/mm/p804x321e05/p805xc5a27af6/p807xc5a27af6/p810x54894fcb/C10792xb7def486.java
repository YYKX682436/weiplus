package com.p314xaae8f345.mm.p804x321e05.p805xc5a27af6.p807xc5a27af6.p810x54894fcb;

/* renamed from: com.tencent.mm.kara.feature.feature.livehome.HistoriesWithNoReddotDisturbanceFeatureGroup */
/* loaded from: classes13.dex */
public class C10792xb7def486 extends pl0.e {

    /* renamed from: dayOfTheWeek_countThatHappened */
    @fl0.a
    public int f29460x2721bbaa = 0;

    /* renamed from: dayOfTheWeek_countThatRecalled */
    @fl0.a
    public int f29461xf2872fd9 = 0;

    /* renamed from: dayOfTheWeek_proportionThatRecalled */
    @fl0.a
    public float f29462x828e34de = 0.0f;

    /* renamed from: hourOfTheDay_countThatHappened */
    @fl0.a
    public int f29463x2abb38de = 0;

    /* renamed from: hourOfTheDay_countThatRecalled */
    @fl0.a
    public int f29464xf620ad0d = 0;

    /* renamed from: hourOfTheDay_proportionThatRecalled */
    @fl0.a
    public float f29465x7d16d82a = 0.0f;

    /* renamed from: hourOfTheWeekAndDay_countThatHappened */
    @fl0.a
    public int f29466x3e1f0007 = 0;

    /* renamed from: hourOfTheWeekAndDay_countThatRecalled */
    @fl0.a
    public int f29467x9847436 = 0;

    /* renamed from: hourOfTheWeekAndDay_proportionThatRecalled */
    @fl0.a
    public float f29468xe9ee22a1 = 0.0f;

    /* renamed from: total_countThatHappened */
    @fl0.a
    public int f29469x1e10ec7c = 0;

    /* renamed from: total_countThatRecalled */
    @fl0.a
    public int f29470xe97660ab = 0;

    /* renamed from: total_proportionThatRecalled */
    @fl0.a
    public float f29471xd7f6b74c = 0.0f;

    @Override // pl0.e, fl0.b
    /* renamed from: build */
    public void mo46315x59bc66e() {
        super.mo46315x59bc66e();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long d17 = nl0.e.d(currentTimeMillis);
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTime(new java.util.Date(currentTimeMillis));
        int i17 = calendar.get(11);
        int i18 = calendar.get(7);
        sl0.f0 f0Var = sl0.f0.f490641e;
        this.f29460x2721bbaa = f0Var.d(1, true, d17, currentTimeMillis, i18);
        int d18 = f0Var.d(2, true, d17, currentTimeMillis, i18);
        this.f29461xf2872fd9 = d18;
        int i19 = this.f29460x2721bbaa;
        if (i19 > 0) {
            this.f29462x828e34de = d18 / i19;
        }
        this.f29463x2abb38de = f0Var.e(1, true, d17, currentTimeMillis, i18);
        int e17 = f0Var.e(2, true, d17, currentTimeMillis, i18);
        this.f29464xf620ad0d = e17;
        int i27 = this.f29463x2abb38de;
        if (i27 > 0) {
            this.f29465x7d16d82a = e17 / i27;
        }
        this.f29466x3e1f0007 = f0Var.c(1, true, d17, currentTimeMillis, i18, i17);
        int c17 = f0Var.c(2, true, d17, currentTimeMillis, i18, i17);
        this.f29467x9847436 = c17;
        int i28 = this.f29466x3e1f0007;
        if (i28 > 0) {
            this.f29468xe9ee22a1 = c17 / i28;
        }
        this.f29469x1e10ec7c = f0Var.b(1, true, d17, currentTimeMillis);
        int b17 = f0Var.b(2, true, d17, currentTimeMillis);
        this.f29470xe97660ab = b17;
        int i29 = this.f29469x1e10ec7c;
        if (i29 > 0) {
            this.f29471xd7f6b74c = b17 / i29;
        }
    }

    @Override // fl0.b
    /* renamed from: getName */
    public java.lang.String mo46314xfb82e301() {
        return "HistoriesWithNoReddotDisturbanceFeatureGroup";
    }
}
