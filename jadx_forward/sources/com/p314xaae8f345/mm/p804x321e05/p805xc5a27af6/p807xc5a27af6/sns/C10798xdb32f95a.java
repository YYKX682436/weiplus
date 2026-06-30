package com.p314xaae8f345.mm.p804x321e05.p805xc5a27af6.p807xc5a27af6.sns;

/* renamed from: com.tencent.mm.kara.feature.feature.sns.MyHistoriesOfPreviewClassificationFeatureGroup */
/* loaded from: classes13.dex */
public class C10798xdb32f95a extends pl0.e {

    /* renamed from: image */
    @fl0.a
    public com.p314xaae8f345.mm.p804x321e05.p805xc5a27af6.p807xc5a27af6.sns.C10798xdb32f95a.MyTypeHabitsFeatureGroup f29564x5faa95b = new com.p314xaae8f345.mm.p804x321e05.p805xc5a27af6.p807xc5a27af6.sns.C10798xdb32f95a.MyTypeHabitsFeatureGroup("image", 1);

    /* renamed from: video */
    @fl0.a
    public com.p314xaae8f345.mm.p804x321e05.p805xc5a27af6.p807xc5a27af6.sns.C10798xdb32f95a.MyTypeHabitsFeatureGroup f29565x6b0147b = new com.p314xaae8f345.mm.p804x321e05.p805xc5a27af6.p807xc5a27af6.sns.C10798xdb32f95a.MyTypeHabitsFeatureGroup("video", 15);

    /* renamed from: webview */
    @fl0.a
    public com.p314xaae8f345.mm.p804x321e05.p805xc5a27af6.p807xc5a27af6.sns.C10798xdb32f95a.MyTypeHabitsFeatureGroup f29566x48fb3bf9 = new com.p314xaae8f345.mm.p804x321e05.p805xc5a27af6.p807xc5a27af6.sns.C10798xdb32f95a.MyTypeHabitsFeatureGroup("webview", 3);

    /* renamed from: com.tencent.mm.kara.feature.feature.sns.MyHistoriesOfPreviewClassificationFeatureGroup$MyTypeHabitsFeatureGroup */
    /* loaded from: classes13.dex */
    public class MyTypeHabitsFeatureGroup extends pl0.e {

        /* renamed from: TYPE */
        private final int f29567x27873a;

        /* renamed from: dayOfTheWeek_countThatHappened */
        @fl0.a
        public int f29568x2721bbaa;

        /* renamed from: dayOfTheWeek_countThatRecalled */
        @fl0.a
        public int f29569xf2872fd9;

        /* renamed from: dayOfTheWeek_proportionThatRecalled */
        @fl0.a
        public float f29570x828e34de;

        /* renamed from: groupName */
        private java.lang.String f29571xa7988daa;

        /* renamed from: hourOfTheDay_countThatHappened */
        @fl0.a
        public int f29572x2abb38de;

        /* renamed from: hourOfTheDay_countThatRecalled */
        @fl0.a
        public int f29573xf620ad0d;

        /* renamed from: hourOfTheDay_proportionThatRecalled */
        @fl0.a
        public float f29574x7d16d82a;

        /* renamed from: hourOfTheWeekAndDay_countThatHappened */
        @fl0.a
        public int f29575x3e1f0007;

        /* renamed from: hourOfTheWeekAndDay_countThatRecalled */
        @fl0.a
        public int f29576x9847436;

        /* renamed from: hourOfTheWeekAndDay_proportionThatRecalled */
        @fl0.a
        public float f29577xe9ee22a1;

        /* renamed from: total_countThatHappened */
        @fl0.a
        public int f29579x1e10ec7c;

        /* renamed from: total_countThatRecalled */
        @fl0.a
        public int f29580xe97660ab;

        /* renamed from: total_proportionThatRecalled */
        @fl0.a
        public float f29581xd7f6b74c;

        public MyTypeHabitsFeatureGroup(java.lang.String str, int i17) {
            this.f29571xa7988daa = str;
            this.f29567x27873a = i17;
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
            this.f29579x1e10ec7c = s1Var.b(11, this.f29567x27873a, d17, currentTimeMillis);
            int b17 = s1Var.b(12, this.f29567x27873a, d17, currentTimeMillis);
            this.f29580xe97660ab = b17;
            int i19 = this.f29579x1e10ec7c;
            if (i19 > 0) {
                this.f29581xd7f6b74c = b17 / i19;
            }
            this.f29568x2721bbaa = s1Var.f(11, this.f29567x27873a, d17, currentTimeMillis, i18);
            int f17 = s1Var.f(12, this.f29567x27873a, d17, currentTimeMillis, i18);
            this.f29569xf2872fd9 = f17;
            int i27 = this.f29568x2721bbaa;
            if (i27 > 0) {
                this.f29570x828e34de = f17 / i27;
            }
            this.f29572x2abb38de = s1Var.h(11, this.f29567x27873a, d17, currentTimeMillis, i17);
            int h17 = s1Var.h(12, this.f29567x27873a, d17, currentTimeMillis, i17);
            this.f29573xf620ad0d = h17;
            int i28 = this.f29572x2abb38de;
            if (i28 > 0) {
                this.f29574x7d16d82a = h17 / i28;
            }
            this.f29575x3e1f0007 = s1Var.d(11, this.f29567x27873a, d17, currentTimeMillis, i18, i17);
            int d18 = s1Var.d(12, this.f29567x27873a, d17, currentTimeMillis, i18, i17);
            this.f29576x9847436 = d18;
            int i29 = this.f29575x3e1f0007;
            if (i29 > 0) {
                this.f29577xe9ee22a1 = d18 / i29;
            }
        }

        @Override // fl0.b
        /* renamed from: getName */
        public java.lang.String mo46314xfb82e301() {
            return this.f29571xa7988daa;
        }
    }

    @Override // fl0.b
    /* renamed from: getName */
    public java.lang.String mo46314xfb82e301() {
        return "historiesOfPreviewClassification";
    }
}
