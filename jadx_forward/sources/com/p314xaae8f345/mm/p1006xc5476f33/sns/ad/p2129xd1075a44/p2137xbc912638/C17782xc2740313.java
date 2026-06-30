package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2137xbc912638;

/* renamed from: com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerSeekBar */
/* loaded from: classes2.dex */
public class C17782xc2740313 extends com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19744xe1ab67bf {
    public C17782xc2740313(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19744xe1ab67bf, com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17688x1a8cfd10
    /* renamed from: getLayoutId */
    public int mo61294x2ee31f5b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLayoutId", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerSeekBar");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLayoutId", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerSeekBar");
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569505cx;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19744xe1ab67bf, com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17688x1a8cfd10, m34.d
    /* renamed from: setIsPlay */
    public void mo61296x11f3be80(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setIsPlay", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerSeekBar");
        this.f272979z = z17;
        android.widget.ImageView imageView = this.f244009i;
        if (imageView == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingVideoPlayerSeekBar", "in adLandingVideoPlayerSeekBar setIsPlay, mPlayBtn is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setIsPlay", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerSeekBar");
        } else {
            if (z17) {
                imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f80595xfe9eb87);
            } else {
                imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f80594xed5384c7);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setIsPlay", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerSeekBar");
        }
    }

    public C17782xc2740313(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
