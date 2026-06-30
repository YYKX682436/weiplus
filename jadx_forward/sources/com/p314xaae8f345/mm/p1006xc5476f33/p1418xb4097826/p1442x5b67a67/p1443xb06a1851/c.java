package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1443xb06a1851;

/* loaded from: classes2.dex */
public final class c extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f186664d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f186665e;

    /* renamed from: f, reason: collision with root package name */
    public int f186666f;

    /* renamed from: g, reason: collision with root package name */
    public long f186667g;

    /* renamed from: h, reason: collision with root package name */
    public long f186668h;

    /* renamed from: i, reason: collision with root package name */
    public int f186669i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f186670m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f186671n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f186665e = new java.util.ArrayList();
        this.f186669i = -1;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: getLayoutId */
    public int mo569x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ecz;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        r45.pj2 pj2Var;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        android.os.Bundle m7436x8619eaa0;
        android.os.Bundle m7436x8619eaa02;
        android.os.Bundle m7436x8619eaa03;
        android.os.Bundle m7436x8619eaa04;
        android.os.Bundle m7436x8619eaa05;
        android.os.Bundle m7436x8619eaa06;
        byte[] byteArray;
        android.os.Bundle m7436x8619eaa07;
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc6 = m158358x197d1fc6();
        long j17 = 0;
        this.f186667g = (m158358x197d1fc6 == null || (m7436x8619eaa07 = m158358x197d1fc6.m7436x8619eaa0()) == null) ? 0L : m7436x8619eaa07.getLong("native_drama_id");
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc62 = m158358x197d1fc6();
        java.lang.String str = null;
        if (m158358x197d1fc62 == null || (m7436x8619eaa06 = m158358x197d1fc62.m7436x8619eaa0()) == null || (byteArray = m7436x8619eaa06.getByteArray("native_drama_range")) == null) {
            pj2Var = null;
        } else {
            com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd = new r45.pj2().mo11468x92b714fd(byteArray);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo11468x92b714fd, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderNativeDramaEpisodeRange");
            pj2Var = (r45.pj2) mo11468x92b714fd;
        }
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc63 = m158358x197d1fc6();
        this.f186666f = (m158358x197d1fc63 == null || (m7436x8619eaa05 = m158358x197d1fc63.m7436x8619eaa0()) == null) ? 0 : m7436x8619eaa05.getInt("native_drama_init_position");
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc64 = m158358x197d1fc6();
        if (m158358x197d1fc64 != null && (m7436x8619eaa04 = m158358x197d1fc64.m7436x8619eaa0()) != null) {
            j17 = m7436x8619eaa04.getLong("native_drama_enter_object_id", 0L);
        }
        this.f186668h = j17;
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc65 = m158358x197d1fc6();
        int i17 = -1;
        if (m158358x197d1fc65 != null && (m7436x8619eaa03 = m158358x197d1fc65.m7436x8619eaa0()) != null) {
            i17 = m7436x8619eaa03.getInt("native_drama_enter_promotion_comment_scene", -1);
        }
        this.f186669i = i17;
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc66 = m158358x197d1fc6();
        this.f186670m = (m158358x197d1fc66 == null || (m7436x8619eaa02 = m158358x197d1fc66.m7436x8619eaa0()) == null) ? null : m7436x8619eaa02.getString("native_drama_enter_dupflag");
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc67 = m158358x197d1fc6();
        if (m158358x197d1fc67 != null && (m7436x8619eaa0 = m158358x197d1fc67.m7436x8619eaa0()) != null) {
            str = m7436x8619eaa0.getString("native_drama_session_buffer");
        }
        this.f186671n = str;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.t8e);
        this.f186664d = c1163xf1deaba4;
        if (c1163xf1deaba4 != null) {
            c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d(m80379x76847179(), 6));
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.f186664d;
        java.util.ArrayList arrayList = this.f186665e;
        if (c1163xf1deaba42 != null) {
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(new in5.s() { // from class: com.tencent.mm.plugin.finder.drama.detail.FinderNativeDramaDetailEpisodeUIC$onCreate$1
                @Override // in5.s
                /* renamed from: getItemConvert */
                public in5.r mo43555xf2bb75ea(int type) {
                    return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1443xb06a1851.a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1443xb06a1851.c.this);
                }
            }, arrayList, false);
            c22848x6ddd90cf.f374638o = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1443xb06a1851.b(this);
            c1163xf1deaba42.mo7960x6cab2c8d(c22848x6ddd90cf);
        }
        arrayList.clear();
        if (pj2Var != null) {
            java.util.LinkedList<r45.oj2> m75941xfb821914 = pj2Var.m75941xfb821914(1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getFeed_list(...)");
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(m75941xfb821914, 10));
            for (r45.oj2 oj2Var : m75941xfb821914) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(oj2Var);
                arrayList2.add(new zb2.b(oj2Var));
            }
            arrayList.addAll(arrayList2);
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba43 = this.f186664d;
        if (c1163xf1deaba43 != null && (mo7946xf939df19 = c1163xf1deaba43.mo7946xf939df19()) != null) {
            mo7946xf939df19.m8146xced61ae5();
        }
        arrayList.isEmpty();
    }
}
