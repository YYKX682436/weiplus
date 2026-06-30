package com.p314xaae8f345.mm.p804x321e05.p805xc5a27af6.p807xc5a27af6.sns;

/* renamed from: com.tencent.mm.kara.feature.feature.sns.ContactsThatLikedFeatureGroup */
/* loaded from: classes11.dex */
public class C10794x231867dc extends pl0.e {

    /* renamed from: containsPOI */
    @fl0.a
    public int f29499xc6617ab;

    /* renamed from: count */
    @fl0.a
    public int f29500x5a7510f;

    /* renamed from: numberOfChatAlert */
    @fl0.a
    public int f29501x1ef725c4;

    /* renamed from: numberOfChatOnlyPrivacy */
    @fl0.a
    public int f29502xdacf90a4;

    /* renamed from: numberOfFemales */
    @fl0.a
    public int f29503x2bb04f87;

    /* renamed from: numberOfHideItsPost */
    @fl0.a
    public int f29504x76afcea6;

    /* renamed from: numberOfHideMyPost */
    @fl0.a
    public int f29505x4cef076e;

    /* renamed from: numberOfMales */
    @fl0.a
    public int f29506xb0c5f4e6;

    /* renamed from: numberOfMuteNotifications */
    @fl0.a
    public int f29507xa20a4c2f;

    /* renamed from: numberOfMyContacts */
    @fl0.a
    public int f29508x3badb93f;

    /* renamed from: numberOfNormalPrivacy */
    @fl0.a
    public int f29509xbb985581;

    /* renamed from: numberOfSessionsStickyOnTop */
    @fl0.a
    public int f29510xffd89690;

    /* renamed from: numberOfStarred */
    @fl0.a
    public int f29511xf458b9df;

    /* renamed from: proportionOfChatAlert */
    @fl0.a
    public float f29512x7503afd3;

    /* renamed from: proportionOfChatOnlyPrivacy */
    @fl0.a
    public float f29513xad4a1373;

    /* renamed from: proportionOfFemales */
    @fl0.a
    public float f29514xc8261156;

    /* renamed from: proportionOfHideItsPost */
    @fl0.a
    public float f29515x7bc210f5;

    /* renamed from: proportionOfHideMyPost */
    @fl0.a
    public float f29516xb873bf3f;

    /* renamed from: proportionOfMales */
    @fl0.a
    public float f29517xf80fde75;

    /* renamed from: proportionOfMuteNotifications */
    @fl0.a
    public float f29518xbfef573e;

    /* renamed from: proportionOfMyContacts */
    @fl0.a
    public float f29519xa7327110;

    /* renamed from: proportionOfMyMessages */
    @fl0.a
    public float f29520xad7a1209;

    /* renamed from: proportionOfNormalPrivacy */
    @fl0.a
    public float f29521xc5234010;

    /* renamed from: proportionOfSessionsStickyOnTop */
    @fl0.a
    public float f29522x38a719df;

    /* renamed from: proportionOfStarred */
    @fl0.a
    public float f29523x90ce7bae;

    /* renamed from: snsInfo */
    private com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f29524x85991a46;

    /* renamed from: sumOfMessages */
    @fl0.a
    public int f29525x6caa24ee;

    /* renamed from: sumOfMyMessages */
    @fl0.a
    public int f29526x4f67ca3a;

    public C10794x231867dc(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        this.f29524x85991a46 = c17933xe8d1b226;
    }

    @Override // pl0.e, fl0.b
    /* renamed from: build */
    public void mo46315x59bc66e() {
        super.mo46315x59bc66e();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f29524x85991a46;
        if (c17933xe8d1b226 != null) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 e17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.e(c17933xe8d1b226);
            java.util.LinkedList<r45.e86> linkedList = e17.f38984xe83113e0;
            int size = linkedList.size();
            java.util.Iterator<r45.e86> it = linkedList.iterator();
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
            while (it.hasNext()) {
                java.util.Iterator<r45.e86> it6 = it;
                java.lang.String str = it.next().f454659d;
                gm0.j1.i();
                int i57 = size;
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
                sl0.a0 a0Var = sl0.a0.f490582e;
                i17 += a0Var.b(str) ? 1 : 0;
                i38 += !a0Var.d(str) ? 1 : 0;
                i18 += n17.y2() ? 1 : 0;
                i37 += !n17.x2() ? 1 : 0;
                i39 += c01.e2.P(n17) ? 1 : 0;
                i29 += !n17.y2() ? 1 : 0;
                i28 += n17.t2() ? 1 : 0;
                i47 += a0Var.c(n17) ? 1 : 0;
                i48 += a0Var.e(str);
                i49 += a0Var.f(str);
                int i58 = n17.I;
                if (i58 == 1) {
                    i27++;
                } else if (i58 == 2) {
                    i19++;
                }
                it = it6;
                size = i57;
            }
            int i59 = size;
            this.f29500x5a7510f = e17.f38982x6c24f798;
            this.f29508x3badb93f = i59;
            this.f29501x1ef725c4 = i17;
            this.f29502xdacf90a4 = i18;
            this.f29503x2bb04f87 = i19;
            this.f29506xb0c5f4e6 = i27;
            this.f29511xf458b9df = i28;
            this.f29509xbb985581 = i29;
            this.f29505x4cef076e = i37;
            this.f29504x76afcea6 = i38;
            this.f29507xa20a4c2f = i39;
            this.f29510xffd89690 = i47;
            this.f29525x6caa24ee = i48;
            this.f29526x4f67ca3a = i49;
            if (i59 > 0) {
                float f17 = i59;
                this.f29512x7503afd3 = i17 / f17;
                this.f29513xad4a1373 = i18 / f17;
                this.f29514xc8261156 = i19 / f17;
                this.f29517xf80fde75 = i27 / f17;
                this.f29516xb873bf3f = i37 / f17;
                this.f29515x7bc210f5 = i38 / f17;
                this.f29518xbfef573e = i39 / f17;
                this.f29519xa7327110 = f17 / f17;
                this.f29521xc5234010 = i29 / f17;
                this.f29522x38a719df = i47 / f17;
                this.f29523x90ce7bae = i28 / f17;
            }
            if (i48 > 0) {
                this.f29520xad7a1209 = i49 / i48;
            }
        }
    }

    @Override // fl0.b
    /* renamed from: getName */
    public java.lang.String mo46314xfb82e301() {
        return "contactsThatLiked";
    }
}
