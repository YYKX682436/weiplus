package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes10.dex */
public final class hi extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderSettingsUI f210863d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hi(com.tencent.mm.plugin.finder.ui.FinderSettingsUI finderSettingsUI) {
        super(0);
        this.f210863d = finderSettingsUI;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View findViewById = this.f210863d.findViewById(com.p314xaae8f345.mm.R.id.f567024hv4);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById;
        int i17 = com.p314xaae8f345.mm.R.id.nup;
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.nup);
        if (c2718xca2902ff != null) {
            i17 = com.p314xaae8f345.mm.R.id.nuq;
            com.p314xaae8f345.mm.p2776x373aa5.C22785xca931918 c22785xca931918 = (com.p314xaae8f345.mm.p2776x373aa5.C22785xca931918) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.nuq);
            if (c22785xca931918 != null) {
                i17 = com.p314xaae8f345.mm.R.id.f569103p16;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15359x536ace78 c15359x536ace78 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15359x536ace78) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.f569103p16);
                if (c15359x536ace78 != null) {
                    return new vb2.j(linearLayout, linearLayout, c2718xca2902ff, c22785xca931918, c15359x536ace78);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(findViewById.getResources().getResourceName(i17)));
    }
}
