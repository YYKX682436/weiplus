package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes.dex */
public class kp implements com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.lp {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f251178a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f251179b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.View.OnClickListener f251180c;

    public kp(com.tencent.mm.plugin.sns.ui.SnsSettingUI snsSettingUI, java.lang.String str, java.lang.String str2, android.view.View.OnClickListener onClickListener) {
        this.f251178a = null;
        this.f251179b = null;
        this.f251180c = null;
        this.f251178a = str;
        this.f251179b = str2;
        this.f251180c = onClickListener;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.lp
    public java.lang.String a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, "com.tencent.mm.plugin.sns.ui.SnsSettingUI$ClickItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, "com.tencent.mm.plugin.sns.ui.SnsSettingUI$ClickItem");
        return this.f251178a;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.lp
    public void b(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showAlert", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$ClickItem");
        this.f251180c.onClick(view);
        db5.t7.m123883x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "ClickItem Done", 1).show();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showAlert", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$ClickItem");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.lp
    /* renamed from: value */
    public java.lang.String mo71141x6ac9171() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("value", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$ClickItem");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("value", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$ClickItem");
        return this.f251179b;
    }
}
