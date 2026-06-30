package ed4;

/* loaded from: classes4.dex */
public class b extends com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.d1 {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5 f332817g;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5 abstractC18285x291d0ca5) {
        this.f332817g = abstractC18285x291d0ca5;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.d1, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0, android.text.style.ClickableSpan
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$AppClickSpan");
        this.f332817g.f250784h.f249576i.f251196k.onClick(view);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$AppClickSpan");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.d1, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0, android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint textPaint) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateDrawState", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$AppClickSpan");
        int color = this.f332817g.f250782f.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561047a61);
        if (m75729x74fd4a8d()) {
            textPaint.bgColor = color;
        } else {
            textPaint.bgColor = 0;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateDrawState", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$AppClickSpan");
    }
}
