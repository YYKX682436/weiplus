package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes7.dex */
public final class ya0 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f218077d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Runnable f218078e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f218079f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f218080g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f218081h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f218082i;

    /* renamed from: m, reason: collision with root package name */
    public final kh3.e f218083m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ya0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f218078e = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.sa0(this);
        this.f218083m = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ua0(this);
    }

    public final void O6() {
        if (!com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40085xe877826c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderWifiHintUIC", "[checkShowNotWifiHint]: is not mobile data");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.Ye).mo141623x754a37bb()).r()).booleanValue()) {
            p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.i2.f392010d, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ra0(this, null), 2, null);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderWifiHintUIC", "[checkShowNotWifiHint]: not show free flow");
            S6(com.p314xaae8f345.mm.R.C30867xcad56011.ers, 3000L);
        }
    }

    public final void P6() {
        android.widget.TextView textView = this.f218077d;
        if (textView != null) {
            textView.setVisibility(8);
        }
        R6(false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderWifiHintUIC", "[hideHint]");
    }

    public final java.lang.String Q6(java.util.TreeMap treeMap) {
        if (treeMap.isEmpty()) {
            return "";
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry : treeMap.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getValue();
            if (!(str == null || str.length() == 0)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(linkedHashMap.size());
        for (java.util.Map.Entry entry2 : linkedHashMap.entrySet()) {
            arrayList.add(((java.lang.String) entry2.getKey()) + '=' + ((java.lang.String) entry2.getValue()));
        }
        return kz5.n0.g0(arrayList, "&", null, null, 0, null, null, 62, null);
    }

    public final void R6(boolean z17) {
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00;
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00.StickTopLoadingLayout stickTopLoadingLayout;
        float f17 = 0.0f;
        float dimension = z17 ? m158354x19263085().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn) : 0.0f;
        float dimension2 = m158354x19263085().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561226cs);
        float measuredHeight = this.f218077d != null ? r3.getMeasuredHeight() : 0.0f;
        if (z17) {
            if (measuredHeight <= 0.0f || measuredHeight <= dimension2) {
                f17 = dimension2;
            } else {
                dimension += measuredHeight - dimension2;
                f17 = measuredHeight;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderWifiHintUIC", "[setLoadingOffsetExtra] isShow:" + z17 + " hintHeight:" + f17 + " minHintHeight:" + dimension2 + " measuredHeight:" + measuredHeight);
        java.util.List<p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670> list = this.f218079f;
        if (list != null) {
            for (p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 : list) {
                com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639 abstractC22277x94c24639 = componentCallbacksC1101xa17d4670 instanceof com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639 ? (com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639) componentCallbacksC1101xa17d4670 : null;
                if ((abstractC22277x94c24639 != null ? abstractC22277x94c24639.f287834h : null) == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderWifiHintUIC", "[setLoadingOffsetExtra] fragment:" + componentCallbacksC1101xa17d4670.getClass().getSimpleName() + " rootView is null");
                } else {
                    android.view.View m7474xfb86a31b = ((com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639) componentCallbacksC1101xa17d4670).m7474xfb86a31b();
                    if (m7474xfb86a31b != null && (c22801x87cbdc00 = (com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00) m7474xfb86a31b.findViewById(com.p314xaae8f345.mm.R.id.m6e)) != null && (stickTopLoadingLayout = c22801x87cbdc00.getStickTopLoadingLayout()) != null) {
                        stickTopLoadingLayout.offsetExtra = dimension;
                        stickTopLoadingLayout.hintHeight = f17;
                        if (stickTopLoadingLayout.progressBar.getVisibility() == 0) {
                            stickTopLoadingLayout.setTranslationY(stickTopLoadingLayout.getTranslationY() + dimension);
                        } else {
                            stickTopLoadingLayout.onScrollCallback.mo146xb9724478(java.lang.Float.valueOf(dimension + f17));
                        }
                    }
                }
            }
        }
    }

    public final void S6(int i17, long j17) {
        p3325xe03a0797.p3326xc267989b.l.d(m158345xefc66565(), null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.xa0(this, i17, j17, null), 3, null);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        ((lh3.n) ((kh3.f) i95.n0.c(kh3.f.class))).Ni(8, this.f218083m);
        this.f218077d = (android.widget.TextView) m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.pmj);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        ((lh3.n) ((kh3.f) i95.n0.c(kh3.f.class))).Vi(8, this.f218083m);
    }
}
