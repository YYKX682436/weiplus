package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* renamed from: com.tencent.mm.plugin.sns.ui.SightRangeWidget */
/* loaded from: classes4.dex */
public class C17998x7a96bc24 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17992x3b5785c1 {
    public C17998x7a96bc24(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17992x3b5785c1, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractC17949x28e47a30
    public boolean b(int i17, int i18, android.content.Intent intent, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17947x83d458f1 c17947x83d458f1) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onActivityResult", "com.tencent.mm.plugin.sns.ui.SightRangeWidget");
        super.b(i17, i18, intent, c17947x83d458f1);
        if (c17947x83d458f1 != null) {
            if (mo70559x8b2fba9f() == 1) {
                c17947x83d458f1.setVisibility(4);
                c17947x83d458f1.a();
            } else {
                c17947x83d458f1.setVisibility(0);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onActivityResult", "com.tencent.mm.plugin.sns.ui.SightRangeWidget");
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17992x3b5785c1
    /* renamed from: getLayoutResource */
    public int mo70682x8e08264e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLayoutResource", "com.tencent.mm.plugin.sns.ui.SightRangeWidget");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLayoutResource", "com.tencent.mm.plugin.sns.ui.SightRangeWidget");
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cnq;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17992x3b5785c1
    /* renamed from: getMaxTagNameLen */
    public int mo70683xec28675e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMaxTagNameLen", "com.tencent.mm.plugin.sns.ui.SightRangeWidget");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMaxTagNameLen", "com.tencent.mm.plugin.sns.ui.SightRangeWidget");
        return 10;
    }

    public C17998x7a96bc24(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
