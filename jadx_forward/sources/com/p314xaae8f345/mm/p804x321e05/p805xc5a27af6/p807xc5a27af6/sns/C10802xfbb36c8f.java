package com.p314xaae8f345.mm.p804x321e05.p805xc5a27af6.p807xc5a27af6.sns;

/* renamed from: com.tencent.mm.kara.feature.feature.sns.SenderSnsHistories */
/* loaded from: classes13.dex */
public class C10802xfbb36c8f extends pl0.e {

    /* renamed from: image */
    @fl0.a
    public com.p314xaae8f345.mm.p804x321e05.p805xc5a27af6.p807xc5a27af6.sns.C10802xfbb36c8f.SenderTypeSnsHistories f29606x5faa95b;

    /* renamed from: video */
    @fl0.a
    public com.p314xaae8f345.mm.p804x321e05.p805xc5a27af6.p807xc5a27af6.sns.C10802xfbb36c8f.SenderTypeSnsHistories f29607x6b0147b;

    @fl0.a
    public com.p314xaae8f345.mm.p804x321e05.p805xc5a27af6.p807xc5a27af6.sns.C10802xfbb36c8f.SenderTypeSnsHistories web;

    /* renamed from: com.tencent.mm.kara.feature.feature.sns.SenderSnsHistories$SenderTypeSnsHistories */
    /* loaded from: classes13.dex */
    public class SenderTypeSnsHistories extends pl0.e {

        /* renamed from: TYPE */
        private final int f29608x27873a;

        /* renamed from: dayOfTheWeek_countThatHappened */
        @fl0.a
        public int f29609x2721bbaa;

        /* renamed from: dayOfTheWeek_countThatRecalled */
        @fl0.a
        public int f29610xf2872fd9;

        /* renamed from: dayOfTheWeek_proportionThatRecalled */
        @fl0.a
        public float f29611x828e34de;

        /* renamed from: groupName */
        private java.lang.String f29612xa7988daa;

        /* renamed from: hourOfTheDay_countThatHappened */
        @fl0.a
        public int f29613x2abb38de;

        /* renamed from: hourOfTheDay_countThatRecalled */
        @fl0.a
        public int f29614xf620ad0d;

        /* renamed from: hourOfTheDay_proportionThatRecalled */
        @fl0.a
        public float f29615x7d16d82a;

        /* renamed from: hourOfTheWeekAndDay_countThatHappened */
        @fl0.a
        public int f29616x3e1f0007;

        /* renamed from: hourOfTheWeekAndDay_countThatRecalled */
        @fl0.a
        public int f29617x9847436;

        /* renamed from: hourOfTheWeekAndDay_proportionThatRecalled */
        @fl0.a
        public float f29618xe9ee22a1;

        /* renamed from: total_countThatHappened */
        @fl0.a
        public int f29620x1e10ec7c;

        /* renamed from: total_countThatRecalled */
        @fl0.a
        public int f29621xe97660ab;

        /* renamed from: total_proportionThatRecalled */
        @fl0.a
        public float f29622xd7f6b74c;

        /* renamed from: userName */
        private java.lang.String f29623xf01afcf6;

        public SenderTypeSnsHistories(java.lang.String str, java.lang.String str2, int i17) {
            this.f29623xf01afcf6 = str;
            this.f29612xa7988daa = str2;
            this.f29608x27873a = i17;
        }

        @Override // pl0.e, fl0.b
        /* renamed from: build */
        public void mo46315x59bc66e() {
            super.mo46315x59bc66e();
            if (android.text.TextUtils.isEmpty(this.f29623xf01afcf6)) {
                return;
            }
            sl0.s1 s1Var = sl0.s1.f490752e;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            long d17 = nl0.e.d(currentTimeMillis);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.f2 Fj = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj();
            java.lang.String str = this.f29623xf01afcf6;
            Fj.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCursorByUserName", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            android.database.Cursor K1 = Fj.K1(true, str, 0, false, "", (int) (d17 / 1000), (int) (currentTimeMillis / 1000));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCursorByUserName", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
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
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226();
                c17933xe8d1b226.mo9015xbf5d97fd(K1);
                if (c17933xe8d1b226.m70419x7b953cf2()) {
                    android.database.Cursor cursor = K1;
                    int g17 = i47 + s1Var.g(c17933xe8d1b226.m70367x7525eefd(), 11, this.f29608x27873a, d17, currentTimeMillis, i18);
                    int g18 = i38 + s1Var.g(c17933xe8d1b226.m70367x7525eefd(), 12, this.f29608x27873a, d17, currentTimeMillis, i18);
                    int i48 = i39 + s1Var.i(c17933xe8d1b226.m70367x7525eefd(), 11, this.f29608x27873a, d17, currentTimeMillis, i17);
                    int i49 = i29 + s1Var.i(c17933xe8d1b226.m70367x7525eefd(), 12, this.f29608x27873a, d17, currentTimeMillis, i17);
                    int e17 = i37 + s1Var.e(c17933xe8d1b226.m70367x7525eefd(), 11, this.f29608x27873a, d17, currentTimeMillis, i17, i17);
                    int e18 = i28 + s1Var.e(c17933xe8d1b226.m70367x7525eefd(), 12, this.f29608x27873a, d17, currentTimeMillis, i17, i17);
                    int c17 = i27 + s1Var.c(c17933xe8d1b226.m70367x7525eefd(), 11, this.f29608x27873a, d17, currentTimeMillis);
                    i19 += s1Var.c(c17933xe8d1b226.m70367x7525eefd(), 12, this.f29608x27873a, d17, currentTimeMillis);
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
            this.f29609x2721bbaa = i57;
            this.f29610xf2872fd9 = i38;
            this.f29613x2abb38de = i39;
            this.f29614xf620ad0d = i29;
            this.f29616x3e1f0007 = i37;
            this.f29617x9847436 = i28;
            this.f29620x1e10ec7c = i27;
            this.f29621xe97660ab = i19;
            if (i57 > 0) {
                this.f29611x828e34de = i38 / i57;
            }
            if (i39 > 0) {
                this.f29615x7d16d82a = i29 / i39;
            }
            if (i37 > 0) {
                this.f29618xe9ee22a1 = i28 / i37;
            }
            if (i27 > 0) {
                this.f29622xd7f6b74c = i19 / i27;
            }
        }

        @Override // fl0.b
        /* renamed from: getName */
        public java.lang.String mo46314xfb82e301() {
            return this.f29612xa7988daa;
        }
    }

    public C10802xfbb36c8f(java.lang.String str) {
        this.f29606x5faa95b = new com.p314xaae8f345.mm.p804x321e05.p805xc5a27af6.p807xc5a27af6.sns.C10802xfbb36c8f.SenderTypeSnsHistories(str, "image", 1);
        this.f29607x6b0147b = new com.p314xaae8f345.mm.p804x321e05.p805xc5a27af6.p807xc5a27af6.sns.C10802xfbb36c8f.SenderTypeSnsHistories(str, "video", 15);
        this.web = new com.p314xaae8f345.mm.p804x321e05.p805xc5a27af6.p807xc5a27af6.sns.C10802xfbb36c8f.SenderTypeSnsHistories(str, "webview", 3);
    }

    @Override // fl0.b
    /* renamed from: getName */
    public java.lang.String mo46314xfb82e301() {
        return "sender_momentHistories";
    }
}
