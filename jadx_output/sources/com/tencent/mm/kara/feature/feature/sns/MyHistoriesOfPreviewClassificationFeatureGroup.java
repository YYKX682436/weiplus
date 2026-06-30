package com.tencent.mm.kara.feature.feature.sns;

/* loaded from: classes13.dex */
public class MyHistoriesOfPreviewClassificationFeatureGroup extends pl0.e {

    @fl0.a
    public com.tencent.mm.kara.feature.feature.sns.MyHistoriesOfPreviewClassificationFeatureGroup.MyTypeHabitsFeatureGroup image = new com.tencent.mm.kara.feature.feature.sns.MyHistoriesOfPreviewClassificationFeatureGroup.MyTypeHabitsFeatureGroup("image", 1);

    @fl0.a
    public com.tencent.mm.kara.feature.feature.sns.MyHistoriesOfPreviewClassificationFeatureGroup.MyTypeHabitsFeatureGroup video = new com.tencent.mm.kara.feature.feature.sns.MyHistoriesOfPreviewClassificationFeatureGroup.MyTypeHabitsFeatureGroup("video", 15);

    @fl0.a
    public com.tencent.mm.kara.feature.feature.sns.MyHistoriesOfPreviewClassificationFeatureGroup.MyTypeHabitsFeatureGroup webview = new com.tencent.mm.kara.feature.feature.sns.MyHistoriesOfPreviewClassificationFeatureGroup.MyTypeHabitsFeatureGroup("webview", 3);

    /* loaded from: classes13.dex */
    public class MyTypeHabitsFeatureGroup extends pl0.e {
        private final int TYPE;

        @fl0.a
        public int dayOfTheWeek_countThatHappened;

        @fl0.a
        public int dayOfTheWeek_countThatRecalled;

        @fl0.a
        public float dayOfTheWeek_proportionThatRecalled;
        private java.lang.String groupName;

        @fl0.a
        public int hourOfTheDay_countThatHappened;

        @fl0.a
        public int hourOfTheDay_countThatRecalled;

        @fl0.a
        public float hourOfTheDay_proportionThatRecalled;

        @fl0.a
        public int hourOfTheWeekAndDay_countThatHappened;

        @fl0.a
        public int hourOfTheWeekAndDay_countThatRecalled;

        @fl0.a
        public float hourOfTheWeekAndDay_proportionThatRecalled;

        @fl0.a
        public int total_countThatHappened;

        @fl0.a
        public int total_countThatRecalled;

        @fl0.a
        public float total_proportionThatRecalled;

        public MyTypeHabitsFeatureGroup(java.lang.String str, int i17) {
            this.groupName = str;
            this.TYPE = i17;
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
            sl0.s1 s1Var = sl0.s1.f409219e;
            this.total_countThatHappened = s1Var.b(11, this.TYPE, d17, currentTimeMillis);
            int b17 = s1Var.b(12, this.TYPE, d17, currentTimeMillis);
            this.total_countThatRecalled = b17;
            int i19 = this.total_countThatHappened;
            if (i19 > 0) {
                this.total_proportionThatRecalled = b17 / i19;
            }
            this.dayOfTheWeek_countThatHappened = s1Var.f(11, this.TYPE, d17, currentTimeMillis, i18);
            int f17 = s1Var.f(12, this.TYPE, d17, currentTimeMillis, i18);
            this.dayOfTheWeek_countThatRecalled = f17;
            int i27 = this.dayOfTheWeek_countThatHappened;
            if (i27 > 0) {
                this.dayOfTheWeek_proportionThatRecalled = f17 / i27;
            }
            this.hourOfTheDay_countThatHappened = s1Var.h(11, this.TYPE, d17, currentTimeMillis, i17);
            int h17 = s1Var.h(12, this.TYPE, d17, currentTimeMillis, i17);
            this.hourOfTheDay_countThatRecalled = h17;
            int i28 = this.hourOfTheDay_countThatHappened;
            if (i28 > 0) {
                this.hourOfTheDay_proportionThatRecalled = h17 / i28;
            }
            this.hourOfTheWeekAndDay_countThatHappened = s1Var.d(11, this.TYPE, d17, currentTimeMillis, i18, i17);
            int d18 = s1Var.d(12, this.TYPE, d17, currentTimeMillis, i18, i17);
            this.hourOfTheWeekAndDay_countThatRecalled = d18;
            int i29 = this.hourOfTheWeekAndDay_countThatHappened;
            if (i29 > 0) {
                this.hourOfTheWeekAndDay_proportionThatRecalled = d18 / i29;
            }
        }

        @Override // fl0.b
        public java.lang.String getName() {
            return this.groupName;
        }
    }

    @Override // fl0.b
    public java.lang.String getName() {
        return "historiesOfPreviewClassification";
    }
}
