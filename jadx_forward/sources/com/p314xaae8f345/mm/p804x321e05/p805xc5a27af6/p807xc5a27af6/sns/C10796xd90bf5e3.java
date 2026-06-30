package com.p314xaae8f345.mm.p804x321e05.p805xc5a27af6.p807xc5a27af6.sns;

/* renamed from: com.tencent.mm.kara.feature.feature.sns.HistoriesOfSameCityFeatureGroup */
/* loaded from: classes4.dex */
public class C10796xd90bf5e3 extends pl0.e {

    /* renamed from: image */
    @fl0.a
    public com.p314xaae8f345.mm.p804x321e05.p805xc5a27af6.p807xc5a27af6.sns.C10796xd90bf5e3.SameCityHabitsFeatureGroup f29527x5faa95b;

    /* renamed from: video */
    @fl0.a
    public com.p314xaae8f345.mm.p804x321e05.p805xc5a27af6.p807xc5a27af6.sns.C10796xd90bf5e3.SameCityHabitsFeatureGroup f29528x6b0147b;

    /* renamed from: webview */
    @fl0.a
    public com.p314xaae8f345.mm.p804x321e05.p805xc5a27af6.p807xc5a27af6.sns.C10796xd90bf5e3.SameCityHabitsFeatureGroup f29529x48fb3bf9;

    /* renamed from: com.tencent.mm.kara.feature.feature.sns.HistoriesOfSameCityFeatureGroup$SameCityHabitsFeatureGroup */
    /* loaded from: classes13.dex */
    public class SameCityHabitsFeatureGroup extends pl0.e {

        /* renamed from: TYPE */
        private final int f29530x27873a;

        /* renamed from: city */
        private java.lang.String f29531x2e996b;

        /* renamed from: dayOfTheWeek_countThatHappened */
        @fl0.a
        public int f29532x2721bbaa;

        /* renamed from: dayOfTheWeek_countThatRecalled */
        @fl0.a
        public int f29533xf2872fd9;

        /* renamed from: dayOfTheWeek_proportionThatRecalled */
        @fl0.a
        public float f29534x828e34de;

        /* renamed from: groupName */
        private java.lang.String f29535xa7988daa;

        /* renamed from: hourOfTheDay_countThatHappened */
        @fl0.a
        public int f29536x2abb38de;

        /* renamed from: hourOfTheDay_countThatRecalled */
        @fl0.a
        public int f29537xf620ad0d;

        /* renamed from: hourOfTheDay_proportionThatRecalled */
        @fl0.a
        public float f29538x7d16d82a;

        /* renamed from: hourOfTheWeekAndDay_countThatHappened */
        @fl0.a
        public int f29539x3e1f0007;

        /* renamed from: hourOfTheWeekAndDay_countThatRecalled */
        @fl0.a
        public int f29540x9847436;

        /* renamed from: hourOfTheWeekAndDay_proportionThatRecalled */
        @fl0.a
        public float f29541xe9ee22a1;

        /* renamed from: total_countThatHappened */
        @fl0.a
        public int f29543x1e10ec7c;

        /* renamed from: total_countThatRecalled */
        @fl0.a
        public int f29544xe97660ab;

        /* renamed from: total_proportionThatRecalled */
        @fl0.a
        public float f29545xd7f6b74c;

        public SameCityHabitsFeatureGroup(java.lang.String str, int i17, java.lang.String str2) {
            this.f29535xa7988daa = str;
            this.f29530x27873a = i17;
            this.f29531x2e996b = str2;
        }

        @Override // pl0.e, fl0.b
        /* renamed from: build */
        public void mo46315x59bc66e() {
            super.mo46315x59bc66e();
            if (android.text.TextUtils.isEmpty(this.f29531x2e996b)) {
                return;
            }
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            long d17 = nl0.e.d(currentTimeMillis);
            java.util.Calendar calendar = java.util.Calendar.getInstance();
            calendar.setTime(new java.util.Date(currentTimeMillis));
            int i17 = calendar.get(11);
            int i18 = calendar.get(7);
            sl0.s1 s1Var = sl0.s1.f490752e;
            this.f29543x1e10ec7c = s1Var.j(11, this.f29530x27873a, d17, currentTimeMillis, this.f29531x2e996b);
            int j17 = s1Var.j(12, this.f29530x27873a, d17, currentTimeMillis, this.f29531x2e996b);
            this.f29544xe97660ab = j17;
            int i19 = this.f29543x1e10ec7c;
            if (i19 > 0) {
                this.f29545xd7f6b74c = j17 / i19;
            }
            this.f29532x2721bbaa = s1Var.l(11, this.f29530x27873a, d17, currentTimeMillis, i18, this.f29531x2e996b);
            int l17 = s1Var.l(12, this.f29530x27873a, d17, currentTimeMillis, i18, this.f29531x2e996b);
            this.f29533xf2872fd9 = l17;
            int i27 = this.f29532x2721bbaa;
            if (i27 > 0) {
                this.f29534x828e34de = l17 / i27;
            }
            this.f29536x2abb38de = s1Var.m(11, this.f29530x27873a, d17, currentTimeMillis, i17, this.f29531x2e996b);
            int m17 = s1Var.m(12, this.f29530x27873a, d17, currentTimeMillis, i17, this.f29531x2e996b);
            this.f29537xf620ad0d = m17;
            int i28 = this.f29536x2abb38de;
            if (i28 > 0) {
                this.f29538x7d16d82a = m17 / i28;
            }
            this.f29539x3e1f0007 = s1Var.k(11, this.f29530x27873a, d17, currentTimeMillis, i18, i17, this.f29531x2e996b);
            int k17 = s1Var.k(12, this.f29530x27873a, d17, currentTimeMillis, i18, i17, this.f29531x2e996b);
            this.f29540x9847436 = k17;
            int i29 = this.f29539x3e1f0007;
            if (i29 > 0) {
                this.f29541xe9ee22a1 = k17 / i29;
            }
        }

        @Override // fl0.b
        /* renamed from: getName */
        public java.lang.String mo46314xfb82e301() {
            return this.f29535xa7988daa;
        }
    }

    public C10796xd90bf5e3(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        r45.ed4 ed4Var;
        java.lang.String str;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70371x485d7 = c17933xe8d1b226.m70371x485d7();
        java.lang.String str2 = "";
        if (m70371x485d7 != null && (ed4Var = m70371x485d7.f39016x752a03d5) != null && (str = ed4Var.f454846f) != null) {
            str2 = str;
        }
        str2 = str2.endsWith("市") ? str2.substring(0, str2.length() - 1) : str2;
        this.f29527x5faa95b = new com.p314xaae8f345.mm.p804x321e05.p805xc5a27af6.p807xc5a27af6.sns.C10796xd90bf5e3.SameCityHabitsFeatureGroup("image", 1, str2);
        this.f29528x6b0147b = new com.p314xaae8f345.mm.p804x321e05.p805xc5a27af6.p807xc5a27af6.sns.C10796xd90bf5e3.SameCityHabitsFeatureGroup("video", 15, str2);
        this.f29529x48fb3bf9 = new com.p314xaae8f345.mm.p804x321e05.p805xc5a27af6.p807xc5a27af6.sns.C10796xd90bf5e3.SameCityHabitsFeatureGroup("webview", 3, str2);
    }

    @Override // fl0.b
    /* renamed from: getName */
    public java.lang.String mo46314xfb82e301() {
        return "historiesOfSameCity";
    }
}
