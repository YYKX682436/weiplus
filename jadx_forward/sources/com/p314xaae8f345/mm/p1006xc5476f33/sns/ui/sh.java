package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class sh implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18053x54313abb f251992d;

    public sh(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18053x54313abb activityC18053x54313abb) {
        this.f251992d = activityC18053x54313abb;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("afterTextChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentUI$4");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("afterTextChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentUI$4");
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("beforeTextChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentUI$4");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("beforeTextChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentUI$4");
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onTextChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentUI$4");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18053x54313abb activityC18053x54313abb = this.f251992d;
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18053x54313abb.T6(activityC18053x54313abb).getText().toString().trim().length() > 0) {
            activityC18053x54313abb.m78501x43e00957(true);
        } else {
            activityC18053x54313abb.m78501x43e00957(false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTextChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentUI$4");
    }
}
