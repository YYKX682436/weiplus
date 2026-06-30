package com.tencent.mm.kara.feature.feature.sns;

/* loaded from: classes4.dex */
public class HistoriesOfSameCityFeatureGroup extends pl0.e {

    @fl0.a
    public com.tencent.mm.kara.feature.feature.sns.HistoriesOfSameCityFeatureGroup.SameCityHabitsFeatureGroup image;

    @fl0.a
    public com.tencent.mm.kara.feature.feature.sns.HistoriesOfSameCityFeatureGroup.SameCityHabitsFeatureGroup video;

    @fl0.a
    public com.tencent.mm.kara.feature.feature.sns.HistoriesOfSameCityFeatureGroup.SameCityHabitsFeatureGroup webview;

    /* loaded from: classes13.dex */
    public class SameCityHabitsFeatureGroup extends pl0.e {
        private final int TYPE;
        private java.lang.String city;

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

        public SameCityHabitsFeatureGroup(java.lang.String str, int i17, java.lang.String str2) {
            this.groupName = str;
            this.TYPE = i17;
            this.city = str2;
        }

        @Override // pl0.e, fl0.b
        public void build() {
            super.build();
            if (android.text.TextUtils.isEmpty(this.city)) {
                return;
            }
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            long d17 = nl0.e.d(currentTimeMillis);
            java.util.Calendar calendar = java.util.Calendar.getInstance();
            calendar.setTime(new java.util.Date(currentTimeMillis));
            int i17 = calendar.get(11);
            int i18 = calendar.get(7);
            sl0.s1 s1Var = sl0.s1.f409219e;
            this.total_countThatHappened = s1Var.j(11, this.TYPE, d17, currentTimeMillis, this.city);
            int j17 = s1Var.j(12, this.TYPE, d17, currentTimeMillis, this.city);
            this.total_countThatRecalled = j17;
            int i19 = this.total_countThatHappened;
            if (i19 > 0) {
                this.total_proportionThatRecalled = j17 / i19;
            }
            this.dayOfTheWeek_countThatHappened = s1Var.l(11, this.TYPE, d17, currentTimeMillis, i18, this.city);
            int l17 = s1Var.l(12, this.TYPE, d17, currentTimeMillis, i18, this.city);
            this.dayOfTheWeek_countThatRecalled = l17;
            int i27 = this.dayOfTheWeek_countThatHappened;
            if (i27 > 0) {
                this.dayOfTheWeek_proportionThatRecalled = l17 / i27;
            }
            this.hourOfTheDay_countThatHappened = s1Var.m(11, this.TYPE, d17, currentTimeMillis, i17, this.city);
            int m17 = s1Var.m(12, this.TYPE, d17, currentTimeMillis, i17, this.city);
            this.hourOfTheDay_countThatRecalled = m17;
            int i28 = this.hourOfTheDay_countThatHappened;
            if (i28 > 0) {
                this.hourOfTheDay_proportionThatRecalled = m17 / i28;
            }
            this.hourOfTheWeekAndDay_countThatHappened = s1Var.k(11, this.TYPE, d17, currentTimeMillis, i18, i17, this.city);
            int k17 = s1Var.k(12, this.TYPE, d17, currentTimeMillis, i18, i17, this.city);
            this.hourOfTheWeekAndDay_countThatRecalled = k17;
            int i29 = this.hourOfTheWeekAndDay_countThatHappened;
            if (i29 > 0) {
                this.hourOfTheWeekAndDay_proportionThatRecalled = k17 / i29;
            }
        }

        @Override // fl0.b
        public java.lang.String getName() {
            return this.groupName;
        }
    }

    public HistoriesOfSameCityFeatureGroup(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        r45.ed4 ed4Var;
        java.lang.String str;
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = snsInfo.getTimeLine();
        java.lang.String str2 = "";
        if (timeLine != null && (ed4Var = timeLine.Location) != null && (str = ed4Var.f373313f) != null) {
            str2 = str;
        }
        str2 = str2.endsWith("市") ? str2.substring(0, str2.length() - 1) : str2;
        this.image = new com.tencent.mm.kara.feature.feature.sns.HistoriesOfSameCityFeatureGroup.SameCityHabitsFeatureGroup("image", 1, str2);
        this.video = new com.tencent.mm.kara.feature.feature.sns.HistoriesOfSameCityFeatureGroup.SameCityHabitsFeatureGroup("video", 15, str2);
        this.webview = new com.tencent.mm.kara.feature.feature.sns.HistoriesOfSameCityFeatureGroup.SameCityHabitsFeatureGroup("webview", 3, str2);
    }

    @Override // fl0.b
    public java.lang.String getName() {
        return "historiesOfSameCity";
    }
}
