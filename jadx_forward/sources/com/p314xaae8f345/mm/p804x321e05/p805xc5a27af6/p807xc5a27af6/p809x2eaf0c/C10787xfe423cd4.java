package com.p314xaae8f345.mm.p804x321e05.p805xc5a27af6.p807xc5a27af6.p809x2eaf0c;

/* renamed from: com.tencent.mm.kara.feature.feature.comm.SomeoneTagsFeatureGroup */
/* loaded from: classes11.dex */
public class C10787xfe423cd4 extends pl0.e {

    /* renamed from: count */
    @fl0.a
    public int f29384x5a7510f;

    /* renamed from: numberOfChatAlert */
    @fl0.a
    public int f29385x1ef725c4;

    /* renamed from: numberOfChatOnlyPrivacy */
    @fl0.a
    public int f29386xdacf90a4;

    /* renamed from: numberOfFemales */
    @fl0.a
    public int f29387x2bb04f87;

    /* renamed from: numberOfHideItsPost */
    @fl0.a
    public int f29388x76afcea6;

    /* renamed from: numberOfHideMyPost */
    @fl0.a
    public int f29389x4cef076e;

    /* renamed from: numberOfMales */
    @fl0.a
    public int f29390xb0c5f4e6;

    /* renamed from: numberOfMuteNotifications */
    @fl0.a
    public int f29391xa20a4c2f;

    /* renamed from: numberOfMyContacts */
    @fl0.a
    public int f29392x3badb93f;

    /* renamed from: numberOfNormalPrivacy */
    @fl0.a
    public int f29393xbb985581;

    /* renamed from: numberOfSessionsStickyOnTop */
    @fl0.a
    public int f29394xffd89690;

    /* renamed from: numberOfStarred */
    @fl0.a
    public int f29395xf458b9df;

    /* renamed from: proportionOfChatAlert */
    @fl0.a
    public float f29396x7503afd3;

    /* renamed from: proportionOfChatOnlyPrivacy */
    @fl0.a
    public float f29397xad4a1373;

    /* renamed from: proportionOfFemales */
    @fl0.a
    public float f29398xc8261156;

    /* renamed from: proportionOfHideItsPost */
    @fl0.a
    public float f29399x7bc210f5;

    /* renamed from: proportionOfHideMyPost */
    @fl0.a
    public float f29400xb873bf3f;

    /* renamed from: proportionOfMales */
    @fl0.a
    public float f29401xf80fde75;

    /* renamed from: proportionOfMuteNotifications */
    @fl0.a
    public float f29402xbfef573e;

    /* renamed from: proportionOfMyContacts */
    @fl0.a
    public float f29403xa7327110;

    /* renamed from: proportionOfMyMessages */
    @fl0.a
    public float f29404xad7a1209;

    /* renamed from: proportionOfNormalPrivacy */
    @fl0.a
    public float f29405xc5234010;

    /* renamed from: proportionOfSessionsStickyOnTop */
    @fl0.a
    public float f29406x38a719df;

    /* renamed from: proportionOfStared */
    @fl0.a
    public float f29407x152ff1e2;

    /* renamed from: sumOfMessages */
    @fl0.a
    public int f29408x6caa24ee;

    /* renamed from: sumOfMyMessages */
    @fl0.a
    public int f29409x4f67ca3a;

    /* renamed from: userName */
    private java.lang.String f29410xf01afcf6;

    public C10787xfe423cd4(java.lang.String str) {
        this.f29410xf01afcf6 = str;
    }

    @Override // pl0.e, fl0.b
    /* renamed from: build */
    public void mo46315x59bc66e() {
        super.mo46315x59bc66e();
        if (android.text.TextUtils.isEmpty(this.f29410xf01afcf6)) {
            return;
        }
        gm0.j1.i();
        java.lang.Class<vg3.x3> cls = vg3.x3.class;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(cls))).Bi().n(this.f29410xf01afcf6, true);
        java.util.Iterator it = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(n17.D0().split(",")).iterator();
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        int i37 = 0;
        int i38 = 0;
        int i39 = 0;
        int i47 = 0;
        int i48 = 0;
        int i49 = 0;
        int i57 = 0;
        int i58 = 0;
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (!android.text.TextUtils.isEmpty(str)) {
                java.util.Iterator it6 = it;
                java.util.Iterator it7 = ((b93.b) c93.a.a()).j(str).iterator();
                while (it7.hasNext()) {
                    java.lang.String str2 = (java.lang.String) it7.next();
                    if (!android.text.TextUtils.isEmpty(str2)) {
                        i17++;
                        gm0.j1.i();
                        java.lang.Class<vg3.x3> cls2 = cls;
                        java.util.Iterator it8 = it7;
                        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(cls))).Bi().n(str2, true);
                        sl0.a0 a0Var = sl0.a0.f490582e;
                        i18 += a0Var.b(str2) ? 1 : 0;
                        i19 += n18.y2() ? 1 : 0;
                        i29 += !n18.x2() ? 1 : 0;
                        i37 += !a0Var.d(str2) ? 1 : 0;
                        i38 += c01.e2.P(n18) ? 1 : 0;
                        i48 += !n18.y2() ? 1 : 0;
                        i49 += n18.t2() ? 1 : 0;
                        i47 += a0Var.c(n18) ? 1 : 0;
                        i58 += a0Var.e(str2);
                        i57 += a0Var.f(str2);
                        i39 += n18.r2() ? 1 : 0;
                        int i59 = n17.I;
                        if (i59 == 1) {
                            i28++;
                        } else if (i59 == 2) {
                            i27++;
                        }
                        it7 = it8;
                        cls = cls2;
                    }
                }
                it = it6;
            }
        }
        this.f29384x5a7510f = i17;
        this.f29385x1ef725c4 = i18;
        this.f29386xdacf90a4 = i19;
        this.f29387x2bb04f87 = i27;
        this.f29390xb0c5f4e6 = i28;
        this.f29389x4cef076e = i29;
        this.f29388x76afcea6 = i37;
        this.f29391xa20a4c2f = i38;
        this.f29392x3badb93f = i39;
        this.f29394xffd89690 = i47;
        this.f29393xbb985581 = i48;
        int i66 = i49;
        this.f29395xf458b9df = i66;
        int i67 = i57;
        this.f29409x4f67ca3a = i67;
        int i68 = i58;
        this.f29408x6caa24ee = i68;
        if (i17 > 0) {
            float f17 = i17;
            this.f29396x7503afd3 = i18 / f17;
            this.f29397xad4a1373 = i19 / f17;
            this.f29398xc8261156 = i27 / f17;
            this.f29399x7bc210f5 = i37 / f17;
            this.f29400xb873bf3f = i29 / f17;
            this.f29401xf80fde75 = i28 / f17;
            this.f29402xbfef573e = i38 / f17;
            this.f29403xa7327110 = i39 / f17;
            this.f29405xc5234010 = i48 / f17;
            this.f29406x38a719df = i47 / f17;
            this.f29407x152ff1e2 = i66 / f17;
        }
        if (i68 > 0) {
            this.f29404xad7a1209 = i67 / i68;
        }
    }

    @Override // fl0.b
    /* renamed from: getName */
    public java.lang.String mo46314xfb82e301() {
        return "tag";
    }
}
