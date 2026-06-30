package com.p314xaae8f345.mm.p804x321e05.p805xc5a27af6.p807xc5a27af6.p810x54894fcb;

/* renamed from: com.tencent.mm.kara.feature.feature.livehome.HistoriesWithAnchorFeatureGroup */
/* loaded from: classes13.dex */
public class C10790xa4e61e96 extends pl0.e {

    /* renamed from: anchorId */
    private java.lang.String f29435xc61cf2b0;

    /* renamed from: dayOfTheWeek_countThatHappened */
    @fl0.a
    public int f29436x2721bbaa = 0;

    /* renamed from: dayOfTheWeek_countThatRecalled */
    @fl0.a
    public int f29437xf2872fd9 = 0;

    /* renamed from: dayOfTheWeek_proportionThatRecalled */
    @fl0.a
    public float f29438x828e34de = 0.0f;

    /* renamed from: hourOfTheDay_countThatHappened */
    @fl0.a
    public int f29439x2abb38de = 0;

    /* renamed from: hourOfTheDay_countThatRecalled */
    @fl0.a
    public int f29440xf620ad0d = 0;

    /* renamed from: hourOfTheDay_proportionThatRecalled */
    @fl0.a
    public float f29441x7d16d82a = 0.0f;

    /* renamed from: hourOfTheWeekAndDay_countThatHappened */
    @fl0.a
    public int f29442x3e1f0007 = 0;

    /* renamed from: hourOfTheWeekAndDay_countThatRecalled */
    @fl0.a
    public int f29443x9847436 = 0;

    /* renamed from: hourOfTheWeekAndDay_proportionThatRecalled */
    @fl0.a
    public float f29444xe9ee22a1 = 0.0f;

    /* renamed from: total_countThatHappened */
    @fl0.a
    public int f29445x1e10ec7c = 0;

    /* renamed from: total_countThatRecalled */
    @fl0.a
    public int f29446xe97660ab = 0;

    /* renamed from: total_proportionThatRecalled */
    @fl0.a
    public float f29447xd7f6b74c = 0.0f;

    public C10790xa4e61e96(java.lang.String str) {
        this.f29435xc61cf2b0 = str;
    }

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
        sl0.k0 k0Var = sl0.k0.f490698e;
        this.f29436x2721bbaa = k0Var.d(this.f29435xc61cf2b0, 1, false, d17, currentTimeMillis, i18);
        int d18 = k0Var.d(this.f29435xc61cf2b0, 2, false, d17, currentTimeMillis, i18);
        this.f29437xf2872fd9 = d18;
        int i19 = this.f29436x2721bbaa;
        if (i19 > 0) {
            this.f29438x828e34de = d18 / i19;
        }
        this.f29439x2abb38de = k0Var.e(this.f29435xc61cf2b0, 1, false, d17, currentTimeMillis, i18);
        int e17 = k0Var.e(this.f29435xc61cf2b0, 2, false, d17, currentTimeMillis, i18);
        this.f29440xf620ad0d = e17;
        int i27 = this.f29439x2abb38de;
        if (i27 > 0) {
            this.f29441x7d16d82a = e17 / i27;
        }
        this.f29442x3e1f0007 = k0Var.c(this.f29435xc61cf2b0, 1, false, d17, currentTimeMillis, i18, i17);
        int c17 = k0Var.c(this.f29435xc61cf2b0, 2, false, d17, currentTimeMillis, i18, i17);
        this.f29443x9847436 = c17;
        int i28 = this.f29442x3e1f0007;
        if (i28 > 0) {
            this.f29444xe9ee22a1 = c17 / i28;
        }
        this.f29445x1e10ec7c = k0Var.b(this.f29435xc61cf2b0, 1, false, d17, currentTimeMillis);
        int b17 = k0Var.b(this.f29435xc61cf2b0, 2, false, d17, currentTimeMillis);
        this.f29446xe97660ab = b17;
        int i29 = this.f29445x1e10ec7c;
        if (i29 > 0) {
            this.f29447xd7f6b74c = b17 / i29;
        }
    }

    @Override // fl0.b
    /* renamed from: getName */
    public java.lang.String mo46314xfb82e301() {
        return "HistoriesWithAnchorFeatureGroup";
    }
}
