package com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui;

/* renamed from: com.tencent.mm.plugin.product.ui.HtmlTextView2 */
/* loaded from: classes8.dex */
public class C16809x3ecad175 extends com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 {
    public final com.p314xaae8f345.p3210x3857dc.h1 G;

    public C16809x3ecad175(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, attributeSet);
        this.G = new com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.d(this);
        I0();
    }

    public final void I0() {
        setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.c(this));
        mo120520x57c53c73(false);
        mo120153xd15cf999().F(android.webkit.WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
        mo120153xd15cf999().w(com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
    }

    /* renamed from: setText */
    public void m67597x765074af(java.lang.String str) {
        mo74800x23d27c02(null);
        mo74798x6dfa45b0(str, "text/html", com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
        mo74800x23d27c02(this.G);
    }

    public C16809x3ecad175(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, attributeSet, i17);
        this.G = new com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.d(this);
        I0();
    }
}
