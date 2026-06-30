package com.tencent.mm.kara.feature.feature.sns;

/* loaded from: classes13.dex */
public class HistoriesOfWeishangFeatureGroup extends pl0.e {

    @fl0.a
    public com.tencent.mm.kara.feature.feature.sns.HistoriesOfWeishangFeatureGroup.WeishangWebviewFeatureGroup image = new com.tencent.mm.kara.feature.feature.sns.HistoriesOfWeishangFeatureGroup.WeishangWebviewFeatureGroup("image", 1);

    @fl0.a
    public com.tencent.mm.kara.feature.feature.sns.HistoriesOfWeishangFeatureGroup.WeishangWebviewFeatureGroup video = new com.tencent.mm.kara.feature.feature.sns.HistoriesOfWeishangFeatureGroup.WeishangWebviewFeatureGroup("video", 15);

    @fl0.a
    public com.tencent.mm.kara.feature.feature.sns.HistoriesOfWeishangFeatureGroup.WeishangWebviewFeatureGroup webview = new com.tencent.mm.kara.feature.feature.sns.HistoriesOfWeishangFeatureGroup.WeishangWebviewFeatureGroup("webview", 3);

    /* loaded from: classes13.dex */
    public class WeishangWebviewFeatureGroup extends pl0.e {
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

        public WeishangWebviewFeatureGroup(java.lang.String str, int i17) {
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
            this.total_countThatHappened = s1Var.n(11, this.TYPE, d17, currentTimeMillis);
            int n17 = s1Var.n(12, this.TYPE, d17, currentTimeMillis);
            this.total_countThatRecalled = n17;
            int i19 = this.total_countThatHappened;
            if (i19 > 0) {
                this.total_proportionThatRecalled = n17 / i19;
            }
            this.dayOfTheWeek_countThatHappened = s1Var.p(11, this.TYPE, d17, currentTimeMillis, i18);
            int p17 = s1Var.p(12, this.TYPE, d17, currentTimeMillis, i18);
            this.dayOfTheWeek_countThatRecalled = p17;
            int i27 = this.dayOfTheWeek_countThatHappened;
            if (i27 > 0) {
                this.dayOfTheWeek_proportionThatRecalled = p17 / i27;
            }
            this.hourOfTheDay_countThatHappened = s1Var.q(11, this.TYPE, d17, currentTimeMillis, i17);
            int q17 = s1Var.q(12, this.TYPE, d17, currentTimeMillis, i17);
            this.hourOfTheDay_countThatRecalled = q17;
            int i28 = this.hourOfTheDay_countThatHappened;
            if (i28 > 0) {
                this.hourOfTheDay_proportionThatRecalled = q17 / i28;
            }
            this.hourOfTheWeekAndDay_countThatHappened = s1Var.o(11, this.TYPE, d17, currentTimeMillis, i18, i17);
            int o17 = s1Var.o(12, this.TYPE, d17, currentTimeMillis, i18, i17);
            this.hourOfTheWeekAndDay_countThatRecalled = o17;
            int i29 = this.hourOfTheWeekAndDay_countThatHappened;
            if (i29 > 0) {
                this.hourOfTheWeekAndDay_proportionThatRecalled = o17 / i29;
            }
        }

        @Override // fl0.b
        public java.lang.String getName() {
            return this.groupName;
        }
    }

    @Override // fl0.b
    public java.lang.String getName() {
        return "historiesOfWeishang";
    }
}
