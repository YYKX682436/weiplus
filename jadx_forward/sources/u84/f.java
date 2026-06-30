package u84;

/* loaded from: classes4.dex */
public final class f implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u84.k f507049d;

    public f(u84.k kVar) {
        this.f507049d = kVar;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.lang.String a17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("emit", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHighlightTagComponent$requestDynamicData$1$1");
        i64.p pVar = (i64.p) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("emit", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHighlightTagComponent$requestDynamicData$1$1");
        u84.k kVar = this.f507049d;
        java.lang.String j17 = kVar.j();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("observe numberTitle = ");
        sb6.append(pVar != null ? pVar.a() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j17, sb6.toString());
        android.widget.TextView y17 = u84.k.y(kVar);
        android.content.Context context = y17 != null ? y17.getContext() : null;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (context == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("emit", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHighlightTagComponent$requestDynamicData$1$1");
        } else {
            if (pVar == null || (a17 = pVar.a()) == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMAdHighlightTagInfo$p", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHighlightTagComponent");
                u84.l lVar = kVar.f507102v;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMAdHighlightTagInfo$p", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHighlightTagComponent");
                a17 = lVar != null ? lVar.a() : null;
            }
            if (!(a17 == null || a17.length() == 0)) {
                android.widget.TextView y18 = u84.k.y(kVar);
                java.lang.CharSequence text = y18 != null ? y18.getText() : null;
                if (text == null) {
                    text = "";
                }
                if (!a17.equals(text)) {
                    android.widget.TextView y19 = u84.k.y(kVar);
                    if (y19 != null) {
                        y19.setText(a17);
                    }
                    android.widget.TextView y27 = u84.k.y(kVar);
                    float b17 = i65.a.b(context, 14) * i65.a.q(context);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getAvailableWidth$p", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHighlightTagComponent");
                    float f17 = kVar.f507103w;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getAvailableWidth$p", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHighlightTagComponent");
                    ca4.m0.b(context, y27, b17, f17);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("emit", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHighlightTagComponent$requestDynamicData$1$1");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("emit", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHighlightTagComponent$requestDynamicData$1$1");
        return f0Var;
    }
}
