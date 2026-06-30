package com.p314xaae8f345.mm.p804x321e05.p805xc5a27af6.p807xc5a27af6.sns;

/* renamed from: com.tencent.mm.kara.feature.feature.sns.SenderMessageHistories */
/* loaded from: classes13.dex */
public class C10799xe6861860 extends pl0.e {

    /* renamed from: image */
    @fl0.a
    public com.p314xaae8f345.mm.p804x321e05.p805xc5a27af6.p807xc5a27af6.sns.C10799xe6861860.SenderTypeMessageHistories f29582x5faa95b;

    /* renamed from: video */
    @fl0.a
    public com.p314xaae8f345.mm.p804x321e05.p805xc5a27af6.p807xc5a27af6.sns.C10799xe6861860.SenderTypeMessageHistories f29583x6b0147b;

    @fl0.a
    public com.p314xaae8f345.mm.p804x321e05.p805xc5a27af6.p807xc5a27af6.sns.C10799xe6861860.SenderTypeMessageHistories web;

    /* renamed from: com.tencent.mm.kara.feature.feature.sns.SenderMessageHistories$SenderTypeMessageHistories */
    /* loaded from: classes13.dex */
    public class SenderTypeMessageHistories extends pl0.e {

        /* renamed from: TYPE */
        private final int f29584x27873a;

        /* renamed from: dayOfTheWeek_countThatHappened */
        @fl0.a
        public int f29585x2721bbaa;

        /* renamed from: dayOfTheWeek_countThatRecalled */
        @fl0.a
        public int f29586xf2872fd9;

        /* renamed from: dayOfTheWeek_proportionThatRecalled */
        @fl0.a
        public float f29587x828e34de;

        /* renamed from: groupName */
        private java.lang.String f29588xa7988daa;

        /* renamed from: hourOfTheDay_countThatHappened */
        @fl0.a
        public int f29589x2abb38de;

        /* renamed from: hourOfTheDay_countThatRecalled */
        @fl0.a
        public int f29590xf620ad0d;

        /* renamed from: hourOfTheDay_proportionThatRecalled */
        @fl0.a
        public float f29591x7d16d82a;

        /* renamed from: hourOfTheWeekAndDay_countThatHappened */
        @fl0.a
        public int f29592x3e1f0007;

        /* renamed from: hourOfTheWeekAndDay_countThatRecalled */
        @fl0.a
        public int f29593x9847436;

        /* renamed from: hourOfTheWeekAndDay_proportionThatRecalled */
        @fl0.a
        public float f29594xe9ee22a1;

        /* renamed from: total_countThatHappened */
        @fl0.a
        public int f29596x1e10ec7c;

        /* renamed from: total_countThatRecalled */
        @fl0.a
        public int f29597xe97660ab;

        /* renamed from: total_proportionThatRecalled */
        @fl0.a
        public float f29598xd7f6b74c;

        /* renamed from: userName */
        private java.lang.String f29599xf01afcf6;

        public SenderTypeMessageHistories(java.lang.String str, java.lang.String str2, int i17) {
            this.f29599xf01afcf6 = str;
            this.f29588xa7988daa = str2;
            this.f29584x27873a = i17;
        }

        @Override // pl0.e, fl0.b
        /* renamed from: build */
        public void mo46315x59bc66e() {
            super.mo46315x59bc66e();
            if (android.text.TextUtils.isEmpty(this.f29599xf01afcf6)) {
                return;
            }
            sl0.e eVar = sl0.e.f490628e;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            long d17 = nl0.e.d(currentTimeMillis);
            java.util.Calendar calendar = java.util.Calendar.getInstance();
            calendar.setTime(new java.util.Date(currentTimeMillis));
            int i17 = calendar.get(11);
            int i18 = calendar.get(7);
            this.f29585x2721bbaa = eVar.d(this.f29599xf01afcf6, 1, this.f29584x27873a, d17, currentTimeMillis, i18);
            int d18 = eVar.d(this.f29599xf01afcf6, 2, this.f29584x27873a, d17, currentTimeMillis, i18);
            this.f29586xf2872fd9 = d18;
            int i19 = this.f29585x2721bbaa;
            if (i19 > 0) {
                this.f29587x828e34de = d18 / i19;
            }
            this.f29589x2abb38de = eVar.e(this.f29599xf01afcf6, 1, this.f29584x27873a, d17, currentTimeMillis, i17);
            int e17 = eVar.e(this.f29599xf01afcf6, 2, this.f29584x27873a, d17, currentTimeMillis, i17);
            this.f29590xf620ad0d = e17;
            int i27 = this.f29589x2abb38de;
            if (i27 > 0) {
                this.f29591x7d16d82a = e17 / i27;
            }
            this.f29592x3e1f0007 = eVar.c(this.f29599xf01afcf6, 1, this.f29584x27873a, d17, currentTimeMillis, i18, i17);
            int c17 = eVar.c(this.f29599xf01afcf6, 2, this.f29584x27873a, d17, currentTimeMillis, i18, i17);
            this.f29593x9847436 = c17;
            int i28 = this.f29592x3e1f0007;
            if (i28 > 0) {
                this.f29594xe9ee22a1 = c17 / i28;
            }
            this.f29596x1e10ec7c = eVar.b(this.f29599xf01afcf6, 1, this.f29584x27873a, d17, currentTimeMillis);
            int b17 = eVar.b(this.f29599xf01afcf6, 2, this.f29584x27873a, d17, currentTimeMillis);
            this.f29597xe97660ab = b17;
            int i29 = this.f29596x1e10ec7c;
            if (i29 > 0) {
                this.f29598xd7f6b74c = b17 / i29;
            }
        }

        @Override // fl0.b
        /* renamed from: getName */
        public java.lang.String mo46314xfb82e301() {
            return this.f29588xa7988daa;
        }
    }

    public C10799xe6861860(java.lang.String str) {
        this.f29582x5faa95b = new com.p314xaae8f345.mm.p804x321e05.p805xc5a27af6.p807xc5a27af6.sns.C10799xe6861860.SenderTypeMessageHistories(str, "image", 1);
        this.f29583x6b0147b = new com.p314xaae8f345.mm.p804x321e05.p805xc5a27af6.p807xc5a27af6.sns.C10799xe6861860.SenderTypeMessageHistories(str, "video", 2);
        this.web = new com.p314xaae8f345.mm.p804x321e05.p805xc5a27af6.p807xc5a27af6.sns.C10799xe6861860.SenderTypeMessageHistories(str, "webview", 3);
    }

    @Override // fl0.b
    /* renamed from: getName */
    public java.lang.String mo46314xfb82e301() {
        return "sender_messageHistories";
    }
}
