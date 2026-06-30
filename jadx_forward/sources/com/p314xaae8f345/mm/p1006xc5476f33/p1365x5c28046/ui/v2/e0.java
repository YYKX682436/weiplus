package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2;

/* loaded from: classes12.dex */
public class e0 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.ViewOnClickListenerC13352x11f2b862 f179891a;

    public e0(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.ViewOnClickListenerC13352x11f2b862 viewOnClickListenerC13352x11f2b862) {
        this.f179891a = viewOnClickListenerC13352x11f2b862;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        int i17 = message.what;
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.ViewOnClickListenerC13352x11f2b862 viewOnClickListenerC13352x11f2b862 = this.f179891a;
        switch (i17) {
            case 131075:
                int i18 = message.getData().getInt("progress");
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(message.getData().getString("product_id"))) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.emoji.EmojiStoreV2SingleRecommendView", "product id is null");
                    return;
                }
                android.widget.Button button = viewOnClickListenerC13352x11f2b862.f179842i;
                if (button != null) {
                    button.setVisibility(8);
                }
                android.widget.ProgressBar progressBar = viewOnClickListenerC13352x11f2b862.f179843m;
                if (progressBar != null) {
                    progressBar.setVisibility(0);
                    viewOnClickListenerC13352x11f2b862.f179843m.setProgress(i18);
                    return;
                }
                return;
            case 131076:
                message.getData().getInt("status");
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(message.getData().getString("product_id"))) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.emoji.EmojiStoreV2SingleRecommendView", "product id is null");
                    return;
                }
                android.widget.Button button2 = viewOnClickListenerC13352x11f2b862.f179842i;
                if (button2 != null) {
                    button2.setVisibility(0);
                    viewOnClickListenerC13352x11f2b862.getClass();
                }
                android.widget.ProgressBar progressBar2 = viewOnClickListenerC13352x11f2b862.f179843m;
                if (progressBar2 != null) {
                    progressBar2.setVisibility(8);
                    viewOnClickListenerC13352x11f2b862.f179843m.setProgress(0);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
