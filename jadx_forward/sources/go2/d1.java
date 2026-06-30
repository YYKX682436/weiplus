package go2;

/* loaded from: classes2.dex */
public final class d1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860 {

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f355496v;

    /* renamed from: w, reason: collision with root package name */
    public int f355497w;

    /* renamed from: x, reason: collision with root package name */
    public int f355498x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f355496v = "";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.InterfaceC15438xf4a73b57 W6() {
        return new go2.c1(this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: getLayoutId */
    public int mo569x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dcc;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onActivityResult */
    public void mo2273x9d4787cb(int i17, int i18, android.content.Intent intent) {
        tw2.b bVar;
        super.mo2273x9d4787cb(i17, i18, intent);
        if (i17 == 1000 && i18 == -1 && (bVar = this.f215194m) != null) {
            p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 mo167111xfb80e389 = bVar.mo167111xfb80e389(0);
            if (intent != null) {
                long longExtra = intent.getLongExtra("key_member_saerch_feed_id", 0L);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860.t7(this, 0, false, 2, null);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1568xba823be6.t tVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1568xba823be6.t) pf5.z.f435481a.b(mo167111xfb80e389).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1568xba823be6.t.class);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1568xba823be6.w wVar = tVar.f202890f;
                if (wVar == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                    throw null;
                }
                wVar.g();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1568xba823be6.s sVar = tVar.f202889e;
                if (sVar == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
                    throw null;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13875x75a8b401 c13875x75a8b401 = sVar.f202879f;
                c13875x75a8b401.f189048g = longExtra;
                c13875x75a8b401.m56121x4c6f0a7d(0);
                c13875x75a8b401.mo56155xd210094c();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        java.lang.String str;
        super.mo450x3e5a77bb(bundle);
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc6 = m158358x197d1fc6();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.ui.C14484x6c3ad655 c14484x6c3ad655 = m158358x197d1fc6 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.ui.C14484x6c3ad655 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.ui.C14484x6c3ad655) m158358x197d1fc6 : null;
        if (c14484x6c3ad655 == null || (str = c14484x6c3ad655.f202917t) == null) {
            str = "";
        }
        this.f355496v = str;
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc62 = m158358x197d1fc6();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.ui.C14484x6c3ad655 c14484x6c3ad6552 = m158358x197d1fc62 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.ui.C14484x6c3ad655 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.ui.C14484x6c3ad655) m158358x197d1fc62 : null;
        if (c14484x6c3ad6552 != null) {
            java.lang.String str2 = c14484x6c3ad6552.f202919v;
        }
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc63 = m158358x197d1fc6();
        if (m158358x197d1fc63 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.ui.C14484x6c3ad655) {
        }
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc64 = m158358x197d1fc6();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.ui.C14484x6c3ad655 c14484x6c3ad6553 = m158358x197d1fc64 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.ui.C14484x6c3ad655 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.ui.C14484x6c3ad655) m158358x197d1fc64 : null;
        this.f355497w = c14484x6c3ad6553 != null ? c14484x6c3ad6553.f202920w : 0;
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc65 = m158358x197d1fc6();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.ui.C14484x6c3ad655 c14484x6c3ad6554 = m158358x197d1fc65 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.ui.C14484x6c3ad655 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.ui.C14484x6c3ad655) m158358x197d1fc65 : null;
        this.f355498x = c14484x6c3ad6554 != null ? c14484x6c3ad6554.f210798p : 0;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15359x536ace78) mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.q0q)).m62441xbae19a3c(false);
        java.util.ArrayList<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180> arrayList = new java.util.ArrayList();
        if (this.f355498x == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.ui.C14483xb0792b55 c14483xb0792b55 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.ui.C14483xb0792b55();
            c14483xb0792b55.f202918u = 3;
            c14483xb0792b55.f210798p = 3;
            c14483xb0792b55.f210799q = m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lrf);
            c14483xb0792b55.y0(this.f355496v);
            c14483xb0792b55.f202920w = this.f355497w;
            c14483xb0792b55.f202934z = 5;
            arrayList.add(c14483xb0792b55);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.ui.C14483xb0792b55 c14483xb0792b552 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.ui.C14483xb0792b55();
            c14483xb0792b552.f202918u = 4;
            c14483xb0792b552.f210798p = 4;
            c14483xb0792b552.f210799q = m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.les);
            c14483xb0792b552.y0(this.f355496v);
            c14483xb0792b552.f202920w = this.f355497w;
            c14483xb0792b552.f202934z = 6;
            arrayList.add(c14483xb0792b552);
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f355496v, xy2.c.e(m80379x76847179()))) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.ui.C14483xb0792b55 c14483xb0792b553 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.ui.C14483xb0792b55();
                c14483xb0792b553.f202918u = 5;
                c14483xb0792b553.f210798p = 5;
                c14483xb0792b553.f210799q = m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.leu);
                c14483xb0792b553.y0(this.f355496v);
                c14483xb0792b553.f202920w = this.f355497w;
                c14483xb0792b553.f202934z = 7;
                arrayList.add(c14483xb0792b553);
            }
        }
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff = this.f215191g;
        if (c2718xca2902ff != null) {
            c2718xca2902ff.m20376x95e7e540(null);
            android.view.ViewGroup.LayoutParams layoutParams = c2718xca2902ff.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
            }
            android.view.ViewGroup.LayoutParams layoutParams2 = c2718xca2902ff.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.bottomMargin = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
            }
        }
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 abstractC15124x7bae6180 : arrayList) {
            android.app.Activity m80379x76847179 = m80379x76847179();
            java.lang.String str3 = abstractC15124x7bae6180.f210799q;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str3);
            eo2.l lVar = new eo2.l(m80379x76847179, -1, str3, false, abstractC15124x7bae6180.f210798p, 0, com.p314xaae8f345.mm.R.C30864xbddafb2a.doc, true);
            lVar.f337119p = ym5.x.a(lVar.f337116m, 8.0f);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860.R6(this, lVar, abstractC15124x7bae6180, false, 4, null);
        }
    }
}
