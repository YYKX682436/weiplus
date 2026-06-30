package com.tencent.mm.kara.feature.feature.sns;

/* loaded from: classes13.dex */
public class SenderSnsHistories extends pl0.e {

    @fl0.a
    public com.tencent.mm.kara.feature.feature.sns.SenderSnsHistories.SenderTypeSnsHistories image;

    @fl0.a
    public com.tencent.mm.kara.feature.feature.sns.SenderSnsHistories.SenderTypeSnsHistories video;

    @fl0.a
    public com.tencent.mm.kara.feature.feature.sns.SenderSnsHistories.SenderTypeSnsHistories web;

    /* loaded from: classes13.dex */
    public class SenderTypeSnsHistories extends pl0.e {
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

        public SenderTypeSnsHistories(java.lang.String str, java.lang.String str2, int i17) {
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
            sl0.s1 s1Var = sl0.s1.f409219e;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            long d17 = nl0.e.d(currentTimeMillis);
            com.tencent.mm.plugin.sns.storage.f2 Fj = com.tencent.mm.plugin.sns.model.l4.Fj();
            java.lang.String str = this.userName;
            Fj.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCursorByUserName", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            android.database.Cursor K1 = Fj.K1(true, str, 0, false, "", (int) (d17 / 1000), (int) (currentTimeMillis / 1000));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCursorByUserName", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            java.util.Calendar calendar = java.util.Calendar.getInstance();
            calendar.setTime(new java.util.Date(currentTimeMillis));
            int i17 = calendar.get(11);
            int i18 = calendar.get(7);
            int i19 = 0;
            int i27 = 0;
            int i28 = 0;
            int i29 = 0;
            int i37 = 0;
            int i38 = 0;
            int i39 = 0;
            int i47 = 0;
            while (K1.moveToNext()) {
                com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = new com.tencent.mm.plugin.sns.storage.SnsInfo();
                snsInfo.convertFrom(K1);
                if (snsInfo.isValid()) {
                    android.database.Cursor cursor = K1;
                    int g17 = i47 + s1Var.g(snsInfo.getSnsId(), 11, this.TYPE, d17, currentTimeMillis, i18);
                    int g18 = i38 + s1Var.g(snsInfo.getSnsId(), 12, this.TYPE, d17, currentTimeMillis, i18);
                    int i48 = i39 + s1Var.i(snsInfo.getSnsId(), 11, this.TYPE, d17, currentTimeMillis, i17);
                    int i49 = i29 + s1Var.i(snsInfo.getSnsId(), 12, this.TYPE, d17, currentTimeMillis, i17);
                    int e17 = i37 + s1Var.e(snsInfo.getSnsId(), 11, this.TYPE, d17, currentTimeMillis, i17, i17);
                    int e18 = i28 + s1Var.e(snsInfo.getSnsId(), 12, this.TYPE, d17, currentTimeMillis, i17, i17);
                    int c17 = i27 + s1Var.c(snsInfo.getSnsId(), 11, this.TYPE, d17, currentTimeMillis);
                    i19 += s1Var.c(snsInfo.getSnsId(), 12, this.TYPE, d17, currentTimeMillis);
                    i28 = e18;
                    i27 = c17;
                    K1 = cursor;
                    i47 = g17;
                    i38 = g18;
                    i39 = i48;
                    i29 = i49;
                    i37 = e17;
                }
            }
            android.database.Cursor cursor2 = K1;
            int i57 = i47;
            cursor2.close();
            this.dayOfTheWeek_countThatHappened = i57;
            this.dayOfTheWeek_countThatRecalled = i38;
            this.hourOfTheDay_countThatHappened = i39;
            this.hourOfTheDay_countThatRecalled = i29;
            this.hourOfTheWeekAndDay_countThatHappened = i37;
            this.hourOfTheWeekAndDay_countThatRecalled = i28;
            this.total_countThatHappened = i27;
            this.total_countThatRecalled = i19;
            if (i57 > 0) {
                this.dayOfTheWeek_proportionThatRecalled = i38 / i57;
            }
            if (i39 > 0) {
                this.hourOfTheDay_proportionThatRecalled = i29 / i39;
            }
            if (i37 > 0) {
                this.hourOfTheWeekAndDay_proportionThatRecalled = i28 / i37;
            }
            if (i27 > 0) {
                this.total_proportionThatRecalled = i19 / i27;
            }
        }

        @Override // fl0.b
        public java.lang.String getName() {
            return this.groupName;
        }
    }

    public SenderSnsHistories(java.lang.String str) {
        this.image = new com.tencent.mm.kara.feature.feature.sns.SenderSnsHistories.SenderTypeSnsHistories(str, "image", 1);
        this.video = new com.tencent.mm.kara.feature.feature.sns.SenderSnsHistories.SenderTypeSnsHistories(str, "video", 15);
        this.web = new com.tencent.mm.kara.feature.feature.sns.SenderSnsHistories.SenderTypeSnsHistories(str, "webview", 3);
    }

    @Override // fl0.b
    public java.lang.String getName() {
        return "sender_momentHistories";
    }
}
