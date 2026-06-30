package com.tencent.mm.kara.feature.feature.livehome;

/* loaded from: classes13.dex */
public class HistoriesWithAnchorFeatureGroup extends pl0.e {
    private java.lang.String anchorId;

    @fl0.a
    public int dayOfTheWeek_countThatHappened = 0;

    @fl0.a
    public int dayOfTheWeek_countThatRecalled = 0;

    @fl0.a
    public float dayOfTheWeek_proportionThatRecalled = 0.0f;

    @fl0.a
    public int hourOfTheDay_countThatHappened = 0;

    @fl0.a
    public int hourOfTheDay_countThatRecalled = 0;

    @fl0.a
    public float hourOfTheDay_proportionThatRecalled = 0.0f;

    @fl0.a
    public int hourOfTheWeekAndDay_countThatHappened = 0;

    @fl0.a
    public int hourOfTheWeekAndDay_countThatRecalled = 0;

    @fl0.a
    public float hourOfTheWeekAndDay_proportionThatRecalled = 0.0f;

    @fl0.a
    public int total_countThatHappened = 0;

    @fl0.a
    public int total_countThatRecalled = 0;

    @fl0.a
    public float total_proportionThatRecalled = 0.0f;

    public HistoriesWithAnchorFeatureGroup(java.lang.String str) {
        this.anchorId = str;
    }

    @Override // pl0.e, fl0.b
    public void build() {
        super.build();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long d17 = nl0.e.d(currentTimeMillis);
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTime(new java.util.Date(currentTimeMillis));
        int i17 = calendar.get(11);
        int i18 = calendar.get(7);
        sl0.k0 k0Var = sl0.k0.f409165e;
        this.dayOfTheWeek_countThatHappened = k0Var.d(this.anchorId, 1, false, d17, currentTimeMillis, i18);
        int d18 = k0Var.d(this.anchorId, 2, false, d17, currentTimeMillis, i18);
        this.dayOfTheWeek_countThatRecalled = d18;
        int i19 = this.dayOfTheWeek_countThatHappened;
        if (i19 > 0) {
            this.dayOfTheWeek_proportionThatRecalled = d18 / i19;
        }
        this.hourOfTheDay_countThatHappened = k0Var.e(this.anchorId, 1, false, d17, currentTimeMillis, i18);
        int e17 = k0Var.e(this.anchorId, 2, false, d17, currentTimeMillis, i18);
        this.hourOfTheDay_countThatRecalled = e17;
        int i27 = this.hourOfTheDay_countThatHappened;
        if (i27 > 0) {
            this.hourOfTheDay_proportionThatRecalled = e17 / i27;
        }
        this.hourOfTheWeekAndDay_countThatHappened = k0Var.c(this.anchorId, 1, false, d17, currentTimeMillis, i18, i17);
        int c17 = k0Var.c(this.anchorId, 2, false, d17, currentTimeMillis, i18, i17);
        this.hourOfTheWeekAndDay_countThatRecalled = c17;
        int i28 = this.hourOfTheWeekAndDay_countThatHappened;
        if (i28 > 0) {
            this.hourOfTheWeekAndDay_proportionThatRecalled = c17 / i28;
        }
        this.total_countThatHappened = k0Var.b(this.anchorId, 1, false, d17, currentTimeMillis);
        int b17 = k0Var.b(this.anchorId, 2, false, d17, currentTimeMillis);
        this.total_countThatRecalled = b17;
        int i29 = this.total_countThatHappened;
        if (i29 > 0) {
            this.total_proportionThatRecalled = b17 / i29;
        }
    }

    @Override // fl0.b
    public java.lang.String getName() {
        return "HistoriesWithAnchorFeatureGroup";
    }
}
