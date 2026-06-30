package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsUploadSayFooter */
/* loaded from: classes4.dex */
public class C18132x196fdbed extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.AbstractC18397x5bc42bbf {
    public C18132x196fdbed(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.AbstractC18397x5bc42bbf
    public void c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("refreshBottomPanelHeight", "com.tencent.mm.plugin.sns.ui.SnsUploadSayFooter");
        int g17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.d2.g(getContext());
        this.f252290g.mo75342x4b0766b2(g17);
        this.f252290g.b();
        android.view.ViewGroup.LayoutParams layoutParams = this.f252290g.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = g17;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsUploadSayFooter", "refreshBottomPanelHeight: smileyPanel height=%d", java.lang.Integer.valueOf(g17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("refreshBottomPanelHeight", "com.tencent.mm.plugin.sns.ui.SnsUploadSayFooter");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.AbstractC18397x5bc42bbf
    public void d(boolean z17, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("refreshUIOnInputPanelChange", "com.tencent.mm.plugin.sns.ui.SnsUploadSayFooter");
        if (this.f252295o != i17 && i17 != 0) {
            this.f252295o = i17;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("saveKeyboardHeight", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
            fp.w.m(getContext(), i17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("saveKeyboardHeight", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
            c();
        }
        if (z17) {
            f();
            setTranslationY(-i17);
        } else {
            e();
            setTranslationY(0.0f);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("refreshUIOnInputPanelChange", "com.tencent.mm.plugin.sns.ui.SnsUploadSayFooter");
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.AbstractC22647xb041ad02
    /* renamed from: getSoftInputMode */
    public int mo70813x19d607cd() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSoftInputMode", "com.tencent.mm.plugin.sns.ui.SnsUploadSayFooter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSoftInputMode", "com.tencent.mm.plugin.sns.ui.SnsUploadSayFooter");
        return 32;
    }
}
