package com.tencent.mm.kara.feature.feature.sns;

/* loaded from: classes13.dex */
public class SenderMessageHistories extends pl0.e {

    @fl0.a
    public com.tencent.mm.kara.feature.feature.sns.SenderMessageHistories.SenderTypeMessageHistories image;

    @fl0.a
    public com.tencent.mm.kara.feature.feature.sns.SenderMessageHistories.SenderTypeMessageHistories video;

    @fl0.a
    public com.tencent.mm.kara.feature.feature.sns.SenderMessageHistories.SenderTypeMessageHistories web;

    /* loaded from: classes13.dex */
    public class SenderTypeMessageHistories extends pl0.e {
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
        private java.lang.String userName;

        public SenderTypeMessageHistories(java.lang.String str, java.lang.String str2, int i17) {
            this.userName = str;
            this.groupName = str2;
            this.TYPE = i17;
        }

        @Override // pl0.e, fl0.b
        public void build() {
            super.build();
            if (android.text.TextUtils.isEmpty(this.userName)) {
                return;
            }
            sl0.e eVar = sl0.e.f409095e;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            long d17 = nl0.e.d(currentTimeMillis);
            java.util.Calendar calendar = java.util.Calendar.getInstance();
            calendar.setTime(new java.util.Date(currentTimeMillis));
            int i17 = calendar.get(11);
            int i18 = calendar.get(7);
            this.dayOfTheWeek_countThatHappened = eVar.d(this.userName, 1, this.TYPE, d17, currentTimeMillis, i18);
            int d18 = eVar.d(this.userName, 2, this.TYPE, d17, currentTimeMillis, i18);
            this.dayOfTheWeek_countThatRecalled = d18;
            int i19 = this.dayOfTheWeek_countThatHappened;
            if (i19 > 0) {
                this.dayOfTheWeek_proportionThatRecalled = d18 / i19;
            }
            this.hourOfTheDay_countThatHappened = eVar.e(this.userName, 1, this.TYPE, d17, currentTimeMillis, i17);
            int e17 = eVar.e(this.userName, 2, this.TYPE, d17, currentTimeMillis, i17);
            this.hourOfTheDay_countThatRecalled = e17;
            int i27 = this.hourOfTheDay_countThatHappened;
            if (i27 > 0) {
                this.hourOfTheDay_proportionThatRecalled = e17 / i27;
            }
            this.hourOfTheWeekAndDay_countThatHappened = eVar.c(this.userName, 1, this.TYPE, d17, currentTimeMillis, i18, i17);
            int c17 = eVar.c(this.userName, 2, this.TYPE, d17, currentTimeMillis, i18, i17);
            this.hourOfTheWeekAndDay_countThatRecalled = c17;
            int i28 = this.hourOfTheWeekAndDay_countThatHappened;
            if (i28 > 0) {
                this.hourOfTheWeekAndDay_proportionThatRecalled = c17 / i28;
            }
            this.total_countThatHappened = eVar.b(this.userName, 1, this.TYPE, d17, currentTimeMillis);
            int b17 = eVar.b(this.userName, 2, this.TYPE, d17, currentTimeMillis);
            this.total_countThatRecalled = b17;
            int i29 = this.total_countThatHappened;
            if (i29 > 0) {
                this.total_proportionThatRecalled = b17 / i29;
            }
        }

        @Override // fl0.b
        public java.lang.String getName() {
            return this.groupName;
        }
    }

    public SenderMessageHistories(java.lang.String str) {
        this.image = new com.tencent.mm.kara.feature.feature.sns.SenderMessageHistories.SenderTypeMessageHistories(str, "image", 1);
        this.video = new com.tencent.mm.kara.feature.feature.sns.SenderMessageHistories.SenderTypeMessageHistories(str, "video", 2);
        this.web = new com.tencent.mm.kara.feature.feature.sns.SenderMessageHistories.SenderTypeMessageHistories(str, "webview", 3);
    }

    @Override // fl0.b
    public java.lang.String getName() {
        return "sender_messageHistories";
    }
}
