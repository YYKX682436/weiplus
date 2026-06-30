package com.p314xaae8f345.mm.p804x321e05.p805xc5a27af6.p807xc5a27af6.sns;

/* renamed from: com.tencent.mm.kara.feature.feature.sns.HistoriesOfWeishangFeatureGroup */
/* loaded from: classes13.dex */
public class C10797xc010025c extends pl0.e {

    /* renamed from: image */
    @fl0.a
    public com.p314xaae8f345.mm.p804x321e05.p805xc5a27af6.p807xc5a27af6.sns.C10797xc010025c.WeishangWebviewFeatureGroup f29546x5faa95b = new com.p314xaae8f345.mm.p804x321e05.p805xc5a27af6.p807xc5a27af6.sns.C10797xc010025c.WeishangWebviewFeatureGroup("image", 1);

    /* renamed from: video */
    @fl0.a
    public com.p314xaae8f345.mm.p804x321e05.p805xc5a27af6.p807xc5a27af6.sns.C10797xc010025c.WeishangWebviewFeatureGroup f29547x6b0147b = new com.p314xaae8f345.mm.p804x321e05.p805xc5a27af6.p807xc5a27af6.sns.C10797xc010025c.WeishangWebviewFeatureGroup("video", 15);

    /* renamed from: webview */
    @fl0.a
    public com.p314xaae8f345.mm.p804x321e05.p805xc5a27af6.p807xc5a27af6.sns.C10797xc010025c.WeishangWebviewFeatureGroup f29548x48fb3bf9 = new com.p314xaae8f345.mm.p804x321e05.p805xc5a27af6.p807xc5a27af6.sns.C10797xc010025c.WeishangWebviewFeatureGroup("webview", 3);

    /* renamed from: com.tencent.mm.kara.feature.feature.sns.HistoriesOfWeishangFeatureGroup$WeishangWebviewFeatureGroup */
    /* loaded from: classes13.dex */
    public class WeishangWebviewFeatureGroup extends pl0.e {

        /* renamed from: TYPE */
        private final int f29549x27873a;

        /* renamed from: dayOfTheWeek_countThatHappened */
        @fl0.a
        public int f29550x2721bbaa;

        /* renamed from: dayOfTheWeek_countThatRecalled */
        @fl0.a
        public int f29551xf2872fd9;

        /* renamed from: dayOfTheWeek_proportionThatRecalled */
        @fl0.a
        public float f29552x828e34de;

        /* renamed from: groupName */
        private java.lang.String f29553xa7988daa;

        /* renamed from: hourOfTheDay_countThatHappened */
        @fl0.a
        public int f29554x2abb38de;

        /* renamed from: hourOfTheDay_countThatRecalled */
        @fl0.a
        public int f29555xf620ad0d;

        /* renamed from: hourOfTheDay_proportionThatRecalled */
        @fl0.a
        public float f29556x7d16d82a;

        /* renamed from: hourOfTheWeekAndDay_countThatHappened */
        @fl0.a
        public int f29557x3e1f0007;

        /* renamed from: hourOfTheWeekAndDay_countThatRecalled */
        @fl0.a
        public int f29558x9847436;

        /* renamed from: hourOfTheWeekAndDay_proportionThatRecalled */
        @fl0.a
        public float f29559xe9ee22a1;

        /* renamed from: total_countThatHappened */
        @fl0.a
        public int f29561x1e10ec7c;

        /* renamed from: total_countThatRecalled */
        @fl0.a
        public int f29562xe97660ab;

        /* renamed from: total_proportionThatRecalled */
        @fl0.a
        public float f29563xd7f6b74c;

        public WeishangWebviewFeatureGroup(java.lang.String str, int i17) {
            this.f29553xa7988daa = str;
            this.f29549x27873a = i17;
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
            sl0.s1 s1Var = sl0.s1.f490752e;
            this.f29561x1e10ec7c = s1Var.n(11, this.f29549x27873a, d17, currentTimeMillis);
            int n17 = s1Var.n(12, this.f29549x27873a, d17, currentTimeMillis);
            this.f29562xe97660ab = n17;
            int i19 = this.f29561x1e10ec7c;
            if (i19 > 0) {
                this.f29563xd7f6b74c = n17 / i19;
            }
            this.f29550x2721bbaa = s1Var.p(11, this.f29549x27873a, d17, currentTimeMillis, i18);
            int p17 = s1Var.p(12, this.f29549x27873a, d17, currentTimeMillis, i18);
            this.f29551xf2872fd9 = p17;
            int i27 = this.f29550x2721bbaa;
            if (i27 > 0) {
                this.f29552x828e34de = p17 / i27;
            }
            this.f29554x2abb38de = s1Var.q(11, this.f29549x27873a, d17, currentTimeMillis, i17);
            int q17 = s1Var.q(12, this.f29549x27873a, d17, currentTimeMillis, i17);
            this.f29555xf620ad0d = q17;
            int i28 = this.f29554x2abb38de;
            if (i28 > 0) {
                this.f29556x7d16d82a = q17 / i28;
            }
            this.f29557x3e1f0007 = s1Var.o(11, this.f29549x27873a, d17, currentTimeMillis, i18, i17);
            int o17 = s1Var.o(12, this.f29549x27873a, d17, currentTimeMillis, i18, i17);
            this.f29558x9847436 = o17;
            int i29 = this.f29557x3e1f0007;
            if (i29 > 0) {
                this.f29559xe9ee22a1 = o17 / i29;
            }
        }

        @Override // fl0.b
        /* renamed from: getName */
        public java.lang.String mo46314xfb82e301() {
            return this.f29553xa7988daa;
        }
    }

    @Override // fl0.b
    /* renamed from: getName */
    public java.lang.String mo46314xfb82e301() {
        return "historiesOfWeishang";
    }
}
