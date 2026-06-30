package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic;

/* renamed from: com.tencent.mm.plugin.finder.activity.uic.FinderActivityTabUIC */
/* loaded from: classes2.dex */
public class C13669xe2583a4f extends x92.m {
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.C13671x7e263e83 A;
    public boolean B;
    public final ra2.a C;
    public final jz5.g D;
    public final jz5.g E;

    /* renamed from: y, reason: collision with root package name */
    public r45.r03 f183362y;

    /* renamed from: z, reason: collision with root package name */
    public p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 f183363z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.tencent.mm.plugin.finder.activity.uic.FinderActivityTabUIC$finderTopicInfoListener$1] */
    public C13669xe2583a4f(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.A = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5544x5bf4bb91>(a0Var) { // from class: com.tencent.mm.plugin.finder.activity.uic.FinderActivityTabUIC$finderTopicInfoListener$1
            {
                this.f39173x3fe91575 = 1705444769;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5544x5bf4bb91 c5544x5bf4bb91) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5544x5bf4bb91 event = c5544x5bf4bb91;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                am.od odVar = event.f135868g;
                if (odVar != null && odVar.f89056a == 7) {
                    int i17 = odVar != null ? odVar.f89057b : -1;
                    java.lang.String str = odVar != null ? odVar.f89058c : null;
                    if (str == null) {
                        str = "";
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderActivityTabUIC", "FinderTopicEvent: errCode=" + i17 + " errMsg=" + str);
                    if (i17 != 0) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.C13669xe2583a4f.this.C7(i17, str);
                    }
                }
                return true;
            }
        };
        this.C = new ra2.a(0, 1, null);
        this.D = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.j1.f183433d);
        this.E = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.k1(this));
    }

    @Override // x92.m
    public boolean A7(int i17) {
        return i17 == -4063 || i17 == -4058 || i17 == -4056;
    }

    @Override // x92.m
    public void D7() {
        r45.r03 r03Var = (r45.r03) this.f534243v;
        if (r03Var != null) {
            this.f534244w = r03Var;
            E7(r03Var);
            Q7(r03Var);
        }
        this.f534243v = null;
    }

    @Override // x92.m
    public void G7() {
        long longExtra = m158359x1e885992().getLongExtra("key_activity_id", 0L);
        java.lang.String stringExtra = m158359x1e885992().getStringExtra("key_encrypted_topic_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        long longExtra2 = m158359x1e885992().getLongExtra("key_feed_id", 0L);
        if (longExtra == 0 && longExtra2 == 0) {
            if (stringExtra.length() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderActivityTabUIC", "topicId and refObjectId is zero");
                m80379x76847179().finish();
            }
        }
        pf5.e.m158343xd39de650(this, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.p1(this, null), 3, null);
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 I7(r45.bo6 tagInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tagInfo, "tagInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1424x9da2e250.C13646x818616e5 c13646x818616e5 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1424x9da2e250.C13646x818616e5();
        c13646x818616e5.f210798p = tagInfo.m75939xb282bd08(1) - 1;
        c13646x818616e5.f210799q = tagInfo.m75945x2fec8307(0);
        c13646x818616e5.f183286u = tagInfo.m75942xfb822ef2(2);
        java.lang.String m75945x2fec8307 = tagInfo.m75945x2fec8307(0);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        c13646x818616e5.f183287v = m75945x2fec8307;
        return c13646x818616e5;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1424x9da2e250.C13646x818616e5 J7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.i1 mediaTabInfo, java.util.LinkedList tags) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaTabInfo, "mediaTabInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tags, "tags");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1431x696cd2f.p1432x9da2e250.C13663x38cb4b1a c13663x38cb4b1a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1431x696cd2f.p1432x9da2e250.C13663x38cb4b1a();
        c13663x38cb4b1a.f183337w = mediaTabInfo;
        c13663x38cb4b1a.f183338x = tags;
        c13663x38cb4b1a.f183339y = this.C;
        return c13663x38cb4b1a;
    }

    public w92.a K7(r45.bo6 tagInfo, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tagInfo, "tagInfo");
        java.lang.String m75945x2fec8307 = tagInfo.m75945x2fec8307(0);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        return new w92.a(-1, m75945x2fec8307, z17, N7(), 0, 16, null);
    }

    public boolean L7() {
        return !(this instanceof ea2.k0);
    }

    public y92.b M7() {
        long longExtra = m158359x1e885992().getLongExtra("key_activity_id", 0L);
        java.lang.String stringExtra = m158359x1e885992().getStringExtra("key_encrypted_topic_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        java.lang.String str = stringExtra;
        long longExtra2 = m158359x1e885992().getLongExtra("key_feed_id", 0L);
        return new y92.b(longExtra, str, java.lang.Long.valueOf(longExtra2), longExtra == 0 ? 1 : 0, null, 16, null);
    }

    public int N7() {
        return 7;
    }

    @Override // x92.m
    /* renamed from: O7, reason: merged with bridge method [inline-methods] */
    public r45.r03 B7() {
        long longExtra = m158359x1e885992().getLongExtra("key_activity_id", 0L);
        java.lang.String stringExtra = m158359x1e885992().getStringExtra("key_encrypted_topic_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        u92.b a17 = u92.a.a(u92.b.f507355e, longExtra, stringExtra, null, 4, null);
        if (a17 == null) {
            return null;
        }
        if (!a17.d()) {
            a17 = null;
        }
        if (a17 == null) {
            return null;
        }
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) a17.f117894b;
        r45.ma1 ma1Var = fVar != null ? (r45.ma1) fVar.f152151d : null;
        if (ma1Var != null) {
            return (r45.r03) ma1Var.m75936x14adae67(1);
        }
        return null;
    }

    public final void P7(java.util.LinkedList tags, final boolean z17) {
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tags, "tags");
        if (!((java.lang.Boolean) ((jz5.n) this.D).mo141623x754a37bb()).booleanValue() || !L7()) {
            java.util.Iterator it = tags.iterator();
            while (it.hasNext()) {
                r45.bo6 bo6Var = (r45.bo6) it.next();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 I7 = I7(bo6Var);
                if (this.f183363z == null) {
                    this.f183363z = I7;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860.R6(this, K7(bo6Var, z17), I7, false, 4, null);
                java.lang.String m75945x2fec8307 = bo6Var.m75945x2fec8307(0);
                if (m75945x2fec8307 == null) {
                    m75945x2fec8307 = "";
                }
                F7(m75945x2fec8307, bo6Var.m75939xb282bd08(1), 0);
            }
            r7();
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(tags, 10));
        java.util.Iterator it6 = tags.iterator();
        while (it6.hasNext()) {
            arrayList.add(new ra2.b((r45.bo6) it6.next(), this.C));
        }
        final java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList);
        android.view.View mo144222x4ff8c0f0 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.nvf);
        if (mo144222x4ff8c0f0 != null) {
            mo144222x4ff8c0f0.setPadding(mo144222x4ff8c0f0.getPaddingLeft(), m158361x893a2f6f().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv), mo144222x4ff8c0f0.getPaddingRight(), 0);
        }
        if (z17 && (c22849x81a93d25 = this.f215193i) != null) {
            c22849x81a93d25.setBackground(m80379x76847179().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f563197zg));
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d252 = this.f215193i;
        if (c22849x81a93d252 != null) {
            c22849x81a93d252.setVisibility(0);
            c22849x81a93d252.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(m80379x76847179(), 0, false));
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(new in5.s() { // from class: com.tencent.mm.plugin.finder.activity.uic.FinderActivityTabUIC$buildConvert$1
                @Override // in5.s
                /* renamed from: getItemConvert */
                public in5.r mo43555xf2bb75ea(int type) {
                    return new qa2.a(arrayList2, z17);
                }
            }, arrayList2, false);
            c22848x6ddd90cf.f374638o = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.l1();
            c22849x81a93d252.mo7960x6cab2c8d(c22848x6ddd90cf);
        }
        jz5.g gVar = this.E;
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.i1 i1Var : (java.util.List) ((jz5.n) gVar).mo141623x754a37bb()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1424x9da2e250.C13646x818616e5 J7 = J7(i1Var, tags);
            if (this.f183363z == null) {
                this.f183363z = J7;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860.R6(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.m1(z17, i1Var.f183424a, N7()), J7, false, 4, null);
        }
        r7();
        int intExtra = m158359x1e885992().getIntExtra("KEY_ENTER_MEDIA_TAB_TYPE", 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderActivityTabUIC", "onRequestTopicTabSuc() called enterMediaTab:" + intExtra);
        if (intExtra != 0) {
            int i17 = 0;
            for (java.lang.Object obj : (java.util.List) ((jz5.n) gVar).mo141623x754a37bb()) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.i1) obj).f183425b == intExtra && (c1190x18d3c3fe = this.f215192h) != null) {
                    c1190x18d3c3fe.m8317x940d026a(i17, false);
                }
                i17 = i18;
            }
        }
    }

    public boolean Q7(r45.r03 topicInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(topicInfo, "topicInfo");
        this.f183362y = topicInfo;
        m158359x1e885992().putExtra("key_has_cover", a2());
        r45.e21 e21Var = (r45.e21) topicInfo.m75936x14adae67(16);
        if (e21Var == null) {
            return false;
        }
        z5();
        r45.q03 q03Var = (r45.q03) e21Var.m75936x14adae67(16);
        if (q03Var == null) {
            return false;
        }
        java.util.LinkedList m75941xfb821914 = q03Var.m75941xfb821914(0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getList(...)");
        P7(m75941xfb821914, !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e21Var.m75945x2fec8307(5)));
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860
    public void V6() {
        if (!((java.lang.Boolean) ((jz5.n) this.D).mo141623x754a37bb()).booleanValue()) {
            super.V6();
            return;
        }
        if (f7().isEmpty()) {
            com.p314xaae8f345.mm.p2776x373aa5.C22785xca931918 h17 = c7().h();
            if (h17 == null) {
                return;
            }
            h17.setVisibility(8);
            return;
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22785xca931918 h18 = c7().h();
        if (h18 == null) {
            return;
        }
        h18.setVisibility(0);
    }

    @Override // x92.m, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        super.mo450x3e5a77bb(bundle);
        mo48813x58998cd();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        super.mo451xac79a11b();
        mo48814x2efc64();
    }

    @Override // x92.m
    public int w7() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.adu;
    }

    @Override // x92.m
    public boolean y7() {
        r45.e21 e21Var;
        r45.r03 r03Var = (r45.r03) this.f534243v;
        return ((r03Var == null || (e21Var = (r45.e21) r03Var.m75936x14adae67(16)) == null) ? null : (r45.q03) e21Var.m75936x14adae67(16)) != null;
    }

    @Override // x92.m
    public void z7() {
        m158359x1e885992().getStringExtra("key_cover_url");
    }
}
