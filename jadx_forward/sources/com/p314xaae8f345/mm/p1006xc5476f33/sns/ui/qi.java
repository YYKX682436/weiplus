package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class qi implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f251876d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18062xf8f7b205 f251877e;

    public qi(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18062xf8f7b205 c18062xf8f7b205, android.content.Context context) {
        this.f251877e = c18062xf8f7b205;
        this.f251876d = context;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onGlobalLayout", "com.tencent.mm.plugin.sns.ui.SnsHeader$10");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18062xf8f7b205 c18062xf8f7b205 = this.f251877e;
        c18062xf8f7b205.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        if (pc4.d.f434943a.y()) {
            int width = c18062xf8f7b205.f248698d.f249722f.getWidth();
            android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) c18062xf8f7b205.f248698d.f249717a.getLayoutParams();
            android.content.Context context = this.f251876d;
            int i17 = (int) (width * (ca4.z0.l0(context) ? 0.17f : 0.12f));
            float f17 = i17;
            float b17 = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 40);
            float f18 = 1.5f * b17;
            if (f17 < f18) {
                i17 = (int) java.lang.Math.ceil(f18);
            }
            float f19 = b17 * 1.8f;
            if (i17 > f19) {
                i17 = (int) java.lang.Math.floor(f19);
            }
            layoutParams.width = i17;
            layoutParams.height = i17;
            layoutParams.topMargin = (int) (-((i17 * 2.0f) / 3.0f));
            c18062xf8f7b205.f248698d.f249717a.setLayoutParams(layoutParams);
            android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) c18062xf8f7b205.f248698d.f249720d.getLayoutParams();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2158x5a753b7.p2160xed08e3c8.C17856x1e30bcc c17856x1e30bcc = c18062xf8f7b205.f248698d.f249725i;
            c17856x1e30bcc.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("foldHeight", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
            int i18 = c17856x1e30bcc.f245542r;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("foldHeight", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
            layoutParams2.topMargin = i18 + i65.a.b(context, 4);
            c18062xf8f7b205.f248698d.f249720d.setLayoutParams(layoutParams2);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGlobalLayout", "com.tencent.mm.plugin.sns.ui.SnsHeader$10");
    }
}
