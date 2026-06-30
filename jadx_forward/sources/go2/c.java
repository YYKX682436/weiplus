package go2;

/* loaded from: classes2.dex */
public final class c extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860 {

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f355489v;

    /* renamed from: w, reason: collision with root package name */
    public int f355490w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f355489v = "";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.InterfaceC15438xf4a73b57 W6() {
        return new go2.b(this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: getLayoutId */
    public int mo569x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dcc;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        java.lang.String str;
        super.mo450x3e5a77bb(bundle);
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc6 = m158358x197d1fc6();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.ui.C14475x178aab44 c14475x178aab44 = m158358x197d1fc6 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.ui.C14475x178aab44 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.ui.C14475x178aab44) m158358x197d1fc6 : null;
        if (c14475x178aab44 == null || (str = c14475x178aab44.f202917t) == null) {
            str = "";
        }
        this.f355489v = str;
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc62 = m158358x197d1fc6();
        if (m158358x197d1fc62 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.ui.C14475x178aab44) {
        }
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc63 = m158358x197d1fc6();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.ui.C14475x178aab44 c14475x178aab442 = m158358x197d1fc63 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.ui.C14475x178aab44 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.ui.C14475x178aab44) m158358x197d1fc63 : null;
        this.f355490w = c14475x178aab442 != null ? c14475x178aab442.f202920w : 0;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15359x536ace78) mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.q0q)).m62441xbae19a3c(false);
        java.util.ArrayList<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180> arrayList = new java.util.ArrayList();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.ui.C14474x6f957c06 c14474x6f957c06 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.ui.C14474x6f957c06();
        c14474x6f957c06.f202918u = 9;
        c14474x6f957c06.f210798p = 9;
        c14474x6f957c06.f210799q = m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lrf);
        c14474x6f957c06.y0(this.f355489v);
        c14474x6f957c06.f202920w = this.f355490w;
        arrayList.add(c14474x6f957c06);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.ui.C14474x6f957c06 c14474x6f957c062 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.ui.C14474x6f957c06();
        c14474x6f957c062.f202918u = 10;
        c14474x6f957c062.f210798p = 10;
        c14474x6f957c062.f210799q = m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.les);
        c14474x6f957c062.y0(this.f355489v);
        c14474x6f957c062.f202920w = this.f355490w;
        arrayList.add(c14474x6f957c062);
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
            java.lang.String str2 = abstractC15124x7bae6180.f210799q;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
            eo2.l lVar = new eo2.l(m80379x76847179, -1, str2, false, abstractC15124x7bae6180.f210798p, 0, com.p314xaae8f345.mm.R.C30864xbddafb2a.doc, true);
            lVar.f337119p = ym5.x.a(lVar.f337116m, 8.0f);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860.R6(this, lVar, abstractC15124x7bae6180, false, 4, null);
        }
    }
}
