package com.tencent.mm.kara.feature.feature.livehome;

/* loaded from: classes13.dex */
public class HistoriesOfNoReddotLiveHomeFeatureGroup extends pl0.e {

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

    @Override // pl0.e, fl0.b
    public void build() {
        super.build();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long d17 = nl0.e.d(currentTimeMillis);
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTime(new java.util.Date(currentTimeMillis));
        int i17 = calendar.get(11);
        int i18 = calendar.get(7);
        sl0.f0 f0Var = sl0.f0.f409108e;
        this.dayOfTheWeek_countThatHappened = f0Var.d(1, false, d17, currentTimeMillis, i18);
        int d18 = f0Var.d(2, false, d17, currentTimeMillis, i18);
        this.dayOfTheWeek_countThatRecalled = d18;
        int i19 = this.dayOfTheWeek_countThatHappened;
        if (i19 > 0) {
            this.dayOfTheWeek_proportionThatRecalled = d18 / i19;
        }
        this.hourOfTheDay_countThatHappened = f0Var.e(1, false, d17, currentTimeMillis, i18);
        int e17 = f0Var.e(2, false, d17, currentTimeMillis, i18);
        this.hourOfTheDay_countThatRecalled = e17;
        int i27 = this.hourOfTheDay_countThatHappened;
        if (i27 > 0) {
            this.hourOfTheDay_proportionThatRecalled = e17 / i27;
        }
        this.hourOfTheWeekAndDay_countThatHappened = f0Var.c(1, false, d17, currentTimeMillis, i18, i17);
        int c17 = f0Var.c(2, false, d17, currentTimeMillis, i18, i17);
        this.hourOfTheWeekAndDay_countThatRecalled = c17;
        int i28 = this.hourOfTheWeekAndDay_countThatHappened;
        if (i28 > 0) {
            this.hourOfTheWeekAndDay_proportionThatRecalled = c17 / i28;
        }
        this.total_countThatHappened = f0Var.b(1, false, d17, currentTimeMillis);
        int b17 = f0Var.b(2, false, d17, currentTimeMillis);
        this.total_countThatRecalled = b17;
        int i29 = this.total_countThatHappened;
        if (i29 > 0) {
            this.total_proportionThatRecalled = b17 / i29;
        }
    }

    @Override // fl0.b
    public java.lang.String getName() {
        return "HistoriesOfNoReddotLiveHomeFeatureGroup";
    }
}
